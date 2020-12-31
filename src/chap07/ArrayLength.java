package chap07;

public class ArrayLength {
    public static void main(String[] args) {
        ArrayLength arrayLength = new ArrayLength();

        arrayLength.printArrayLength();
        arrayLength.printArray();
        arrayLength.twoDimFor();
    }
    public void printArrayLength()  {
        int[] oneDim = new int[3];
        int[][] twoDim = new int [4][2];
        System.out.println(oneDim.length);
        System.out.println(twoDim[0].length);
        System.out.println(twoDim[1].length);
    }

    public void printArray()    {
        int [][] twoDim2 = {{1,2,3},{4,5,6}};
        System.out.println("twoDim2 length = "+twoDim2.length);
        System.out.println("twoDim2[0] length = "+twoDim2[0].length);

        for(int onelood = 0; onelood < 2; onelood++)    {
            for(int twoloop = 0; twoloop < 3; twoloop++)    {
                System.out.print(twoDim2[onelood][twoloop]);
                if (!(onelood == 1 && twoloop == 2))
                    System.out.print(", ");
            }
            System.out.print("\n");
        }
    }

    public void twoDimFor() {
        int [][] twoDim3 = {{1,2,3},{4,5,6}};
        for(int[] dimArray : twoDim3)   {
            for (int data : dimArray)   {
                System.out.print(data+", ");
            }
        }
    }
}
