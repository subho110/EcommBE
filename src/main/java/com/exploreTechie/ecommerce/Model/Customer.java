/*
 * change value names in @column
 * 
 * */

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
@Table(name="customer")
public class Customer {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	
	@NotNull
	@Column(name="PHONE", nullable=false, length=10)
	private int phone;
	
	@Column(name="PostalCode", nullable=false, length=6)
	private int postalCode;
	
	@Column(name="Age", nullable=false, length=10)
	private int age;
	
	@Column(name="FirstName", nullable=false, length=10)
	private String firstName;
	
	@Column(name="LastName", nullable=false, length=10)
	private String lastName;
	
	@Column(name="Address", nullable=false, length=10)
	private String address;
	
	@Column(name="City", nullable=false, length=10)
	private String city;
	
	
}
