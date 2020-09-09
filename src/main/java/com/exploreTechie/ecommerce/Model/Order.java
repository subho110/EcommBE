package com.exploreTechie.ecommerce.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="orders")

public class Order {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long categoryId;
	
	@NotNull
	@Column(name="OrderName", nullable=false, length=10)
	private String orderName;
	
	
	
	
	private long customerId;
	
	

	/*
	 * @NotNull
	 * 
	 * @Column(name="", nullable=false, length=10) private int
	 * 
	 * @NotNull
	 * 
	 * @Column(name="", nullable=false, length=10) private long
	 * 
	 * @NotNull
	 * 
	 * @Column(name="", nullable=false, length=10) private String
	 * 
	 * @NotNull
	 * 
	 * @Column(name="", nullable=false, length=10) private double
	 */	
	
}
