package com.example.demo.customer;

import org.springframework.data.jpa.repository.JpaRepository;
public interface CustomerRepository extends JpaRepository<Customer,Long> {

//    @Override
//    public List<Customer> getCustomers() {
//        //TODO connect to real db
//        return Collections.singletonList(
//                new Customer(1L, "TODO. Implement real db","todo", "email@gmail.com"));
//    }
}
