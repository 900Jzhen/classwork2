package CloneableDemo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CloneableDemo {
    public static void main(String []args) {
        Calendar calendar = new GregorianCalendar(2023, 3, 18);
        Calendar calendar2 = calendar;
        Calendar calendar3 = (Calendar) calendar.clone();

        System.out.println(calendar == calendar2);
        System.out.println(calendar == calendar3);
        System.out.println(calendar.equals(calendar3));

        ArrayList<Double> List1 = new ArrayList<Double>();

        List1.add(1.5);
        List1.add(5.6);
        List1.add(4.5);

        ArrayList<Double> List2 = new ArrayList<Double>();

        double[] alist = {1,5,5,6};
        double[] alost2 = alist.clone();


    }
}
