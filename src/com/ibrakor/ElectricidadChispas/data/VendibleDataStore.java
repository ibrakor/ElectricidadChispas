package com.ibrakor.ElectricidadChispas.data;

import com.ibrakor.ElectricidadChispas.domain.models.Vendible;

import java.util.List;
import java.util.TreeMap;

public class VendibleDataStore {
    private static VendibleDataStore instance = null;

    private TreeMap<Integer, Vendible> dataStore = new TreeMap<>();

    public void save(Vendible vendible) {
        dataStore.put(vendible.getCodproducto(), vendible);
    }

    public void delete(Vendible vendible) {
        dataStore.remove(vendible.getCodproducto());
    }

    public List<Vendible> getAll() {
        return dataStore.values().stream().toList();
    }

    public Vendible findById(Integer codigo) {
        return dataStore.get(codigo);
    }

    public static VendibleDataStore getInstance() {
        if (instance == null) {
            instance = new VendibleDataStore();
        }
        return instance;
    }
}

