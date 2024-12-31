package med.voll.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController // This means that this class is a Controller
@RequestMapping("/hello") // This means URL's start with /hello (after Application path)
public class HelloController { // This is a Java class
    
    @GetMapping // GET /hello
    public String helloWorld() {
        return "Hello, World from Europe!";
    }

}
