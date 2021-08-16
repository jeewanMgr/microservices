package com.jeewan.roomreservationservices.apiServices;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.jeewan.roomreservationservices.model.Guest;
import com.jeewan.roomreservationservices.model.Room;

@FeignClient("guestservices")
public interface GurestserviceClient {
	
	@GetMapping
	List<Guest> GetAllguests();
	
	@GetMapping("/rooms/{id}")
	Guest getGuests(@PathVariable("id") long id);
	

}
