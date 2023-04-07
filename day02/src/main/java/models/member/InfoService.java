package models.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Service
public class InfoService {
//    @Autowired
//    private Optional<MemberDAO> opt;

    // 생성자 매개변수로 주입해도 가능.
    private MemberDAO memberDao;
    public InfoService(MemberDAO memberDao){
        this.memberDao = memberDao;
    }

    private DateTimeFormatter formatter;
    //private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");

    public void print(String userId) {
//        MemberDAO memberDao = opt.get();
        Member member = memberDao.get(userId);

        if(formatter != null){
            String dataStr = formatter.format(member.getRegDt());
            member.setRegDtStr(dataStr);
        }

        System.out.println(member);
    }
    //@Autowired(required = false)
    @Autowired
    public void setFormatter(/*@Nullable*/ DateTimeFormatter formatter){
        if(formatter == null){
            this.formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        }else{
            this.formatter = formatter;
        }
    }
}
