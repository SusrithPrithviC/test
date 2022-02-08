package com.flight_reservation_app_1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.flight_reservation_app_1.enitities.User;

public interface UserRepository extends JpaRepository<User, Long> {

@Query()
User findByEmail(String email);

}
