package com.entrenemos.application.service;

import com.entrenemos.domain.model.Movimiento;
import com.entrenemos.domain.port.in.CrearMovimientoUseCase;
import com.entrenemos.domain.port.out.MovimientoRepository;

import java.util.UUID;

public class CrearMovimientoService implements CrearMovimientoUseCase {

    private final MovimientoRepository movimientoRepository;

    public CrearMovimientoService(MovimientoRepository movimientoRepository){
        this.movimientoRepository = movimientoRepository;
    }

    @Override
    public Movimiento crearMovimiento(String nombre, String descripcion, String videoUrl) {
        Movimiento movimiento = new Movimiento(UUID.randomUUID(), nombre, descripcion,videoUrl);
        return movimientoRepository.guardar(movimiento);
    }
}
