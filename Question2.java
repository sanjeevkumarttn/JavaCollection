// Write a method that takes a string and returns the number of unique characters in the string.

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question2 {

    public static void main(String[] args) {


        System.out.print("Total unique characters in the string are " + countUniqueChar().size());
    }


    public static Set<Character> countUniqueChar(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string: ");
        String str = sc.nextLine();

        Set<Character> set = new HashSet<>();
        for (Character i : str.toCharArray()) {
            set.add(i);
        }
        return set;
    }
}
