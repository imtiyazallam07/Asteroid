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
 * It helps in unit conversion with respect to Digital Storage
 *
 * @author Imtiyaz Allam
 */
public class DigitalStrorage {

    //<editor-fold defaultstate="collapsed" desc="Value">
    protected static final double bit = 0.125,
            kilobit = 125,
            kibibit = 128,
            megabit = 125000,
            mebibit = 131072,
            gigabit = 1.25e+8,
            gibibit = 1.342e+8,
            terabit = 124983489513.375,
            tebibit = 1.374e+11,
            petabit = 1.25e+14,
            pebibit = 1.407e+14,
            Byte = 1.0,
            kilobyte = 1000,
            kibibyte = 1024,
            megabyte = 1e+6,
            mebibyte = 1.049e+6,
            gigabyte = 1e+9,
            gibibyte = 1.074e+9,
            terabyte = 1e+12,
            tebibyte = 1.1e+12,
            petabyte = 1e+15,
            pebibyte = 1.126e+15;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Entery Data">
    public static final byte BIT = 1,
            KILOBIT = 2,
            KIBIBIT = 3,
            MEGABIT = 4,
            MEBIBIT = 5,
            GIGABIT = 6,
            GIBIBIT = 7,
            TERABIT = 8,
            TEBIBIT = 9,
            PETABIT = 10,
            PEBIBIT = 11,
            BYTE = 12,
            KILOBYTE = 13,
            KIBIBYTE = 14,
            MEGABYTE = 15,
            MEBIBYTE = 16,
            GIGABYTE = 17,
            GIBIBYTE = 18,
            TERABYTE = 19,
            TEBIBYTE = 20,
            PETABYTE = 21,
            PEBIBYTE = 22;

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
                return value * bit;
            case 2:
                return value * kilobit;
            case 3:
                return value * kibibit;
            case 4:
                return value * megabit;
            case 5:
                return value * mebibit;
            case 6:
                return value * gigabit;
            case 7:
                return value * gibibit;
            case 8:
                return value * terabit;
            case 9:
                return value * tebibit;
            case 10:
                return value * petabit;
            case 11:
                return value * pebibit;
            case 12:
                return value * Byte;
            case 13:
                return value * kilobyte;
            case 14:
                return value * kibibyte;
            case 15:
                return value * megabyte;
            case 16:
                return value * mebibyte;
            case 17:
                return value * gigabyte;
            case 18:
                return value * gibibyte;
            case 19:
                return value * terabyte;
            case 20:
                return value * tebibyte;
            case 21:
                return value * petabyte;
            case 22:
                return value * pebibyte;
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
                return value / bit;
            case 2:
                return value / kilobit;
            case 3:
                return value / kibibit;
            case 4:
                return value / megabit;
            case 5:
                return value / mebibit;
            case 6:
                return value / gigabit;
            case 7:
                return value / gibibit;
            case 8:
                return value / terabit;
            case 9:
                return value / tebibit;
            case 10:
                return value / petabit;
            case 11:
                return value / pebibit;
            case 12:
                return value / Byte;
            case 13:
                return value / kilobyte;
            case 14:
                return value / kibibyte;
            case 15:
                return value / megabyte;
            case 16:
                return value / mebibyte;
            case 17:
                return value / gigabyte;
            case 18:
                return value / gibibyte;
            case 19:
                return value / terabyte;
            case 20:
                return value / tebibyte;
            case 21:
                return value / petabyte;
            case 22:
                return value / pebibyte;
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
