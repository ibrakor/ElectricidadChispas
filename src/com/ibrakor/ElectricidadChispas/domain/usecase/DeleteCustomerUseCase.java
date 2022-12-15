package com.ibrakor.ElectricidadChispas.domain.usecase;

import com.ibrakor.ElectricidadChispas.domain.models.Clientes;

public class DeleteCustomerUseCase {
    private CustomerDataStore customerDataStore;

    public DeleteCustomerUseCase(CustomerDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }

    public void execute(Clientes cliente){
        customerDataStore.deleteCustomer(cliente);
    }
}
