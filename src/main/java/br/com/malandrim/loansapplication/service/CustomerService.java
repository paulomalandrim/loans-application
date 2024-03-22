package br.com.malandrim.loansapplication.service;

import br.com.malandrim.loansapplication.entity.Customer;
import br.com.malandrim.loansapplication.entity.Loan;
import br.com.malandrim.loansapplication.enummarator.LoanType;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Service
public class CustomerService {

    public List<Loan> getLoans(Customer customer){
        List<Loan> loans = new ArrayList<>();

        if (customer.income() <= 3000){
            Loan loan = new Loan(LoanType.PERSONAL);
            if (! loans.contains(loan)){
                loans.add(loan);
            }
        }

        if (customer.income() > 3000 && customer.income() < 5000 &&
            customer.age() < 30 && customer.location().equals("SP")) {
            Loan loan = new Loan(LoanType.PERSONAL);
            if (! loans.contains(loan)){
                loans.add(loan);
            }
        }

        if (customer.income() >= 5000){
            Loan loan = new Loan(LoanType.CONSIGNMENT);
            if (!loans.contains(loan)){
                loans.add(loan);
            }
        }

        if (customer.income() <= 3000){
            Loan loan = new Loan(LoanType.GUARANTEED);
            if (!loans.contains(loan)){
                loans.add(loan);
            }
        }

        if (customer.income() > 3000 && customer.income() < 5000 &&
                customer.age() < 30 && customer.location().equals("SP")) {
            Loan loan = new Loan(LoanType.GUARANTEED);
            if (!loans.contains(loan)){
                loans.add(loan);
            }
        }

        return loans;
    }
}
