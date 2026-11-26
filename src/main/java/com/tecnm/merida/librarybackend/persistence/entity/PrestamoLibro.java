package com.tecnm.merida.librarybackend.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "prestamos_libros")
public class PrestamoLibro {

    @EmbeddedId
    private PrestamoLibroPK id;

    private Integer cantidad;

    @Column(name = "dias_prestamo")
    private Integer diasPrestamo;

    private Boolean estado;

    @ManyToOne
    @MapsId("idPrestamo")
    @JoinColumn(name = "id_prestamo", insertable = false, updatable = false)
    private Prestamo prestamo;

    @ManyToOne
    @JoinColumn(name = "id_libro", insertable = false, updatable = false)
    private Libro libro;

    public PrestamoLibroPK getId() {
        return id;
    }

    public void setId(PrestamoLibroPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getDiasPrestamo() {
        return diasPrestamo;
    }

    public void setDiasPrestamo(Integer diasPrestamo) {
        this.diasPrestamo = diasPrestamo;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
}