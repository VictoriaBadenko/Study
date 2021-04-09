package Task5;
import java.util.Objects;
public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    enum breed {
        poodle, husky, terrier
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static void main(String[] args) {
        Dog doggie1 = new Dog("Rick", "poodle", 3);
        Dog doggie2 = new Dog("Max", "husky", 5);
        Dog doggie3 = new Dog("Puppy", "terrier", 1);
        System.out.println("Comparison: " + doggie2.equals(doggie3));
        if (doggie1.age >= doggie2.age && doggie1.age >= doggie3.age){
            System.out.println("Name: " + doggie1.name + " " + "Breed: " + doggie1.breed);
        } else if (doggie2.age >= doggie1.age && doggie2.age >= doggie3.age) {
            System.out.println("Name: " + doggie2.name + " " + "Breed: " + doggie2.breed);
        } else if (doggie3.age >= doggie1.age && doggie3.age >= doggie2.age) {
            System.out.println("Name: " + doggie1.name + " " + "Breed: " + doggie1.breed);
    }   }
}
