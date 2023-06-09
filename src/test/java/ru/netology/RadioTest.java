package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void StationRadioNext9() {
        Radio service = new Radio();

        service.setStationRadio(9);
        service.stationRadioNext();

        int expected = 0;
        int actual = service.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationRadioNext0() {
        Radio service = new Radio();

        service.setStationRadio(0);
        service.stationRadioNext();

        int expected = 1;
        int actual = service.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationRadioNext8() {
        Radio service = new Radio();

        service.setStationRadio(8);
        service.stationRadioNext();

        int expected = 9;
        int actual = service.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationRadio1() {
        Radio service = new Radio();

        service.setStationRadio(1);

        int expected = 1;
        int actual = service.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationRadio11() {
        Radio service = new Radio();

        service.setStationRadio(11);

        int expected = 0;
        int actual = service.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationRadio5() {
        Radio service = new Radio();

        service.setStationRadio(-5);

        int expected = 0;
        int actual = service.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationRadio9() {
        Radio service = new Radio();

        service.setStationRadio(9);

        int expected = 9;
        int actual = service.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationRadioPrev0() {
        Radio service = new Radio();

        service.setStationRadio(0);
        service.stationRadioPrev();

        int expected = 9;
        int actual = service.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationRadioPrev9() {
        Radio service = new Radio();

        service.setStationRadio(9);
        service.stationRadioPrev();

        int expected = 8;
        int actual = service.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeRadioNext0() {
        Radio service = new Radio();
        service.setIncreaseVolume(0);
        service.increaseVolumeNext();

        int expected = 1;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeRadioNext100() {
        Radio service = new Radio();
        service.setIncreaseVolume(100);
        service.increaseVolumeNext();

        int expected = 100;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeRadioNext1() {
        Radio service = new Radio();
        service.setIncreaseVolume(-1);
        service.increaseVolumeNext();

        int expected = 0;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeRadioNext101() {
        Radio service = new Radio();
        service.setIncreaseVolume(101);
        service.increaseVolumeNext();

        int expected = 100;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeRadioPrev0() {
        Radio service = new Radio();
        service.setIncreaseVolume(0);
        service.increaseVolumePrev();

        int expected = 0;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeRadioPrev100(){
        Radio service = new Radio();
        service.setIncreaseVolume(100);
        service.increaseVolumePrev();

        int expected = 99;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void stationNew () {
        Radio service = new Radio(10);
        service.setStationRadio(9);

        int expected = 9;
        int actual = service.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }
}
