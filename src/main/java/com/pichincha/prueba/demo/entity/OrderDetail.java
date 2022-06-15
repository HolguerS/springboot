package com.pichincha.prueba.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class OrderDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	@ManyToOne
	private Product product;
	@ManyToOne
	private Order order;
	private Integer totalOdered;
	private Double priceUnit;
	private Double priceTotal; 
		
}
