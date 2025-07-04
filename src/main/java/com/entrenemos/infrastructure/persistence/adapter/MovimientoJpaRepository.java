package com.entrenemos.infrastructure.persistence.adapter;

import com.entrenemos.infrastructure.persistence.entity.MovimientoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MovimientoJpaRepository extends JpaRepository<MovimientoEntity, UUID> {
}
