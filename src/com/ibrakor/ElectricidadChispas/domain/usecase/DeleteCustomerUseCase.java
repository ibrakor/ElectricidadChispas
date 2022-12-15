package com.ibrakor.ElectricidadChispas.domain.usecase;

import com.ibrakor.ElectricidadChispas.data.CustomerDataStore;
import com.ibrakor.ElectricidadChispas.domain.models.Cliente;

public class DeleteCustomerUseCase {
    private CustomerDataStore dataStore = CustomerDataStore.getInstance();

    public void execute(Cliente cliente) {
        dataStore.delete(cliente);
    }
}
