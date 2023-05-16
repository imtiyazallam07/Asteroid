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

package org.asteroid;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import org.asteroid.util.SystemUtility;

/**
 * Gives the functionality of executing System shell commands. It can execute
 * command on Windows Operating System only.
 *
 * @author Imtiyaz Allam
 */
public class Command {

    /**
     * Executes a given console command
     *
     * @param cmd
     * @return output
     */
    public static String exec(String cmd) {
        Process p;
        int i = 0;
        if (SystemUtility.getOSName().startsWith("Windows"))
        try {
            ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", cmd);
            builder.redirectErrorStream(true);
            p = builder.start();
            BufferedReader bf = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String out = "", out2;
            do {
                out2 = bf.readLine();
                if (i == 0 && out2 == null) {
                    return "";
                }
                if (out2 != null) {
                    out = out + out2 + "\n";
                }
                i++;
            } while (out2 != null);
            out = out.substring(0, out.length() - 1);
            return out;
        } catch (IOException e) {
            return "";
        } else {
            throw new org.asteroid.util.UnsupportedOSException("Executing command");
        }
    }

    /**
     * Prints the console output of the given command
     *
     * @param cmd
     */
    public static void printExec(String cmd) {
        if (SystemUtility.getOSName().startsWith("Windows"))
        try {
            Process p;
            int i = 0;
            ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", cmd);
            builder.redirectErrorStream(true);
            p = builder.start();
            BufferedReader bf = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String out2;
            do {
                out2 = bf.readLine();
                if (i == 0 && out2 == null) {
                    return;
                }
                if (out2 != null) {
                    System.out.println(out2);
                }
                i++;
            } while (out2 != null);
        } catch (IOException e) {
        } else {
            throw new org.asteroid.util.UnsupportedOSException("Executing command");
        }
    }
}
