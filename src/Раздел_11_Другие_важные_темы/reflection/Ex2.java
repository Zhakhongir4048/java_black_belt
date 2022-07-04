package Раздел_11_Другие_важные_темы.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex2 {

    public static void main(String[] args)
            throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            NoSuchMethodException,
            InvocationTargetException {
        Class<?> employeeClass = Class.forName("Раздел_11_Другие_важные_темы.reflection.Employee");
        Employee employee = (Employee) employeeClass.newInstance();
        System.out.println(employee);
        System.out.println("----------------------------");
        Constructor<?> constructor1 = employeeClass.getConstructor();
        Object o1 = constructor1.newInstance();
        Constructor<?> constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        Object o2 = constructor2.newInstance(5, "Zaur", "IT");
        System.out.println(o1);
        System.out.println(o2);
        Method setSalary = employeeClass.getMethod("setSalary", double.class);
        setSalary.invoke(o2, 1000);
        System.out.println("o2 = " + o2);
    }

}