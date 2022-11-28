package com.ibrakor.data;

import com.ibrakor.ElectricidadChispas.Clientes;

import java.util.List;

public interface CustomerDataStore {
    void saveCustomer (Clientes cliente);
    void deleteCustomer (Clientes cliente);
    void updateCustomer (Clientes cliente);

    List <Clientes> getAllCustomers();
    Clientes findById (Integer codCliente);
}
