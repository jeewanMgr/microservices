package com.jeewan.magar.reservationservices.repositary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jeewan.magar.reservationservices.entity.*;

@Repository
public interface ReservationRepositary extends CrudRepository<Reservation,Long> {

}
