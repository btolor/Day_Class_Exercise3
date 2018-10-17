package Exercise3;

import java.util.Scanner;

public class Test {
    public static void main(String[]args){

        /**
         * The Test class main method has four string variables
         * (currentDay,yesterday,tomorrow,futureDay) and
         * one int variable(days). A Scanner class object is then
         * instantiated and the Day class constructor passes the
         * in the Scanner class object's input. The currentDay
         * variable is assigned to call the Day class setDay()
         * method. The yesterday variable is assigned to call the
         * yesterday()method. The tomorrow variable is assigned to
         * call the tomorrow() method. The futureDay variable is
         * assigned to call the futureDay() method and the day
         * variable is assigned to call the getdAhead() method.
         * After all of the variables have been assigned, four
         * print statements print the currentDay, yesterday,
         * tomorrow, days, and futureDay values to the console...
         * */
        //Variables...
        String currentDay,yesterday, tomorrow, futureDay;
        int days;
        //Scanner Object...
        Scanner scan = new Scanner(System.in);
        //Input statements...
        System.out.print("Enter the current day: ");
        //Day class object...
        Day today = new Day(scan.nextLine());
        //Variable assigning...
        currentDay = today.setDay();
        yesterday = today.yesterday();
        tomorrow = today.tomorrow();
        futureDay = today.daysAhead();
        days = today.getdAhead();

        //Output statements...
        System.out.println("You set the current day as: " + currentDay);
        System.out.println("Yesterday was: " + yesterday);
        System.out.println("Tomorrow will be: " + tomorrow);
        System.out.println(days + " days from today will be: " + futureDay);

    }
}
