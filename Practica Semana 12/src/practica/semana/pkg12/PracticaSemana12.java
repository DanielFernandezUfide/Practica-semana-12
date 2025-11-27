/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.semana.pkg12;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class PracticaSemana12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String letras = "QWERTYUIOPASDFGHJKLZXCVBNM";
        GrupoRobots grupoRobots = new GrupoRobots(10);
        /*
        for (int i = 0; i < 10; i++) {
            int id = (int)(Math.random() * (10 - 1 + 1) + 1);
            int letraModelo = (int)(Math.random() * (25 - 0 + 1) + 0);
            int numeroModelo = (int)(Math.random() * (9 - 1 + 1) + 1);
            String modelo = "Omega-";
            modelo += letras.charAt(letraModelo);
            modelo += numeroModelo;
            JOptionPane.showMessageDialog(null, modelo);
            int bateria = (int)(Math.random() * (90 - 5 + 1) + 5);
            Robot robot = new Robot(id, modelo, bateria, Funcion.obtenerAleatorio() );
            
        }
        */
    }
    
}
