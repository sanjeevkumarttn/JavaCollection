// Write a program to sort Employee objects based on highest salary using Comparator.
// Employee class{ Double Age; Double Salary; String Name

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Question4 {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(40, 50000.90, "Dhoni"));
        employees.add(new Employee(20, 50000.20, "Sachin"));
        employees.add(new Employee(50, 40000, "Sunil"));
        employees.add(new Employee(30, 70000, "Kapil"));

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int)(o2.salary-o1.salary);
            }
        });

        Iterator<Employee> iterator = employees.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}

class Employee {
    double age, salary;
    String name;

    Employee(double age, double salary, String name){
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[age=" + age + ", salary=" + salary + ", name=" + name + "]" ;
    }
}
