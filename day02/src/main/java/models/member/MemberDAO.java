package models.member;

import config.ManualBean;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@ManualBean
public class MemberDAO {
    private static Map<String, Member> members = new HashMap<>();

    public void insert(Member member){
        member.setRegDt(LocalDateTime.now()); // 현재날짜 regDt에 넣기.
        members.put(member.getUserId(), member); // Map에 member Data 넣기.
    }
    public Member get(String userId){
        return members.get(userId);
    }
    public List<Member> gets(){
        /** Map에 있는 데이터를 List형태로 바꿔서 추력 */
        List<Member> list = new ArrayList<>(members.values());
        return list;
    }
}
