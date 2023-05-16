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

package org.asteroid.mensuration;

/**
 * Helpful in calculating perimeter of a shape
 *
 * @author Imtiyaz Allam
 */
public class Perimeter {

    /**
     * It returns perimeter of rectangle
     *
     * @param length length
     * @param breadth breadth
     * @return Perimeter
     */
    public static double rectangle(double length, double breadth) {
        if (length <= 0 || breadth <= 0) {
            throw new InvalidSideException();
        }
        return (2 * (length + breadth));
    }

    /**
     * It returns perimeter of square
     *
     * @param side side
     * @return Perimeter
     */
    public static double square(double side) {
        if (side <= 0) {
            throw new InvalidSideException();
        }
        return (4 * side);
    }

    /**
     * It returns perimeter of circle
     *
     * @param radius radius
     * @return Perimeter
     */
    public static double circle(double radius) {
        if (radius <= 0) {
            throw new InvalidSideException();
        }
        return (2 * Math.PI * radius);
    }

    /**
     * It returns perimeter of scalene triangle
     *
     * @param s1 first side
     * @param s2 second side
     * @param s3 third side
     * @return Perimeter
     */
    public static double sTriangle(double s1, double s2, double s3) {
        if (s1 <= 0 || s2 <= 0 || s3 <= 0) {
            throw new InvalidSideException();
        }
        return (s1 + s2 + s3);
    }

    /**
     * It returns perimeter of parallelogram
     *
     * @param length length
     * @param breadth breadth
     * @return Perimeter
     */
    public static double parallelogram(double length, double breadth) {
        if (length <= 0 || breadth <= 0) {
            throw new InvalidSideException();
        }
        return (2 * (length + breadth));
    }

    /**
     * It returns perimeter of rhombus
     *
     * @param side side
     * @return Perimeter
     */
    public static double rhombus(double side) {
        return (4 * side);
    }

    /**
     * It returns perimeter of trapezium
     *
     * @param parallelSide1 first parallel side
     * @param parallelSide2 second parallel side
     * @param nonParallelSide1 first non-parallel side
     * @param nonParallelSide2 second non-parallel side
     * @return Perimeter
     */
    public static double trapezium(double parallelSide1, double parallelSide2, double nonParallelSide1, double nonParallelSide2) {
        if (parallelSide1 <= 0 || parallelSide2 <= 0 || nonParallelSide1 <= 0 || nonParallelSide2 <= 0) {
            throw new InvalidSideException();
        }
        return (parallelSide1 + parallelSide2 + nonParallelSide1 + nonParallelSide2);
    }

    /**
     * It returns perimeter of equlateral pentagon
     *
     * @param side side
     * @return Perimeter
     */
    public static double ePentagon(double side) {
        if (side <= 0) {
            throw new InvalidSideException();
        }
        return (5 * side);
    }

    /**
     * It returns perimeter of equlateral hexagon
     *
     * @param side side
     * @return Perimeter
     */
    public static double eHexagon(double side) {
        if (side <= 0) {
            throw new InvalidSideException();
        }
        return (side * 8);
    }

    /**
     * It returns perimeter of equlateral shape
     *
     * @param numOfSide Number of side of an equlateral shape
     * @param sideSize side
     * @return Perimeter
     */
    public static double eShape(int numOfSide, double sideSize) {
        if (numOfSide <= 0 || sideSize <= 0) {
            throw new InvalidSideException();
        }
        return (sideSize * numOfSide);
    }

    /**
     * It returns perimeter of equlateral triangle
     *
     * @param side side
     * @return Perimeter
     */
    public static double eTriangle(double side) {
        if (side <= 0) {
            throw new InvalidSideException();
        }
        return (side * 3);
    }

    /**
     * It returns perimeter of isosceles triangle
     *
     * @param side side
     * @param base base
     * @return Perimeter
     */
    public static double iTriangle(double side, double base) {
        if (side <= 0 || side <= 0) {
            throw new InvalidSideException();
        }
        return ((side * 2) + base);
    }
}
