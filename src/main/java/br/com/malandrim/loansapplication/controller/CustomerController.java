package br.com.malandrim.loansapplication.controller;

import br.com.malandrim.loansapplication.dto.CustomerDto;
import br.com.malandrim.loansapplication.dto.CustomerView;
import br.com.malandrim.loansapplication.entity.Customer;
import br.com.malandrim.loansapplication.entity.Loan;
import br.com.malandrim.loansapplication.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer-loans")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping
    public ResponseEntity<CustomerView> getCustomerLoans(
            @RequestBody CustomerDto customerDto
            ){
        Customer customer = customerDto.toCustomer();
        List<Loan> loans = customerService.getLoans(customer);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(new CustomerView(customer.name(), loans));
    }
}
