package chap08;

public class StaticBlock {
    static int data = 1;
    public StaticBlock()    {
        System.out.println("staticBlock constructor.");
    }

    static  {
        System.out.println("*** First static block");
        data = 3;
    }
    static  {
        System.out.println("*** second static block.");
        data = 5;
    }
    public static int getData() {
        return data;
    }
}
