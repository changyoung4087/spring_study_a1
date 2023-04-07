package models.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoinService {
    private MemberDAO memberDao;

    @Autowired
    public void setMemberDao(MemberDAO memberDao){
        this.memberDao = memberDao;
    }
    public void  join(Member member){
        memberDao.insert(member);
    }
}
