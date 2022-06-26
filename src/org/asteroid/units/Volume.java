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
 * It helps in unit conversion with respect to Volume
 * 
 * @author Asteroid Softwares
 */
public class Volume {

    //<editor-fold defaultstate="collapsed" desc="Value">
    protected static final double cubic_centimeter = 0.000001;
    protected static final double cubic_feet = 0.028316846592;
    protected static final double cubic_inch = 0.000016387064;
    protected static final double cubic_meter = 1.0;
    protected static final double cubic_yard = 0.764554857984;
    protected static final double UK_fluid_ounce = 0.0000284130625;
    protected static final double US_fluid_ounce = 0.0000295735295625;
    protected static final double UK_gallon = 0.00454609;
    protected static final double US_gallon = 0.003785411784;
    protected static final double liter = 0.001;
    protected static final double UK_pint = 0.00056826125;
    protected static final double US_pint = 0.000473176473;
    protected static final double UK_quart = 0.0011365225;
    protected static final double US_quart = 0.000946352946;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Entery Data">
    public static final byte CUBIC_CENTIMETER = 1;
    public static final byte CUBIC_FEET = 2;
    public static final byte CUBIC_INCH = 3;
    public static final byte CUBIC_METER = 4;
    public static final byte CUBIC_YARD = 5;
    public static final byte UK_FLUID_OUNCE = 6;
    public static final byte US_FLUID_OUNCE = 7;
    public static final byte UK_GALLON = 8;
    public static final byte US_GALLON = 9;
    public static final byte LITER = 10;
    public static final byte UK_PINT = 11;
    public static final byte US_PINT = 12;
    public static final byte UK_QUART = 13;
    public static final byte US_QUART = 14;
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
                return value * cubic_centimeter;
            case 2:
                return value * cubic_feet;
            case 3:
                return value * cubic_inch;
            case 4:
                return value * cubic_meter;
            case 5:
                return value * cubic_yard;
            case 6:
                return value * UK_fluid_ounce;
            case 7:
                return value * US_fluid_ounce;
            case 8:
                return value * UK_gallon;
            case 9:
                return value * US_gallon;
            case 10:
                return value * liter;
            case 11:
                return value * UK_pint;
            case 12:
                return value * US_pint;
            case 13:
                return value * UK_quart;
            case 14:
                return value * US_quart;
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
                return value / cubic_centimeter;
            case 2:
                return value / cubic_feet;
            case 3:
                return value / cubic_inch;
            case 4:
                return value / cubic_meter;
            case 5:
                return value / cubic_yard;
            case 6:
                return value / UK_fluid_ounce;
            case 7:
                return value / US_fluid_ounce;
            case 8:
                return value / UK_gallon;
            case 9:
                return value / US_gallon;
            case 10:
                return value / liter;
            case 11:
                return value / UK_pint;
            case 12:
                return value / US_pint;
            case 13:
                return value / UK_quart;
            case 14:
                return value / US_quart;
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
