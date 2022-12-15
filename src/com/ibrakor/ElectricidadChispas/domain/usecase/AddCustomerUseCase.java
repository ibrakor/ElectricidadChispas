package com.ibrakor.ElectricidadChispas.domain.usecase;

import com.ibrakor.ElectricidadChispas.domain.models.Clientes;
import com.ibrakor.ElectricidadChispas.data.CustomerDataStore;
import com.ibrakor.ElectricidadChispas.data.MemCustomerDataStore;

public class AddCustomerUseCase {
    private CustomerDataStore customerDataStore = new MemCustomerDataStore();

    public void execute(Clientes cliente) {
        customerDataStore.saveCustomer(cliente);
    }
}
