package com.flight_reservation_app_1.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.flight_reservation_app_1.enitities.Flight;





public interface FlightRepository extends JpaRepository<Flight, Long> {
	@Query("from Flight where departureCity=:from and arrivalCity=:to and dateOfDeparture=:departureDate")
     List<Flight> findFlight(@Param("from")String from,@Param("to") String to, @Param("departureDate")String departureDate);

	

}
