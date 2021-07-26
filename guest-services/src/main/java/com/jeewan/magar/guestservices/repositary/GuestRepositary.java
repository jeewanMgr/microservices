package com.jeewan.magar.guestservices.repositary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jeewan.magar.guestservices.entity.*;

@Repository
public interface GuestRepositary extends CrudRepository<Guest,Long>{

}
