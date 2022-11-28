package com.ibrakor.domain;

import com.ibrakor.ElectricidadChispas.Clientes;
import com.ibrakor.data.CustomerDataStore;
import com.ibrakor.data.MemCustomerDataStore;

public class AddCustomerUseCase {
    public void execute(Clientes cliente) {
        CustomerDataStore customerDataStore = new MemCustomerDataStore();
        customerDataStore.saveCustomer(cliente);
    }
}
