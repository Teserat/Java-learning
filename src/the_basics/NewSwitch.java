package the_basics;

// Java version 14 new switch
public class NewSwitch {
    public static void main(String[] args) {

        String day = getDayOfWeek(2);
        System.out.println(day);
        System.out.println(getDayOfWeek(9));
        System.out.println(getDayOfWeek(-40));

    }

    // switch with return days name
    public static String getDayOfWeek(int dayNumber) {

        return switch (dayNumber) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day number";
        };
    }
}