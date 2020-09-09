package com.exploreTechie.ecommerce.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exploreTechie.ecommerce.Service.CartService;
import com.exploreTechie.ecommerce.Service.ProductService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired//(required = false)
	private CartService cartService;

	@Autowired//(required = false)
	private ProductService productService;

	
	//public 
	
}
