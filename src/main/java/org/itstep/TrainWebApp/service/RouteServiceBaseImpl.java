package org.itstep.TrainWebApp.service;

import org.itstep.TrainWebApp.model.Route;
import org.itstep.TrainWebApp.repositiry.RouteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RouteServiceBaseImpl<T, I> implements ServiceBase<Route, Long> {

    private RouteRepo routeRepo;

    @Autowired
    public void setRouteRepo(RouteRepo routeRepo) {
        this.routeRepo = routeRepo;
    }

    @Override
    public void save(Route route) {
        routeRepo.save(route);
    }

    @Override
    public Route update(Route route) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Route getById(Long id) {
        return null;
    }


    public List<Route> findRoutes(String startPoint, String endPoint) {
        return null;
    }
}
