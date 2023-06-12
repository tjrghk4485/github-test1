package Githubtest1.githubtest1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {
    @GetMapping("/")
    @ResponseBody
    public String helloWorld(){
        return "To-do Application !";
    }
}
