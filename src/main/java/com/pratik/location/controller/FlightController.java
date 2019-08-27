package com.pratik.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pratik.location.entities.Flight;
import com.pratik.location.repos.FlightRepository;

@Controller
public class FlightController {

	@Autowired
	FlightRepository  flightRepository;
	
	@RequestMapping("/flights")
	public String availFlights(@RequestParam("from") String from,@RequestParam("to") String to,
			@RequestParam("departureDate") String departureDate,ModelMap map) {
		List<Flight> list = flightRepository.findByCity(from,to,departureDate);
		for (Flight flight : list) {
			System.out.println(flight.toString());
		}
		map.addAttribute("flights", list);
		return "DisplayFlights";
	}
	

}
