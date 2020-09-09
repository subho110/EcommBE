package com.exploreTechie.ecommerce.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exploreTechie.ecommerce.Model.Customer;
import com.exploreTechie.ecommerce.Repository.CustomerRepository;
import com.exploreTechie.ecommerce.Service.CustomerService;

@Service
public class CustomerServiceImpl implements  CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Optional<Customer> findCustomerDetailsById(long customerId) throws Exception {
		

		return customerRepository.findById(customerId);
	}

}
