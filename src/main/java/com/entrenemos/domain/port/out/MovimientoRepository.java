package com.entrenemos.domain.port.out;

import com.entrenemos.domain.model.Movimiento;

public interface MovimientoRepository {
    Movimiento guardar(Movimiento movimiento);
}
