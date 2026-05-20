package app;

import service.AsistenciaService;
import utils.Menu;

public class App {
    public static void main(String[] args) {
        AsistenciaService service = new AsistenciaService();
        Menu menu = new Menu(service);
        menu.iniciar();
    }
}