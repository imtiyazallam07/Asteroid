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

package org.asteroid;

/**
 * Accepting data from the user
 *
 * @author Asteroid Softwares
 */
public class Input extends Cases {

    private static String temp;
    private static long temp2;
    private static double temp3;
    public static int NO_LIMIT = -1;

    /**
     * It inputs data and returns in any types intelligently. It returns data as
     * an instance of <code>Object</code> class. The data needs to be converted
     * to required data type explicitly
     *
     * @param msg Message that is to be displayed as prompt
     * @return Accepted data in instance of <code>Object</code> class
     */
    public static Object input(String msg) {
        System.out.print(msg + " ");
        temp = (new java.util.Scanner(System.in)).nextLine();
        try {
            temp2 = Long.parseLong(temp);
            if (temp2 >= -128 && temp2 <= 127) {
                return Byte.parseByte(temp);
            } else if (temp2 >= -32768 && temp2 <= 32767) {
                return Short.parseShort(temp);
            } else if (temp2 >= -2147483648 && temp2 <= 2147483647) {
                return Integer.parseInt(temp);
            } else {
                return temp2;
            }

        } catch (NumberFormatException e) {
            try {
                temp3 = Double.parseDouble(temp);
                return temp3;
            } catch (NumberFormatException f) {
                if ((temp.equals("true")) || temp.equals("false")) {
                    return ((Boolean.parseBoolean(temp)));
                } else if (temp.length() == 1) {
                    return (temp.charAt(0));
                } else if (temp.length() == 0) {
                    return null;
                }
                return temp;
            }
        }
    }

    /**
     * Inputs multiple integer data
     *
     * @param limit Number of set of data to be accepted
     * @param msg Message that is to be displayed as prompt
     * @return Accepted data in form of a int array
     */
    public static int[] inputMultipleInt(int limit, String msg) {
        int[] var = new int[limit];
        for (int i = 0; i < limit; i++) {
            var[i] = inputInt(msg);
        }
        return var;
    }

    /**
     * Inputs multiple short data
     *
     * @param limit Number of set of data to be accepted
     * @param msg Display message
     * @return Accepted data in form of a short array
     */
    public static short[] inputMultipleShort(int limit, String msg) {
        short[] var = new short[limit];
        for (int i = 0; i < limit; i++) {
            var[i] = inputShort(msg);
        }
        return var;
    }

    /**
     * Inputs multiple byte data
     *
     * @param limit Number of set of data to be accepted
     * @param msg Message that is to be displayed as prompt
     * @return Accepted data in form of a byte array
     */
    public static byte[] inputMultipleByte(int limit, String msg) {
        byte[] var = new byte[limit];
        for (int i = 0; i < limit; i++) {
            var[i] = inputByte(msg);
        }
        return var;
    }

    /**
     * Inputs multiple long data
     *
     * @param limit Number of set of data to be accepted
     * @param msg Message that is to be displayed as prompt
     * @return Accepted data in form of a long array
     */
    public static long[] inputMultipleLong(int limit, String msg) {
        long[] var = new long[limit];
        for (int i = 0; i < limit; i++) {
            var[i] = inputLong(msg);
        }
        return var;
    }

    /**
     * Inputs multiple float data
     *
     * @param limit Number of set of data to be accepted
     * @param msg Message that is to be displayed as prompt
     * @return Accepted data in form of a float array
     */
    public static float[] inputMultipleFloat(int limit, String msg) {
        float[] var = new float[limit];
        for (int i = 0; i < limit; i++) {
            var[i] = inputFloat(msg);
        }
        return var;
    }

    /**
     * Inputs multiple double data
     *
     * @param limit Number of set of data to be accepted
     * @param msg Message that is to be displayed as prompt
     * @return Accepted data in form of a double array
     */
    public static double[] inputMultipleDouble(int limit, String msg) {
        double[] var = new double[limit];
        for (int i = 0; i < limit; i++) {
            var[i] = inputDouble(msg);
        }
        return var;
    }

    /**
     * Inputs multiple boolean data
     *
     * @param limit Number of set of data to be accepted
     * @param msg Message that is to be displayed as prompt
     * @return Accepted data in form of a boolean array
     */
    public static boolean[] inputMultipleBoolean(int limit, String msg) {
        boolean[] var = new boolean[limit];
        for (int i = 0; i < limit; i++) {
            var[i] = inputBoolean(msg);
        }
        return var;
    }

    /**
     * Inputs multiple Character data
     *
     * @param limit Number of set of data to be accepted
     * @param msg Message that is to be displayed as prompt
     * @return Accepted data in form of a char array
     */
    public static char[] inputMultipleChar(int limit, String msg) {
        char[] var = new char[limit];
        for (int i = 0; i < limit; i++) {
            var[i] = inputChar(msg);
        }
        return var;
    }

    /**
     * Inputs multiple String data
     *
     * @param limit Number of set of data to be accepted
     * @param msg Message that is to be displayed as prompt
     * @return Accepted data in form of a String array
     */
    public static String[] inputMultipleString(int limit, String msg) {
        String var = "";
        for (int i = 0; i < limit; i++) {
            var += inputString(msg) + " ";
        }
        return var.trim().split(" ");
    }

    /**
     * Inputs multiple String data with an exit keyword. If the entered data is
     * matched with exit code the loop breaks. The exit code is matched with
     * entered data ignoring case if the <code>ignoreCase</code> variable has
     * the value <code>true</code>
     *
     * @param limit Number of set of data to be accepted
     * @param msg Message that is to be displayed as prompt
     * @param exitKeyword The keyword which when matches with accepted data
     * breaks the loop
     * @param ignoreCase The keyword is matched with accepted data ignoring case
     * if the value in it is <code>true</code>
     * @return Accepted data in form of a String array
     */
    public static String[] inputMultipleString(int limit, String msg, String exitKeyword, boolean ignoreCase) {
        String var = "", var2;
        for (int i = 0; i != limit; i++) {
            var2 = inputString(msg);
            if (ignoreCase) {
                if (var2.equalsIgnoreCase(exitKeyword)) {
                    break;
                }
            } else if (var2.equals(exitKeyword)) {
                break;
            }
            var += var2 + " ";
        }
        return var.trim().split(" ");
    }

    /**
     * It inputs boolean data
     *
     * @param message Message that is to be displayed as prompt
     * @return Accepted data
     */
    public static boolean inputBoolean(String message) {
        boolean result = false;

        try {
            System.out.print(message + " ");
            result = (new java.util.Scanner(System.in)).nextBoolean();
        } catch (Exception ex) {
            throw new InvalidInputException("boolean", "String");
        }
        return result;
    }

    /**
     * It inputs byte data
     *
     * @param message Message that is to be displayed as prompt
     * @return Accepted data
     */
    public static byte inputByte(String message) {
        byte result2 = 0;

        try {
            System.out.print(message + " ");
            temp = (new java.util.Scanner(System.in)).next();
            result2 = Byte.parseByte(temp);
        } catch (NumberFormatException ex) {
            try {
                temp2 = Long.parseLong(temp);
            } catch (NumberFormatException e) {
                if (temp2 > 2147483647 || temp2 < -2147483648) {
                    throw new InvalidInputException("byte", "long");
                } else if (temp2 > 32767 || temp2 < -32768) {
                    throw new InvalidInputException("byte", "int");
                } else if (temp2 > 127 || temp2 < -128) {
                    throw new InvalidInputException("byte", "short");
                } else if (temp.contains(".")) {
                    throw new InvalidInputException("byte", "double");
                } else {
                    throw new InvalidInputException("byte", "String");
                }
            }
        }
        return result2;
    }

    /**
     * It inputs short data
     *
     * @param message Message that is to be displayed as prompt
     * @return Accepted data
     */
    public static short inputShort(String message) {
        short result2 = 0;
        System.out.print(message + " ");
        temp = (new java.util.Scanner(System.in)).next();
        try {
            result2 = Short.parseShort(temp);
        } catch (NumberFormatException ex) {
            try {
                temp2 = Long.parseLong(temp);
            } catch (NumberFormatException e) {
                if (temp2 > 2147483647 || temp2 < -2147483648) {
                    throw new InvalidInputException("short", "long");
                } else if (temp2 > 32767 || temp2 < -32768) {
                    throw new InvalidInputException("short", "int");
                } else if (temp.contains(".")) {
                    throw new InvalidInputException("short", "double");
                } else {
                    throw new InvalidInputException("short", "String");
                }
            }
        }
        return result2;
    }

    /**
     * It inputs int data
     *
     * @param message Message that is to be displayed as prompt
     * @return Accepted data
     */
    public static int inputInt(String message) {
        int result2 = 0;
        try {
            System.out.print(message + " ");
            temp = (new java.util.Scanner(System.in)).next();
            result2 = Integer.parseInt(temp);
        } catch (NumberFormatException ex) {
            try {
                temp2 = Long.parseLong(temp);
            } catch (NumberFormatException e) {
                if (temp2 > 2147483647 || temp2 < -2147483648) {
                    throw new InvalidInputException("int", "long");
                } else if (temp.contains(".")) {
                    throw new InvalidInputException("int", "double");
                } else {
                    throw new InvalidInputException("int", "String");
                }
            }
        }
        return result2;
    }

    /**
     * It inputs long data
     *
     * @param message Message that is to be displayed as prompt
     * @return Accepted data
     */
    public static long inputLong(String message) {
        long result2 = 0;
        try {
            System.out.print(message + " ");
            temp = (new java.util.Scanner(System.in)).next();
            result2 = Long.parseLong(temp);
        } catch (NumberFormatException ex) {
            if (temp.contains(".")) {
                throw new InvalidInputException("long", "double");
            } else {
                throw new InvalidInputException("long", "String");
            }
        }
        return result2;
    }

    /**
     * It inputs float data
     *
     * @param message Message that is to be displayed as prompt
     * @return Accepted data
     */
    public static float inputFloat(String message) {
        float result2 = 0;
        try {
            System.out.print(message + " ");
            temp = (new java.util.Scanner(System.in)).next();
            result2 = Float.parseFloat(temp);
        } catch (NumberFormatException ex) {
            long result = Long.parseLong(temp);
            if (result > 3.4028235E38 || result < 1.4E-45) {
                throw new InvalidInputException("float", "double");
            } else {
                throw new InvalidInputException("float", "String");
            }
        }
        return result2;
    }

    /**
     * It inputs double data
     *
     * @param message Message that is to be displayed as prompt
     * @return Accepted data
     */
    public static double inputDouble(String message) {
        double result = 0.0d;
        try {
            System.out.print(message + " ");
            result = (new java.util.Scanner(System.in)).nextFloat();
        } catch (Exception ex) {
            throw new InvalidInputException("double", "string");
        }
        return result;
    }

    /**
     * It inputs char data
     *
     * @param message Message that is to be displayed as prompt
     * @return Accepted data
     */
    public static char inputChar(String message) {
        char result = 0;
        try {
            System.out.print(message + " ");
            String dataInString = (new java.util.Scanner(System.in)).next();
            if (dataInString.length() != 1) {
                throw new InvalidInputException("char", "String");
            }
            result = dataInString.charAt(0);
        } catch (InvalidInputException ex) {
            throw new InvalidInputException("char", "String");
        }
        return result;
    }

    /**
     * It inputs string data
     *
     * @param message Message that is to be displayed as prompt
     * @return Accepted data
     */
    public static String inputString(String message) {
        String result = null;
        try {
            System.out.print(message + " ");
            result = (new java.util.Scanner(System.in)).nextLine();
        } catch (Exception ex) {
            throw new InvalidInputException("string", "");
        }
        return result;
    }

    /**
     * Inputs string data and changes the value of the accepted data with
     * respect to the specified case
     *
     * @param message Message that is to be displayed as prompt
     * @param stringCase The case to which the accepted data is to changed
     * @return The accepetd data with respect to specified case
     */
    public static String inputString(String message, byte stringCase) {
        String result = null;
        try {
            System.out.print(message + " ");
            result = (new java.util.Scanner(System.in)).nextLine();
        } catch (Exception ex) {
            throw new InvalidInputException("string", "");
        }
        switch (stringCase) {
            case 0:
                result = result.toUpperCase();
                break;
            case 1:
                result = result.toLowerCase();
                break;
            case 2:
                result = org.asteroid.Text.toggleCase(result);
                break;
            case 3:
                result = org.asteroid.Text.capitaliseFirstChar(result);
                break;
            case 4:
                result = org.asteroid.Text.capitaliseEachWord(result);
                break;
            default:
                throw new UnknownStringCaseException(stringCase);
        }
        return result;
    }
}
