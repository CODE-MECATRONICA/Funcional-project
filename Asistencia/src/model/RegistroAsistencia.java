package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class RegistroAsistencia {

    private LocalDate fecha;
    private LocalTime entrada;
    private LocalTime salida;
    private EstadoAsistencia estado;

    public RegistroAsistencia() {
        this.fecha = LocalDate.now();
        this.estado = EstadoAsistencia.PENDIENTE;
    }

    public void registrarEntrada() {
        this.entrada = LocalTime.now();
        this.estado = EstadoAsistencia.ENTRADA_REGISTRADA;
    }

    public void registrarSalida() {
        this.salida = LocalTime.now();
        this.estado = EstadoAsistencia.COMPLETADA;
    }

    @Override
    public String toString() {
        return "Fecha: " + fecha +
                " | Entrada: " + entrada +
                " | Salida: " + salida +
                " | Estado: " + estado;
    }
}