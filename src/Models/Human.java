package Models;

public class Human {
    public int id;
    public String firstName;
    public String lastName;
    public String middleName;
    public int age;

    public Human(int id, String firstName, String middleName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
    }
}
