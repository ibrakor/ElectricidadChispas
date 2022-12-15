package com.ibrakor.ElectricidadChispas.domain.usecase;

import com.ibrakor.ElectricidadChispas.data.FacturaDataStore;
import com.ibrakor.ElectricidadChispas.domain.models.HojaFactura;

public class AddFacturaUseCase {
    private FacturaDataStore dataStore = FacturaDataStore.getInstance();

    public void execute(HojaFactura hojaFactura) {
        dataStore.guardar(hojaFactura);
    }
}
