package main.java.Generics.Game;

public class Test {
    public static void main(String[] args) {
        Schoolboy schoolboy1 = new Schoolboy("Mike",15);
        Schoolboy schoolboy2= new Schoolboy("Alex",14);
        Schoolboy schoolboy3= new Schoolboy("Alla",10);
        Schoolboy schoolboy4= new Schoolboy("Yura",11);
        Student student1 = new Student("Vova", 18);
        Student student2 = new Student("Gena", 20);
        Employee employee1 = new Employee("Kostantin",36);
        Employee employee2 = new Employee("Valentin",30);

        Team <Schoolboy> schoolTeam1 = new Team<>("Dragons");
        Team <Schoolboy> schoolTeam2 = new Team<>("Dungeon");
        schoolTeam1.addNewParticipant(schoolboy1);
        schoolTeam1.addNewParticipant(schoolboy2);

        Team<Student> studentTeam = new Team<>("Advanced");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("Profi");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        schoolTeam2.addNewParticipant(schoolboy3);
        schoolTeam2.addNewParticipant(schoolboy4);

        schoolTeam1.playWith(schoolTeam2);

    }
}
