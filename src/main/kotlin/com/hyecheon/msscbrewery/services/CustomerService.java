package com.hyecheon.msscbrewery.services;

import com.hyecheon.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * @author hyecheon
 */
public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteById(UUID customerId);
}