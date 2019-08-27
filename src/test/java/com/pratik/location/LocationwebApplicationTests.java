package com.pratik.location;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pratik.location.entities.Flight;
import com.pratik.location.entities.Location;
import com.pratik.location.entities.P_user;
import com.pratik.location.repos.FlightRepository;
import com.pratik.location.repos.LocationRepository;
import com.pratik.location.repos.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LocationwebApplicationTests {

	@Autowired
	LocationRepository locationrepos;
	
	@Autowired
	UserRepository repo;
	
	@Autowired
	FlightRepository flightRepository ;
	
	@Test
	public void getLocation() {
		
		List<Location> list = locationrepos.findAll();
		System.out.println(list);
		
	}
	
/*	@Test
	public void addLocation() {
		Location location =  new Location();
		location.setId(378);
		location.setCode("123");
		location.setName("indore 2");
		location.setType("urban");
		locationrepos.save(location);
		
	}*/
	
/*	@Test
	public void deleteLocation() {
		Optional<Location> location = locationrepos.findById(3);
		locationrepos.delete(location.get());
	}*/
	
	@Test
	public void alluser() {
		List<P_user> list = repo.findAll();
		System.out.println(list);
	}
	
	@Test
	public void allflights() {
		List<Flight> list = flightRepository.findAll();
		System.out.println(list);
	}

}
