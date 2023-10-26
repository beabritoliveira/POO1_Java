/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication20;

/**
 *
 * @author beatr
 */
public class Bicicleta implements LocomocaoStrategy{
    private int km;

    public Bicicleta(int km) {
        this.km = km;
    }

    @Override
    public int distanciaPercorrer() {
        int time;
        time = km * 6; 
        return time;    
    }
    
}
