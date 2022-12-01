package com.ibrakor.ElectricidadChispas.domain.usecase;

import com.ibrakor.ElectricidadChispas.data.CustomerDataStore;
import com.ibrakor.ElectricidadChispas.data.MemCustomerDataStore;
import com.ibrakor.ElectricidadChispas.domain.models.Clientes;

import java.util.List;

public class GetCustomerUseCase {
    public List<Clientes> execute(){
        CustomerDataStore customerDataStore = new MemCustomerDataStore();
        return  customerDataStore.getAllCustomers();
        public List<Clientes> execute() {
            return customerDataStore.getAllCustomers();

        }
    }
}

