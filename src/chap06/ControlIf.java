package chap06;

public class ControlIf {
    public static void main(String[] args) {
        ControlIf controlIf = new ControlIf();
        controlIf.ifStatement();
        controlIf.ifElseStatment();
    }

    public void ifStatement()   {
        if(true);
        if(true) System.out.println("it's true");
        if(true)
            System.out.println("it's also true");
        if(false) System.out.println("it's false");
    }

    public void ifElseStatment()    {
        int intValue = 10;

        if (intValue > 5) System.out.println("it's bigger than 5.");
        else System.out.println("it's smaller or equal than 5");

        if (intValue <= 5) System.out.println("it's smaller or equal than 5.");
        else System.out.println("it's bigger than 5.");
    }

}
