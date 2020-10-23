package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldCreate ( ) {
        Radio radio = new Radio();
    }

    @Test
    void SoundsVolumeMoreMax ( ) {
        Radio radio = new Radio();
        int soundVolume = 11;
        int expected = 0;
        radio.setSoundVolume(soundVolume);
        assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    void SoundsVolumeLessMin ( ) {
        Radio radio = new Radio();
        int soundVolume = -1;
        int expected = 0;
        radio.setSoundVolume(soundVolume);
        assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    void shouldReturnSoundsVolume ( ) {
        Radio radio = new Radio();
        int soundVolume = 6;
        int expected = 6;
        radio.setSoundVolume(soundVolume);
        assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    void NextSoundVolume ( ) {
        Radio radio = new Radio();
        int soundVolume = 4;
        int expected = 5;
        radio.setSoundVolume(soundVolume);
        radio.onNextSound();
        assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    void NextSoundMax ( ) {
        Radio radio = new Radio();
        int soundVolume = 10;
        int expected = 10;
        radio.setSoundVolume(soundVolume);
        radio.onNextSound();
        assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    void PreviousSound ( ) {
        Radio radio = new Radio();
        int soundVolume = 4;
        int expected = 3;
        radio.setSoundVolume(soundVolume);
        radio.onPreviousSound();
        assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    void PreviousSoundMin ( ) {
        Radio radio = new Radio();
        int soundVolume = 0;
        int expected = 0;
        radio.setSoundVolume(soundVolume);
        radio.onPreviousSound();
        assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    void shouldReturnCurrentStation ( ) {
        Radio radio = new Radio();
        int currentStation = 6;
        int expected = 6;
        radio.setCurrentStation(currentStation);
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldReturnCurrentStationMore ( ) {
        Radio radio = new Radio();
        int currentStation = 10;
        int expected = 0;
        radio.setCurrentStation(currentStation);
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldReturnCurrentStationLess ( ) {
        Radio radio = new Radio();
        int currentStation = -1;
        int expected = 0;
        radio.setCurrentStation(currentStation);
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void NextStation ( ) {
        Radio radio = new Radio();
        int currentStation = 4;
        int expected = 5;
        radio.setCurrentStation(currentStation);
        radio.onNextStation();
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void NextStationMax ( ) {
        Radio radio = new Radio();
        int currentStation = 9;
        int expected = 0;
        radio.setCurrentStation(currentStation);
        radio.onNextStation();
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void PreviousStationMin ( ) {
        Radio radio = new Radio();
        int currentStation = 0;
        int expected = 9;
        radio.setCurrentStation(currentStation);
        radio.onPreviousStation();
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void PreviousStation ( ) {
        Radio radio = new Radio();
        int currentStation = 4;
        int expected = 3;
        radio.setCurrentStation(currentStation);
        radio.onPreviousStation();
        assertEquals(expected, radio.getCurrentStation());
    }
}

