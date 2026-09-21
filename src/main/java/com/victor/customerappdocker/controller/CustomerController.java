//package com.victor.customerappdocker.controller;
//
//import com.victor.customerappdocker.model.Customer;
//import com.victor.customerappdocker.service.CustomerService;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/v1/customer")
//public class CustomerController {
//
//    @Autowired
//    private final CustomerService service;
//
//    @Value("${order.service.url:http://localhost:8081}")
//    private String orderServiceUrl;
//
//
//    public CustomerController(CustomerService service) {
//        this.service = service;
//    }
//
//    @GetMapping
//    public List<Customer> getAllCustomers() {
//        return service.getAllCustomers();
//    }
//
//    @GetMapping("/{id}/orders") public Object getCustomerOrders(
//            @PathVariable int id) {
//        return service.getCustomerOrders(id, orderServiceUrl);
//    }
//}
package com.victor.customerappdocker.controller;


import com.victor.customerappdocker.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    @GetMapping
    public List<Customer> getAllCustomer() {
        return Arrays.asList(
                new Customer(1, "John Doe", "Lekki", "Male"),
                new Customer(2, "Reynard Wilson", "Ajah", "Male"),
                new Customer(3, "Pearl Wilson", "Ikeja", "Female"),
                new Customer(4, "Perculia Jackson", "Ikoyi", "Female")
        );
    }
}