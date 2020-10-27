package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void onNextRadioStation() {
        Radio radio = new Radio(6, 0,10,6,0,100);
        radio.onNextRadioStation();
        assertEquals(7,radio.getCurrentRadioStation());
    }

    @Test
    void onPrevRadioStation() {
        Radio radio = new Radio(4, 0, 10, 2,0,100);
        radio.onPrevRadioStation();
        assertEquals(3,radio.getCurrentRadioStation());
    }

    @Test
    void onNextRadioStationAfterMax() {
        Radio radio = new Radio(10, 0,10,7,0,100);
        radio.onNextRadioStation();
        assertEquals(0,radio.getCurrentRadioStation());
    }

    @Test
    void onPrevRadioStationBeforeMin() {
        Radio radio = new Radio(0, 0,10,0,0,100);
        radio.onPrevRadioStation();
        assertEquals(10,radio.getCurrentRadioStation());
    }

    @Test
    void onNextSoundVolume() {
        Radio radio = new Radio(4, 0,10,5,0, 100);
        radio.onNextSoundVolume();
        assertEquals(6,radio.getCurrentSoundVolume());
    }

    @Test
    void onPrevSoundVolume() {
        Radio radio = new Radio(4, 0,10,7,0,100);
        radio.onPrevSoundVolume();
        assertEquals(6,radio.getCurrentSoundVolume());
    }

    @Test
    void onNextSoundVolumeAfterMax() {
        Radio radio = new Radio(4, 0,10,100,0,100);
        radio.onNextSoundVolume();
        assertEquals(100,radio.getCurrentSoundVolume());
    }

    @Test
    void onPrevSoundVolumeBeforeMin() {
        Radio radio = new Radio(4, 0,10,0,0,100);
        radio.onPrevSoundVolume();
        assertEquals(0,radio.getCurrentSoundVolume());
    }
}


