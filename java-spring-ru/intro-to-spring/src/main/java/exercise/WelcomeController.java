package exercise;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// BEGIN
@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Welcome to Spring";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String getFoos(@RequestParam(defaultValue = "World") String id) {
        return "Hello, " + id + "!";
    }
}
// END
