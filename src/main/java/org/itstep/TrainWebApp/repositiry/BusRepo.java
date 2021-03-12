package org.itstep.TrainWebApp.repositiry;

import org.itstep.TrainWebApp.model.Bus;
import org.itstep.TrainWebApp.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepo extends JpaRepository<Bus, Long> {
    Bus findBusById(Long id);
}
