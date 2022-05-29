package Раздел_2_Интерфейсы_Comparable_и_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        List<Employee4> list = new ArrayList<>();
        Employee4 emp1 = new Employee4(100, "Заур", "Тройников", 12345);
        Employee4 emp2 = new Employee4(15, "Иван", "Петров", 6542);
        Employee4 emp3 = new Employee4(123, "Иван", "Сидоров", 8542);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting \n" + list);
        Collections.sort(list);
        System.out.println("After sorting \n" + list);
    }
}

class Employee4
        implements Comparable<Employee4> {
    Integer id;
    String name;
    String surname;
    int salary;

    public Employee4(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee4{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee4 anotherEmp) {
        int res = this.name.compareTo(anotherEmp.name);
        if (res == 0) {
            res = this.surname.compareTo(anotherEmp.surname);
        }
        return res;
    }

}