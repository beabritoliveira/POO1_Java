/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication20;

import java.util.Scanner;

public class Transporte{
    private static CaclculadoraDistancia calc = new CaclculadoraDistancia();
    private static LocomocaoStrategy strategy;
    
    public static void main(String[] args) {
        boolean StartRota = false;
        int opcao = 0;
        Scanner l1 = new Scanner(System.in);
        
        System.out.println("Insira a quilometragem percorrida: ");
        int KM = l1.nextInt();
        
        while(StartRota == false){
        do{
            System.out.println("\nForma de transporte: " + "\n" + 
                                "1- Carro" + "\n" +
                                "2- Onibus" + "\n" +
                                "3- Bicicleta" + "\n" +
                                "4- Caminhada");
            opcao = l1.nextInt();
        }while(opcao < 1 || opcao > 4); 
        
        switch(opcao){
            case 1 ->  {
                strategy = new Carro(KM);
                break;
            }
            case 2 ->{
                strategy = new Onibus(KM);
                break;
            }
            case 3 -> {
                strategy = new Bicicleta(KM);
                break;
            }
            case 4 ->{
                strategy = new Caminhando(KM);
                break;
            }
           }
        System.out.println("\n"+calc.calcular(strategy) + " minutos");
        System.out.println("\nDeseja analisar outra opcao de transporte? \n"
                            + "1- Sim \n"
                            + "2- Nao");
            int n = l1.nextInt();
            if (n == 1)
                StartRota = false;
            else
                StartRota = true;
        }
    }
}
