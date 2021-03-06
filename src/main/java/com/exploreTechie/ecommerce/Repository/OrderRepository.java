package com.exploreTechie.ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exploreTechie.ecommerce.Model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
