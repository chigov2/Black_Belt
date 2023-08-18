package main.java.Enums;

import java.util.Arrays;

public class Unum1 {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.MONDAY);
        today.daysInfo();
        System.out.println(today.weekDay);
        WeekDays w1 = WeekDays.FRIDAY;
        WeekDays w2 = WeekDays.FRIDAY;
        WeekDays w3 = WeekDays.MONDAY;
        //сравнение
        System.out.println(w1==w2);
        System.out.println(WeekDays.FRIDAY.equals(WeekDays2.FRIDAY));
        System.out.println("------valueOf-----");
        WeekDays w16 = WeekDays.valueOf("FRIDAY");
        System.out.println(w16);
        System.out.println("-----values------");
        WeekDays [] array = WeekDays.values();
        System.out.println(Arrays.toString(array));
        System.out.println("-----values2------");
        for (WeekDays i: array){
            System.out.println(i);
        }
    }
}

enum WeekDays{
    SUNDAY("Good"),
    MONDAY("Bad"),
    TUESDAY("Close to normal"),
    WEDNESDAY("Middle!!!"),
    THURSDAY(),
    FRIDAY("OK!!"),
    SATURDAY("Very good");

    private String mood;

    WeekDays(String mood) {
        this.mood = mood;
    }

    WeekDays() {
    }

    String getMood(){
        return mood;
    }
}

enum WeekDays2{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

class Today{
    WeekDays weekDay;

    public Today(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    void daysInfo(){
        switch (weekDay){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Go to office");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Take a rest");
                break;
        }
        System.out.println("Mood today: " + weekDay.getMood());
    }
}
