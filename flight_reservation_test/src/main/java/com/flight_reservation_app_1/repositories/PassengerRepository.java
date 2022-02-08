package com.flight_reservation_app_1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight_reservation_app_1.enitities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
