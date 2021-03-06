package com.jeewan.magar.guestservices.GuestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeewan.magar.guestservices.entity.Guest;
import com.jeewan.magar.guestservices.repositary.GuestRepositary;

@RestController
@RequestMapping("/guests")
public class GuestWebServices {
	
	private final GuestRepositary repositary;
	
	GuestWebServices(GuestRepositary repo)
	{
		this.repositary = repo;
	}

	
	@GetMapping
	public Iterable<Guest> getallGuest(){
		return this.repositary.findAll();
	}
	
	@GetMapping("/{id}")
	public Guest getGuest(@PathVariable("id") long id)
	{
		return this.repositary.findById(id).get();
	}
	
	
}
