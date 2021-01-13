package chap15;

public class StringNull {
    public static void main(String[] args) {
        StringNull stringNull = new StringNull();
       // stringNull.nullCheck(null);
        stringNull.nulCheck2("asd");
    }
/*
    public boolean nullCheck(String text)   {
        int textLength = text.length();
        System.out.println(textLength);
        if (text == null) return true;
        else return false;
    }
*/
    public boolean nulCheck2(String text)  {
        if(text == null)    {
            System.out.println("is ture");
            return true;
        } else {
            int textLength = text.length();
            System.out.println(textLength);
            return false;
        }
    }
}
