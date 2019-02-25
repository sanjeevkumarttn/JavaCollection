// Write a program to format date as example "21-March-2016"

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Question8 {

    public static void main(String[] args) {

        SimpleDateFormat date = new SimpleDateFormat("yyyy-MMMM-dd");
        Calendar calendar = new GregorianCalendar(2016,Calendar.MARCH,21);
        System.out.println("Date is: "+date.format(calendar.getTime()));

    }
}
