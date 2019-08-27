package com.pratik.location.services;

import com.pratik.location.dto.ReservationRequest;
import com.pratik.location.entities.Reservation;

public interface ReservationService {
	
	public Reservation bookFlight(ReservationRequest req);

}
