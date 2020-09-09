package com.exploreTechie.ecommerce.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.exploreTechie.ecommerce.Model.AddToCart;

@Repository
public interface AddToCartRepository extends JpaRepository<AddToCart, Long>{

	@Query("Select cart from AddToCart cart where cart.customerId=:customerId and cart.productId=:productId")
	Optional<AddToCart> getCartByCustomerIdandProductId(@Param("customerId") long customerId,@Param("productId") long productId);

	@Query("Select cart from AddToCart cart where cart.customerId=:customerId")
	List<AddToCart> getCartByCustomerId(@Param("customerId") long customerId);

	@Query("Delete cart from AddToCart cart where cart.customerId=:customerId")
	List<AddToCart> removeCartByCustomerIdAndCartId(long customerId, long cartId);

	@Query("Delete from AddToCart cart where cart.customerId=:customerId")
	void deleteAllCartByUserId(@Param("customerId") long customerId);

	@Query("Select sum(cart.price) from AddToCart cart where cart.customerId=:customerId")
	double getTotalCartAmtByCustomerId(long customerId);

	@Query("Update AddToCart cart set cart.qty=:qty,cart.price:=:price where cart.customerId=:customerId ")
	void updateQtyInCartByCartId(long cartId, int qty, double price);
	
}