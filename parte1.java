/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel Rosales
 */
public class NewClass {
    import java.util.logging.Level;
import java.util.logging.Logger;

public class Tema1App {

    private static final Logger logger = Logger.getLogger(Tema1App.class.getName());

    public static void main(String[] args) {
        logger.log(Level.INFO, "Programa iniciado...");

        mostrarInstrucciones();
    }
}
