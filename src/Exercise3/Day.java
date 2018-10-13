package Exercise3;

public class Day {

    private String setDay;
    private String tomorrow;
    private String yesterday;
    private int dayCount;

    public Day(String dayToday){
        setDay = dayToday;
    }

    public void setDay(){
        switch (setDay){
            case "mon":
                dayCount = 1;
                setDay = "Monday";
                System.out.println("You entered the " + dayCount + "st day of the week: Monday");
                break;
            case "monday":
                dayCount = 1;
                setDay = "Monday";
                System.out.println("You entered the " + dayCount + "st day of the week: Monday");
                break;
            case  "tu":
                dayCount = 2;
                setDay = "Tuesday";
                System.out.println("You entered the " + dayCount + "nd day of the week: Tuesday");
                break;
            case "tue":
                dayCount = 2;
                setDay = "Tuesday";
                System.out.println("You entered the " + dayCount + "nd day of the week: Tuesday");
                break;
            case "tues":
                dayCount = 2;
                setDay = "Tuesday";
                System.out.println("You entered the " + dayCount + "nd day of the week: Tuesday");
                break;
            case "tuesday":
                dayCount = 2;
                setDay = "Tuesday";
                System.out.println("You entered the " + dayCount + "nd day of the week: Tuesday");
                break;
            case "wed":
                dayCount = 3;
                setDay = "Wednesday";
                System.out.println("You entered the " + dayCount + "rd day of the week: Wednesday");
                break;
            case "wednesday":
                dayCount = 3;
                setDay = "Wednesday";
                System.out.println("You entered the " + dayCount + "rd day of the week: Wednesday");
                break;
            case "th":
                dayCount = 4;
                setDay = "Thursday";
                System.out.println("You entered the " + dayCount + "th day of the week: Thursday");
                break;
            case "thu":
                dayCount = 4;
                setDay = "Thursday";
                System.out.println("You entered the " + dayCount + "th day of the week: Thursday");
                break;
            case "thur":
                dayCount = 4;
                setDay = "Thursday";
                System.out.println("You entered the " + dayCount + "th day of the week: Thursday");
                break;
            case "thurs":
                dayCount = 4;
                setDay = "Thursday";
                System.out.println("You entered the " + dayCount + "th day of the week: Thursday");
                break;
            case "thursday":
                dayCount = 4;
                setDay = "Thursday";
                System.out.println("You entered the " + dayCount + "th day of the week: Thursday");
                break;
            case "fri":
                dayCount = 5;
                setDay = "Friday";
                System.out.println("You entered the " + dayCount + "th day of the week: Friday");
                break;
            case "friday":
                dayCount = 5;
                setDay = "Friday";
                System.out.println("You entered the " + dayCount + "th day of the week: Friday");
                break;
            case "sat":
                dayCount = 6;
                setDay = "Saturday";
                System.out.println("You entered the " + dayCount + "th day of the week: Saturday");
                break;
            case "saturday":
                dayCount = 6;
                setDay = "Saturday";
                System.out.println("You entered the " + dayCount + "th day of the week: Saturday");
                break;
            case "sun":
                dayCount = 7;
                setDay = "Sunday";
                System.out.println("You entered the " + dayCount + "th day of the week: Sunday");
                break;
            case "sunday":
                dayCount = 7;
                setDay = "Sunday";
                System.out.println("You entered the " + dayCount + "th day of the week: Sunday");
                break;
            default:
                System.out.println("Invalid Entry!");
                break;
        }
    }

    public String yesterday(){
        int yesterdayCount = dayCount;
        if(yesterdayCount <= 1){
            yesterdayCount = 7;
        }else {
            yesterdayCount --;
        }
        switch (yesterdayCount ){
            case 1:
                yesterday = "Monday";
                System.out.println("Yesterday was " + yesterday + "." );
                break;
            case 2:
                yesterday = "Tuesday";
                System.out.println("Yesterday was " + yesterday + "." );
                break;
            case 3:
                yesterday = "Wednesday";
                System.out.println("Yesterday was " + yesterday + "." );
                break;
            case 4:
                yesterday = "Thursday";
                System.out.println("Yesterday was " + yesterday + "." );
                break;
            case 5:
                yesterday = "Friday";
                System.out.println("Yesterday was " + yesterday + "." );
                break;
            case 6:
                yesterday = "Saturday";
                System.out.println("Yesterday was " + yesterday + "." );
                break;
            case 7:
                yesterday = "Sunday";
                System.out.println("Yesterday was " + yesterday + "." );
                break;
        }
        return yesterday;
    }

    public String tomorrow(){
        int tomorrowCount = dayCount;
        if(tomorrowCount >= 7){
            tomorrowCount = 1;
        }else {
            tomorrowCount ++;
        }
        switch (tomorrowCount){
            case 1:
                tomorrow = "Monday";
                System.out.println("Tomorrow is " + tomorrow + "." );
                break;
            case 2:
                tomorrow = "Tuesday";
                System.out.println("Tomorrow is " + tomorrow + "." );
                break;
            case 3:
                tomorrow = "Wednesday";
                System.out.println("Tomorrow is " + tomorrow + "." );
                break;
            case 4:
                tomorrow = "Thursday";
                System.out.println("Tomorrow is " + tomorrow + "." );
                break;
            case 5:
                tomorrow = "Friday";
                System.out.println("Tomorrow is " + tomorrow + "." );
                break;
            case 6:
                tomorrow = "Saturday";
                System.out.println("Tomorrow is " + tomorrow + "." );
                break;
            case 7:
                tomorrow = "Sunday";
                System.out.println("Tomorrow is " + tomorrow + "." );
                break;
        }
        return tomorrow;
    }

    public int daysAhead(int a){
        int daysAhead = 0;
        int test = a % 7;
        if(test == 0){

            System.out.println(test);
        }else if(test>0){
            daysAhead = test;
            System.out.println(daysAhead);
        }


        return daysAhead;
    }
/**
 * if(a > 7){
 *                 daysAhead = dayCount % 7;
 *             }else if(a < 7){
 *                 daysAhead = (a + dayCount) - 7;
 *             }
 *
 * */



}
