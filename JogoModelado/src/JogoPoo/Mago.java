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
public class Mago extends Pessoa{
    /** declaração de variáveis*/
    String armamento;
    String fEfeito;
    
    /** Instanciação das imagens para interface */
    Icon ic1 = new ImageIcon("mago.png");

    /** Método para mostrar um esboço de como o jogador do usuario é antes de carregar a imagem do se personagem na interface */
    @Override //IMAGEM ASCII
    void desenhar() {
    System.out.println("DESENHANDO MAGO: ");
    System.out.println("                   ..                   ");
    System.out.println("               .~77^.        ^ ^.       ");
    System.out.println("              .J55~         ^.~:^.      ");
    System.out.println("              ~!Y57.       .! !.~:      ");
    System.out.println("             ^^~!!~~:      .!???7.      ");
    System.out.println("       .:~!?JJJJJJJJJJ?7~:.  ~?!.       ");
    System.out.println("    .^~!7?????????????????7!.^5!        ");
    System.out.println("         :J.7?^7:YY^Y~^Y.     !.        ");
    System.out.println("      .. :7.YB5~:Y5P#?:7. ..  J.        ");
    System.out.println("      ^?JYJ.J~7JJ?J!?7:YYY?^  J^        ");
    System.out.println("       .~JY:::#GY5#P.:~PJ~    Y!        ");
    System.out.println("          ^.Y#@@@@@@#?:^      J.        ");
    System.out.println("      .:~!! P@@@@@@@@J.!!~:.  J.        ");
    System.out.println("   .~7?JJJY^!&@@@@@@#^~?JYJJ7.J.        ");
    System.out.println("   7?JJJJJJJ~~B@@@@G^~?JJJJY?.7.        ");
    System.out.println("  .!!7??J?7??::5@@J.^77?77?!.!?7.       ");
    System.out.println("    ^!!?5J77:~P~7!7G:^77777~ Y##!       ");
    System.out.println("    !YYPPPPP~7##Y5##^7PPPPPJ.Y##!       ");
    System.out.println("    :~~!!!!!::7????7.^!!!!!^ !77.       ");

    }
    
    /** Método para que o usuario possa digitar uma frase de efeito que aparecera em todas as vezes que for a vez do jogador jogar*/ 
    @Override
    String falar(){
        fEfeito = JOptionPane.showInputDialog (null , "Digite a frase de efeito do Mago: ", "Frase Mago" , JOptionPane.QUESTION_MESSAGE, ic1, null, null).toString();
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
    int correr(int AS, int num1, int num2) {
        int T = Game.aleatorio(((num1+5)), (num2))/10;
        int V = AS * T;
        int A = V * T;
        //V = AS/AT
        // A = AV/AT
        return A;
    }
    
    /** Método que quantifica a habilidade do jogador*/
    @Override
    int habilidadeNO() {
        int h = 8;
       return h;
    }
}
