package uk.ac.nulondon;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public Time(int hourInput, int minuteInput, int secondInput) {
        this.hour = hourInput;
        this.minute = minuteInput;
        this.second = secondInput;
    }

    public boolean sameTime(Time timeInput) {
        if (this.hour == timeInput.hour && this.minute == timeInput.minute && this.second == timeInput.second) {
            return true;
        } else {
            return false;
        }
    }
}
