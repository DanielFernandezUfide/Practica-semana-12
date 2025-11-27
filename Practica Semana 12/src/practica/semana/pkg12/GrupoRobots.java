/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.semana.pkg12;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class GrupoRobots {
    private Robot[] robot;

   public GrupoRobots(int cantidad) {
        this.robot = new Robot[cantidad];
    }
     
   public void asignarRobots(){
      String letras = "QWERTYUIOPASDFGHJKLZXCVBNM";
       for (int i = 0; i < 10; i++) {
            int id = (int)(Math.random() * (10 - 1 + 1) + 1);
            int letraModelo = (int)(Math.random() * (25 - 0 + 1) + 0);
            int numeroModelo = (int)(Math.random() * (9 - 1 + 1) + 1);
            String modelo = "Omega-";
            modelo += letras.charAt(letraModelo);
            modelo += numeroModelo;
            JOptionPane.showMessageDialog(null, modelo);
            int bateria = (int)(Math.random() * (90 - 5 + 1) + 5);
            Robot instanciaRobot = new Robot(id, modelo, bateria, Funcion.obtenerAleatorio() );
            this.robot[i] = instanciaRobot;
   }
}
