package cf.tilgiz.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Ilgiz Tukhvatov
 */
@Controller
public class HelloController {
    @GetMapping("/hello-world")
    public String sayHello(){
        return "hello_world";
    }
}
