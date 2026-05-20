package model;

public class Horario {

    private String horaEntrada;
    private String horaSalida;

    public Horario(String horaEntrada, String horaSalida) {
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    @Override
    public String toString() {
        return "Entrada: " + horaEntrada +
                " | Salida: " + horaSalida;
    }
}