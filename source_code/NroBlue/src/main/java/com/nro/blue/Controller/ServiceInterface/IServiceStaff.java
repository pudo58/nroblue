package com.nro.blue.Controller.ServiceInterface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nro.blue.Controller.Entity.Staff;

public interface IServiceStaff extends JpaRepository<Staff, Integer>{

}
