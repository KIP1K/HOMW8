package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void RadioChannelMax() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(9);

        int expected = 9;
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioChannelAboweMax() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioChannelBeloweMin() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(-1);

        int expected = 0;
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioChannelMin() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(0);

        int expected = 0;
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(8);

        radio.next();

        int expected = 9;
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextStationMax() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(9);

        radio.next();

        int expected = 0;
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextStationFromBeginning() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(0);

        radio.next();

        int expected = 1;
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationFromBeginning() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationMin() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationMax() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeSet() {
        Radio radio = new Radio();
        radio.setVolume(55);

        int expected = 55;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeMin() {
        Radio radio = new Radio();
        radio.setVolume(0);

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeMax() {
        Radio radio = new Radio();
        radio.setVolume(100);

        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeAbowMax() {
        Radio radio = new Radio();
        radio.setVolume(101);

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeBelowMin() {
        Radio radio = new Radio();
        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeIncrease() {
        Radio radio = new Radio();
        radio.setVolume(55);
        radio.increaseVolume();

        int expected = 56;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeIncreaseMax() {
        Radio radio = new Radio();
        radio.setVolume(99);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeIncreaseAboweMax() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeIncreaseMin() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeIncreaseAboweMin() {
        Radio radio = new Radio();
        radio.setVolume(1);
        radio.increaseVolume();

        int expected = 2;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeReduce() {
        Radio radio = new Radio();
        radio.setVolume(55);
        radio.reduceVolume();

        int expected = 54;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeReduceMin() {
        Radio radio = new Radio();
        radio.setVolume(1);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeReduceBelowMin() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeReduceMax() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.reduceVolume();

        int expected = 99;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

}
