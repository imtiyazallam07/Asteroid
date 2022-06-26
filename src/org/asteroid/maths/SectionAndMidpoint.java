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
 * It has methods to perform calculation based on section and midpoint formula
 *
 * @author Asteroid Softwares
 */
public class SectionAndMidpoint {

    /**
     * Finds the point on a line
     *
     * @param x1 location of first point on x axis
     * @param y1 location of first point on y axis
     * @param x2 location of second point on x axis
     * @param y2 location of second point on y axis
     * @param r1 size of first section of the given line
     * @param r2 size of first section of the given line
     * @return coordinates of the point. Value in the index 0 of the returned
     * array is x axis and value in the index 1 is y axis of that point
     */
    public static double[] getPoint(double x1, double y1, double x2, double y2, double r1, double r2) {
        double[] point = new double[2];
        point[0] = (r1 * x2 + r2 * x1) / r1 + r2;
        point[1] = (r1 * y2 + r2 * y1) / r1 + r2;
        return point;
    }

    /**
     * Finds the midpoint of a line
     *
     * @param x1 location of first point on x axis
     * @param y1 location of first point on y axis
     * @param x2 location of second point on x axis
     * @param y2 location of second point on y axis
     * @return coordinates of the midpoint. Value in the index 0 of the returned
     * array is x axis and value in the index 1 is y axis of that point
     */
    public static double[] getMidpoint(double x1, double y1, double x2, double y2) {
        return (getPoint(x1, y1, x2, y2, 1, 1));
    }

    /**
     * Finds the slope of the given line
     *
     * @param x1 location of first point on x axis
     * @param y1 location of first point on y axis
     * @param x2 location of second point on x axis
     * @param y2 location of second point on y axis
     * @return slope of the given line
     */
    public static double getSlope(double x1, double y1, double x2, double y2) {
        return (y2 - y1) / (x2 - x1);
    }

    /**
     * Finds the slope of a perpendicular to the given a given line
     *
     * @param x1 location of first point on x axis
     * @param y1 location of first point on y axis
     * @param x2 location of second point on x axis
     * @param y2 location of second point on y axis
     * @return slope of a perpendicular to the given a given line
     */
    public static double getPerpendicularSlope(double x1, double y1, double x2, double y2) {
        return -(1 / getSlope(x1, y1, x2, y2));
    }
}
