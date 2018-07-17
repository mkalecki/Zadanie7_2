public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String status = "status nieznany";


    Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    void printInfo(){
        System.out.printf("\n %s: %s, %s, Wiek: %d ", status, firstName, lastName, age);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

