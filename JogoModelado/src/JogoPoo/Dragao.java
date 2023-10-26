/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoPoo;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author alunolab08
 */
/** Classe que herda as caracteristicas da classe Personagem*/
public class Dragao extends Personagem{
    /** declaração de variáveis*/
    String armamento;
    
    /** Instanciação das imagens para interface */
    Icon ic5 = new ImageIcon("dragao.png");
    
    /** Método para mostrar um esboço de como o jogador do usuario é antes de carregar a imagem do se personagem na interface */
   @Override
    void desenhar() {
        System.out.println("DESENHANDO: DRAGAO");
        System.out.println("             ::                    .:.    ");
        System.out.println("            :J7       ::        .:^^!!:   ");
        System.out.println("            !P7.     ^~~         .~~77^   ");
        System.out.println("^^~~^:.    :Y5^     :~~:   .::^~7?!?!!.   ");
        System.out.println(":~?J?7!:   ^5J^    .~~^   ^J5P5YPPJ7~?!.  ");
        System.out.println("  ^77~7^   ~5?57:. ^~~:   :~!?JYYYY!7P5^  ");
        System.out.println("   .: 7J:  ~57B&J7!~~~:        ..^PPJJ5~  ");
        System.out.println("     .?5:  ^5?G&JG&5^~~^         :G@&??:  ");
        System.out.println("    :?P7.  :5?P&JG&Y~!!!~^:.   .:7PB#J^   ");
        System.out.println("   ~YP?.   .JY?&PY&Y?555JP5YJJJ75&BG5~    ");
        System.out.println("  !5P?.     !P7P#?&G?PP?7J5PP575&&&&J     ");
        System.out.println(" ~5PJ:      ^Y57BPY&?YPJJJJ5P?5GPPPY:     ");
        System.out.println(":75P7     .!J!YY?GYYBJYP555P57#&&&&?      ");
        System.out.println("^?5PJ.   :?5P?!YY?5YYPY77J5PJYBGBBY.      ");
        System.out.println("^7JPPJ!!75J755J7?YJJ5PJY5P5JJ&#BP7.       ");
        System.out.println(" ~?J5PPPPP7??J55J7?JJJJY5PJ755Y?^         ");
        System.out.println("  ^7?JY555YJJ?JYP5?~!!!!7?J5Y7^^:.        ");
        System.out.println("    :^~~~~~J5PPPJ?77~~^..::^?5Y?7~~:      ");
        System.out.println("          .~!!!!!!!!^^^.     ^!!~^^:      ");
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
    
    
    /** Método que define o quão rapido dragao vai voar em certo tempo que depois sera utilizado em um dos niveis do jogo como função essencial*/
    int voar(int m, int g, int h){
        int U = (m * g * h) / 10;
        return U;
    }
    
    /** Método que quantifica a habilidade do jogador*/
    @Override
    int habilidadeNO() {
        int h = 8;
       return h;
    }
}
