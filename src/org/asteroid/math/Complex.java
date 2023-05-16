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

import org.asteroid.Text;

/**
 * The {@code Complex} class contains several useful methods to perform
 * calculation on Complex numbers. Instance of the {@code Complex} class
 * represents a complex number.
 *
 * @author Imtiyaz Allam
 */
public class Complex {

    /**
     * Real part of the Complex number
     */
    private double real;

    /**
     * Imaginary part of the Complex number
     */
    private double imaginary;

    /**
     * Creates a new Instance of the class Complex with both real and imaginary
     * part set to be 0
     */
    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    /**
     * Creates a new instance of the class Complex with only taking real part.
     * Imaginary part is set to be 0
     *
     * @param real Real part of the complex number
     */
    public Complex(double real) {
        this.real = real;
        this.imaginary = 0;
    }

    /**
     * Creates an instance of class Complex taking both real and imaginary part
     *
     * @param real Real part of the complex number
     * @param imaginary Imaginary part of the complex number
     */
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * Parse string to instance of class <code>Complex</code>
     *
     * @param str String that is to be parsed
     * @return instance of class <code>Complex</code> parsed from the given
     * string
     */
    public static Complex parseComplex(String str) {
        String ori = str;
        double[] val = {0, 0};
        str = str.replace(" ", "");
        if (Text.getIndicesOf(str, 'i').length >= 2
                || Text.doesContains(str, "++")
                || Text.doesContains(str, "--")
                || Text.doesContains(str, "+-")
                || Text.doesContains(str, "-+")) {
            throw new ComplexNumberFormatException("For input string: \"" + ori + "\"");
        }
        try {
            str = str.replace("-", "+-");
            if (str.startsWith("+")) {
                str = str.substring(1);
            }
            String[] splitted = str.split("[+]");
            if (splitted.length > 2) {
                throw new ComplexNumberFormatException("For input string: \"" + ori + "\"");
            }
            if (Text.getIndicesOf(str, 'i').length == 0 && splitted.length == 2) {
                throw new ComplexNumberFormatException("For input string: \"" + ori + "\"");
            }
            if (splitted.length == 1) {
                val = parser1(splitted);
            } else {
                val = parser2(splitted);
            }
        } catch (NumberFormatException e) {
            throw new ComplexNumberFormatException("For input string: \"" + ori + "\"");
        }
        return new Complex(val[0], val[1]);
    }

    /**
     * Converts one term to real or imaginary
     *
     * @param value String array containing terms in string
     * @return Array of data with real and imaginary values
     */
    private static double[] parser1(String[] value) {
        if (value[0].contains("i")) {
            if (value[0].equals("i")) {
                return new double[]{0, 1};
            }
            value[0] = value[0].replace("i", "");
            return new double[]{0, Double.parseDouble(value[0])};
        } else {
            return new double[]{Double.parseDouble(value[0]), 0};
        }
    }

    /**
     * Converts two terms to real and imaginary
     *
     * @param value String array containing terms in string
     * @return Array of data with real and imaginary values
     */
    private static double[] parser2(String[] value) {
        if (value[0].contains("i")) {
            if (value[0].equals("i")) {
                return new double[]{Double.parseDouble(value[1]), 1};
            }
            value[0] = value[0].replace("i", "");
            return new double[]{Double.parseDouble(value[1]), Double.parseDouble(value[0])};
        } else {
            if (value[1].equals("i")) {
                return new double[]{Integer.parseInt(value[0]), 1};
            }
            value[1] = value[1].replace("i", "");
            return new double[]{Double.parseDouble(value[0]), Double.parseDouble(value[1])};
        }
    }

    /**
     * Change the real and imaginary part in complex number
     *
     * @param real Real part of the Complex number
     * @param imaginary Imaginary part of the complex number
     */
    public void changeValues(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * Change values of this instance with respect to the given Instance of
     * class Complex
     *
     * @param z Instance of Complex class whose data is to be copied
     */
    public void changeValues(Complex z) {
        this.real = z.real;
        this.imaginary = z.imaginary;
    }

    /**
     * Creates a clone of the current instance
     *
     * @return cloned instance of current instance
     */
    @Override
    public Complex clone() {
        return new Complex(this.real, this.imaginary);
    }

    /**
     * Perform the calculation i^x where x is the power to which i is raised to
     *
     * @param pow power to which i is raised to
     * @return i^x where x is the power to which i is raised to
     */
    public static Complex iToThePower(int pow) {
        pow = pow % 4;
        switch (pow) {
            case 0:
                return new Complex(1, 0);
            case 1:
                return new Complex(0, 1);
            case 2:
                return new Complex(-1, 0);
            default:
                return new Complex(0, -1);
        }
    }

    public static Complex i() {
        return new Complex(0, 1);
    }

    /**
     * Returns the real part of the complex number
     *
     * @return Real part of the given complex number
     */
    public double re() {
        return this.real;
    }

    /**
     * Returns the imaginary part of the complex number
     *
     * @return Imaginary part of the given complex number
     */
    public double im() {
        return this.imaginary;
    }

    /**
     * This is a static method that creates a new instance of class Complex with
     * the given parameters
     *
     * @param real Real part of the complex number
     * @param imaginary Imaginary part of the complex number
     * @return New instance of the class Complex
     */
    public static Complex getInstance(double real, double imaginary) {
        return new Complex(real, imaginary);
    }

    /**
     * This is a static method that creates a new instance of class Complex with
     * the given parameters. Here imaginary part is set to be 0
     *
     * @param real Real part of the complex number
     * @return New instance of the class Complex
     */
    public static Complex getInstance(double real) {
        return new Complex(real, 0);
    }

    /**
     * Returns a {@code String} object representing the specified Complex
     * number.
     *
     * @return String representation of the complex number
     */
    @Override
    public String toString() {
        if (imaginary < 0) {
            return real + " - " + Math.abs(imaginary) + "i";
        } else {
            return real + " + " + Math.abs(imaginary) + "i";
        }
    }

    /**
     * Adds the current instance of the complex number and the one given in
     * argument
     *
     * @param z Complex number that is to be added
     * @return Sum of the two complex number
     */
    public Complex add(Complex z) {
        return new Complex(real + z.real, this.imaginary + z.imaginary);
    }

    /**
     * Adds the current instance of the complex number and the real value given
     * in argument
     *
     * @param realVal real number that is to be added
     * @return Sum of the complex number and the given real number
     */
    public Complex add(double realVal) {
        return new Complex(real + realVal, this.imaginary);
    }

    /**
     * Subtracts the current instance of the complex number and the one given in
     * argument [current instance - z]
     *
     * @param z Complex number that is to be subtracted
     * @return Sum of the two complex number
     */
    public Complex subtract(Complex z) {
        return new Complex(real - z.real, this.imaginary - z.imaginary);
    }

    /**
     * Subtracts the real number from the current instance of the class Complex
     * [Current instance - real]
     *
     * @param realVal Real number that is to be subtracted
     * @return Difference of the complex number and the given real number
     */
    public Complex subtract(double realVal) {
        return new Complex(real - realVal, this.imaginary);
    }

    /**
     * Multiplies the current instance of the complex number and the one given
     * in argument
     *
     * @param z Complex number that is to be multiplied
     * @return Product of the two complex number
     */
    public Complex multiply(Complex z) {
        double re, im;
        re = (this.real * z.real) - (this.imaginary * z.imaginary);
        im = (this.real * z.imaginary) + (this.imaginary * z.real);
        return new Complex(re, im);
    }

    /**
     * Multiplies the current instance of the complex number and the real value
     * given in argument
     *
     * @param realVal real number that is to be multiplied
     * @return Product of the complex number and the given real number
     */
    public Complex multiply(double realVal) {
        return new Complex(this.real * realVal, this.imaginary * realVal);
    }

    /**
     * Divides the current instance of the complex number and the one given in
     * argument [this instance / z]
     *
     * @param z Complex number that is to be divided
     * @return Ratio of the two complex number
     */
    public Complex divide(Complex z) {
        double re, im;
        re = ((this.real * z.real) + (this.imaginary * z.imaginary)) / (Math.pow(z.real, 2) + Math.pow(z.imaginary, 2));
        im = ((this.imaginary * z.real) - (this.real * z.imaginary)) / (Math.pow(z.real, 2) + Math.pow(z.imaginary, 2));
        return new Complex(re, im);
    }

    /**
     * Divides the current instance of the complex number and the real value
     * given in argument [this instance / realVal]
     *
     * @param realVal real number that is to be divided
     * @return ratio of the complex number and the given real number
     */
    public Complex divide(double realVal) {
        return new Complex(this.real / realVal, this.imaginary / realVal);
    }

    /**
     * Raises the current instance to the given power
     *
     * @param pow The value to which the complex number is to raised
     * @return Complex number raised to the power
     */
    public Complex pow(int pow) {
        Complex z = new Complex(this.real, this.imaginary);
        if (pow == 0) {
            z.imaginary = 1;
            z.real = 1;
        } else if (pow < 0) {
            for (int j = 1; j < Math.abs(pow); j++) {
                z = z.multiply(this);
            }
            multiplicativeInverse();
        } else {
            for (int j = 1; j < pow; j++) {
                z = z.multiply(this);
            }
        }
        return z;
    }

    /**
     * Calculates the square root of current instance of class Complex
     *
     * @return Square root of the current instance of class Complex
     */
    public Complex sqrt() {
        double re, im;
        double a = this.imaginary / Math.abs(this.imaginary);
        re = Math.sqrt((this.modulus() + this.real) / 2);
        im = ((this.imaginary == 0) ? 1 : a) * (Math.sqrt((this.modulus() - this.real) / 2));
        return new Complex(re, im);
    }

    /**
     * Calculate the multiplicative inverse of the current instance
     *
     * @return Multiplicative inverse of the current instance
     */
    public Complex multiplicativeInverse() {
        return new Complex(this.real / (Math.pow(this.real, 2) + Math.pow(this.imaginary, 2)),
                -this.imaginary / (Math.pow(this.real, 2) + Math.pow(this.imaginary, 2)));
    }

    /**
     * Calculates the conjugate of the current instance
     *
     * @return Conjugate of the current instance
     */
    public Complex conjugate() {
        return new Complex(this.real, -this.imaginary);
    }

    /**
     * Calculates the modulus of the current instance of class Complex
     *
     * @return modulus of the current instance of class complex
     */
    public double modulus() {
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginary, 2));
    }

    /**
     * Calculates the argument of the current instance of class Complex
     * representing a complex number
     *
     * @return Arguments of the current instance of class Complex
     */
    public double arg() {
        if (this.real < 0 && this.imaginary == 0) {
            return Math.PI;
        }
        return Math.atan(this.imaginary / this.real);
    }

    /**
     * Checks if the given instance of the Complex is equal with the current
     * instance of class Complex. Returns {@code true} if both the real and
     * imaginary part of the complex numbers are equal else returns
     * {@code false}
     *
     * @param z Instance of class Complex of which equality is to be tested with
     * the current instance
     * @return {@code true} if the complex numbers are equal and {@code false}
     * if the complex numbers are unequal
     */
    public boolean equals(Complex z) {
        return this.real == z.real && this.imaginary == z.imaginary;
    }
}
