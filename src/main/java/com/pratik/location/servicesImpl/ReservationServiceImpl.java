package com.pratik.location.servicesImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratik.location.dto.ReservationRequest;
import com.pratik.location.entities.Flight;
import com.pratik.location.entities.Passenger;
import com.pratik.location.entities.Reservation;
import com.pratik.location.repos.FlightRepository;
import com.pratik.location.repos.PassengerRepository;
import com.pratik.location.repos.ReservationRepository;
import com.pratik.location.services.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	FlightRepository flightRepository; 
	
	@Autowired
	PassengerRepository passengerRepository;
	
	@Autowired
	ReservationRepository reservationRepository; 
	
	@Override
	public Reservation bookFlight(ReservationRequest req) {
		
		
		Long flightId = req.getFlightId();
		Optional<Flight>  flight = flightRepository.findById(flightId);
		
		Passenger passenger = new Passenger();
		passenger.setFirstName(req.getPassengerFirstName());
		passenger.setLastName(req.getPassengerLastName());
		passenger.setEmail(req.getPassengerEmail());
		passenger.setPhone(req.getPassengerPhone());
		
		Passenger savedPassanger=  passengerRepository.save(passenger);
		
		Reservation reservation = new Reservation();
		reservation.setFlight(flight.get());
		reservation.setPassenger(savedPassanger);
		reservation.setCheckedIn(false);
		
		Reservation  savedReservation=reservationRepository.save(reservation);
		return savedReservation;
	}

}
