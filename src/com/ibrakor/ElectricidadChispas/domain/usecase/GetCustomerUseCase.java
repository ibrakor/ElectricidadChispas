package com.ibrakor.ElectricidadChispas.domain.usecase;

import com.ibrakor.ElectricidadChispas.data.CustomerDataStore;
import com.ibrakor.ElectricidadChispas.data.MemCustomerDataStore;
import com.ibrakor.ElectricidadChispas.domain.models.Clientes;

import java.util.List;

public class GetCustomerUseCase {

    private CustomerDataStore customerDataStore;

    public GetCustomerUseCase(CustomerDataStore customerDataStore) {
        this.customerDataStore = customerDataStore;
    }

    public List<Clientes> execute() {
        return customerDataStore.getAllCustomers();
    }

}




