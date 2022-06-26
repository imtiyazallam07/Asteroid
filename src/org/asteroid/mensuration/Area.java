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

package org.asteroid.mensuration;

/**
 * Helpful in calculating area
 *
 * @author Asteroid Softwares
 */
public final class Area {

    /**
     * It returns the area of rectangle
     *
     * @param length Length
     * @param breadth breadth
     * @return Area
     */
    public static double rectangle(double length, double breadth) {
        if (length <= 0 || breadth <= 0) {
            throw new InvalidSideException();
        }
        return (length * breadth);
    }

    /**
     * It returns the area of square
     *
     * @param side side
     * @return Area
     */
    public static double square(double side) {
        if (side <= 0) {
            throw new InvalidSideException();
        }
        return (side * side);
    }

    /**
     * It returns the area of circle
     *
     * @param radius radius
     * @return Area
     */
    public static double circle(double radius) {
        if (radius <= 0) {
            throw new InvalidSideException();
        }
        return Math.PI * radius * radius;
    }

    /**
     * It returns the area of scalene triangle
     *
     * @param side1 first side
     * @param side2 second side
     * @param side3 third side
     * @return Area
     */
    public static double sTriangle(double side1, double side2, double side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new InvalidSideException();
        }
        return (Math.sqrt(((side1 + side2 + side3) / 2) * (((side1 + side2 + side3) / 2) - side1) * (((side1 + side2 + side3) / 2) - side2)
                * (((side1 + side2 + side3) / 2) - side3)));
    }

    /**
     * It returns the area of triangle using its base and altitude
     *
     * @param altitude height
     * @param base base
     * @return Area
     */
    public static double triangle(double altitude, double base) {
        if (base <= 0 || altitude <= 0) {
            throw new InvalidSideException();
        }
        return ((1.0 / 2.0) * base * altitude);
    }

    /**
     * It returns the area of parallelogram
     *
     * @param length length
     * @param breadth breadth
     * @return Area
     */
    public static double parallelogram(double length, double breadth) {
        if (length <= 0 || breadth <= 0) {
            throw new InvalidSideException();
        }
        return (length * breadth);
    }

    /**
     * It returns the area of rhombus
     *
     * @param diagonal1 first diagonal
     * @param diagonal2 second diagonal
     * @return Area
     */
    public static double rhombus(double diagonal1, double diagonal2) {
        if (diagonal1 <= 0 || diagonal2 <= 0) {
            throw new InvalidSideException();
        }
        return ((1.0 / 2.0) * diagonal1 * diagonal2);
    }

    /**
     * It returns the area of trapezium
     *
     * @param parallelSide1 first parallel side
     * @param parallelSide2 send parallel side
     * @param altitude height
     * @return Area
     */
    public static double trapezium(double parallelSide1, double parallelSide2, double altitude) {
        if (parallelSide1 <= 0 || parallelSide2 <= 0 || altitude <= 0) {
            throw new InvalidSideException();
        }
        return (0.5 * (parallelSide1 + parallelSide2) * altitude);
    }

    /**
     * It returns the area of equlateral pentagon
     *
     * @param side side
     * @return Area
     */
    public static double ePentagon(double side) {
        if (side <= 0) {
            throw new InvalidSideException();
        }
        return (5.0 / 2.0) * side * side;
    }

    /**
     * It returns the area of equlateral Hexagon
     *
     * @param side side
     * @return Area
     */
    public static double eHexagon(double side) {
        if (side <= 0) {
            throw new InvalidSideException();
        }
        return (((3 * (float) Math.sqrt(3)) * side * 2) / 2);
    }

    /**
     * It returns the area of equlateral triangle
     *
     * @param side side
     * @return Area
     */
    public static double eTriangle(double side) {
        if (side <= 0) {
            throw new InvalidSideException();
        }
        return ((Math.sqrt(3) / 4) * Math.pow(side, 2));
    }

    /**
     * It returns the area of isosceles triangle
     *
     * @param side side
     * @param base base
     * @return Area
     */
    public static double iTriangle(double side, double base) {
        if (side <= 0 || side <= 0) {
            throw new InvalidSideException();
        }
        return ((1.0 / 4) * base * Math.sqrt(4 * Math.pow(side, 2) - Math.pow(base, 2)));
    }
}
