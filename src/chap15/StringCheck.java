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
}
