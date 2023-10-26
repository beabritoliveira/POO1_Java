/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoPoo;

//import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author alunolab08
 */

/** Classe que herda as caracteristicas da classe Pessoa, e essa herda de Personagem*/
public class General extends Pessoa{
    /** declaração de variáveis*/
    String armamento, fEfeito;
    
    /** Instanciação das imagens para interface */
    Icon ic2 = new ImageIcon("general.png");
        
    /** Método para mostrar um esboço de como o jogador do usuario é antes de carregar a imagem do se personagem na interface */  
    @Override
    void desenhar() {
        System.out.println("DESENHANDO: GENERAL");
        System.out.println("                   .:^~^:..             ");
        System.out.println("                 :7JYYJ!JY!.            ");
        System.out.println("              ..^~7777~7JY7:            ");
        System.out.println("          .::7YYJ?7~??YJY?!^            ");
        System.out.println("         ~7J?7?!:.^~PPPPP?^:            ");
        System.out.println("       :7?JJ?7:    .!JYY?~              ");
        System.out.println("     .!JYYJ?!~!7~:~?~7??!!?~..:.        ");
        System.out.println("    :?YYYY?7!JYJ?!?J!P5JY!Y?~!YY?:      ");
        System.out.println("   .7YYYYJJJYJJJJ77!?7~^~7?!?J???7:     ");
        System.out.println("    :7JJJJYYYYJJJY?!77~^~??!?J!JJJ~     ");
        System.out.println("      .:^^^~~!J?7J?7!7!~77!7??777J!     ");
        System.out.println("              !?7?777J~!7?77?7?!?J7.    ");
        System.out.println("              ^?77777?~?JJ?!?!?!?J7:    ");
        System.out.println("              :??777??~????7?7?!?J?^    ");
        System.out.println("              .7?7J!??~????????!7??^    ");
        System.out.println("              :7??????~????????7!?J!    ");
        System.out.println("              ^7??????!~7?????7!~77!.   ");
        System.out.println("              .~~~!!!!~^~~~~~~^^7YY!.   ");
        System.out.println("              ..................^~^.    ");
      }
    
    /** Método para que o usuario possa digitar uma frase de efeito que aparecera em todas as vezes que for a vez do jogador jogar*/ 
    @Override
    String falar(){
        fEfeito = JOptionPane.showInputDialog (null , "Digite a frase de efeito do General: ", "Frase General" , JOptionPane.QUESTION_MESSAGE, ic2, null, null).toString();
        return fEfeito;
    }
    
    /** Método para guardar a arma do soldado*/
    @Override
    String arma() {
        return armamento;
    }
    
    /** Método para setar a arma */
    @Override
    void setArma(String armamento) {
        this.armamento = armamento;
    }    
    
    /** Método que define o quão rapido jogador vai correr em certo tempo que depois sera utilizado em um dos niveis do jogo como função essencial*/
    @Override
    int correr(int AS,int num1, int num2) {
       int T = Game.aleatorio(((num1+3)), (num2)) / 10;
       int V = AS * T;
       int A = V * T;
       return A;
    }
    
    /** Método que quantifica a habilidade do jogador*/
    @Override
    int habilidadeNO() {
        int h = 6;
       return h;
    }

}
