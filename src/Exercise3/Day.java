package Exercise3;

import java.util.Scanner;

public class Day {
    //Day's class variables...
    private String currentDay;
    private String futureDay;
    private String tomorrow;
    private String yesterday;
    private int currentDayCount;
    private int futureDayCount;
    //Day's class scanner object...
    Scanner scan = new Scanner(System.in);

    /**
     * The Day class constructor that uses the user's input
     * and makes it lowercase, then assigns it to the currentDay
     * string variable...
     * */
    public Day(String setDay){
        currentDay = setDay.toLowerCase();
    }

    public void setDay(){
        switch (currentDay){
            case "mon":
                currentDayCount = 1;
                currentDay = "Monday";
                System.out.println("You entered the " + currentDayCount + "st day of the week: Monday");
                break;
            case "monday":
                currentDayCount = 1;
                currentDay = "Monday";
                System.out.println("You entered the " + currentDayCount + "st day of the week: Monday");
                break;
            case  "tu":
                currentDayCount = 2;
                currentDay = "Tuesday";
                System.out.println("You entered the " + currentDayCount + "nd day of the week: Tuesday");
                break;
            case "tue":
                currentDayCount = 2;
                currentDay = "Tuesday";
                System.out.println("You entered the " + currentDayCount + "nd day of the week: Tuesday");
                break;
            case "tues":
                currentDayCount = 2;
                currentDay = "Tuesday";
                System.out.println("You entered the " + currentDayCount + "nd day of the week: Tuesday");
                break;
            case "tuesday":
                currentDayCount = 2;
                currentDay = "Tuesday";
                System.out.println("You entered the " + currentDayCount + "nd day of the week: Tuesday");
                break;
            case "wed":
                currentDayCount = 3;
                currentDay = "Wednesday";
                System.out.println("You entered the " + currentDayCount + "rd day of the week: Wednesday");
                break;
            case "wednesday":
                currentDayCount = 3;
                currentDay = "Wednesday";
                System.out.println("You entered the " + currentDayCount + "rd day of the week: Wednesday");
                break;
            case "th":
                currentDayCount = 4;
                currentDay = "Thursday";
                System.out.println("You entered the " + currentDayCount + "th day of the week: Thursday");
                break;
            case "thu":
                currentDayCount = 4;
                currentDay = "Thursday";
                System.out.println("You entered the " + currentDayCount + "th day of the week: Thursday");
                break;
            case "thur":
                currentDayCount = 4;
                currentDay = "Thursday";
                System.out.println("You entered the " + currentDayCount + "th day of the week: Thursday");
                break;
            case "thurs":
                currentDayCount = 4;
                currentDay = "Thursday";
                System.out.println("You entered the " + currentDayCount + "th day of the week: Thursday");
                break;
            case "thursday":
                currentDayCount = 4;
                currentDay = "Thursday";
                System.out.println("You entered the " + currentDayCount + "th day of the week: Thursday");
                break;
            case "fri":
                currentDayCount = 5;
                currentDay = "Friday";
                System.out.println("You entered the " + currentDayCount + "th day of the week: Friday");
                break;
            case "friday":
                currentDayCount = 5;
                currentDay = "Friday";
                System.out.println("You entered the " + currentDayCount + "th day of the week: Friday");
                break;
            case "sat":
                currentDayCount = 6;
                currentDay = "Saturday";
                System.out.println("You entered the " + currentDayCount + "th day of the week: Saturday");
                break;
            case "saturday":
                currentDayCount = 6;
                currentDay = "Saturday";
                System.out.println("You entered the " + currentDayCount + "th day of the week: Saturday");
                break;
            case "sun":
                currentDayCount = 7;
                currentDay = "Sunday";
                System.out.println("You entered the " + currentDayCount + "th day of the week: Sunday");
                break;
            case "sunday":
                currentDayCount = 7;
                currentDay = "Sunday";
                System.out.println("You entered the " + currentDayCount + "th day of the week: Sunday");
                break;
            default:
                System.out.println("Invalid Entry!");
                break;
        }
    }

    public String yesterday(){
        int yesterdayCount = currentDayCount;
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
        int tomorrowCount = currentDayCount;
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

    /**
     * The daysAhead method has three int variables named daysAhead,
     * test, and uInput. This method uses a print statement to prompt
     * the user for input followed by a while loop to validate that the
     * user's input is an integer. If the user inputs an integer the while
     * loop is exited and uInput variable is assigned the scanner objects
     * input, else the user is re-prompted. The test variable is then
     * assigned the uInput variable divided by 7. Next, an if/else checks
     * to see if the test variable is less than 1. If the test variable is
     * less than one the futureDay string is set to the currentDay string. If
     * test is greater than 1 a nested if/else statement is ran followed
     * by a switch statement to select the correct day for the futureDay
     * string variable and a print statement to display the futureDay
     * string variable...
     * */
    public void daysAhead(){

        //The daysAhead method variables...
        int daysAhead;
        int test;
        int uInput;

        //Prompt print statement...
        System.out.print("How many days would you like to move ahead: ");
        //User input validation loop...
        while (!scan.hasNextInt()){
            scan.next();
            if(!scan.hasNextInt()){
                //Error message and re-prompt statement...
                System.out.println("Integers Only! Try Again! \n");
                System.out.print("How many days would you like to move ahead: ");
            }
        }

        //Variable assigning...
        uInput = scan.nextInt();
        test = uInput % 7;

        if(test < 1){
            futureDay = currentDay;
            System.out.println(uInput + "" + futureDay);
        }else{
            /**
             * The else statement adds the test and currentDayCount variables
             * to the daysAhead variable. The nested if/else statement
             * checks to see if daysAhead is greater than 7. If daysAhead
             * is greater than 7 the futureDayCount int variable will be
             * set to equal the remainder of the daysAhead variable divided
             * by 7. If the daysAhead variable is less than or equal to
             * 7, the futureDayCount int variable will be set to equal the
             * daysAhead variable. After the outer else statement is executed
             * the futureDayCount variable will passed to a switch statement
             * to set the futureDay string variable...
             * */
            daysAhead = test + currentDayCount;
            if (daysAhead > 7){
                futureDayCount = daysAhead % 7;
                //System.out.println(futureDayCount);
            }else if(daysAhead <= 7) {
                futureDayCount = daysAhead;
                //System.out.println(futureDayCount);
            }

            /**
             * The switch statement selects the correct day for the futureDay
             * variable based on the futureDayCount variable...
             * */
            switch (futureDayCount){
                case 1:
                    futureDay ="Monday";
                    break;
                case 2:
                    futureDay ="Tuesday";
                    break;
                case 3:
                    futureDay ="Wednesday";
                    break;
                case 4:
                    futureDay ="Thursday";
                    break;
                case 5:
                    futureDay ="Friday";
                    break;
                case 6:
                    futureDay ="Saturday";
                    break;
                case 7:
                    futureDay ="Sunday";
                    break;
            }
            //The future day print out...
            System.out.println(uInput + " days from today will be " + futureDay);
        }

    }
}
