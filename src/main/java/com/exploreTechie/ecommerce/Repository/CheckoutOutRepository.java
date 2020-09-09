package com.exploreTechie.ecommerce.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.exploreTechie.ecommerce.Model.CartCheckout;

@Repository
public interface CheckoutOutRepository extends JpaRepository<CartCheckout, Long> {

	@Query("Select checkedOut from CartCheckout where checkedOut.customerId=:customerId")
		List<CartCheckout> getByCustomerId(@Param("customerId") long customerId);
	
}
