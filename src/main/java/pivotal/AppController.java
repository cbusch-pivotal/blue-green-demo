package pivotal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @RequestMapping("/")
    public String homepage() {
	// open the home page
        return "home";
    }

    @RequestMapping("/test")
    public String testpage() {
        return "test";
    }

//    @RequestMapping("/error")
//    public String errorpage() {
//        return "error";
//    }
}
