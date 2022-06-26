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

package org.asteroid.util;

import org.asteroid.InputOutputError;
import org.asteroid.InvalidURLException;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import org.asteroid.NoInternetAccessException;

/**
 * It has helpful utility methods
 *
 * @author Asteroid Softwares
 */
public final class Utility {

    /**
     * It prints the given data
     *
     * @param com Data to be displayed
     */
    public static void print(Object com) {
        System.out.println(com);
    }

    /**
     * It prints the current time in format:- HH:MM:SS
     */
    public static void printTime() {
        System.out.println(java.time.format.DateTimeFormatter.ofPattern("hh:mm:ss").format(java.time.LocalDateTime.now()));
    }

    /**
     * It prints the current date in format:- DD:MM:SS
     */
    public static void printDate() {
        System.out.println(java.time.format.DateTimeFormatter.ofPattern("dd:MM:yyyy").format(java.time.LocalDateTime.now()));
    }

    /**
     * It returns the Time in format:- HH:MM:SS
     *
     * @return time in HH:MM:SS format
     */
    public static String getTime() {
        return java.time.format.DateTimeFormatter.ofPattern("hh:mm:ss").format(java.time.LocalDateTime.now());
    }

    /**
     * It returns the Date in format:- DD:MM:YYYY
     *
     * @return date in DD:MM:YYYY
     */
    public static String getDate() {
        return java.time.format.DateTimeFormatter.ofPattern("dd:MM:yyyy").format(java.time.LocalDateTime.now());
    }

    /**
     * It returns the default browser name. It works on windows only.
     *
     * @return Default browser name
     */
    public static String getDefaultBrowser() {
        if (!SystemUtility.getOSName().startsWith("Windows")) {
            throw new UnsupportedOSException("Open Task Manager");
        }
        try {
            Process process = Runtime.getRuntime().exec("REG QUERY HKEY_CLASSES_ROOT\\http\\shell\\open\\command");
            try ( Scanner kb = new Scanner(process.getInputStream())) {
                while (kb.hasNextLine()) {
                    String registry = (kb.nextLine()).replaceAll("\\\\", "/").trim();
                    Matcher matcher = Pattern.compile("/(?=[^/]*$)(.+?)[.]").matcher(registry);
                    if (matcher.find()) {
                        kb.close();
                        String defaultBrowser = matcher.group(1);
                        defaultBrowser = defaultBrowser.substring(0, 1).toUpperCase() + defaultBrowser.substring(1, defaultBrowser.length());
                        return defaultBrowser;
                    }
                }
            }
        } catch (IOException e) {
            throw new BrowserNotFoundException();
        }
        return null;
    }

    /**
     * It adds the given text to clipboard
     *
     * @param com Text that is to be added to clipboard
     */
    public static void addToClipbaord(String com) {
        try {
            java.awt.datatransfer.StringSelection stringSelection = new java.awt.datatransfer.StringSelection(com);
            java.awt.datatransfer.Clipboard clipboard = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        } catch (HeadlessException e) {
            System.out.println(e);
        }
        if (!SystemUtility.getOSName().startsWith("Windows")) {
            StringSelection str = new StringSelection(com);
            Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
            clip.setContents(str, null);
            //throw new UnsupportedOSException("Open Task Manager");
        }
    }

    /**
     * It opens Windows task manager. It works on windows only.
     */
    public static void taskManager() throws FileMissingException {
        if (!SystemUtility.getOSName().startsWith("Windows")) {
            throw new UnsupportedOSException("Open Task Manager");
        }
        java.io.File file2 = new java.io.File("C:/Windows/System32/taskmgr.exe");
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        if (file2.exists()) {
            try {
                desktop.open(file2);
            } catch (java.io.IOException e) {
                throw new FileMissingException();
            }
        } else {
            throw new FileMissingException();
        }
    }

    /**
     * It produces an beep sound
     *
     */
    public static void beep() {
        java.awt.Toolkit.getDefaultToolkit().beep();
    }

    /**
     * It prints text as an error. It works equivalent to
     * <code>System.err.println</code>
     *
     * @param com Text to be printed
     */
    public static void printError(String com) {
        System.err.println(com);
    }

    /**
     * It exits the program
     */
    public static void exit() {
        Runtime.getRuntime().exit(0);
    }

    /**
     * It freezes the program for the given time in milliseconds
     *
     * @param data time to freeze the thread for a given time in milliseconds
     */
    public static void freeze(int data) {
        try {
            Thread.sleep(data);
        } catch (InterruptedException e) {
            throw new FailedToFreezeException();
        }
    }

    /**
     * It opens a file
     *
     * @param data File address
     */
    public static void open(String data) {
        java.io.File file = new java.io.File(data);
        if (!java.awt.Desktop.isDesktopSupported()) {
            throw new UnsupportedDesktopException();
        }
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        if (file.exists()) {
            try {
                desktop.open(file);
            } catch (java.io.IOException e) {
                throw new UnassociatedFileException();
            }
        } else {
            throw new FileMissingException();
        }
    }

    /**
     * It freezes the program for the given time in milliseconds
     *
     * @param data time to freeze the thread for a given time in seconds
     */
    public static void sleep(int data) throws FailedToFreezeException {
        try {
            Thread.sleep(data * 1000);
        } catch (InterruptedException e) {
            throw new FailedToFreezeException();
        }
    }

    /**
     * It opens terminal, <code>cmd.exe</code> in windows. It works on windows
     * only.
     *
     */
    public static void terminal() {
        if (!SystemUtility.getOSName().startsWith("Windows")) {
            throw new UnsupportedOSException("Open Task Manager");
        }
        java.io.File file = new java.io.File("C:/Windows/System32/cmd.exe");
        if (!java.awt.Desktop.isDesktopSupported()) {
            System.err.println("Desktop is not supported");
            return;
        }
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        if (file.exists()) {
            try {
                desktop.open(file);
            } catch (java.io.IOException e) {
                throw new FileMissingException();
            }
        } else {
            throw new FileMissingException();
        }
    }

    /**
     * Checks if the system is connected to Internet or not. The time for
     * checking depends on the internet speed. If the computer is connected to
     * WiFi or Ethernet but no internet is accessed then the control will not
     * return back from this method
     *
     * @return <code>true</code> if the computer is connected to internet
     */
    public static boolean isConnected() {
        try {
            URL url = new URL("http://www.google.com");
            URLConnection connection = url.openConnection();
            connection.connect();
            return true;
        } catch (MalformedURLException e) {
            return false;
        } catch (IOException e) {
            return false;
        }
    }

    /**
     * It returns IP address of a given URL
     *
     * @param url server URL of which IP address is to be found
     * @return IP address of the given URl
     */
    public static String getIP(String url) {
        try {
            if (isConnected()) {
                java.net.InetAddress ia = java.net.InetAddress.getByName(url);
                String ip = ia.getHostAddress();
                return ip;
            } else {
                throw new NoInternetAccessException();
            }
        } catch (java.net.UnknownHostException e) {
            throw new SiteUnaccessableError();
        }
    }

    /**
     * It tests the ping to a server and returns the data in the following
     * format <i>[average, minimum, maximum, packets sent in bytes]</i>. It
     * works on Windows OS only
     *
     * @param server Server URL
     * @return ping details in format <i>[average, minimum, maximum, packets
     * sent in bytes]</i>
     */
    public static int[] ping(String server) {
        if (!SystemUtility.getOSName().startsWith("Windows")) {
            throw new UnsupportedOSException("Open Task Manager");
        }
        int[] a = {0, 0, 0, 32};
        String last = org.asteroid.Command.exec("ping " + server);
        if (last.contains("Request timed out.")) {
            throw new RequestTimeOutError();
        } else if (last.contains("Ping request")) {
            throw new org.asteroid.NoInternetAccessException();
        }
        String[] line = (last.split("\n"));
        last = line[line.length - 1].trim();
        line = last.split(" ");
        int max = Integer.parseInt(line[2].substring(0, line[2].length() - 3));
        int min = Integer.parseInt(line[5].substring(0, line[5].length() - 3));
        int avg = Integer.parseInt(line[8].substring(0, line[8].length() - 2));
        a[0] = avg;
        a[1] = min;
        a[2] = max;
        return a;
    }

    /**
     * returns the file name from the given URL
     *
     * @param url URL to a file on a server
     * @return File name
     */
    private static String getFile(String url) {
        return url.split("/")[url.split("/").length - 1];
    }

    /**
     * Download the file in the given URL. The saved file name is same as the
     * file name in server
     *
     * @param url URL to a file on a server
     * @throws MalformedURLException
     */
    public static void aGET(String url) throws MalformedURLException {
        ReadableByteChannel rbc = null;
        URL website = new URL(url);
        FileOutputStream fos;
        try {
            rbc = Channels.newChannel(website.openStream());
        } catch (IOException e) {
            throw new InvalidURLException();
        }
        try {
            fos = new FileOutputStream(getFile(url));
        } catch (FileNotFoundException e) {
            throw new FileMissingException();
        }
        try {
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        } catch (IOException e) {
            throw new InputOutputError();
        }
    }

    /**
     * Download the file in the given URL and save it the given URL. The value
     * in <code>file</code> is regarded as the location of file where it is
     * saved when <code>isAddress</code> is <code>false</code> else the
     * <code>file</code> is regarded as the file location including file name.
     * If <code>file</code> is the location of file then the saved file name is
     * set to the file name saved in the server.
     *
     * @param url URL to a file on a server
     * @param file File location / address using which the file is saved
     * @param isAddress <code>true</code> if the given file location contains
     * file address
     * @throws MalformedURLException
     */
    public static void aGET(String url, String file, boolean isAddress) throws MalformedURLException {
        ReadableByteChannel rbc = null;
        URL website = new URL(url);
        FileOutputStream fos;
        try {
            rbc = Channels.newChannel(website.openStream());
        } catch (IOException e) {
            throw new InvalidURLException();
        }
        try {
            if (isAddress) {
                if (file.endsWith("/") || file.endsWith("\\")) {
                    fos = new FileOutputStream(file + getFile(url));
                } else if (file.contains("\\")) {
                    fos = new FileOutputStream(file + "\\" + getFile(url));
                } else {
                    fos = new FileOutputStream(file + "/" + getFile(url));
                }
            } else {
                fos = new FileOutputStream(file);
            }
        } catch (FileNotFoundException e) {
            throw new FileMissingException();
        }
        try {
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        } catch (IOException e) {
            throw new InputOutputError();
        }
    }

    /**
     * Download the file in the given URL and save it the given URL. The value
     * in <code>file</code> is regarded as the location of file where it is
     * saved when <code>isAddress</code> is <code>false</code> else the
     * <code>file</code> is regarded as the file location including file name.
     * If <code>file</code> is the location of file then the saved file name is
     * set to the file name saved in the server.
     *
     * @param website URL to a file on a server
     * @param file File address with file name using which the file is saved
     * @throws MalformedURLException
     */
    public static void aGet(URL website, String file) throws MalformedURLException {
        ReadableByteChannel rbc = null;
        FileOutputStream fos;
        try {
            rbc = Channels.newChannel(website.openStream());
        } catch (IOException e) {
            throw new InvalidURLException();
        }
        try {
            fos = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            throw new FileMissingException();
        }
        try {
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        } catch (IOException e) {
            throw new InputOutputError();
        }
    }
}
