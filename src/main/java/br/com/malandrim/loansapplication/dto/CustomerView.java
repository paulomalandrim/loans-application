package br.com.malandrim.loansapplication.dto;

import br.com.malandrim.loansapplication.entity.Customer;
import br.com.malandrim.loansapplication.entity.Loan;

import java.util.List;

public record CustomerView(
        String customer,
        List<Loan> loans
) {

}
