/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2022 by Asteroid Softwares
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
package org.asteroid;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.asteroid.util.FileMissingException;

/**
 *
 * @author Asteroid Softwares
 */
public final class Files {

    private String ext;
    private final String loc;
    private final File file;

    /**
     * Creates an instance of <code>Files</code> class
     *
     * @param loc file address
     */
    public Files(String loc) {
        this.loc = loc;
        file = new File(loc);
        if (!isDirectory())
            ext = getExtension();
    }

    /**
     * Checks if the exist or not. Returns true if file exists
     *
     * @return
     */
    public boolean doesExists() {
        return file.exists();
    }

    /**
     * Opens the file
     */
    public void open() {
        org.asteroid.util.Utility.open(loc);
    }

    /**
     * Returns the extension of the file
     *
     * @return file extension
     */
    public String getExtension() {
        if (loc.contains(".") && loc.lastIndexOf(".") != 0)
            ext = (loc.substring(loc.lastIndexOf(".") + 1)).toLowerCase();
        else
            ext = "";
        return ext;
    }

    /**
     * Returns the file name including file extension
     *
     * @return File name
     */
    public String getName() {
        return file.getName();
    }

    /**
     * returns the absolute path with file name
     *
     * @return absolute path with file name
     */
    public String getAbsolutePath() {
        return file.getAbsolutePath();
    }

    /**
     * Checks that if the given address is a directory or not
     *
     * @return <code>true</code> if it is a directory
     */
    public boolean isDirectory() {
        if (file.exists())
            return file.isDirectory();
        else
            throw new org.asteroid.util.FileMissingException();
    }

    /**
     * Checks that if the given address is a file or not
     *
     * @return <code>true</code> if it is a file
     */
    public boolean isFile() {
        if (file.exists())
            return file.isFile();
        else
            throw new org.asteroid.util.FileMissingException();
    }

    public String readAt(int line) {
        int l = 0;
        try {
            FileReader fl = new FileReader(file);
            BufferedReader bf = new BufferedReader(fl);
            if (file.exists()) {
                String s = bf.readLine();
                while (s != null) {
                    if (l == line)
                        return s;
                    s = bf.readLine();
                    if (s == null)
                        break;
                    l++;
                }
                if (s == null)
                    throw new FileLineOutOfBoundIndex();
            } else
                throw new org.asteroid.util.FileMissingException();
        } catch (FileNotFoundException e) {
            throw new FileMissingException();
        } catch (IOException e) {
            throw new InputOutputError();
        }
        return "";
    }

    public int countLine() {
        int l = 0;
        try {
            FileReader fl = new FileReader(file);
            BufferedReader bf = new BufferedReader(fl);
            if (file.exists()) {
                String s = bf.readLine();
                while (s != null) {
                    l++;
                    s = bf.readLine();
                    if (s == null)
                        break;
                }
                if (s == null)
                    throw new FileLineOutOfBoundIndex();
            } else
                throw new org.asteroid.util.FileMissingException();
        } catch (FileNotFoundException e) {
            throw new FileMissingException();
        } catch (IOException e) {
            throw new InputOutputError();
        }
        return l;
    }

    public String readEverything() {
        String inString = "";
        try {
            if (file.exists()) {
                FileReader fl = new FileReader(file);
                BufferedReader bf = new BufferedReader(fl);
                String s = bf.readLine();
                while (s != null) {
                    inString += s + '\n';
                    s = bf.readLine();
                    if (s == null)
                        break;
                }
                return inString;
            } else
                throw new org.asteroid.util.FileMissingException();
        } catch (FileNotFoundException e) {
            throw new FileMissingException();
        } catch (IOException e) {
            throw new InputOutputError();
        }
    }
    
    public void printFile() {
        try {
            if (file.exists()) {
                FileReader fl = new FileReader(file);
                BufferedReader bf = new BufferedReader(fl);
                String s = bf.readLine();
                while (s != null) {
                    System.out.println(s);
                    s = bf.readLine();
                    
                    if (s == null)
                        break;
                }
            } else
                throw new org.asteroid.util.FileMissingException();
        } catch (FileNotFoundException e) {
            throw new FileMissingException();
        } catch (IOException e) {
            throw new InputOutputError();
        }
    }

    /**
     * Checks if the file is hidden or not
     *
     * @return <code>true</code> if the directory or file is hidden
     */
    public boolean isHidden() {
        if (file.exists())
            return file.isHidden();
        else
            throw new org.asteroid.util.FileMissingException();
    }

    /**
     * Returns the type. Returns <code>"directory"</code> if it is a directory
     * else the type of file. Example: File name: Example.jpg, Method returned
     * <code>"image file"</code>
     *
     *
     * @return media type
     */
    public String getType() {
        if (isDirectory())
            return "Directrory";
        String type = ext;
        switch (ext.toLowerCase()) {
            case "png":
            case "jpg":
            case "jpeg":
            case "bmp":
                type = "image";
                break;
            case "gif":
            case "webm":
                type = "sticker/animated";
                break;
            case "mp3":
            case "mpa":
            case "mp2":
            case "wma":
            case "ogg":
            case "ape":
            case "wav":
            case "flac":
                type = "audio";
                break;
            case "mp4":
            case "mov":
            case "wmv":
            case "avi":
            case "avchd":
            case "flv":
            case "f4v":
            case "swf":
            case "mkv":
                type = "video";
                break;
            case "email":
            case "eml":
            case "ost":
            case "oft":
            case "msg":
                type = "outlook e-mail";
                break;
            case "vcf":
                type = "contact";
                break;
            case "zip":
            case "rar":
            case "7z":
            case "gz":
            case "z":
            case "arg":
                type = "compressed";
                break;
            case "jar":
                type = "java archived";
                break;
            case "tar":
                type = "linux / unix tarball file archive";
                break;
            case "gadget":
                type = "windows gadget";
                break;
            case "wsf":
                type = "windows Script";
                break;
            case "com":
                type = "ms-dos command";
                break;
            case "fon":
                type = "generic font";
                break;
            case "fnt":
                type = "windows font";
                break;
            case "otf":
                type = "open type font";
                break;
            case "ttf":
                type = "true type font";
                break;
            case "jsp":
                type = "java server page";
                break;
            case "part":
                type = "partially downloaded";
                break;
            case "text":
                type = "plain text";
                break;
            case "java":
                type = "java source";
                break;
            case "class":
                type = "java bytecode";
                break;
            case "exe":
                type = "windows executable";
                break;
            case "msi":
                type = "windows installation";
                break;
            case "bat":
                type = "windows batch script";
                break;
            case "lnk":
                type = "windows shortcut";
                break;
            case ".bin":
                type = "linux executable";
                break;
            case "deb":
                type = "debian linux installation";
                break;
            case "rpm":
                type = "red hat linux installation";
                break;
            case "dmg":
                type = "macos installer";
                break;
            case "sh":
            case "csh":
                type = "unix / linux / mac shell script";
                break;
            case "apk":
                type = "android application package";
                break;
            case "doc":
            case "docx":
                type = "word documnet";
                break;
            case "ppt":
            case "pptx":
                type = "powerpoint presentation";
                break;
            case "xls":
            case "xlsx":
                type = "excel spreadsheet";
                break;
            case "c":
                type = "c source";
                break;
            case "cpp":
                type = "c++ source";
                break;
            case "h":
                type = "header";
                break;
            case "go":
                type = "golang source";
                break;
            case "cs":
                type = "c# source";
                break;
            case "vb":
            case "vbs":
                type = "visual vasic";
                break;
            case "r":
            case "rt":
                type = "rscript source";
                break;
            case "ru":
            case "rb":
                type = "ruby source";
                break;
            case "py":
            case "py3":
            case "pyw":
                type = "python source";
                break;
            case "pyc":
            case "pyo":
                type = "python bytecode";
                break;
            case "php":
                type = "php source";
                break;
            case "html":
                type = "hypertext markup lanaguage";
                break;
            case "js":
                type = "javascpript source";
                break;
            case "json":
                type = "javaScript object notation";
                break;
            case "ipync":
                type = "jupyter notebook";
                break;
            case "CSS":
                type = "cascading style sheet";
                break;
            case "rs":
            case "rlib":
                type = "rust source";
                break;
            case "ts":
                type = "typescript";
                break;
            case "kt":
            case "kts":
                type = "kotlin script";
                break;
            case "swift":
                type = "swift source";
                break;
            case "pl":
            case "cgi":
            case "t":
                type = "perl script";
                break;
            case "dll":
                type = "dynamic link library";
                break;
            case "icns":
                type = "macos x icon resource";
                break;
            case "ini":
                type = "initialization";
                break;
            case "cfg":
                type = "windows configuration";
                break;
            case "sys":
                type = "windows system";
                break;
            case "rtf":
                type = "rich text";
                break;
            case "ico":
                type = "windows icon";
                break;
            case "scala":
            case "sc":
                type = "scala source";
                break;
            case "sql":
                type = "sequencial query language database";
                break;
            case "ex":
                type = "elixir source";
                break;
            case "bas":
                type = "Beginner all pourpose symbolic instruction code source";
                break;
            case "erl":
            case "hrl":
                type = "erlang source";
                break;
            case "lhs":
            case "hs":
                type = "haskell source";
                break;
            case "xml":
                type = "extensible markup language";
                break;
            case "bluej":
                type = "bluej project";
                break;
            case "o":
                type = "code::blocks project";
                break;
            case "mhtml":
                type = "mhtml document";
                break;
            case "pdf":
                type = "pdf document";
                break;
            default:
        }
        return type + " file";
    }
}
