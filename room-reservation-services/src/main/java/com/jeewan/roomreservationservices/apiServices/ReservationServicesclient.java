package com.jeewan.roomreservationservices.apiServices;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.jeewan.roomreservationservices.model.Reservation;
import com.jeewan.roomreservationservices.model.Room;

@FeignClient("reservationservices")
public interface ReservationServicesclient {
	
	@GetMapping
	List<Reservation> GetAllReservation();
	
	@GetMapping("/rooms/{id}")
     Reservation getRoom(@PathVariable("id") long id);

}
