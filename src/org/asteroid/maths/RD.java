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
 *
 * @author Asteroid softwares
 */
public class RD {

    public static boolean PER_YEAR = true;
    public static boolean PER_MONTH = true;

    /**
     * Calculates interest
     *
     * @param installment monthly installment
     * @param rate rate per annum
     * @param time time in year
     * @return interest correct to 2 decimal places
     */
    public static double getInterest(double installment, double rate, double time) {
        time = time * 12;
        return ((int) (((installment * time * (time - 1) * rate) / 2 * 12 * 100) * 100)) / 100.0;
    }

    /**
     * calculate amount
     *
     * @param installment monthly installment
     * @param rate rate per annum
     * @param time time in year
     * @return amount correct to 2 decimal places
     */
    public static double getAmount(double installment, double rate, double time) {
        double total = installment * time * 12;
        return total + getInterest(installment, rate, time);
    }

    /**
     * calculate interest
     *
     * @param installment monthly installment
     * @param rate rate per annum
     * @param time time value
     * @param isYear unit of time. Note It only applies to time not the
     * installment
     * @return
     */
    public static double getInterest(double installment, double rate, double time, boolean isYear) {
        if (!isYear) {
            time = time / 12;
        }

        return getInterest(installment, rate, time);
    }

    /**
     * calculate interest
     *
     * @param installment monthly installment
     * @param rate rate per annum
     * @param time time value
     * @param isYear unit of time. Note It only applies to time not the
     * installment. Installation is always in months
     * @return
     */
    public static double getAmount(double installment, double rate, double time, boolean isYear) {
        if (!isYear) {
            time = time / 12;
        }
        return getAmount(installment, rate, time);
    }
}
