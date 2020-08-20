package com.codegym.services;

import com.codegym.model.Customer;

import java.util.List;

public interface ICustomer {
    public List<Customer> getList();
    public Customer getById(int id);
    public void add(Customer customer);
}
