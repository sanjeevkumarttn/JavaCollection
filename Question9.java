// Write a program to display times in different country format.

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Question9 {

    public static void main(String[] args) {

        Date date1 = new Date();
        System.out.println("\nDate: "+ date1.toString());
        Locale locFrench = new Locale("fr","FR");
        DateFormat dateFormat1 = DateFormat.getDateInstance (DateFormat.FULL, locFrench);
        System.out.println("\nDate in French: "+dateFormat1.format(date1));
        Locale locItalian = new Locale("it", "ch");
        DateFormat dateFormat2 = DateFormat.getDateInstance (DateFormat.FULL, locItalian);
        System.out.println("\nDate in Italian: "+dateFormat2.format(date1));

    }
}
