package com.jeewan.roomreservationservices.apiServices;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.jeewan.roomreservationservices.model.Room;

@FeignClient("roomservices")
public interface Roomclient {

	@GetMapping
	List<Room> GetAllRooms();
	
	@GetMapping("/rooms/{id}")
	Room getRoom(@PathVariable("id") long id);
	
	
}
