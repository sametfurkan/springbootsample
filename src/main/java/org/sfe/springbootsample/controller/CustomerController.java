package org.sfe.springbootsample.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.sfe.springbootsample.model.Customer;
import org.sfe.springbootsample.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {


    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/get/all")
    public List<Customer> getAllCustomer() {
        return customerService.getAllCustomer();
    }

    @GetMapping("/get/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @PostMapping("/create")
    public Customer  createCustomer(@RequestBody Customer customer) {

        return customerService.createCustomer(customer);
    }

    @PostMapping("/update/{id}")
    public Customer updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {

        return customerService.updateCustomer(id, customer);
    }

    @PostMapping("/delete/{id}")
    public Boolean deleteCustomer(@PathVariable Long id) {

        return customerService.deleteCustomer(id);
    }






}
