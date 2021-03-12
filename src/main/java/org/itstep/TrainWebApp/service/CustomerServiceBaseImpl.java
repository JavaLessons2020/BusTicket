package org.itstep.TrainWebApp.service;

import org.itstep.TrainWebApp.model.Customer;
import org.itstep.TrainWebApp.model.Role;
import org.itstep.TrainWebApp.repositiry.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;


@Service
public class CustomerServiceBaseImpl implements ServiceBase<Customer, Long>, UserDetailsService {

    private CustomerRepo customerRepo;

    private PasswordEncoder passwordEncoder;

    @Autowired
    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Autowired
    public void setCustomerRepo(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }



    public Boolean saveUser(Customer customer) {
            Customer customerFromDB = customerRepo.getCustomerByUserName(customer.getUsername());
            if (customerFromDB != null) { // если существует
                return false;
            }
            customer.setRoles(Collections.singleton(new Role(2L, "ROLE_USER")));
            customer.setPassword(passwordEncoder.encode(customer.getPassword()));
            customerRepo.save(customer);
            return true;
        }



    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Customer customer = customerRepo.getCustomerByUserName(userName);

        if (customer == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return customer;
    }

    @Override
    public void save(Customer customer) {
    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Customer getById(Long id) {
        return null;
    }
}
