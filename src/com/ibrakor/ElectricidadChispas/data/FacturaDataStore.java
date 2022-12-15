package com.ibrakor.ElectricidadChispas.data;

import com.ibrakor.ElectricidadChispas.domain.models.HojaFactura;

import java.util.List;
import java.util.TreeMap;

public class FacturaDataStore {
    private static FacturaDataStore instance = null;

    private TreeMap<Integer, HojaFactura> dataStore = new TreeMap<>();

    public void guardar(HojaFactura hojaFactura) {
        dataStore.put(hojaFactura.getCodfactura(), hojaFactura);
    }

    public void eliminar(HojaFactura hojaFactura) {
        dataStore.remove(hojaFactura.getCodfactura());
    }

    public List<HojaFactura> getAll() {
        return dataStore.values().stream().toList();
    }

    public HojaFactura findById(Integer codigo) {
        return dataStore.get(codigo);
    }

    public static FacturaDataStore getInstance() {
        if (instance == null) {
            instance = new FacturaDataStore();
        }
        return instance;
    }
}
