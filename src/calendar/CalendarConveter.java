package calendar;

public class CalendarConveter {
    int monday=1;
    int tuesday=2;
    int wendsday=3;
    int thursday=4;
    int friday=5;
    int saturday=6;
    int sunday=7;


    public static String convertDayToString(int dayNumber){
        String day=null;
        switch(dayNumber){
            case 1:{
                day="Poniedziałek";
                break;
            }
            case 2:{
                day="Wtorek";
                break;
            }
            case 3:{
                day="Środa";
                break;
            }
            case 4:{
                day="Czwartek";
                break;
            }
            case 5:{
                day="Piątek";
                break;
            }
            case 6:{
                day="Sobota";
                break;
            }
            case 7:{
                day="Niediela";
                break;
            }
        }

        return day; }

}
