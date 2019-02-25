// Write a method that takes a string and print the number of occurrence of each character characters in the string.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        HashMap charCountMap = countCharFreq();
        System.out.println("Frequency of each character in the string is:- ");
        for (Object chars : charCountMap.keySet()) {
            System.out.println(chars + ": " + charCountMap.get(chars));
        }

    }

    public static HashMap countCharFreq(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        char str[] = sc.nextLine().toLowerCase().toCharArray();
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        for (char c : str) {
            if (charCountMap.containsKey(c)) {

                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {

                charCountMap.put(c, 1);
            }
        }
        return charCountMap;
    }
}
