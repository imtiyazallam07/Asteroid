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

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.FloatControl;
import org.asteroid.units.Time;
import org.asteroid.math.Numbers;
import java.io.FileNotFoundException;

/**
 * It has methods to play wav audio file
 *
 * @author Imtiyaz Allam
 */
public class Audio {

    private Long currentFrame;
    private Clip clip;
    private String status = "play";
    private AudioInputStream audioInputStream;
    private static String filePath;
    public static final int INFINITE_LOOP = -1;
    private boolean isMute = false;
    private int initVol = 100;

    /**
     * Creates an instance of <code>Audio</code> class. When you create an
     * instance the audio starts playing
     *
     * @param file Audio file address
     * @throws UnsupportedAudioFileException
     * @throws IOException
     * @throws LineUnavailableException
     */
    public Audio(String file) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        try {
            filePath = file;
            audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.loop(0);
        } catch (FileNotFoundException e) {
            throw new FileMissingException();
        }
    }

    /**
     * Creates an instance of <code>Audio</code> class. When you create an
     * instance the audio starts playing
     *
     * @param file audio file as a instance of <code>File</code> class
     * @throws UnsupportedAudioFileException
     * @throws IOException
     * @throws LineUnavailableException
     */
    public Audio(File file) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        try {
            filePath = file.getAbsolutePath();
            audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
        } catch (FileNotFoundException e) {
            throw new FileMissingException();
        }
    }

    /**
     * Audio starts playing here
     */
    protected void start() {
        clip.start();
        status = "play";
    }

    /**
     * It pause the audio
     */
    public void pause() {
        if (status.equals("paused")) {
            throw new StatusException("Audio is being puased but pause command has been given");
        }
        this.currentFrame = this.clip.getMicrosecondPosition();
        clip.stop();
        status = "paused";
    }

    /**
     * It resumes the paused audio
     *
     * @throws UnsupportedAudioFileException
     * @throws IOException
     * @throws LineUnavailableException
     */
    public void resume() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        if (status.equals("play")) {
            throw new StatusException("Audio is being played but play command has been given");
        }
        clip.close();
        resetAudioStream();
        clip.setMicrosecondPosition(currentFrame);
        clip.start();
        status = "play";
    }

    /**
     * It restart the audio that is being played
     *
     * @throws IOException
     * @throws LineUnavailableException
     * @throws UnsupportedAudioFileException
     */
    public void restart() throws IOException, LineUnavailableException, UnsupportedAudioFileException {
        clip.stop();
        clip.close();
        resetAudioStream();
        currentFrame = 0L;
        clip.setMicrosecondPosition(0);
        this.start();
    }

    /**
     * It stops playing audio
     *
     * @throws UnsupportedAudioFileException
     * @throws IOException
     * @throws LineUnavailableException
     */
    public void stop() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        currentFrame = 0L;
        clip.stop();
        clip.close();
    }

    /**
     * It stops the playing audio
     *
     * @param location The duration to jump on in milliseconds
     * @throws UnsupportedAudioFileException
     * @throws IOException
     * @throws LineUnavailableException
     */
    public void jump(long location) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        if (location > 0 && location < clip.getMicrosecondLength()) {
            clip.stop();
            clip.close();
            resetAudioStream();
            currentFrame = location;
            clip.setMicrosecondPosition(location);
            this.start();
        } else {
            throw new InvalidAudioFrameException();
        }
    }

    /**
     * It resets the audio stream
     *
     * @throws UnsupportedAudioFileException
     * @throws IOException
     * @throws LineUnavailableException
     */
    public void resetAudioStream() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
        clip.open(audioInputStream);
        clip.loop(0);
    }

    /**
     * It returns the status of audio; true when playing and false when paused
     *
     * @return Status of audio
     */
    public boolean getStatus() {
        return status.equals("play");
    }

    /**
     * It returns the current frame or current position in microseconds that is
     * being played
     *
     * @return Current frame of audio in milliseconds
     */
    public long getCurrentFrame() {
        return clip.getMicrosecondPosition();
    }

    /**
     * It returns the current frame or current position inside audio that is
     * being played (in microseconds)
     *
     * @return Current audio position in milliseconds
     */
    public long getCurrentAudioFrame() {
        return clip.getMicrosecondPosition() % clip.getMicrosecondLength();
    }

    /**
     * It returns the length of audio file in microseconds that is being played
     *
     * @return audio size in milliseconds
     */
    public long getAudioSize() {
        return clip.getMicrosecondLength();
    }

    /**
     * It set value of number of times the audio to be played
     *
     * @param loop Number of time to continue the loop
     */
    public void loop(int loop) {
        clip.loop(loop);
    }

    /**
     * It sets the volume
     *
     * @param vol Audio volume in percent
     */
    public void setVolume(int vol) {
        if (vol <= 100 && vol >= 0) {
            float volume = vol / 100.0f;
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(20f * (float) Math.log10(volume));
        } else {
            throw new VolumeOutOfRangeException(vol);
        }
    }

    /**
     * It returns the volume
     *
     * @return volume in which the audio is being played in percent
     */
    public int getVolume() {
        FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        float vol = (float) Math.pow(10f, gainControl.getValue() / 20f);
        return (int) vol * 100;
    }

    /**
     * It prints the volume
     */
    public void printVolume() {
        System.out.println(getVolume());
    }

    /**
     * It waits for the audio to finish. The control returns back to the calling statement when the audio finishes
     */
    public void waitFor() {
        try {
            Thread.sleep(timeToFinish());
        } catch (InterruptedException e) {
        }
    }

    /**
     * It waits for the audio to finish for a certain period of time. If the
     * audio finish within the given time the control returns bact to the
     * calling statement. If the waiting time reaches the given time limit the
     * control returns back to the calling time.
     *
     * @param timeout max time to wait for the audio to finish
     */
    public void waitFor(int timeout) {
        try {
            timeout = (int) Time.convert(Time.MICROSECOND, Time.MILLISECOND, timeout);
            int t = timeToFinish();
            if (Numbers.isNegative(timeout)) {
                throw new InvalidAudioFrameException();
            } else if (timeout > t) {
                Thread.sleep(t);
            } else {
                Thread.sleep(timeout);
            }
        } catch (InterruptedException e) {
        }
    }

    /**
     * It return the time to finish the audio in milliseconds
     *
     * @return The remaining time to finish the audio in milliseconds
     */
    protected int timeToFinish() {
        int current = (int) Time.convert(Time.MICROSECOND, Time.MILLISECOND, getCurrentAudioFrame());
        int full = (int) Time.convert(Time.MICROSECOND, Time.MILLISECOND, getAudioSize());
        return full - current;
    }

    /**
     * It return the time to finish the audio in microseconds
     *
     * @return  The remaining time to finish the audio in microseconds
     */
    public long getTimeToFinish() {
        long a = (long) Time.convert(Time.MILLISECOND, Time.MICROSECOND, timeToFinish());
        return a;
    }

    /**
     * It mutes the audio
     */
    public void mute() {
        if (!isMute) {
            isMute = true;
            initVol = getVolume();
            setVolume(0);
        } else {
            throw new InvalidMuteModeException(isMute);
        }
    }

    /**
     * It unmutes the audio
     */
    public void unmute() {
        if (isMute) {
            isMute = false;
            setVolume(initVol);
        } else {
            throw new InvalidMuteModeException(isMute);
        }

    }

    /**
     * It toggle the mute mode
     */
    public void toggleMute() {
        if (isMute) {
            unmute();
        } else {
            mute();
        }
    }

    /**
     * It jumps to certain point on the audio according to audio percentage
     *
     * @param percent position to jump on in percent
     * @throws IOException
     * @throws LineUnavailableException
     * @throws UnsupportedAudioFileException
     */
    public void jumpToPercent(double percent) throws IOException, LineUnavailableException, UnsupportedAudioFileException {
        long a = (long) (percent / 100 * getAudioSize());
        jump(a);
    }

}
