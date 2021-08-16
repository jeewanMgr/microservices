package com.jeewan.roomreservationservices;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;



import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.jeewan.roomreservationservices.apiServices.Roomclient;
import com.jeewan.roomreservationservices.model.Room;

@RestController
@RequestMapping("/roomreservation")
public class RoomservicesWebServices {
	
//	private final RestTemplate restTemplate;
    private final Roomclient roomclient;	
	RoomservicesWebServices(Roomclient roomclient)
	{
		super();
		this.roomclient = roomclient;
	}
	
	
	@GetMapping
	public List<RoomReservation> getroomreservation(){
		List<Room> rooms = this.roomclient.GetAllRooms();
		List<RoomReservation> newroomservation = new ArrayList<>();
		rooms.forEach(data->{
			RoomReservation one = new RoomReservation();
			one.setFirstname(data.getName());
			one.setLastname("TM");
			one.setRoomNumber(data.getRoomNumber());
			one.setId(data.getId());
			
			newroomservation.add(one);	
		});
		
		return newroomservation;
	}
	
	
	
	
//	private List<Room>getAllRooms(){
//	
//	ResponseEntity<List<Room>> roomResponse= this.restTemplate.exchange("http://BOOKSERVICES/rooms",HttpMethod.GET,null, new ParameterizedTypeReference<List<Room>>(){});
//    return roomResponse.getBody();
//}
}
