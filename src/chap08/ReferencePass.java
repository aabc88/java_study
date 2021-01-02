package chap08;

public class ReferencePass {
    public static void main(String[] args) {
        ReferencePass referencePass = new ReferencePass();
        referencePass.callPassByValue();
        referencePass.callPassByReference();
    }
    public void callPassByValue()   {
        int a = 10;
        String b = "b";
        System.out.println("before passByValue");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        passByValue(a, b);
        System.out.println("after passByValue");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public void passByValue(int a, String b)    {
        a = 20;
        b = "z";
        System.out.println("in passByValue");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public void callPassByReference()   {
        MemberDTO memberDTO = new MemberDTO("sangmin");
        System.out.println("before passByReference");
        System.out.println("member.name = "+ memberDTO.name);
        passByReference(memberDTO);
        System.out.println("after passByReference");
        System.out.println("member.name = "+ memberDTO.name);
    }
    public void passByReference(MemberDTO memberDTO)   {
        memberDTO.name = "sangho";
        System.out.println("in passByReference");
        System.out.println("member.name = "+ memberDTO.name);
    }
}
