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

/**
 * It has many helpful methods related to system utility
 *
 * @author Asteroid Softwares
 */
public class SystemUtility {

    /**
     * It returns the operating system version
     *
     * @return Operating System version
     */
    public static String getOSVersion() {
        return (System.getProperty("os.version"));
    }

    /**
     * It returns the operating system name
     *
     * @return Operating System name
     */
    public static String getOSName() {
        return (System.getProperty("os.name"));
    }

    /**
     * It returns operating system architecture
     *
     * @return Operating System Architecture
     */
    public static String getOSArch() {
        return (System.getProperty("os.arch"));
    }

    /**
     * It returns java compiler name
     *
     * @return Java Compiler name
     */
    public static String getJavaCompiler() {
        return (System.getProperty("java.compiler"));
    }

    /**
     * It returns java extension directory
     *
     * @return Java extension directory
     */
    public static String getJavaExtensionDir() {
        return (System.getProperty("java.ext.dirs"));
    }

    /**
     * It returns java library path
     *
     * @return Java library path
     */
    public static String getJavaLibPath() {
        return (System.getProperty("java.library.path"));
    }

    /**
     * It returns System path separator
     *
     * @return System path separator
     */
    public static String getPathSeparotor() {
        return (System.getProperty("path.separator"));
    }

    /**
     * It returns System file separator
     *
     * @return System file separator
     */
    public static String getFileSeparator() {
        return (System.getProperty("file.separator"));
    }

    /**
     * It returns user directory location
     *
     * @return User directory location
     */
    public static String getUserDir() {
        return (System.getProperty("user.dir"));
    }

    /**
     * It returns JVM implementation version
     *
     * @return
     */
    public static String getJVMImplementationVersion() {
        return (System.getProperty("java.vm.version"));
    }

    /**
     * It returns JVM home directory
     *
     * @return JVM home directory
     */
    public static String getJVMHome() {
        return (System.getProperty("java.home"));
    }

    /**
     * It returns JVM implementation name
     *
     * @return JVM implementation name
     */
    public static String getJVMImplementationName() {
        return (System.getProperty("java.vm.name"));
    }

    /**
     * It returns JVM version
     *
     * @return JVM version
     */
    public static String getJVMRuntimeVerson() {
        return (System.getProperty("java.runtime.version"));
    }

    /**
     * It returns current user name
     *
     * @return Current user name
     */
    public static String getCurrentUser() {
        return (System.getProperty("user.name"));
    }

    /**
     * It returns total memory in JVM in bytes
     *
     * @return total memory in JVM in bytes
     */
    public static long getTotalPrimaryMemory() {
        return (((Runtime.getRuntime().totalMemory()) / 1024) / 8);
    }

    /**
     * It returns total remaining memory in JVM in bytes
     *
     * @return Total remaining memory in JVM in bytes
     */
    public static long getRemainingPrimaryMemory() {
        return (((Runtime.getRuntime().freeMemory()) / 1024) / 8);
    }

    /**
     * It returns consumed memory in JVM in bytes
     *
     * @return Memory Consumed by JVM
     */
    public static long getPrimaryMemoryConsumed() {
        return (((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024) / 8);
    }
}
