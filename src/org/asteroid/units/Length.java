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
 * It helps in unit conversion with respect to length
 *
 * @author Imtiyaz Allam
 */
public class Length {

    //<editor-fold defaultstate="collapsed" desc="Value">
    protected static final double armstrong = 0.0000000001;
    protected static final double centimeter = 0.01;
    protected static final double chain = 20.1168;
    protected static final double fathom = 1.8288;
    protected static final double feet = 0.3048;
    protected static final double hand = 0.1016;
    protected static final double inch = 0.0254;
    protected static final double kilometer = 1000.0;
    protected static final double link = 0.201168;
    protected static final double meter = 1.0;
    protected static final double micron = 0.000001;
    protected static final double mile = 1609.344;
    protected static final double millimeter = 0.001;
    protected static final double nanometer = 0.000000001;
    protected static final double nautical_mile = 1852;
    protected static final double pica = 0.0042175176;
    protected static final double rod = 5.0292;
    protected static final double span = 0.2286;
    protected static final double yard = 0.9144;
    protected static final double light_year = 9.46 * Math.pow(10, 12) * kilometer;
    protected static final double parsec = light_year * 3.26;
    protected static final double astronomical_unit = 1.496 * Math.pow(10, 11);
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Entery Data">
    public static final byte ANGSTORM = 1;
    public static final byte CENTIMETER = 2;
    public static final byte CHAIN = 3;
    public static final byte FATHOM = 4;
    public static final byte FEET = 5;
    public static final byte HAND = 6;
    public static final byte INCH = 7;
    public static final byte KILOMETER = 8;
    public static final byte LINK = 9;
    public static final byte METER = 10;
    public static final byte MICRON = 11;
    public static final byte MILE = 12;
    public static final byte MILLIMETER = 13;
    public static final byte NANOMETER = 14;
    public static final byte NAUTICAL_MILE = 15;
    public static final byte PICA = 16;
    public final static byte ROD = 17;
    public final static byte SPAN = 18;
    public final static byte YARD = 19;
    public final static byte LIGHT_YEAR = 20;
    public final static byte PARSEC = 21;
    public final static byte ASTRONOMICAL_UNIT = 22;
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
                return value * armstrong;
            case 2:
                return value * centimeter;
            case 3:
                return value * chain;
            case 4:
                return value * fathom;
            case 5:
                return value * feet;
            case 6:
                return value * hand;
            case 7:
                return value * inch;
            case 8:
                return value * kilometer;
            case 9:
                return value * link;
            case 10:
                return value * meter;
            case 11:
                return value * micron;
            case 12:
                return value * mile;
            case 13:
                return value * millimeter;
            case 14:
                return value * nanometer;
            case 15:
                return value * nautical_mile;
            case 16:
                return value * pica;
            case 17:
                return value * rod;
            case 18:
                return value * span;
            case 19:
                return value * yard;
            case 20:
                return value * light_year;
            case 21:
                return value * parsec;
            case 22:
                return value * astronomical_unit;
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
                return value / armstrong;
            case 2:
                return value / centimeter;
            case 3:
                return value / chain;
            case 4:
                return value / fathom;
            case 5:
                return value / feet;
            case 6:
                return value / hand;
            case 7:
                return value / inch;
            case 8:
                return value / kilometer;
            case 9:
                return value / link;
            case 10:
                return value / meter;
            case 11:
                return value / micron;
            case 12:
                return value / mile;
            case 13:
                return value / millimeter;
            case 14:
                return value / nanometer;
            case 15:
                return value / nautical_mile;
            case 16:
                return value / pica;
            case 17:
                return value / rod;
            case 18:
                return value / span;
            case 19:
                return value / yard;
            case 20:
                return value / light_year;
            case 21:
                return value / parsec;
            case 22:
                return value / astronomical_unit;
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
