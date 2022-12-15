package com.ibrakor.ElectricidadChispas.domain.usecase;

import com.ibrakor.ElectricidadChispas.data.FacturaDataStore;
import com.ibrakor.ElectricidadChispas.domain.models.HojaFactura;

public class GetFacturaUseCase {
    private FacturaDataStore dataStore = FacturaDataStore.getInstance();

    public HojaFactura execute(Integer codFactura) {
        return dataStore.findById(codFactura);
    }
}
