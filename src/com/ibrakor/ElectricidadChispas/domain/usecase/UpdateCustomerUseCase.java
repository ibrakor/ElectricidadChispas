package com.ibrakor.ElectricidadChispas.domain.usecase;

import com.ibrakor.ElectricidadChispas.domain.models.Clientes;

public class UpdateCustomerUseCase {
    private CustomerDataStore customerDataStore;

    public UpdateCustomerUseCase(CustomerDataStore customerDataStore) {
        this.customerDataStore = customerDataStore;
    }

    public void execute(Clientes cliente) {
        customerDataStore.updateCustomer(cliente);
    }
}
