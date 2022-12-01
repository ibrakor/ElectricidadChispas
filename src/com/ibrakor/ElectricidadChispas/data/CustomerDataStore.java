package com.ibrakor.ElectricidadChispas.data;

import com.ibrakor.ElectricidadChispas.domain.models.Clientes;

import java.util.List;

public interface CustomerDataStore {
    void saveCustomer (Clientes cliente);
    void deleteCustomer (Clientes cliente);
    void updateCustomer (Clientes cliente);

    List <Clientes> getAllCustomers();
    Clientes findById (Integer codCliente);
}
