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
 * It helps in unit conversion with respect to Area
 *
 * @author Imtiyaz Allam
 */
public class Area {

    //<editor-fold defaultstate="collapsed" desc="Value">
    protected static final double acres = 4046.8564224;
    protected static final double hectare = 10000.0;
    protected static final double square_centimeter = 0.0001;
    protected static final double square_feet = 0.09290304;
    protected static final double square_inch = 0.00064516;
    protected static final double square_kilometer = 1000000.0;
    protected static final double square_meter = 1.0;
    protected static final double square_mile = 2589988.110336;
    protected static final double square_millimeter = 0.000001;
    protected static final double square_yard = 0.83612736;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Entery Data">
    public static final byte ACRES = 1;
    public static final byte HECTARE = 2;
    public static final byte SQUARE_CENTIMETER = 3;
    public static final byte SQUARE_FEET = 4;
    public static final byte SQUARE_INCH = 5;
    public static final byte SQUARE_KILOMETER = 6;
    public static final byte SQUARE_METER = 7;
    public static final byte SQUARE_MILE = 8;
    public static final byte SQUARE_MILLIMETER = 9;
    public static final byte SQUARE_YARD = 10;
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
                return value * acres;
            case 2:
                return value * hectare;
            case 3:
                return value * square_centimeter;
            case 4:
                return value * square_feet;
            case 5:
                return value * square_inch;
            case 6:
                return value * square_kilometer;
            case 7:
                return value * square_meter;
            case 8:
                return value * square_mile;
            case 9:
                return value * square_millimeter;
            case 10:
                return value * square_yard;
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
                return value / acres;
            case 2:
                return value / hectare;
            case 3:
                return value / square_centimeter;
            case 4:
                return value / square_feet;
            case 5:
                return value / square_inch;
            case 6:
                return value / square_kilometer;
            case 7:
                return value / square_meter;
            case 8:
                return value / square_mile;
            case 9:
                return value / square_millimeter;
            case 10:
                return value / square_yard;
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
