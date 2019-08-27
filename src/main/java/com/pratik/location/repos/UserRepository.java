package com.pratik.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pratik.location.entities.P_user;



public interface UserRepository extends JpaRepository<P_user, String> {

	P_user findByEmail(String email);

}