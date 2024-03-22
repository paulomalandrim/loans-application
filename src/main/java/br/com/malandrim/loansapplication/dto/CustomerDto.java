package br.com.malandrim.loansapplication.dto;

import br.com.malandrim.loansapplication.entity.Customer;

public record CustomerDto(int age, String cpf, String name, Double income, String location) {
    public Customer toCustomer(){
        return new Customer(this.age,
                            this.cpf,
                            this.name,
                            this.income,
                            this.location);
    }
}
