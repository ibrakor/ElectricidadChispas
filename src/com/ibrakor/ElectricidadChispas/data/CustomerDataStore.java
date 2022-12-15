package com.ibrakor.ElectricidadChispas.data;

import com.ibrakor.ElectricidadChispas.domain.models.Clientes;

import java.util.List;
import java.util.TreeMap;

public class CustomerDataStore {
    private static CustomerDataStore instance = null;
    private TreeMap<String, Clientes> dataStore = new TreeMap<>();

    public void save(Clientes clientes){
        dataStore.put(clientes.getCodcliente(), clientes);
    }
    public void delete(Clientes clientes){
        dataStore.remove(clientes.getCodcliente(), clientes);
    }
    public List<Clientes> getAll() {
        return dataStore.values().stream().toList();
    }

    public Clientes findById(String codigo) {
        return dataStore.get(codigo);
    }

    public static CustomerDataStore getInstance() {
        if (instance == null) {
            instance = new CustomerDataStore();

        }
        return instance;
    }
}
