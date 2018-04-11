package com.Sainz;

/*      Decide what your format is supposed to be, and let the user know this is in your prompt.

        Show the following:
        THESE ARE THE INSTRUCTIONS

        Your date: [Date entered by the user]
        The day of the week on which this day falls: [Day of the week]
        The month of the year in which this day falls: [Month - full name]
        The date is a [future or past] date.

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

        System.out.println("Now enter a date in the format dd/MM/YYYY");
        String aDate = keyboard.nextLine();
        userDate = LocalDate.parse(aDate, dTF);
        System.out.println(userDate.format(longFormat));

        /*


        java.util.Date  = df.parse(userDate.format(longFormat));
        df.applyPattern("EEE");
        System.out.println("Day of Week: " + df.format(userDate.format(longFormat)));

        /*

        SimpleDateFormat df = new SimpleDateFormat( "dd/MM/yy" );
//parse in the date
java.util.Date date = df.parse( "06/08/2002");
//change the pattern to output the day of week
df.applyPattern( "EEE" );
//print the formatted date out
System.out.println( "Day of Week = " + df.format( date ) );
         */


    }
}
