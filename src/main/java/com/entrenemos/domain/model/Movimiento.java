package com.entrenemos.domain.model;

import java.util.Objects;
import java.util.UUID;

public class Movimiento {

    private final UUID id;
    private final String nombre;
    private final String descripcion;
    private final String urlVideo;

    public Movimiento(UUID id, String nombre, String descripcion, String urlVideo){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.urlVideo = urlVideo;
    }

    public UUID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movimiento that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getNombre(), that.getNombre()) && Objects.equals(getDescripcion(), that.getDescripcion()) && Objects.equals(getUrlVideo(), that.getUrlVideo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNombre(), getDescripcion(), getUrlVideo());
    }
}
