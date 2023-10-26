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
public class Soldado extends Pessoa{
    /** declaração de variáveis*/
    String armamento, fEfeito;
    
    /** Instanciação das imagens para interface */
    Icon ic3 = new ImageIcon("soldado.png");
    
    /** Método para mostrar um esboço de como o jogador do usuario é antes de carregar a imagem do se personagem na interface */
    @Override
    void desenhar() {
        System.out.println("DESENHANDO: SOLDADO");
        System.out.println("               .^.:^^^:.                ");
        System.out.println("             :J5J:~!!!!.??^             ");
        System.out.println("            .7J~^:^~^^:~~!?:            ");
        System.out.println("           .^::^~:~^^~.~~^:^.           ");
        System.out.println("           ^~~~^^.::::.^^^~~:           ");
        System.out.println("           ~~:~~~^^^^^^~~~:~~           ");
        System.out.println("           :::7GPPGGGPPPP7:::           ");
        System.out.println("             7^YBBGPPGBBY^!             ");
        System.out.println("              :.7YY??YY7.:              ");
        System.out.println("                 .^~~^.                 ");
        System.out.println("                .~^^^^^.                ");
        System.out.println("          :!J:^~^^^^::::~^.J!:          ");
        System.out.println("        .:7??:~!!JP55PY!!~:??7:.        ");
        System.out.println("       ^!:.~.:!!!J5555J!!!:.~.:!^       ");
        System.out.println("      ^!!~::.~!!^~~~~~~^!!~::.~!!^      ");
        System.out.println("      ~!!^:J^^!.JPPJJPPJ.!^^J^^!!~      ");
        System.out.println("      ~!!~:7:^!:~??77??~:!~:7:~!!~      ");
        System.out.println("      ~!!!.7.!7^^??????^^!!.7.!!!~      ");
        System.out.println("      ^^^^.!.^^^::::::::^^^.!.^^^^      ");

      }

    /** Método para que o usuario possa digitar uma frase de efeito que aparecera em todas as vezes que for a vez do jogador jogar*/
    @Override
    String falar(){
        fEfeito = JOptionPane.showInputDialog (null , "Digite a frase de efeito do Soldado: ", "Frase Soldado" , JOptionPane.QUESTION_MESSAGE, ic3, null, null).toString();
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
        int T = Game.aleatorio(((num1+2)), (num2/100)) /10;
        int V = AS * T;
        int A = V * T;
        return A;
    }
    
    /** Método que quantifica a habilidade do jogador*/
    @Override
    int habilidadeNO() {
        int h = 4;
       return h;
    }
    
}
