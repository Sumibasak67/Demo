package com.qbent.book_manage.service;

import com.qbent.book_manage.dto.Customer;
import org.springframework.http.ResponseEntity;

public interface ICustomerService {

    ResponseEntity<?> createLead(Customer customer);
}
