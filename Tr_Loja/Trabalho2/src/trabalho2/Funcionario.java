/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author alunolab08
 */


public class Funcionario {
    
    /** declaração de atributos*/
    private String nome;
    int id;
    int cria = 1, funcQ=0;
    List<Funcionario> usuario = new ArrayList<>();
    // MÉTODOS PERSONALIZADOS
    
    /** construtores*/
    public Funcionario() {
    }
    public Funcionario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }
    
    /** Imagens para interface */
    Icon ic = new ImageIcon("funcionario.png");
    Icon ic6 = new ImageIcon("adicionar.png");
    
    /** Função para pegar a matrícula que será
     * definido pela função setMatricula
     * @return um INT = matrícula.
     */

    public int getMatricula(){
        return id;
    }
     /** Função para pegar o nome que será
     * definido pela função setNome
     * @return uma string = nome.
     */
    public String getNome() {
        return nome;
    }

    /** Função para setar o nome do funcionario*/
    private void setNome(String nome) {
        this.nome = nome;
    } 
     /** Função que permite com que apareça todos os funcionários criados no sistema e suas infomrções cadastradas
     */
    public void mostraUsuarios(){
        JOptionPane.showMessageDialog (null, usuario.size()+ ": FUNCIONARIOS FORAM ENCONTRADOS","USUARIOS ENCONTRADOS", JOptionPane.INFORMATION_MESSAGE, ic);
        int i = 0;
        for (Funcionario f : usuario) {
            JOptionPane.showMessageDialog(null,"FUNCIONARIO [" + i + "] -> NOME: " + f.getNome() + System.lineSeparator() +" MATRICULA: " + f.getMatricula(), "USUARIOS ENCONTRADOS", JOptionPane.INFORMATION_MESSAGE, ic);
            i++;
        }  
    }    
    
    
    public void gerente(){
        Funcionario f = new Funcionario();
        f.setNome("Beatriz");
        f.id = 123;
        cria++;
        usuario.add(f);
    }
    
    /**
     * Função que permite a criação de mais funcionários no sistema.
     * Ela será chamada se na função menu, ela for escolhida.
     */
    public void addFuncionario(){
        if(cria == 1){
            gerente();
        }
        
        Funcionario f1 = new Funcionario();
        InOut.MsgDeInformacao(" ", "ADICIONA NOVO FUNCIONARIO ");
        String name =JOptionPane.showInputDialog (null, "ESCREVA O NOME DO FUNCIONARIO: ", "ADICIONA NOVO FUNCIONARIO " , JOptionPane.QUESTION_MESSAGE, ic6, null, null).toString();
        int matri = 0;
        for (Funcionario f : usuario){
            matri = f.id;
        }
        f1.nome = name;
        f1.id = ++matri;
        JOptionPane.showMessageDialog (null, "MATRICULA DO USUARIO É: "+ matri ," ADICIONA NOVO FUNCIONARIO ", JOptionPane.INFORMATION_MESSAGE, ic6);
        usuario.add(f1);
        funcQ++;
        } 
    }

