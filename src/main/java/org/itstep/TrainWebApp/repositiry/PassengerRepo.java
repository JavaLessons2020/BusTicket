package org.itstep.TrainWebApp.repositiry;

import org.itstep.TrainWebApp.model.Passenger;
import org.itstep.TrainWebApp.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepo extends JpaRepository<Passenger, Long> {
}
