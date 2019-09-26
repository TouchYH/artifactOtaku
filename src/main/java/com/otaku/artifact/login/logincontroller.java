package com.otaku.artifact.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("otaku")
public class logincontroller {
    @RequestMapping("login")
    public String login(){
        return "login";
    }
}
