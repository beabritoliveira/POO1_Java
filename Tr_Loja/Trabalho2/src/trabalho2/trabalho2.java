/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalho2;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

// Link gerado pelo JavaDoc: file:///C:/Users/beatr/OneDrive/Fotos%20cel/NetBeansProjects/Trabalho2/dist/javadoc/allclasses-index.html
public class trabalho2 {

    public static void main(String[] args) {    
     /** 
     * Inicialização e criação dos objetos
     * Relacionando as classes entre si
     */
        Loja loja = new Loja();
        Pedido ped = new Pedido();
        Funcionario func = new Funcionario();
        loja.funcionario = func;
        loja.pedido = ped;
        menu(loja);
        
        
    }
    
    
    public static String data(){
      Date date = new Date();
      SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
      String stringDate = DateFor.format(date);
      return stringDate;
      
    }
    
    public static void menu(Loja loja){  
        Icon ic1 = new ImageIcon("menu.png");
        InOut.MsgDeInformacao(" ", "MENU");
        String original;
        original = JOptionPane.showInputDialog (null, "1 - BUSCAR PRODUTO" + System.lineSeparator() +
                                                      "2 - INSERIR UM PRODUTO" + System.lineSeparator() + 
                                                      "3 - REMOVER UM PRODUTO" + System.lineSeparator() + 
                                                      "4 - MOSTRA PRODUTOS" + System.lineSeparator() + 
                                                      "5 - MOSTRA RELATÓRIO" + System.lineSeparator() + 
                                                      "6 - ADICIONA FUNCIONARIO" + System.lineSeparator() + 
                                                      "7 - MOSTRAR FUNCIONARIO" , "MENU", 
											JOptionPane.QUESTION_MESSAGE, ic1, null, null).toString();
        int opcao = Integer.parseInt(original);

        switch (opcao) {
            case 1:
                loja.pedido.buscarPedido();
                break;
            case 2:
                loja.pedido.inserirPedido();
                break;
            case 3:
                loja.pedido.removerPedido();
                break;
            case 4:
                loja.pedido.listaPedido();
                break;
            case 5:
                loja.mostraRelatorio();
                break;
            case 6:
                loja.funcionario.addFuncionario();
                break;
            case 7:
                loja.funcionario.mostraUsuarios();
                break;
            default:
                InOut.MsgDeErro("", "   ERRO   ");
                InOut.MsgDeInformacao(" ","A OPCAO QUE ESCOLHEU NAO TEM NO SISTEMA");
                //menu();
                break;
        }
        
        int volta;
        // -- ESCOLHA DE VOLTA PARA O MENU --
        do{
            String esc = JOptionPane.showInputDialog (null, " 0-SIM ou 1-NAO " , " DESEJA CONTINUAR NO MENU? ", JOptionPane.QUESTION_MESSAGE);
            volta = Integer.parseInt(esc);
            if(volta == 0){
                    menu(loja);
                    break;
                }
            else if(volta == 1){
                    InOut.MsgDeInformacao(" ", "SAIU");
                    break;
                }
            else{
                InOut.MsgDeErro("", "   ERRO   ");
                InOut.MsgDeInformacao(" ","A OPCAO QUE ESCOLHEU NAO TEM NO SISTEMA");
            }
        }while (volta != 1 && volta != 0);
        
    }
}
