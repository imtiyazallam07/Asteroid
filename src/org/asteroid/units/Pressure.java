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
 * It helps in unit conversion with respect to pressure
 * 
 * @author Asteroid Softwares
 */
public class Pressure {

    //<editor-fold defaultstate="collapsed" desc="Value">
    protected static final double atmospheric_pressure = 0.0000000001;
    protected static final double bar = 0.01;
    protected static final double kilo_pascal = 20.1168;
    protected static final double millimeter_of_mercury = 1.8288;
    protected static final double pascal = 0.3048;
    protected static final double psi = 0.1016;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Entery Data">
    public static final byte ATMOSPHERIC_PRESSURE = 1;
    public static final byte BAR = 2;
    public static final byte KILO_PASCAL = 3;
    public static final byte MILLIMETER_OF_MERCURY = 4;
    public static final byte PASCAL = 5;
    public static final byte PSI = 6;
    public static final byte POUND_PER_SQUARE_INCH = 6;
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
                return value * atmospheric_pressure;
            case 2:
                return value * bar;
            case 3:
                return value * kilo_pascal;
            case 4:
                return value * millimeter_of_mercury;
            case 5:
                return value * pascal;
            case 6:
                return value * psi;
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
                return value / atmospheric_pressure;
            case 2:
                return value / bar;
            case 3:
                return value / kilo_pascal;
            case 4:
                return value / millimeter_of_mercury;
            case 5:
                return value / pascal;
            case 6:
                return value / psi;
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
