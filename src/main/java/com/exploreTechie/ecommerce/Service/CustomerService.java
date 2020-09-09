package com.exploreTechie.ecommerce.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.exploreTechie.ecommerce.Model.Customer;


public interface CustomerService {

	
	Optional<Customer> findCustomerDetailsById(long customerId) throws Exception;
	
}
