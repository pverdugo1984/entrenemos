package com.entrenemos.infrastructure.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "movimientos")
public class MovimientoEntity {
    @Id
    private UUID id;
    private String nombre;
    private String descripcion;
    private String videoUrl;

    public MovimientoEntity() {
    }

    public MovimientoEntity(UUID id, String nombre, String descripcion, String videoUrl) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.videoUrl = videoUrl;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
