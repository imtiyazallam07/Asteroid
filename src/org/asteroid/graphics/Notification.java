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

package org.asteroid.graphics;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;

/**
 * Displays a popup message near the tray icon. The message will disappear after
 * a time or if the user clicks on it
 *
 * @author Asteroid Softwares
 */
public final class Notification {

    /**
     * Shows a notification according to given data
     *
     * @param img icon
     * @param type Message type
     * @param heading Heading of the notification
     * @param body Body of the notification
     * @param tooltip Tool Tip
     */
    public static void show(String img, MessageType type, String heading, String body, String tooltip) {
        try {
            if (SystemTray.isSupported()) {
                SystemTray tray = SystemTray.getSystemTray();
                Image image = Toolkit.getDefaultToolkit().createImage(img);
                TrayIcon trayIcon = new TrayIcon(image, tooltip);
                trayIcon.setImageAutoSize(true);
                trayIcon.setToolTip(tooltip);
                tray.add(trayIcon);
                trayIcon.displayMessage(heading, body, type);
            } else {
                throw new UnsupportedTrayException();
            }
        } catch (AWTException e) {
            throw new UnsupportedTrayException();
        }
    }

    /**
     * Shows an error notification
     *
     * @param heading Heading of the notification
     * @param body Body of the notification
     * @param tooltip Tool Tip
     * @param icon Icon to be shown in notification
     */
    public static void showError(String heading, String body, String tooltip, String icon) {
        show(icon, MessageType.ERROR, heading, body, tooltip);
    }

    /**
     * Shows a warning notification
     *
     * @param heading Heading of the notification
     * @param body Body of the notification
     * @param tooltip Tool Tip
     * @param icon Icon to be shown in notification
     */
    public static void showWarning(String heading, String body, String tooltip, String icon) {
        show(icon, MessageType.WARNING, heading, body, tooltip);
    }

    /**
     * Shows an information notification
     *
     * @param heading Heading of the notification
     * @param body Body of the notification
     * @param tooltip Tool Tip
     * @param icon Icon to be shown in notification
     */
    public static void showInfo(String heading, String body, String tooltip, String icon) {
        show(icon, MessageType.INFO, heading, body, tooltip);
    }

    /**
     * Shows a plain notification
     *
     * @param heading Heading of the notification
     * @param body Body of the notification
     * @param tooltip Tool Tip
     * @param icon Icon to be shown in notification
     */
    public static void showPlain(String heading, String body, String tooltip, String icon) {
        show(icon, MessageType.NONE, heading, body, tooltip);
    }
}
