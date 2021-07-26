package com.jeewan.magar.roomservices.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jeewan.magar.roomservices.entity.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room,Long>{
	

}
