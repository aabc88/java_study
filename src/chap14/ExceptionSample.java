package chap14;

public class ExceptionSample {
    public static void main(String[] args) {
        ExceptionSample exceptionSample = new ExceptionSample();
        exceptionSample.arrayOutOfBounds();
        exceptionSample.checkVariable();
        exceptionSample.FinallySample();
    }


    public void arrayOutOfBounds()  {
        try {
            int[] intArray = new int[5];
            System.out.println(intArray[5]);
        } catch (Exception e){
            System.err.println("Exception");
        }
    }

    public void checkVariable()  {
        int[] intArray2 = new int[5];

        try {
            System.out.println(intArray2[5]);
        } catch (Exception e)   {
            System.out.println(intArray2.length);
        }
        System.out.println("this code must run.");
    }

    public void FinallySample() {
        int [] intArray3 = new int[5];

        try {
            System.out.println(intArray3[5]);
        } catch (Exception e)   {
            System.out.println(intArray3.length);
        } finally {
            System.out.println("finally");
        }
        System.out.println("finally must run");
    }
}
