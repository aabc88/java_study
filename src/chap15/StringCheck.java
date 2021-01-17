package chap15;

public class StringCheck {
    public static void main(String[] args) {
        StringCheck sample = new StringCheck();

        String addresses[] = new String[]   {
                "서울시 구로구 신도림동",
                "경기도 성남시 정자동 공장",
                "인천시 남동구 논현동",
        };
        sample.checkAddress(addresses);
        sample.checkMatch();
        sample.checkIndexOf();
        sample.checkLastIndexOf();
    }

    public void checkAddress(String[] addresses)    {
        int startCount= 0;
        int endCount = 0;
        String startText = "서울시";
        String endText = "동";

        for(String address:addresses){
            if (address.startsWith(startText)){
                startCount++;
            }
            if (address.endsWith(endText)){
                endCount++;
            }
        }
        System.out.println("starts with " + startText +" count is "+startCount);
        System.out.println("ends with " + endText + " count is " +endCount);
    }
    public void checkMatch()    {
        String text = "This is a text";
        String compare1 = "is" ;
        String compare2 = "this";
        System.out.println(text.regionMatches(2,compare1,0,1));
        System.out.println(text.regionMatches(5,compare1,0,2));
        System.out.println(text.regionMatches(true, 0,compare2,0,4));
    }

    public void checkIndexOf()   {
        String text = "Java technology is both a programming language and a platform.";
        System.out.println(text.indexOf('a'));
        System.out.println(text.indexOf("a "));
        System.out.println(text.indexOf('a', 20));
        System.out.println(text.indexOf("a ",  20));
        System.out.println(text.indexOf('z'));
    }

    public void checkLastIndexOf()  {
        String text = "Java technology is both a programming language and a platform." ;
        System.out.println(text.lastIndexOf('a'));
        System.out.println(text.lastIndexOf("a "));
        System.out.println(text.lastIndexOf('a',20));
        System.out.println(text.lastIndexOf("a ", 20));
        System.out.println(text.lastIndexOf('z'));
    }
}
