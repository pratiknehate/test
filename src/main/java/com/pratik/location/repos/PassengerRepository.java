package com.pratik.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pratik.location.entities.Passenger;


public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
