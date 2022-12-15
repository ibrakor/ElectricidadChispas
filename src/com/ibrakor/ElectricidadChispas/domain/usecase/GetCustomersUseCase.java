package com.ibrakor.ElectricidadChispas.domain.usecase;

import com.ibrakor.ElectricidadChispas.data.CustomerDataStore;
import com.ibrakor.ElectricidadChispas.domain.models.Cliente;

import java.util.List;

public class GetCustomersUseCase {
    private CustomerDataStore dataStore = CustomerDataStore.getInstance();

    public List<Cliente> execute() {
        return dataStore.getAll();
    }
}
