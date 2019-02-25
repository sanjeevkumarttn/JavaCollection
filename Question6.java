// Print the elements of an array in the decreasing frequency if 2 numbers have same
// frequency then print the one which came first.

import java.util.*;

public class Question6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array:- ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        Set<Integer> hset = new LinkedHashSet<>();
        System.out.print("Enter elements in array:- ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            hset.add(arr[i]);
        }

        List<ArrayList<Integer>> freq = new ArrayList<>();
        for(int i: hset){
            int count = 0;
            for(int j=0; j<n; j++){
                if (i == arr[j]){
                    ++count;
                }
            }
            freq.add(new ArrayList<>(Arrays.asList(i, count)));
        }

        freq.sort(new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return o2.get(1)-o1.get(1);
            }
        });
        System.out.println("Elements in order of decreasing frequency:- ");
        for(ArrayList<Integer> list: freq){
            System.out.println(list.get(0) + ": " + list.get(1));
        }
    }
}
