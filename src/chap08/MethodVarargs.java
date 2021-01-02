package chap08;

public class MethodVarargs {
    public static void main(String[] args) {
        MethodVarargs methodVarargs = new MethodVarargs();
        methodVarargs.calculateNumbersWithArray(new int[]{1, 2, 3, 4, 5});
        methodVarargs.calculateNumber(1,2,3,4,5);
    }
    public void calculateNumbersWithArray(int []numbers)    {

    }
    public void calculateNumber(int...numbers)  {
        int total = 0;
        for (int number:numbers)    {
            total += number;
        }
        System.out.println("total = "+total);
    }
}
