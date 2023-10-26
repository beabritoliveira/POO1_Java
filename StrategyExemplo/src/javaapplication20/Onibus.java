/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication20;

/**
 *
 * @author beatr
 */
public class Onibus implements LocomocaoStrategy{
    private int km;

    public Onibus(int km) {
        this.km = km;
    }

    @Override
    public int distanciaPercorrer() {
       int time;
        time = 3*km; //Supondo que a media dos onibus é 20km/h
        // Resposta em minutos
        return time;
    }
    
}
