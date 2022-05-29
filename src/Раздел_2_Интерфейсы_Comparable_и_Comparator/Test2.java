package Раздел_2_Интерфейсы_Comparable_и_Comparator;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Заур", "Тройников", 12345);
        Employee emp2 = new Employee(15, "Иван", "Петров", 6542);
        Employee emp3 = new Employee(123, "Иван", "Сидоров", 8542);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting \n" + list);
        Collections.sort(list);
        System.out.println("After sorting \n" + list);
        // Используем Comparator
        list.sort(new SalaryComparator());
        list.sort(new NameComparator());
        list.sort(new IdComparator());
    }
}

class Employee
        implements Comparable<Employee> {
    Integer id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        if (Objects.equals(this.id, anotherEmp.id)) {
            return 0;
        } else if (this.id < anotherEmp.id) {
            return -1;
        } else {
            return 1;
        }
    }
}

class IdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.id.compareTo(emp2.id);
    }
}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary - emp2.salary;
    }
}