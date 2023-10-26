/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoPoo;

/**
 *
 * @author alunolab08
 */
public abstract class Personagem {
    
    Arma_IF arma;
    
    /** Método que serão sobescritos em cada classe que herdar suas caracteristicas */
    abstract void desenhar();
    abstract String arma();
    abstract void setArma(String armamento);
    abstract int habilidadeNO();
}
