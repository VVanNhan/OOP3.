public class OOP34 {
    public static void main(String[] args) {
        // Test default constructor
        Mytime time1 = new Mytime();
        System.out.println("Default time: " + time1);
        Mytime time2 = new Mytime(13, 59, 59);
        System.out.println("Initialized time: " + time2);
        time2.setTime(23, 59, 58);
        System.out.println("Set time to: " + time2);
        time2.nextSecond();
        System.out.println("After nextSecond: " + time2);
        time2.nextSecond();
        System.out.println("After another nextSecond: " + time2);
        time2.setTime(23, 59, 58);
        time2.nextMinute();
        System.out.println("After nextMinute: " + time2);
        time2.setTime(23, 59, 58);
        time2.nextHour();
        System.out.println("After nextHour: " + time2);
        time2.setTime(0, 0, 0);
        time2.previousSecond();
        System.out.println("After previousSecond: " + time2);
        time2.setTime(0, 0, 0);
        time2.previousMinute();
        System.out.println("After previousMinute: " + time2);
        time2.setTime(0, 0, 0);
        time2.previousHour();
        System.out.println("After previousHour: " + time2);
    }
}
