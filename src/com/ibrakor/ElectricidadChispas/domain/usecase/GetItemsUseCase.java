package com.ibrakor.ElectricidadChispas.domain.usecase;

import com.ibrakor.ElectricidadChispas.data.VendibleDataStore;
import com.ibrakor.ElectricidadChispas.domain.models.Vendible;

import java.util.List;

public class GetItemsUseCase {
    private VendibleDataStore dataStore = VendibleDataStore.getInstance();

    public List<Vendible> execute() {
        return dataStore.getAll();
    }
}
