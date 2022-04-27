package Java8;

import java.time.LocalDate;
import java.util.Scanner;

public class DayCode {
    public static void main(String[] args) 
    {
        System.out.println("Enter a Number: ");
        Scanner an = new Scanner(System.in);
        String day = an.next();
        LocalDate date = LocalDate.of(1,1,Integer.parseInt(day));
        System.out.println(date);
        System.out.println(date.getDayOfWeek());
        System.out.println("Enter number of days you want to add: ");
        date = date.plusDays(an.nextLong());
        System.out.println(date.getDayOfWeek());
    }

}
