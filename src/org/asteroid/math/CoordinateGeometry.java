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
 *
 * @author Imtiyaz Allam
 */
public class CoordinateGeometry {

    public static double distance(double x1, double y1, double z1, double x2, double y2, double z2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return distance(x1, y1, 0, x2, y2, 0);
    }

    public static double distance(double x1, double x2) {
        return distance(x1, 0, 0, x2, 0, 0);
    }

    public static double distance(double[] p1, double[] p2) {
        double[] p11 = new double[3];
        double[] p21 = new double[3];
        switch (p1.length) {
            case 1:
                p11[0] = p1[0];
                break;
            case 2:
                p11[0] = p1[0];
                p11[1] = p1[1];
                break;
            case 3:
                p11[0] = p1[0];
                p11[1] = p1[1];
                p11[2] = p1[2];
                break;
            default:
                throw new InvalidPointException("Only 1D, 2D and 3D are supported but point P1 has " + p1.length + " dimensions");
        }
        switch (p2.length) {
            case 1:
                p21[0] = p2[0];
                break;
            case 2:
                p21[0] = p2[0];
                p21[1] = p2[1];
                break;
            case 3:
                p21[0] = p2[0];
                p21[1] = p2[1];
                p21[2] = p2[2];
                break;
            default:
                throw new InvalidPointException("Only 1D, 2D and 3D are supported but point P2 has " + p2.length + " dimensions");
        }
        return distance(p11[1], p11[1], p11[2], p21[0], p21[1], p21[2]);
    }

    public static double[] toCatresianSystem(double r, double angle) {
        return new double[]{r * Math.cos(angle), r * Math.cos(angle)};
    }

    public static double[] toPolarSystem(double x, double y) {
        double r = distance(x, y, 0, 0);
        return new double[]{r, Math.acos(x / r)};
    }

    public static double slope(double x1, double y1, double x2, double y2) {
        return (y2 - y1) / (x2 - x1);
    }

    public static double slope(double[] p1, double[] p2) {
        if (p1.length == 2 && p2.length == 2) {
            return slope(p1[0], p1[1], p2[0], p2[1]);
        }
        throw new InvalidPointException("Only points on 2D are supported");
    }

    public static double inclination(double[] p1, double[] p2) {
        return inclination(p1[0], p1[1], p2[0], p2[1]);
    }

    public static double inclination(double x1, double y1, double x2, double y2) {
        return Math.atan(slope(x1, y1, x2, y2));
    }

    public static double distanceFromOrigin(double[] p) {
        return distance(p, new double[]{0, 0, 0});
    }

    public static double distanceFromOrigin(double x, double y) {
        return distance(x, y, 0, 0, 0, 0);
    }

    public static double distanceFromOrigin(double x, double y, double z) {
        return distance(x, y, z, 0, 0, 0);
    }
    
    
}
