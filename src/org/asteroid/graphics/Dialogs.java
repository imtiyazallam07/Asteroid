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

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.asteroid.Files;

/**
 * <code>Dialogs</code> makes it easy to pop up a dialog box that prompts users
 * for a value, informs them of something, choose file and get other data from
 * the user through GUI
 *
 * @author Asteroid Softwares
 */
public final class Dialogs {

    public static int WARNING = JOptionPane.WARNING_MESSAGE;
    public static int ERROR = JOptionPane.ERROR_MESSAGE;
    public static int INFO = JOptionPane.INFORMATION_MESSAGE;
    public static int PLAIN = JOptionPane.PLAIN_MESSAGE;
    public static int QUESTION = JOptionPane.QUESTION_MESSAGE;
    public static int YES = JOptionPane.YES_OPTION;
    public static int NO = JOptionPane.NO_OPTION;
    public static int CANCEL = JOptionPane.CANCEL_OPTION;
    public static String DEFAULT_TITLE = "Frame";
    public static Integer CLOSED = null;
    public static String _CANCEL = "+yuATNQSiepNflx5bwia6YBUk5Twj++k4Ock7PI0h+c=";
    private static boolean isOk = false;
    private static boolean isC = false;

    /**
     * Shows error dialog
     *
     * @param message Message to be displayed
     */
    public static void showError(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Shows error dialog
     *
     * @param message Message to be displayed
     * @param title Dialog box title
     */
    public static void showError(String message, String title) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Shows information dialog
     *
     * @param message Message to be displayed
     */
    public static void showInfo(String message) {
        JOptionPane.showMessageDialog(null, message, "Information", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Shows information dialog
     *
     * @param message Message to be displayed
     * @param title Dialog box title
     */
    public static void showInfo(String message, String title) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Shows plain dialog
     *
     * @param message Message to be displayed
     */
    public static void showPlain(String message) {
        JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.PLAIN_MESSAGE);
    }

    /**
     * Shows plain dialog
     *
     * @param message Message to be displayed
     * @param title Dialog box title
     */
    public static void showPlain(String message, String title) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.PLAIN_MESSAGE);
    }

    /**
     * Shows question dialog
     *
     * @param message Message to be displayed
     */
    public static void showQuestion(String message) {
        JOptionPane.showMessageDialog(null, message, "Question", JOptionPane.QUESTION_MESSAGE);
    }

    /**
     * Shows question dialog
     *
     * @param message Message to be displayed
     * @param title Dialog box title
     */
    public static void showQuestion(String message, String title) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
    }

    /**
     * Shows warning dialog
     *
     * @param message Message to be displayed
     */
    public static void showWarning(String message) {
        JOptionPane.showMessageDialog(null, message, "Information", JOptionPane.WARNING_MESSAGE);
    }

    /**
     * Shows warning dialog
     *
     * @param message Message to be displayed
     * @param title Dialog box title
     */
    public static void showWarning(String message, String title) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.WARNING_MESSAGE);
    }

    /**
     * Asks yes or no
     *
     * @param message Message to be displayed
     * @param title Dialog box title
     * @return returns -1, 0 and 1 for closing the dialog, choosing yes, and
     * choosing no respectively
     */
    public static int askYesNo(String message, String title) {
        return JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    }

    /**
     * Asks yes or no
     *
     * @param message Message to be displayed
     * @return returns -1, 0 and 1 for closing the dialog, choosing yes, and
     * choosing no respectively
     */
    public static int askYesNo(String message) {
        return JOptionPane.showConfirmDialog(null, message, "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    }

    /**
     * Asks yes or no
     *
     * @param message Message to be displayed
     * @param title Dialog box title
     * @param messageType Message type
     * @return returns -1, 0 and 1 for closing the dialog, choosing yes, and
     * choosing no respectively
     */
    public static int askYesNo(String message, String title, int messageType) {
        return JOptionPane.showConfirmDialog(null, message, "", JOptionPane.YES_NO_OPTION, messageType);
    }

    /**
     * Asks yes or no
     *
     * @param message Message to be displayed
     * @param messageType Message type
     * @return returns -1, 0 and 1 for closing the dialog, choosing yes, and
     * choosing no respectively
     */
    public static int askYesNo(String message, int messageType) {
        return JOptionPane.showConfirmDialog(null, message, "", JOptionPane.YES_NO_OPTION, messageType);
    }

    /**
     * Asks yes, no or cancel
     *
     * @param message Message to be displayed
     * @param title Dialog box title
     * @return returns -1, 0, 1 and 2 for closing the dialog, choosing yes,
     * choosing no and choosing cancel respectively
     */
    public static int askYesNoCancel(String message, String title) {
        return JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
    }

    /**
     * Asks yes, no or cancel
     *
     * @param message Message to be displayed
     * @return returns -1, 0, 1 and 2 for closing the dialog, choosing yes,
     * choosing no and choosing cancel respectively
     */
    public static int askYesNoCancel(String message) {
        return JOptionPane.showConfirmDialog(null, message, "", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
    }

    /**
     * Asks yes, no or cancel
     *
     * @param message Message to be displayed
     * @param title Dialog box title
     * @param messageType Message type
     * @return returns -1, 0, 1 and 2 for closing the dialog, choosing yes,
     * choosing no and choosing cancel respectively
     */
    public static int askYesNoCancel(String message, String title, int messageType) {
        return JOptionPane.showConfirmDialog(null, message, "", JOptionPane.YES_NO_CANCEL_OPTION, messageType);
    }

    /**
     * Asks yes, no or cancel
     *
     * @param message Message to be displayed
     * @param messageType Message type
     * @return returns -1, 0, 1 and 2 for closing the dialog, choosing yes,
     * choosing no and choosing cancel respectively
     */
    public static int askYesNoCancel(String message, int messageType) {
        return JOptionPane.showConfirmDialog(null, message, "", JOptionPane.YES_NO_CANCEL_OPTION, messageType);
    }

    /**
     * Shows a message with desired button text
     *
     * @param message Message to be displayed
     * @param buttonText Text that is to be set in the button of the dialog box
     */
    public static void showMessage(String message, String buttonText) {
        String[] a = {buttonText};
        JOptionPane.showOptionDialog(null, message, "", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, a, null);
    }

    /**
     * Shows a message with desired button text
     *
     * @param message Message to be displayed
     * @param buttonText Text that is to be set in the button of the dialog box
     * @param title Dialog box title
     */
    public static void showMessage(String message, String buttonText, String title) {
        String[] a = {buttonText};
        JOptionPane.showOptionDialog(null, message, title, JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, a, null);
    }

    /**
     * Shows a message with desired button text
     *
     * @param message Message to be displayed
     * @param buttonText Text that is to be set in the button of the dialog box
     * @param messageType Message type
     */
    public static void showMessage(String message, String buttonText, int messageType) {
        String[] a = {buttonText};
        JOptionPane.showOptionDialog(null, message, "", JOptionPane.OK_OPTION, messageType, null, a, null);
    }

    /**
     * Shows a message with desired button text
     *
     * @param message Message to be displayed
     * @param buttonText Text that is to be set in the button of the dialog box
     * @param title Dialog box title
     * @param messageType Message type
     */
    public static void showMessage(String message, String buttonText, String title, int messageType) {
        String[] a = {buttonText};
        JOptionPane.showOptionDialog(null, message, title, JOptionPane.OK_OPTION, messageType, null, a, null);
    }

    /**
     * Shows a Dialog box to accept password. There is a masked password input
     * with the default echo character of <code>JPasswordField</code>
     *
     * @return Password that is accepted
     */
    public static String getPassword() {
        return getPassword("Password", '\0');
    }

    /**
     * Shows a Dialog box to accept password
     *
     * @param echoChar Echo character in the password field
     * @return Password that is accepted
     */
    public static String getPassword(char echoChar) {
        return getPassword("Password", echoChar);
    }

    /**
     * Shows a Dialog box to accept password
     *
     * @param title Title of the dialog box
     * @return Password that is accepted
     */
    public static String getPassword(String title) {
        return getPassword(title, '\0');
    }

    /**
     * Shows a Dialog box to accept password
     *
     * @param title Title of the dialog box
     * @param echoChar Echo character in the password field
     * @return Password that is accepted
     */
    public static String getPassword(String title, char echoChar) {
        JDialog f = new JDialog();
        f.setTitle(title);
        f.setLocationRelativeTo(null);
        JPasswordField value = new JPasswordField();
        JLabel l1 = new JLabel("Enter Password:");
        JButton ok = new JButton();
        JButton cancel = new JButton();
        value.setOpaque(true);
        value.setBackground(Color.white);
        value.setForeground(Color.black);
        f.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        if (echoChar != '\0')
            value.setEchoChar(echoChar);
        else
            value.setEchoChar('\u25CF');
        ok.setText("OK");
        cancel.setText("Cancel");
        ok.setBounds(20, 60, 95, 30);
        cancel.setBounds(160, 60, 95, 30);
        l1.setBounds(10, 0, 200, 30);
        value.setBounds(10, 25, 265, 25);
        f.add(value);
        f.add(l1);
        f.add(ok);
        f.add(cancel);
        f.setSize(290, 140);
        f.setResizable(false);
        f.setLayout(null);
        f.setVisible(true);
        while (true) {
            ok.addActionListener((java.awt.event.ActionEvent evt) -> {
                isOk = true;
            });
            cancel.addActionListener((java.awt.event.ActionEvent evt) -> {
                isC = true;
            });
            f.setVisible(true);
            if (isC || isOk)
                break;
        }
        f.setVisible(false);
        f.dispose();
        if (isC) {
            reset();
            return _CANCEL;
        } else if (isOk) {
            reset();
            return new String(value.getPassword());
        }
        reset();
        return "";
    }

    /**
     * Shows a dialog box to accept username and password
     *
     * @return Array with username and password in index 0 and 1 respectively
     */
    public static String[] getUserAndPassword() {
        return getUserAndPassword("Enter Credentials", '\0');
    }

    /**
     * Shows a dialog box to accept username and password
     *
     * @param echoChar Echo character in the password field
     * @return Array with username and password in index 0 and 1 respectively
     */
    public static String[] getUserAndPassword(char echoChar) {
        return getUserAndPassword("Enter Credentials", echoChar);
    }

    /**
     * Shows a dialog box to accept username and password
     *
     * @param title Title of the dialog box
     * @return Array with username and password in index 0 and 1 respectively
     */
    public static String[] getUserAndPassword(String title) {
        return getUserAndPassword(title, '\0');
    }

    /**
     * Shows a dialog box to accept username and password
     *
     * @param title Title
     * @param echoChar Echo character in the password field
     * @return Array with username and password in index 0 and 1 respectively
     */
    public static String[] getUserAndPassword(String title, char echoChar) {
        JDialog f = new JDialog();
        JPasswordField value = new JPasswordField();
        JLabel l1 = new JLabel("Enter Password:");
        JLabel l2 = new JLabel("Enter Username:");
        JTextField username = new JTextField();
        JButton ok = new JButton();
        JButton cancel = new JButton();
        f.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        f.setResizable(false);
        if (echoChar != 0)
            value.setEchoChar(echoChar);
        else
            value.setEchoChar('\u25CF');
        ok.setText("OK");
        cancel.setText("Cancel");
        value.setOpaque(true);
        value.setBackground(Color.white);
        value.setForeground(Color.black);
        username.setOpaque(true);
        username.setBackground(Color.white);
        username.setForeground(Color.black);
        ok.setBounds(20, 110, 95, 30);
        cancel.setBounds(160, 110, 95, 30);
        l2.setBounds(10, 0, 200, 30);
        username.setBounds(10, 25, 265, 25);
        l1.setBounds(10, 50, 200, 30);
        value.setBounds(10, 75, 265, 25);
        f.add(l2);
        f.add(username);
        f.add(value);
        f.add(l1);
        f.add(ok);
        f.add(cancel);
        f.setSize(290, 180);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setAlwaysOnTop(true);
        f.setTitle(title);
        f.setVisible(true);
        while (true) {
            ok.addActionListener((java.awt.event.ActionEvent evt) -> {
                isOk = true;
            });
            cancel.addActionListener((java.awt.event.ActionEvent evt) -> {
                isC = true;
            });
            f.setVisible(true);
            if (isC || isOk)
                break;
        }
        f.setVisible(false);
        f.dispose();
        String[] data = new String[]{"", ""};
        if (isC) {
            data[0] = _CANCEL;
            reset();
            return data;
        } else if (isOk) {
            data[0] = username.getText();
            data[1] = new String(value.getPassword());
            reset();
            return data;
        }
        reset();
        return data;
    }

    
    private static void reset() {
        isOk = false;
        isC = false;
    }
    /**
     * Displays the given image on the screen
     *
     * @param file Image to be displayed
     * @param title Title of the window
     * @param resizable <code>true</code> if the window is to be set to
     * resizable state
     */
    public static void showImage(File file, String title, boolean resizable) {
        try {
            Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
            BufferedImage bimg = ImageIO.read(file);
            int[] imgRes = {bimg.getHeight(), bimg.getWidth()};
            int[] screenRes = {(int) size.getHeight(), (int) size.getWidth()};
            if (imgRes[0] > screenRes[0]) {
                double percent = screenRes[0] * 100.0 / imgRes[0];
                imgRes[0] = (int) (percent / 100 * imgRes[0]);
                imgRes[1] = (int) (percent / 100 * imgRes[1]);
            }

            if (imgRes[1] > screenRes[1]) {
                double percent = screenRes[1] * 100.0 / imgRes[1];
                imgRes[0] = (int) (percent / 100 * imgRes[0]);
                imgRes[1] = (int) (percent / 100 * imgRes[1]);
            }
            Image img = bimg.getScaledInstance(imgRes[1], imgRes[0], Image.SCALE_SMOOTH);
            JFrame dialog = new JFrame(title);
            JLabel label = new JLabel(new ImageIcon(img));
            dialog.add(label);
            dialog.setResizable(resizable);
            dialog.setLocationRelativeTo(null);
            dialog.setSize(imgRes[1], imgRes[0]);
            dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
            while (true)
                if (!dialog.isActive())
                    break;
        } catch (IOException e) {
            throw new FailedToReadFileException();
        }
    }

    /**
     * Displays the given image on the screen
     *
     * @param file Image to be displayed
     * @param title Title of the window
     * @param resizable <code>true</code> if the window is to be set to
     * resizable state
     */
    public static void showImage(String file, String title, boolean resizable) {
        showImage(new File(file), title, resizable);
    }

    /**
     * Displays the given image on the screen
     *
     * @param file Image to be displayed
     * @param title Title of the window
     * @param resizable <code>true</code> if the window is to be set to
     * resizable state
     */
    public static void showImage(Files file, String title, boolean resizable) {
        showImage(file.getAbsolutePath(), title, resizable);
    }

    /**
     * Displays the given image on the screen
     *
     * @param file Image to be displayed
     * @param title Title of the window
     */
    public static void showImage(File file, String title) {
        showImage(file, title, false);
    }

    /**
     * Displays the given image on the screen
     *
     * @param file Image to be displayed
     * @param title Title of the window
     */
    public static void showImage(String file, String title) {
        showImage(new File(file), title, false);
    }

    /**
     * Displays the given image on the screen
     *
     * @param file Image to be displayed
     * @param title Title of the window
     */
    public static void showImage(Files file, String title) {
        showImage(file.getAbsolutePath(), title, false);
    }

    /**
     * Displays the given image on the screen
     *
     * @param file Image to be displayed
     */
    public static void showImage(File file) {
        showImage(file, "Image", false);
    }

    /**
     * Displays the given image on the screen
     *
     * @param file Image to be displayed
     */
    public static void showImage(String file) {
        showImage(file, "Image", false);
    }

    /**
     * Displays the given image on the screen
     *
     * @param file Image to be displayed
     */
    public static void showImage(Files file) {
        showImage(file, "Image", false);
    }

    /**
     * Displays the given image on the screen
     *
     * @param file Image to be displayed
     * @param resizable <code>true</code> if the window is to be set to
     * resizable state
     */
    public static void showImage(File file, boolean resizable) {
        showImage(file, "Image", resizable);
    }

    /**
     * Displays the given image on the screen
     *
     * @param file Image to be displayed
     * @param resizable <code>true</code> if the window is to be set to
     * resizable state
     */
    public static void showImage(String file, boolean resizable) {
        showImage(file, "Image", resizable);
    }

    /**
     * Displays the given image on the screen
     *
     * @param file Image to be displayed
     * @param resizable <code>true</code> if the window is to be set to
     * resizable state
     */
    public static void showImage(Files file, boolean resizable) {
        showImage(file, "Image", resizable);
    }

    /**
     * Shows a file chooser file
     *
     * @param directory Location of file directory to be shown
     * @return Selected file in the instance of <code>java.io.File</code>
     */
    public static File showFileChooser(File directory) {
        JFileChooser filechooser = new JFileChooser(directory);
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFile();
        else
            return null;
    }

    /**
     * Shows a file chooser to choose Directory
     *
     * @param directory Location of file directory to be shown
     * @return Selected directory in the instance of <code>java.io.File</code>
     */
    public static File showDirectoryChooser(File directory) {
        JFileChooser filechooser = new JFileChooser(directory);
        filechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFile();
        else
            return null;
    }

    /**
     * Shows a file chooser to choose Directory or File
     *
     * @param directory Location of file directory to be shown
     * @return Selected file or directory in the instance of
     * <code>java.io.File</code>
     */
    public static File showFileAndDirectoryChooser(File directory) {
        JFileChooser filechooser = new JFileChooser(directory);
        filechooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFile();
        else
            return null;
    }

    /**
     * Shows a file chooser to choose multiple files
     *
     * @param directory Location of file directory to be shown
     * @return Selected files in the instance of <code>java.io.File</code> array
     */
    public static File[] showFilesChooser(File directory) {
        JFileChooser filechooser = new JFileChooser(directory);
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        filechooser.setMultiSelectionEnabled(true);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFiles();
        else
            return null;
    }

    /**
     * Shows a file chooser to choose multiple directories
     *
     * @param directory Location of file directory to be shown
     * @return Selected directories in the instance of <code>java.io.File</code>
     * array
     */
    public static File[] showDirectoriesChooser(File directory) {
        JFileChooser filechooser = new JFileChooser(directory);
        filechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        filechooser.setMultiSelectionEnabled(true);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFiles();
        else
            return null;
    }

    /**
     * Shows a file chooser to choose multiple files or Directories
     *
     * @param directory Location of file directory to be shown
     * @return Selected files and directories in the instance of
     * <code>java.io.File</code> array
     */
    public static File[] showFilesAndDirectoriesChooser(File directory) {
        JFileChooser filechooser = new JFileChooser(directory);
        filechooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        filechooser.setMultiSelectionEnabled(true);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFiles();
        else
            return null;
    }

    /**
     * Shows a file chooser to choose file
     *
     * @param directory Location of file directory to be shown
     * @return Selected file in the instance of <code>java.io.File</code>
     */
    public static File showFileChooser(String directory) {
        JFileChooser filechooser = new JFileChooser(new File(directory));
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFile();
        else
            return null;
    }

    /**
     * Shows a file chooser to choose Directory
     *
     * @param directory Location of file directory to be shown
     * @return Selected directory in the instance of <code>java.io.File</code>
     */
    public static File showDirectoryChooser(String directory) {
        JFileChooser filechooser = new JFileChooser(new File(directory));
        filechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFile();
        else
            return null;
    }

    /**
     * Shows a file chooser to choose files or Directory
     *
     * @param directory Location of file directory to be shown
     * @return Selected files and directories in the instance of
     * <code>java.io.File</code> array
     */
    public static File ShowFileAndDirectoryChooser(String directory) {
        JFileChooser filechooser = new JFileChooser(directory);
        filechooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFile();
        else
            return null;
    }

    /**
     * Shows a file chooser to choose multiple files
     *
     * @param directory Location of file directory to be shown
     * @return Selected files in the instance of <code>java.io.File</code> array
     */
    public static File[] showFilesChooser(String directory) {
        JFileChooser filechooser = new JFileChooser(directory);
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        filechooser.setMultiSelectionEnabled(true);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFiles();
        else
            return null;
    }

    /**
     * Shows a file chooser to choose multiple directories
     *
     * @param directory Location of file directory to be shown
     * @return Selected directories in the instance of <code>java.io.File</code>
     * array
     */
    public static File[] showDirectoriesChooser(String directory) {
        JFileChooser filechooser = new JFileChooser(directory);
        filechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        filechooser.setMultiSelectionEnabled(true);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFiles();
        else
            return null;
    }

    /**
     * Shows a file chooser to choose multiple files and directories
     *
     * @param directory Location of file directory to be shown
     * @return Selected files and directories in the instance of
     * <code>java.io.File</code> array
     */
    public static File[] showFilesAndDirectoriesChooser(String directory) {
        JFileChooser filechooser = new JFileChooser(directory);
        filechooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        filechooser.setMultiSelectionEnabled(true);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFiles();
        else
            return null;
    }

    /**
     * Shows a file chooser to choose file
     *
     * @param directory Location of file directory to be shown
     * @return Selected file in the instance of <code>java.io.File</code>
     */
    public static File showFileChooser(Files directory) {
        JFileChooser filechooser = new JFileChooser(directory.getAbsolutePath());
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFile();
        else
            return null;
    }

    /**
     * Shows a file chooser to choose multiple directories
     *
     * @param directory Location of file directory to be shown
     * @return Selected directories in the instance of <code>java.io.File</code>
     */
    public static File showDirectoryChooser(Files directory) {
        JFileChooser filechooser = new JFileChooser(directory.getAbsolutePath());
        filechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFile();
        else
            return null;
    }

    /**
     * Shows a file chooser to choose file and directory
     *
     * @param directory Location of file directory to be shown
     * @return Selected file and directory in the instance of
     * <code>java.io.File</code>
     */
    public static File showFileAndDirectoryChooser(Files directory) {
        JFileChooser filechooser = new JFileChooser(directory.getAbsolutePath());
        filechooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFile();
        else
            return null;
    }

    /**
     * Shows a file chooser to choose file
     *
     * @param directory Location of file directory to be shown
     * @return Selected files in the instance of <code>java.io.File</code> array
     */
    public static File[] showFilesChooser(Files directory) {
        JFileChooser filechooser = new JFileChooser(directory.getAbsolutePath());
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        filechooser.setMultiSelectionEnabled(true);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFiles();
        else
            return null;
    }

    /**
     * Shows a file chooser to choose multiple directories
     *
     * @param directory Location of file directory to be shown
     * @return Selected directories in the instance of <code>java.io.File</code>
     * array
     */
    public static File[] showDirectoriesChooser(Files directory) {
        JFileChooser filechooser = new JFileChooser(directory.getAbsolutePath());
        filechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        filechooser.setMultiSelectionEnabled(true);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFiles();
        else
            return null;
    }

    /**
     * Shows a file chooser to choose multiple files and directories
     *
     * @param directory Location of file directory to be shown
     * @return Selected files and directories in the instance of
     * <code>java.io.File</code> array
     */
    public static File[] showFilesAndDirectoriesChooser(Files directory) {
        JFileChooser filechooser = new JFileChooser(directory.getAbsolutePath());
        filechooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        filechooser.setMultiSelectionEnabled(true);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFiles();
        else
            return null;
    }

    /**
     * Shows a file chooser with a extension filter
     *
     * @param directory Location of file directory to be shown
     * @param extension extension to be filtered out
     * @return Selected file in the instance of <code>java.io.File</code>
     */
    public static File showFileChooser(File directory, String extension) {
        JFileChooser filechooser = new JFileChooser(directory);
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        filechooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter restrict = new FileNameExtensionFilter(extension + " files", extension);
        filechooser.addChoosableFileFilter(restrict);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFile();
        else
            return null;
    }

    /**
     * Shows a file chooser with a extension filter
     *
     * @param directory Location of file directory to be shown
     * @param extension extension to be filtered out
     * @return Selected file in the instance of <code>java.io.File</code>
     */
    public static File[] showFilesChooser(File directory, String extension) {
        JFileChooser filechooser = new JFileChooser(directory);
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        filechooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter restrict = new FileNameExtensionFilter(extension + " files", extension);
        filechooser.addChoosableFileFilter(restrict);
        filechooser.setMultiSelectionEnabled(true);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFiles();
        else
            return null;
    }

    /**
     * Shows a file chooser with a extension filter
     *
     * @param directory Location of file directory to be shown
     * @param extension extension to be filtered out
     * @return Selected file in the instance of <code>java.io.File</code>
     */
    public static File showFileChooser(String directory, String extension) {
        JFileChooser filechooser = new JFileChooser(new File(directory));
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        filechooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter restrict = new FileNameExtensionFilter(extension + " files", extension);
        filechooser.addChoosableFileFilter(restrict);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFile();
        else
            return null;
    }

    /**
     * Shows a file chooser with a extension filter
     *
     * @param directory Location of file directory to be shown
     * @param extension extension to be filtered out
     * @return Selected file in the instance of <code>java.io.File</code>
     */
    public static File[] showFilesChooser(String directory, String extension) {
        JFileChooser filechooser = new JFileChooser(directory);
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        filechooser.setMultiSelectionEnabled(true);
        filechooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter restrict = new FileNameExtensionFilter(extension + " files", extension);
        filechooser.addChoosableFileFilter(restrict);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFiles();
        else
            return null;
    }

    /**
     * Shows a file chooser with a extension filter
     *
     * @param directory Location of file directory to be shown
     * @param extension extension to be filtered out
     * @return Selected file in the instance of <code>java.io.File</code>
     */
    public static File showFileChooser(Files directory, String extension) {
        JFileChooser filechooser = new JFileChooser(directory.getAbsolutePath());
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        filechooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter restrict = new FileNameExtensionFilter(extension + " files", extension);
        filechooser.addChoosableFileFilter(restrict);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFile();
        else
            return null;
    }

    /**
     * Shows a file chooser with a extension filter
     *
     * @param directory Location of file directory to be shown
     * @param extension extension to be filtered out
     * @return Selected file in the instance of <code>java.io.File</code>
     */
    public static File[] showFilesChooser(Files directory, String extension) {
        JFileChooser filechooser = new JFileChooser(directory.getAbsolutePath());
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        filechooser.setMultiSelectionEnabled(true);
        filechooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter restrict = new FileNameExtensionFilter(extension + " files", extension);
        filechooser.addChoosableFileFilter(restrict);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFiles();
        else
            return null;
    }

    /**
     * Shows a file chooser with a extension filter
     *
     * @param directory Location of file directory to be shown
     * @param desc textual description for the filter
     * @param extension extensions to be filtered out
     * @return Selected file in the instance of <code>java.io.File</code>
     */
    public static File showFileChooser(File directory, String desc, String extension) {
        JFileChooser filechooser = new JFileChooser(directory);
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        filechooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter restrict = new FileNameExtensionFilter(desc, extension);
        filechooser.addChoosableFileFilter(restrict);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFile();
        else
            return null;
    }

    /**
     * Shows a file chooser with a extension filter
     *
     * @param directory Location of file directory to be shown
     * @param desc textual description for the filter
     * @param extension extension to be filtered out
     * @return Selected file in the instance of <code>java.io.File</code>
     */
    public static File[] showFilesChooser(File directory, String desc, String extension) {
        JFileChooser filechooser = new JFileChooser(directory);
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        filechooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter restrict = new FileNameExtensionFilter(desc, extension);
        filechooser.addChoosableFileFilter(restrict);
        filechooser.setMultiSelectionEnabled(true);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFiles();
        else
            return null;
    }

    /**
     * Shows a file chooser with a extension filter
     *
     * @param directory Location of file directory to be shown
     * @param desc textual description for the filter
     * @param extension extension to be filtered out
     * @return Selected file in the instance of <code>java.io.File</code>
     */
    public static File showFileChooser(String directory, String desc, String extension) {
        JFileChooser filechooser = new JFileChooser(new File(directory));
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        filechooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter restrict = new FileNameExtensionFilter(desc, extension);
        filechooser.addChoosableFileFilter(restrict);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFile();
        else
            return null;
    }

    /**
     * Shows a file chooser with a extension filter
     *
     * @param directory Location of file directory to be shown
     * @param desc textual description for the filter
     * @param extension extension to be filtered out
     * @return Selected file in the instance of <code>java.io.File</code>
     */
    public static File[] showFilesChooser(String directory, String desc, String extension) {
        JFileChooser filechooser = new JFileChooser(directory);
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        filechooser.setMultiSelectionEnabled(true);
        filechooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter restrict = new FileNameExtensionFilter(desc, extension);
        filechooser.addChoosableFileFilter(restrict);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFiles();
        else
            return null;
    }

    /**
     * Shows a file chooser with a extension filter
     *
     * @param directory Location of file directory to be shown
     * @param desc textual description for the filter
     * @param extension extension to be filtered out
     * @return Selected file in the instance of <code>java.io.File</code>
     */
    public static File showFileChooser(Files directory, String desc, String extension) {
        JFileChooser filechooser = new JFileChooser(directory.getAbsolutePath());
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        filechooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter restrict = new FileNameExtensionFilter(desc, extension);
        filechooser.addChoosableFileFilter(restrict);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFile();
        else
            return null;
    }

    /**
     * Shows a file chooser with a extension filter
     *
     * @param directory Location of file directory to be shown
     * @param desc textual description for the filter
     * @param extension extension to be filtered out
     * @return Selected file in the instance of <code>java.io.File</code>
     */
    public static File[] showFilesChooser(Files directory, String desc, String extension) {
        JFileChooser filechooser = new JFileChooser(directory.getAbsolutePath());
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        filechooser.setMultiSelectionEnabled(true);
        filechooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter restrict = new FileNameExtensionFilter(desc, extension);
        filechooser.addChoosableFileFilter(restrict);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFiles();
        else
            return null;
    }

    /**
     * Shows a file chooser with a extension filter
     *
     * @param directory Location of file directory to be shown
     * @param description textual description for the filter
     * @param extensions extensions to be filtered out
     * @return Selected file in the instance of <code>java.io.File</code>
     */
    public static File showFileChooser(File directory, String description, String[] extensions) {
        JFileChooser filechooser = new JFileChooser(directory);
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        filechooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter restrict = new FileNameExtensionFilter(description, extensions);
        filechooser.addChoosableFileFilter(restrict);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFile();
        else
            return null;
    }

    /**
     * Shows a file chooser with a extension filter
     *
     * @param directory Location of file directory to be shown
     * @param description textual description for the filter
     * @param extensions extensions to be filtered out
     * @return Selected file in the instance of <code>java.io.File</code>
     */
    public static File[] showFilesChooser(File directory, String description, String[] extensions) {
        JFileChooser filechooser = new JFileChooser(directory);
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        filechooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter restrict = new FileNameExtensionFilter(description, extensions);
        filechooser.addChoosableFileFilter(restrict);
        filechooser.setMultiSelectionEnabled(true);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFiles();
        else
            return null;
    }

    /**
     * Shows a file chooser with a extension filter
     *
     * @param directory Location of file directory to be shown
     * @param description textual description for the filter
     * @param extensions extensions to be filtered out
     * @return Selected file in the instance of <code>java.io.File</code>
     */
    public static File showFileChooser(String directory, String description, String[] extensions) {
        JFileChooser filechooser = new JFileChooser(new File(directory));
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        filechooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter restrict = new FileNameExtensionFilter(description, extensions);
        filechooser.addChoosableFileFilter(restrict);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFile();
        else
            return null;
    }

    /**
     * Shows a file chooser with a extension filter
     *
     * @param directory Location of file directory to be shown
     * @param description textual description for the filter
     * @param extensions extensions to be filtered out
     * @return Selected file in the instance of <code>java.io.File</code>
     */
    public static File[] showFilesChooser(String directory, String description, String[] extensions) {
        JFileChooser filechooser = new JFileChooser(directory);
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        filechooser.setMultiSelectionEnabled(true);
        filechooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter restrict = new FileNameExtensionFilter(description, extensions);
        filechooser.addChoosableFileFilter(restrict);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFiles();
        else
            return null;
    }

    /**
     * Shows a file chooser with a extension filter
     *
     * @param directory Location of file directory to be shown
     * @param description textual description for the filter
     * @param extensions extensions to be filtered out
     * @return Selected file in the instance of <code>java.io.File</code>
     */
    public static File showFileChooser(Files directory, String description, String[] extensions) {
        JFileChooser filechooser = new JFileChooser(directory.getAbsolutePath());
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        filechooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter restrict = new FileNameExtensionFilter(description, extensions);
        filechooser.addChoosableFileFilter(restrict);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFile();
        else
            return null;
    }

    /**
     * Shows a file chooser with a extension filter
     *
     * @param directory Location of file directory to be shown
     * @param description textual description for the filter
     * @param extensions extensions to be filtered out
     * @return Selected file in the instance of <code>java.io.File</code>
     */
    public static File[] showFilesChooser(Files directory, String description, String[] extensions) {
        JFileChooser filechooser = new JFileChooser(directory.getAbsolutePath());
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        filechooser.setMultiSelectionEnabled(true);
        filechooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter restrict = new FileNameExtensionFilter(description, extensions);
        filechooser.addChoosableFileFilter(restrict);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFiles();
        else
            return null;
    }

    /**
     * Shows a file chooser with a extension filter
     *
     * @return Selected file in the instance of <code>java.io.File</code>
     */
    public static File showFileChooser() {
        JFileChooser filechooser = new JFileChooser(new File(""));
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFile();
        else
            return null;
    }

    /**
     * Shows a file chooser with a extension filter
     *
     * @return Selected directory in the instance of <code>java.io.File</code>
     */
    public static File showDirectoryChooser() {
        JFileChooser filechooser = new JFileChooser("");
        filechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFile();
        else
            return null;
    }

    /**
     * Shows a file chooser with a extension filter
     *
     * @return Selected file or directory in the instance of
     * <code>java.io.File</code>
     */
    public static File showFileAndDirectoryChooser() {
        JFileChooser filechooser = new JFileChooser("");
        filechooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFile();
        else
            return null;
    }

    /**
     * Shows a file chooser with a extension filter
     *
     * @return Selected files in the instance of <code>java.io.File</code> array
     */
    public static File[] showFilesChooser() {
        JFileChooser filechooser = new JFileChooser("");
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        filechooser.setMultiSelectionEnabled(true);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFiles();
        else
            return null;
    }

    /**
     * Shows a file chooser with a extension filter
     *
     * @return Selected directories in the instance of <code>java.io.File</code>
     * array
     */
    public static File[] showDirectoriesChooser() {
        JFileChooser filechooser = new JFileChooser("");
        filechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        filechooser.setMultiSelectionEnabled(true);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFiles();
        else
            return null;
    }

    /**
     * Shows a file chooser with a extension filter
     *
     * @return Selected files and directories in the instance of
     * <code>java.io.File</code> array
     */
    public static File[] showFilesAndDirectoriesChooser() {
        JFileChooser filechooser = new JFileChooser("");
        filechooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        filechooser.setMultiSelectionEnabled(true);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFiles();
        else
            return null;
    }

    /**
     * Shows a save file chooser with a extension filter
     *
     * @param directory Location of file directory to be shown
     * @return Selected file in the instance of <code>java.io.File</code>
     */
    public static File showSaveFileChooser(String directory) {
        JFileChooser filechooser = new JFileChooser(directory);
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int x = filechooser.showSaveDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFile();
        else
            return null;
    }

    /**
     * Shows a save file chooser with a extension filter
     *
     * @param directory Location of file directory to be shown
     * @return Selected file in the instance of <code>java.io.File</code>
     */
    public static File showSaveFileChooser(File directory) {
        JFileChooser filechooser = new JFileChooser(directory);
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int x = filechooser.showSaveDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFile();
        else
            return null;
    }

    /**
     * Shows a save file chooser with a extension filter
     *
     * @param directory
     * @return Selected file in the instance of <code>java.io.File</code>
     */
    public static File showSaveFileChooser(Files directory) {
        JFileChooser filechooser = new JFileChooser(directory.getAbsolutePath());
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int x = filechooser.showSaveDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFile();
        else
            return null;
    }

    /**
     * Shows a save file chooser with a extension filter
     *
     * @return Selected file in the instance of <code>java.io.File</code>
     */
    public static File showSaveFileChooser() {
        JFileChooser filechooser = new JFileChooser("");
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int x = filechooser.showSaveDialog(null);
        if (x == JFileChooser.APPROVE_OPTION)
            return filechooser.getSelectedFile();
        else
            return null;
    }
}
