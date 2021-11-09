package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void shouldCheckCurrentStationOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(23);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckCurrentStationValidValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckCurrentStationInvalidValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(-6);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckCurrentStationLowerRangeZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckCurrentStationLowerRangeOne() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckCurrentStationLowerRangeMinusOne() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckCurrentStationUpperRangeEight() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckCurrentStationUpperRangeNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckCurrentStationUpperRangeTen() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckSwitchToNextWithinTheLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.switchToNext();
        int expected = 7;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckSwitchToNextMoreThanNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.switchToNext();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckSwitchToPrev() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.switchToPrev();
        int expected = 5;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckSwitchToPrevOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.switchToPrev();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckIncreaseVolumeWithinTheLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(95);
        radio.increaseVolume();
        int expected = 96;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckIncreaseVolumeLessThanTheLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckIncreaseVolumeLowerRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckIncreaseVolumeMoreThanHundred() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckDecreaseVolumeWithinTheLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        radio.decreaseVolume();
        int expected = 5;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckDecreaseVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.decreaseVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckDecreaseVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckDecreaseVolumeOverTheLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(20);
        radio.decreaseVolume();
        int expected = 19;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckCurrentVolumeValidValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        int expected = 5;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckCurrentVolumeInvalidValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-2);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    void shouldNumberOfStations() {
        Radio radio = new Radio(10);
        radio.getNumberOfStations();
        int expected = 10;
        int actual = radio.getNumberOfStations();
        assertEquals(expected, actual);
    }


}