package Раздел_2_Интерфейсы_Comparable_и_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<Employee2> list = new ArrayList<>();
        Employee2 emp1 = new Employee2(100, "Заур", "Тройников", 12345);
        Employee2 emp2 = new Employee2(15, "Иван", "Петров", 6542);
        Employee2 emp3 = new Employee2(123, "Иван", "Сидоров", 8542);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting \n" + list);
        Collections.sort(list);
        System.out.println("After sorting \n" + list);
    }

}

class Employee2
        implements Comparable<Employee2> {
    Integer id;
    String name;
    String surname;
    int salary;

    public Employee2(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee2 anotherEmp) {
        return this.id - anotherEmp.id;           // Самый лучший пример, все так пишут
    }

}