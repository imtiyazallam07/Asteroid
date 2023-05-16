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
package org.asteroid;

import java.util.ArrayList;
import java.util.List;

/**
 * It helps in tasks related to string and character
 *
 * @author Imtiyaz Allam
 */
public final class Text {

    /**
     * It capitalize the first letter of the given string. In this method first
     * the data is converted to lower case and then the first character is
     * converted to upper case
     *
     * @param str Value on which operation is to be performed
     * @return The given string with all the char in lower case and First
     * character in upper case.
     */
    public static String capitaliseFirstChar(String str) {
        String line;
        line = str.toLowerCase();
        String upper_case_line = "";
        java.util.Scanner lineScan = new java.util.Scanner(line);
        while (lineScan.hasNext()) {
            String word = lineScan.next();
            upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        line = (upper_case_line.trim());
        return line;
    }

    /**
     * checks if the char is null
     *
     * @param chr Value on which operation is to be performed
     * @return <code>true</code> if the value in variable <code>chr</code> is
     * <code>null</code>
     */
    public static boolean isEmpty(char chr) {
        return chr == '\0';
    }

    /**
     * 
     * 
     * @param s
     * @return 
     */
    public static String toKebabCase(String s) {
        if(doesContainsSpecialChar(s))
            throw new InvalidCharacterFoundException();
        return s.toLowerCase().replace(' ', '-');
    }

    public static String toCamelCase(String s) {
        if(doesContainsSpecialChar(s))
            throw new InvalidCharacterFoundException();
        return toggleCaseAt(capitaliseEachWord(s), 0).replace(" ", "");
    }

    public static String toSnakeCase(String s) {
        if(doesContainsSpecialChar(s))
            throw new InvalidCharacterFoundException();
        return s.toLowerCase().replace(' ', '_');
    }

    public static String toUpperSnakeCase(String s) {
        if(doesContainsSpecialChar(s))
            throw new InvalidCharacterFoundException();
        return s.toUpperCase().replace(' ', '_');
    }

    public static String toPascalCase(String s) {
        if(doesContainsSpecialChar(s))
            throw new InvalidCharacterFoundException();
        return capitaliseEachWord(s).replace(" ", "");
    }

    public static String toggleCaseAt(String s, int index) {
        if(index < 0)
            index = s.length() - index;
        if(index < 0)
            throw new StringIndexOutOfBoundsException("Invalid index");
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (i == index) {
                str[i] = Character.isUpperCase(str[i])
                        ? Character.toLowerCase(str[i])
                        : Character.toUpperCase(str[i]);
            }
        }
        return String.valueOf(str);
    }
    
    /**
     * Check if the given string contains any special character
     * 
     * @param s string to check if it contains any special character
     * @return {@code true} if it contains special character else {@code false}
     */
    public static boolean doesContainsSpecialChar(String s) {
        for(int i = 0; i < s.length(); i++){
            if(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i)) || Character.isWhitespace(s.charAt(i)))
                continue;
            return true;
        }
        return false;
    }
    
    /**
     * Replace all special characters in the string with the given character
     * 
     * @param str String with special characters
     * @param ch Character to replace with special character
     * @return String with special character replaced with given character
     */
    public static String replaceSpecialCharacters(String str, char ch) {
        char[] a = str.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if(!Character.isLetterOrDigit(a[i]))
                a[i] = ch;
        }
        return new String(a);
    }
    
    /**
     * Replace all special characters in the string with the given string. 
     * 
     * @param str1 String with special characters
     * @param str2 String to replace with special character
     * @return String with special character replaced with given string
     */
    public static String replaceSpecialCharacters(String str1, String str2) {
        str1= replaceSpecialCharacters(str1, (char) 1);
        return str1.replace(Character.toString((char) 1), str2);
    }

    /**
     * checks if the string is empty or null
     *
     * @param str Value on which operation is to be performed
     * @return <code>true</code> if the value in variable <code>str</code> is
     * <code>null</code> or empty
     */
    public static boolean isEmpty(String str) {
        if (str == null) {
            return true;
        } else {
            return str.equals("");
        }
    }

    /**
     * It capitalize the first letter in each word in the given string. In this
     * method first the data is converted to lower case and then the first
     * character of each word is converted to upper case.
     *
     * @param str Value on which operation is to be performed
     * @return String with every character in lower case other than the first
     * character of each word
     */
    public static String capitaliseEachWord(String str) {
        String line;
        line = str.toLowerCase();
        String upper_case_line = "";
        java.util.Scanner lineScan = new java.util.Scanner(line);
        while (lineScan.hasNext()) {
            String word = lineScan.next();
            upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        line = (upper_case_line.trim());
        return line;
    }

    /**
     * It checks if the character is a digit or not
     *
     * @param str Value on which operation is to be performed
     * @return <code>true</code> if the value in variable <code>str</code> is a
     * digit
     */
    public static boolean isDigit(char str) {
        return Character.isDigit(str);
    }

    /**
     * It checks for white space
     *
     * @param str Value on which operation is to be performed
     * @return <code>true</code> if the value in variable <code>str</code> is a
     * white space
     */
    public static boolean isWhitespace(char str) {
        return Character.isWhitespace(str);
    }

    /**
     * It checks if the string is a palindrome or not
     *
     * @param str Value on which operation is to be performed
     * @return <code>true</code> if the value in <code>str</code> is a
     * palindrome
     */
    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    /**
     * It toggle the case of the given given string
     *
     * @param s Value on which operation is to be performed
     * @return String with toggled case of value in <code>s</code>
     */
    public static String toggleCase(String s) {
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length; i++) {
            str[i] = Character.isUpperCase(str[i])
                    ? Character.toLowerCase(str[i])
                    : Character.toUpperCase(str[i]);
        }
        return String.valueOf(str);
    }

    /**
     * It returns the ASCII of the characters in the string
     *
     * @param str Value on which operation is to be performed
     * @return Value of the variable <code>str</code> in ASCII
     */
    public static byte[] toAscii(String str) {
        byte[] bytes = str.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        return bytes;
    }
    
    /**
     * Converts the given string into binary. Each character in the string is present separately in the array
     * 
     * @param str String whose character are to be converted to binary
     * @return Binary representation of each character of string in an array
     */
    public static String[] toBinary(String str) {
        byte[] bytes = str.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        String[] bin = new String[bytes.length];
        for(int i = 0; i < bytes.length; i++)
            bin[i] = Integer.toBinaryString(bytes[i]);
        return bin;
    }

    /**
     * It returns the binary value of the given character
     *
     * @param a Value on which operation is to be performed
     * @return Value of the variable <code>a</code> in ASCII
     */
    public static String toBinary(char a) {
        return (Integer.toBinaryString(a));
    }

    /**
     * It checks if the string has a single character or not
     *
     * @param a Value on which operation is to be performed
     * @return <code>true</code> if the value in variable <code>a</code> is
     * single character
     */
    public static boolean isSingleChar(String a) {
        return a.length() == 1;
    }

    /**
     * It checks if the character is a vowel or not
     *
     * @param a Value on which operation is to be performed
     * @return <code>true</code> if the value in variable <code>a</code> is a
     * vowel
     */
    public static boolean isVowel(char a) {
        switch (a) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;
        }
    }

    /**
     * It checks if the character is a consonant or not
     *
     * @param a Value on which operation is to be performed
     * @return <code>true</code> if the value in variable <code>a</code> is a
     * consonant
     */
    public static boolean isConsonant(char a) {
        if (isSpecialChar(a)) {
            return !isVowel(a);
        } else {
            return false;
        }
    }

    /**
     * It checks if the character is a special character or not
     *
     * @param a Value on which operation is to be performed
     * @return <code>true</code> if the value in variable <code>a</code> is
     * special character
     */
    public static boolean isSpecialChar(char a) {
        a = (Character.toString(a).toLowerCase()).charAt(0);
        return !((a > 'a' && a < 'z') || (a > '0' && a < '9'));

    }

    /**
     * It reverse the given text value
     *
     * @param str Value on which operation is to be performed
     * @return The value in variable <code>str</code> reversed
     */
    public static String reverseText(String str) {
        byte[] strAsByteArray = str.getBytes();
        byte[] result = new byte[strAsByteArray.length];
        for (int i = 0; i < strAsByteArray.length; i++) {
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        }
        return (new String(result));
    }

    /**
     * It returns a random string
     *
     * @param alphabet From these given alphabets the random text is generated
     * @param length Length for making the random text
     * @return random string
     */
    public static String getRandomString(String alphabet, int length) {
        StringBuilder sb = new StringBuilder();
        java.util.Random random = new java.util.Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        return sb.toString();
    }

    /**
     * It returns a random string
     *
     * @param length Length for making the random text
     * @return random string
     */
    public static String getRandomString(int length) {
        String alphabet = "~`1234567890!@#$%^&*()_+-=qwertyuioplkjhgfdsamnbvcxz,./'\\[]QWERTYUIOP{}ASDFGHJKL:\"|ZXCVBNM<>?\t ";
        StringBuilder sb = new StringBuilder();
        java.util.Random random = new java.util.Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        return sb.toString();
    }

    /**
     * It returns a random string
     *
     * @return random string
     */
    public static String getRandomString() {
        String alphabet = "~`1234567890!@#$%^&*()_+-=qwertyuioplkjhgfdsamnbvcxz,./'\\[]QWERTYUIOP{}ASDFGHJKL:\"|ZXCVBNM<>?\t ";
        StringBuilder sb = new StringBuilder();
        java.util.Random random = new java.util.Random();
        int length = (int) (10 * Math.random() + 1);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        return sb.toString();
    }

    /**
     * It checks if the character is in uppercase or not
     *
     * @param a Value on which operation is to be performed
     * @return checks if the character is in upper case
     */
    public static boolean isInUpperCase(char a) {
        return (a >= 'A' && a <= 'Z');
    }

    /**
     * It checks if the character is in lowercase or not
     *
     * @param a Value on which operation is to be performed
     * @return checks if the character is in lower case
     */
    public static boolean isInLowerCase(char a) {
        return !isInUpperCase(a);
    }

    /**
     * It checks if the string is in lowercase or not
     *
     * @param a Value on which operation is to be performed
     * @return checks if the string is in lower case
     */
    public static boolean isInLowerCase(String a) {
        return a.equals(a.toLowerCase());
    }

    /**
     * It checks if the string is in lowercase or not
     *
     * @param a Value on which operation is to be performed
     * @return checks if the string is in upper case
     */
    public static boolean isInUpperCase(String a) {
        return a.equals(a.toUpperCase());
    }

    /**
     * It checks if the string contains the given string
     *
     * @param word The string in which the value of <code>check</code> is to be
     * searched
     * @param check The string to search for
     * @return <code>true</code> if the value in variable <code>check</code> is
     * found in the variable <code>word</code>
     */
    public static boolean doesContains(String word, String check) {
        return word.contains(check);
    }

    /**
     * It checks if the string contains the given character
     *
     * @param word The string in which the value of <code>check</code> is to be
     * searched
     * @param check The char to search for
     * @return <code>true</code> if the value in variable <code>check</code> is
     * found in the variable <code>word</code>
     */
    public static boolean doesContains(String word, char check) {
        return word.contains(Character.toString(check));
    }

    /**
     * Collects all the indices of a given character in the given string. If the
     * given character does not exists in the given string the codes return an
     * empty array.
     *
     * @param text String in which the character is to be searched
     * @param ch Character that is to be searched in the given String
     * @return The indices of the occurrence of the given character in the
     * String
     */
    public static int[] getIndicesOf(String text, char ch) {
        List<Integer> indices = new ArrayList();
        char[] string = text.toCharArray();
        for (int i = 0; i < string.length; i++) {
            if (ch == string[i]) {
                indices.add(i);
            }
        }
        Object[] objArray = indices.toArray();
        int length = objArray.length;
        int intArray[] = new int[length];
        for (int i = 0; i < length; i++) {
            intArray[i] = (int) objArray[i];
        }
        return intArray;
    }

    /**
     * Replace words in a sentence (Case sensitive)
     *
     * @param sentence sentence in which word is to be replaced
     * @param word old word
     * @param newWord new word
     * @return sentence with all words replaced
     */
    public static String replaceWord(String sentence, String word, String newWord) {
        return sentence.replaceAll(word + " ", newWord + " ");
    }

    /**
     * Counts the number of words
     *
     * @param sentence sentence in which word is to be counted
     * @return number of words
     */
    public static int countWords(String sentence) {
        return getWords(sentence).length;
    }

    /**
     * Trims and remove multiple space
     *
     * @param str string on which operation is performed
     * @return trimmed and removed extra spaced string
     */
    public static String removeExtraSpace(String str) {
        str = str.trim();
        while (str.contains("  ")) {
            str = str.replace("  ", " ");
        }
        return str;
    }

    /**
     * Collects words in the sentence
     *
     * @param sentence string from which words is to be collected
     * @return words collected from the sentence
     */
    public static String[] getWords(String sentence) {
        sentence = removeExtraSpace(sentence);
        return (replaceSpecialCharacters(sentence, ' ').split(" "));
    }

    /**
     * Checks if the array is sorted in ascending or not
     *
     * @param arr array to check if it is sorted
     * @return returns true if the array is sorted in ascending order
     */
    public static boolean isSorted(char[] arr) {
        if (arr.length < 2) {
            return true;
        }
        char last = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < last) {
                return false;
            }
            last = arr[i];
        }
        return true;
    }

    /**
     * checks if the array is sorted in ascending or not ignoring case
     *
     * @param arr array to check if it is sorted
     * @return returns true if the array is sorted in ascending order ignoring
     * case
     */
    public static boolean isSortedIgnoreCase(char[] arr) {
        if (arr.length < 2) {
            return true;
        }
        char last = Character.toLowerCase(arr[0]);
        char current;
        for (int i = 0; i < arr.length; i++) {
            current = Character.toLowerCase(arr[i]);
            if (current < last) {
                return false;
            }
            last = arr[i];
        }
        return true;
    }

    /**
     * checks if the array is sorted in descending or not
     *
     * @param arr array to check if it is sorted
     * @return returns true if the array is sorted in descending order
     */
    public static boolean isSortedDecending(char[] arr) {
        if (arr.length < 2) {
            return true;
        }
        char last = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > last) {
                return false;
            }
            last = arr[i];
        }
        return true;
    }

    /**
     * checks if the array is sorted in descending or not ignoring case
     *
     * @param arr array to check if it is sorted
     * @return returns true if the array is sorted in descending order ignoring
     * case
     */
    public static boolean isSortedDecendingIgnoreCase(char[] arr) {
        if (arr.length < 2) {
            return true;
        }
        char last = Character.toLowerCase(arr[0]);
        char current;
        for (int i = 0; i < arr.length; i++) {
            current = Character.toLowerCase(arr[i]);
            if (current < last) {
                return false;
            }
            last = arr[i];
        }
        return true;
    }

    /**
     * checks if the array is sorted in ascending or not
     *
     * @param arr array to check if it is sorted
     * @return returns true if the array is sorted in ascending order
     */
    public static boolean isSorted(Character[] arr) {
        if (arr.length < 2) {
            return true;
        }
        char last = arr[0];
        for (Character arr1 : arr) {
            if (arr1 < last) {
                return false;
            }
            last = arr1;
        }
        return true;
    }

    /**
     * checks if the array is sorted in ascending or not ignoring case
     *
     * @param arr array to check if it is sorted
     * @return returns true if the array is sorted in ascending order ignoring
     * case
     */
    public static boolean isSortedIgnoreCase(Character[] arr) {
        if (arr.length < 2) {
            return true;
        }
        char last = Character.toLowerCase(arr[0]);
        char current;
        for (Character arr1 : arr) {
            current = Character.toLowerCase(arr1);
            if (current < last) {
                return false;
            }
            last = arr1;
        }
        return true;
    }

    /**
     * checks if the array is sorted in descending or not
     *
     * @param arr array to check if it is sorted
     * @return returns true if the array is sorted in descending order
     */
    public static boolean isSortedDecending(Character[] arr) {
        if (arr.length < 2) {
            return true;
        }
        char last = arr[0];
        for (Character arr1 : arr) {
            if (arr1 > last) {
                return false;
            }
            last = arr1;
        }
        return true;
    }

    /**
     * checks if the array is sorted in descending or not ignoring case
     *
     * @param arr array to check if it is sorted
     * @return returns true if the array is sorted in descending order ignoring
     * case
     */
    public static boolean isSortedDecendingIgnoreCase(Character[] arr) {
        if (arr.length < 2) {
            return true;
        }
        char last = Character.toLowerCase(arr[0]);
        char current;
        for (Character arr1 : arr) {
            current = Character.toLowerCase(arr1);
            if (current < last) {
                return false;
            }
            last = arr1;
        }
        return true;
    }

    /**
     * checks if the array is sorted in ascending or not
     *
     * @param arr array to check if it is sorted
     * @return returns true if the array is sorted in ascending order
     */
    public static boolean isSorted(String[] arr) {
        if (arr.length < 2) {
            return true;
        }
        String last = arr[0];
        for (String arr1 : arr) {
            if (arr1.compareTo(last) < 0) {
                return false;
            }
            last = arr1;
        }
        return true;
    }

    /**
     * checks if the array is sorted in descending or not
     *
     * @param arr array to check if it is sorted
     * @return returns true if the array is sorted in descending order
     */
    public static boolean isSortedDecending(String[] arr) {
        if (arr.length < 2) {
            return true;
        }
        String last = arr[0];
        for (String arr1 : arr) {
            if (arr1.compareTo(last) > 0) {
                return false;
            }
            last = arr1;
        }
        return true;
    }

    /**
     * checks if the array is sorted in ascending or not ignoring case
     *
     * @param arr array to check if it is sorted
     * @return returns true if the array is sorted in ascending order ignoring
     * case
     */
    public static boolean isSortedIgnoreCase(String[] arr) {
        if (arr.length < 2) {
            return true;
        }
        String last = arr[0];
        for (String arr1 : arr) {
            if (arr1.compareToIgnoreCase(last) < 0) {
                return false;
            }
            last = arr1;
        }
        return true;
    }

    /**
     * checks if the array is sorted in descending or not ignoring case
     *
     * @param arr array to check if it is sorted
     * @return returns true if the array is sorted in descending order ignoring
     * case
     */
    public static boolean isSortedDecendingIgnoreCase(String[] arr) {
        if (arr.length < 2) {
            return true;
        }
        String last = arr[0];
        for (String arr1 : arr) {
            if (arr1.compareToIgnoreCase(last) > 0) {
                return false;
            }
            last = arr1;
        }
        return true;
    }
}
