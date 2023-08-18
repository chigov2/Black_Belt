package main.java.Enums;

public class Unum1 {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.MONDAY);
        today.daysInfo();
    }
}

enum WeekDays{
    SUNDAY,MONDAY, TUESDAY, WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
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
    }
}
