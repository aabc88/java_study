package interfacePractice;

public class interfaceClass implements interfaceA, interfaceB, interfaceC, interfaceD{
    @Override
    public void funA() {
        System.out.println("Interface A");
    }

    @Override
    public void funB() {
        System.out.println("Interface B");
    }

    @Override
    public void funC() {
        System.out.println("Interface C");
    }

    @Override
    public void funD() {
        System.out.println("Interface D");
    }
}
