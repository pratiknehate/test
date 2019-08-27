package com.pratik.location.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pratik.location.dto.UpdateResevationRequest;
import com.pratik.location.entities.Reservation;
import com.pratik.location.repos.ReservationRepository;

@RestController
public class ReservationRestController {

	@Autowired
	ReservationRepository reservationRepository;
	
	@RequestMapping("/reservations/{id}")
	public Reservation findResevation(@PathVariable("id") Long id) {
		
		return  reservationRepository.findById(id).get();
		
	}
	
	@RequestMapping("/reservations")
	public Reservation updateResevationRequest(@RequestBody UpdateResevationRequest request) {
		
		Reservation res = reservationRepository.findById(request.getId()).get();
		res.setCheckedIn(request.isCheckedIn());
		res.setId(request.getId());
		res.setNumberOfBags(request.getNumberOfBags());
		return reservationRepository.save(res); 
		
	}
}
