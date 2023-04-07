package models.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListService {
    @Autowired /** 의존성 자동주입 */
    // @Qualifier("mDao2") // AppCtx 에서도 같이 명시
    private MemberDAO memberDao;
    public ListService(MemberDAO memberDao){
        this.memberDao = memberDao;
    }
    public void print(){
        List<Member> members = memberDao.gets();
        members.stream().forEach(System.out::println);
    }
    public ListService() {}
}
