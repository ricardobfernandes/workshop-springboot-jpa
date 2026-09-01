package com.course.FirstSpringBootProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.FirstSpringBootProject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{ //vai ser capaz de instanciar pra gente um objeto repository que vai ter várias operações para trabalhar com usuário


}
