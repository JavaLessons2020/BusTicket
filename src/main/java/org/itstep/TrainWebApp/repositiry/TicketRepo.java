package org.itstep.TrainWebApp.repositiry;

import org.itstep.TrainWebApp.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepo extends JpaRepository<Ticket, Long>{
}
