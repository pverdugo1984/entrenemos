package com.entrenemos.domain.port.in;

import com.entrenemos.domain.model.Movimiento;

public interface CrearMovimientoUseCase {
    Movimiento crearMovimiento(String nombre, String descripcion, String videoUrl);
}
