package chap07;

public class ArrayPrint {
    public static void main(String[] args) {
        ArrayPrint arrayPrint = new ArrayPrint();

        arrayPrint.printString();
    }

    public void printString()   {
        System.out.println("string = "+new String[0]);
        //System.out.println("array = "+ new ArrayPrint()[0]);
    }
}
