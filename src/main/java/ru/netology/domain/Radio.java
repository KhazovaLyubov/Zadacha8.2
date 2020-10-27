package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
class Radio {
    private int currentRadioStation;
    private int minRadioStation;
    private int maxRadioStation = 10;
    private int currentSoundVolume;
    private int minSoundVolume;
    private int maxSoundVolume = 100;

    public Radio(int currentRadioStation, int currentSoundVolume) {
        this.currentRadioStation = currentRadioStation;
        this.currentSoundVolume = currentSoundVolume;
    }


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation){
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume >= maxSoundVolume){
            this.currentSoundVolume = maxSoundVolume;
            return;
        }
        if (currentSoundVolume <= minSoundVolume){
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public void setMinSoundVolume(int minSoundVolume) {
        this.minSoundVolume = minSoundVolume;
    }

    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    public void setMaxSoundVolume(int maxSoundVolume) {
        this.maxSoundVolume = maxSoundVolume;
    }

    public void onNextRadioStation() {
        if (currentRadioStation < maxRadioStation){
            this.currentRadioStation++;
        }
        if (currentRadioStation == maxRadioStation){
            this.currentRadioStation = minRadioStation;
        }
    }

    public void onPrevRadioStation() {
        if (currentRadioStation > minRadioStation){
            this.currentRadioStation--;
        }
        if (currentRadioStation == minRadioStation){
            this.currentRadioStation = maxRadioStation;
        }
    }

    public void onNextSoundVolume(){
        if (currentSoundVolume < maxSoundVolume){
            this.currentSoundVolume++;
        }
        if (currentSoundVolume == maxSoundVolume){
        }
    }

    public void onPrevSoundVolume() {
        if (currentSoundVolume > minRadioStation){
            this.currentSoundVolume--;
        }
        if (currentSoundVolume == maxSoundVolume) {
            this.currentSoundVolume = minSoundVolume;
        }
    }
}





