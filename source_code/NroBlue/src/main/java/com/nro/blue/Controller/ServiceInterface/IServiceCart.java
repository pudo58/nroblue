package com.nro.blue.Controller.ServiceInterface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nro.blue.Controller.Entity.Cart;

public interface IServiceCart extends JpaRepository<Cart, Integer>{

}
