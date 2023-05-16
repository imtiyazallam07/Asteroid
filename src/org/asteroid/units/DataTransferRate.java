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

package org.asteroid.units;

/**
 * It helps in unit conversion with respect to Data Transfer rata
 *
 * @author Imtiyaz Allam
 */
public class DataTransferRate {

    //<editor-fold defaultstate="collapsed" desc="Value">
    protected static final double bit_per_second = 1.0;
    protected static final double kilobit_per_second = 1000;
    protected static final double kilobyte_per_second = 8000;
    protected static final double kibibit_per_second = 125000;
    protected static final double megabit_per_second = 131072;
    protected static final double megabyte_per_second = 1.25e+8;
    protected static final double mebibit_per_second = 1.342e+8;
    protected static final double gigabit_per_second = 124983489513.375;
    protected static final double gigabyte_per_second = 137420799999.97557068;
    protected static final double gibibit_per_second = 124983489513375.0;
    protected static final double terabit_per_second = 140718899199974.48438;
    protected static final double terabyte_per_second = 124983489513375.0;
    protected static final double tebibit_per_second = 140718899199974.48438;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Entery Data">
    public static final byte BIT_PER_SECOND = 1;
    public static final byte KILOBIT_PER_SECOND = 2;
    public static final byte KILOBYTE_PER_SECOND = 4;
    public static final byte KIBIBIT_PER_SECOND = 3;
    public static final byte MEGABIT_PER_SECOND = 5;
    public static final byte MEGABYTE_PER_SECOND = 6;
    public static final byte MEBIBIT_PER_SECOND = 7;
    public static final byte GIGABIT_PER_SECOND = 8;
    public static final byte GIGABYTE_PER_SECOND = 9;
    public static final byte GIBIBIT_PER_SECOND = 10;
    public static final byte TERABIT_PER_SECOND = 11;
    public static final byte TERABYTE_PER_SECOND = 12;
    public static final byte TEBIBYTE_PER_SECOND = 13;
    //</editor-fold>

    /**
     * It returns the value from a unit to SI unit
     *
     * @param unit The value from this unit to SI unit
     * @param value Value that is to be converted to SI Unit
     * @return Converted value
     */
    public static double toSI(byte unit, double value) {
        if (value < 0) {
            throw new NegetiveValueException();
        }
        switch (unit) {
            case 1:
                return value * bit_per_second;
            case 2:
                return value * kilobit_per_second;
            case 3:
                return value * kibibit_per_second;
            case 4:
                return value * kilobyte_per_second;
            case 5:
                return value * megabit_per_second;
            case 6:
                return value * megabyte_per_second;
            case 7:
                return value * megabit_per_second;
            case 8:
                return value * gigabit_per_second;
            case 9:
                return value * gigabyte_per_second;
            case 10:
                return value * gibibit_per_second;
            case 11:
                return value * terabit_per_second;
            case 12:
                return value * terabyte_per_second;
            case 13:
                return value * tebibit_per_second;
            default:
                throw new InvalidDataException();
        }
    }

    /**
     * It returns the value from SI to a given unit
     *
     * @param unit The value to this unit from SI unit
     * @param value Value that is to be converted from SI Unit
     * @return Converted value
     */
    public static double fromSI(byte unit, double value) {
        if (value < 0) {
            throw new NegetiveValueException();
        }
        switch (unit) {
            case 1:
                return value / bit_per_second;
            case 2:
                return value / kilobit_per_second;
            case 3:
                return value / kibibit_per_second;
            case 4:
                return value / kilobyte_per_second;
            case 5:
                return value / megabit_per_second;
            case 6:
                return value / megabyte_per_second;
            case 7:
                return value / megabit_per_second;
            case 8:
                return value / gigabit_per_second;
            case 9:
                return value / gigabyte_per_second;
            case 10:
                return value / gibibit_per_second;
            case 11:
                return value / terabit_per_second;
            case 12:
                return value / terabyte_per_second;
            case 13:
                return value / tebibit_per_second;
            default:
                throw new InvalidDataException();
        }
    }

    /**
     * It returns the value from a given unit to another given unit
     *
     * @param from from this unit
     * @param to to this unit
     * @param data value that is to be converted
     * @return Converted value
     */
    public static double convert(byte from, byte to, double data) {
        return fromSI(to, toSI(from, data));
    }
}
