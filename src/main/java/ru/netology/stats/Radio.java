package ru.netology.stats;

public class Radio {
    private int radioStationNumber;
    private int volume;
    private int maxStation ;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int countStationNumber) {
        this.maxStation = countStationNumber - 1;
    }

    public void next() {
        if (radioStationNumber < maxStation) {
            radioStationNumber++;
        } else {
            radioStationNumber = 0;
        }
    }

    public void prev() {
        if (radioStationNumber >= 1) {
            radioStationNumber--;
        } else {
            radioStationNumber = maxStation;
        }
    }

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void setRadioStationNumber(int radioStationNumber) {
        if (radioStationNumber < 0) {
            return;
        }
        if (radioStationNumber > maxStation) {
            return;
        }
        this.radioStationNumber = radioStationNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        } else {
            volume = 100;
        }
    }

    public void reduceVolume() {
        if (volume > 0) {
            volume--;
        } else {
            volume = 0;
        }
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 100) {
            return;
        }
        this.volume = volume;
    }
}




