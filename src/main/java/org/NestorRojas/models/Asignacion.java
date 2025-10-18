package org.NestorRojas.models;

import org.NestorRojas.utils.CalculadroFechas;
import java.time.LocalDate;

public class Aignacion {
    private String nombreTecnico;
    private LocalDate fechaAsignacion;
    private LocalDate fechaDevolucionEsperada;

    public Asignacion (String nombreTecnico){
        this.nombreTecnico = nombreTecnico;
        this.fechaAsignacion = CalculadroFechas.obtenerFechaActual();
        this.fechaDevolucionEsperada = CalculadroFechas.agregarDias(fechaAsignacion, 5);
    }

    public String getNombreTecnico() {
        return nombreTecnico;
    }
    public LocalDate getFechaAsignacion() {
        return fechaAsignacion;
    }
    public LocalDate getFechaDevolucionEsperada() {
        return fechaDevolucionEsperada;
    }

    @Override
    public String toString(){
        return "Asignacion a: " + nombreTecnico +
        "\nFecha Asignacion: " + fechaAsignacion +
        "\nFecha Devolucion: " + fechaDevolucionEsperada;"
    }

}
