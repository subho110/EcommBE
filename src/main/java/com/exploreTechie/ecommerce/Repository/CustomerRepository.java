package com.exploreTechie.ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exploreTechie.ecommerce.Model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
