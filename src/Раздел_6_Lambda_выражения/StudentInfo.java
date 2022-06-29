package Раздел_6_Lambda_выражения;

import java.util.ArrayList;

public class StudentInfo {

    public static void main(String[] args) {
        Student student1 = new Student("Иван", 'm', 22, 3, 8.3);
        Student student2 = new Student("Николай", 'm', 28, 2, 6.4);
        Student student3 = new Student("Елена", 'f', 19, 1, 8.9);
        Student student4 = new Student("Пётр", 'm', 35, 4, 7);
        Student student5 = new Student("Мария", 'f', 22, 3, 9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.printStudentsOverGrade(students, 8);
        System.out.println("-----------------------------  ");
        studentInfo.printStudentsOverGrade(students, 10);
        System.out.println("-----------------------------  ");
        studentInfo.printStudentsUnderAge(students, 30);
        System.out.println("-------------------------------");
        studentInfo.printStudentsUnderAge(students, 20);
        System.out.println("-------------------------------");
        studentInfo.printStudentsMixCondition(students, 20, 9.5, 'f');
        System.out.println("-------------------------------");
        studentInfo.printStudentsMixCondition(students, 19, 5, 'm');
        System.out.println("-------------------------------");
        studentInfo.testStudents(students, new CheckOverGrade());
        System.out.println("-------------------------------");
        studentInfo.testStudents(students, s -> s.age < 30);
        System.out.println("-------------------------------");
        studentInfo.testStudents(students, s -> s.avgGrade > 8);
        System.out.println("-------------------------------");
        studentInfo.testStudents(students, s -> s.avgGrade < 9.3 && s.age > 20 && s.sex == 'f');
    }

    void testStudents(ArrayList<Student> students, StudentChecks studentChecks) {
        for (Student student : students) {
            if (studentChecks.check(student)) {
                System.out.println(student);
            }
        }
    }

    void printStudentsOverGrade(ArrayList<Student> al, double grade) {
        for (Student student : al) {
            if (student.avgGrade >= grade) {
                System.out.println(student);
            }
        }
    }

    void printStudentsUnderAge(ArrayList<Student> al, int age) {
        for (Student student : al) {
            if (student.age < age) {
                System.out.println(student);
            }
        }
    }

    void printStudentsMixCondition(ArrayList<Student> al, int age, double grade, char sex) {
        for (Student student : al) {
            if (student.age > age && student.avgGrade < grade && student.sex == sex) {
                System.out.println(student);
            }
        }
    }

}

interface StudentChecks {
    boolean check(Student s);
}

class CheckOverGrade implements StudentChecks {

    @Override
    public boolean check(Student s) {
        return s.avgGrade > 8;
    }

}