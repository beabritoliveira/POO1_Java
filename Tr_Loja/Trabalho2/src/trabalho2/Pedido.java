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


public class Pedido {   
    /** Declaração de variáveis*/
    public String dataEmissao, nomeP;  
    private int idP;
    float valorP;
    public int prodA = 0, prodB = 0, prodR = 0;
    
    List<Pedido> lista = new ArrayList<>(); //Array de produtos
    /** Construtores*/
    public Pedido() {
      
    }
    public Pedido(int pedidoId, String dataEmissao) {
        this.idP = pedidoId;
        this.dataEmissao = dataEmissao;
    }
/**
     * Função para o funcionário inserir ou adicionar pedidos/produtos, os registrando no sistema.
     * Ela será chamada se na função menu, ela for escolhida.
     */
    public void inserirPedido(){
        prodA++;
        Icon ic2 = new ImageIcon("new.png");
        
        InOut.MsgDeInformacao(" ", "PRODUTO NOVO"); //Setando um nome e valor a um produto novo
        String nome = JOptionPane.showInputDialog (null, "1 - NOME DO PRODUTO: ", "PRODUTO NOVO" , JOptionPane.QUESTION_MESSAGE, ic2, null, null).toString();
        String r2 = JOptionPane.showInputDialog (null,"2 - VALOR DO PRODUTO:  ", "PRODUTO NOVO" , JOptionPane.QUESTION_MESSAGE, ic2, null, null).toString();
        float valor = Float.valueOf(r2); 

        int id = prodA;
        JOptionPane.showMessageDialog(null, "ID: " + id, "PRODUTO NOVO ", JOptionPane.INFORMATION_MESSAGE, ic2);

        Pedido p = new Pedido();
        p.idP = id;
        p.nomeP = nome;
        p.valorP = valor;
        lista.add(p);
   }
    
    /**
     * Função para o funcionário buscar seus pedidos/produtos previamente inseridos.
     * Ela será chamada se na função menu, ela for escolhida.
     */
    public void buscarPedido(){
        prodB++;
        Icon ic3 = new ImageIcon("lupa.png");
        InOut.MsgDeInformacao(" ", "BUSCAR PRODUTO");
        String lerB = JOptionPane.showInputDialog (null, "DIGITE A POSICAO DO PRODUTO: ", "BUSCAR PRODUTO" , JOptionPane.QUESTION_MESSAGE, ic3, null, null).toString();
        int pesquisa = Integer.parseInt(lerB);

        int encontrou = 0;
        for (Pedido p : lista){ //for(int i = 0; i < lista.size(); i++)
            if(pesquisa == p.idP){ //Se encontrar uma correspondência
                encontrou = 1;
                JOptionPane.showMessageDialog (null, "Produto -> " + System.lineSeparator() +"ID: " + p.idP + System.lineSeparator() + "NOME: " + p.nomeP +
                 System.lineSeparator() + "VALOR: " + p.valorP , "MENU", 
											   JOptionPane.QUESTION_MESSAGE, ic3);
                break;
            }
        }
        if(encontrou != 1){
            InOut.MsgDeErro("Jogadores", "   ERRO   ");
            InOut.MsgDeInformacao(" ","A OPCAO QUE ESCOLHEU NAO TEM NO SISTEMA");
        }
    }

    /**
     * Função para o funcionário remover pedidos/produtos armazenados no inserirPedido.
     * Ela será chamada se na função menu, ela for escolhida.
     */
    public void removerPedido(){
        prodR++;
        Icon ic4 = new ImageIcon("excluir-produto.png");
        InOut.MsgDeInformacao(" ", "REMOVER PRODUTO");
        String lerID = JOptionPane.showInputDialog (null, "DIGITE A POSICAO DO PRODUTO: ", "REMOVER PRODUTO" , JOptionPane.QUESTION_MESSAGE, ic4, null, null).toString();
        int excluiID = Integer.parseInt(lerID);

        int foiID = 0;
        for (Pedido p : lista){ //for(int i = 0; i < lista.size(); i++)
            if(excluiID == p.idP){
                foiID = 1;
                String lerR = JOptionPane.showInputDialog (null, "1 - SIM e 2 - NAO: ", "DESEJA EXCLUIR MESMO ESSE PRODUTO?" , JOptionPane.QUESTION_MESSAGE, ic4 ,null,null).toString();
                int respostaE = Integer.parseInt(lerR);
                if(respostaE == 1){
                    lista.remove(p);
                    InOut.MsgDeInformacao("", "PRODUTO EXCLUIDO");
                }
                break;
            }
        }
        if(foiID != 1){
            InOut.MsgDeErro("", "   ERRO   ");
            InOut.MsgDeInformacao(" ","A OPCAO QUE ESCOLHEU NAO TEM NO SISTEMA");
        }   
    }
    
    //---- NOVOS DENTRO DE METODOS DE MANIPULACAO DO PEDIDO ----
   /**
     * Função para o cliente mostrat os pedidos/produtos que foram inseridos.
     * Ela será chamada se na função menu, ela for escolhida.
     */
    public void listaPedido(){
        Icon ic5 = new ImageIcon("pedido.png");
        InOut.MsgDeInformacao(" ", "PRODUTOS ENCONTRADOS");
        JOptionPane.showMessageDialog (null, "ENCONTRADOS " + lista.size()+ " PRODUTOS","PRODUTOS ENCONTRADOS", JOptionPane.INFORMATION_MESSAGE, ic5);

        int i = 0;
        for (Pedido p : lista){ //for(int i = 0; i < lista.size(); i++)
            JOptionPane.showMessageDialog (null, "Produto [" + i + "] -> ID: " + p.idP + System.lineSeparator() + " NOME: " + p.nomeP + System.lineSeparator()+
                    " VALOR: " + p.valorP , "PRODUTOS ENCONTRADOS" , JOptionPane.INFORMATION_MESSAGE, ic5);
            i++;
        }
    }
     
}
