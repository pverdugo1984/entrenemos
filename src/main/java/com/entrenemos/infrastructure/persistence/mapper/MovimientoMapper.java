package com.entrenemos.infrastructure.persistence.mapper;

import com.entrenemos.domain.model.Movimiento;
import com.entrenemos.infrastructure.persistence.entity.MovimientoEntity;

public class MovimientoMapper {

    public static MovimientoEntity toEntity(Movimiento movimiento){
        return new MovimientoEntity(
                movimiento.getId(),
                movimiento.getNombre(),
                movimiento.getDescripcion(),
                movimiento.getUrlVideo()
        );
    }

    public static Movimiento toDomain(MovimientoEntity entity){
        return new Movimiento(
                entity.getId(),
                entity.getNombre(),
                entity.getDescripcion(),
                entity.getVideoUrl()
        );
    }
}
