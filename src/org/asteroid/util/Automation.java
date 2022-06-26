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
package org.asteroid.util;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asteroid Softwares
 */
public class Automation {

    private Robot robot = null;

    public static final int VK_ENTER = '\n';
    public static final int VK_BACK_SPACE = '\b';
    public static final int VK_TAB = '\t';
    public static final int VK_CANCEL = 3;
    public static final int VK_CLEAR = 12;
    public static final int VK_SHIFT = 16;
    public static final int VK_CONTROL = 17;
    public static final int VK_ALT = 18;
    public static final int VK_PAUSE = 19;
    public static final int VK_CAPS_LOCK = 20;
    public static final int VK_ESCAPE = 27;
    public static final int VK_SPACE = 32;
    public static final int VK_PAGE_UP = 33;
    public static final int VK_PAGE_DOWN = 34;
    public static final int VK_END = 35;
    public static final int VK_HOME = 36;
    public static final int VK_LEFT = 37;
    public static final int VK_UP = 38;
    public static final int VK_RIGHT = 39;
    public static final int VK_DOWN = 40;
    public static final int VK_COMMA = 44;
    public static final int VK_MINUS = 45;
    public static final int VK_PERIOD = 46;
    public static final int VK_SLASH = 47;
    public static final int VK_0 = 48;
    public static final int VK_1 = 49;
    public static final int VK_2 = 50;
    public static final int VK_3 = 51;
    public static final int VK_4 = 52;
    public static final int VK_5 = 53;
    public static final int VK_6 = 54;
    public static final int VK_7 = 55;
    public static final int VK_8 = 56;
    public static final int VK_9 = 57;
    public static final int VK_SEMICOLON = 59;
    public static final int VK_EQUALS = 61;
    public static final int VK_A = 65;
    public static final int VK_B = 66;
    public static final int VK_C = 67;
    public static final int VK_D = 68;
    public static final int VK_E = 69;
    public static final int VK_F = 70;
    public static final int VK_G = 71;
    public static final int VK_H = 72;
    public static final int VK_I = 73;
    public static final int VK_J = 74;//
    public static final int VK_K = 75;
    public static final int VK_L = 76;
    public static final int VK_M = 77;
    public static final int VK_N = 78;
    public static final int VK_O = 79;
    public static final int VK_P = 80;
    public static final int VK_Q = 81;
    public static final int VK_R = 82;
    public static final int VK_S = 83;
    public static final int VK_T = 84;
    public static final int VK_U = 85;
    public static final int VK_V = 86;
    public static final int VK_W = 87;
    public static final int VK_X = 88;
    public static final int VK_Y = 89;
    public static final int VK_Z = 90;
    public static final int VK_OPEN_BRACKET = 91;
    public static final int VK_BACK_SLASH = 92;
    public static final int VK_CLOSE_BRACKET = 93;
    public static final int VK_NUMPAD0 = 96;
    public static final int VK_NUMPAD1 = 97;
    public static final int VK_NUMPAD2 = 98;
    public static final int VK_NUMPAD3 = 99;
    public static final int VK_NUMPAD4 = 100;
    public static final int VK_NUMPAD5 = 101;
    public static final int VK_NUMPAD6 = 102;
    public static final int VK_NUMPAD7 = 103;
    public static final int VK_NUMPAD8 = 104;
    public static final int VK_NUMPAD9 = 105;
    public static final int VK_MULTIPLY = 106;
    public static final int VK_ADD = 107;
    public static final int VK_SEPARATER = 108;
    public static final int VK_SEPARATOR = VK_SEPARATER;
    public static final int VK_SUBTRACT = 109;
    public static final int VK_DECIMAL = 110;
    public static final int VK_DIVIDE = 111;//
    public static final int VK_DELETE = 127;
    public static final int VK_NUM_LOCK = 144;
    public static final int VK_SCROLL_LOCK = 145;
    public static final int VK_F1 = 112;
    public static final int VK_F2 = 113;
    public static final int VK_F3 = 114;
    public static final int VK_F4 = 115;
    public static final int VK_F5 = 116;
    public static final int VK_F6 = 117;
    public static final int VK_F7 = 118;
    public static final int VK_F8 = 119;
    public static final int VK_F9 = 120;
    public static final int VK_F10 = 121;
    public static final int VK_F11 = 122;
    public static final int VK_F12 = 123;//
    public static final int VK_F13 = 61440;
    public static final int VK_F14 = 61441;
    public static final int VK_F15 = 61442;
    public static final int VK_F16 = 61443;
    public static final int VK_F17 = 61444;
    public static final int VK_F18 = 61445;
    public static final int VK_F19 = 61446;
    public static final int VK_F20 = 61447;
    public static final int VK_F21 = 61448;
    public static final int VK_F22 = 61449;
    public static final int VK_F23 = 61450;
    public static final int VK_F24 = 65451;
    public static final int VK_PRINTSCREEN = 154;
    public static final int VK_INSERT = 155;
    public static final int VK_HELP = 156;
    public static final int VK_META = 157;
    public static final int VK_BACK_QUOTE = 192;
    public static final int VK_QUOTE = 222;
    public static final int VK_KP_UP = 224;
    public static final int VK_KP_DOWN = 225;
    public static final int VK_KP_LEFT = 226;
    public static final int VK_KP_RIGHT = 227;
    public static final int VK_DEAD_GRAVE = 128;
    public static final int VK_DEAD_ACUTE = 129;
    public static final int VK_DEAD_CIRCUMFLEX = 130;
    public static final int VK_DEAD_TILDE = 131;
    public static final int VK_DEAD_MACRON = 132;
    public static final int VK_DEAD_BREVE = 133;
    public static final int VK_DEAD_ABOVEDOT = 134;
    public static final int VK_DEAD_DIAERESIS = 135;
    public static final int VK_DEAD_ABOVERING = 136;
    public static final int VK_DEAD_DOUBLEACUTE = 137;
    public static final int VK_DEAD_CARON = 138;
    public static final int VK_DEAD_CEDILLA = 139;
    public static final int VK_DEAD_OGONEK = 140;
    public static final int VK_DEAD_IOTA = 141;
    public static final int VK_DEAD_VOICED_SOUND = 142;
    public static final int VK_DEAD_SEMIVOICED_SOUND = 143;
    public static final int VK_AMPERSAND = 150;
    public static final int VK_ASTERISK = 151;
    public static final int VK_QUOTEDBL = 152;
    public static final int VK_LESS = 153;
    public static final int VK_GREATER = 160;
    public static final int VK_BRACELEFT = 161;
    public static final int VK_BRACERIGHT = 162;
    public static final int VK_AT = 512;
    public static final int VK_COLON = 513;
    public static final int VK_CIRCUMFLEX = 514;
    public static final int VK_DOLLAR = 515;
    public static final int VK_EURO_SIGN = 516;
    public static final int VK_EXCLAMATION_MARK = 517;
    public static final int VK_INVERTED_EXCLAMATION_MARK = 518;
    public static final int VK_LEFT_PARENTHESIS = 519;
    public static final int VK_NUMBER_SIGN = 520;
    public static final int VK_PLUS = 521;
    public static final int VK_RIGHT_PARENTHESIS = 522;
    public static final int VK_UNDERSCORE = 523;
    public static final int VK_WINDOWS = 524;
    public static final int VK_CONTEXT_MENU = 525;
    public static final int VK_FINAL = 24;
    public static final int VK_NONCONVERT = 29;
    public static final int VK_ACCEPT = 30;
    public static final int VK_MODECHANGE = 31;
    public static final int VK_KANA = 21;
    public static final int VK_KANJI = 25;
    public static final int VK_ALPHANUMERIC = 240;
    public static final int VK_KATAKANA = 241;
    public static final int VK_HIRAGANA = 242;
    public static final int VK_FULL_WIDTH = 243;
    public static final int VK_HALF_WIDTH = 244;
    public static final int VK_ROMAN_CHARACTERS = 245;
    public static final int VK_ALL_CANDIDATES = 256;
    public static final int VK_PREVIOUS_CANDIDATE = 257;
    public static final int VK_CODE_INPUT = 258;
    public static final int VK_JAPANESE_KATAKANA = 259;
    public static final int VK_JAPANESE_HIRAGANA = 260;
    public static final int VK_JAPANESE_ROMAN = 261;
    public static final int VK_KANA_LOCK = 262;
    public static final int VK_INPUT_METHOD_ON_OFF = 263;
    public static final int VK_CUT = 65489;
    public static final int VK_COPY = 65485;
    public static final int VK_PASTE = 65487;
    public static final int VK_UNDO = 65483;
    public static final int VK_AGAIN = 65481;
    public static final int VK_FIND = 65488;
    public static final int VK_PROPS = 65482;
    public static final int VK_STOP = 65480;
    public static final int VK_COMPOSE = 65312;
    public static final int VK_ALT_GRAPH = 65406;
    public static final int VK_BEGIN = 65368;
    public static final int VK_UNDEFINED = 0;

    private List<Integer> lastPressed = new ArrayList<>();

    public Automation() {
        try {
            robot = new Robot();
        } catch (AWTException ex) {
        }

    }

    public void pressAndRelease(int vk) {
        if (!Automation.isValidVK(vk)) {
            throw new InvalidVirtualKeyException();
        }
        robot.keyPress(vk);
        robot.keyRelease(vk);
    }

    public void pressAndRelease(int vk, int pressDuration) {
        if (!Automation.isValidVK(vk)) {
            throw new InvalidVirtualKeyException();
        }
        robot.keyPress(vk);
        try {
            Thread.sleep(pressDuration);
        } catch (InterruptedException ex) {
            throw new FailedToFreezeException();
        }
        robot.keyRelease(vk);
    }

    public void press(int vk) {
        robot.keyPress(vk);
        lastPressed.add(vk);
    }

    public void release(int vk) {
        robot.keyRelease(vk);
        lastPressed.remove(lastPressed.lastIndexOf(vk));
    }

    public void release() {
        robot.keyRelease(lastPressed.get(lastPressed.size() - 1));
        lastPressed.remove(lastPressed.size() - 1);

    }

    public void pressAndReleaseEnter() {
        robot.keyPress(Automation.VK_ENTER);
        robot.keyPress(Automation.VK_ENTER);
    }

    public void pressAndReleaseEnter(int pressDuration) {
        robot.keyPress(Automation.VK_ENTER);
        try {
            Thread.sleep(pressDuration);
        } catch (InterruptedException ex) {
            throw new FailedToFreezeException();
        }
        robot.keyPress(Automation.VK_ENTER);
    }

    public void rotateMouseWheel(int rotateWheelAmt) {
        robot.mouseWheel(rotateWheelAmt);
    }

    public void rotateMouseWheel(int rotateWheelAmt, long interval) {
        for (int i = 0; i < rotateWheelAmt; i++) {
            if (i != 0)
                try {
                Thread.sleep(interval);
            } catch (InterruptedException ex) {
                throw new FailedToFreezeException();
            }
            robot.mouseWheel(1);

        }
    }

    public void pressAndReleaseLeftMouseButton() {
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public void pressAndReleaseMiddleMouseButton() {
        robot.mousePress(InputEvent.BUTTON2_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
    }

    public void pressAndReleaseRightMouseButton() {
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
    }

    public void pressAndReleaseLeftMouseButton(long duration) {
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        try {
            Thread.sleep(duration);
        } catch (InterruptedException ex) {
            throw new FailedToFreezeException();
        }
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public void pressAndReleaseMiddleMouseButton(long duration) {
        robot.mousePress(InputEvent.BUTTON2_DOWN_MASK);
        try {
            Thread.sleep(duration);
        } catch (InterruptedException ex) {
            throw new FailedToFreezeException();
        }
        robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
    }

    public void pressAndReleaseRightMouseButton(long duration) {
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        try {
            Thread.sleep(duration);
        } catch (InterruptedException ex) {
            throw new FailedToFreezeException();
        }
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
    }

    public void placeMouseCursorAt(int x, int y) {
        robot.mouseMove(x, y);
    }

    public void moveMouseCursorBy(int x, int y) {
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        if (MouseInfo.getPointerInfo().getLocation().x + x > size.getWidth() || MouseInfo.getPointerInfo().getLocation().x + y > size.getHeight()) {
            return;
        }
        robot.mouseMove(MouseInfo.getPointerInfo().getLocation().x + x, MouseInfo.getPointerInfo().getLocation().y + y);
    }

    public static boolean isValidVK(int vk) {
        switch (vk) {
            case VK_ENTER:
            case VK_BACK_SPACE:
            case VK_TAB:
            case VK_CANCEL:
            case VK_CLEAR:
            case VK_SHIFT:
            case VK_CONTROL:
            case VK_ALT:
            case VK_PAUSE:
            case VK_CAPS_LOCK:
            case VK_ESCAPE:
            case VK_SPACE:
            case VK_PAGE_UP:
            case VK_PAGE_DOWN:
            case VK_END:
            case VK_HOME:
            case VK_LEFT:
            case VK_UP:
            case VK_RIGHT:
            case VK_DOWN:
            case VK_COMMA:
            case VK_MINUS:
            case VK_PERIOD:
            case VK_SLASH:
            case VK_0:
            case VK_1:
            case VK_2:
            case VK_3:
            case VK_4:
            case VK_5:
            case VK_6:
            case VK_7:
            case VK_8:
            case VK_9:
            case VK_SEMICOLON:
            case VK_EQUALS:
            case VK_A:
            case VK_B:
            case VK_C:
            case VK_D:
            case VK_E:
            case VK_F:
            case VK_G:
            case VK_H:
            case VK_I:
            case VK_J:
            case VK_K:
            case VK_L:
            case VK_M:
            case VK_N:
            case VK_O:
            case VK_P:
            case VK_Q:
            case VK_R:
            case VK_S:
            case VK_T:
            case VK_U:
            case VK_V:
            case VK_W:
            case VK_X:
            case VK_Y:
            case VK_Z:
            case VK_OPEN_BRACKET:
            case VK_BACK_SLASH:
            case VK_CLOSE_BRACKET:
            case VK_NUMPAD0:
            case VK_NUMPAD1:
            case VK_NUMPAD2:
            case VK_NUMPAD3:
            case VK_NUMPAD4:
            case VK_NUMPAD5:
            case VK_NUMPAD6:
            case VK_NUMPAD7:
            case VK_NUMPAD8:
            case VK_NUMPAD9:
            case VK_MULTIPLY:
            case VK_ADD:
            case VK_SEPARATER:
            case VK_SUBTRACT:
            case VK_DECIMAL:
            case VK_DIVIDE:
            case VK_DELETE:
            case VK_NUM_LOCK:
            case VK_SCROLL_LOCK:
            case VK_F1:
            case VK_F2:
            case VK_F3:
            case VK_F4:
            case VK_F5:
            case VK_F6:
            case VK_F7:
            case VK_F8:
            case VK_F9:
            case VK_F10:
            case VK_F11:
            case VK_F12:
            case VK_F13:
            case VK_F14:
            case VK_F15:
            case VK_F16:
            case VK_F17:
            case VK_F18:
            case VK_F19:
            case VK_F20:
            case VK_F21:
            case VK_F22:
            case VK_F23:
            case VK_F24:
            case VK_PRINTSCREEN:
            case VK_INSERT:
            case VK_HELP:
            case VK_META:
            case VK_BACK_QUOTE:
            case VK_QUOTE:
            case VK_KP_UP:
            case VK_KP_DOWN:
            case VK_KP_LEFT:
            case VK_KP_RIGHT:
            case VK_DEAD_GRAVE:
            case VK_DEAD_ACUTE:
            case VK_DEAD_CIRCUMFLEX:
            case VK_DEAD_TILDE:
            case VK_DEAD_MACRON:
            case VK_DEAD_BREVE:
            case VK_DEAD_ABOVEDOT:
            case VK_DEAD_DIAERESIS:
            case VK_DEAD_ABOVERING:
            case VK_DEAD_DOUBLEACUTE:
            case VK_DEAD_CARON:
            case VK_DEAD_CEDILLA:
            case VK_DEAD_OGONEK:
            case VK_DEAD_IOTA:
            case VK_DEAD_VOICED_SOUND:
            case VK_DEAD_SEMIVOICED_SOUND:
            case VK_AMPERSAND:
            case VK_ASTERISK:
            case VK_QUOTEDBL:
            case VK_LESS:
            case VK_GREATER:
            case VK_BRACELEFT:
            case VK_BRACERIGHT:
            case VK_AT:
            case VK_COLON:
            case VK_CIRCUMFLEX:
            case VK_DOLLAR:
            case VK_EURO_SIGN:
            case VK_EXCLAMATION_MARK:
            case VK_INVERTED_EXCLAMATION_MARK:
            case VK_LEFT_PARENTHESIS:
            case VK_NUMBER_SIGN:
            case VK_PLUS:
            case VK_RIGHT_PARENTHESIS:
            case VK_UNDERSCORE:
            case VK_WINDOWS:
            case VK_CONTEXT_MENU:
            case VK_FINAL:
            case VK_NONCONVERT:
            case VK_ACCEPT:
            case VK_MODECHANGE:
            case VK_KANA:
            case VK_KANJI:
            case VK_ALPHANUMERIC:
            case VK_KATAKANA:
            case VK_HIRAGANA:
            case VK_FULL_WIDTH:
            case VK_HALF_WIDTH:
            case VK_ROMAN_CHARACTERS:
            case VK_ALL_CANDIDATES:
            case VK_PREVIOUS_CANDIDATE:
            case VK_CODE_INPUT:
            case VK_JAPANESE_KATAKANA:
            case VK_JAPANESE_HIRAGANA:
            case VK_JAPANESE_ROMAN:
            case VK_KANA_LOCK:
            case VK_INPUT_METHOD_ON_OFF:
            case VK_CUT:
            case VK_COPY:
            case VK_PASTE:
            case VK_UNDO:
            case VK_AGAIN:
            case VK_FIND:
            case VK_PROPS:
            case VK_STOP:
            case VK_COMPOSE:
            case VK_ALT_GRAPH:
            case VK_BEGIN:
            case VK_UNDEFINED:
                return true;
        }
        return false;
    }

    private static int getVK(char ch) {
        switch (ch) {
            case 'a':
                return VK_A;
            case 'b':
                return VK_B;
            case 'c':
                return VK_C;
            case 'd':
                return VK_D;
            case 'e':
                return VK_E;
            case 'f':
                return VK_F;
            case 'g':
                return VK_G;
            case 'h':
                return VK_H;
            case 'i':
                return VK_I;
            case 'j':
                return VK_J;
            case 'k':
                return VK_K;
            case 'l':
                return VK_L;
            case 'm':
                return VK_M;
            case 'n':
                return VK_N;
            case 'o':
                return VK_O;
            case 'p':
                return VK_P;
            case 'q':
                return VK_Q;
            case 'r':
                return VK_R;
            case 's':
                return VK_S;
            case 't':
                return VK_T;
            case 'u':
                return VK_U;
            case 'v':
                return VK_V;
            case 'w':
                return VK_W;
            case 'x':
                return VK_X;
            case 'y':
                return VK_Y;
            case 'z':
                return VK_Z;
            case '\n':
                return VK_ENTER;
            case '\t':
                return VK_TAB;
            case '1':
                return VK_1;
            case '2':
                return VK_2;
            case '3':
                return VK_3;
            case '4':
                return VK_4;
            case '5':
                return VK_5;
            case '6':
                return VK_6;
            case '7':
                return VK_7;
            case '8':
                return VK_8;
            case '9':
                return VK_9;
            case '0':
                return VK_0;
            case '-':
                return VK_UNDERSCORE;
            case '+':
                return VK_PLUS;
            case '[':
                return VK_OPEN_BRACKET;
            case ']':
                return VK_CLOSE_BRACKET;
            case ';':
                return VK_SEMICOLON;
            case '\'':
                return VK_QUOTE;
            case '\\':
                return VK_BACK_SLASH;
            case ',':
                return VK_COMMA;
            case '.':
                return VK_PERIOD;
            case '/':
                return VK_SLASH;
            case '`':
                return VK_BACK_QUOTE;
            default:
                throw new InvalidCharacterException("Invalid character passed: " + ch + ".");
        }
    }

    private static int getVK(String key) {
        switch (key) {
            case "ENTER":
                return VK_ENTER;
            case "BACK SPACE":
                return VK_BACK_SPACE;
            case "TAB":
                return VK_TAB;
            case "CANCEL":
                return VK_CANCEL;
            case "CLEAR":
                return VK_CLEAR;
            case "SHIFT":
                return VK_SHIFT;
            case "CONTROL":
                return VK_CONTROL;
            case "ALT":
                return VK_ALT;
            case "PAUSE":
                return VK_PAUSE;
            case "CAPS LOCK":
                return VK_CAPS_LOCK;
            case "ESCAPE":
                return VK_ESCAPE;
            case "SPACE":
                return VK_SPACE;
            case "PAGE UP":
                return VK_PAGE_UP;
            case "PAGE DOWN":
                return VK_PAGE_DOWN;
            case "END":
                return VK_END;
            case "HOME":
                return VK_HOME;
            case "LEFT":
                return VK_LEFT;
            case "UP":
                return VK_UP;
            case "RIGHT":
                return VK_RIGHT;
            case "DOWN":
                return VK_DOWN;
            case "COMMA":
                return VK_COMMA;
            case "MINUS":
                return VK_MINUS;
            case "PERIOD":
                return VK_PERIOD;
            case "SLASH":
                return VK_SLASH;
            case "0":
                return VK_0;
            case "1":
                return VK_1;
            case "2":
                return VK_2;
            case "3":
                return VK_3;
            case "4":
                return VK_4;
            case "5":
                return VK_5;
            case "6":
                return VK_6;
            case "7":
                return VK_7;
            case "8":
                return VK_8;
            case "9":
                return VK_9;
            case "SEMICOLON":
                return VK_SEMICOLON;
            case "EQUALS":
                return VK_EQUALS;
            case "A":
                return VK_A;
            case "B":
                return VK_B;
            case "C":
                return VK_C;
            case "D":
                return VK_D;
            case "E":
                return VK_E;
            case "F":
                return VK_F;
            case "G":
                return VK_G;
            case "H":
                return VK_G;
            case "I":
                return VK_I;
            case "J":
                return VK_J;
            case "K":
                return VK_K;
            case "L":
                return VK_L;
            case "M":
                return VK_M;
            case "N":
                return VK_N;
            case "O":
                return VK_O;
            case "P":
                return VK_P;
            case "Q":
                return VK_Q;
            case "R":
                return VK_R;
            case "S":
                return VK_S;
            case "T":
                return VK_T;
            case "U":
                return VK_U;
            case "V":
                return VK_V;
            case "W":
                return VK_W;
            case "X":
                return VK_X;
            case "Y":
                return VK_Y;
            case "Z":
                return VK_Z;
            case "OPEN BRACKET":
                return VK_OPEN_BRACKET;
            case "BACK SLASH":
                return VK_BACK_SLASH;
            case "CLOSE BRACKET":
                return VK_CLOSE_BRACKET;
            case "NUMPAD 0":
                return VK_NUMPAD0;
            case "NUMPAD 1":
                return VK_NUMPAD1;
            case "NUMPAD 2":
                return VK_NUMPAD2;
            case "NUMPAD 3":
                return VK_NUMPAD3;
            case "NUMPAD 4":
                return VK_NUMPAD4;
            case "NUMPAD 5":
                return VK_NUMPAD5;
            case "NUMPAD 6":
                return VK_NUMPAD6;
            case "NUMPAD 7":
                return VK_NUMPAD7;
            case "NUMPAD 8":
                return VK_NUMPAD8;
            case "NUMPAD 9":
                return VK_NUMPAD9;
            case "MULTIPLY":
                return VK_MULTIPLY;
            case "ADD":
                return VK_ADD;
            case "SEPARATER":
                return VK_SEPARATER;
            case "SEPARATOR":
                return VK_SEPARATOR;
            case "SUBTRACT":
                return VK_SUBTRACT;
            case "DECIMAL":
                return VK_DECIMAL;
            case "DIVIDE":
                return VK_DIVIDE;
            case "DELETE":
                return VK_DELETE;
            case "NUM LOCK":
                return VK_NUM_LOCK;
            case "SCROLL LOCK":
                return VK_SCROLL_LOCK;
            case "F1":
                return VK_F1;
            case "F2":
                return VK_F2;
            case "F3":
                return VK_F3;
            case "F4":
                return VK_F4;
            case "F5":
                return VK_F5;
            case "F6":
                return VK_F6;
            case "F7":
                return VK_F7;
            case "F8":
                return VK_F8;
            case "F9":
                return VK_F9;
            case "F10":
                return VK_F10;
            case "F11":
                return VK_F11;
            case "F12":
                return VK_F12;
            case "F13":
                return VK_F13;
            case "F14":
                return VK_F14;
            case "F15":
                return VK_F15;
            case "F16":
                return VK_F16;
            case "F17":
                return VK_F17;
            case "F18":
                return VK_F18;
            case "F19":
                return VK_F19;
            case "F20":
                return VK_F20;
            case "F21":
                return VK_F21;
            case "F22":
                return VK_F22;
            case "F23":
                return VK_F23;
            case "F24":
                return VK_F24;
            case "PRINTSCREEN":
                return VK_PRINTSCREEN;
            case "INSERT":
                return VK_INSERT;
            case "HELP":
                return VK_HELP;
            case "META":
                return VK_META;
            case "BACK QUOTE":
                return VK_BACK_QUOTE;
            case "QUOTE":
                return VK_QUOTE;
            case "KP UP":
                return VK_KP_UP;
            case "KP DOWN":
                return VK_KP_DOWN;
            case "KP LEFT":
                return VK_KP_LEFT;
            case "KP RIGHT":
                return VK_KP_RIGHT;
            case "DEAD GRAVE":
                return VK_DEAD_GRAVE;
            case "DEAD ACUTE":
                return VK_DEAD_ACUTE;
            case "DEAD CIRCUMFLEX":
                return VK_DEAD_CIRCUMFLEX;
            case "DEAD TILDE":
                return VK_DEAD_TILDE;
            case "DEAD MACRON":
                return VK_DEAD_MACRON;
            case "DEAD BREVE":
                return VK_DEAD_BREVE;
            case "DEAD ABOVEDOT":
                return VK_DEAD_ABOVEDOT;
            case "DEAD DIAERESIS":
                return VK_DEAD_DIAERESIS;
            case "DEAD ABOVERING":
                return VK_DEAD_ABOVERING;
            case "DEAD DOUBLEACUTE":
                return VK_DEAD_DOUBLEACUTE;
            case "DEAD CARON":
                return VK_DEAD_CARON;
            case "DEAD CEDILLA":
                return VK_DEAD_CEDILLA;
            case "DEAD OGONEK":
                return VK_DEAD_OGONEK;
            case "DEAD IOTA":
                return VK_DEAD_IOTA;
            case "DEAD VOICED SOUND":
                return VK_DEAD_VOICED_SOUND;
            case "DEAD SEMIVOICED SOUND":
                return VK_DEAD_SEMIVOICED_SOUND;
            case "AMPERSAND":
                return VK_AMPERSAND;
            case "ASTERISK":
                return VK_ASTERISK;
            case "QUOTEDBL":
                return VK_QUOTEDBL;
            case "LESS":
                return VK_LESS;
            case "GREATER":
                return VK_GREATER;
            case "BRACELEFT":
                return VK_BRACELEFT;
            case "BRACERIGHT":
                return VK_BRACERIGHT;
            case "AT":
                return VK_AT;
            case "COLON":
                return VK_COLON;
            case "CIRCUMFLEX":
                return VK_CIRCUMFLEX;
            case "DOLLAR":
                return VK_DOLLAR;
            case "EURO SIGN":
                return VK_EURO_SIGN;
            case "EXCLAMATION MARK":
                return VK_EXCLAMATION_MARK;
            case "INVERTED EXCLAMATION MARK":
                return VK_INVERTED_EXCLAMATION_MARK;
            case "LEFT PARENTHESIS":
                return VK_LEFT_PARENTHESIS;
            case "NUMBER SIGN":
                return VK_NUMBER_SIGN;
            case "PLUS":
                return VK_PLUS;
            case "RIGHT PARENTHESIS":
                return VK_RIGHT_PARENTHESIS;
            case "UNDERSCORE":
                return VK_UNDERSCORE;
            case "WINDOWS":
                return VK_WINDOWS;
            case "CONTEXT MENU":
                return VK_CONTEXT_MENU;
            case "FINAL":
                return VK_FINAL;
            case "NONCONVERT":
                return VK_NONCONVERT;
            case "ACCEPT":
                return VK_ACCEPT;
            case "MODECHANGE":
                return VK_MODECHANGE;
            case "KANA":
                return VK_KANA;
            case "KANJI":
                return VK_KANJI;
            case "ALPHANUMERIC":
                return VK_ALPHANUMERIC;
            case "KATAKANA":
                return VK_KATAKANA;
            case "HIRAGANA":
                return VK_HIRAGANA;
            case "FULL WIDTH":
                return VK_FULL_WIDTH;
            case "HALF WIDTH":
                return VK_HALF_WIDTH;
            case "ROMAN CHARACTERS":
                return VK_ROMAN_CHARACTERS;
            case "ALL CANDIDATES":
                return VK_ALL_CANDIDATES;
            case "PREVIOUS CANDIDATE":
                return VK_PREVIOUS_CANDIDATE;
            case "CODE INPUT":
                return VK_CODE_INPUT;
            case "JAPANESE KATAKANA":
                return VK_JAPANESE_KATAKANA;
            case "JAPANESE HIRAGANA":
                return VK_JAPANESE_HIRAGANA;
            case "JAPANESE ROMAN":
                return VK_JAPANESE_ROMAN;
            case "KANA LOCK":
                return VK_KANA_LOCK;
            case "INPUT METHOD ON OFF":
                return VK_INPUT_METHOD_ON_OFF;
            case "CUT":
                return VK_CUT;
            case "COPY":
                return VK_COPY;
            case "PASTE":
                return VK_PASTE;
            case "UNDO":
                return VK_UNDO;
            case "AGAIN":
                return VK_AGAIN;
            case "FIND":
                return VK_FIND;
            case "PROPS":
                return VK_PROPS;
            case "STOP":
                return VK_STOP;
            case "COMPOSE":
                return VK_COMPOSE;
            case "ALT GRAPH":
                return VK_ALT_GRAPH;
            case "BEGIN":
                return VK_BEGIN;
            case "UNDEFINED":
                return VK_UNDEFINED;
            default:
                throw new InvalidCharacterException("Invalid key passed:  " + key + ".");
        }
    }

    public void type(String s) {
        type(s, 0);
    }

    public void type(char[] cha) {
        type(new String(cha));
    }

    public void type(String[] keys) {
        type(keys, 0);
    }

    public void type(int[] vk) {
        type(vk, 0);
    }

    public void type(String s, long interval) {
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (i != 0)
                try {
                Thread.sleep(interval);
            } catch (InterruptedException ex) {
                throw new FailedToFreezeException();
            }
            pressAndRelease(Automation.getVK(s.charAt(i)));
        }
    }

    public void type(char[] cha, long interval) {
        type(new String(cha), interval);
    }

    public void type(String[] keys, long interval) {
        for (String key : keys) {
            try {
                Thread.sleep(interval);
            } catch (InterruptedException ex) {
                throw new FailedToFreezeException();
            }
            pressAndRelease(Automation.getVK(key.toUpperCase()));
        }
    }

    public void type(int[] vk, long interval) {
        for (int i : vk) {
            try {
                Thread.sleep(interval);
            } catch (InterruptedException ex) {
                throw new FailedToFreezeException();
            }
            pressAndRelease(i);
        }
    }
}
