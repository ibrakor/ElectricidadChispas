package com.ibrakor.ElectricidadChispas.domain.usecase;

import com.ibrakor.ElectricidadChispas.data.VendibleDataStore;
import com.ibrakor.ElectricidadChispas.domain.models.Vendible;

public class UpdateItemUseCase {
    private VendibleDataStore dataStore = VendibleDataStore.getInstance();

    public void execute(Vendible vendible) {
        dataStore.save(vendible);
    }
}
