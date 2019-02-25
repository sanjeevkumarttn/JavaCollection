// Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator,
// find the sum of the numbers in List.

import java.util.ArrayList;
import java.util.Iterator;

public class Question1 {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Float> list = new ArrayList<>();
        list.add(32.4f);
        list.add(12.98f);
        list.add(63.90f);
        list.add(13.77f);
        list.add(39.5f);

        Iterator<Float> iterate = list.iterator();
        float sum = 0;
        System.out.println("List values are: ");
        while(iterate.hasNext()){
            float val = iterate.next();
            System.out.print(val+" ");
            sum += val;
        }
        System.out.println("\nSum is: "+sum);
    }

}
