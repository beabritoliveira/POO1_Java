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
public class LutSumo extends Pessoa{
    /** declaração de variáveis*/
    String armamento, fEfeito;
    
    /** Instanciação das imagens para interface */
    Icon ic4 = new ImageIcon("sumo.png");
    
    /** Método para mostrar um esboço de como o jogador do usuario é antes de carregar a imagem do se personagem na interface */     
    @Override
    void desenhar() {
        System.out.println("DESENHANDO: LUTSUMO");
        System.out.println("                    ::::                ");
        System.out.println("                  .~~!!!~               ");
        System.out.println("                 .:^^~~^^:..            ");
        System.out.println("              :^!!7???????77!.          ");
        System.out.println("    ^J7~.   .^~~~~~~~~~~~~~!!77?JJ:     ");
        System.out.println("    .^!?:!????JJYYYY555PPPPPPPP5YJ:     ");
        System.out.println("      .^.?YYYJJJJJJ????7777~:^~~!~      ");
        System.out.println("   ^?J7:.^:..~YPPPGGBB##&&#Y!~~7?:      ");
        System.out.println("    .:.  ^.7PB&&B#&@&@@&&#P5#&#P7.~     ");
        System.out.println("        ?#:P&&&#!!#&&##&&#?J&&&@P:&7    ");
        System.out.println("        :?:7&#BBJ5@&B??B&@YJBB&@7^J:    ");
        System.out.println("            5#GGGB&&&&&&&&BGGG#Y        ");
        System.out.println("            ^YG#&&&&&&&&&&&&&B7         ");
        System.out.println("              .7YG#&&&&&&#B57.          ");
        System.out.println("             !5GY?77?????7?YG5!         ");
        System.out.println("           ^P##B###BBGGBB#####&P:       ");
        System.out.println("          ^B#B~Y#########&##&!Y&B^      ");
        System.out.println("          5##B.5&5G&&&&&&&5B&!!&&P      ");
        System.out.println("          ^7?7.!?????????????:^??^      ");
      }
    
    /** Método para que o usuario possa digitar uma frase de efeito que aparecera em todas as vezes que for a vez do jogador jogar*/ 
    @Override
    String falar(){
        fEfeito = JOptionPane.showInputDialog (null , "Digite a frase de efeito do Lutador de Sumo: ", "Frase Lutador de Sumo" , JOptionPane.QUESTION_MESSAGE, ic4, null, null).toString();
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
        int T = Game.aleatorio(((num1+1)), (num2)) / 10;
        int V = AS * T;
        int A = V * T;
        //V = AS/AT
        // A = AV/AT
        return A;
    }
    
    /** Método que quantifica a habilidade do jogador*/
    @Override
    int habilidadeNO() {
        int h = 4;
       return h;
    }
    
}
