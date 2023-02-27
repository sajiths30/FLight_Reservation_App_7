package com.Flight_Reservation_app_7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flight_Reservation_app_7.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {

}
