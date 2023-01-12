package Exercice.DefiningClass;

public class Cat {
    private String name;
    private String lastName;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 0) {
            throw new IllegalArgumentException("Age must be positive number");
        }
        this.age = age;
    }

}
