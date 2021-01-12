package abstract_prac;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound();
        cat.sound();

        Animal_ab animal_ab = null;

        animal_ab = new Dog();
        animal_ab.sound();

        animal_ab = new Cat();
        animal_ab.sound();

    }
}
