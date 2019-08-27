package com.pratik.location.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.pratik.location.entities.Location;
import com.pratik.location.services.LocationService;

@Controller
public class LocationController {
	@Autowired
	LocationService locationservice;

	@RequestMapping("/showCreate")
	public String createShow() {
		return "createLocation";
	}

	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		Location locationSaved = locationservice.saveLocation(location);
		String msg = "location saved with id" + locationSaved.getId();
		modelMap.addAttribute("msg", msg);
		return "createLocation";
	}

	@RequestMapping("/displayLocation")
	public String displayLocation(ModelMap modelMap) {
		List<Location> locations = locationservice.getAllLocations();
		modelMap.addAttribute("location", locations);
		return "displayLocation";
	}

	@RequestMapping("/deleteLocation")
	public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap) {
		Location location = locationservice.getLocationById(id);
		locationservice.deleteLocation(location);
		List<Location> locations = locationservice.getAllLocations();
		modelMap.addAttribute("location", locations);
		return "displayLocation";
	}
	@RequestMapping("/edit")
	public String edit(@RequestParam("id") int id, ModelMap modelMap) {
		Location location = locationservice.getLocationById(id);
		modelMap.addAttribute("location", location);
		return "editLocation";
	}
	
	@RequestMapping("/editLoc")
	public String editLocation(@ModelAttribute("location") Location location,ModelMap map) {
		Location loc = locationservice.updateLocation(location);
		String msg = "data update with id "+loc.getId();
		List<Location> locations = locationservice.getAllLocations();
		map.addAttribute("location", locations);
		return "displayLocation";
		
	}
}