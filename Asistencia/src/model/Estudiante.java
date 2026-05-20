package model;

import interfaces.Registrable;
import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona implements Registrable {

    private String carrera;
    private Horario horario;
    private List<RegistroAsistencia> historial;

    public Estudiante(String cedula, String nombre,
                      String carrera, Horario horario) {
        super(cedula, nombre);
        this.carrera = carrera;
        this.horario = horario;
        this.historial = new ArrayList<>();
    }

    @Override
    public void registrarEntrada() {
        RegistroAsistencia nuevo = new RegistroAsistencia();
        nuevo.registrarEntrada();
        historial.add(nuevo);
        System.out.println("Entrada registrada correctamente.");
    }

    @Override
    public void registrarSalida() {
        if (historial.isEmpty()) {
            System.out.println("Primero debe registrar entrada.");
            return;
        }

        RegistroAsistencia ultimo = historial.get(historial.size() - 1);
        ultimo.registrarSalida();

        System.out.println("Salida registrada correctamente.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\n===== ESTUDIANTE =====");
        System.out.println("Cédula: " + getCedula());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Carrera: " + carrera);
        System.out.println("Horario: " + horario);
        System.out.println("Total asistencias: " + historial.size());
    }

    public void mostrarHistorial() {
        for (RegistroAsistencia r : historial) {
            System.out.println(r);
        }
    }
}