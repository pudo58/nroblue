package com.nro.blue.Controller.ServiceInterface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nro.blue.Controller.Entity.Card;

public interface IServiceCard extends JpaRepository<Card,Integer>{

}
