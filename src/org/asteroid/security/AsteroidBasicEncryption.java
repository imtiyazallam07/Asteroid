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
package org.asteroid.security;

/**
 * Encrypts or decrypts the text using Asteroid Basic Encryption. It is
 * recommended not to use this encryption for confidential data as it can be
 * easily decrypted.
 *
 * @author Imtiyaz Allam
 */
public class AsteroidBasicEncryption {

    /**
     * Encrypts a text using Asteroid Basic Encryption
     *
     * @param dec Text that is to be encrypted
     * @param key pass code
     * @return The text encrypted with Asteroid Basic Encryption
     */
    public static String encrypt(String dec, String key) {
        String res = Character.toString(key.charAt(0)) + dec + Character.toString(key.charAt(key.length() - 1));
        byte[] i = res.getBytes();
        for (int n = 0; i.length != n; n++)
            i[n] += key.length();
        return (new String(i) + (int) (10 * Math.random() + 25) + "==");
    }

    /**
     * Decrypts an asteroid basic encryption encrypted text
     *
     * @param enc Text that is to be decrypted
     * @param key Pass code
     * @return The Asteroid Basic Encryption encrypted text after decryption
     */
    public static String decrypt(String enc, String key) {
        byte[] i = enc.getBytes();
        for (int n = 0; i.length != n; n++)
            i[n] -= key.length();
        if (i[0] == key.charAt(0) && i[i.length - 5] == key.charAt(key.length() - 1)) {
            String res = new String(i);
            res = res.substring(1, (res.length() - 5));
            return res;
        }
        throw new InvalidPasscodeException();
    }
}
