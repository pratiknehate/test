package com.pratik.location.controller;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.pratik.location.dto.ReservationRequest;
import com.pratik.location.entities.Flight;
import com.pratik.location.entities.Reservation;
import com.pratik.location.repos.FlightRepository;
import com.pratik.location.services.ReservationService;
@Controller
public class ReservationController {

	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	ReservationService reservationService; 
	
	@RequestMapping("/showCompleteReservation")
	public String completeReservation(@RequestParam("flightId") Long flightId,ModelMap map) {
		Optional<Flight> flight =  flightRepository.findById(flightId);
		Flight f =  flight.get();
		map.addAttribute("flights",f);
		System.out.println(f.getArrivalcity());
		return "completeReservation";
	}
	
	@RequestMapping(value = "/completeReservation", method = RequestMethod.POST )
	public String completeReservation(@ModelAttribute("req") ReservationRequest req,ModelMap map) {
		
	Reservation reservation= reservationService.bookFlight(req);
		map.addAttribute("msg", "reservation created successfully with id : "+reservation.getId());
		return "reservationConfirmation";
	}
}
