package com.nro.blue.Controller.ServiceInterface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nro.blue.Controller.Entity.User;

public interface IServiceUser extends JpaRepository<User,Integer>{

}
