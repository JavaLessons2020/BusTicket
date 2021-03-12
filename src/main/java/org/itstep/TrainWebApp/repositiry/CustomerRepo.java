package org.itstep.TrainWebApp.repositiry;

import org.itstep.TrainWebApp.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
    Customer getCustomerByUserName(String userName);
}
