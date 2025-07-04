package com.entrenemos.infrastructure.web.controller;

import com.entrenemos.domain.model.Movimiento;
import com.entrenemos.domain.port.in.CrearMovimientoUseCase;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movimientos")
public class MovimientoController {

    private final CrearMovimientoUseCase crearMovimientoUseCase;

    public MovimientoController(CrearMovimientoUseCase crearMovimientoUseCase){
        this.crearMovimientoUseCase = crearMovimientoUseCase;
    }

    @PostMapping
    public Movimiento crearMovimiento(@RequestBody CrearMovimientoRequest request){
        return crearMovimientoUseCase.crearMovimiento(
                request.nombre(),
                request.descripcion(),
                request.videoUrl()
        );
    }

    public record CrearMovimientoRequest(String nombre, String descripcion, String videoUrl){}
}
