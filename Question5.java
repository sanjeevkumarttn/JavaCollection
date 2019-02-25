// Write a program to sort the Student objects based on Score , if the score are same then sort on First Name .
// Class Student{ String Name; Double Score; Double Age

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Question5 {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(183, 30, "Rohit", "Sharma"));
        students.add(new Student(220, 40, "Virender", "Sehwag"));
        students.add(new Student(300, 45, "Sachin", "Tendulkar"));
        students.add(new Student(300, 50, "Sunil", "Gavaskar"));

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o2.score-o1.score)  == 0 ? o1.first_name.toLowerCase().compareTo(o2.first_name.toLowerCase()) : (int)(o2.score-o1.score);
            }
        });

        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

}

class Student {

    double score, age;
    String first_name, last_name;

    public Student(double score, double age, String first_name, String last_name) {
        this.score = score;
        this.age = age;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    @Override
    public String toString() {
        return "[score=" + score + ", age=" + age + ", first_name=" + first_name + ", last_name=" + last_name + "]" ;
    }
}