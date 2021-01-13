package chap14;

public class ThrowSample {
    public static void main(String[] args) {
        ThrowSample throwSample = new ThrowSample();
        throwSample.throwException(11);
    }

    public void throwException(int number)  {
        try {
            if (number > 12)    {
                throw new Exception("Number is over than 12");
            }
            System.out.println("number is "+number);
        } catch (Exception e)   {
            e.printStackTrace();
        }
    }
}