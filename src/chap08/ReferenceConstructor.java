package chap08;

public class ReferenceConstructor {
    public static void main(String[] args) {
        ReferenceConstructor referenceConstructor = new ReferenceConstructor();

    }
    public void makeMemberObject()  {
        MemberDTO dto1 = new MemberDTO();
        MemberDTO dto2 = new MemberDTO("sangmin");
        MemberDTO dto3 = new MemberDTO("sangmin", "01012345678");
        MemberDTO dto4 = new MemberDTO("sangmin", "01012345678", "a@a.a");
    }
}