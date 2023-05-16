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
 * Helpful in calculating surface area of a shape
 *
 * @author Imtiyaz Allam
 */
public class SArea {

    /**
     * It return the surface area of cube
     *
     * @param side side
     * @return Surface area
     */
    public static double cube(double side) {
        if (side <= 0) {
            throw new InvalidSideException();
        }
        return (6 * Math.pow(side, 2));
    }

    /**
     * It return the surface area of cuboid
     *
     * @param length length
     * @param breadth breadth
     * @param height height
     * @return Surface area
     */
    public static double cuboid(double length, double breadth, double height) {
        if (length <= 0 || breadth <= 0 || height <= 0) {
            throw new InvalidSideException();
        }
        return (2 * (length * breadth) + (breadth * height) + (height * length));
    }

    /**
     * It return the surface area of cone
     *
     * @param radius radius
     * @param height height
     * @return Surface area
     */
    public static double cone(double radius, double height) {
        if (radius <= 0 || height <= 0) {
            throw new InvalidSideException();
        }
        return (Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius)));
    }

    /**
     * It return the surface area of cylinder
     *
     * @param radius radius
     * @param height height
     * @return Surface area
     */
    public static double cylinder(double radius, double height) {
        if (radius <= 0 || height <= 0) {
            throw new InvalidSideException();
        }
        return ((2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius));
    }

    /**
     * It return the surface area of sphere
     *
     * @param radius radius 
     * @return Surface area
     */
    public static double sphere(double radius) {
        if (radius <= 0) {
            throw new InvalidSideException();
        }
        return (4 * Math.PI * radius * radius);
    }

    /**
     * It return the surface area of equlateral triangular prism
     *
     * @param length length
     * @param side side
     * @return Surface area
     */
    public static double ePrism(double length, double side) {
        if (length <= 0 || side <= 0) {
            throw new InvalidSideException();
        }
        return ((Math.sqrt(3) / 4 * Math.pow(side, 2) * 2 + 3) * (side * length));
    }

    /**
     * It return the surface area of isosceles triangular prism
     *
     * @param length length
     * @param base base
     * @param side side
     * @return Surface area
     */
    public static double iPrism(double length, double base, double side) {
        if (length <= 0 || base <= 0 || side <= 0 || side <= 0) {
            throw new InvalidSideException();
        }
        return ((1.0 / 4 * base * Math.sqrt(4 * Math.pow(length, 2) - Math.pow(base, 2)) * 2) + (3 * (length * side)));
    }

    /**
     * It return the surface area of scalene triangle prism
     *
     * @param length length
     * @param side1 first side
     * @param side2 second side
     * @param side3 third side
     * @return Surface area
     */
    public static double sPrism(double length, double side1, double side2, double side3) {/////////////////////////////////
        if (length <= 0 || side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new InvalidSideException();
        }
        return (2 * (Math.sqrt(((side1 + side2 + side3) / 2) * (((side1 + side2 + side3) / 2) - side1) * (((side1 + side2 + side3) / 2) - side2)
                * (((side1 + side2 + side3) / 2) - side3))) + (side1 * length) + (side3 * length) + (side3 * length));
    }

    /**
     * It return the surface area of square pyramid
     *
     * @param side side
     * @param height height
     * @return Surface area
     */
    public static double sPyramid(double side, double height) {
        if (side <= 0 || height <= 0) {
            throw new InvalidSideException();
        }
        return (side * (side + Math.sqrt((side * side + 4 * height * height))));
    }

    /**
     * It return the surface area of hexagonal pyramid
     *
     * @param apothemLength apothem length
     * @param slantHeight slant height
     * @param side side
     * @return Surface area
     */
    public static double hPyramid(double apothemLength, double slantHeight, double side) {
        if (apothemLength <= 0 || slantHeight <= 0 || side <= 0) {
            throw new InvalidSideException();
        }
        return (3 * apothemLength * side + 3 * side * slantHeight);
    }

    /**
     * It return the surface area of pyramid
     *
     * @param length length
     * @param breadth breadth
     * @param height height
     * @return Surface area
     */
    public static double pyramid(double length, double breadth, double height) {
        if (length <= 0 || breadth <= 0 || height <= 0) {
            throw new InvalidSideException();
        }
        return (length * breadth * length * Math.sqrt(Math.pow(breadth / 2, 2) + Math.pow(height, 2)) + breadth * Math.sqrt(Math.pow(length / 2, 2)
                + Math.pow(height, 2)));
    }

    /**
     * It return the surface area of triangular pyramid
     *
     * @param side1 first side
     * @param side2 second side
     * @param side3 third side
     * @param slantHeight slant height
     * @return Surface area
     */
    public static double tPyramid(double side1, double side2, double side3, double slantHeight) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 || slantHeight <= 0) {
            throw new InvalidSideException();
        }
        return ((Math.sqrt(((side1 + side2 + side3) / 2) * (((side1 + side2 + side3) / 2) - side1) * (((side1 + side2 + side3) / 2) - side2)
                * (((side1 + side2 + side3) / 2) - side3))) + 12 * (side1 + side2 + side3) + slantHeight);
    }

    /**
     * It return the surface area of pentagonal pyramid
     *
     * @param length length
     * @param height height
     * @param side side
     * @return Surface area
     */
    public static double pPyramid(double length, double height, double side) {
        if (length <= 0 || height <= 0 || side <= 0) {
            throw new InvalidSideException();
        }
        return (8.0 / 4 * Math.tan(54) * Math.pow(side, 2) + 5 * side / 2 * Math.sqrt(Math.pow(height, 2)) * Math.pow((side * Math.tan(54) / 2), 2));
    }

    /**
     * It return the surface area of conical frustum
     *
     * @param radius1 Smaller radius
     * @param radius2 Larger radius
     * @param slantHeight slant height
     * @return Surface area
     */
    public static double cFrustum(double radius1, double radius2, double slantHeight) {
        if (radius1 <= 0 || radius2 <= 0 || slantHeight <= 0) {
            throw new InvalidSideException();
        }
        return Math.PI * slantHeight * (radius1 + radius2) + Math.PI * Math.pow(radius1, 2) + Math.PI * Math.pow(radius2, 2);
    }

}
