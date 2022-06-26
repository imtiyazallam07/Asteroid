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
 * It helps in unit conversion with respect to Capacity
 *
 * @author Asteroid Softwares
 */
public class Capacity {

    //<editor-fold defaultstate="collapsed" desc="Value">
    protected static final double fluid_ounce = 0.0295735;
    protected static final double cup = 8 * fluid_ounce;
    protected static final double pint = 2 * cup;
    protected static final double quart = 2 * pint;
    protected static final double gallon = 16 * cup;
    protected static final double milliliter = 1 / 1000.0;
    protected static final double centiliter = 1 / 100.0;
    protected static final double deciliter = 1 / 10.0;
    protected static final double liter = 1.0;
    protected static final double decaliter = 10.0;
    protected static final double hectoliter = 100.0;
    protected static final double kiloliter = 1000.0;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Entery Data">
    public static final byte FLUID_OUNCE = 1;
    public static final byte CUP = 2;
    public static final byte PINT = 3;
    public static final byte QUART = 4;
    public static final byte GALLON = 5;
    public static final byte MILLILITER = 6;
    public static final byte CENTILITER = 7;
    public static final byte DECILITER = 8;
    public static final byte LITER = 9;
    public static final byte DECALITER = 10;
    public static final byte HECTOLITER = 11;
    public static final byte KILOLITER = 12;
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
                return value * fluid_ounce;
            case 2:
                return value * cup;
            case 3:
                return value * pint;
            case 4:
                return value * quart;
            case 5:
                return value * gallon;
            case 6:
                return value * milliliter;
            case 7:
                return value * centiliter;
            case 8:
                return value * deciliter;
            case 9:
                return value * liter;
            case 10:
                return value * decaliter;
            case 11:
                return value * hectoliter;
            case 12:
                return value * kiloliter;
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
                return value / fluid_ounce;
            case 2:
                return value / cup;
            case 3:
                return value / pint;
            case 4:
                return value / quart;
            case 5:
                return value / gallon;
            case 6:
                return value / milliliter;
            case 7:
                return value / centiliter;
            case 8:
                return value / deciliter;
            case 9:
                return value / liter;
            case 10:
                return value / decaliter;
            case 11:
                return value / hectoliter;
            case 12:
                return value / kiloliter;
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
