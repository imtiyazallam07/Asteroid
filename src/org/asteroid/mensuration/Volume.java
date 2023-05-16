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
 * Helpful in finding volume of a shape
 *
 * @author Imtiyaz Allam
 */
public class Volume {

    /**
     * It return the surface area of cube
     *
     * @param side side
     * @return Volume
     */
    public static double cube(double side) {
        if (side <= 0) {
            throw new InvalidSideException();
        }
        return (Math.pow(side, 3));
    }

    /**
     * It return the surface area of cuboid
     *
     * @param length length
     * @param breadth breadth
     * @param height height
     * @return Volume
     */
    public static double cuboid(double length, double breadth, double height) {
        if (length <= 0 || breadth <= 0 || height <= 0) {
            throw new InvalidSideException();
        }
        return (length * breadth * height);
    }

    /**
     * It returns the volume of prism
     *
     * @param length length
     * @param baseArea area of base
     * @return Volume
     */
    public static double prism(double length, double baseArea) {
        if (length <= 0 || baseArea <= 0) {
            throw new InvalidSideException();
        }
        return (baseArea * length);
    }

    /**
     * It return the surface area of triangular prism
     *
     * @param height height
     * @param base base
     * @param length length
     * @return Volume
     */
    public static double tPrisim(double height, double base, double length) {
        if (height <= 0 || base <= 0 || length <= 0) {
            throw new InvalidSideException();
        }
        return ((1.0 / 2 * base * height) * length);
    }

    /**
     * It return the surface area of equlateral triangular prism
     *
     * @param length length
     * @param side side
     * @return Volume
     */
    public static double ePrisim(double length, double side) {
        if (length <= 0 || side <= 0) {
            throw new InvalidSideException();
        }
        return (((Math.sqrt(3) / 4) * Math.pow(side, 2)) * length);
    }

    /**
     * It return the surface area of isosceles triangular prism
     *
     * @param length length
     * @param base base
     * @param side side
     * @return Volume
     */
    public static double iPrisim(double length, double base, double side) {
        if (length <= 0 || base <= 0 || side <= 0 || side <= 0) {
            throw new InvalidSideException();
        }
        return ((1.0 / 4 * base * Math.sqrt(4 * Math.pow(length, 2) - Math.pow(base, 2))) * length);
    }

    /**
     * It return the surface area of scalene triangle prism
     *
     * @param length length
     * @param side1 first side
     * @param side2 second side
     * @param side3 third side
     * @return Volume
     */
    public static double sPrisim(double length, double side1, double side2, double side3) {
        if (length <= 0 || side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new InvalidSideException();
        }
        return ((Math.sqrt(((side1 + side2 + side3) / 2) * (((side1 + side2 + side3) / 2) - side1) * (((side1 + side2 + side3) / 2) - side2)
                * (((side1 + side2 + side3) / 2) - side3))) * length);
    }

    /**
     * It return the surface area of square pyramid
     *
     * @param breadth breadth
     * @param height height
     * @return Volume
     */
    public static double sPyramid(double breadth, double height) {
        if (breadth <= 0 || height <= 0) {
            throw new InvalidSideException();
        }
        return (breadth * breadth * height * 1 / 3);
    }

    /**
     * It return the surface area of hexagonal pyramid
     *
     * @param length length
     * @param breadth breadth
     * @return Volume
     */
    public static double hPyramid(double length, double breadth) {
        if (length <= 0 || breadth <= 0) {
            throw new InvalidSideException();
        }
        return ((1 / 2) * (float) Math.sqrt(3) * breadth * length * length);
    }

    /**
     * It return the surface area of triangular pyramid
     *
     * @param breadth breadth
     * @param height height
     * @return Volume
     */
    public static double tPyramid(double breadth, double height) {
        if (breadth <= 0 || height <= 0) {
            throw new InvalidSideException();
        }
        return (1 / 3 * (1 / 2 * (breadth * height) * height));
    }

    /**
     * It return the surface area of pentagonal pyramid
     *
     * @param length length
     * @param breadth breadth
     * @return Volume
     */
    public static double pPyramid(double length, double breadth) {
        if (length <= 0 || breadth <= 0) {
            throw new InvalidSideException();
        }
        return ((5 / 2) * breadth * length * length * (float) Math.sqrt(1 + 2) * (float) Math.sqrt(5));
    }

    /**
     * It return the surface area of cone
     *
     * @param radius radius
     * @param height height
     * @return Volume
     */
    public static double cone(double radius, double height) {
        if (radius <= 0 || height <= 0) {
            throw new InvalidSideException();
        }
        return (1 / 3 * 22 / 7 * Math.pow(radius, 2) * height);
    }

    /**
     * It return the surface area of cylinder
     *
     * @param radius
     * @param height
     * @return Volume
     */
    public static double cylinder(double radius, double height) {
        if (radius <= 0 || height <= 0) {
            throw new InvalidSideException();
        }
        return (Math.PI * Math.pow(radius, 2) * height);
    }

    /**
     * It return the surface area of sphere
     *
     * @param radius radius
     * @return Volume
     */
    public static double sphere(double radius) {
        if (radius <= 0) {
            throw new InvalidSideException();
        }
        return (4 / 3 * 22 / 7 * Math.pow(radius, 3));
    }

    /**
     * It return the surface area of conical frustum
     *
     * @param radius1 first radius
     * @param radius2 second radius
     * @param height height
     * @return Volume
     */
    public static double cFrustum(double radius1, double radius2, double height) {
        if (height <= 0 || radius1 <= 0 || radius2 <= 0) {
            throw new InvalidSideException();
        }
        return ((1.0 / 3) * Math.PI * height * (Math.pow(radius1, 2) + Math.pow(radius2, 2) + (radius1 * radius2)));
    }
}
