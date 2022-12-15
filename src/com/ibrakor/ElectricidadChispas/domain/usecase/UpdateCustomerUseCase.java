package com.ibrakor.ElectricidadChispas.domain.usecase;

import com.ibrakor.ElectricidadChispas.data.CustomerDataStore;
import com.ibrakor.ElectricidadChispas.domain.models.Clientes;

public class UpdateCustomerUseCase {
    private CustomerDataStore dataStore = CustomerDataStore.getInstance();

    public void execute(Clientes clientes) {
        dataStore.save(clientes);

    }
}
