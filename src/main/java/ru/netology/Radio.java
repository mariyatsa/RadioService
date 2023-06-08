package ru.netology;

public class Radio {
    // громкость звука
    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setIncreaseVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void increaseVolumeNext() {
        if (currentVolume < 100) {
            currentVolume++;
            return;
        }
        currentVolume = 100;
    }

    public void increaseVolumePrev() {
        if (currentVolume > 0) {
            currentVolume--;
            return;
        }
        currentVolume = 0;
    }

    // Радио станция
    public int stationRadio;

    public int getStationRadio() {
        return stationRadio;
    }

    public void setStationRadio(int stationRadio) {
        if (stationRadio > 9) {
            return;
        }
        if (stationRadio < 0) {
            return;
        }
        this.stationRadio = stationRadio;
    }

    public void stationRadioNext() {
        if (stationRadio != 9) {
            stationRadio++;
            return;
        }
        stationRadio = 0;
    }

    public void stationRadioPrev() {
        if (stationRadio != 0) {
            stationRadio--;
            return;
        }
        stationRadio = 9;
    }
}




