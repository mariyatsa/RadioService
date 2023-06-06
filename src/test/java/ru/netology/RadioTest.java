package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void volumeRadioMin() {
        Radio service = new Radio();

        service.setIncreaseVolume(0);

        int expected = 1;
        int actual = service.getIncreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void whenTheValueIsZero() {
        Radio service = new Radio();

        service.setIncreaseVolume(0);

        int expected = 1;
        int actual = service.getIncreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeRadioMax() {
        Radio service = new Radio();

        service.setIncreaseVolume(100);

        int expected = 100;
        int actual = service.getIncreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStation() {
        Radio service = new Radio();
        service.setStationRadio(0);

        int expected = 1;
        int actual = service.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void settingUpRadioStation() {
        Radio service = new Radio();
        service.settingStationRadio(5);

        int expected = 5; //должна быть текущая станция, но мы не знаем какая она
        int actual = service.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStation0() {
        Radio service = new Radio();
        service.rewindStationRadio(10);

        int expected = 0;
        int actual = service.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }
}
