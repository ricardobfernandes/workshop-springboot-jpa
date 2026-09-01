package com.course.FirstSpringBootProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.FirstSpringBootProject.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{ //vai ser capaz de instanciar pra gente um objeto repository que vai ter várias operações para trabalhar com usuário
	

}
