package service;

import exceptions.EstudianteException;
import model.Estudiante;
import model.Horario;

import java.util.HashMap;
import java.util.Map;

public class AsistenciaService {

    private Map<String, Estudiante> estudiantes;

    public AsistenciaService() {
        estudiantes = new HashMap<>();
    }

    public void registrarEstudiante(String cedula,
                                    String nombre,
                                    String carrera,
                                    String entrada,
                                    String salida)
            throws EstudianteException {

        if (estudiantes.containsKey(cedula)) {
            throw new EstudianteException(
                    "Ya existe un estudiante con esa cédula."
            );
        }

        Horario horario = new Horario(entrada, salida);

        Estudiante estudiante = new Estudiante(
                cedula,
                nombre,
                carrera,
                horario
        );

        estudiantes.put(cedula, estudiante);

        System.out.println("Estudiante registrado exitosamente.");
    }

    public Estudiante buscar(String cedula)
            throws EstudianteException {

        if (!estudiantes.containsKey(cedula)) {
            throw new EstudianteException(
                    "Estudiante no encontrado."
            );
        }

        return estudiantes.get(cedula);
    }
}