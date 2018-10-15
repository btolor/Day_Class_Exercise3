package Exercise3;

import java.util.Scanner;

public class Test {
    public static void main(String[]args){

        /**
         * The Test class main method starts with a
         * string variable dInput and a Scanner object.
         * A print statement prompts the user to input
         * the current day and the dInput string variable
         * is assigned the user's input. The Day class
         * object is instantiated using the Day class
         * constructor passing in the dInput string in
         * its parameter. The today Day object then calls
         * the setDay(), yesterday(), tomorrow(), and
         * daysAhead() methods...*/

        //Variables...
        String dInput;
        //Scanner Object...
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the current day: ");
        dInput = scan.nextLine();
        //Day class object...
        Day today = new Day(dInput);
        today.setDay();
        today.yesterday();
        today.tomorrow();
        today.daysAhead();
    }
}
