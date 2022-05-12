package com.nro.blue.Controller.ServiceInterface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nro.blue.Controller.Entity.Admin;

public interface IServiceAdmin extends JpaRepository<Admin, Integer>{

}
