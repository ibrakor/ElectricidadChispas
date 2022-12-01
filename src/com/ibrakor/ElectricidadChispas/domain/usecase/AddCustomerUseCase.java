package com.ibrakor.ElectricidadChispas.domain.usecase;

import com.ibrakor.ElectricidadChispas.domain.models.Clientes;
import com.ibrakor.ElectricidadChispas.data.CustomerDataStore;
import com.ibrakor.ElectricidadChispas.data.MemCustomerDataStore;

public class AddCustomerUseCase {
    public void execute(Clientes cliente) {
        CustomerDataStore customerDataStore = new MemCustomerDataStore();
        customerDataStore.saveCustomer(cliente);

    }
}
