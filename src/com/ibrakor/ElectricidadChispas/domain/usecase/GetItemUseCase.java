package com.ibrakor.ElectricidadChispas.domain.usecase;

import com.ibrakor.ElectricidadChispas.data.VendibleDataStore;
import com.ibrakor.ElectricidadChispas.domain.models.Vendible;

public class GetItemUseCase {
    private VendibleDataStore dataStore = VendibleDataStore.getInstance();

    public Vendible execute(Integer codVendible) {
        return dataStore.findById(codVendible);
    }
}
