package com.ibrakor.data;

import com.ibrakor.ElectricidadChispas.Clientes;

import java.util.List;
import java.util.TreeMap;

public class MemCustomerDataStore implements CustomerDataStore{
    private  TreeMap<String, Clientes> dataStore = new TreeMap<String, Clientes>();

    @Override
    public void saveCustomer(Clientes cliente) {
        dataStore.put(cliente.getCodcliente(), cliente);

    }

    @Override
    public void deleteCustomer(Clientes cliente) {
        dataStore.remove(cliente);

    }

    @Override
    public void updateCustomer(Clientes cliente) {
        dataStore.replace(cliente.getCodcliente(), cliente);

    }

    @Override
    public List<Clientes> getAllCustomers() {
        return dataStore.values().stream().toList();
    }

    @Override
    public Clientes findById(Integer codCliente) {
        return null;
    }
}
