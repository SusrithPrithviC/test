package com.flight_reservation_app_1.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight_reservation_app_1.enitities.Flight;
import com.flight_reservation_app_1.enitities.Passenger;
import com.flight_reservation_app_1.enitities.Reservation;
import com.flight_reservation_app_1.repositories.FlightRepository;
import com.flight_reservation_app_1.repositories.PassengerRepository;
import com.flight_reservation_app_1.repositories.ReservationRepository;
@Controller
public class ReservationController {
	@Autowired
	FlightRepository flightRepo;
	@Autowired
	PassengerRepository passengerRepo;
	@Autowired
	ReservationRepository reservationRepo;
	
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId")Long flightId,ModelMap modelMap) {
		Optional<Flight> findById = flightRepo.findById(flightId);
		Flight flight = findById.get();
		modelMap.addAttribute("flight",flight );
		return"showCompleteReservation";
	}
	@RequestMapping("/confirmReservation")
	public String confirmReservation(@RequestParam("firstName")String firstName,@RequestParam("lastName")String lastName,@RequestParam("middleName")String middleName,@RequestParam("age")Long age,@RequestParam("gender")String gender,@RequestParam("meals")String meals,@RequestParam("flightId")Long flightId,ModelMap modelMap) {
		Passenger passenger = new Passenger();
		passenger.setFirstName(firstName);
		passenger.setLastName(lastName);
		passenger.setMiddleName(middleName);
		passenger.setAge(age);
		passenger.setGender(gender);
		passenger.setMeals(meals);
		passengerRepo.save(passenger);
		
//		Optional<Flight> findById = flightRepo.findById(flightId);
//		Flight flight = findById.get();
//		
//		Reservation reservation = new Reservation();
//		reservation.setCheckedIn(false);
//		reservation.setNumberOfBags(0);
//		reservation.setPassenger(passenger);
//		reservation.setFlight(flight);
//		reservationRepo.save(reservation);
//		
		modelMap.addAttribute("firstName", firstName);
		modelMap.addAttribute("lastName", lastName);
		modelMap.addAttribute("middleName", middleName);
		modelMap.addAttribute("age", age);
		modelMap.addAttribute("gender", gender);
		modelMap.addAttribute("meals", meals);
//		modelMap.addAttribute("operatingAirlines", flight.getOperatingAirlines());
//		modelMap.addAttribute("departureCity", flight.getDepartureCity());
//		modelMap.addAttribute("arrivalCity", flight.getArrivalCity());
//		modelMap.addAttribute("dateOfDeparture", flight.getDateOfDeparture());
		
		return"confirmationPage";
	}

}
