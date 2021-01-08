package chap13;

import chap08.MemberDTO;

public interface MemberManager {
    public boolean addMember(MemberDTO member);
    public boolean removerMember(String name, String phone);
    public boolean updataMember(MemberDTO member);
}
