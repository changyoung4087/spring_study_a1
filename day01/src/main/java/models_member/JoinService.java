package models_member;

public class JoinService {
    private MemberDAO memberDao;

    public JoinService(MemberDAO memberDao){
        this.memberDao = memberDao;
    }
    public void join(Member member){
        memberDao.insert(member);
    }
}
