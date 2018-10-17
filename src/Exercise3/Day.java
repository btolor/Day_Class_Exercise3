package Exercise3;

import java.util.Scanner;

public class Day {
    //Day's class variables...
    public String uInput;
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
    private int dAhead;
    //Day class scanner object...
    Scanner scan = new Scanner(System.in);

    /**
     * The Day class constructor takes the user's input in
     * and makes it lowercase, then assigns it to the
     * uInput string variable to be tested in the setDay()
     * method...
     * */
    public Day(String setDay){
        uInput = setDay.toLowerCase();
    }

    /**The Day class getters and setters methods...*/
    //This method returns the currentDay private variable...
    public String getCurrentDay() {
        return currentDay;
    }
    //This method sets the currentDay private variable...
    public void setCurrentDay(String currentDay) {
        this.currentDay = currentDay;
    }
    //This method returns the futureDay private variable...
    public String getFutureDay() {
        return futureDay;
    }
    //This method sets the futureDay private variable...
    public void setFutureDay(String futureDay) {
        this.futureDay = futureDay;
    }
    //This method returns the tomorrow private variable...
    public String getTomorrow() {
        return tomorrow;
    }
    //This method sets the tomorrow private variable...
    public void setTomorrow(String tomorrow) {
        this.tomorrow = tomorrow;
    }
    //This method returns the yesterday private variable...
    public String getYesterday() {
        return yesterday;
    }
    //This method sets the yesterday private variable...
    public void setYesterday(String yesterday) {
        this.yesterday = yesterday;
    }
    //This method returns the currentDayCount private variable...
    public int getCurrentDayCount() {
        return currentDayCount;
    }
    //This method sets the currentDayCount private variable...
    public void setCurrentDayCount(int currentDayCount) {
        this.currentDayCount = currentDayCount;
    }
    //This method returns the futureDayCount private variable...
    public int getFutureDayCount() {
        return futureDayCount;
    }
    //This method sets the futureDayCount private variable...
    public void setFutureDayCount(int futureDayCount) {
        this.futureDayCount = futureDayCount;
    }
    //This method returns the dAhead private variable...
    public int getdAhead() {
        return dAhead;
    }
    //This method sets the dAhead private variable...
    public void setdAhead(int dAhead) {
        this.dAhead = dAhead;
    }


    /**
     * The setDay() method will test the value of the uInput
     * string variable to see if the user input is equal an actual day
     * of the week. The switch statement has a case for each day
     * and its different abbreviation for a 7 day week along with
     * a default case if the user dose not enter a valid day of
     * the week. If the uInput variable dose match valid day
     * of the week case string, the setCurrentDayCount() method
     * sets the currentDayCount int variable to the value of that
     * week day(e.g. Monday = 1, Tuesday = 2 etc...) and the
     * setCurrentDay() method sets the currentDay string variable
     * to the day fully spelled out that matches the currentDayCount.
     * After the two variables are assigned, the method returns currentDay
     * string variable.
     * */
    public String setDay(){
        switch (uInput){
            case "mon":
                setCurrentDayCount(1);
                setCurrentDay("Monday");
                break;
            case "monday":
                setCurrentDayCount(1);
                setCurrentDay("Monday");
                break;
            case  "tu":
                setCurrentDayCount(2);
                setCurrentDay("Tuesday");
                break;
            case "tue":
                setCurrentDayCount(2);
                setCurrentDay("Tuesday");
                break;
            case "tues":
                setCurrentDayCount(2);
                setCurrentDay("Tuesday");
                break;
            case "tuesday":
                setCurrentDayCount(2);
                setCurrentDay("Tuesday");
                break;
            case "wed":
                setCurrentDayCount(3);
                setCurrentDay("Wednesday");
                break;
            case "wednesday":
                setCurrentDayCount(3);
                setCurrentDay("Wednesday");
                break;
            case "th":
                setCurrentDayCount(4);
                setCurrentDay("Thursday");
                break;
            case "thu":
                setCurrentDayCount(4);
                setCurrentDay("Thursday");
                break;
            case "thur":
                setCurrentDayCount(4);
                setCurrentDay("Thursday");
                break;
            case "thurs":
                setCurrentDayCount(4);
                setCurrentDay("Thursday");
                break;
            case "thursday":
                setCurrentDayCount(4);
                setCurrentDay("Thursday");
                break;
            case "fri":
                setCurrentDayCount(5);
                setCurrentDay("Friday");
                break;
            case "friday":
                setCurrentDayCount(5);
                setCurrentDay("Friday");
                break;
            case "sat":
                setCurrentDayCount(6);
                setCurrentDay("Saturday");
                break;
            case "saturday":
                setCurrentDayCount(6);
                setCurrentDay("Saturday");
                break;
            case "sun":
                setCurrentDayCount(7);
                setCurrentDay("Sunday");
                break;
            case "sunday":
                setCurrentDayCount(7);
                setCurrentDay("Sunday");
                break;
            default:
                setCurrentDayCount(0);
                setCurrentDay("Invalid Entry!");
                break;
        }
        return getCurrentDay();
    }

    /**
     * The yesterday() method has a int variable named yesterdayCount that
     * is first assigned the return value of the getCurrentDayCount() method. The
     * if/else statement checks to see if the yesterdayCount variable is
     * less than or equal to 1. If the yesterdayCount variable is less
     * than or equal to 1 the yesterdayCount variable will be set to equal
     * 7, else if it is greater than 1 the variable will decremented by 1.
     * After the if/else statement is executed a switch statement will test
     * the yesterdayCount variable to match the correct number case (e.g. Monday = 1,
     * Tuesday = 2 etc...) to it. Next, the setYesterday() method sets yesterday
     * string variable with the previous day of the currentDay variable and returns
     * the getYesterday() method value...
     * */
    public String yesterday(){
        int yesterdayCount = getCurrentDayCount();
        if(yesterdayCount <= 1){
            yesterdayCount = 7;
        }else {
            yesterdayCount --;
        }
        switch (yesterdayCount ){
            case 1:
                setYesterday("Monday");
                break;
            case 2:
                setYesterday("Tuesday");
                break;
            case 3:
                setYesterday("Wednesday");
                break;
            case 4:
                setYesterday("Thursday");
                break;
            case 5:
                setYesterday("Friday");
                break;
            case 6:
                setYesterday("Saturday");
                break;
            case 7:
                setYesterday("Sunday");
                break;
            default:
                setYesterday("No valid day was set!");
                break;
        }
        return getYesterday();
    }

    /**
     * The tomorrow() method has a int variable named tomorrowCount that
     * is set to the return value of the getCurrentDayCount() method. The
     * if/else statement checks to see if the tomorrowCount variable is
     * greater than or equal to 7. If the tomorrowCount variable is greater
     * than or equal to 7 the tomorrowCount variable will be set to equal
     * 1, else if it is less than 7 the variable will incremented by 1.
     * After the if/else statement is executed a switch statement will test
     * the tomorrowCount variable to match the correct number case(e.g. Monday = 1,
     * Tuesday = 2 etc...) to it. Next, the setTomorrow() method sets the
     * tomorrow string variable to the next day of the currentDay variable
     * and returns the getTomorrow() method value...
     * */
    public String tomorrow(){
        int tomorrowCount = getCurrentDayCount();
        if(tomorrowCount >= 7){
            tomorrowCount = 1;
        }else {
            tomorrowCount ++;
        }
        switch (tomorrowCount){
            case 1:
                setTomorrow("Monday");
                break;
            case 2:
                setTomorrow("Tuesday");
                break;
            case 3:
                setTomorrow("Wednesday");
                break;
            case 4:
                setTomorrow("Thursday");
                break;
            case 5:
                setTomorrow("Friday");
                break;
            case 6:
                setTomorrow("Saturday");
                break;
            case 7:
                setTomorrow("Sunday");;
                break;
            default:
                setTomorrow("No valid day was set!");
                break;
        }
        return getTomorrow();
    }

    /**
     * The daysAhead method has two int variables named daysAhead and
     * test. This method uses a print statement to prompt
     * the user for input followed by a while loop to validate that the
     * user's input is an integer. If the user inputs an integer the while
     * loop is exited and the scanner objects input is passed to the
     * setdAhead() method, else the user is re-prompted. The test variable
     * is then assigned the return value of the getdAhead() method divided
     * by 7. Next, an if/else checks to see if the test variable is less
     * than 1. If the test variable is less than one the setFutureDay()
     * method is set to the getCurrentDay() method return value. If test
     * is greater than 1 a nested if/else statement is ran followed by a
     * switch statement to pass the correct future day value to the
     * setFutureDay() method and a return statement returns the return
     * value of the getFutureDay() method...
     * */
    public String daysAhead(){

        //The daysAhead method variables...
        int daysAhead;
        int test;

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
        setdAhead(scan.nextInt());
        test = getdAhead() % 7;

        if(test < 1){
            setFutureDay(getCurrentDay());
        }else{
            /**
             * The else statement adds the test int variable and return
             * value of the getCurrentDayCount() method to the daysAhead
             * variable. The nested if/else statement checks to see if the
             * daysAhead variable is greater than 7. If the daysAhead
             * variable is greater than 7 the setFutureDayCount() method is
             * set to equal the remainder of the daysAhead variable divided
             * by 7. If the daysAhead variable is less than or equal to 7,
             * the setFutureDayCount() will be set to equal the daysAhead
             * variable. After the outer else statement is executed the
             * return value of the getFutureDayCount() method is passed to a
             * switch statement to set the setFutureDay() method value...
             * */
            daysAhead = test + getCurrentDayCount();
            if (daysAhead > 7){
                setFutureDayCount(daysAhead % 7);
            }else if(daysAhead <= 7) {
                setFutureDayCount(daysAhead);
            }

            /**
             * The switch statement will test the return value of the
             * getFutureDayCount() method variable and selects the
             * correct day for the setFutureDay() method based on the
             * return value of the getFutureDayCount() method
             * (e.g. Monday = 1,Tuesday = 2 etc...)...
             * */
            switch (getFutureDayCount()){
                case 1:
                    setFutureDay("Monday");
                    break;
                case 2:
                    setFutureDay("Tuesday");
                    break;
                case 3:
                    setFutureDay("Wednesday");
                    break;
                case 4:
                    setFutureDay("Thursday");
                    break;
                case 5:
                    setFutureDay("Friday");
                    break;
                case 6:
                    setFutureDay("Saturday");
                    break;
                case 7:
                    setFutureDay("Sunday");
                    break;
                default:
                    setFutureDay("No valid day was set!");
                    break;
            }
        }
        return getFutureDay();
    }
}
