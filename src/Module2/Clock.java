package Module2;

import javax.swing.plaf.IconUIResource;

public class Clock {
    int alarmHours;
    int alarmMinutes;


    public String setAlarm(int hours, int minutes) {
        if (hours >= 0 && hours <= 23 && minutes >= 0 && minutes < 60)
            this.alarmHours = hours;
        this.alarmMinutes = minutes;
        return "Alarm set up: " + hours + ":" + minutes;
    }

    public String checkAlarm(int hours, int minutes) {
        if (hours == this.alarmHours && minutes == this.alarmMinutes)
            return "Chime!";
        else
            return "The alarm did not go off!";

    }
    public int checkTimeCount(int hours, int minutes){
        int count=0;
        if (hours >= 0 && hours <= 23 && minutes >= 0 && minutes < 60){
        if (hours>12){
            hours=hours-12;
        }
        for (int i = 0; i < hours; i++) {

            if (minutes==0){
                count=hours;
            }
            else if (minutes%15==0){
                count=1;
            }
            else {
                count=0;
            }
        }

        }
        return count;
    }


    public static void main(String[] args) {
        Clock clock=new Clock();
        System.out.println(clock.setAlarm(15,30));
        System.out.println(clock.checkAlarm(15,30));
        System.out.println(clock.checkTimeCount(15,31));

    }

}