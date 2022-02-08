package com.flight_reservation_app_1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight_reservation_app_1.enitities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
