package com.exploreTechie.ecommerce.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exploreTechie.ecommerce.Exception.CategoryNotFoundException;
import com.exploreTechie.ecommerce.Exception.ProductNotFoundException;
import com.exploreTechie.ecommerce.Model.Product;
import com.exploreTechie.ecommerce.Service.ProductService;

@RestController
@RequestMapping("/Products")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/getALL")
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@GetMapping("/getALL/{productId}")
	public Optional<Product> getProductById(@PathVariable("productId") long productId) throws ProductNotFoundException{
		return productService.getProductById(productId);
	}
	
	
	@GetMapping("/getALL/{categoryId}")
	public List<Product> getProductByCategory(@PathVariable("categoryId") long categoryId) throws ProductNotFoundException, CategoryNotFoundException{
		return productService.getProductByCategory(categoryId);
	}
	
	
}
