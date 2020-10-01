package com.codegym.service;

import com.codegym.model.MyUser;

import java.util.List;

public interface IMyUserService {

    List<MyUser> getUserList();

    MyUser save(MyUser myUser);

}