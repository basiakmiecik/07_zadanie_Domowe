package calendar;

public class CalendarConveter {
    private static final int monday = 1;
    private static final int tuesday = 2;
    private static final int wednesday = 3;
    private static final int thursday = 4;
    private static final int friday = 5;
    private static final int saturday = 6;
    private static final int sunday = 7;


    public static String convertDayToString(int dayNumber) {
        String day = null;
        switch (dayNumber) {
            case monday: {
                day = "Poniedziałek";
                break;
            }
            case tuesday: {
                day = "Wtorek";
                break;
            }
            case wednesday: {
                day = "Środa";
                break;
            }
            case thursday: {
                day = "Czwartek";
                break;
            }
            case friday: {
                day = "Piątek";
                break;
            }
            case saturday: {
                day = "Sobota";
                break;
            }
            case sunday: {
                day = "Niediela";
                break;
            }
        }

        return day;
    }

}
