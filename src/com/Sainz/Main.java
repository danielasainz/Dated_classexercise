package com.Sainz;

/*      Decide what your format is supposed to be, and let the user know this is in your prompt.

        Show the following:
        THESE ARE THE INSTRUCTIONS

       [1] Your date: [Date entered by the user]
       [2] The day of the week on which this day falls: [Day of the week]
       [3] The month of the year in which this day falls: [Month - full name]
       [4] The date is a [future or past] date.

        */
import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        LocalDate userDate;

        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter longFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy");

        System.out.println("Enter a date in the format dd/MM/YYYY");
        String aDate = keyboard.nextLine();
        userDate = LocalDate.parse(aDate, dTF);
        System.out.println(userDate.format(longFormat));

        //Information from Oracle
        System.out.println("This day falls in this month of the year: " + userDate.getMonth().name());
        System.out.println("This day falls on this day of the week: " + userDate.getDayOfWeek().name());

    }
}
