package chap05;

public class Operators {
    public static void main(String[] args) {
        Operators operatorsPM = new Operators();

        operatorsPM.additive();
        operatorsPM.divideInt2();
        operatorsPM.remainder();
        operatorsPM.compound();
        operatorsPM.unary();
        operatorsPM.condition();
        operatorsPM.doBlindDate('a');
    }

    public void additive()  {
        int intValue=5;
        int intValue2=10;
        int result = intValue+intValue2;

        System.out.println(result);
        result = intValue2-intValue;
        System.out.println(result);
    }

    public void divideInt2()    {
        double doubleValue1=5;
        double doubleValue2=10;
        double restule=doubleValue1/doubleValue2;
        System.out.println(restule);
    }

    public void remainder() {
        int intValue1=53;
        int intValue2=10;
        int result=intValue1%intValue2;
        System.out.println(result);
    }

    public void compound()  {
        int intValue=10;

        intValue+=5;
        System.out.println(intValue);
        intValue-=5;
        System.out.println(intValue);
        intValue*=5;
        System.out.println(intValue);
        intValue/=5;
        System.out.println(intValue);
        intValue%=5;
        System.out.println(intValue);
    }

    public void unary() {
        int intValue=-10;
        int result = +intValue;
        System.out.println(result);
        result= -intValue;
        System.out.println(result);
    }

    public void condition() {
        boolean x=true;
        boolean y=true;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println("-----");

        x =false;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println("-----");

        y = false;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println("-----");
    }

    public boolean doBlindDate(int point)   {
        boolean doBlindDateFlag = false;
        doBlindDateFlag = (point >= 80) ? true : false;
        System.out.println(point + " : " + doBlindDateFlag);
        return doBlindDateFlag;
    }


}
