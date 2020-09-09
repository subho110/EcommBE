package com.exploreTechie.ecommerce.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.exploreTechie.ecommerce.Exception.CategoryNotFoundException;
import com.exploreTechie.ecommerce.Exception.ProductNotFoundException;
import com.exploreTechie.ecommerce.Model.Category;
import com.exploreTechie.ecommerce.Model.Product;


public interface ProductService {

	List<Product> getAllProducts();
		
	Optional<Product> getProductById(long id) throws ProductNotFoundException;
	
	List<Product> getProductByCategory(long id) throws CategoryNotFoundException, ProductNotFoundException;
	
	List<Category> getAllCategories();
	//Optional<Product> updateProductDetails(long id) throws ProductNotFoundException;

	Product getProductByProductId(long productId) throws ProductNotFoundException;
	
	//Optional<Product> deleteProduct(long id) throws ProductNotFoundException;
	
	//Optional<Product> addProduct(Product product) throws ProductNotFoundException;
	
	
	
	
}
