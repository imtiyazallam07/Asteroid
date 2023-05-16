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

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Manage and perform operation based on Arrays
 *
 * @author Imtiyaz Allam
 */
public class Array {

    /**
     * Prints an array
     *
     * @param a Array that is to be printed
     */
    public static void printArray(Object[] a) {
        System.out.println(Arrays.toString(a));
    }

    /**
     * Prints an array
     *
     * @param a Array that is to be printed
     */
    public static void printArray(byte[] a) {
        System.out.println(Arrays.toString(a));
    }

    /**
     * Prints an array
     *
     * @param a Array that is to be printed
     */
    public static void printArray(short[] a) {
        System.out.println(Arrays.toString(a));
    }

    /**
     * Prints an array
     *
     * @param a Array that is to be printed
     */
    public static void printArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    /**
     * Prints an array
     *
     * @param a Array that is to be printed
     */
    public static void printArray(long[] a) {
        System.out.println(Arrays.toString(a));
    }

    /**
     * Prints an array
     *
     * @param a Array that is to be printed
     */
    public static void printArray(float[] a) {
        System.out.println(Arrays.toString(a));
    }

    /**
     * Prints an array
     *
     * @param a Array that is to be printed
     */
    public static void printArray(double[] a) {
        System.out.println(Arrays.toString(a));
    }

    /**
     * returns the first element of the array
     *
     * @param a array
     * @return first element of the array
     */
    public static String first(String[] a) {
        return a[0];
    }

    /**
     * returns the first element of the array
     *
     * @param a array
     * @return first element of the array
     */
    public static Object first(Object[] a) {
        return a[0];
    }

    /**
     * returns the first element of the array
     *
     * @param a array
     * @return first element of the array
     */
    public static byte first(byte[] a) {
        return a[0];
    }

    /**
     * returns the first element of the array
     *
     * @param a array
     * @return first element of the array
     */
    public static short first(short[] a) {
        return a[0];
    }

    /**
     * returns the first element of the array
     *
     * @param a array
     * @return first element of the array
     */
    public static int first(int[] a) {
        return a[0];
    }

    /**
     * returns the first element of the array
     *
     * @param a array
     * @return first element of the array
     */
    public static long first(long[] a) {
        return a[0];
    }

    /**
     * returns the first element of the array
     *
     * @param a array
     * @return first element of the array
     */
    public static float first(float[] a) {
        return a[0];
    }

    /**
     * returns the first element of the array
     *
     * @param a array
     * @return first element of the array
     */
    public static double first(double[] a) {
        return a[0];
    }

    /**
     * returns the first element of the array
     *
     * @param a array
     * @return first element of the array
     */
    public static boolean first(boolean[] a) {
        return a[0];
    }

    /**
     * returns the first element of the array
     *
     * @param a array
     * @return first element of the array
     */
    public static char first(char[] a) {
        return a[0];
    }

    /**
     * returns the last element of the array
     *
     * @param a array
     * @return last element of the array
     */
    public static String last(String[] a) {
        return a[a.length - 1];
    }

    /**
     * returns the last element of the array
     *
     * @param a array
     * @return last element of the array
     */
    public static Object last(Object[] a) {
        return a[a.length - 1];
    }

    /**
     * returns the last element of the array
     *
     * @param a array
     * @return last element of the array
     */
    public static byte last(byte[] a) {
        return a[a.length - 1];
    }

    /**
     * returns the last element of the array
     *
     * @param a array
     * @return last element of the array
     */
    public static short last(short[] a) {
        return a[a.length - 1];
    }

    /**
     * returns the last element of the array
     *
     * @param a array
     * @return last element of the array
     */
    public static int last(int[] a) {
        return a[a.length - 1];
    }

    /**
     * returns the last element of the array
     *
     * @param a array
     * @return last element of the array
     */
    public static long last(long[] a) {
        return a[a.length - 1];
    }

    /**
     * returns the last element of the array
     *
     * @param a array
     * @return last element of the array
     */
    public static float last(float[] a) {
        return a[a.length - 1];
    }

    /**
     * returns the last element of the array
     *
     * @param a array
     * @return last element of the array
     */
    public static double last(double[] a) {
        return a[a.length - 1];
    }

    /**
     * returns the last element of the array
     *
     * @param a array
     * @return last element of the array
     */
    public static boolean last(boolean[] a) {
        return a[a.length - 1];
    }

    /**
     * returns the last element of the array
     *
     * @param a array
     * @return last element of the array
     */
    public static char last(char[] a) {
        return a[a.length - 1];
    }

    /**
     * returns till the nth element of the array
     *
     * @param a array
     * @param number number of elements to be taken
     * @return Array till the nth element
     */
    public static String[] take(String[] a, int number) {
        if (a.length < number) {
            throw new OutOfRangeException();
        }
        ArrayList ar = new ArrayList();
        for (int i = 0; i < number; i++) {
            ar.add(a[i]);
        }
        String[] array = new String[ar.size()];
        for (int i = 0; i < ar.size(); i++) {
            array[i] = (String) ar.get(i);
        }
        return array;
    }

    /**
     * returns till the nth element of the array
     *
     * @param a array
     * @param number number of elements to be taken
     * @return Array till the nth element
     */
    public static Object[] take(Object[] a, int number) {
        if (a.length < number) {
            throw new OutOfRangeException();
        }
        ArrayList ar = new ArrayList();
        for (int i = 0; i < number; i++) {
            ar.add(a[i]);
        }
        return ar.toArray();
    }

    /**
     * returns till the nth element of the array
     *
     * @param a array
     * @param number number of elements to be taken
     * @return Array till the nth element
     */
    public static byte[] take(byte[] a, int number) {
        if (a.length < number) {
            throw new OutOfRangeException();
        }
        ArrayList<Byte> ar = new ArrayList();
        for (int i = 0; i < number; i++) {
            ar.add(a[i]);
        }
        byte[] array = new byte[ar.size()];
        for (int i = 0; i < ar.size(); i++) {
            array[i] = ar.get(i);
        }
        return array;
    }

    /**
     * returns till the nth element of the array
     *
     * @param a array
     * @param number number of elements to be taken
     * @return Array till the nth element
     */
    public static short[] take(short[] a, int number) {
        if (a.length < number) {
            throw new OutOfRangeException();
        }
        ArrayList ar = new ArrayList();
        for (int i = 0; i < number; i++) {
            ar.add(a[i]);
        }
        short[] array = new short[ar.size()];
        for (int i = 0; i < ar.size(); i++) {
            array[i] = (short) ar.get(i);
        }
        return array;
    }

    /**
     * returns till the nth element of the array
     *
     * @param a array
     * @param number number of elements to be taken
     * @return Array till the nth element
     */
    public static int[] take(int[] a, int number) {
        if (a.length < number) {
            throw new OutOfRangeException();
        }
        ArrayList ar = new ArrayList();
        for (int i = 0; i < number; i++) {
            ar.add(a[i]);
        }
        int[] array = new int[ar.size()];
        for (int i = 0; i < ar.size(); i++) {
            array[i] = (int) ar.get(i);
        }
        return array;
    }

    /**
     * returns till the nth element of the array
     *
     * @param a array
     * @param number number of elements to be taken
     * @return Array till the nth element
     */
    public static long[] take(long[] a, int number) {
        if (a.length < number) {
            throw new OutOfRangeException();
        }
        ArrayList ar = new ArrayList();
        for (int i = 0; i < number; i++) {
            ar.add(a[i]);
        }

        long[] array = new long[ar.size()];
        for (int i = 0; i < ar.size(); i++) {
            array[i] = (long) ar.get(i);
        }
        return array;
    }

    /**
     * returns till the nth element of the array
     *
     * @param a array
     * @param number number of elements to be taken
     * @return Array till the nth element
     */
    public static float[] take(float[] a, int number) {
        if (a.length < number) {
            throw new OutOfRangeException();
        }
        ArrayList ar = new ArrayList();
        for (int i = 0; i < number; i++) {
            ar.add(a[i]);
        }
        float[] array = new float[ar.size()];
        for (int i = 0; i < ar.size(); i++) {
            array[i] = (float) ar.get(i);
        }
        return array;
    }

    /**
     * returns till the nth element of the array
     *
     * @param a array
     * @param number number of elements to be taken
     * @return Array till the nth element
     */
    public static double[] take(double[] a, int number) {
        if (a.length < number) {
            throw new OutOfRangeException();
        }
        ArrayList ar = new ArrayList();
        for (int i = 0; i < number; i++) {
            ar.add(a[i]);
        }
        double[] array = new double[ar.size()];
        for (int i = 0; i < ar.size(); i++) {
            array[i] = (double) ar.get(i);
        }
        return array;
    }

    /**
     * returns till the nth element of the array
     *
     * @param a array
     * @param number number of elements to be taken
     * @return Array till the nth element
     */
    public static boolean[] take(boolean[] a, int number) {
        if (a.length < number) {
            throw new OutOfRangeException();
        }
        ArrayList ar = new ArrayList();
        for (int i = 0; i < number; i++) {
            ar.add(a[i]);
        }
        boolean[] array = new boolean[ar.size()];
        for (int i = 0; i < ar.size(); i++) {
            array[i] = (boolean) ar.get(i);
        }
        return array;
    }

    /**
     * returns till the nth element of the array
     *
     * @param a array
     * @param number number of elements to be taken
     * @return Array till the nth element
     */
    public static char[] take(char[] a, int number) {
        if (a.length < number) {
            throw new OutOfRangeException();
        }
        ArrayList ar = new ArrayList();
        for (int i = 0; i < number; i++) {
            ar.add(a[i]);
        }
        char[] array = new char[ar.size()];
        for (int i = 0; i < ar.size(); i++) {
            array[i] = (char) ar.get(i);
        }
        return array;
    }

    /**
     * Finds largest number
     *
     * @param a Array of which largest number is to found
     * @return the largest number in the Array
     */
    public static int max(int[] a) {
        if (a.length == 0) {
            throw new EmptyArrayException();
        }
        int max = a[0];
        for (int num : a) {
            max = Math.max(max, num);
        }
        return max;
    }

    /**
     * Finds largest number
     *
     * @param a Array of which largest number is to found
     * @return the largest number in the Array
     */
    public static long max(long[] a) {
        if (a.length == 0) {
            throw new EmptyArrayException();
        }
        long max = a[0];
        for (long num : a) {
            max = Math.max(max, num);
        }
        return max;
    }

    /**
     * Finds largest number
     *
     * @param a Array of which largest number is to found
     * @return the largest number in the Array
     */
    public static double max(double[] a) {
        if (a.length == 0) {
            throw new EmptyArrayException();
        }
        double max = a[0];
        for (double num : a) {
            max = Math.max(max, num);
        }
        return max;
    }

    /**
     * Finds largest number
     *
     * @param a Array of which largest number is to found
     * @return the largest number in the Array
     */
    public static float max(float[] a) {
        if (a.length == 0) {
            throw new EmptyArrayException();
        }
        float max = a[0];
        for (float num : a) {
            max = Math.max(max, num);
        }
        return max;
    }

    /**
     * Finds smallest number
     *
     * @param a Array of which largest number is to found
     * @return the smallest number in the Array
     */
    public static int min(int[] a) {
        if (a.length == 0) {
            throw new EmptyArrayException();
        }
        int min = a[0];
        for (int num : a) {
            min = Math.min(min, num);
        }
        return min;
    }

    /**
     * Finds smallest number
     *
     * @param a Array of which largest number is to found
     * @return the smallest number in the Array
     */
    public static long min(long[] a) {
        if (a.length == 0) {
            throw new EmptyArrayException();
        }
        long min = a[0];
        for (long num : a) {
            min = Math.min(min, num);
        }
        return min;
    }

    /**
     * Finds largest number
     *
     * @param a Array of which largest number is to found
     * @return the smallest number in the Array
     */
    public static double min(double[] a) {
        if (a.length == 0) {
            throw new EmptyArrayException();
        }
        double min = a[0];
        for (double num : a) {
            min = Math.min(min, num);
        }
        return min;
    }

    /**
     * Finds smallest number
     *
     * @param a Array of which largest number is to found
     * @return the smallest number in the Array
     */
    public static float min(float[] a) {
        if (a.length == 0) {
            throw new EmptyArrayException();
        }
        float min = a[0];
        for (float num : a) {
            min = Math.min(min, num);
        }
        return min;
    }

    /**
     * replace the first occurrence of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     */
    public static void replace(String[] arr, String element, String replacement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(element)) {
                arr[i] = replacement;
                break;
            }
        }
    }

    /**
     * replace the first occurrence of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     * @param startIndex index to start searching from
     */
    public static void replace(String[] arr, String element, String replacement, int startIndex) {
        if (startIndex >= arr.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i].equals(element)) {
                arr[i] = replacement;
                break;
            }
        }
    }

    /**
     * replace the last occurrence of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     */
    public static void replaceLast(String[] arr, String element, String replacement) {
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i].equals(element)) {
                arr[i] = replacement;
                break;
            }
        }
    }

    /**
     * replace last occurrence of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     */
    public static void replaceAll(String[] arr, String element, String replacement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(element)) {
                arr[i] = replacement;
            }
        }
    }

    /**
     * replace all occurrences of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     * @param from index to start searching from
     */
    public static void replaceAll(String[] arr, String element, String replacement, int from) {
        for (int i = from; i < arr.length; i++) {
            if (arr[i].equals(element)) {
                arr[i] = replacement;
            }
        }
    }

    /**
     * replace the first occurrence of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     */
    public static void replace(byte[] arr, byte element, byte replacement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
            }
        }
    }

    /**
     * replace the first occurrence of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     * @param startIndex index to start searching from
     */
    public static void replace(byte[] arr, byte element, byte replacement, int startIndex) {
        if (startIndex >= arr.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
            }
        }
    }

    /**
     * replace the last occurrence of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     */
    public static void replaceLast(byte[] arr, byte element, byte replacement) {
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
            }
        }
    }

    /**
     * replace all occurrences of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     */
    public static void replaceAll(byte[] arr, byte element, byte replacement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = replacement;
            }
        }
    }

    /**
     * replace all occurrences of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     * @param from index to start searching from
     */
    public static void replaceAll(byte[] arr, byte element, byte replacement, int from) {
        for (int i = from; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = replacement;
            }
        }
    }

    /**
     * replace the first occurrence of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     */
    public static void replace(short[] arr, short element, short replacement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
            }
        }
    }

    /**
     * replace the first occurrence of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     * @param startIndex index to start searching from
     */
    public static void replace(short[] arr, short element, short replacement, int startIndex) {
        if (startIndex >= arr.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
            }
        }
    }

    /**
     * replace the last occurrence of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     */
    public static void replaceLast(short[] arr, short element, short replacement) {
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
            }
        }
    }

    /**
     * replace all occurrences of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     */
    public static void replaceAll(short[] arr, short element, short replacement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = replacement;
            }
        }
    }

    /**
     * replace all occurrences of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     * @param from index to start searching from
     */
    public static void replaceAll(short[] arr, short element, short replacement, int from) {
        for (int i = from; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = replacement;
            }
        }
    }

    /**
     * replace the first occurrence of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     */
    public static void replace(int[] arr, int element, int replacement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
            }
        }
    }

    /**
     * replace the first occurrence of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     * @param startIndex index to start searching from
     */
    public static void replace(int[] arr, int element, int replacement, int startIndex) {
        if (startIndex >= arr.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
            }
        }
    }

    /**
     * replace the last occurrence of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     */
    public static void replaceLast(int[] arr, int element, int replacement) {
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
            }
        }
    }

    /**
     * replace all occurrences of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     */
    public static void replaceAll(int[] arr, int element, int replacement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = replacement;
            }
        }
    }

    /**
     * replace all occurrences of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     * @param from index to start searching from
     */
    public static void replaceAll(int[] arr, int element, int replacement, int from) {
        for (int i = from; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = replacement;
            }
        }
    }

    /**
     * replace the first occurrence of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     */
    public static void replace(long[] arr, long element, long replacement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
            }
        }
    }

    /**
     * replace the first occurrence of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     * @param startIndex index to start searching from
     */
    public static void replace(long[] arr, long element, long replacement, int startIndex) {
        if (startIndex >= arr.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
            }
        }
    }

    /**
     * replace the last occurrence of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     */
    public static void replaceLast(long[] arr, long element, long replacement) {
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
            }
        }
    }

    /**
     * replace all occurrences of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     */
    public static void replaceAll(long[] arr, long element, long replacement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = replacement;
            }
        }
    }

    /**
     * replace all occurrences of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     * @param from index to start searching from
     */
    public static void replaceAll(long[] arr, long element, long replacement, int from) {
        for (int i = from; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = replacement;
            }
        }
    }

    /**
     * replace the first occurrence of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     */
    public static void replace(float[] arr, float element, float replacement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
            }
        }
    }

    /**
     * replace the first occurrence of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     * @param startIndex index to start searching from
     */
    public static void replace(float[] arr, float element, float replacement, int startIndex) {
        if (startIndex >= arr.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
            }
        }
    }

    /**
     * replace the last occurrence of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     */
    public static void replaceLast(float[] arr, float element, float replacement) {
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
            }
        }
    }

    /**
     * replace all occurrences of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     */
    public static void replaceAll(float[] arr, float element, float replacement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = replacement;
            }
        }
    }

    /**
     * replace all occurrences of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     * @param from index to start searching from
     */
    public static void replaceAll(float[] arr, float element, float replacement, int from) {
        for (int i = from; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = replacement;
            }
        }
    }

    /**
     * replace the first occurrence of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     */
    public static void replace(double[] arr, double element, double replacement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
            }
        }
    }

    /**
     * replace the first occurrence of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     * @param startIndex index to start searching from
     */
    public static void replace(double[] arr, double element, double replacement, int startIndex) {
        if (startIndex >= arr.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
            }
        }
    }

    /**
     * replace the last occurrence of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     */
    public static void replaceLast(double[] arr, double element, double replacement) {
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
            }
        }
    }

    /**
     * replace all occurrences of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     */
    public static void replaceAll(double[] arr, double element, double replacement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = replacement;
            }
        }
    }

    /**
     * replace all occurrences of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     * @param from index to start searching from
     */
    public static void replaceAll(double[] arr, double element, double replacement, int from) {
        for (int i = from; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = replacement;
            }
        }
    }

    /**
     * replace the first occurrence of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     */
    public static void replace(char[] arr, char element, char replacement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
            }
        }
    }

    /**
     * replace the first occurrence of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     * @param startIndex index to start searching from
     */
    public static void replace(char[] arr, char element, char replacement, int startIndex) {
        if (startIndex >= arr.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
            }
        }
    }

    /**
     * replace the last occurrence of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     */
    public static void replaceLast(char[] arr, char element, char replacement) {
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
            }
        }
    }

    /**
     * replace all occurrences of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     */
    public static void replaceAll(char[] arr, char element, char replacement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = replacement;
            }
        }
    }

    /**
     * replace all occurrences of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     * @param from index to start searching from
     */
    public static void replaceAll(char[] arr, char element, char replacement, int from) {
        for (int i = from; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = replacement;
            }
        }
    }

    /**
     * Merge the two given array
     *
     * @param array1 first array
     * @param array2 second array
     * @return concatenated array
     */
    public static Object[] merge(Object[] array1, Object[] array2) {
        Object[] arr = new Object[array1.length + array2.length];
        System.arraycopy(array1, 0, arr, 0, array1.length);
        System.arraycopy(array2, 0, arr, array1.length, array2.length);
        return arr;
    }

    /**
     * Merge the two given array
     *
     * @param array1 first array
     * @param array2 second array
     * @return concatenated array
     */
    public static int[] merge(int[] array1, int[] array2) {
        int[] arr = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, arr, 0, array1.length);
        System.arraycopy(array2, 0, arr, array1.length, array2.length);
        return arr;
    }

    /**
     * Merge the two given array
     *
     * @param array1 first array
     * @param array2 second array
     * @return concatenated array
     */
    public static Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] arr = new Integer[array1.length + array2.length];
        System.arraycopy(array1, 0, arr, 0, array1.length);
        System.arraycopy(array2, 0, arr, array1.length, array2.length);
        return arr;
    }

    /**
     * Merge the two given array
     *
     * @param array1 first array
     * @param array2 second array
     * @return concatenated array
     */
    public static String[] merge(String[] array1, String[] array2) {
        String[] arr = new String[array1.length + array2.length];
        System.arraycopy(array1, 0, arr, 0, array1.length);
        System.arraycopy(array2, 0, arr, array1.length, array2.length);
        return arr;
    }

    /**
     * Merge the two given array
     *
     * @param array1 first array
     * @param array2 second array
     * @return concatenated array
     */
    public static short[] merge(short[] array1, short[] array2) {
        short[] arr = new short[array1.length + array2.length];
        System.arraycopy(array1, 0, arr, 0, array1.length);
        System.arraycopy(array2, 0, arr, array1.length, array2.length);
        return arr;
    }

    /**
     * Merge the two given array
     *
     * @param array1 first array
     * @param array2 second array
     * @return concatenated array
     */
    public static Short[] merge(Short[] array1, Short[] array2) {
        Short[] arr = new Short[array1.length + array2.length];
        System.arraycopy(array1, 0, arr, 0, array1.length);
        System.arraycopy(array2, 0, arr, array1.length, array2.length);
        return arr;
    }

    /**
     * Merge the two given array
     *
     * @param array1 first array
     * @param array2 second array
     * @return concatenated array
     */
    public static byte[] merge(byte[] array1, byte[] array2) {
        byte[] arr = new byte[array1.length + array2.length];
        System.arraycopy(array1, 0, arr, 0, array1.length);
        System.arraycopy(array2, 0, arr, array1.length, array2.length);
        return arr;
    }

    /**
     * Merge the two given array
     *
     * @param array1 first array
     * @param array2 second array
     * @return concatenated array
     */
    public static Byte[] merge(Byte[] array1, Byte[] array2) {
        Byte[] arr = new Byte[array1.length + array2.length];
        System.arraycopy(array1, 0, arr, 0, array1.length);
        System.arraycopy(array2, 0, arr, array1.length, array2.length);
        return arr;
    }

    /**
     * Merge the two given array
     *
     * @param array1 first array
     * @param array2 second array
     * @return concatenated array
     */
    public static long[] merge(long[] array1, long[] array2) {
        long[] arr = new long[array1.length + array2.length];
        System.arraycopy(array1, 0, arr, 0, array1.length);
        System.arraycopy(array2, 0, arr, array1.length, array2.length);
        return arr;
    }

    /**
     * Merge the two given array
     *
     * @param array1 first array
     * @param array2 second array
     * @return concatenated array
     */
    public static Long[] merge(Long[] array1, Long[] array2) {
        Long[] arr = new Long[array1.length + array2.length];
        System.arraycopy(array1, 0, arr, 0, array1.length);
        System.arraycopy(array2, 0, arr, array1.length, array2.length);
        return arr;
    }

    /**
     * Merge the two given array
     *
     * @param array1 first array
     * @param array2 second array
     * @return concatenated array
     */
    public static float[] merge(float[] array1, float[] array2) {
        float[] arr = new float[array1.length + array2.length];
        System.arraycopy(array1, 0, arr, 0, array1.length);
        System.arraycopy(array2, 0, arr, array1.length, array2.length);
        return arr;
    }

    /**
     * Merge the two given array
     *
     * @param array1 first array
     * @param array2 second array
     * @return concatenated array
     */
    public static Float[] merge(Float[] array1, Float[] array2) {
        Float[] arr = new Float[array1.length + array2.length];
        System.arraycopy(array1, 0, arr, 0, array1.length);
        System.arraycopy(array2, 0, arr, array1.length, array2.length);
        return arr;
    }

    /**
     * Merge the two given array
     *
     * @param array1 first array
     * @param array2 second array
     * @return concatenated array
     */
    public static double[] merge(double[] array1, double[] array2) {
        double[] arr = new double[array1.length + array2.length];
        System.arraycopy(array1, 0, arr, 0, array1.length);
        System.arraycopy(array2, 0, arr, array1.length, array2.length);
        return arr;
    }

    /**
     * Merge the two given array
     *
     * @param array1 first array
     * @param array2 second array
     * @return concatenated array
     */
    public static Double[] merge(Double[] array1, Double[] array2) {
        Double[] arr = new Double[array1.length + array2.length];
        System.arraycopy(array1, 0, arr, 0, array1.length);
        System.arraycopy(array2, 0, arr, array1.length, array2.length);
        return arr;
    }

    /**
     * Merge the two given array
     *
     * @param array1 first array
     * @param array2 second array
     * @return concatenated array
     */
    public static char[] merge(char[] array1, char[] array2) {
        char[] arr = new char[array1.length + array2.length];
        System.arraycopy(array1, 0, arr, 0, array1.length);
        System.arraycopy(array2, 0, arr, array1.length, array2.length);
        return arr;
    }

    /**
     * Merge the two given array
     *
     * @param array1 first array
     * @param array2 second array
     * @return concatenated array
     */
    public static Character[] merge(Character[] array1, Character[] array2) {
        Character[] arr = new Character[array1.length + array2.length];
        System.arraycopy(array1, 0, arr, 0, array1.length);
        System.arraycopy(array2, 0, arr, array1.length, array2.length);
        return arr;
    }

    /**
     * Merge the two given array
     *
     * @param array1 first array
     * @param array2 second array
     * @return concatenated array
     */
    public static boolean[] merge(boolean[] array1, boolean[] array2) {
        boolean[] arr = new boolean[array1.length + array2.length];
        System.arraycopy(array1, 0, arr, 0, array1.length);
        System.arraycopy(array2, 0, arr, array1.length, array2.length);
        return arr;
    }

    /**
     * Merge the two given array
     *
     * @param array1 first array
     * @param array2 second array
     * @return concatenated array
     */
    public static Boolean[] merge(Boolean[] array1, Boolean[] array2) {
        Boolean[] arr = new Boolean[array1.length + array2.length];
        System.arraycopy(array1, 0, arr, 0, array1.length);
        System.arraycopy(array2, 0, arr, array1.length, array2.length);
        return arr;
    }

    /**
     * Reverse an array
     *
     * @param arr array to reverse
     */
    public static void reverse(byte[] arr) {
        byte temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }
    }

    /**
     * Reverse an array
     *
     * @param arr array to reverse
     */
    public static void reverse(Byte[] arr) {
        byte temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }
    }

    /**
     * Reverse an array
     *
     * @param arr array to reverse
     */
    public static void reverse(short[] arr) {
        short temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }
    }

    /**
     * Reverse an array
     *
     * @param arr array to reverse
     */
    public static void reverse(Short[] arr) {
        short temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }
    }

    /**
     * Reverse an array
     *
     * @param arr array to reverse
     */
    public static void reverse(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }
    }

    /**
     * Reverse an array
     *
     * @param arr array to reverse
     */
    public static void reverse(Integer[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }
    }

    /**
     * Reverse an array
     *
     * @param arr array to reverse
     */
    public static void reverse(long[] arr) {
        long temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }
    }

    /**
     * Reverse an array
     *
     * @param arr array to reverse
     */
    public static void reverse(Long[] arr) {
        long temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }
    }

    /**
     * Reverse an array
     *
     * @param arr array to reverse
     */
    public static void reverse(float[] arr) {
        float temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }
    }

    /**
     * Reverse an array
     *
     * @param arr array to reverse
     */
    public static void reverse(Float[] arr) {
        float temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }
    }

    /**
     * Reverse an array
     *
     * @param arr array to reverse
     */
    public static void reverse(double[] arr) {
        double temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }
    }

    /**
     * Reverse an array
     *
     * @param arr array to reverse
     */
    public static void reverse(Double[] arr) {
        double temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }
    }

    /**
     * Reverse an array
     *
     * @param arr array to reverse
     */
    public static void reverse(char[] arr) {
        char temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }
    }

    /**
     * Reverse an array
     *
     * @param arr array to reverse
     */
    public static void reverse(Character[] arr) {
        char temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }
    }

    /**
     * Reverse an array
     *
     * @param arr array to reverse
     */
    public static void reverse(String[] arr) {
        String temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }
    }

    /**
     * Reverse an array
     *
     * @param arr array to reverse
     */
    public static void reverse(boolean[] arr) {
        boolean temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }
    }

    /**
     * Reverse an array
     *
     * @param arr array to reverse
     */
    public static void reverse(Boolean[] arr) {
        boolean temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }
    }

    /**
     * Reverse an array
     *
     * @param arr array to reverse
     */
    public static void reverse(Object[] arr) {
        Object temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }
    }

    /**
     * Flip / Negate the boolean values in the array
     *
     * @param arr array on which operation is to be performed
     */
    public static void flip(boolean[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = !arr[i];
        }
    }

    /**
     * Flip / Negate the boolean values in the array
     *
     * @param arr array on which operation is to be performed
     */
    public static void flip(Boolean[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = !arr[i];
        }
    }

    /**
     * Calculates sum of elements in the array
     *
     * @param s the array of which the sum is to be calculated
     * @return the sum of elements in the array
     */
    public static byte sum(byte[] s) {
        byte sum = 0;
        for (byte d : s) {
            sum += d;
        }
        return sum;
    }

    /**
     * Calculates sum of elements in the array
     *
     * @param s the array of which the sum is to be calculated
     * @return the sum of elements in the array
     */
    public static short sum(short[] s) {
        short sum = 0;
        for (short d : s) {
            sum += d;
        }
        return sum;
    }

    /**
     * Calculates sum of elements in the array
     *
     * @param s the array of which the sum is to be calculated
     * @return the sum of elements in the array
     */
    public static int sum(int[] s) {
        int sum = 0;
        for (int d : s) {
            sum += d;
        }
        return sum;
    }

    /**
     * Calculates sum of elements in the array
     *
     * @param s the array of which the sum is to be calculated
     * @return the sum of elements in the array
     */
    public static long sum(long[] s) {
        long sum = 0;
        for (long d : s) {
            sum += d;
        }
        return sum;
    }

    /**
     * Calculates sum of elements in the array
     *
     * @param s the array of which the sum is to be calculated
     * @return the sum of elements in the array
     */
    public static float sum(float[] s) {
        float sum = 0;
        for (float d : s) {
            sum += d;
        }
        return sum;
    }

    /**
     * Calculates sum of elements in the array
     *
     * @param s the array of which the sum is to be calculated
     * @return the sum of elements in the array
     */
    public static double sum(double[] s) {
        double sum = 0;
        for (double d : s) {
            sum += d;
        }
        return sum;
    }

    /**
     * Adds a specific number to all the items in the array
     *
     * @param arr The array in which the specific number is to be added
     * @param d The number that is to be added to all elements
     * @return A new array with that specific number added to all elements of
     * the given array
     */
    public static int[] add(int[] arr, int d) {
        int[] a = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] + d;
        }
        return a;
    }

    /**
     * Adds a specific number to all the items in the array
     *
     * @param arr The array in which the specific number is to be added
     * @param d The number that is to be added to all elements
     * @return A new array with that specific number added to all elements of
     * the given array
     */
    public static double[] add(int[] arr, double d) {
        double[] a = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] + d;
        }
        return a;
    }

    /**
     * Adds a specific number to all the items in the array
     *
     * @param arr The array in which the specific number is to be added
     * @param d The number that is to be added to all elements
     * @return A new array with that specific number added to all elements of
     * the given array
     */
    public static long[] add(long[] arr, long d) {
        long[] a = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] + d;
        }
        return a;
    }

    /**
     * Adds a specific number to all the items in the array
     *
     * @param arr The array in which the specific number is to be added
     * @param d The number that is to be added to all elements
     * @return A new array with that specific number added to all elements of
     * the given array
     */
    public static double[] add(long[] arr, double d) {
        double[] a = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] + d;
        }
        return a;
    }

    /**
     * Adds a specific number to all the items in the array
     *
     * @param arr The array in which the specific number is to be added
     * @param d The number that is to be added to all elements
     * @return A new array with that specific number added to all elements of
     * the given array
     */
    public static double[] add(float[] arr, double d) {
        double[] a = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] + d;
        }
        return a;
    }

    /**
     * Adds a specific number to all the items in the array
     *
     * @param arr The array in which the specific number is to be added
     * @param d The number that is to be added to all elements
     * @return A new array with that specific number added to all elements of
     * the given array
     */
    public static float[] add(float[] arr, float d) {
        float[] a = new float[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] + d;
        }
        return a;
    }

    /**
     * Adds a specific number to all the items in the array
     *
     * @param arr The array in which the specific number is to be added
     * @param d The number that is to be added to all elements
     * @return A new array with that specific number added to all elements of
     * the given array
     */
    public static double[] add(double[] arr, double d) {
        double[] a = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] + d;
        }
        return a;
    }

    /**
     * Subtarcts a specific number from all the items in the array
     *
     * @param arr The array in which the specific number is to be subtracted
     * @param d The number that is to be subtracted from all elements
     * @return A new array with that specific number subtracted from all
     * elements of the given array
     */
    public static int[] sub(int[] arr, int d) {
        int[] a = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] - d;
        }
        return a;
    }

    /**
     * Subtarcts a specific number from all the items in the array
     *
     * @param arr The array in which the specific number is to be subtracted
     * @param d The number that is to be subtracted from all elements
     * @return A new array with that specific number subtracted from all
     * elements of the given array
     */
    public static double[] sub(int[] arr, double d) {
        double[] a = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] - d;
        }
        return a;
    }

    /**
     * Subtarcts a specific number from all the items in the array
     *
     * @param arr The array in which the specific number is to be subtracted
     * @param d The number that is to be subtracted from all elements
     * @return A new array with that specific number subtracted from all
     * elements of the given array
     */
    public static long[] sub(long[] arr, long d) {
        long[] a = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] - d;
        }
        return a;
    }

    /**
     * Subtarcts a specific number from all the items in the array
     *
     * @param arr The array in which the specific number is to be subtracted
     * @param d The number that is to be subtracted from all elements
     * @return A new array with that specific number subtracted from all
     * elements of the given array
     */
    public static double[] sub(long[] arr, double d) {
        double[] a = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] - d;
        }
        return a;
    }

    /**
     * Subtarcts a specific number from all the items in the array
     *
     * @param arr The array in which the specific number is to be subtracted
     * @param d The number that is to be subtracted from all elements
     * @return A new array with that specific number subtracted from all
     * elements of the given array
     */
    public static float[] sub(float[] arr, float d) {
        float[] a = new float[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] - d;
        }
        return a;
    }

    /**
     * Subtarcts a specific number from all the items in the array
     *
     * @param arr The array in which the specific number is to be subtracted
     * @param d The number that is to be subtracted from all elements
     * @return A new array with that specific number subtracted from all
     * elements of the given array
     */
    public static double[] sub(double[] arr, double d) {
        double[] a = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] - d;
        }
        return a;
    }

    /**
     * Subtarcts a specific number from all the items in the array
     *
     * @param arr The array in which the specific number is to be subtracted
     * @param d The number that is to be subtracted from all elements
     * @return A new array with that specific number subtracted from all
     * elements of the given array
     */
    public static double[] sub(float[] arr, double d) {
        double[] a = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] - d;
        }
        return a;
    }

    /**
     * Multiplies a specific number to all the items in the array
     *
     * @param arr The array in which the specific number is to be multiplied
     * @param d The number that is to be multiplied to all elements
     * @return A new array with that specific number multiplied to all elements
     * of the given array
     */
    public static int[] mul(int[] arr, int d) {
        int[] a = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] * d;
        }
        return a;
    }

    /**
     * Multiplies a specific number to all the items in the array
     *
     * @param arr The array in which the specific number is to be multiplied
     * @param d The number that is to be multiplied to all elements
     * @return A new array with that specific number multiplied to all elements
     * of the given array
     */
    public static double[] mul(int[] arr, double d) {
        double[] a = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] * d;
        }
        return a;
    }

    /**
     * Multiplies a specific number to all the items in the array
     *
     * @param arr The array in which the specific number is to be multiplied
     * @param d The number that is to be multiplied to all elements
     * @return A new array with that specific number multiplied to all elements
     * of the given array
     */
    public static double[] mul(long[] arr, double d) {
        double[] a = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] * d;
        }
        return a;
    }

    /**
     * Multiplies a specific number to all the items in the array
     *
     * @param arr The array in which the specific number is to be multiplied
     * @param d The number that is to be multiplied to all elements
     * @return A new array with that specific number multiplied to all elements
     * of the given array
     */
    public static double[] mul(float[] arr, double d) {
        double[] a = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] * d;
        }
        return a;
    }

    /**
     * Multiplies a specific number to all the items in the array
     *
     * @param arr The array in which the specific number is to be multiplied
     * @param d The number that is to be multiplied to all elements
     * @return A new array with that specific number multiplied to all elements
     * of the given array
     */
    public static long[] mul(long[] arr, long d) {
        long[] a = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] * d;
        }
        return a;
    }

    /**
     * Multiplies a specific number to all the items in the array
     *
     * @param arr The array in which the specific number is to be multiplied
     * @param d The number that is to be multiplied to all elements
     * @return A new array with that specific number multiplied to all elements
     * of the given array
     */
    public static float[] mul(float[] arr, float d) {
        float[] a = new float[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] * d;
        }
        return a;
    }

    /**
     * Multiplies a specific number to all the items in the array
     *
     * @param arr The array in which the specific number is to be multiplied
     * @param d The number that is to be multiplied to all elements
     * @return A new array with that specific number multiplied to all elements
     * of the given array
     */
    public static double[] mul(double[] arr, double d) {
        double[] a = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] * d;
        }
        return a;
    }

    /**
     * Divides all the items in the array by specific number ({@code x[i] / d})
     *
     * @param arr The array in which the specific number is to be divided
     * @param d The number to which all elements are to be divided by
     * @return A new array containing all elements of the given array divided by
     * the specific number
     */
    public static int[] div(int[] arr, int d) {
        int[] a = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] / d;
        }
        return a;
    }

    /**
     * Divides all the items in the array by specific number ({@code x[i] / d})
     *
     * @param arr The array in which the specific number is to be divided
     * @param d The number to which all elements are to be divided by
     * @return A new array containing all elements of the given array divided by
     * the specific number
     */
    public static double[] div(int[] arr, double d) {
        double[] a = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] / d;
        }
        return a;
    }

    /**
     * Divides all the items in the array by specific number ({@code x[i] / d})
     *
     * @param arr The array in which the specific number is to be divided
     * @param d The number to which all elements are to be divided by
     * @return A new array containing all elements of the given array divided by
     * the specific number
     */
    public static double[] div(float[] arr, double d) {
        double[] a = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] / d;
        }
        return a;
    }

    /**
     * Divides all the items in the array by specific number ({@code x[i] / d})
     *
     * @param arr The array in which the specific number is to be divided
     * @param d The number to which all elements are to be divided by
     * @return A new array containing all elements of the given array divided by
     * the specific number
     */
    public static double[] div(long[] arr, double d) {
        double[] a = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] / d;
        }
        return a;
    }

    /**
     * Divides all the items in the array by specific number ({@code x[i] / d})
     *
     * @param arr The array in which the specific number is to be divided
     * @param d The number to which all elements are to be divided by
     * @return A new array containing all elements of the given array divided by
     * the specific number
     */
    public static long[] div(long[] arr, long d) {
        long[] a = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] / d;
        }
        return a;
    }

    /**
     * Divides all the items in the array by specific number ({@code x[i] / d})
     *
     * @param arr The array in which the specific number is to be divided
     * @param d The number to which all elements are to be divided by
     * @return A new array containing all elements of the given array divided by
     * the specific number
     */
    public static float[] div(float[] arr, float d) {
        float[] a = new float[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] / d;
        }
        return a;
    }

    /**
     * Divides all the items in the array by specific number ({@code x[i] / d})
     *
     * @param arr The array in which the specific number is to be divided
     * @param d The number that is to be all elements are divided by
     * @return A new array containing all elements of the given array divided by
     * the specific number
     */
    public static double[] div(double[] arr, double d) {
        double[] a = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] / d;
        }
        return a;
    }

    /**
     * Calculates modulus division of all the items in the array by specific
     * number ({@code x[i] % d})
     *
     * @param arr The array in which modulus division of every element is to
     * calculated
     * @param d The number to which all elements are to be divided by
     * @return A new array containing all elements of the given array modulus
     * divided by the specific number
     */
    public static int[] mod(int[] arr, int d) {
        int[] a = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] % d;
        }
        return a;
    }

    /**
     * Calculates modulus division of all the items in the array by specific
     * number ({@code x[i] % d})
     *
     * @param arr The array in which modulus division of every element is to
     * calculated
     * @param d The number to which all elements are to be divided by
     * @return A new array containing all elements of the given array modulus
     * divided by the specific number
     */
    public static long[] mod(long[] arr, long d) {
        long[] a = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] % d;
        }
        return a;
    }

    /**
     * Calculates modulus division of all the items in the array by specific
     * number ({@code x[i] % d})
     *
     * @param arr The array in which modulus division of every element is to
     * calculated
     * @param d The number to which all elements are to be divided by
     * @return A new array containing all elements of the given array modulus
     * divided by the specific number
     */
    public static float[] mod(float[] arr, float d) {
        float[] a = new float[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] % d;
        }
        return a;
    }

    /**
     * Calculates modulus division of all the items in the array by specific
     * number ({@code x[i] % d})
     *
     * @param arr The array in which modulus division of every element is to
     * calculated
     * @param d The number to which all elements are to be divided by
     * @return A new array containing all elements of the given array modulus
     * divided by the specific number
     */
    public static double[] mod(float[] arr, double d) {
        double[] a = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] % d;
        }
        return a;
    }

    /**
     * Calculates modulus division of all the items in the array by specific
     * number ({@code x[i] % d})
     *
     * @param arr The array in which modulus division of every element is to
     * calculated
     * @param d The number to which all elements are to be divided by
     * @return A new array containing all elements of the given array modulus
     * divided by the specific number
     */
    public static double[] mod(double[] arr, double d) {
        double[] a = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] % d;
        }
        return a;
    }

    /**
     * Calculates modulus division of all the items in the array by specific
     * number ({@code x[i] % d})
     *
     * @param arr The array in which modulus division of every element is to
     * calculated
     * @param d The number to which all elements are to be divided by
     * @return A new array containing all elements of the given array modulus
     * divided by the specific number
     */
    public static double[] mod(int[] arr, double d) {
        double[] a = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] % d;
        }
        return a;
    }

    /**
     * Calculates modulus division of all the items in the array by specific
     * number ({@code x[i] % d})
     *
     * @param arr The array in which modulus division of every element is to
     * calculated
     * @param d The number to which all elements are to be divided by
     * @return A new array containing all elements of the given array modulus
     * divided by the specific number
     */
    public static double[] mod(long[] arr, double d) {
        double[] a = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] % d;
        }
        return a;
    }

    /**
     * Raises every element in the array to a specific power
     *
     * @param arr The array whose elements are to be raised to certain power
     * @param d The number to which all elements are to raised to power
     * @return A new array containing all elements of the given array raised to
     * the specific power
     */
    public static double[] pow(int[] arr, double d) {
        double[] a = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = Math.pow(arr[i], d);
        }
        return a;
    }

    /**
     * Raises every element in the array to a specific power
     *
     * @param arr The array whose elements are to be raised to certain power
     * @param d The number to which all elements are to raised to power
     * @return A new array containing all elements of the given array raised to
     * the specific power
     */
    public static double[] pow(long[] arr, double d) {
        double[] a = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = Math.pow(arr[i], d);
        }
        return a;
    }

    /**
     * Raises every element in the array to a specific power
     *
     * @param arr The array whose elements are to be raised to certain power
     * @param d The number to which all elements are to raised to power
     * @return A new array containing all elements of the given array raised to
     * the specific power
     */
    public static double[] pow(float[] arr, double d) {
        double[] a = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = Math.pow(arr[i], d);
        }
        return a;
    }

    /**
     * Raises every element in the array to a specific power
     *
     * @param arr The array whose elements are to be raised to certain power
     * @param d The number to which all elements are to raised to power
     * @return A new array containing all elements of the given array raised to
     * the specific power
     */
    public static double[] pow(double[] arr, double d) {
        double[] a = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = Math.pow(arr[i], d);
        }
        return a;
    }

    /**
     * Calculates absolute value of all elements in the array
     *
     * @param arr The array whose elements absolute value is to be calculated
     * @return A new array containing absolute value of all the elements
     */
    public static int[] abs(int[] arr) {
        int[] ar = new int[arr.length];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = Math.abs(arr[i]);
        }
        return ar;
    }

    /**
     * Calculates absolute value of all elements in the array
     *
     * @param arr The array whose elements absolute value is to be calculated
     * @return A new array containing absolute value of all the elements
     */
    public static long[] abs(long[] arr) {
        long[] ar = new long[arr.length];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = Math.abs(arr[i]);
        }
        return ar;
    }

    /**
     * Calculates absolute value of all elements in the array
     *
     * @param arr The array whose elements absolute value is to be calculated
     * @return A new array containing absolute value of all the elements
     */
    public static float[] abs(float[] arr) {
        float[] ar = new float[arr.length];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = Math.abs(arr[i]);
        }
        return ar;
    }

    /**
     * Calculates absolute value of all elements in the array
     *
     * @param arr The array whose elements absolute value is to be calculated
     * @return A new array containing absolute value of all the elements
     */
    public static double[] abs(double[] arr) {
        double[] ar = new double[arr.length];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = Math.abs(arr[i]);
        }
        return ar;
    }
}
