package org.itstep.TrainWebApp.repositiry;

import org.itstep.TrainWebApp.model.Route;
import org.itstep.TrainWebApp.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RouteRepo extends JpaRepository<Route, Long> {
    List<Route>findAllByArrivalAndDeparture(String startPoint, String endPoint);
}
