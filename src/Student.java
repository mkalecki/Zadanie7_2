public class Student extends Person {

//    String firstName;
//    String lastName;
//    int age;
    private String section;

    Student (String firstName, String lastName, int age, String section){
        super (firstName, lastName, age);
        super.setStatus("Uczeń");
        this.section = section;
    }

    @Override
    void printInfo(){
        super.printInfo();
        System.out.print("Klasa: " + section);
    }


}
