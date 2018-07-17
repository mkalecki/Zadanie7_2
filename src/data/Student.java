package data;

import data.Person;

public class Student extends Person {

//    String firstName;
//    String lastName;
//    int age;
    private String section;

    public Student (String firstName, String lastName, int age, String section){
        super (firstName, lastName, age);
        super.setStatus("Uczeń");
        this.section = section;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.print("Klasa: " + section);
    }


}
