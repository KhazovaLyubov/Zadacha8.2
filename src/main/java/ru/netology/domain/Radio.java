package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int minRadioStation;
    private int maxRadioStation;
    private int currentSoundVolume;
    private int minSoundVolume;
    private int maxSoundVolume;

    public Radio(int currentRadioStation, int minRadioStation, int maxRadioStation, int currentSoundVolume, int minSoundVolume, int maxSoundVolume) {
        this.currentRadioStation = currentRadioStation;
        this.minRadioStation = minRadioStation;
        this.maxRadioStation = maxRadioStation;
        this.currentSoundVolume = currentSoundVolume;
        this.minSoundVolume = minSoundVolume;
        this.maxSoundVolume = maxSoundVolume;
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
        if (currentSoundVolume > minSoundVolume){
            this.currentSoundVolume--;
        }
        if (currentSoundVolume == maxSoundVolume) {
            this.currentSoundVolume = minSoundVolume;
        }
    }
}





