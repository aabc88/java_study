package abstract_prac;

public class Cat extends Animal_ab {
    public Cat()    {
        this.kind = "포유류";
    }

    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
