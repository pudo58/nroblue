package com.nro.blue.Controller.ServiceInterface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nro.blue.Controller.Entity.Account;

public interface IServiceAccount extends JpaRepository<Account,Integer>{

}
