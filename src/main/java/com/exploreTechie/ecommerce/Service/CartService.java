package com.exploreTechie.ecommerce.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exploreTechie.ecommerce.Exception.ProductNotFoundException;
import com.exploreTechie.ecommerce.Model.AddToCart;
import com.exploreTechie.ecommerce.Model.CartCheckout;
import com.exploreTechie.ecommerce.Model.Product;


public interface CartService {

	 List<AddToCart> addToCartByUserIdAndProductId(long productId,long customerId,int qty,double price) throws Exception; 
	
	 void quantityInCartByCartId(long cartId,int qty, double price);
	
	 List<AddToCart> getCartByUserId(long customerId);
	 
//	 List<AddToCart> removeCartByUserId(long customerId);
	 
	 List<AddToCart> removeAllCartByUserId(long customerId);
	 
	 Boolean checkTotalAmountInCart(double totalAmount,long userId);
	 
	 
	 List<CartCheckout> getAllCheckedOutByUserId(long userId);

	List<AddToCart> removeCartByUserId(long customerId, long cartId);
	 
	 		

	 
}
