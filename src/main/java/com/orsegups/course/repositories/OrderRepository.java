package com.orsegups.course.repositories;

import com.orsegups.course.entities.Order;
import com.orsegups.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}



