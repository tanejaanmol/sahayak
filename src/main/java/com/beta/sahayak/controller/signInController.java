package com.beta.sahayak.controller;

import com.beta.sahayak.service.Impl.SignInImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class signInController {

    @Autowired SignInImpl signInImpl;

    @GetMapping("v1/beta/sign")
    public String signIn (@RequestParam("name") String name, @RequestParam("email") String emailId){
        System.out.println("SIGN");
        signInImpl.userLogin(emailId,name);
        return null;
    }
}
