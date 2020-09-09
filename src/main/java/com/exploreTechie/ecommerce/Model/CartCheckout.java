package com.exploreTechie.ecommerce.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cart_checkout")
public class CartCheckout {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cartCheckOutId;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id")
	Product product;

	@Column
	private long customerId;

	@Column
	private String orderId;

	@Column
	private String paymentType;
	@Column
	private String order_date;
	@Column
	private int productQuantity;
	@Column
	private double productTotalPrice;

}
