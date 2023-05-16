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
 * Raised when the audio status is equals to the given command. Meaning audio is
 * being played but play command is given.
 *
 * @author Imtiyaz Allam
 */
public class StatusException extends RuntimeException {

    /**
     * Creates an instance of <code>StatusException</code> class with a
     * specified detailed message
     *
     * @param msg detailed message
     */
    public StatusException(String msg) {
        super(msg);
    }
    
    /**
     * Creates an instance of <code>StatusException</code> class without a detail message
     */
    public StatusException() {
        super();
    }
}
