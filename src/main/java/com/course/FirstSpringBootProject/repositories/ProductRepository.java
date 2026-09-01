package com.course.FirstSpringBootProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.FirstSpringBootProject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{ //vai ser capaz de instanciar pra gente um objeto repository que vai ter várias operações para trabalhar com usuário


}
