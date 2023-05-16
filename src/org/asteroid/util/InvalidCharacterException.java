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
package org.asteroid.util;

/**
 * Raised when an invalid character is passed to <code>org.asteroid.util.Automation.type(String)</code>
 * 
 * @author Imtiyaz Allam
 */
public class InvalidCharacterException extends RuntimeException {

    /**
     * Creates a new instance of <code>InvalidCharacterException</code> with
     * default detail message.
     */
    public InvalidCharacterException() {
        super("Invalid chracter passed.");
    }

    /**
     * Constructs an instance of <code>InvalidCharacterException</code> with the
     * specified detail message.
     *
     * @param msg detail message.
     */
    public InvalidCharacterException(String msg) {
        super(msg);
    }
}
