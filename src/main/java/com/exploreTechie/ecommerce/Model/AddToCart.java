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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//table for cart 
@Entity

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Table(name = "addToCart")
public class AddToCart {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long addToCartId;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id")
	private Product product;

	@Column
	private int quantity;

	@Column
	private double price;

	@Column
	private long customerId;

	@Column(updatable = false, insertable = false)
	private String addedDate;

	public Long getAddToCartId() {
		return addToCartId;
	}

	public void setAddToCartId(Long addToCartId) {
		this.addToCartId = addToCartId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(String addedDate) {
		this.addedDate = addedDate;
	}
	
	
}
