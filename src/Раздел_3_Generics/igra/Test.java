package Раздел_3_Generics.igra;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Mariya", 15);
        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Kseniya", 18);
        Employee employee1 = new Employee("Заур", 32);
        Employee employee2 = new Employee("Михаил", 47);

        // Создаём три команды
        Team<Schoolar> schoolarTeam = new Team<>("Драконы");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);

        Team<Student> studentTeam = new Team<>("Вперёд!");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("Работяги");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        Team<Schoolar> schoolarTeam2 = new Team<>("Мудрецы");
        Schoolar schoolar3 = new Schoolar("Сергей", 12);
        Schoolar schoolar4 = new Schoolar("Оля", 14);
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);
        schoolarTeam.playWith(schoolarTeam2);
        System.out.println(schoolar1.getAge());
    }
}