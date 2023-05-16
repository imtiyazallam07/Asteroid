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
 * It helps in unit conversion with respect to Mass
 *
 * @author Imtiyaz Allam
 */
public class Mass {

    //<editor-fold defaultstate="collapsed" desc="Entry data">
    protected static final double carat = 0.2;
    protected static final double centigram = 0.01;
    protected static final double decigram = 0.1;
    protected static final double dekagram = 10.0;
    protected static final double gram = 1.0;
    protected static final double hectogram = 100.0;
    protected static final double kilogram = 1000.0;
    protected static final double long_ton = 1016046.9088;
    protected static final double milligram = 0.001;
    protected static final double ounce = 28.349523125;
    protected static final double pound = 453.59237;
    protected static final double short_ton = 907184.74;
    protected static final double stone = 6350.29318;
    protected static final double tonne = 1000000;
    protected static final double atomic_mass_unit = 1.66 * Math.pow(10, -27) * kilogram;
    protected static final double quintal = 100 * kilogram;
    protected static final double solar_mass = 2 * Math.pow(10, 30) * kilogram;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Entery Data">
    public static final byte CARAT = 1;
    public static final byte CENTIGRAM = 2;
    public static final byte DECIGRAM = 3;
    public static final byte DEKAGARM = 4;
    public static final byte GRAM = 5;
    public static final byte HECTOGRAM = 6;
    public static final byte KILOGRAM = 7;
    public static final byte LONG_TON = 8;
    public static final byte MILLIGRAM = 9;
    public static final byte OUNCE = 10;
    public static final byte POUND = 11;
    public static final byte SHORT_TON = 12;
    public static final byte STONE = 13;
    public static final byte TONNE = 14;
    public static final byte METRIC_TONNE = 14;
    public static final byte ATOMIC_MASS_UNIT = 15;
    public static final byte QUINTAL = 16;
    public static final byte SOLAR_MASS = 17;
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
                return value * carat;
            case 2:
                return value * centigram;
            case 3:
                return value * decigram;
            case 4:
                return value * dekagram;
            case 5:
                return value * gram;
            case 6:
                return value * hectogram;
            case 7:
                return value * kilogram;
            case 8:
                return value * long_ton;
            case 9:
                return value * milligram;
            case 10:
                return value * ounce;
            case 11:
                return value * pound;
            case 12:
                return value * short_ton;
            case 13:
                return value * stone;
            case 14:
                return value * tonne;
            case 15:
                return value * atomic_mass_unit;
            case 16:
                return value * quintal;
            case 17:
                return value * solar_mass;
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
                return value / carat;
            case 2:
                return value / centigram;
            case 3:
                return value / decigram;
            case 4:
                return value / dekagram;
            case 5:
                return value / gram;
            case 6:
                return value / hectogram;
            case 7:
                return value / kilogram;
            case 8:
                return value / long_ton;
            case 9:
                return value / milligram;
            case 10:
                return value / ounce;
            case 11:
                return value / pound;
            case 12:
                return value / short_ton;
            case 13:
                return value / stone;
            case 14:
                return value / tonne;
            case 15:
                return value / atomic_mass_unit;
            case 16:
                return value / quintal;
            case 17:
                return value / solar_mass;
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
