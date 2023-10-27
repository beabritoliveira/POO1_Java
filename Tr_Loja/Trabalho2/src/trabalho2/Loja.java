/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho2;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author alunolab08
 */


public class Loja {
    
    /** Declaração de atributos */
    Pedido pedido;
    Funcionario funcionario;
    // o pedido é um produto dentro dele tem que pedir as coisas do produto
    // list no listaPedido

    

    public Loja() {
    }
    
    /** Imagens para interface */
    Icon ic5 = new ImageIcon("pedido.png");
    
    
    /**
     * Função para o funcionário mostrar todas as ações realizadas no dia.
     * Ela será chamada se na função menu, ela for escolhida.
     */
    public void mostraRelatorio(){
        InOut.MsgDeInformacao(" ", "RELATORIO ");    
        JOptionPane.showMessageDialog (null,"-> RELATORIO FEITO NO DIA : "  + trabalho2.data() + System.lineSeparator() +
                                            "-> " + pedido.prodA + " PRODUTOS NOVOS FORAM ADICONADOS" + System.lineSeparator() + 
                                            "-> " + pedido.prodR + " PRODUTOS FORAM EXCLUIDOS" + System.lineSeparator() + 
                                            "-> "+ pedido.prodB + " PRODUTOS FORAM PESQUISADOS" + System.lineSeparator() + 
                                            "-> " + funcionario.funcQ + " FUNCIONARIOS NOVOS FORAM ADICIONADOS" + System.lineSeparator()
                                                                        , "RELATORIO", JOptionPane.INFORMATION_MESSAGE, ic5);

    }

    
}