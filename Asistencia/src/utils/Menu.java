package utils;

import exceptions.EstudianteException;
import model.Estudiante;
import service.AsistenciaService;

import java.util.Scanner;

public class Menu {

    private Scanner scanner;
    private AsistenciaService service;

    public Menu(AsistenciaService service) {
        this.service = service;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {

        int opcion;

        do {
            System.out.println("\n===== SISTEMA DE ASISTENCIA =====");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Registrar entrada");
            System.out.println("3. Registrar salida");
            System.out.println("4. Mostrar estudiante");
            System.out.println("5. Salir");

            opcion = Validador.leerEntero(scanner);

            try {
                switch (opcion) {
                    case 1 -> registrar();
                    case 2 -> entrada();
                    case 3 -> salida();
                    case 4 -> mostrar();
                    case 5 -> System.out.println("Sistema finalizado.");
                    default -> System.out.println("Opción inválida.");
                }
            } catch (Exception e) {
                System.out.println("Error controlado: " + e.getMessage());
            }

        } while (opcion != 5);
    }

    private void registrar() throws EstudianteException {
        System.out.print("Cédula: ");
        String cedula = scanner.nextLine();

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Carrera: ");
        String carrera = scanner.nextLine();

        System.out.print("Hora entrada: ");
        String entrada = scanner.nextLine();

        System.out.print("Hora salida: ");
        String salida = scanner.nextLine();

        service.registrarEstudiante(
                cedula, nombre, carrera, entrada, salida
        );
    }

    private void entrada() throws EstudianteException {
        System.out.print("Cédula: ");
        String cedula = scanner.nextLine();

        Estudiante e = service.buscar(cedula);
        e.registrarEntrada();
    }

    private void salida() throws EstudianteException {
        System.out.print("Cédula: ");
        String cedula = scanner.nextLine();

        Estudiante e = service.buscar(cedula);
        e.registrarSalida();
    }

    private void mostrar() throws EstudianteException {
        System.out.print("Cédula: ");
        String cedula = scanner.nextLine();

        Estudiante e = service.buscar(cedula);
        e.mostrarInformacion();
        e.mostrarHistorial();
    }
}