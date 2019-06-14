package com.beta.sahayak.service.Impl;

import com.beta.sahayak.dao.UserDetails;
import com.beta.sahayak.repository.SignInRepository;
import com.beta.sahayak.service.SignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SignInImpl implements SignInService {

    @Autowired SignInRepository signInRepo;

    public  String userLogin(String email,String name){
        UserDetails UserDetails=new UserDetails(email,name);
        signInRepo.save(UserDetails);
        return null;
    }
}
