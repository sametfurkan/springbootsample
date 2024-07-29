package org.sfe.springbootsample.service;

import org.sfe.springbootsample.model.Customer;
import org.sfe.springbootsample.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    public List<Customer> getAllCustomer() {

        return customerRepository.findAll();
    }


    public Customer getCustomerById(Long id) {

        return customerRepository.findById(1L).orElse(null);
    }


    public Customer createCustomer(Customer customer) {

        return customerRepository.save(customer);
    }

    public Customer updateCustomer(Long id, Customer customer) {

        customer.setId(id);
        return customerRepository.save(customer);
    }

    public Boolean deleteCustomer(Long id) {

        return customerRepository.existsById(id);
    }

}
