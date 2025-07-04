package com.entrenemos.infrastructure.persistence.adapter;

import com.entrenemos.domain.model.Movimiento;
import com.entrenemos.domain.port.out.MovimientoRepository;
import com.entrenemos.infrastructure.persistence.mapper.MovimientoMapper;
import com.entrenemos.infrastructure.persistence.entity.MovimientoEntity;
import org.springframework.stereotype.Repository;

@Repository
public class MovimientoJpaAdapter implements MovimientoRepository {

    private final MovimientoJpaRepository jpaRepository;

    public MovimientoJpaAdapter(MovimientoJpaRepository jpaRepository){
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Movimiento guardar(Movimiento movimiento) {
        MovimientoEntity entity = MovimientoMapper.toEntity(movimiento);
        MovimientoEntity guardado = jpaRepository.save(entity);
        return MovimientoMapper.toDomain(guardado);
    }
}
