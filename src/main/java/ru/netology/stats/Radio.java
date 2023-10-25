package ru.netology.stats;
public class Radio {
    private int radioStationNumber;
    private int volume;

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void setRadioStationNumber(int radioStationNumber) {
        if (radioStationNumber<0){
            return;
        }
        if (radioStationNumber>9){
            return;
        }
        this.radioStationNumber = radioStationNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume<0){
            return;
        }
        if (volume>100){
            return;
        }
        this.volume = volume;
    }




}
