package Раздел_11_Другие_важные_темы.reflection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {

    void sum(int a, int b) {
        int result = a + b;
        System.out.println("Сумма " + a + " и " + b + " = " + result);
    }

    void subtraction(int a, int b) {
        int result = a - b;
        System.out.println("Разница " + a + " и " + b + " = " + result);
    }

    void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("Произведение " + a + " и " + b + " = " + result);
    }

    void division(int a, int b) {
        int result = a / b;
        System.out.println("Частное " + a + " и " + b + " = " + result);
    }

}

class TestCalculator {

    public static void main(String[] args) throws IOException, InvocationTargetException, IllegalAccessException {
        Calculator myCalculator = new Calculator();
        myCalculator.sum(10, 5);
        myCalculator.sum(15, 10);
        myCalculator.subtraction(15, 5);
        myCalculator.subtraction(10, 10);
        myCalculator.multiplication(15, 5);
        myCalculator.multiplication(10, 10);
        myCalculator.division(10, 5);
        myCalculator.division(15, 10);
        try (BufferedReader reader = new BufferedReader(new FileReader("test2.txt"))) {
            String methodName = reader.readLine();
            String firstArgument = reader.readLine();
            String secondArgument = reader.readLine();
            Calculator calculator = new Calculator();
            Class<? extends Calculator> aClass = calculator.getClass();
            Method method = null;

            Method[] methods = aClass.getDeclaredMethods();
            for (Method methodsFind : methods) {
                if (methodsFind.getName().equals(methodName)) {
                    method = methodsFind;
                }
            }
            assert method != null;
            method.invoke(calculator, Integer.parseInt(firstArgument), Integer.parseInt(secondArgument));
        }
    }

}