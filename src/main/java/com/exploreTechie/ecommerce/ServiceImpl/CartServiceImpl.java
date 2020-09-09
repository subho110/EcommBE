package com.exploreTechie.ecommerce.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exploreTechie.ecommerce.Model.AddToCart;
import com.exploreTechie.ecommerce.Model.CartCheckout;
import com.exploreTechie.ecommerce.Model.Product;
import com.exploreTechie.ecommerce.Repository.AddToCartRepository;
import com.exploreTechie.ecommerce.Service.CartService;
import com.exploreTechie.ecommerce.Service.ProductService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	AddToCartRepository addToCartRepository;

	@Autowired
	ProductService productService;

	private static final Logger logger = LoggerFactory.getLogger(CartServiceImpl.class);

	@Override
	public List<AddToCart> addToCartByUserIdAndProductId(long productId, long customerId, int qty, double price)
			throws Exception {

		try {
			if (addToCartRepository.getCartByCustomerIdandProductId(customerId, productId).isPresent())
				throw new Exception("Product already added in cart.");

			AddToCart addToCart = new AddToCart();
			addToCart.setQuantity(qty);
			addToCart.setCustomerId(customerId);
			Product product = productService.getProductByProductId(productId);
			addToCart.setProduct(product);
			addToCart.setPrice(price);
			addToCart.setQuantity(qty);
			addToCartRepository.save(addToCart);
			return this.getCartByUserId(customerId);

		} catch (Exception e) {

			e.printStackTrace();
			logger.error(" " + e.getMessage());
			throw new Exception(e.getMessage());

		}

	}

	@Override
	public void quantityInCartByCartId(long cartId, int qty, double price) {

		addToCartRepository.updateQtyInCartByCartId(cartId, qty, price);

	}

	@Override
	public List<AddToCart> getCartByUserId(long customerId) {
		return addToCartRepository.getCartByCustomerId(customerId);
	}

	@Override
	public List<AddToCart> removeCartByUserId(long customerId, long cartId) {
		addToCartRepository.removeCartByCustomerIdAndCartId(customerId, cartId);
		return this.getCartByUserId(customerId);
	}

	/*
	 * discuss
	 *
	 */
	@Override
	public List<AddToCart> removeAllCartByUserId(long customerId) {
		addToCartRepository.deleteAllCartByUserId(customerId);
		return null;
	}

	@Override
	public Boolean checkTotalAmountInCart(double totalAmountInCart, long customerId) {
		double totalCartAmountFromRepo = addToCartRepository.getTotalCartAmtByCustomerId(customerId);
		return totalCartAmountFromRepo == totalAmountInCart ? true : false;
	}

	@Override
	public List<CartCheckout> getAllCheckedOutByUserId(long userId) {
		return null;
		}

}
