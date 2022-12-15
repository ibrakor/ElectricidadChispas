package com.ibrakor.ElectricidadChispas.domain.usecase;

import com.ibrakor.ElectricidadChispas.data.CustomerDataStore;
import com.ibrakor.ElectricidadChispas.domain.models.Cliente;

import java.util.List;

public class GetCustomerUseCase {

    private CustomerDataStore dataStore = CustomerDataStore.getInstance();

    public Cliente execute(String codigo){
        return dataStore.findById(codigo);
    }
}




