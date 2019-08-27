package com.pratik.location.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratik.location.entities.Location;
import com.pratik.location.repos.LocationRepository;
import com.pratik.location.services.LocationService;

@Service
public class LocationServiceImp implements LocationService {

	@Autowired
	LocationRepository locationRepository; 
	
	@Override
	public Location saveLocation(Location location) {
		return locationRepository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return locationRepository.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		System.out.println(location.toString());
		locationRepository.delete(location);

	}

	@Override
	public Location getLocationById(int id) {
		Optional<Location> location = locationRepository.findById(id);
		
		return location.get();
	}

	@Override
	public List<Location> getAllLocations() {
		// TODO Auto-generated method stub
		return locationRepository.findAll();
	}

}
