package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        // hello라는 url로 오면, 컨트롤러 호출된다.
        model.addAttribute("data", "hello!!!");
        return "hello"; /// resource/template/{}.html
    }
}
