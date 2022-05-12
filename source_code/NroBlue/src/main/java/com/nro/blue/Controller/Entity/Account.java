package com.nro.blue.Controller.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "accounts")
@Data
@AllArgsConstructor
public class Account implements Serializable{
private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Integer id;

@ManyToOne
@JoinColumn(name = "id_staff",referencedColumnName = "id_staff")
Staff staff;

String username;

String password;

String tribe;

String regstration;

String images;

String mota;

String price;

Integer status;


	
	
}
