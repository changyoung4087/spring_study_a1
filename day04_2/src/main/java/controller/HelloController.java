package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    // hello로 빈을 찾아 맵핑
    @GetMapping("/hello")
    public String hello() {


        return "hello"; // WEB-INF/view/hello.jsp 를 찾음
    }
}
