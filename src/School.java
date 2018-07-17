public class School {

    public static void main(String[] args) {

        Person person1 = new Person ("Michał", "Kalecki", 44);
        person1.printInfo();

        Student student1 = new Student ("Maciej", "Kowalczyk", 15, "mat-fiz");
        student1.printInfo();

        Teacher teacher = new Teacher("Tomasz", "Majewski", 55, "mgr");
        teacher.printInfo();
    }
}
