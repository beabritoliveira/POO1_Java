/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoPoo;

/**
 *
 * @author alunolab08
 */
public class Faca implements Arma_IF{
    /**declaração de variaveis */
    int desm;
    
    /** @return
     * Método que atribui um valor aleatório para o poder da arma  de 1 a 10 que sera utilizado em um dos niveis do jogo*/
    @Override
    public int usarArma() {
        desm = Game.aleatorio(1, 11);
        return desm;
    }

}
