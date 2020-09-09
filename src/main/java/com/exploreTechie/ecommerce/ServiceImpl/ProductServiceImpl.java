package com.exploreTechie.ecommerce.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exploreTechie.ecommerce.Exception.CategoryNotFoundException;
import com.exploreTechie.ecommerce.Exception.ProductNotFoundException;
import com.exploreTechie.ecommerce.Model.Category;
import com.exploreTechie.ecommerce.Model.Product;
import com.exploreTechie.ecommerce.Repository.CategoryRepository;
import com.exploreTechie.ecommerce.Repository.ProductRepository;
import com.exploreTechie.ecommerce.Service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Optional<Product> getProductById(long id) throws ProductNotFoundException {
		return productRepository.findById(id);
	}

	@Override
	public Product getProductByProductId(long productId) throws ProductNotFoundException {
		return productRepository.getProductByProductId(productId);
	}

	@Override
	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}

	@Override
	public List<Product> getProductByCategory(long categoryId) throws CategoryNotFoundException, ProductNotFoundException {
		return productRepository.getProductByCategory(categoryId);
	}

}
