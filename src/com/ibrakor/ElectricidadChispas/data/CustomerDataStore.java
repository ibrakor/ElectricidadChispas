package com.ibrakor.ElectricidadChispas.data;

import com.ibrakor.ElectricidadChispas.domain.models.Cliente;

import java.util.List;
import java.util.TreeMap;

public class CustomerDataStore {
    private static CustomerDataStore instance = null;
    private TreeMap<String, Cliente> dataStore = new TreeMap<>();

    public void save(Cliente cliente){
        dataStore.put(cliente.getCodcliente(), cliente);
    }
    public void delete(Cliente cliente){
        dataStore.remove(cliente.getCodcliente(), cliente);
    }
    public List<Cliente> getAll() {
        return dataStore.values().stream().toList();
    }

    public Cliente findById(String codigo) {
        return dataStore.get(codigo);
    }

    public static CustomerDataStore getInstance() {
        if (instance == null) {
            instance = new CustomerDataStore();

        }
        return instance;
    }
}
