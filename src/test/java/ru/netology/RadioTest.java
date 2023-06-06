package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void volumeRadioMin() { //  уровень громкости звука достиг минимального значения
        Radio service = new Radio();

        service.setIncreaseVolume(0);

        int expected = 0;
        int actual = service.getIncreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingNext () { // увеличение громкости звука на 1
        Radio service = new Radio();

        service.setIncreaseVolume(1);

        int expected = 2;
        int actual = service.getIncreaseVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void switchingPrev () { // уменьшение громкости на 1
        Radio service = new Radio();
        service.setVolumePrev(5);

        int expected = 4;
        int actual = service.getIncreaseVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void switching () { // уменьшение громкости на 1
        Radio service = new Radio();
        service.setVolumePrev(101);

        int expected = 0;
        int actual = service.getIncreaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void volumeReductionAtZero () { // уменьшение громкости при нуле
        Radio service = new Radio();
        service.setVolumePrev(-1);

        int expected = 0;
        int actual = service.getIncreaseVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volumeRadioMax() { // уровень громкости звука достиг максимального значения
        Radio service = new Radio();

        service.setIncreaseVolume(100);

        int expected = 100;
        int actual = service.getIncreaseVolume();

        Assertions.assertEquals(expected, actual);
    }
    // Радио станции
    @Test
    public void radioStation() { // переключение на следующую станцию
        Radio service = new Radio();
        service.setStationRadio(2);

        int expected = 3;
        int actual = service.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void radioStationNext() { // переключение на следующую станцию
        Radio service = new Radio();
        service.setStationRadio(9);

        int expected = 0;
        int actual = service.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void settingUpRadioStation() { // Выставленный номер радиостанции
        Radio service = new Radio();
        service.settingStationRadio(5);

        int expected = 5; 
        int actual = service.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void settingUpRadioStationDontNotExist () { // выставление радиостанции которой не существует
        Radio service = new Radio();
        service.settingStationRadio(15);

        int expected = 0;
        int actual = service.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationNext() { //  радиостанция 9 и клиент нажал на кнопку next
        Radio service = new Radio();
        service.rewindStationRadio(10);

        int expected = 0;
        int actual = service.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void currentRadioStationPrev () { // текущая радиостанция 0 и клиент нажал на кнопку prev
        Radio service = new Radio();
        service.rewindStationRadio(-1);

        int expected = 9;
        int actual = service.getStationRadio();
        Assertions.assertEquals(expected, actual);
    }
}
