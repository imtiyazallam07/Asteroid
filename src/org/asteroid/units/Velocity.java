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
 * It helps in unit conversion with respect to Velocity
 *
 * @author Imtiyaz Allam
 */
public class Velocity {

    //<editor-fold defaultstate="collapsed" desc="Value">
    protected static final double centimeter_per_second = 0.01;
    protected static final double feet_per_second = 0.3048;
    protected static final double kilometer_per_hour = 0.2777777777777778;
    protected static final double knot = 0.5144444444444444;
    protected static final double mach = 340.2933;
    protected static final double meter_per_second = 1.0;
    protected static final double miles_per_hour = 0.44704;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Entery Data">
    public static final byte CENTIMETER_PER_SECOND = 1;
    public static final byte FEET_PER_SECOND = 2;
    public static final byte KILOMETER_PER_HOUR = 3;
    public static final byte KNOT = 4;
    public static final byte MACH = 5;
    public static final byte METER_PER_SECOND = 6;
    public static final byte MILES_PER_HOUR = 7;
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
                return value * centimeter_per_second;
            case 2:
                return value * feet_per_second;
            case 3:
                return value * kilometer_per_hour;
            case 4:
                return value * knot;
            case 5:
                return value * mach;
            case 6:
                return value * meter_per_second;
            case 7:
                return value * miles_per_hour;
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
                return value / centimeter_per_second;
            case 2:
                return value / feet_per_second;
            case 3:
                return value / kilometer_per_hour;
            case 4:
                return value / knot;
            case 5:
                return value / mach;
            case 6:
                return value / meter_per_second;
            case 7:
                return value / miles_per_hour;
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
