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

package org.asteroid.units;

/**
 * It helps in unit conversion with respect to Time
 *
 * @author Asteroid Softwares
 */
public class Time {

    //<editor-fold defaultstate="collapsed" desc="Value">
    protected static final double day = 86400.0;
    protected static final double hour = 3600.0;
    protected static final double microsecond = 0.000001;
    protected static final double millisecond = 0.001;
    protected static final double minute = 60;
    protected static final double second = 1.0;
    protected static final double week = 604800;
    protected static final double year = day * 365;
    protected static final double leap_year = day * 366;
    protected static final double month = day * 30;
    protected static final double decade = year * 10;
    protected static final double century = year * 100;
    protected static final double millennium = year * 1000;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Entery Data">
    public static final byte DAY = 1;
    public static final byte HOUR = 2;
    public static final byte MICROSECOND = 3;
    public static final byte MILLISECOND = 4;
    public static final byte MINUTE = 5;
    public static final byte SECOND = 6;
    public static final byte WEEK = 7;
    public static final byte YEAR = 8;
    public static final byte LEAP_YEAR = 9;
    public static final byte MONTH = 10;
    public static final byte DECADE = 11;
    public static final byte CENTURY = 12;
    public static final byte MILLENNIUM = 13;
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
                return value * day;
            case 2:
                return value * hour;
            case 3:
                return value * microsecond;
            case 4:
                return value * millisecond;
            case 5:
                return value * minute;
            case 6:
                return value * second;
            case 7:
                return value * week;
            case 8:
                return value * year;
            case 9:
                return value * leap_year;
            case 10:
                return value * month;
            case 11:
                return value * decade;
            case 12:
                return value * century;
            case 13:
                return value * millennium;
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
                return value / day;
            case 2:
                return value / hour;
            case 3:
                return value / microsecond;
            case 4:
                return value / millisecond;
            case 5:
                return value / minute;
            case 6:
                return value / second;
            case 7:
                return value / week;
            case 8:
                return value / year;
            case 9:
                return value / leap_year;
            case 10:
                return value / month;
            case 11:
                return value / decade;
            case 12:
                return value / century;
            case 13:
                return value / millennium;
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
