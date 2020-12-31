package chap06;

public class ControlWhile {
    public static void main(String[] args) {
        ControlWhile controlWhile = new ControlWhile();

        controlWhile.whileLoop1();
    }

    public void whileLoop1()    {
        int loop = 0;
        while (++loop <=12) {
            System.out.println(loop+"월");
            if (loop == 6) break;
        }
    }
}
