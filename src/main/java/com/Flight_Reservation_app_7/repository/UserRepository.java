package com.Flight_Reservation_app_7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flight_Reservation_app_7.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

	User findByEmail(String emailId);

}
