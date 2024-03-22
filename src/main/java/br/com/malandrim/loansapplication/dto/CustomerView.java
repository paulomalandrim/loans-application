package br.com.malandrim.loansapplication.dto;

import br.com.malandrim.loansapplication.entity.Loan;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class CustomerView{
        private String customer;
        private List<Loan> loans;
}
