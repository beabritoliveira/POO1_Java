/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication20;

/**
 *
 * @author beatr
 */
public class Caminhando implements LocomocaoStrategy{
    private int km;

    public Caminhando(int km) {
        this.km = km;
    }

    @Override
    public int distanciaPercorrer() {
        int time;
        time = km * 11;
        // Resposta em minutos
        return time;
    }
    
}
