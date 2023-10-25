package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void testRadioChanelMax(){
        Radio radio = new Radio();
        radio.setRadioStationNumber(9);

        int expected = 9;
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testRadioChanelAboweMax(){
        Radio radio = new Radio();
        radio.setRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testRadioChanelBeloweMin(){
        Radio radio = new Radio();
        radio.setRadioStationNumber(-1);

        int expected = 0;
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testRadioChanelMin(){
        Radio radio = new Radio();
        radio.setRadioStationNumber(0);

        int expected = 0;
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected,actual);
    }

}
