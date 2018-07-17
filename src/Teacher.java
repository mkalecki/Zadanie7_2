public class Teacher extends Person {
    //    String firstName;
//    String lastName;
//    int age;
    private String degree;

    Teacher (String fn, String ln, int a, String degree){
        super (fn, ln, a);
        super.setStatus("Nauczyciel");
        this.degree = degree;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.print("tytuł: " + degree);
    }
}
