package chap06;

public class ControlIfAndOr {
    public static void main(String[] args) {
        ControlIfAndOr controlIfAndOr = new ControlIfAndOr();
        controlIfAndOr.ifAndOr();
        controlIfAndOr.tripleOrAnd();
    }

    public void ifAndOr()   {
        int age = 26;
        boolean isMarried = true;

        if (age > 25 && isMarried) {
            System.out.println("age is over 25 and Married");
            return ;
        }
        if (age > 25 || isMarried) {
            System.out.println("age is over 25 or Married");
            return ;
        }
    }

    public void tripleOrAnd()   {
        int age = 25;
        boolean isMarried = true;
        double height = 180;

        if (age > 25 || isMarried && height >= 180) {
            System.out.println("age is over 25 or Married and height is over 180");
        }
    }
}
