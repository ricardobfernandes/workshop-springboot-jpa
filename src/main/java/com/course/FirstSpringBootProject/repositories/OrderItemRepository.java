package com.course.FirstSpringBootProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.FirstSpringBootProject.entities.OrderItem;
import com.course.FirstSpringBootProject.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{ //vai ser capaz de instanciar pra gente um objeto repository que vai ter várias operações para trabalhar com usuário


}
