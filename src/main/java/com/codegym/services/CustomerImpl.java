package com.codegym.services;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CustomerImpl implements ICustomer{
    static HashMap<Integer, Customer> hashMap;

    static {
        hashMap = new HashMap<>();
        hashMap.put(1, new Customer(1,"Nam","1234", "HN"));
        hashMap.put(2, new Customer(2,"Trung","1234", "LAO"));
    }

    @Override
    public List<Customer> getList() {
        return new ArrayList<>(hashMap.values());
    }

    @Override
    public Customer getById(int id) {
        return hashMap.get(id);
    }

    @Override
    public void add(Customer customer) {
        hashMap.put(hashMap.size()+1, customer);
    }

}
