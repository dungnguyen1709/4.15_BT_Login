package com.codegym.repository;

import com.codegym.model.MyUser;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;

@Qualifier("myUserRepository")
public interface IMyUserRepository extends CrudRepository<MyUser, Long> {
    MyUser findByUsername(String username);
}