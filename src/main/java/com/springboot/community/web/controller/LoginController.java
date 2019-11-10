package com.springboot.community.web.controller;

import com.springboot.community.web.annotation.SocialUser;
import com.springboot.community.web.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/{facebook|google|kakao}/complete")
    public String loginComplete(@SocialUser User user) {
        return "redirect:/board/list";
    }
}
