package data;

import data.Person;

public class Teacher extends Person {
    //    String firstName;
//    String lastName;
//    int age;
    private String degree;

    public Teacher (String fn, String ln, int a, String degree){
        super (fn, ln, a);
        super.setStatus("Nauczyciel");
        this.degree = degree;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print("tytuł: " + degree);
    }
}
