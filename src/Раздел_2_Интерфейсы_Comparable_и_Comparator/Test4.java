package Раздел_2_Интерфейсы_Comparable_и_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        List<Employee3> list = new ArrayList<>();
        Employee3 emp1 = new Employee3(100, "Заур", "Тройников", 12345);
        Employee3 emp2 = new Employee3(15, "Иван", "Петров", 6542);
        Employee3 emp3 = new Employee3(123, "Иван", "Сидоров", 8542);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting \n" + list);
        Collections.sort(list);
        System.out.println("After sorting \n" + list);
    }

}

class Employee3
        implements Comparable<Employee3> {
    Integer id;
    String name;
    String surname;
    int salary;

    public Employee3(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee3 anotherEmp) {
        return this.id.compareTo(anotherEmp.id);
    }

}