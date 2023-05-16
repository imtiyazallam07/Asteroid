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
package org.asteroid.math;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.asteroid.Array;

/**
 * Contains functions for statistical calculation
 *
 * @author Imtiyaz Allam
 */
public class Statistics {

    /**
     * Generates cumulative frequency of given frequency
     *
     * @param f frequency whose cumulative frequency is to be calculated
     * @return cumulative frequency of the given frequency data
     */
    public static int[] cumulativeFrequency(int[] f) {
        int[] cf = new int[f.length];
        cf[0] = f[0];
        for (int i = 1; i < cf.length; i++) {
            cf[i] = cf[i - 1] + f[i];
        }
        return cf;
    }

    /**
     * Calculates mean of given data
     *
     * @param x Data whose mean is to be calculated
     * @return Mean of given data
     */
    public static double mean(int[] x) {
        return (Array.sum(x) * 1.0) / x.length;
    }

    /**
     * Calculates mean of given data
     *
     * @param x Data whose mean is to be calculated
     * @return Mean of given data
     */
    public static double mean(long[] x) {
        return (Array.sum(x) * 1.0) / x.length;
    }

    /**
     * Calculates mean of given data
     *
     * @param x Data whose mean is to be calculated
     * @return Mean of given data
     */
    public static double mean(float[] x) {
        return (Array.sum(x)) / x.length;
    }

    /**
     * Calculates mean of given data
     *
     * @param x Data whose mean is to be calculated
     * @return Mean of given data
     */
    public static double mean(double[] x) {
        return (Array.sum(x)) / x.length;
    }

    /**
     * Calculates mean of given data
     *
     * @param x Data whose mean is to be calculated
     * @param f Frequency of the given data
     * @return Mean of given data
     */
    public static double mean(int[] x, int[] f) {
        if (x.length != f.length) {
            throw new InvalidFrequencyException("The length of frequency array doesn't match with class mark array");
        }
        int add = 0;
        for (int i = 0; i < f.length; i++) {
            add += f[i] * x[i];
        }
        return (add * 1.0) / Array.sum(f);
    }

    /**
     * Calculates mean of given data
     *
     * @param x Data whose mean is to be calculated
     * @param f Frequency of the given data
     * @return Mean of given data
     */
    public static double mean(double[] x, int[] f) {
        if (x.length != f.length) {
            throw new InvalidFrequencyException("The length of frequency array doesn't match with class mark array");
        }
        int add = 0;
        for (int i = 0; i < f.length; i++) {
            add += f[i] * x[i];
        }
        return add / Array.sum(f);
    }

    /**
     * Calculates mean of given data
     *
     * @param x Data whose mean is to be calculated
     * @param f Frequency of the given data
     * @return Mean of given data
     */
    public static double mean(long[] x, int[] f) {
        if (x.length != f.length) {
            throw new InvalidFrequencyException("The length of frequency array doesn't match with class mark array");
        }
        int add = 0;
        for (int i = 0; i < f.length; i++) {
            add += f[i] * x[i];
        }
        return add / Array.sum(f);
    }

    /**
     * Calculates mean of given data
     *
     * @param x Data whose mean is to be calculated
     * @param f Frequency of the given data
     * @return Mean of given data
     */
    public static double mean(float[] x, int[] f) {
        if (x.length != f.length) {
            throw new InvalidFrequencyException("The length of frequency array doesn't match with class mark array");
        }
        int add = 0;
        for (int i = 0; i < f.length; i++) {
            add += f[i] * x[i];
        }
        return add / Array.sum(f);
    }

    /**
     * Calculates median of given data
     *
     * @param x Data whose median is to be calculated
     * @return Median of given data
     */
    public static double median(int[] x) {
        double median;
        if (Numbers.isEven(x.length)) {
            median = x[(x.length + 1) / 2];
        } else {
            median = (x[(x.length) / 2] + x[(x.length + 2) / 2]) / 2;
        }
        return median;
    }

    /**
     * Calculates median of given data
     *
     * @param x Data whose median is to be calculated
     * @return Median of given data
     */
    public static double median(long[] x) {
        double median;
        if (Numbers.isEven(x.length)) {
            median = x[(x.length + 1) / 2];
        } else {
            median = (x[(x.length) / 2] + x[(x.length + 2) / 2]) / 2;
        }
        return median;
    }

    /**
     * Calculates median of given data
     *
     * @param x Data whose median is to be calculated
     * @return Median of given data
     */
    public static double median(float[] x) {
        double median;
        if (Numbers.isEven(x.length)) {
            median = x[(x.length + 1) / 2];
        } else {
            median = (x[(x.length) / 2] + x[(x.length + 2) / 2]) / 2;
        }
        return median;
    }

    /**
     * Calculates median of given data
     *
     * @param x Data whose median is to be calculated
     * @return Median of given data
     */
    public static double median(double[] x) {
        double median;
        if (Numbers.isEven(x.length)) {
            median = x[(x.length + 1) / 2];
        } else {
            median = (x[(x.length) / 2] + x[(x.length + 2) / 2]) / 2;
        }
        return median;
    }

    /**
     * Calculates median of given data
     *
     * @param x Data whose median is to be calculated
     * @param f Frequency of the given data
     * @return Median of given data
     */
    public static double median(int[] x, int[] f) {
        double median = x[0];
        int[] cf = cumulativeFrequency(f);
        double obs = cf[cf.length - 1] / 2.0 + 1;
        for (int i = 1; i < cf.length; i++) {
            if (cf[i] >= obs && cf[i - 1] < obs) {
                median = x[i];
            }
        }
        return median;
    }

    /**
     * Calculates median of given data
     *
     * @param x Data whose median is to be calculated
     * @param f Frequency of the given data
     * @return Median of given data
     */
    public static double median(long[] x, int[] f) {
        double median = x[0];
        int[] cf = cumulativeFrequency(f);
        double obs = cf[cf.length - 1] / 2.0 + 1;
        for (int i = 1; i < cf.length; i++) {
            if (cf[i] >= obs && cf[i - 1] < obs) {
                median = x[i];
            }
        }
        return median;
    }

    /**
     * Calculates median of given data
     *
     * @param x Data whose median is to be calculated
     * @param f Frequency of the given data
     * @return Median of given data
     */
    public static double median(float[] x, int[] f) {
        double median = x[0];
        int[] cf = cumulativeFrequency(f);
        double obs = cf[cf.length - 1] / 2.0 + 1;
        for (int i = 1; i < cf.length; i++) {
            if (cf[i] >= obs && cf[i - 1] < obs) {
                median = x[i];
            }
        }
        return median;
    }

    /**
     * Calculates median of given data
     *
     * @param x Data whose median is to be calculated
     * @param f Frequency of the given data
     * @return Median of given data
     */
    public static double median(double[] x, int[] f) {
        double median = x[0];
        int[] cf = cumulativeFrequency(f);
        double obs = cf[cf.length - 1] / 2.0 + 1;
        for (int i = 1; i < cf.length; i++) {
            if (cf[i] >= obs && cf[i - 1] < obs) {
                median = x[i];
            }
        }
        return median;
    }

    /**
     * Finds the mode of the given data
     *
     * @param x Data whose mode is to be found
     * @return Mode(s) of given data
     */
    public static int[] mode(int[] x) {
        ArrayList<Integer> modes = new ArrayList<>();
        HashMap<Integer, Integer> f = new HashMap<>();
        for (int i = 0; i < x.length; i++) {
            int value = x[i];
            if (f.containsKey(value)) {
                f.put(value, f.get(value) + 1);
            } else {
                f.put(value, 1);
            }
        }

        int max = 0;
        for (Map.Entry<Integer, Integer> entry : f.entrySet()) {
            int value = entry.getKey();
            int fr = entry.getValue();
            if (fr > max) {
                modes.clear();
                modes.add(value);
                max = fr;
            } else if (fr == max) {
                modes.add(value);
            }
        }
        int[] mode = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            mode[i] = modes.get(i);
        }
        return mode;
    }

    /**
     * Finds the mode of the given data
     *
     * @param x Data whose mode is to be found
     * @return Mode(s) of given data
     */
    public static long[] mode(long[] x) {
        ArrayList<Long> modes = new ArrayList<>();
        HashMap<Long, Integer> f = new HashMap<>();
        for (int i = 0; i < x.length; i++) {
            long value = x[i];
            if (f.containsKey(value)) {
                f.put(value, f.get(value) + 1);
            } else {
                f.put(value, 1);
            }
        }

        int max = 0;
        for (Map.Entry<Long, Integer> entry : f.entrySet()) {
            long value = entry.getKey();
            int fr = entry.getValue();
            if (fr > max) {
                modes.clear();
                modes.add(value);
                max = fr;
            } else if (fr == max) {
                modes.add(value);
            }
        }
        long[] mode = new long[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            mode[i] = modes.get(i);
        }
        return mode;
    }

    /**
     * Finds the mode of the given data
     *
     * @param x Data whose mode is to be found
     * @return Mode(s) of given data
     */
    public static float[] mode(Float[] x) {
        ArrayList<Float> modes = new ArrayList<>();
        HashMap<Float, Integer> f = new HashMap<>();
        for (Float value : x) {
            if (f.containsKey(value)) {
                f.put(value, f.get(value) + 1);
            } else {
                f.put(value, 1);
            }
        }

        int max = 0;
        for (Map.Entry<Float, Integer> entry : f.entrySet()) {
            float value = entry.getKey();
            int fr = entry.getValue();
            if (fr > max) {
                modes.clear();
                modes.add(value);
                max = fr;
            } else if (fr == max) {
                modes.add(value);
            }
        }
        float[] mode = new float[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            mode[i] = modes.get(i);
        }
        return mode;
    }

    /**
     * Finds the mode of the given data
     *
     * @param x Data whose mode is to be found
     * @return Mode(s) of given data
     */
    public static double[] mode(double[] x) {
        ArrayList<Double> modes = new ArrayList<>();
        HashMap<Double, Integer> f = new HashMap<>();
        for (int i = 0; i < x.length; i++) {
            double value = x[i];
            if (f.containsKey(value)) {
                f.put(value, f.get(value) + 1);
            } else {
                f.put(value, 1);
            }
        }

        int max = 0;
        for (Map.Entry<Double, Integer> entry : f.entrySet()) {
            double value = entry.getKey();
            int fr = entry.getValue();
            if (fr > max) {
                modes.clear();
                modes.add(value);
                max = fr;
            } else if (fr == max) {
                modes.add(value);
            }
        }
        double[] mode = new double[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            mode[i] = modes.get(i);
        }
        return mode;
    }

    /**
     * Finds the mode of the given data
     *
     * @param x Data whose mode is to be found
     * @param f Frequency of the given data
     * @return Mode(s) of given data
     */
    public static int[] mode(int[] x, int[] f) {
        ArrayList<Integer> modes = new ArrayList<>();
        if (x.length != f.length) {
            throw new InvalidFrequencyException("The length of frequency array doesn't match with class mark array");
        }
        int max = 0;
        for (int i = 0; i < f.length; i++) {
            if (f[i] > max) {
                modes.clear();
                modes.add(x[i]);
                max = f[i];
            } else if (f[i] == max) {
                modes.add(x[i]);
            }
        }
        int[] mode = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            mode[i] = modes.get(i);
        }
        return mode;
    }

    /**
     * Finds the mode of the given data
     *
     * @param x Data whose mode is to be found
     * @param f Frequency of the given data
     * @return Mode(s) of given data
     */
    public static long[] mode(long[] x, int[] f) {
        ArrayList<Long> modes = new ArrayList<>();
        if (x.length != f.length) {
            throw new InvalidFrequencyException("The length of frequency array doesn't match with class mark array");
        }
        int max = 0;
        for (int i = 0; i < f.length; i++) {
            if (f[i] > max) {
                modes.clear();
                modes.add(x[i]);
                max = f[i];
            } else if (f[i] == max) {
                modes.add(x[i]);
            }
        }
        long[] mode = new long[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            mode[i] = modes.get(i);
        }
        return mode;
    }

    /**
     * Finds the mode of the given data
     *
     * @param x Data whose mode is to be found
     * @param f Frequency of the given data
     * @return Mode(s) of given data
     */
    public static float[] mode(float[] x, int[] f) {
        ArrayList<Float> modes = new ArrayList<>();
        if (x.length != f.length) {
            throw new InvalidFrequencyException("The length of frequency array doesn't match with class mark array");
        }
        int max = 0;
        for (int i = 0; i < f.length; i++) {
            if (f[i] > max) {
                modes.clear();
                modes.add(x[i]);
                max = f[i];
            } else if (f[i] == max) {
                modes.add(x[i]);
            }
        }
        float[] mode = new float[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            mode[i] = modes.get(i);
        }
        return mode;
    }

    /**
     * Finds the mode of the given data
     *
     * @param x Data whose mode is to be found
     * @param f Frequency of the given data
     * @return Mode(s) of given data
     */
    public static double[] mode(double[] x, int[] f) {
        ArrayList<Double> modes = new ArrayList<>();
        if (x.length != f.length) {
            throw new InvalidFrequencyException("The length of frequency array doesn't match with class mark array");
        }
        int max = 0;
        for (int i = 0; i < f.length; i++) {
            if (f[i] > max) {
                modes.clear();
                modes.add(x[i]);
                max = f[i];
            } else if (f[i] == max) {
                modes.add(x[i]);
            }
        }
        double[] mode = new double[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            mode[i] = modes.get(i);
        }
        return mode;
    }

    /**
     * Calculate mean deviation (about mean) of given data
     *
     * @param x Data whose mean deviation is to be calculated
     * @return Mean deviation about mean of given data
     */
    public static double meanDeviation(int[] x) {
        return Array.sum(Array.abs(Array.sub(x, mean(x)))) / x.length;
    }

    /**
     * Calculate mean deviation (about mean) of given data
     *
     * @param x Data whose mean deviation is to be calculated
     * @return Mean deviation about mean of given data
     */
    public static double meanDeviation(long[] x) {
        return Array.sum(Array.abs(Array.sub(x, mean(x)))) / x.length;
    }

    /**
     * Calculate mean deviation (about mean) of given data
     *
     * @param x Data whose mean deviation is to be calculated
     * @return Mean deviation about mean of given data
     */
    public static double meanDeviation(float[] x) {
        return Array.sum(Array.abs(Array.sub(x, mean(x)))) / x.length;
    }

    /**
     * Calculate mean deviation (about mean) of given data
     *
     * @param x Data whose mean deviation is to be calculated
     * @return Mean deviation about mean of given data
     */
    public static double meanDeviation(double[] x) {
        return Array.sum(Array.abs(Array.sub(x, mean(x)))) / x.length;
    }

    /**
     * Calculate mean deviation (about mean) of given data
     *
     * @param x Data whose mean deviation is to be calculated
     * @param f Frequency of given data
     * @return Mean deviation about mean of given data
     */
    public static double meanDeviation(int[] x, int[] f) {
        if (x.length != f.length) {
            throw new InvalidFrequencyException("The length of frequency array doesn't match with class mark array");
        }
        double[] a = new double[f.length];
        double[] dev = Array.abs(Array.sub(x, mean(x, f)));
        for (int i = 0; i < a.length; i++) {
            a[i] = dev[i] * f[i];
        }
        return Array.sum(a) / Array.sum(f);
    }

    /**
     * Calculate mean deviation (about mean) of given data
     *
     * @param x Data whose mean deviation is to be calculated
     * @param f Frequency of given data
     * @return Mean deviation about mean of given data
     */
    public static double meanDeviation(long[] x, int[] f) {
        if (x.length != f.length) {
            throw new InvalidFrequencyException("The length of frequency array doesn't match with class mark array");
        }
        double[] a = new double[f.length];
        double[] dev = Array.sub(x, mean(x, f));
        for (int i = 0; i < a.length; i++) {
            a[i] = dev[i] * f[i];
        }
        return Array.sum(a) / Array.sum(f);
    }

    /**
     * Calculate mean deviation (about mean) of given data
     *
     * @param x Data whose mean deviation is to be calculated
     * @param f Frequency of given data
     * @return Mean deviation about mean of given data
     */
    public static double meanDeviation(float[] x, int[] f) {
        if (x.length != f.length) {
            throw new InvalidFrequencyException("The length of frequency array doesn't match with class mark array");
        }
        double[] a = new double[f.length];
        double[] dev = Array.sub(x, mean(x, f));
        for (int i = 0; i < a.length; i++) {
            a[i] = dev[i] * f[i];
        }
        return Array.sum(a) / Array.sum(f);
    }

    /**
     * Calculate mean deviation (about mean) of given data
     *
     * @param x Data whose mean deviation is to be calculated
     * @param f Frequency of given data
     * @return Mean deviation about mean of given data
     */
    public static double meanDeviation(double[] x, int[] f) {
        if (x.length != f.length) {
            throw new InvalidFrequencyException("The length of frequency array doesn't match with class mark array");
        }
        double[] a = new double[f.length];
        double[] dev = Array.sub(x, mean(x, f));
        for (int i = 0; i < a.length; i++) {
            a[i] = dev[i] * f[i];
        }
        return Array.sum(a) / Array.sum(f);
    }

    /**
     * Calculate variance of given data
     *
     * @param x Data whose variance is to be calculated
     * @return Variance of given data
     */
    public static double variance(int[] x) {
        return Array.sum(Array.pow(Array.sub(x, mean(x)), 2)) / x.length;
    }

    /**
     * Calculate variance of given data
     *
     * @param x Data whose variance is to be calculated
     * @return Variance of given data
     */
    public static double variance(long[] x) {
        return Array.sum(Array.pow(Array.sub(x, mean(x)), 2)) / x.length;
    }

    /**
     * Calculate variance of given data
     *
     * @param x Data whose variance is to be calculated
     * @return Variance of given data
     */
    public static double variance(float[] x) {
        return Array.sum(Array.pow(Array.sub(x, mean(x)), 2)) / x.length;
    }

    /**
     * Calculate variance of given data
     *
     * @param x Data whose variance is to be calculated
     * @return Variance of given data
     */
    public static double variance(double[] x) {
        return Array.sum(Array.pow(Array.sub(x, mean(x)), 2)) / x.length;
    }

    /**
     * Calculate variance of given data
     *
     * @param x Data whose variance is to be calculated
     * @param f Frequency of given data
     * @return Variance of given data
     */
    public static double variance(int[] x, int[] f) {
        if (x.length != f.length) {
            throw new InvalidFrequencyException("The length of frequency array doesn't match with class mark array");
        }
        double mean = mean(x, f);
        double[] a = Array.pow(Array.sub(x, mean), 2);
        double[] b = new double[x.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = f[i] * a[i];
        }
        return Array.sum(b) / Array.sum(f);
    }

    /**
     * Calculate variance of given data
     *
     * @param x Data whose variance is to be calculated
     * @param f Frequency of given data
     * @return Variance of given data
     */
    public static double variance(long[] x, int[] f) {
        if (x.length != f.length) {
            throw new InvalidFrequencyException("The length of frequency array doesn't match with class mark array");
        }
        double mean = mean(x, f);
        double[] a = Array.pow(Array.sub(x, mean), 2);
        double[] b = new double[x.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = f[i] * a[i];
        }
        return Array.sum(b) / Array.sum(f);
    }

    /**
     * Calculate variance of given data
     *
     * @param x Data whose variance is to be calculated
     * @param f Frequency of given data
     * @return Variance of given data
     */
    public static double variance(float[] x, int[] f) {
        if (x.length != f.length) {
            throw new InvalidFrequencyException("The length of frequency array doesn't match with class mark array");
        }
        double mean = mean(x, f);
        double[] a = Array.pow(Array.sub(x, mean), 2);
        double[] b = new double[x.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = f[i] * a[i];
        }
        return Array.sum(b) / Array.sum(f);
    }

    /**
     * Calculate variance of given data
     *
     * @param x Data whose variance is to be calculated
     * @param f Frequency of given data
     * @return Variance of given data
     */
    public static double variance(double[] x, int[] f) {
        if (x.length != f.length) {
            throw new InvalidFrequencyException("The length of frequency array doesn't match with class mark array");
        }
        double mean = mean(x, f);
        double[] a = Array.pow(Array.sub(x, mean), 2);
        double[] b = new double[x.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = f[i] * a[i];
        }
        return Array.sum(b) / Array.sum(f);
    }

    /**
     * Calculate standard deviation of given data
     *
     * @param x Data whose standard deviation is to be calculated
     * @return Standard Deviation of given data
     */
    public static double standardDeviation(int[] x) {
        return Math.sqrt(variance(x));
    }

    /**
     * Calculate standard deviation of given data
     *
     * @param x Data whose standard deviation is to be calculated
     * @return Standard Deviation of given data
     */
    public static double standardDeviation(long[] x) {
        return Math.sqrt(variance(x));
    }

    /**
     * Calculate standard deviation of given data
     *
     * @param x Data whose standard deviation is to be calculated
     * @return Standard Deviation of given data
     */
    public static double standardDeviation(float[] x) {
        return Math.sqrt(variance(x));
    }

    /**
     * Calculate standard deviation of given data
     *
     * @param x Data whose standard deviation is to be calculated
     * @return Standard Deviation of given data
     */
    public static double standardDeviation(double[] x) {
        return Math.sqrt(variance(x));
    }

    /**
     * Calculate standard deviation of given data
     *
     * @param x Data whose standard deviation is to be calculated
     * @param f Frequency of given data
     * @return Standard Deviation of given data
     */
    public static double standardDeviation(int[] x, int[] f) {
        return Math.sqrt(variance(x, f));
    }

    /**
     * Calculate standard deviation of given data
     *
     * @param x Data whose standard deviation is to be calculated
     * @param f Frequency of given data
     * @return Standard Deviation of given data
     */
    public static double standardDeviation(long[] x, int[] f) {
        return Math.sqrt(variance(x, f));
    }

    /**
     * Calculate standard deviation of given data
     *
     * @param x Data whose standard deviation is to be calculated
     * @param f Frequency of given data
     * @return Standard Deviation of given data
     */
    public static double standardDeviation(float[] x, int[] f) {
        return Math.sqrt(variance(x, f));
    }

    /**
     * Calculate standard deviation of given data
     *
     * @param x Data whose standard deviation is to be calculated
     * @param f Frequency of given data
     * @return Standard Deviation of given data
     */
    public static double standardDeviation(double[] x, int[] f) {
        return Math.sqrt(variance(x, f));
    }

    /**
     * Calculate coefficient of variation of given data
     *
     * @param x Data whose coefficient of variation is to be calculated
     * @return Coefficient of variation of given data
     */
    public static double coefficientOfVariation(int[] x) {
        return standardDeviation(x) / mean(x) * 100;
    }

    /**
     * Calculate coefficient of variation of given data
     *
     * @param x Data whose coefficient of variation is to be calculated
     * @return Coefficient of variation of given data
     */
    public static double coefficientOfVariation(long[] x) {
        return standardDeviation(x) / mean(x) * 100;
    }

    /**
     * Calculate coefficient of variation of given data
     *
     * @param x Data whose coefficient of variation is to be calculated
     * @return Coefficient of variation of given data
     */
    public static double coefficientOfVariation(float[] x) {
        return standardDeviation(x) / mean(x) * 100;
    }

    /**
     * Calculate coefficient of variation of given data
     *
     * @param x Data whose coefficient of variation is to be calculated
     * @return Coefficient of variation of given data
     */
    public static double coefficientOfVariation(double[] x) {
        return standardDeviation(x) / mean(x) * 100;
    }

    /**
     * Calculate coefficient of variation of given data
     *
     * @param x Data whose coefficient of variation is to be calculated
     * @param f Frequency of given data
     * @return Coefficient of variation of given data
     */
    public static double coefficientOfVariation(int[] x, int[] f) {
        return standardDeviation(x, f) / mean(x, f) * 100;
    }

    /**
     * Calculate coefficient of variation of given data
     *
     * @param x Data whose coefficient of variation is to be calculated
     * @param f Frequency of given data
     * @return Coefficient of variation of given data
     */
    public static double coefficientOfVariation(long[] x, int[] f) {
        return standardDeviation(x, f) / mean(x, f) * 100;
    }

    /**
     * Calculate coefficient of variation of given data
     *
     * @param x Data whose coefficient of variation is to be calculated
     * @param f Frequency of given data
     * @return Coefficient of variation of given data
     */
    public static double coefficientOfVariation(float[] x, int[] f) {
        return standardDeviation(x, f) / mean(x, f) * 100;
    }

    /**
     * Calculate coefficient of variation of given data
     *
     * @param x Data whose coefficient of variation is to be calculated
     * @param f Frequency of given data
     * @return Coefficient of variation of given data
     */
    public static double coefficientOfVariation(double[] x, int[] f) {
        return standardDeviation(x, f) / mean(x, f) * 100;
    }
}
