package ru.netology;

public class Radio {
    // громкость звука
    public int currentVolume;
    public int getIncreaseVolume() {
        return currentVolume;
    }
    public void setIncreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume < 100) {
            currentVolume = newCurrentVolume + 1;
        }
        if (newCurrentVolume >= 100) {
            currentVolume = 100;
        }
        if (newCurrentVolume <= 0) {
            currentVolume = 0;
        }
    }
    public void setVolumePrev (int newVolumePrev) {
        if (newVolumePrev < 100) {
            currentVolume = newVolumePrev - 1;
        }
        if (newVolumePrev < 0) {
            currentVolume = 0;
        }
    }
    // Радио станция
    public int stationRadio;
    public int getStationRadio() {
        return stationRadio;
    }

    public void rewindStationRadio(int newStationRadio) {
        if (newStationRadio > 9) {
            stationRadio = 0;
        }
        if (newStationRadio < 0) {
           stationRadio = 9;
        }
    }

    public void setStationRadio(int newStationRadio) {
        if (newStationRadio < 9) {
            stationRadio = newStationRadio + 1;
        }
    }

    public void settingStationRadio(int newSationRadio) {
        if (newSationRadio > 9) {
            return;
        }
        stationRadio = newSationRadio;
    }
}