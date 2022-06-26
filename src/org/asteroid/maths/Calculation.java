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

package org.asteroid.maths;

/**
 * Perform calculation like percentage and average
 *
 * @author Asteroid Softwares
 */
public class Calculation extends Numbers {

    /**
     * It calculates the percentage. Here args is the array that is to be given
     * example {1, 2, 3, 4, 5} sum of data given in this array is calculated and
     * stored in a variable <b>sum</b>. Here full is the total sum of which
     * percentage is to be calculated <u>sum</u> / <u>full</u> * 100
     *
     * @param args The numbers of which the percentage is to be calculated
     * @param full The total sum of full from which the percentage is to be
     * calculated
     * @return Percentage
     */
    public static double caluclatePercentage(double full, double... args) {
        double sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum = sum + args[i];
        }
        return sum / full * 100;
    }

    /**
     * It calculates the percentage. Here args is the array that is to be given
     * example {1, 2, 3, 4, 5} sum of data given in this array is calculated and
     * stored in a variable <b>sum</b>. Here full is the array containing the
     * full value of each element in args array.
     *
     * @param args The numbers of which the percentage is to be calculated
     * @param full The total sum of full from which the percentage is to be
     * calculated
     * @return Percentage
     */
    public static double caluclatePercentage(double[] full, double[] args) {
        double sum1 = 0, sum2 = 0;
        for (int i = 0; i < args.length; i++) {
            sum1 = sum1 + args[i];
        }
        for (int i = 0; i < full.length; i++) {
            sum2 = sum2 + full[i];
        }
        return sum1 / sum2 * 100;
    }

    /**
     * It calculates the percentage. Here total is the sum of array that
     * calculated by the user or programmer and given as parameter Here full is
     * the total sum of which percentage is to be calculated <u>sum</u> /
     * <u>full</u> * 100
     *
     * @param total sum of all elements
     * @param full The total sum of full from which the percentage is to be
     * calculated
     * @return Average
     */
    public static double calculatePercentage(double total, double full) {
        return total / full * 100;
    }

    /**
     * It calculates the average here args is an array. The elements of args are
     * those on among which average is calculated. Average is calculated on the
     * basis of number of elements presents in the given array.
     *
     * @param args Elements
     * @return Average
     */
    public static double calculateAverage(double... args) {
        double sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum = sum + args[i];
        }
        return sum / args.length;
    }

    /**
     * It returns the average. Here <b>total</b> is the sum of array of data
     * given by the user or programmer. Here <b>noOfElements</b> is the total
     * number of elements in the array of which average is to be calculated.
     *
     * @param total Sum of all the elements
     * @param noOfElements Total number of elements
     * @return total / noOfElements
     */
    public static double calculateAverage(double total, int noOfElements) {
        return total / noOfElements;
    }

}
