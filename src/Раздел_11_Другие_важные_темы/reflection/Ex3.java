package Раздел_11_Другие_важные_темы.reflection;

import java.lang.reflect.Field;

public class Ex3 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(10, "Заур", "IT");
        Class<? extends Employee> aClass = employee.getClass();
        Field salary = aClass.getDeclaredField("salary");
        salary.setAccessible(true);
        double salaryValue = (double) salary.get(employee);
        System.out.println(salaryValue);
        salary.set(employee, 1500);
        System.out.println(salaryValue);
        System.out.println("employee = " + employee);
    }

}