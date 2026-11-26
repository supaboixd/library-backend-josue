package com.tecnm.merida.librarybackend.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PrestamoLibroPK implements Serializable {

    @Column(name = "id_prestamo")
    private Integer idPrestamo;

    @Column(name = "id_libro")
    private Integer idLibro;

    public Integer getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(Integer idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Integer getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Integer idLibro) {
        this.idLibro = idLibro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrestamoLibroPK that = (PrestamoLibroPK) o;
        return Objects.equals(idPrestamo, that.idPrestamo) && Objects.equals(idLibro, that.idLibro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPrestamo, idLibro);
    }
}