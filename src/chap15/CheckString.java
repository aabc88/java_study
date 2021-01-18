package chap15;

public class CheckString {
    public static void main(String[] args) {
        CheckString checkString = new CheckString();
       /*
        checkString.checkSubString();
        checkString.checkSplit();
        checkString.checkTrim();
        checkString.checkReplace();*/

        checkString.checkFormat();
        checkString.checkStringBuilder();
    }
/*
    public void checkSubString()    {
        String text = "Java technology";
        String technology = text.substring(5);
        System.out.println(technology);
        String tech = text.substring(5,9);
        System.out.println(tech);
    }

    public void checkSplit()    {
        String text = "Java technology is both a programming language and a platform.";
        String[] splitArray=text.split(" ");
        for(String temp : splitArray)   {
            System.out.println(temp);
        }
    }
    public void checkTrim()     {
        String strings[] = new String[]{
                " a", " b ","   c","d   ","e   f","  "};
        for(String string:strings){
            System.out.println("["+string+"]");
            System.out.println("["+string.trim()+"]");
        }
    }

    public void checkReplace()  {
        String text = "The String class represents character strings.";
        System.out.println(text.replace('s','z'));
        System.out.println(text);
        System.out.println(text.replace("tring","trike"));
        System.out.println(text.replaceAll(" ","|"));
        System.out.println(text.replaceFirst(" ","|"));
    } */

    public void checkFormat()   {
        String text = "제 이름은 %s입니다. 지금까지 %d권의 책을 썼고"
                +"하루에 %f %%의 시간을 책을 쓰는데 할애하고 있습니다.";
        String realText = String.format(text, "이상민", 7, 10.5);
        System.out.println(realText);
    }

    public void checkStringBuilder()    {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" world");
        System.out.println(sb);
    }
}
