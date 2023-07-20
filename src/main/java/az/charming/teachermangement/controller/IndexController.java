package az.charming.teachermangement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("alma")
    public  String index(){
        return "index";
    }
}
