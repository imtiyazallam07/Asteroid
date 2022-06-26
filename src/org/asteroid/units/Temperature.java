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
 * It helps in unit conversion with respect to Temperature
 *
 * @author Asteroid Softwares
 */
public class Temperature {

    //<editor-fold defaultstate="collapsed" desc="Entery Data">
    public static final byte CELCIUS = 1;
    public static final byte FAHRENHEIT = 2;
    public static final byte KELVIN = 3;
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
                return value + 273.15;
            case 2:
                return (value - 32) * 5.0 / 9.0 + 273.15;
            case 3:
                return value;
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
                return value - 273.15;
            case 2:
                return (value - 273.15) * 9 / 5 + 32;
            case 3:
                return value;
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
