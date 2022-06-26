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
 * It has methods to perform calculation on matrices
 *
 * @author Asteroid Softwares
 */
public class Matrix {

    /**
     * Multiply one matrix from an other matrix
     *
     * @param a matrix 1
     * @param b matrix 2
     */
    public static void multiply(int[][] a, int[][] b) {
        try {
            int[][] c = new int[a[1].length][b.length];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    c[i][j] = 0;
                    for (int k = 0; k < 3; k++)
                        c[i][j] += a[i][k] * b[k][j];
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new InvalidMatrixException();
        }
    }

    /**
     * Adds one matrix from an other matrix
     *
     * @param a matrix 1
     * @param b matrix 2
     */
    public static void add(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        if (a.length != b.length)
            throw new InvalidMatrixException();
        for (int[] a1 : b)
            if (a1.length != cols)
                throw new InvalidMatrixException();
        for (int[] a1 : a)
            if (a1.length != cols)
                throw new InvalidMatrixException();
        int[][] sum = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                sum[i][j] = a[i][j] - b[i][j];

    }

    /**
     * Subtract one matrix from an other matrix
     *
     * @param a matrix 1
     * @param b matrix 2
     */
    public static void subtract(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        if (a.length != b.length)
            throw new InvalidMatrixException();
        for (int[] a1 : b)
            if (a1.length != cols)
                throw new InvalidMatrixException();
        for (int[] a1 : a)
            if (a1.length != cols)
                throw new InvalidMatrixException();
        int diff[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                diff[i][j] = a[i][j] - b[i][j];
    }

    /**
     * Find the square of the matrix
     *
     * @param a matrix
     */
    public static void square(int[][] a) {
        multiply(a, a);
    }
}
