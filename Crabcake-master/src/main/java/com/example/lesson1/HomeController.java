package com.example.lesson1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/crabcake")
    public String homePage(){
        return "crabcake";
    }
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/sea_bass")
    public String seaBass(){
        return "seabass";
    }
    @RequestMapping("/escargot")
    public String escargot(){
        return "escargot";
    }

    @RequestMapping("/bootstrap")
    public String bootstrap(){
        return "bootstrap";
    }

}
