package Exercise3;

import java.util.Scanner;

public class Day {
    //Day's class variables...
    private String currentDay;
    private String futureDay;
    private String tomorrow;
    private String yesterday;
    /**
     * The currentDayCount and futureDayCount variables are used
     * to track the day number of the week for a 7 day week(e.g. Monday = 1, Tuesday = 2 etc...)...
     * */
    private int currentDayCount;
    private int futureDayCount;
    //Day class scanner object...
    Scanner scan = new Scanner(System.in);

    /**
     * The Day class constructor takes the user's input in
     * and makes it lowercase, then assigns it to the
     * currentDay string variable to be tested in the setDay()
     * method...
     * */
    public Day(String setDay){
        currentDay = setDay.toLowerCase();
    }

    /**
     * The setDay() method will test the value of the currentDay
     * string variable to see if the user input is an actual day
     * of the week. The switch statement has a case for each day
     * and its different abbreviation for a 7 day week along with
     * a default case if the user dose not enter a valid day of
     * the week. If the currentDay variable dose match valid day
     * of the week case string, the currentDayCount int variable
     * is assigned the value of that week day(e.g. Monday = 1,
     * Tuesday = 2 etc...) and the currentDay string variable is
     * assigned the string of the day fully spelled out that
     * matches the currentDayCount. After the two variables are
     * assigned, a print statement displays to the console the
     * currentDayCount variable and the currentDay string variable.
     * */
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

    /**
     * The yesterday() method has a int variable named yesterdayCount that
     * is first assigned the value of the currentDayCount variable. The
     * if/else statement checks to see if the yesterdayCount variable is
     * less than or equal to 1. If the yesterdayCount variable is less
     * than or equal to 1 the yesterdayCount variable will be set to equal
     * 7, else if it is greater than 1 the variable will decremented by 1.
     * After the if/else statement is executed a switch statement will test
     * the yesterdayCount variable to match the correct number case (e.g. Monday = 1,
     * Tuesday = 2 etc...) to it, assign the yesterday string variable with the
     * previous day of the currentDay variable and print the yesterday variable
     * to the console.
     * */
    public void yesterday(){
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
    }

    /**
     * The tomorrow() method has a int variable named tomorrowCount that
     * is first assigned the value of the currentDayCount variable. The
     * if/else statement checks to see if the tomorrowCount variable is
     * greater than or equal to 7. If the tomorrowCount variable is greater
     * than or equal to 7 the tomorrowCount variable will be set to equal
     * 1, else if it is less than 7 the variable will incremented by 1.
     * After the if/else statement is executed a switch statement will test
     * the tomorrowCount variable to match the correct number case(e.g. Monday = 1,
     * Tuesday = 2 etc...) to it, assign the tomorrow string variable with the
     * next day of the currentDay variable and print the tomorrow string variable
     * to the console.
     * */
    public void tomorrow(){
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
             * The switch statement will test the futureDayCount
             * variable and select the correct day for the futureDay
             * string variable based on the futureDayCount int
             * variable(e.g. Monday = 1,Tuesday = 2 etc...)...
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
