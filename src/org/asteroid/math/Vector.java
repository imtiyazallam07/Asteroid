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

/**
 * This class contains functions to perform operation based on vectors
 * 
 * @author Imtiyaz Allam
 */
public class Vector {

    /**
     * Position on x-coordinate
     */
    private double x;

    /**
     * Position on y-coordinate
     */
    private double y;

    /**
     * Position on z-coordinate
     */
    private double z;

    /**
     * Creates a new instance of Vector using position of coordinates
     *
     * @param x Position on x coordinate
     * @param y Position on y-coordinate
     * @param z Position on z-coordinate
     */
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    /**
     * Creates a new instance of Vector using magnitude and angles between coordinate axes and vector
     * 
     * @param v Magnitude of vector
     * @param x angle between vector and x-axis (in radian)
     * @param y angle between vector and y-axis (in radian)
     * @param z angle between vector and z-axis (in radian)
     */
    public Vector(double v, double x, double y, double z) {
        this.x = v * Math.cos(x);
        this.y = v * Math.cos(y);
        this.y = v * Math.cos(z);
    }

    /**
     * Change values of Coordinates
     *
     * @param x Position on x-coordinate
     * @param y Position on y-coordinate
     * @param z Position on z-coordinate
     */
    public void changeValues(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Calculate magnitude of the vector
     *
     * @return magnitude of the vector
     */
    public double magnitude() {
        return Math.sqrt((this.x * this.x) + (this.y * this.y) + (this.z * this.z));
    }

    /**
     * Returns a string representation of the Vector.
     *
     * @return string representation of the vector.
     */
    @Override
    public String toString() {
        String x1;
        String y1;
        String z1;
        System.out.println(this.x == (int) this.x);
        if (this.x == (int) this.x) {
            x1 = "" + (int) this.x;
        } else {
            x1 = "" + this.x;
        }

        if (this.y != (int) this.y) {
            y1 = ((this.y > 0) ? (" + " + this.y) : (" - " + Math.abs(this.y))) + "ĵ";
        } else {
            y1 = ((this.y > 0) ? (" + " + (int) this.y) : (" - " + Math.abs((int) this.y))) + "ĵ";
        }

        if (this.z != (int) this.z) {
            z1 = ((this.z > 0) ? (" + " + this.z) : (" - " + Math.abs(this.z))) + "k̂";
        } else {
            z1 = ((this.z > 0) ? (" + " + (int) this.z) : (" - " + Math.abs((int) this.z))) + "k̂";
        }

        return x1 + "î" + y1 + z1;
    }

    /**
     * Calculates sum of two vector
     *
     * @param v the second vector
     * @return sum of two vectors
     */
    public Vector add(Vector v) {
        return new Vector(this.x + v.x, this.y + v.y, this.z + v.z);
    }

    /**
     * Calculates difference between two vectors
     *
     * @param v the second vector
     * @return difference between two vectors
     */
    public Vector subtract(Vector v) {
        return new Vector(this.x - v.x, this.y - v.y, this.z - v.z);
    }

    /**
     * Calculates dot product (also called scalar product) of two vectors
     *
     * @param v the second vector
     * @return dot product of two vector
     */
    public double dotProduct(Vector v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }

    /**
     * Calculate cross product (also called vector product) of two vectors
     *
     * @param v the second vector
     * @return cross product of two vectors
     */
    public Vector crossProduct(Vector v) {
        double x1 = this.y * v.z - v.y * this.z;
        double y1 = -(this.x * v.z - v.x * this.z);
        double z1 = this.x * v.y - v.x * this.y;
        return new Vector(x1, y1, z1);
    }

    /**
     * Calculate angles between the coordinate axes and the vector
     *
     * @return angle between coordinate axes and the vector in format <br>[angle
     * from x-axis, angle from y-axis, angle from z-axis] (in radians)
     */
    public double[] angles() {
        double[] angle = new double[3];
        angle[0] = Math.acos(x / this.magnitude());
        angle[1] = Math.acos(y / this.magnitude());
        angle[2] = Math.acos(z / this.magnitude());
        return angle;
    }

    /**
     * Calculate angle between two vectors
     * @param v the second vector
     * @return angle between two vectors (in radians)
     */
    public double angleBetween(Vector v) {
        return Math.acos(this.dotProduct(v) / (this.magnitude() * v.magnitude()));
    }
}
