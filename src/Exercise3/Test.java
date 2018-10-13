package Exercise3;

import java.util.Scanner;

public class Test {
    public static void main(String[]args){
        //Variables...
        String dInput;
        //Scanner Object...
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter what day it is today: ");
        dInput = scan.nextLine();
        //Day class object...
        Day today = new Day(dInput);
        today.setDay();
        today.yesterday();
        today.tomorrow();
        System.out.print("How many days would you like to move ahead: ");
        today.daysAhead(scan.nextInt());


    }
}
