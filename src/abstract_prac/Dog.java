package abstract_prac;

public class Dog extends Animal_ab {
    public Dog()    {
        this.kind = "포유류" ;
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
