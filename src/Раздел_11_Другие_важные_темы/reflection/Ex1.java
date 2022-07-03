package Раздел_11_Другие_важные_темы.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        // 1 вариант создания
        Class<?> employeeClass = Class.forName("Раздел_11_Другие_важные_темы.reflection.Employee");
        Field id = employeeClass.getField("id");
        System.out.println("Тип поля " + id.getType());
        Field[] fields = employeeClass.getFields();
        for (Field field : fields) {
            System.out.println("Имя поля " + field.getName() + ". Тип поля " + field.getType());
        }
        System.out.println("------------------------");
        // private поля тоже увижу
        Field[] allField = employeeClass.getDeclaredFields();
        for (Field declaredField : allField) {
            System.out.println("Имя поля " + declaredField.getName() + ". Тип поля " + declaredField.getType());
        }
        System.out.println("------------------------");
        Method increaseSalary = employeeClass.getMethod("increaseSalary");
        System.out.println("Возвращаемое значение " + increaseSalary.getReturnType() +
                ", параметры метода " + Arrays.toString(increaseSalary.getParameterTypes()));
        System.out.println("------------------------");
        Method setSalary = employeeClass.getMethod("setSalary", double.class);
        System.out.println("Возвращаемое значение " + setSalary.getReturnType() +
                ", параметры метода " + Arrays.toString(setSalary.getParameterTypes()));
        System.out.println("------------------------");
        Method[] methods = employeeClass.getMethods();
        for (Method method : methods) {
            System.out.println("Имя метода " + method.getName() + ", возвращаемое значение " +
                    method.getReturnType() + ", параметры метода " + Arrays.toString(method.getParameterTypes()));
        }
        System.out.println("------------------------");
        // Все методы получаем, даже private
        Method[] declaredMethods = employeeClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            // Проверяем что метод public
            if (Modifier.isPublic(method.getModifiers())) {
                System.out.println("Имя метода " + method.getName() + ", возвращаемое значение " +
                        method.getReturnType() + ", параметры метода " + Arrays.toString(method.getParameterTypes()));
            }
        }
        System.out.println("------------------------");
        Constructor<?> constructor = employeeClass.getConstructor();
        System.out.println("Конструктор имеет параметров " + constructor.getParameterCount()
                + ", типы параметров " + Arrays.toString(constructor.getParameterTypes()));
        System.out.println("------------------------");
        Constructor<?> constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        System.out.println("Конструктор имеет параметров " + constructor2.getParameterCount()
                + ", типы параметров " + Arrays.toString(constructor2.getParameterTypes()));
        System.out.println("------------------------");
        Constructor<?>[] constructors = employeeClass.getConstructors();
        for (Constructor<?> constructorFromConstructors : constructors) {
            System.out.println(constructorFromConstructors);
        }
        // 2 вариант создания
        Class<Employee> employeeClass2 = Employee.class;
        System.out.println("------------------------");
        System.out.println(employeeClass2);
        Employee employee = new Employee();
        // 3 вариант создания
        Class<? extends Employee> employeeClass3 = employee.getClass();
        System.out.println("------------------------");
        System.out.println(employeeClass3);
    }

}