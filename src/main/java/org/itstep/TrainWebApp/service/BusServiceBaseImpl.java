package org.itstep.TrainWebApp.service;

import org.itstep.TrainWebApp.model.Bus;
import org.itstep.TrainWebApp.repositiry.BusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusServiceBaseImpl implements ServiceBase<Bus, Long> {

    private BusRepo busRepo;

    @Autowired
    public void setBusRepo(BusRepo busRepo) {
        this.busRepo = busRepo;
    }

    @Override
    public void save(Bus bus) {
        busRepo.save(bus);
    }

    @Override
    public Bus update(Bus bus) {
        return busRepo.save(bus);
    }

    @Override
    public void delete(Long id) {
        Bus busById = busRepo.findBusById(id);
        busRepo.delete(busById);
    }

    @Override
    public Bus getById(Long id) {
        return busRepo.findBusById(id);
    }
}
