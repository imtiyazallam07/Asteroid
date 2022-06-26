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
 * It helps in unit conversion with respect to Energy
 *
 * @author Asteroid Softwares
 */
public class Energy {

    //<editor-fold defaultstate="collapsed" desc="Value">
    protected static final double british_thermal_unit = 1055.056;
    protected static final double calorie = 4.1868;
    protected static final double electron_volt = 1.60217653e-19;
    protected static final double foot_pound = 1.3558179483314;
    protected static final double joule = 1.0;
    protected static final double kilocalorie = 4186.8;
    protected static final double kilojoule = 1000.0;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Entery Data">
    public static final byte BRITISH_THERMAL_UNIT = 1;
    public static final byte CALORIE = 2;
    public static final byte ELECTRON_VOLT = 3;
    public static final byte FOOT_POUND = 4;
    public static final byte JOULE = 5;
    public static final byte KILOCALORIE = 6;
    public static final byte KILOJOULE = 7;
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
                return british_thermal_unit * value;
            case 2:
                return calorie * value;
            case 3:
                return electron_volt * value;
            case 4:
                return foot_pound * value;
            case 5:
                return joule * value;
            case 6:
                return kilocalorie * value;
            case 7:
                return kilojoule * value;
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
                return value / british_thermal_unit;
            case 2:
                return value / calorie;
            case 3:
                return value / electron_volt;
            case 4:
                return value / foot_pound;
            case 5:
                return value / joule;
            case 6:
                return value / kilocalorie;
            case 7:
                return value / kilojoule;
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
