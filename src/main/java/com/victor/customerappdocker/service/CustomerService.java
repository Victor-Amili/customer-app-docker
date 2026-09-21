//package com.victor.customerappdocker.service;
//
//import com.victor.customerappdocker.model.Customer;
//import com.victor.customerappdocker.repository.CustomerRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.List;
//
//@Service
//public class CustomerService {
//
//    @Autowired
//    private final CustomerRepository repository;
//
//    @Autowired
//    private final RestTemplate restTemplate;
//
//    public CustomerService(CustomerRepository repository, RestTemplate restTemplate) {
//        this.repository = repository;
//        this.restTemplate = restTemplate;
//    }
//
//    public List<Customer> getAllCustomers() {
//        return repository.findAll();
//    }
//
//    public Object getCustomerOrders(int customerId, String orderServiceUrl) {
//        String url = orderServiceUrl + "/api/v1/order/customer/" + customerId;
//        return restTemplate.getForObject(url, Object.class);
//    }
//}
