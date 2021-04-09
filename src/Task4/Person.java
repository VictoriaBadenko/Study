package Task4;

public class Person {
    private String name;
    private int birthYear;
    public static int age = 0;

    public Person() {
    }

    public Person(String name) {
        this.name = name;

    }
    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;

    }
    public void print() {
        System.out.println("Name: " + name + "; BirthYear: " + birthYear);
        int year1 = 2021 ;
        int year2 = birthYear;
        int age = year1 - year2;
        System.out.println("Age = " + age);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;

    }
}

