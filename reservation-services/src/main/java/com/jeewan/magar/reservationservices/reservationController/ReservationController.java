package com.jeewan.magar.reservationservices.reservationController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeewan.magar.reservationservices.entity.Reservation;
import com.jeewan.magar.reservationservices.repositary.ReservationRepositary;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
	
	private ReservationRepositary reservationRepository;
	
	ReservationController(ReservationRepositary repo)
	{
		this.reservationRepository = repo;
	}
	
	@GetMapping
	Iterable<Reservation> findallreservation(){
		return this.reservationRepository.findAll();
	}
	@GetMapping("/{id}")
	Reservation getReservation(@PathVariable("id") long id)
	{
		return this.reservationRepository.findById(id).get();
	}
	
	
	
}
