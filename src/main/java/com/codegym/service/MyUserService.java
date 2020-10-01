package com.codegym.service;

import com.codegym.model.MyUser;
import com.codegym.model.Role;
import com.codegym.repository.IMyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class MyUserService implements IMyUserService, UserDetailsService {

    @Autowired
    private IMyUserRepository myUserRepository;

    @Override
    public List<MyUser> getUserList() {
        return (List<MyUser>) myUserRepository.findAll();
    }

    @Override
    public MyUser save(MyUser myUser) {
        return myUserRepository.save(myUser);
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        MyUser myUser = myUserRepository.findByUsername(username);
        List<Role> myRole = new ArrayList<Role>();
        myRole.add(myUser.getRole());

        User user = new User(myUser.getUsername(), myUser.getPassword(), myRole);
        return user;
    }
}
