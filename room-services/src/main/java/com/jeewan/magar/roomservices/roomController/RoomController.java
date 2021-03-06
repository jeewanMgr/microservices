package com.jeewan.magar.roomservices.roomController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeewan.magar.roomservices.Repository.RoomRepository;
import com.jeewan.magar.roomservices.entity.Room;

@RestController
@RequestMapping("/rooms")
public class RoomController {
	
	private RoomRepository roomRepo;
	
	RoomController(RoomRepository roomrepo)
	{
		this.roomRepo = roomrepo;
	}
	@GetMapping
	public Iterable<Room> allroom(){
		return this.roomRepo.findAll();
	}

	 @GetMapping("/{id}")
	public Room getRoom(@PathVariable("id") long id) {
		 return this.roomRepo.findById(id).get();
	 }
	
}
