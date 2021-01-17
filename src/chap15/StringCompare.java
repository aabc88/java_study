package chap15;

public class StringCompare {
    public static void main(String[] args) {
        StringCompare stringCompare = new StringCompare();
        stringCompare.CheckString();
        stringCompare.CheckCompare();
        stringCompare.checkCompareTo();
    }
    public void CheckString()   {
        String text = "you must know String class";
        System.out.println("text.length() = "+text.length());
        System.out.println("text.isEmpty() = "+text.isEmpty());
    }

    public void CheckCompare()  {
        String text1 = "Check Value";
        String text2 =new String("Check Value");
        if (text1 == text2) {
            System.out.println("text1 == text2 same");
        } else  {
            System.out.println("text1 != text2 different");
        }
        if (text1.equals("Check Value"))    {
            System.out.println("text.equals(text2) is same");
        }
        String text3 = "check value";
        if(text1.equalsIgnoreCase(text3))   {
            System.out.println("text1.equalsIgnoreCase(text) result is same ");
        }
    }

    public void checkCompareTo()    {
        String text1 = "a";
        String text2 = "b";
        String text3 = "c";
        System.out.println(text2.compareTo(text1));
        System.out.println(text2.compareTo(text3));
        System.out.println(text1.compareTo(text3));
    }
}
