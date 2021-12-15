package com.codegym.service.impl;

import com.codegym.model.Customer;
import com.codegym.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

@Service
public class SimpleCustomerServiceImpl implements CustomerService {
    private static List<Customer> customers;
    private static long autoIncreaseId = 0;

    static {
        customers = asList(
                new Customer(1, "T", "t@codegym.vn", "Da Nang"),
                new Customer(2, "Nhat", "nhat@codegym.vn", "Quang Tri"),
                new Customer(3, "Trang", "trang@codegym.vn", "Ha Noi"),
                new Customer(4, "Nguyen Binh Son", "son@codegym.vn", "Sai Gon"),
                new Customer(5, "Dang Xuan Hoa", "hoa.dang@codegym.vn", "Da Nang")
        );
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers);
    }

    @Override
    public Customer findOne(int id) {
        return customers.stream()
                .filter(c -> c.getId() ==(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Customer save(Customer customer) {
//        return customer.getId() == null ? persist(customer) : merge(customer);
        return null;
    }

    @Override
    public List<Customer> save(List<Customer> customers) {
        return customers.stream()
                .map(this::save)
                .collect(Collectors.toList());
    }

    @Override
    public boolean exists(int id) {
//        return customers.stream().anyMatch(c -> c.getId().equals(id));
        return false;
    }

    @Override
    public List<Customer> findAll(List<Integer> ids) {
//        return ids.stream()
//                .map(this::findOne)
//                .collect(Collectors.toList());
        return null;
    }

    @Override
    public long count() {
        return customers.size();
    }

    @Override
    public void delete(int id) {
        customers.removeIf(c -> c.getId() == (id));
    }

    @Override
    public void delete(Customer customer) {
        delete(customer.getId());
    }

    @Override
    public void delete(List<Customer> customers) {
        customers.forEach(this::delete);
    }

    @Override
    public void deleteAll() {
        customers = new ArrayList<>();
    }

    private Customer persist(Customer customer) {
//        Customer clone = customer.clone();
//        clone.setId(autoIncreaseId++);
//        customers.add(clone);
//        return clone;
        return null;
    }

    private Customer merge(Customer customer) {
//        Customer origin = findOne(customer.getId());
//        origin.setName(customer.getName());
//        origin.setEmail(customer.getEmail());
//        origin.setAddress(customer.getAddress());
        return null;
    }
}
