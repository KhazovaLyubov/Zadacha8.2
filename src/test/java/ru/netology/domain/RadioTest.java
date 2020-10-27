package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void onNextRadioStation() {
        Radio radio = new Radio(4, 0);
        radio.onNextRadioStation();
        assertEquals(5,radio.getCurrentRadioStation());
    }

    @Test
    void onPrevRadioStation() {
        Radio radio = new Radio(4, 0);
        radio.onPrevRadioStation();
        assertEquals(3,radio.getCurrentRadioStation());
    }

    @Test
    void onNextRadioStationAfterMax() {
        Radio radio = new Radio(10, 0);
        radio.onNextRadioStation();
        assertEquals(0,radio.getCurrentRadioStation());
    }

    @Test
    void onPrevRadioStationBeforeMin() {
        Radio radio = new Radio(0, 0);
        radio.onPrevRadioStation();
        assertEquals(10,radio.getCurrentRadioStation());
    }

    @Test
    void onNextSoundVolume() {
        Radio radio = new Radio(4, 7);
        radio.onNextSoundVolume();
        assertEquals(8,radio.getCurrentSoundVolume());
    }

    @Test
    void onPrevSoundVolume() {
        Radio radio = new Radio(4, 7);
        radio.onPrevSoundVolume();
        assertEquals(6,radio.getCurrentSoundVolume());
    }

    @Test
    void onNextSoundVolumeAfterMax() {
        Radio radio = new Radio(4, 100);
        radio.onNextSoundVolume();
        assertEquals(100,radio.getCurrentSoundVolume());
    }

    @Test
    void onPrevSoundVolumeBeforeMin() {
        Radio radio = new Radio(4, 0);
        radio.onPrevSoundVolume();
        assertEquals(0,radio.getCurrentSoundVolume());
    }
}


