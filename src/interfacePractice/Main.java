package interfacePractice;

public class Main {
    public static void main(String[] args) {
        interfaceA ia = new interfaceClass();
        interfaceB ib = new interfaceClass();
        interfaceC ic = new interfaceClass();
        interfaceD id = new interfaceClass();
        ia.funA();
        ib.funB();
        ic.funC();
        id.funD();
    }
}
