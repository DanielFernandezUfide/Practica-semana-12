/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.semana.pkg12;

/**
 *
 * @author Laboratorio
 */
public class Robot {
    private int id;
    private String modelo;
    private int bateriaPorcentaje;
    private Funcion funcionRobot;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getBateriaPorcentaje() {
        return bateriaPorcentaje;
    }

    public void setBateriaPorcentaje(int bateriaPorcentaje) {
        this.bateriaPorcentaje = bateriaPorcentaje;
    }

    public Funcion getFuncionRobot() {
        return funcionRobot;
    }

    public void setFuncionRobot(Funcion funcionRobot) {
        this.funcionRobot = funcionRobot;
    }

    public Robot(int id, String modelo, int bateriaPorcentaje, Funcion funcionRobot) {
        this.id = id;
        this.modelo = modelo;
        this.bateriaPorcentaje = bateriaPorcentaje;
        this.funcionRobot = funcionRobot;
    }
    
    
}
