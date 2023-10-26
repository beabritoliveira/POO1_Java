/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoPoo;

/**
 *
 * @author beatr
 */
/** Classe que herdar as caracteristicas de Personagens 
    *E cria novos metodos abstractos que serão herdados por outras classes
    * Fazendo que quem herde Pessoa também herde personagem
*/
public abstract class Pessoa extends Personagem{
    
    /** Método que serão sobescritos em cada classe que herdar suas caracteristicas */
    abstract String falar();
    abstract int correr(int AS, int num1, int num2);
}
