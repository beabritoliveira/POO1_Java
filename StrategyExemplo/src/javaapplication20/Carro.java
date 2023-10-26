/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication20;

/**
 *
 * @author beatr
 */
public class Carro implements LocomocaoStrategy{
    private int km;

    public Carro(int km) {
        this.km = km;
    }

    @Override
    public int distanciaPercorrer() {
        int time;
        time = (km *3)/ 4; //Supondo que a media das vias é 80km/h
        // Resposta em minutos
        return time;
    }
    
}
