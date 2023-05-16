/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2023 by Imtiyaz Allam
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package org.asteroid.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.asteroid.Files;

/**
 *
 * @author Imtiyaz Allam
 */
public class CSV {

    /**
     * Data of the CSV File
     */
    private List<List<String>> data;
    /**
     * File Object of the CSV file
     */
    private File csvFile;
    /**
     * Data in file in string format
     */
    private String inString = "";

    /**
     * creates an instance of <code>org.asteroid.util.CSV</code> with no
     * arguments
     */
    public CSV() {
        data = new ArrayList<>();
    }

    /**
     * creates an instance of <code>org.asteroid.util.CSV</code> using instance
     * of <code>java.io.File</code>
     *
     * @param csvFile instance of <code>java.io.File</code> to initialize the
     * member variables
     */
    public CSV(File csvFile) {
        this.csvFile = csvFile;
        data = new ArrayList<>();
    }

    /**
     * creates an instance of <code>org.asteroid.util.CSV</code> using file name
     *
     * @param fileName file name to initialize the member variables
     */
    public CSV(String fileName) {
        this.csvFile = new File(fileName);
        data = new ArrayList<>();
    }

    /**
     * creates an instance of <code>org.asteroid.util.CSV</code> using instance
     * of <code>org.asteroid.Files</code>
     *
     * @param csvFiles instance of <code>org.asteroid.Files</code> to initialize
     * the member variables
     */
    public CSV(Files csvFiles) {
        this.csvFile = new File(csvFiles.getAbsolutePath());
        data = new ArrayList<>();
    }

    /**
     * set or change the file to read
     *
     * @param csvFile instance of <code>java.io.File</code> to initialize the
     * member variables
     */
    public void setFile(File csvFile) {
        reset();
        this.csvFile = csvFile;
    }

    /**
     * set or change the file to read
     *
     * @param fileName file name to initialize the member variables
     */
    public void setFile(String fileName) {
        reset();
        this.csvFile = new File(fileName);
    }

    /**
     * set or change the file to read
     *
     * @param csvFiles instance of <code>org.asteroid.Files</code> to initialize
     * the member variables
     */
    public void setFile(Files csvFiles) {
        reset();
        this.csvFile = new File(csvFiles.getAbsolutePath());
    }

    //read files and also adds data in file to inString
    public void readFile() {
        if (csvFile.getAbsolutePath().trim().equals("")) {
            throw new NoFileSelectedException();
        }
        try {
            FileReader fl = new FileReader(csvFile);
            BufferedReader bf = new BufferedReader(fl);
            String s = bf.readLine();
            while (s != null) {
                inString += s + '\n';
                s = bf.readLine();
                if (s == null) {
                    break;
                }
                if (s.isEmpty()) {
                    continue;
                }
                s = s.trim();
                data.add(trimAll(Arrays.asList(s.split(","))));
            }
            inString = inString.substring(0, inString.length() - 1);
        } catch (FileNotFoundException ex) {
            throw new FileMissingException();
        } catch (IOException e) {
            throw new UnsupportedOperationException();
        }
    }

    /**
     * Returns data in CSV in a 2D List
     *
     * @return data in CSV
     */
    public List getData() {
        return this.data;
    }

    /**
     * Returns data in CSV at a particular location
     *
     * @param x Column index
     * @param y Row index
     * @return data in CSV at a particular location
     */
    public String get(int x, int y) {
        return this.data.get(x).get(y);
    }

    /**
     * Sets data in CSV at a particular location
     *
     * @param x Column index
     * @param y Row index
     * @param value value to set at that specific location
     */
    public void set(int x, int y, String value) {
        this.data.get(x).set(y, value);
    }

    /**
     * Saves the data to the file
     */
    public void save() {
        try {
            try (FileWriter f = new FileWriter(csvFile)) {
                String res = "";
                for (List<String> data1 : this.data) {
                    String line = data1.toString();
                    res += line.substring(1, line.length() - 1) + "\n";
                }
                res = res.replace("\t", " ");
                System.out.println(res);
                f.write(res);
            }
        } catch (IOException e) {
            throw new UnsupportedOperationException();
        }
    }

    /**
     * Saves the data to the file
     *
     * @param fileName file name with address of the file in which data is to be
     * saved
     */
    public void save(String fileName) {
        try {
            try (FileWriter f = new FileWriter(new File(fileName))) {
                String res = "";
                for (List<String> data1 : this.data) {
                    String line = data1.toString();
                    res += line.substring(1, line.length() - 1) + "\n";
                }
                res = res.replace("\t", " ");
                System.out.println(res);
                f.write(res);
            }
        } catch (IOException e) {
            throw new UnsupportedOperationException();
        }
    }

    /**
     * Saves the data to the file
     *
     * @param file Instance of <code>java.io.File</code> class of a file in
     * which data is to be saved
     */
    public void save(File file) {
        try {
            try (FileWriter f = new FileWriter(file)) {
                String res = "";
                for (List<String> data1 : this.data) {
                    String line = data1.toString();
                    res += line.substring(1, line.length() - 1) + "\n";
                }
                res = res.replace("\t", " ");
                System.out.println(res);
                f.write(res);
            }
        } catch (IOException e) {
            throw new UnsupportedOperationException();
        }
    }

    /**
     * Saves the data to the file
     *
     * @param file Instance of <code>org.asteroid.Files</code> class of a file
     * in which data is to be saved
     */
    public void save(Files file) {
        try {
            try (FileWriter f = new FileWriter(new File(file.getAbsolutePath()))) {
                String res = "";
                for (List<String> data1 : this.data) {
                    String line = data1.toString();
                    res += line.substring(1, line.length() - 1) + "\n";
                }
                res = res.replace("\t", " ");
                System.out.println(res);
                f.write(res);
            }
        } catch (IOException e) {
            throw new UnsupportedOperationException();
        }
    }

    /**
     * Add a new line at the bottom of the CSV file
     *
     * @param data data to be added in the new line
     */
    public void addLine(String... data) {
        this.data.add(Arrays.asList(data));
    }

    /**
     * Removes an entire row in CSV
     *
     * @param rowIndex index of that specific row that is to be removed
     */
    public void removeRow(int rowIndex) {
        this.data.remove(rowIndex);
    }

    /**
     * Removes an entire row in CSV
     *
     * @param columnIndex index of that specific row that is to be removed
     */
    public void removeColumn(int columnIndex) {
        ArrayList<String> x;
        for (int i = 0; i < this.data.size(); i++) {
            if (columnIndex >= this.data.get(i).size()) {
                continue;
            }
            x = new ArrayList(this.data.get(i));
            x.remove(columnIndex);
            this.data.set(i, x);
        }
    }

    /**
     * Clears data at a particular location
     *
     * @param x Column index
     * @param y Row index
     */
    public void clearAt(int x, int y) {
        this.data.get(x).set(y, "");
    }

    // trims all the String in the ArrayList <code>data</code>
    private List<String> trimAll(List<String> ls) {
        for (int i = 0; i < ls.size(); i++) {
            ls.set(i, ls.get(i).trim());
        }
        return ls;
    }

    /**
     * Resets all member variables to defaults
     */
    public void reset() {
        data = new ArrayList<>();
        csvFile = new File("");
        inString = "";
    }
}
