package modsen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
    @RequestMapping("/")
    public ModelAndView index(){
        return new ModelAndView("index.html");
    }

}