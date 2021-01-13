package chap15;

import java.nio.charset.StandardCharsets;

public class StringSample {
    public static void main(String[] args) {
        StringSample stringSample = new StringSample();
        stringSample.convert();
        stringSample.covertUTF16();
    }

    public void convert()   {
        try {
            String korean = "한글";

            byte[] array1 = korean.getBytes();
            for(byte data:array1)   {
                System.out.println(data + " ");
            }
            System.out.println();
            String korean2 = new String((array1));
            System.out.println(korean2);
        }   catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printByteArray(byte[] array)    {
        for(byte data:array)    {
            System.out.println(data + " ");
        }
        System.out.println();
    }

    public void covertUTF16()   {
        try{
            String korean = "한글";

            byte[] array1 = korean.getBytes(StandardCharsets.UTF_16);
            printByteArray(array1);
            String korean2 = new String(array1, "UTF-16");
            System.out.println(korean2);
        }   catch (Exception e) {
            e.printStackTrace();
        }
    }
}
