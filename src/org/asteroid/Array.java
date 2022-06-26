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

import java.util.ArrayList;

/**
 * Manage and perform operation based on Arrays
 *
 * @author Asteroid Softwares
 */
public class Array {

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
        if (a.length < number)
            throw new OutOfRangeException();
        ArrayList ar = new ArrayList();
        for (int i = 0; i < number; i++)
            ar.add(a[i]);
        String[] array = new String[ar.size()];
        for (int i = 0; i < ar.size(); i++)
            array[i] = (String) ar.get(i);
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
        if (a.length < number)
            throw new OutOfRangeException();
        ArrayList ar = new ArrayList();
        for (int i = 0; i < number; i++)
            ar.add(a[i]);
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
        if (a.length < number)
            throw new OutOfRangeException();
        ArrayList<Byte> ar = new ArrayList();
        for (int i = 0; i < number; i++)
            ar.add(a[i]);
        byte[] array = new byte[ar.size()];
        for (int i = 0; i < ar.size(); i++)
            array[i] = ar.get(i);
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
        if (a.length < number)
            throw new OutOfRangeException();
        ArrayList ar = new ArrayList();
        for (int i = 0; i < number; i++)
            ar.add(a[i]);
        short[] array = new short[ar.size()];
        for (int i = 0; i < ar.size(); i++)
            array[i] = (short) ar.get(i);
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
        if (a.length < number)
            throw new OutOfRangeException();
        ArrayList ar = new ArrayList();
        for (int i = 0; i < number; i++)
            ar.add(a[i]);
        int[] array = new int[ar.size()];
        for (int i = 0; i < ar.size(); i++)
            array[i] = (int) ar.get(i);
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
        if (a.length < number)
            throw new OutOfRangeException();
        ArrayList ar = new ArrayList();
        for (int i = 0; i < number; i++)
            ar.add(a[i]);

        long[] array = new long[ar.size()];
        for (int i = 0; i < ar.size(); i++)
            array[i] = (long) ar.get(i);
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
        if (a.length < number)
            throw new OutOfRangeException();
        ArrayList ar = new ArrayList();
        for (int i = 0; i < number; i++)
            ar.add(a[i]);
        float[] array = new float[ar.size()];
        for (int i = 0; i < ar.size(); i++)
            array[i] = (float) ar.get(i);
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
        if (a.length < number)
            throw new OutOfRangeException();
        ArrayList ar = new ArrayList();
        for (int i = 0; i < number; i++)
            ar.add(a[i]);
        double[] array = new double[ar.size()];
        for (int i = 0; i < ar.size(); i++)
            array[i] = (double) ar.get(i);
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
        if (a.length < number)
            throw new OutOfRangeException();
        ArrayList ar = new ArrayList();
        for (int i = 0; i < number; i++)
            ar.add(a[i]);
        boolean[] array = new boolean[ar.size()];
        for (int i = 0; i < ar.size(); i++)
            array[i] = (boolean) ar.get(i);
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
        if (a.length < number)
            throw new OutOfRangeException();
        ArrayList ar = new ArrayList();
        for (int i = 0; i < number; i++)
            ar.add(a[i]);
        char[] array = new char[ar.size()];
        for (int i = 0; i < ar.size(); i++)
            array[i] = (char) ar.get(i);
        return array;
    }

    /**
     * Finds largest number
     *
     * @param a Array of which largest number is to found
     * @return the largest number in the Array
     */
    public static int max(int[] a) {
        if (a.length == 0)
            throw new EmptyArrayException();
        int max = a[0];
        for (int num : a)
            max = Math.max(max, num);
        return max;
    }

    /**
     * Finds largest number
     *
     * @param a Array of which largest number is to found
     * @return the largest number in the Array
     */
    public static long max(long[] a) {
        if (a.length == 0)
            throw new EmptyArrayException();
        long max = a[0];
        for (long num : a)
            max = Math.max(max, num);
        return max;
    }

    /**
     * Finds largest number
     *
     * @param a Array of which largest number is to found
     * @return the largest number in the Array
     */
    public static double max(double[] a) {
        if (a.length == 0)
            throw new EmptyArrayException();
        double max = a[0];
        for (double num : a)
            max = Math.max(max, num);
        return max;
    }

    /**
     * Finds largest number
     *
     * @param a Array of which largest number is to found
     * @return the largest number in the Array
     */
    public static float max(float[] a) {
        if (a.length == 0)
            throw new EmptyArrayException();
        float max = a[0];
        for (float num : a)
            max = Math.max(max, num);
        return max;
    }

    /**
     * Finds smallest number
     *
     * @param a Array of which largest number is to found
     * @return the smallest number in the Array
     */
    public static int min(int[] a) {
        if (a.length == 0)
            throw new EmptyArrayException();
        int min = a[0];
        for (int num : a)
            min = Math.min(min, num);
        return min;
    }

    /**
     * Finds smallest number
     *
     * @param a Array of which largest number is to found
     * @return the smallest number in the Array
     */
    public static long min(long[] a) {
        if (a.length == 0)
            throw new EmptyArrayException();
        long min = a[0];
        for (long num : a)
            min = Math.min(min, num);
        return min;
    }

    /**
     * Finds largest number
     *
     * @param a Array of which largest number is to found
     * @return the smallest number in the Array
     */
    public static double min(double[] a) {
        if (a.length == 0)
            throw new EmptyArrayException();
        double min = a[0];
        for (double num : a)
            min = Math.min(min, num);
        return min;
    }

    /**
     * Finds smallest number
     *
     * @param a Array of which largest number is to found
     * @return the smallest number in the Array
     */
    public static float min(float[] a) {
        if (a.length == 0)
            throw new EmptyArrayException();
        float min = a[0];
        for (float num : a)
            min = Math.min(min, num);
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
        for (int i = 0; i < arr.length; i++)
            if (arr[i].equals(element)) {
                arr[i] = replacement;
                break;
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
        if (startIndex >= arr.length)
            throw new ArrayIndexOutOfBoundsException();
        for (int i = startIndex; i < arr.length; i++)
            if (arr[i].equals(element)) {
                arr[i] = replacement;
                break;
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
        for (int i = arr.length - 1; i > 0; i--)
            if (arr[i].equals(element)) {
                arr[i] = replacement;
                break;
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
        for (int i = 0; i < arr.length; i++)
            if (arr[i].equals(element))
                arr[i] = replacement;
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
        for (int i = from; i < arr.length; i++)
            if (arr[i].equals(element))
                arr[i] = replacement;
    }

    /**
     * replace the first occurrence of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     */
    public static void replace(byte[] arr, byte element, byte replacement) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
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
        if (startIndex >= arr.length)
            throw new ArrayIndexOutOfBoundsException();
        for (int i = startIndex; i < arr.length; i++)
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
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
        for (int i = arr.length - 1; i > 0; i--)
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
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
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == element)
                arr[i] = replacement;
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
        for (int i = from; i < arr.length; i++)
            if (arr[i] == element)
                arr[i] = replacement;
    }

    /**
     * replace the first occurrence of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     */
    public static void replace(short[] arr, short element, short replacement) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
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
        if (startIndex >= arr.length)
            throw new ArrayIndexOutOfBoundsException();
        for (int i = startIndex; i < arr.length; i++)
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
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
        for (int i = arr.length - 1; i > 0; i--)
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
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
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == element)
                arr[i] = replacement;
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
        for (int i = from; i < arr.length; i++)
            if (arr[i] == element)
                arr[i] = replacement;
    }

    /**
     * replace the first occurrence of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     */
    public static void replace(int[] arr, int element, int replacement) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
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
        if (startIndex >= arr.length)
            throw new ArrayIndexOutOfBoundsException();
        for (int i = startIndex; i < arr.length; i++)
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
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
        for (int i = arr.length - 1; i > 0; i--)
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
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
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == element)
                arr[i] = replacement;
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
        for (int i = from; i < arr.length; i++)
            if (arr[i] == element)
                arr[i] = replacement;
    }

    /**
     * replace the first occurrence of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     */
    public static void replace(long[] arr, long element, long replacement) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
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
        if (startIndex >= arr.length)
            throw new ArrayIndexOutOfBoundsException();
        for (int i = startIndex; i < arr.length; i++)
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
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
        for (int i = arr.length - 1; i > 0; i--)
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
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
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == element)
                arr[i] = replacement;
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
        for (int i = from; i < arr.length; i++)
            if (arr[i] == element)
                arr[i] = replacement;
    }

    /**
     * replace the first occurrence of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     */
    public static void replace(float[] arr, float element, float replacement) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
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
        if (startIndex >= arr.length)
            throw new ArrayIndexOutOfBoundsException();
        for (int i = startIndex; i < arr.length; i++)
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
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
        for (int i = arr.length - 1; i > 0; i--)
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
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
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == element)
                arr[i] = replacement;
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
        for (int i = from; i < arr.length; i++)
            if (arr[i] == element)
                arr[i] = replacement;
    }

    /**
     * replace the first occurrence of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     */
    public static void replace(double[] arr, double element, double replacement) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
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
        if (startIndex >= arr.length)
            throw new ArrayIndexOutOfBoundsException();
        for (int i = startIndex; i < arr.length; i++)
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
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
        for (int i = arr.length - 1; i > 0; i--)
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
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
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == element)
                arr[i] = replacement;
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
        for (int i = from; i < arr.length; i++)
            if (arr[i] == element)
                arr[i] = replacement;
    }

    /**
     * replace the first occurrence of the given value in an array
     *
     * @param arr array in which an item is to be replaced
     * @param element value to replace
     * @param replacement value to be replaced by
     */
    public static void replace(char[] arr, char element, char replacement) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
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
        if (startIndex >= arr.length)
            throw new ArrayIndexOutOfBoundsException();
        for (int i = startIndex; i < arr.length; i++)
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
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
        for (int i = arr.length - 1; i > 0; i--)
            if (arr[i] == element) {
                arr[i] = replacement;
                break;
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
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == element)
                arr[i] = replacement;
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
        for (int i = from; i < arr.length; i++)
            if (arr[i] == element)
                arr[i] = replacement;
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
     * Flip the boolean values in the array
     *
     * @param arr array on which operation is to be performed
     */
    public static void flip(boolean[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = !arr[i];
    }

    /**
     * Flip the boolean values in the array
     *
     * @param arr array on which operation is to be performed
     */
    public static void flip(Boolean[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = !arr[i];
    }
}
