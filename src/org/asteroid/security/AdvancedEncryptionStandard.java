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

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/**
 * It helps in encryption and decryption based of Advanced Encryption Standard
 *
 * @author Imtiyaz Allam
 */
public class AdvancedEncryptionStandard {

    private static SecretKeySpec secretKey;
    private static byte[] key;

    /**
     * It set the key
     *
     * @param myKey Pass code
     */
    private static void setKey(String myKey) {
        try {
            MessageDigest sha;
            key = myKey.getBytes("UTF-8");
            sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16);
            secretKey = new SecretKeySpec(key, "AES");
        } catch (UnsupportedEncodingException e) {
            throw new EncodingNotSupportedException();
        } catch (NoSuchAlgorithmException e) {
            throw new AlgorithmNotFoundException();
        }
    }

    /**
     * It encrypts the given text with Advanced Encryption Standard
     *
     * @param decryptedData Data that is to be encrypted
     * @param code key using which data is to be encrypt
     * @return Encrypted data
     */
    public static String encrypt(String decryptedData, String code) {
        try {
            setKey(code);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return Base64.getEncoder().encodeToString(cipher.doFinal(decryptedData.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e) {
            throw new EncodingNotSupportedException();
        } catch (InvalidKeyException e) {
            throw new InvalidPasscodeException();
        } catch (BadPaddingException e) {
            throw new InvalidPaddingException(false);
        } catch (NoSuchPaddingException e) {
            throw new InvalidPaddingException(true);
        } catch (IllegalBlockSizeException e) {
            throw new InvalidBlockException();
        } catch (NoSuchAlgorithmException e) {
            throw new AlgorithmNotFoundException();
        }
    }

    /**
     * It decrypts the entered encrypted data encrypted with Advanced Encryption
     * Standard
     *
     * @param encryptedData Data that is to be encrypted
     * @param code key using which data is to be decrypt
     * @return Decrypted data
     */
    public static String decrypt(String encryptedData, String code) {
        try {
            setKey(code);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return new String(cipher.doFinal(Base64.getDecoder().decode(encryptedData)));
        } catch (InvalidKeyException e) {
            throw new InvalidPasscodeException();
        } catch (BadPaddingException e) {
            throw new InvalidPaddingException(false);
        } catch (NoSuchPaddingException e) {
            throw new InvalidPaddingException(true);
        } catch (IllegalBlockSizeException e) {
            throw new InvalidBlockException();
        } catch (NoSuchAlgorithmException e) {
            throw new AlgorithmNotFoundException();
        }
    }
}
