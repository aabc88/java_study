package chap06;

public class ControlElseIf {
    public static void main(String[] args) {
        ControlElseIf controlElseIf = new ControlElseIf();

        controlElseIf.elseIf(75);
    }

    public void elseIf(int point)   {
        if (point > 90) {
            System.out.println("A");
        } else if (point > 80) {
            System.out.println("B");
        } else if (point > 70) {
            System.out.println("C");
        }
    }
}
