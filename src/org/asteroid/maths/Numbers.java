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
package org.asteroid.maths;

import java.util.ArrayList;
import java.util.List;

/**
 * It has many helpful methods related to number
 *
 * @author Asteroid Softwares
 */
public class Numbers {

    /**
     * It checks if the number is even or not
     *
     * @param a Number to check
     * @return  <code>true</code> if the number is even
     */
    public static boolean isEven(int a) {
        return (a % 2 == 0);
    }

    /**
     * It checks if the number is odd or not
     *
     * @param a Number to check
     * @return <code>true</code> if the number is odd
     */
    public static boolean isOdd(int a) {
        return (a % 2 != 0);
    }

    /**
     * It checks if the number is negative or not
     *
     * @param a Number to check
     * @return <code>true</code> if the number is negative
     */
    public static boolean isNegative(int a) {
        return (a < 0);
    }

    /**
     * It checks if the number is positive or not
     *
     * @param a Number to check
     * @return <code>true</code> if the number is positive
     */
    public static boolean isPositive(int a) {
        return (a > 0);
    }

    /**
     * It checks if the string has only numeric data or not
     *
     * @param a String to check
     * @return <code>true</code> if the String contains only digits
     */
    public static boolean hasOnlyNumbers(String a) {
        try {
            Long.parseLong(a);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    /**
     * It checks if the number is prime or not
     *
     * @param a Number to check
     * @return <code>true</code> if the number is prime
     */
    public static boolean isPrime(int a) {
        boolean isPrime = true;
        if (a <= 1)
            isPrime = false;
        else
            for (int i = 2; i <= a / 2; i++)
                if ((a % i) == 0) {
                    isPrime = false;
                    break;
                }
        return isPrime;
    }

    /**
     * It returns the root over value of a given number. It takes root over and
     * number as input
     *
     * @param number The number of which root is to be found
     * @param rootOver Root over
     * @return Root over value of the given number
     */
    public static double root(double number, double rootOver) {
        if (number <= 0)
            return Math.sqrt(-1);
        return Math.pow(number, 1 / rootOver);
    }

    /**
     * It returns HCF of 2 numbers
     *
     * @param a first number
     * @param b second number
     * @return HCF
     */
    public static int HCF(int a, int b) {
        if (a <= 0 || b <= 0)
            throw new InvalidNumberException();
        int i, hcf = 0;
        for (i = 1; i <= a || i <= b; i++)
            if (a % i == 0 && b % i == 0)
                hcf = i;
        return hcf;
    }

    /**
     * It returns the prime ami of the given number
     *
     * @param n Number on which operation is to be performed
     * @return prime factor
     */
    public static Integer[] primeFactor(int n) {
        if (n <= 0)
            throw new InvalidNumberException();
        java.util.ArrayList<Integer> a = new java.util.ArrayList<>();
        while (n % 2 == 0) {
            a.add(2);
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2)
            while (n % i == 0) {
                a.add(i);
                n /= i;
            }
        if (n > 2)
            a.add(n);
        return (a.toArray(new Integer[0]));
    }

    /**
     * It returns the negative value of the given number
     *
     * @param number Number of which negative value is to be found
     * @return Negative value
     */
    public static byte getNegative(byte number) {
        return ((byte) (number * -1));
    }

    /**
     * It returns the negative value of the given number
     *
     * @param number Number of which negative value is to be found
     * @return Negative value
     */
    public static short getNegative(short number) {
        return ((short) (number * -1));
    }

    /**
     * It returns the negative value of the given number
     *
     * @param number Number of which negative value is to be found
     * @return Negative value
     */
    public static int getNegative(int number) {
        return (number * -1);
    }

    /**
     * It returns the negative value of the given number
     *
     * @param number Number of which negative value is to be found
     * @return Negative value
     */
    public static long getNegative(long number) {
        return ((long) number * -1);
    }

    /**
     * It returns the negative value of the given number
     *
     * @param number Number of which negative value is to be found
     * @return Negative value
     */
    public static float getNegative(float number) {
        return ((float) (number * -1.0));
    }

    /**
     * It returns the negative value of the given number
     *
     * @param number Number of which negative value is to be found
     * @return Negative value
     */
    public static double getNegative(double number) {
        return (number * -1.0);
    }

    /**
     * It returns the LCM of 2 given number
     *
     * @param n1 first number
     * @param n2 second number
     * @return LCM
     */
    public static int LCM(int n1, int n2) {
        if (n1 <= 0 || n2 <= 0)
            throw new InvalidNumberException();
        int lcm;
        lcm = (n1 > n2) ? n1 : n2;
        while (true) {
            if (lcm % n1 == 0 && lcm % n2 == 0)
                break;
            ++lcm;
        }
        return lcm;
    }

    /**
     * It checks if the numbers are Pythagorean triplet or not
     *
     * @param hypotenuse Hypotenuse
     * @param perpendicular Perpendicular
     * @param base base
     * @return
     */
    public static boolean arePythagoraeanTriplet(double hypotenuse, double perpendicular, double base) {
        if (hypotenuse <= 0 || perpendicular <= 0 || base <= 0)
            throw new InvalidNumberException();
        return (hypotenuse == Math.sqrt(Math.pow(base, 2) + Math.pow(perpendicular, 2)));
    }

    /**
     * It reverse the number
     *
     * @param num number to reverse
     * @return reverse number
     */
    public static int reverseNumber(int num) {
        int reversed = 0;
        if (num <= 0)
            throw new InvalidNumberException();
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    /**
     * It reverse the number
     *
     * @param num number to reverse
     * @return reverse number
     */
    public static byte reverseNumber(byte num) {
        byte reversed = 0;
        if (num <= 0)
            throw new InvalidNumberException();
        while (num != 0) {
            int digit = num % 10;
            reversed = (byte)(reversed * 10 + digit);
            num /= 10;
        }
        return reversed;
    }

    /**
     * It reverse the number
     *
     * @param num number to reverse
     * @return reverse number
     */
    public static short reverseNumber(short num) {
        short reversed = 0;
        if (num <= 0)
            throw new InvalidNumberException();
        while (num != 0) {
            int digit = num % 10;
            reversed = (short)(reversed * 10 + digit);
            num /= 10;
        }
        return reversed;
    }

    /**
     * It reverse the number
     *
     * @param num number to reverse
     * @return reverse number
     */
    public static long reverseNumber(long num) {
        long reversed = 0;
        if (num <= 0)
            throw new InvalidNumberException();
        while (num != 0) {
            int digit = (int)(num % 10);
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    /**
     * It reverse the number
     *
     * @param num number to reverse
     * @return reversed number
     */
    public static float reverseNumber(float num) {
        if (num <= 0)
            throw new InvalidNumberException();
        int reverseda = 0, numa, reversedb = 0, numb;
        String[] s = (Float.toString(num)).split("\\.");
        numa = Integer.parseInt(s[0]);
        numb = Integer.parseInt(s[1]);
        while (num != 0) {
            int digit = numa % 10;
            reverseda = reverseda * 10 + digit;
            num /= 10;
        }
        while (num != 0) {
            int digit = numb % 10;
            reversedb = reversedb * 10 + digit;
            num /= 10;
        }
        String str = Integer.toString(reverseda) + "." + Integer.toString(reversedb);
        return Float.parseFloat(str);
    }

    /**
     * It checks if the numbers is a perfect number or not
     *
     * @param num Number to check
     * @return  <code>true</code> if the number is a perfect number
     */
    public static boolean isPerfect(int num) {
        if (num <= 0)
            throw new InvalidNumberException();
        int sum = 0, i;
        for (i = 1; i <= num / 2; i++)
            if (num % i == 0)
                sum += i;
        return (sum == num);
    }

    /**
     * It checks if the numbers is a special number or not
     *
     * @param n Number to check
     * @return <code>true</code> if the number is special
     */
    public static boolean isSpecial(int n) {
        if (n <= 0)
            throw new InvalidNumberException();
        int i = n, factorialSum = 0;
        while (i > 0) {
            int digit = i % 10;
            i /= 10;
            factorialSum += getFactorial(digit);
        }
        return factorialSum == n;
    }

    /**
     * It returns the getFactorial of a given number
     *
     * @param n Number to check
     * @return factorial
     */
    public static long getFactorial(int n) {
        if (n <= 0)
            throw new InvalidNumberException();
        long factorial = 1;
        int i = n < 0 ? -n : n;
        while (i > 0) {
            factorial *= i;
            i--;
        }
        return n < 0 ? -factorial : factorial;
    }

    /**
     * It checks if the numbers is a palindrome or not
     *
     * @param no Number to check
     * @return <code>true</code> if the number is a palindrome
     */
    public static boolean isPalindrome(int no) {
        if (no <= 0)
            throw new InvalidNumberException();
        String str = Integer.toString(no);
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    /**
     * It checks if the numbers is a niven number or not
     *
     * @param n Number to check
     * @return <code>true</code> if the number is niven
     */
    public static boolean isNiven(int n) {
        if (n <= 0)
            throw new InvalidNumberException();
        int sum = 0;
        for (int temp = n; temp > 0; temp /= 10)
            sum += temp % 10;
        return (n % sum == 0);
    }

    /**
     * It checks if the numbers is a harshad or not
     *
     * @param n Number to check
     * @return <code>true</code> if the number is harshad
     */
    public static boolean isHarshad(int n) {
        return (isNiven(n));
    }

    /**
     * It checks if the numbers is an armstrong number or not
     *
     * @param number Number to check
     * @return <code>true</code> if the number is armstrong
     */
    public static boolean isArmstrong(int number) {
        if (number <= 0)
            throw new InvalidNumberException();
        int originalNumber, remainder, result = 0;
        originalNumber = number;
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        return (result == number);
    }

    /**
     * It checks if the numbers is a buzz number or not
     *
     * @param num Number to check
     * @return <code>true</code> if the number is buzz
     */
    public static boolean isBuzz(int num) {
        return (num % 10 == 7 || num % 7 == 0);
    }

    /**
     * It checks if the number is unique or not
     *
     * @param number Number to check
     * @return <code>true</code> if the number is unique
     */
    public static boolean isUnique(int number) {
        if (number <= 0)
            throw new InvalidNumberException();
        String str = Integer.toString(number);
        int length = str.length();
        int flag = 0, i, j;
        for (i = 0; i < length - 1; i++)
            for (j = i + 1; j < length; j++)
                if (str.charAt(i) == str.charAt(j)) {
                    flag = 1;
                    break;
                }
        return (flag == 0);
    }

    /**
     * It checks if the numbers is a kaprekar number or not
     *
     * @param n Number to check
     * @return <code>true</code> if the number is kaprekar
     */
    public static boolean isKaprekar(int n) {
        if (n <= 0)
            throw new InvalidNumberException();
        if (n == 1)
            return true;
        int sq_n = n * n;
        int count_digits = 0;
        while (sq_n != 0) {
            count_digits++;
            sq_n /= 10;
        }
        sq_n = n * n;
        for (int r_digits = 1; r_digits < count_digits; r_digits++) {
            int eq_parts = (int) Math.pow(10, r_digits);
            if (eq_parts == n)
                continue;
            int sum = sq_n / eq_parts + sq_n % eq_parts;
            if (sum == n)
                return true;
        }
        return false;
    }

    /**
     * It checks if the numbers is a perfect square or not
     *
     * @param num Number to check
     * @return <code>true</code> if the number is a perfect square
     */
    public static boolean isPerfectSqr(int num) {
        if (num <= 0)
            throw new InvalidNumberException();
        double a = Math.sqrt(num);
        return a % 1 == 0;
    }

    /**
     * It checks if the numbers is a lychrel number or not
     *
     * @param number Number to check
     * @return <code>true</code> if the number is Lychrel
     */
    public static boolean isLychrel(int number) {
        if (number <= 0)
            throw new InvalidNumberException();
        for (int i = 0; i < 200; i++) {
            number = number + reverseNumber(number);
            if (isPalindrome(number))
                return false;

        }
        return true;
    }

    /**
     * It checks if the numbers is a lucus number or not
     *
     * @param n Number to check
     * @return <code>true</code> if the number is Lucus
     */
    public static int isLucas(int n) {
        if (n < 0)
            throw new InvalidNumberException("The number is not valid.\nIt must be a and non-negetive value.");
        int a = 2, b = 1, c, i;
        if (n == 0)
            return a;
        for (i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    /**
     * It returns the number of digit in the given number
     *
     * @param n Number to check
     * @return Number of digits in the given number
     */
    public static int countDigit(int n) {
        int c = 0;
        n = Math.abs(n);
        while (n != 0) {
            c++;
            n = n / 10;
        }

        return c;
    }

    /**
     * It returns the number of digit in the given number
     *
     * @param n Number to check
     * @return Number of digits in the given number
     */
    public static int countDigit(short n) {
        int c = 0;
        n = (short) Math.abs(n);
        while (n != 0) {
            c++;
            n = (short) (n /  10);
        }

        return c;
    }

    /**
     * It returns the number of digit in the given number
     *
     * @param n Number to check
     * @return Number of digits in the given number
     */
    public static int countDigit(byte n) {
        int c = 0;
        n = (byte) Math.abs(n);
        while (n != 0) {
            c++;
            n = (byte) (n / 10);
        }

        return c;
    }

    /**
     * It returns the number of digit in the given number
     *
     * @param n Number to check
     * @return Number of digits in the given number
     */
    public static int countDigit(long n) {
        int c = 0;
        n = Math.abs(n);
        while (n != 0) {
            c++;
            n = n / 10;
        }

        return c;
    }

    /**
     * It checks if the numbers is a narcissistic number or not
     *
     * @param n Number to check
     * @return <code>true</code> if the number is Narcissistic
     */
    public static boolean isNarcissistic(int n) {
        if (n <= 0)
            throw new InvalidNumberException();
        int l = countDigit(n);
        int dup = n;
        int sum = 0;
        while (dup > 0) {
            sum += Math.pow(dup % 10, l);
            dup /= 10;
        }

        return (n == sum);
    }

    /**
     * It finds the sum of square of digits
     *
     * @param n The number on which the operation is to be performed
     * @return The sum of square of digits
     */
    private static int numSquareSum(int n) {
        if (n <= 0)
            throw new InvalidNumberException();
        int squareSum = 0;
        while (n != 0) {
            squareSum += (n % 10) * (n % 10);
            n /= 10;
        }
        return squareSum;
    }

    /**
     * It checks if the numbers is a happy number or not
     *
     * @param n Number to check
     * @return <code>true</code> if the number is a Happy Number
     */
    public static boolean isHappy(int n) {
        if (n <= 0)
            throw new InvalidNumberException();
        int slow, fast;
        slow = fast = n;
        do {
            slow = numSquareSum(slow);
            fast = numSquareSum(numSquareSum(fast));
        } while (slow != fast);
        return (slow == 1);
    }

    /**
     * It checks if the number is a magic number or not
     *
     * @param n Number to check
     * @return <code>true</code> if the number is a Magic number
     */
    public static boolean isMagic(int n) {
        if (n <= 0)
            throw new InvalidNumberException();
        int sum = 0;
        while (n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        return (sum == 1);
    }

    /**
     * It checks if the numbers is a disarum number or not
     *
     * @param num Number to check
     * @return <code>true</code> if the number is a disarum
     */
    public static boolean isDisarium(int num) {
        if (num <= 0)
            throw new InvalidNumberException();
        int sum = 0, rem, n;
        int len = countDigit(num);
        n = num;
        while (num > 0) {
            rem = num % 10;
            sum = sum + (int) Math.pow(rem, len);
            num = num / 10;
            len--;
        }
        return (sum == n);
    }

    /**
     * It checks if the numbers is pronic number or not
     *
     * @param num Number to check
     * @return <code>true</code> if the number is a pronic number
     */
    public static boolean isPronic(int num) {
        if (num <= 0)
            throw new InvalidNumberException();
        int ans = 0;
        for (int i = 0; i < num; i++)
            if (i * (i + 1) == num) {
                ans = 1;
                break;
            }
        return (ans == 1);
    }

    /**
     * It checks if the numbers is a heteromeric number or not
     *
     * @param num Number to check
     * @return <code>true</code> if the number is heteromeric
     */
    public static boolean isHeteromeric(int num) {
        return isPronic(num);
    }

    /**
     * It checks if the numbers is an automorphic number or not
     *
     * @param num Number to check
     * @return <code>true</code> if the number is automorphic
     */
    public static boolean isAutomorphic(int num) {
        if (num <= 0)
            throw new InvalidNumberException();
        int sq_num = num * num;
        String str_num = Integer.toString(num);
        String square = Integer.toString(sq_num);
        return (square.endsWith(str_num));
    }

    /**
     * It checks if the numbers is a duck number or not
     *
     * @param num Number to check
     * @return <code>true</code> if the number is a duck number
     */
    public static boolean isDuck(int num) {
        if (num <= 0)
            throw new InvalidNumberException();
        while (num > 0)
            if (num % 10 == 0)
                return true;
        return false;
    }

    /**
     * It checks if the numbers is an amicable number or not
     *
     * @param num1 First Number to check
     * @param num2 Second Number to check
     * @return <code>true</code> if the number is an amicable
     */
    public static boolean isAmicable(int num1, int num2) {
        if (num1 <= 0 || num2 <= 0)
            throw new InvalidNumberException();
        int sum_num1 = 0, sum_num2 = 0;
        for (int i = 1; i <= num1; i++)
            if (num1 % i == 0)
                sum_num1 += i;
        for (int i = 1; i <= num2; i++)
            if (num2 % i == 0)
                sum_num2 += i;
        return (sum_num1 == sum_num2);
    }

    /**
     * It checks if the numbers is a circular prime number or not
     *
     * @param number Number to check
     * @return <code>true</code> if the number is a circular prime number
     */
    public static boolean isCircularPrime(int number) {
        if (number <= 0)
            throw new InvalidNumberException();
        int count = 0, temp = number;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        int num = number;
        while (isPrime(num)) {
            int rem = num % 10;
            int div = num / 10;
            num = (int) ((Math.pow(10, count - 1)) * rem) + div;
            if (num == number)
                return true;
        }
        return false;
    }

    /**
     * It checks if the numbers is cyclic number or not
     *
     * @param number Number to check
     * @return <code>true</code> if the number is a cyclic number
     */
    public static boolean isCyclic(long number) {
        if (number <= 0)
            throw new InvalidNumberException();
        long num = number;
        int count = 0;
        int digit = (int) (num % 10);
        boolean allSame = true;
        while (num > 0) {
            count++;
            if (num % 10 != digit)
                allSame = false;
            num = num / 10;
        }
        if (allSame == true)
            return false;
        if (count % 2 == 0) {
            long halfPower = (long) Math.pow(10, count / 2);
            long firstHalf = number % halfPower;
            if (firstHalf == firstHalf && isCyclic(firstHalf))
                return false;
        }
        num = number;
        while (true) {
            long rem = num % 10;
            long div = num / 10;
            num = (long) (Math.pow(10, count - 1)) * rem + div;
            if (num == number)
                break;
            if (num % number != 0)
                return false;
        }
        return true;
    }

    /**
     * It checks if the number is a neon number or not
     *
     * @param number Number to check
     * @return <code>true</code> if the number is a neon number
     */
    public static boolean isNeon(int number) {
        if (number <= 0)
            throw new InvalidNumberException();
        int sq = number * number;
        int sum_digits = 0;
        while (sq != 0) {
            sum_digits = sum_digits + sq % 10;
            sq = sq / 10;
        }
        return (sum_digits == number);
    }

    /**
     * It checks if the numbers is mersenne number or not
     *
     * @param n Number to check
     * @return <code>true</code> if the number is mersenne
     */
    public static boolean isMersenne(int n) {
        if (n <= 0)
            throw new InvalidNumberException();
        int n1 = n + 1;
        int power;
        for (int i = 0;; i++) {
            power = (int) Math.pow(2, i);
            if (power > n1)
                break;
            else if (power == n1)
                return false;
        }
        return false;
    }

    /**
     * It checks if the numbers is a keith number or not
     *
     * @param number Number to check
     * @return <code>true</code> if the number is a keith number
     */
    public static boolean isKeith(int number) {
        if (number <= 0)
            throw new InvalidNumberException();
        java.util.ArrayList<Integer> terms = new java.util.ArrayList<>();
        int temp = number, n = 0;
        while (temp > 0) {
            terms.add(temp % 10);
            temp = temp / 10;
            n++;
        }
        java.util.Collections.reverse(terms);
        int next_term = 0, i = n;
        while (next_term < number) {
            next_term = 0;
            for (int j = 1; j <= n; j++)
                next_term += terms.get(i - j);

            terms.add(next_term);
            i++;
        }
        return (next_term == number);
    }

    /**
     * It checks if the numbers is a lucky number or not
     *
     * @param n Number to check
     * @return <code>true</code> if the number is a lucky number
     */
    public static boolean isLucky(int n) {
        if (n <= 0)
            throw new InvalidNumberException();
        int counter = 2;
        int next_position = n;
        if (counter > n)
            return true;
        if (n % counter == 0)
            return false;
        next_position -= next_position / counter;
        counter++;
        return isLucky(next_position);
    }

    /**
     * It returns the sum of digits. If the argument is negative, it is made
     * positive and the sum is calculated
     *
     * @param n Number to check
     * @return sum of digits
     */
    public static int getDigitSum(int n) {
        int sum = 0;
        n = Math.abs(n);
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        return sum;
    }

    /**
     * Finds largest number
     *
     * @param a numbers of which largest number is to be found
     * @return the largest number in the parameters
     */
    public static int max(int... a) {
        int max = a[0];
        for (int num : a)
            max = Math.max(max, num);
        return max;
    }

    /**
     * Finds largest number
     *
     * @param a numbers of which largest number is to be found
     * @return the largest number in the parameters
     */
    public static long max(long... a) {
        long max = a[0];
        for (long num : a)
            max = Math.max(max, num);
        return max;
    }

    /**
     * Finds largest number
     *
     * @param a numbers of which largest number is to be found
     * @return the largest number in the parameters
     */
    public static double max(double... a) {
        double max = a[0];
        for (double num : a)
            max = Math.max(max, num);
        return max;
    }

    /**
     * Finds largest number
     *
     * @param a numbers of which largest number is to be found
     * @return the largest number in the parameters
     */
    public static float max(float... a) {
        float max = a[0];
        for (float num : a)
            max = Math.max(max, num);
        return max;
    }

    /**
     * Finds smallest number
     *
     * @param a numbers of which largest number is to be found
     * @return the smallest number in the parameters
     */
    public static int min(int... a) {
        int min = a[0];
        for (int num : a)
            min = Math.min(min, num);
        return min;
    }

    /**
     * Finds smallest number
     *
     * @param a numbers of which largest number is to be found
     * @return the smallest number in the parameters
     */
    public static long min(long... a) {
        long min = a[0];
        for (long num : a)
            min = Math.min(min, num);
        return min;
    }

    /**
     * Finds largest number
     *
     * @param a numbers of which largest number is to be found
     * @return the smallest number in the parameters
     */
    public static double min(double... a) {
        double min = a[0];
        for (double num : a)
            min = Math.min(min, num);
        return min;
    }

    /**
     * Finds smallest number
     *
     * @param a numbers of which largest number is to be found
     * @return the smallest number in the parameters
     */
    public static float min(float... a) {
        float min = a[0];
        for (float num : a)
            min = Math.min(min, num);
        return min;
    }

    /**
     * Solves a quadratic equation a² + b + c = 0
     *
     * @param a a in the equation a² + b + c = 0
     * @param b b in the equation a² + b + c = 0
     * @param c c in the equation a² + b + c = 0
     * @return The 2 values of the quadratic equation
     */
    public static double[] solveQuadraticEquation(double a, double b, double c) {
        double[] result = new double[2];
        result[0] = -b + Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        result[0] = -b + Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        return result;
    }

    /**
     * returns a sequence of given number between a given range
     *
     * @param end integer before which sequence is to be returned. The sequence
     * doesn't include the <code>end</code> value
     * @param step increment between the two number in the sequence
     * @return a sequence of given number between a given range
     */
    public static Double[] range(int end, double step) {
        if (end < 0 || step <= 0)
            throw new InvalidNumberException();
        List<Double> lst = new ArrayList<>();
        double d = 0;
        Double[] dbl = new Double[lst.size()];
        do
            if (d < end) {
                lst.add(d);
                d += step;
            } else
                break;
        while (true);
        return lst.toArray(dbl);
    }

    /**
     * returns a sequence of given number between a given range
     *
     * @param start integer starting from which the sequence is to be returned
     * @param end integer before which sequence is to be returned. The sequence
     * doesn't include the <code>end</code> value
     * @return a sequence of given number between a given range
     */
    public static Integer[] range(int start, int end) {
        if (end < 0)
            throw new InvalidNumberException();
        if (start > end)
            throw new InvalidNumberException("Starting value must be less than ending vale");
        List<Integer> lst = new ArrayList<>();
        int d = start;
        Integer[] dbl = new Integer[lst.size()];
        do
            if (d < end) {
                lst.add(d);
                d++;
            } else
                break;
        while (true);
        return lst.toArray(dbl);
    }

    /**
     * returns a sequence of given number between a given range
     *
     * @param end integer before which sequence is to be returned. The sequence
     * doesn't include the <code>end</code> value
     * @return a sequence of given number between a given range
     */
    public static Integer[] range(int end) {
        if (end < 0)
            throw new InvalidNumberException();
        List<Integer> lst = new ArrayList<>();
        int d = 0;
        Integer[] dbl = new Integer[lst.size()];
        do
            if (d < end) {
                lst.add(d);
                d++;
            } else
                break;
        while (true);
        return lst.toArray(dbl);
    }

    /**
     * returns a sequence of given number between a given range
     *
     * @param start integer starting from which the sequence is to be returned
     * @param end integer before which sequence is to be returned. The sequence
     * doesn't include the <code>end</code> value
     * @param step increment between the two number in the sequence
     * @return a sequence of given number between a given range
     */
    public static Double[] range(int start, int end, double step) {
        if (end < 0 || step <= 0)
            throw new InvalidNumberException();
        if (start > end)
            throw new InvalidNumberException("Starting value must be less than ending vale");
        List<Double> lst = new ArrayList<>();
        double d = start;
        Double[] dbl = new Double[lst.size()];
        do
            if (d < end) {
                lst.add(d);
                d += step;
            } else
                break;
        while (true);
        return lst.toArray(dbl);
    }

    /**
     * returns a sequence of given number between a given range
     *
     * @param start integer starting from which the sequence is to be returned
     * @param end integer before which sequence is to be returned. The sequence
     * doesn't include the <code>end</code> value
     * @param step increment between the two number in the sequence
     * @return a sequence of given number between a given range
     */
    public static Integer[] range(int start, int end, int step) {
        if (end < 0 || step <= 0)
            throw new InvalidNumberException();
        if (start > end)
            throw new InvalidNumberException("Starting value must be less than ending vale");
        List<Integer> lst = new ArrayList<>();
        int d = start;
        Integer[] dbl = new Integer[lst.size()];
        do
            if (d < end) {
                lst.add(d);
                d += step;
            } else
                break;
        while (true);
        return lst.toArray(dbl);
    }

    /**
     * checks if the array is sorted in ascending or not
     *
     * @param arr
     * @return returns true if the array is sorted in ascending order
     */
    public static boolean isSorted(int[] arr) {
        if (arr.length < 2)
            return true;
        int last = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < last)
                return false;
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
    public static boolean isSorted(Integer[] arr) {
        if (arr.length < 2)
            return true;
        int last = arr[0];
        for (Integer arr1 : arr) {
            if (arr1 < last)
                return false;
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
    public static boolean isSorted(short[] arr) {
        if (arr.length < 2)
            return true;
        short last = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < last)
                return false;
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
    public static boolean isSorted(Short[] arr) {
        if (arr.length < 2)
            return true;
        short last = arr[0];
        for (Short arr1 : arr) {
            if (arr1 < last)
                return false;
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
    public static boolean isSorted(long[] arr) {
        if (arr.length < 2)
            return true;
        long last = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < last)
                return false;
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
    public static boolean isSorted(Long[] arr) {
        if (arr.length < 2)
            return true;
        long last = arr[0];
        for (Long arr1 : arr) {
            if (arr1 < last)
                return false;
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
    public static boolean isSorted(byte[] arr) {
        if (arr.length < 2)
            return true;
        byte last = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < last)
                return false;
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
    public static boolean isSorted(Byte[] arr) {
        if (arr.length < 2)
            return true;
        byte last = arr[0];
        for (Byte arr1 : arr) {
            if (arr1 < last)
                return false;
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
    public static boolean isSorted(Double[] arr) {
        if (arr.length < 2)
            return true;
        double last = arr[0];
        for (Double arr1 : arr) {
            if (arr1 < last)
                return false;
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
    public static boolean isSorted(double[] arr) {
        if (arr.length < 2)
            return true;
        double last = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < last)
                return false;
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
    public static boolean isSorted(float[] arr) {
        if (arr.length < 2)
            return true;
        float last = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < last)
                return false;
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
    public static boolean isSorted(Float[] arr) {
        if (arr.length < 2)
            return true;
        float last = arr[0];
        for (Float arr1 : arr) {
            if (arr1 < last)
                return false;
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
    public static boolean isSortedDecending(int[] arr) {
        if (arr.length < 2)
            return true;
        int last = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > last)
                return false;
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
    public static boolean isSortedDecending(Integer[] arr) {
        if (arr.length < 2)
            return true;
        int last = arr[0];
        for (Integer arr1 : arr) {
            if (arr1 > last)
                return false;
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
    public static boolean isSortedDecending(short[] arr) {
        if (arr.length < 2)
            return true;
        short last = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > last)
                return false;
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
    public static boolean isSortedDecending(Short[] arr) {
        if (arr.length < 2)
            return true;
        short last = arr[0];
        for (Short arr1 : arr) {
            if (arr1 > last)
                return false;
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
    public static boolean isSortedDecending(long[] arr) {
        if (arr.length < 2)
            return true;
        long last = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > last)
                return false;
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
    public static boolean isSortedDecending(Long[] arr) {
        if (arr.length < 2)
            return true;
        long last = arr[0];
        for (Long arr1 : arr) {
            if (arr1 > last)
                return false;
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
    public static boolean isSortedDecending(byte[] arr) {
        if (arr.length < 2)
            return true;
        byte last = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > last)
                return false;
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
    public static boolean isSortedDecending(Byte[] arr) {
        if (arr.length < 2)
            return true;
        byte last = arr[0];
        for (Byte arr1 : arr) {
            if (arr1 > last)
                return false;
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
    public static boolean isSortedDecending(Double[] arr) {
        if (arr.length < 2)
            return true;
        double last = arr[0];
        for (Double arr1 : arr) {
            if (arr1 > last)
                return false;
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
    public static boolean isSortedDecending(double[] arr) {
        if (arr.length < 2)
            return true;
        double last = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > last)
                return false;
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
    public static boolean isSortedDecending(float[] arr) {
        if (arr.length < 2)
            return true;
        float last = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > last)
                return false;
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
    public static boolean isSortedDecending(Float[] arr) {
        if (arr.length < 2)
            return true;
        float last = arr[0];
        for (Float arr1 : arr) {
            if (arr1 > last)
                return false;
            last = arr1;
        }
        return true;
    }

    /**
     * gets the digit from the given index. Using a negative value counts the
     * index from last end of the number.
     *
     * @param num number from which digit is to be extracted
     * @param index index of the digit that is to be extracted
     * @return value at the given index
     */
    public static int getDigitAt(int num, int index) {
        int len = countDigit(num);
        int ori = index;
        System.out.println(len);
        if (index < 0)
            index = len + index;
        if (len <= index || index < 0)
            throw new NumberIndexOutOfBoundsException("Number index out of range: " + ori);
        List<Integer> in = new ArrayList<>();
        num = reverseNumber(num);
        while (num > 0) {
            in.add(num % 10);
            num /= 10;
        }
        return in.get(index);
    }

    /**
     * gets the digit from the given index. Using a negative value counts the
     * index from last end of the number.
     *
     * @param num number from which digit is to be extracted
     * @param index index of the digit that is to be extracted
     * @return value at the given index
     */
    public static long getDigitAt(long num, int index) {
        int len = countDigit(num);
        int ori = index;
        System.out.println(len);
        if (index < 0)
            index = len + index;
        if (len <= index || index < 0)
            throw new NumberIndexOutOfBoundsException("Number index out of range: " + ori);
        List<Long> in = new ArrayList<>();
        num = reverseNumber(num);
        while (num > 0) {
            in.add(num % 10);
            num /= 10;
        }
        return in.get(index);
    }

    /**
     * gets the digit from the given index. Using a negative value counts the
     * index from last end of the number.
     *
     * @param num number from which digit is to be extracted
     * @param index index of the digit that is to be extracted
     * @return value at the given index
     */
    public static int getDigitAt(short num, int index) {
        int len = countDigit(num);
        int ori = index;
        System.out.println(len);
        if (index < 0)
            index = len + index;
        if (len <= index || index < 0)
            throw new NumberIndexOutOfBoundsException("Number index out of range: " + ori);
        List<Integer> in = new ArrayList<>();
        num = reverseNumber(num);
        while (num > 0) {
            in.add(num % 10);
            num /= 10;
        }
        return in.get(index);
    }

    /**
     * gets the digit from the given index. Using a negative value counts the
     * index from last end of the number.
     *
     * @param num number from which digit is to be extracted
     * @param index index of the digit that is to be extracted
     * @return value at the given index
     */
    public static int getDigitAt(byte num, int index) {
        int len = countDigit(num);
        int ori = index;
        System.out.println(len);
        if (index < 0)
            index = len + index;
        if (len <= index || index < 0)
            throw new NumberIndexOutOfBoundsException("Number index out of range: " + ori);
        List<Integer> in = new ArrayList<>();
        num = reverseNumber(num);
        while (num > 0) {
            in.add(num % 10);
            num /= 10;
        }
        return in.get(index);
    }
}
