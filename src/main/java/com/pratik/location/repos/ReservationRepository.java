package com.pratik.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pratik.location.entities.Reservation;


public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}