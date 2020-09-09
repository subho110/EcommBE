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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long productId;

	@NotNull
	@Column(name = "ProductName", nullable = false, length = 10)
	private String productName;

	/* price,addedon,categoryid
	 * @NotNull
	 * 
	 * @Column(name="", nullable=false, length=10) private int
	 * 
	 * @NotNull
	 * 
	 * @Column(name="", nullable=false, length=10) private int
	 * 
	 * @NotNull
	 * 
	 * @Column(name="", nullable=false, length=10) private int
	 * 
	 * @NotNull
	 * 
	 * @Column(name="", nullable=false, length=10) private int
	 * 
	 * 
	 * @NotNull
	 * 
	 * @Column(name="", nullable=false, length=10) private String
	 * 
	 * @NotNull
	 * 
	 * @Column(name="", nullable=false, length=10) private String
	 * 
	 * @NotNull
	 * 
	 * @Column(name="", nullable=false, length=10) private String
	 */

}
