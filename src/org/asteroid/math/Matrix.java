/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2023 by Asteroid Softwares
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

import java.util.Arrays;

/**
 * This class has functions that help in matrix calculation and an instance of
 * this class represents a matrix
 *
 * @author Imtiyaz Allam
 */
public class Matrix {

    /**
     * 2d array representing a matrix
     */
    private double[][] matrix;

    /**
     * This array always has size 2 and index 0 represents number of rows and
     * index 1 represents number of column
     */
    public int[] order;

    /**
     * Creates a new instance of class {@code Matrix} using a 2d array as
     * representation of matrix
     *
     * @param matrix 2d array representing matrix
     */
    public Matrix(Object[][] matrix) {
        if (!isValid(matrix)) {
            throw new InvalidMatrixException("The given 2D Array is not a valid matrix");
        }
        this.matrix = new double[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            Object[] row = matrix[i];
            for (int j = 0; j < row.length; j++) {
                if (matrix instanceof Integer[][]) {
                    this.matrix[i][j] = (Integer) row[j];
                } else if (matrix instanceof Long[][]) {
                    this.matrix[i][j] = (Long) row[j];
                } else if (matrix instanceof Float[][]) {
                    this.matrix[i][j] = (Float) row[j];
                } else {
                    this.matrix[i][j] = (Double) row[j];
                }
            }
        }
        order = new int[]{this.matrix.length, this.matrix[0].length};
    }

    /**
     * Creates a new instance of class {@code Matrix} using a 2d array as
     * representation of matrix
     *
     * @param matrix 2d array representing matrix
     */
    public Matrix(int[][] matrix) {
        if (!isValid(matrix)) {
            throw new InvalidMatrixException("The given 2D Array is not a valid matrix");
        }
        this.matrix = new double[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < row.length; j++) {
                this.matrix[i][j] = row[j];
            }
        }
        order = new int[]{this.matrix.length, this.matrix[0].length};
    }

    /**
     * Creates a new instance of class {@code Matrix} using a 2d array as
     * representation of matrix
     *
     * @param matrix 2d array representing matrix
     */
    public Matrix(long[][] matrix) {
        if (!isValid(matrix)) {
            throw new InvalidMatrixException("The given 2D Array is not a valid matrix");
        }
        this.matrix = new double[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            long[] row = matrix[i];
            for (int j = 0; j < row.length; j++) {
                this.matrix[i][j] = row[j];
            }
        }
        order = new int[]{this.matrix.length, this.matrix[0].length};
    }

    /**
     * Creates a new instance of class {@code Matrix} using a 2d array as
     * representation of matrix
     *
     * @param matrix 2d array representing matrix
     */
    public Matrix(float[][] matrix) {
        if (!isValid(matrix)) {
            throw new InvalidMatrixException("The given 2D Array is not a valid matrix");
        }
        this.matrix = new double[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            float[] row = matrix[i];
            for (int j = 0; j < row.length; j++) {
                this.matrix[i][j] = row[j];
            }
        }
        order = new int[]{this.matrix.length, this.matrix[0].length};
    }

    /**
     * Creates a new instance of class {@code Matrix} using a 2d array as
     * representation of matrix
     *
     * @param matrix 2d array representing matrix
     */
    public Matrix(double[][] matrix) {
        if (!isValid(matrix)) {
            throw new InvalidMatrixException("The given 2D Array is not a valid matrix");
        }
        this.matrix = new double[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            double[] row = matrix[i];
            System.arraycopy(row, 0, this.matrix[i], 0, row.length);
        }
        order = new int[]{this.matrix.length, this.matrix[0].length};
    }

    /**
     * Creates a new instance of class {@code Matrix} representing a diagonal
     * matrix with {@code d} as its diagonal entries
     *
     * @param d Diagonal entries of the array.
     */
    public Matrix(double[] d) {
        this.matrix = new double[d.length][d.length];
        order = new int[]{d.length, d.length};
        for (int i = 0; i < d.length; i++) {
            this.matrix[i][i] = d[i];

        }
    }

    /**
     * Creates a new instance of class {@code Matrix} which is a square matrix.
     * If {@code isUnitMatrix} is {@code true} then a unit matrix is generated
     * else a null matrix is generated
     *
     * @param n order of the square matrix
     * @param isUnitMatrix unit matrix is generated if {@code true} else a null
     * matrix is generated
     */
    public Matrix(int n, boolean isUnitMatrix) {
        this.matrix = new double[n][n];
        order = new int[]{n, n};
        if (isUnitMatrix) {
            for (int i = 0; i < n; i++) {
                matrix[i][i] = 1;
            }
        }
    }

    /**
     * Creates a null matrix of order {@code m} × {@code n}
     *
     * @param m Number of rows
     * @param n Number of columns
     */
    public Matrix(int m, int n) {
        this.matrix = new double[m][n];
        order = new int[]{m, n};
    }

    /**
     * Adds given instance of matrix in argument and current instance of matrix
     * and returns a new instance of class {@code Matrix} containing the result
     *
     * @param matrix Another matrix that is to be added
     * @return new instance of matrix containing sum of current instance of
     * matrix and instance of matrix given in parameter
     */
    public Matrix add(Matrix matrix) {
        if (!Arrays.equals(this.order, matrix.order)) {
            throw new OperationNotPossibleException("Addition of matrix not possible. Reason: both the matrix have different orders");
        }
        Matrix mat = new Matrix(this.matrix);
        for (int i = 0; i < this.matrix.length; i++) {
            double[] row = this.matrix[1];
            for (int j = 0; j < row.length; j++) {
                mat.matrix[i][j] += matrix.matrix[i][j];
            }
        }
        return mat;
    }

    /**
     * Subtract the given instance of matrix in argument from current instance
     * of matrix and returns a new instance of class {@code Matrix} containing
     * the result
     *
     * @param matrix Another matrix that is to be subtracted
     * @return New instance of matrix having the given instance of matrix in
     * argument subtracted from current instance of matrix
     */
    public Matrix subtract(Matrix matrix) {
        if (!Arrays.equals(this.order, matrix.order)) {
            throw new OperationNotPossibleException("Subtraction of matrix not possible. Reason: both the matrix have different orders");
        }
        Matrix mat = new Matrix(this.matrix);
        for (int i = 0; i < this.matrix.length; i++) {
            double[] row = this.matrix[1];
            for (int j = 0; j < row.length; j++) {
                mat.matrix[i][j] -= matrix.matrix[i][j];
            }
        }
        return mat;
    }

    /**
     * Multiplies current instance of matrix with the instance of matrix given
     * in the argument and returns a new instance of class {@code Matrix}
     * containing the result
     *
     * @param matrix matrix that is to be multiplied
     * @return New instance of matrix having product of current instance of
     * matrix with the instance of matrix given in the argument
     */
    public Matrix multiply(Matrix matrix) {
        if (this.order[1] != matrix.order[0]) {
            throw new OperationNotPossibleException("Multiplication of matrix not possible. Reason: number of rows of second matrix should match with the number of columns of first matrix");
        }
        Matrix mat = new Matrix(this.order[0], matrix.order[1]);
        for (int i = 0; i < this.order[0]; i++) {
            for (int j = 0; j < matrix.order[1]; j++) {
                for (int k = 0; k < this.order[1]; k++) {
                    mat.matrix[i][j] += this.matrix[i][k] * matrix.matrix[k][j];
                }
            }
        }
        return mat;
    }

    /**
     * Multiply a scalar value with the current instance of class and returns a
     * new instance of class {@code Matrix} containing the result
     *
     * @param num Number that is to be multiplies to the matrix
     * @return New instance of matrix having the product of current instance of
     * class with a scalar value.
     */
    public Matrix multiply(double num) {
        Matrix mat = new Matrix(this.order[0], this.order[1]);
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                mat.matrix[i][j] = this.matrix[i][j] * num;
            }
        }
        return mat;
    }

    /**
     * Generates the inverse of the current instance of matrix and returns a new
     * instance of class {@code Matrix} containing the result
     *
     * @return New instance of matrix containing the inverse of the current
     * instance of matrix
     */
    public Matrix getInverse() {
        int n = matrix.length;
        double[][] augmented = new double[n][2 * n];
        for (int i = 0; i < n; i++) {
            System.arraycopy(matrix[i], 0, augmented[i], 0, n);
            for (int j = n; j < 2 * n; j++) {
                if (i == j - n) {
                    augmented[i][j] = 1;
                } else {
                    augmented[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            int pivot = i;
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(augmented[j][i]) > Math.abs(augmented[pivot][i])) {
                    pivot = j;
                }
            }
            double[] temp = augmented[i];
            augmented[i] = augmented[pivot];
            augmented[pivot] = temp;
            double divisor = augmented[i][i];
            for (int j = i; j < 2 * n; j++) {
                augmented[i][j] /= divisor;
            }
            for (int j = i + 1; j < n; j++) {
                double factor = augmented[j][i];
                for (int k = i; k < 2 * n; k++) {
                    augmented[j][k] -= factor * augmented[i][k];
                }
            }
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                double factor = augmented[j][i];
                for (int k = i; k < 2 * n; k++) {
                    augmented[j][k] -= factor * augmented[i][k];
                }
            }
        }
        double[][] inverse = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = n; j < 2 * n; j++) {
                inverse[i][j - n] = augmented[i][j];
            }
        }
        return new Matrix(inverse);
    }

    /**
     * Calculates determinant of current instance of matrix
     *
     * @return determinant of current instance of matrix
     */
    public double getDeterminant() {
        if (this.order[0] != this.order[1]) {
            throw new OperationNotPossibleException("Determinant calculation of matrix not possible. Reason: Matrix must be a square matrix");
        }
        return determinant(this.matrix);
    }

    /**
     * Calculates determinant of 2d matrix (for internal use only)
     *
     * @param matrix 2d array whose determinant is to be calculated
     * @return determinant of the 2d array
     */
    private double determinant(double[][] matrix) {
        int n = matrix.length;
        switch (n) {
            case 1:
                return matrix[0][0];
            case 2:
                return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
            default:
                double det = 0;
                for (int i = 0; i < n; i++) {
                    double[][] minor = getMinor(matrix, 0, i);
                    det += Math.pow(-1, i) * matrix[0][i] * determinant(minor);
                }
                return det;
        }
    }

    /**
     * Calculate minor matrix of the the given 2d matrix
     *
     * @param matrix 2d matrix whose minor is to be calculated
     * @param i row number (index)
     * @param j column number (index)
     * @return Minor matrix
     */
    private double[][] getMinor(double[][] matrix, int i, int j) {
        int n = matrix.length;
        double[][] minor = new double[n - 1][n - 1];
        int r = 0, c;
        for (int x = 0; x < n; x++) {
            if (x != i) {
                c = 0;
                for (int y = 0; y < n; y++) {
                    if (y != j) {
                        minor[r][c] = matrix[x][y];
                        c++;
                    }
                }
                r++;
            }
        }
        return minor;
    }

    /**
     * Generates a matrix excluding the row and matrix of current instance of
     * matrix
     *
     * @param row row number
     * @param col column number
     * @return matrix excluding the row and matrix of current instance of matrix
     */
    public Matrix getMinorMatrix(int row, int col) {
        int n = this.matrix.length;
        double[][] minor = new double[n - 1][n - 1];
        int r = 0, c;
        for (int i = 0; i < n; i++) {
            if (i != row - 1) {
                c = 0;
                for (int j = 0; j < n; j++) {
                    if (j != col - 1) {
                        minor[r][c] = matrix[i][j];
                        c++;
                    }
                }
                r++;
            }
        }
        return new Matrix(minor);
    }

    /**
     * Calculate minor of element at given row and column
     *
     * @param row row number
     * @param col column number
     * @return minor of element at given row and column
     */
    public double getMinor(int row, int col) {
        return getMinorMatrix(row, col).getDeterminant();
    }

    /**
     * Calculate cofactor of element at given row and column
     *
     * @param row row number
     * @param col column number
     * @return cofactor of element at given row and column
     */
    public double getCofactor(int row, int col) {
        return Math.pow(-1, row + col) * getMinor(row, col);
    }

    /**
     * Performs elementary transformation on the given Matrix<br>CASE 1: if
     * transformRow is true then it performs Rₘ → Rₘ + cRₙ where rcm represents
     * the value of Rₘ, rcn represents the value of Rₙ and scalar represents the
     * value of c<br>CASE 2: if transformRow is false then it performs Cₘ → Cₘ +
     * cCₙ where rcm represents the value of Cₘ, rcn represents the value of Cₙ
     * and scalar represents the value of c
     *
     * @param transformRow row is transformed if true else column is transformed
     * @param rcm row or column number that is to be transformed
     * @param rcn row or column whose multiple is to be added to the row or
     * column that is to be transformed
     * @param scalar a constant that is to be multiplied to rcn
     * @return An elementary transformed matrix according to given condition
     */
    public Matrix elementaryTransform(boolean transformRow, int rcm, int rcn, double scalar) {
        Matrix mat = this.clone();
        if (transformRow) {
            for (int i = 0; i < matrix[0].length; i++) {
                mat.matrix[rcm - 1][i] += scalar * matrix[rcn - 1][i];
            }
        } else {
            for (double[] matrix1 : matrix) {
                matrix1[rcm - 1] += scalar * matrix1[rcn - 1];
            }
        }
        return mat;
    }

    /**
     * Returns a new instance of matrix with an interchange in two row or
     * column. If value of {@code interchangeRow} is {@code true} then rows are
     * interchanged else column are interchanged
     *
     * @param interchangeRows if {@code true} then rows are interchanged else
     * column are interchanged
     * @param rc1 first row or column number
     * @param rc2 second row or column number
     * @return New instance of matrix with an interchange in two row or column.
     */
    public Matrix interchange(boolean interchangeRows, int rc1, int rc2) {
        if (interchangeRows) {
            Matrix mat = this.clone();
            double[] r1 = mat.matrix[rc1 - 1];
            double[] r2 = mat.matrix[rc2 - 1];
            mat.matrix[rc2 - 1] = r1;
            mat.matrix[rc1 - 1] = r2;
            return mat;
        } else {
            Matrix mat = this.clone();
            mat = mat.geTranspose();
            double[] c1 = mat.matrix[rc1 - 1];
            double[] c2 = mat.matrix[rc2 - 1];
            mat.matrix[rc2 - 1] = c1;
            mat.matrix[rc1 - 1] = c2;
            return mat.geTranspose();
        }
    }

    /**
     * Generates and return geTranspose of the current instance of matrix
     *
     * @return Transpose of current instance of matrix
     */
    public Matrix geTranspose() {
        Matrix mat = new Matrix(this.order[1], this.order[0]);
        for (int i = 0; i < matrix.length; i++) {
            double[] row = matrix[i];
            for (int j = 0; j < row.length; j++) {
                mat.matrix[j][i] = row[j];
            }
        }
        return mat;
    }

    /**
     * Calculates and return adjoint matrix of current instance of matrix
     *
     * @return Adjoint matrix of current instance of matrix
     */
    public Matrix getAdjoint() {
        Matrix mat = new Matrix(this.order[0], this.order[1]);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                mat.matrix[i][j] = this.getCofactor(i + 1, j + 1);
            }
        }
        return mat.geTranspose();
    }

    /**
     * Checks if the current instance of matrix is a square matrix
     *
     * @return {@code true} if it is a square matrix else returns {@code false}
     */
    public boolean isSquareMatrix() {
        return this.order[0] == this.order[1];
    }

    /**
     * Checks if the current instance of matrix is a unit matrix
     *
     * @return {@code true} if it is a unit matrix else returns {@code false}
     */
    public boolean isUnitMatrix() {
        if (!isSquareMatrix()) {
            return false;
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    if (i != j) {
                        if (matrix[i][j] != 0) {
                            return false;
                        }
                    } else {
                        if (matrix[i][j] != 1) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }

    /**
     * Checks if the current instance of matrix is a singular matrix
     *
     * @return {@code true} if it is a singular matrix else returns
     * {@code false}
     */
    public boolean isSingularMatrix() {
        return this.getDeterminant() == 0;
    }

    /**
     * Checks if the current instance of matrix is a non-singular matrix
     *
     * @return {@code true} if it is a non-singular matrix else returns
     * {@code false}
     */
    public boolean isNonSingularMatrix() {
        return !isSingularMatrix();
    }

    /**
     * Checks if the current instance of matrix is a skew symmetric matrix
     *
     * @return {@code true} if it is a skew symmetric matrix else returns
     * {@code false}
     */
    public boolean isSkewSymmatrixMatrix() {
        return this.equals(this.geTranspose().multiply(-1));
    }

    /**
     * Checks if the current instance of matrix is a symmetric matrix
     *
     * @return {@code true} if it is a symmetric matrix else returns
     * {@code false}
     */
    public boolean isSymmatrixMatrix() {
        return this.equals(this.geTranspose());
    }

    /**
     * Checks if the current instance of matrix is a diagonal matrix
     *
     * @return {@code true} if it is a diagonal matrix else returns
     * {@code false}
     */
    public boolean isDiagonalMatrix() {
        if (!isSquareMatrix()) {
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i != j) {
                    if (matrix[i][j] != 0) {
                        return false;
                    }
                } else {
                    if (matrix[i][j] == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /**
     * Checks if the current instance of matrix is a scalar matrix
     *
     * @return {@code true} if it is a scalar matrix else returns {@code false}
     */
    public boolean isScalarMatrix() {
        if (!isSquareMatrix() || !isDiagonalMatrix()) {
            return false;
        }
        double a = this.matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] != a) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if the current instance of matrix is an upper triangular matrix
     *
     * @return {@code true} if it is a upper triangular matrix else returns
     * {@code false}
     */
    public boolean isUpperTriangularMatrix() {
        if (!isSquareMatrix()) {
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i > j) {
                    if (matrix[i][j] != 0) {
                        return false;
                    }
                } else {
                    if (matrix[i][j] == 0) {
                        return false;
                    }
                }

            }
        }
        return true;
    }

    /**
     * Checks if the current instance of matrix is a lower triangular matrix
     *
     * @return {@code true} if it is a lower triangular matrix else returns
     * {@code false}
     */
    public boolean isLowerTriangularMatrix() {
        if (!isSquareMatrix()) {
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i < j) {
                    if (matrix[i][j] != 0) {
                        return false;
                    }
                } else {
                    if (matrix[i][j] == 0) {
                        return false;
                    }
                }

            }
        }
        return true;
    }

    /**
     * Checks if the current instance of matrix is a singleton matrix
     *
     * @return {@code true} if it is a singleton matrix else returns
     * {@code false}
     */
    public boolean isSingletonMatrix() {
        return order[0] == 1 && order[1] == 1;
    }

    /**
     * Checks if the current instance of matrix is a null matrix
     *
     * @return {@code true} if it is a null matrix else returns {@code false}
     */
    public boolean isNullMatrix() {
        for (double[] matrix1 : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix1[j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Checks if the current instance of matrix is a row matrix
     *
     * @return {@code true} if it is a row matrix else returns {@code false}
     */
    public boolean isRowMatrix() {
        return order[0] == 1;
    }

    /**
     * Checks if the current instance of matrix is a column matrix
     *
     * @return {@code true} if it is a column matrix else returns {@code false}
     */
    public boolean isColumnMatrix() {
        return order[1] == 1;
    }

    /**
     * Checks if the current instance of matrix is a rectangular matrix
     *
     * @return {@code true} if it is a rectangular matrix else returns
     * {@code false}
     */
    public boolean isRectangularMatrix() {
        return order[0] != order[1];
    }

    /**
     * Checks if the current instance of matrix is a vertical matrix
     *
     * @return {@code true} if it is a vertical matrix else returns
     * {@code false}
     */
    public boolean isVerticalMatrix() {
        return order[0] > order[1];
    }

    /**
     * Checks if the current instance of matrix is a horizontal matrix
     *
     * @return {@code true} if it is a horizontal matrix else returns
     * {@code false}
     */
    public boolean isHorizontalMatrix() {
        return order[0] < order[1];
    }

    /**
     * Calculate trace of the current instance of matrix
     *
     * @return trace of the current instance of matrix
     */
    public double getTrace() {
        if (!isSquareMatrix()) {
            return Double.NaN;
        }
        double tra = 0;
        for (int i = 0; i < matrix.length; i++) {
            tra += matrix[i][i];
        }
        return tra;
    }

    /**
     * Checks if the given 2d array is valid matrix or not
     *
     * @param matrix 2d array to check whether it is a valid matrix or not
     * @return {@code true} if the array is valid matrix else returns
     * {@code false}
     */
    public static boolean isValid(int[][] matrix) {
        int len = matrix[0].length;
        for (int[] row : matrix) {
            if (row.length != len) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if the given 2d array is valid matrix or not
     *
     * @param matrix 2d array to check whether it is a valid matrix or not
     * @return {@code true} if the array is valid matrix else returns
     * {@code false}
     */
    public static boolean isValid(double[][] matrix) {
        int len = matrix[0].length;
        for (double[] row : matrix) {
            if (row.length != len) {
                return false;
            }

        }
        return true;
    }

    /**
     * Checks if the given 2d array is valid matrix or not
     *
     * @param matrix 2d array to check whether it is a valid matrix or not
     * @return {@code true} if the array is valid matrix else returns
     * {@code false}
     */
    public static boolean isValid(long[][] matrix) {
        int len = matrix[0].length;
        for (long[] row : matrix) {
            if (row.length != len) {
                return false;
            }

        }
        return true;
    }

    /**
     * Checks if the given 2d array is valid matrix or not
     *
     * @param matrix 2d array to check whether it is a valid matrix or not
     * @return {@code true} if the array is valid matrix else returns
     * {@code false}
     */
    public static boolean isValid(float[][] matrix) {
        int len = matrix[0].length;
        for (float[] row : matrix) {
            if (row.length != len) {
                return false;
            }

        }
        return true;
    }

    /**
     * Checks if the given 2d array is valid matrix or not
     *
     * @param matrix 2d array to check whether it is a valid matrix or not
     * @return {@code true} if the array is valid matrix else returns
     * {@code false}
     */
    public static boolean isValid(Object[][] matrix) {
        int len = matrix[0].length;
        if (!(matrix instanceof Integer[][] || matrix instanceof Float[][] || matrix instanceof Long[][] || matrix instanceof Double[][])) {
            return false;
        }
        for (Object[] row : matrix) {
            if (row.length != len) {
                return false;
            }

        }
        return true;
    }

    /**
     * Returns string representation of the matrix
     *
     * @return String representation of the matrix
     */
    @Override
    public String toString() {
        String s = "";
        for (double[] ds : this.matrix) {
            s += Arrays.toString(ds) + "\n";
        }
        s = s.strip();
        return s;
    }

    /**
     * Generates a copy of the current instance of matrix
     *
     * @return Copy of current instance of matrix
     */
    @Override
    public Matrix clone() {
        return new Matrix(this.matrix);
    }

    /**
     * Checks for equality of two matrix
     *
     * @param mat second matrix
     * @return {@code true} if two matrix are equal else returns {@code false}
     */
    public boolean equals(Matrix mat) {
        if (this.order[0] != mat.order[0] || this.order[1] != mat.order[1]) {
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (this.matrix[i][j] != mat.matrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
