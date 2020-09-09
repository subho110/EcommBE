package com.exploreTechie.ecommerce.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.exploreTechie.ecommerce.Exception.ProductNotFoundException;
import com.exploreTechie.ecommerce.Model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	@Query("Select prod from Product prod where prod.category_id=:categoryId")
	List<Product> getProductByCategory(@Param("categoryId") long categoryId) throws ProductNotFoundException;
	
	@Query("Select prod from Product prod where prod.productId=:productId")
	Product getProductByProductId(@Param("productId") long productId) throws ProductNotFoundException;
	
	
	
}
