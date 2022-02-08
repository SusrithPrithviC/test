package com.flight_reservation_app_1.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight_reservation_app_1.enitities.Flight;
import com.flight_reservation_app_1.repositories.FlightRepository;

@Controller
public class FlightController {
	@Autowired
	FlightRepository flightRepo;
	
	@RequestMapping(value="/findFlight",method=RequestMethod.POST)
	public String findFlights(@RequestParam("from")String from,@RequestParam("to")String to,@RequestParam("departureDate") String departureDate,ModelMap modelMap) {
		List<Flight> findFlight = flightRepo.findFlight(from, to, departureDate);
		modelMap.addAttribute("findFlight", findFlight);
		return"displayFlights";
	}
	

}
