/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.semana.pkg12;
import java.util.Random;
/**
 *
 * @author Laboratorio
 */
public enum Funcion {
    construccion, vigilancia, asistencia,exploracion;
    
    // Método estático para obtener uno al azar
    public static Funcion obtenerAleatorio() {
        Funcion[] estados = values();
        return estados[new Random().nextInt(estados.length)];
    }
            
}
