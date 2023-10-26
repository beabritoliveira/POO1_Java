/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JogoPoo;

import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

    
public class Game {     
    public static void main(String[] args) {
        String personagem, weapon, perso2, weap2, frase1 = null, frase2 = null;
        int c11, c12, c21, c22, c31, c32, ep1 = 2, ep2 = 2;
        int V1=0, V2=0; 
        Game app = new Game();
        Mago m = new Mago();
        General g = new General();
        Soldado s = new Soldado();
        LutSumo ls = new LutSumo();
        Dragao da = new Dragao();
        
       
     personagem = app.escolhaPersonagem(); 
     switch(personagem){
           case "Mago" -> { 
               frase1 = m.falar();
           }
           case "General" -> {
               frase1 = g.falar();
           }
           case "Soldado" ->{
               frase1 = s.falar();
           }
           case "Lutador de Sumo" -> {
               frase1 = ls.falar();
           }
           case "Dragao" -> {
           }
       }
     weapon= app.escolhaArma(personagem); 
     perso2 = app.escolhaPersonagem();
     switch(perso2){
           case "Mago" -> { 
               frase2 = m.falar();
           }
           case "General" -> {
               frase2 = g.falar();
           }
           case "Soldado" ->{
               frase2 = s.falar();
           }
           case "Lutador de Sumo" -> {
               frase2 = ls.falar();
           }
           case "Dragao" -> {
           }
       }
     weap2 = app.escolhaArma(perso2);
     Icon im1 = new ImageIcon("conflito.png");  
     JOptionPane.showMessageDialog (null, 
                        "ROUND 1: Conflito entre " + personagem + " (do jogador 1) e " + perso2  +" (do jogador 2)"
             , personagem + " e " + perso2, JOptionPane.INFORMATION_MESSAGE, im1);
    
     do{
     c11 = app.ataque1(personagem, weapon, frase1);
     c12 = app.ataque1(perso2, weap2, frase2);
     }while(c11 == c12); //Fazer enquanto os dois tiverem dando o mesmo numero
        
     Icon im2 = new ImageIcon("R1.png");  
     if(c11 < c12){ //Personagem 2 ganhou + pontos que o Personagem 1
         JOptionPane.showMessageDialog (null, 
                        "ROUND 1: " + perso2 + " (do jogador 2) ganhou" + System.lineSeparator() +
                        c12 +" > " + c11 , personagem + " e " + perso2, JOptionPane.INFORMATION_MESSAGE, im2);
         V2++;
     }
     else if (c11 > c12){
         JOptionPane.showMessageDialog (null, 
                        "ROUND 1: " + personagem + " (do jogador 1) ganhou" + System.lineSeparator() +
                        c11 +" > " + c12 , personagem + " e " + perso2, JOptionPane.INFORMATION_MESSAGE, im2);
         V1++;
     }
     
     Icon im3 = new ImageIcon("senha.png");  
     JOptionPane.showMessageDialog (null, 
                        "ROUND 2: Adivinhe a senha de 5 digitos para abrir o cofre", personagem + " e " + perso2, JOptionPane.INFORMATION_MESSAGE, im3);
     c21 = app.ataque2(personagem, frase1);
     c22 = app.ataque2(perso2, frase2);
     
     if(c21 > c22){ //Personagem 1 chutos mais para acertar a combinação da senha
         JOptionPane.showMessageDialog (null, 
                        "ROUND 2: " + perso2 + " (do jogador 2) ganhou" + System.lineSeparator() +
                        c22 +" > " + c21 , personagem + " e " + perso2, JOptionPane.INFORMATION_MESSAGE, im3);
         V1++;
     }
     else if (c21 < c22){
         JOptionPane.showMessageDialog (null, 
                        "ROUND 2: " + personagem + " (do jogador 1) ganhou" + System.lineSeparator() +
                        c21 +" > " + c22 , personagem + " e " + perso2, JOptionPane.INFORMATION_MESSAGE, im3);
         V2++;
     }
     
     Icon im4 = new ImageIcon("pers.png");
     Icon im5 = new ImageIcon("pers.png");  
     JOptionPane.showMessageDialog (null, 
                        "ROUND 3: Corra antes que te peguem abrindo o cofre", personagem + " e " + perso2, JOptionPane.INFORMATION_MESSAGE, im4);
     c31 = app.ataque3(personagem, frase1);
     c32 = app.ataque3(perso2, frase2);
     
     if(c31 == 1 && c32 == 1){ //OS DOIS ESCAPARAM
         JOptionPane.showMessageDialog (null, 
                        "ROUND 3: " + personagem + " (do jogador 1) e " + perso2  +" (do jogador 2) ganharam", personagem + " e " + perso2, JOptionPane.INFORMATION_MESSAGE, im4);
         V1++;
         V2++;
     }
     
     else if (c31 == 0 && c32 == 0){ //SE NENHUM DELES ESCAPAR
         JOptionPane.showMessageDialog (null, 
                        "ROUND 3: nenhum dos jogadores escapou", personagem + " e " + perso2, JOptionPane.INFORMATION_MESSAGE, im5);
        ep1 = app.escapeCadeia(personagem, frase1);
        ep2 = app.escapeCadeia(perso2, frase2);
     }
     
     else{
        if(c31 == 1 && c32 == 0){ // SE O PERSONAGEM ESCAPA E O PERSO2 NAO
           JOptionPane.showMessageDialog (null, 
                        "ROUND 3: " + personagem + " (do jogador 1) ganhou", personagem + " e " + perso2, JOptionPane.INFORMATION_MESSAGE, im4);
         V1++;
         ep2 = app.escapeCadeia(perso2, frase2);
     }
        
        else if(c31 == 0 && c32 == 1){
         JOptionPane.showMessageDialog (null, 
                        "ROUND 3: " + perso2 + " (do jogador 2) ganhou", personagem + " e " + perso2, JOptionPane.INFORMATION_MESSAGE, im4);
         V2++;
         ep1 = app.escapeCadeia(personagem, frase1);
     }
     }
      
     if(ep1 == 0 && ep2 == 0){
         JOptionPane.showMessageDialog (null, "Perdedores", personagem + " e " + perso2, JOptionPane.INFORMATION_MESSAGE, im5);
     }
     else if(ep1 >= 1 && ep2 >= 1){
         JOptionPane.showMessageDialog (null, "Vencedores", personagem + " e " + perso2, JOptionPane.INFORMATION_MESSAGE, im4);
     }
     else if(ep1 == 1 && ep2 == 0){
         JOptionPane.showMessageDialog (null, "Vencedor", personagem + System.lineSeparator() +"Perdedor" + perso2, JOptionPane.INFORMATION_MESSAGE, im4);    
     }
     else{
        JOptionPane.showMessageDialog (null, "Vencedor", perso2 + System.lineSeparator() + "Perdedor" + personagem, JOptionPane.INFORMATION_MESSAGE, im4);     
     }
     
     app.prologoPerdedor(ep1, ep2, personagem, perso2);
     app.prologoVencedor(ep1, ep2, personagem, perso2);
     
     Icon im6 = new ImageIcon("relatorio.png");
     
     JOptionPane.showMessageDialog (null, "Relatorio", personagem + " e " + perso2, JOptionPane.INFORMATION_MESSAGE, im6);

     app.relatorio(V1, personagem);
     app.relatorio(V2, perso2);
     
    }
    
    /** Função para definir a arma que cada usuario vai utilizar ao longo do jogo
     * @param person 
     * @return */
    public String escolhaArma(String person){
        Game gm = new Game();
        int esc1;
        String set, arma = null;
        Mago m = new Mago();
        General g = new General();
        Soldado s = new Soldado();
        LutSumo ls = new LutSumo();
        Dragao da = new Dragao();
               
        Icon ic9 = new ImageIcon("menu2.png");    
        
       do{
          set = JOptionPane.showInputDialog (null, "1 - Faca" + System.lineSeparator() +
                                                   "2 - Revolver" + System.lineSeparator() + 
                                                   "3 - Fuzil" + System.lineSeparator() + 
                                                   "4 - Desarmado" + System.lineSeparator() + 
                                                   "5 - Fogo" + System.lineSeparator() + 
                                                   "6 - Magia" ,
                                "Escolha sua arma: ", JOptionPane.QUESTION_MESSAGE, ic9, null, null).toString();
          esc1 = Integer.parseInt(set);

        switch (esc1) {
            //DEFININDO A ARMA 
            case 1 -> arma = "Faca";
            case 2 -> arma = "Revolver";
            case 3 -> arma = "Fuzil";
            case 4 -> arma = "Desarmado";
            case 5 -> arma = "Fogo";
            case 6 -> arma = "Magia";
        } 
       }while(esc1 < 1 || esc1 > 6);
       
       switch(person){
           //SETANDO A ARMA
           case "Mago" -> m.setArma(arma);
           case "General" -> g.setArma(arma);
           case "Soldado" -> s.setArma(arma);
           case "Lutador de Sumo" -> ls.setArma(arma);
           case "Dragao" -> da.setArma(arma);
       }
        return arma;
    }   
    
    /** Função para definir o personagem que cada usuario vai utilizar ao longo do jogo 
     * @return */
    public String escolhaPersonagem(){ 
        Game game = new Game();
        int esc2;
        String person = null, p;
        Mago m = new Mago();
        General g = new General();
        Soldado s = new Soldado();
        LutSumo ls = new LutSumo();
        Dragao da = new Dragao();
        Icon ic6 = new ImageIcon("menu.png"); 
               
      do{
          p = JOptionPane.showInputDialog (null, "1 - Mago" + System.lineSeparator() +
                                                 "2 - General" + System.lineSeparator() + 
                                                 "3 - Soldado" + System.lineSeparator() + 
                                                 "4 - Lutador de Sumo" + System.lineSeparator() + 
                                                 "5 - Dragao" 
                                ,"Escolha sua arma: ", JOptionPane.QUESTION_MESSAGE, ic6, null, null).toString();
          esc2 = Integer.parseInt(p);

       switch (esc2){
           case 1 -> { 
               person = "Mago";
               m.desenhar();
            }
           case 2 -> {
               person = "General";
               g.desenhar();
            }
           case 3 -> {
               person = "Soldado";
               s.desenhar();
            }
           case 4 -> {
               person= "Lutador de Sumo";
               ls.desenhar();
            }
           case 5 -> {
               person = "Dragao";
               da.desenhar();
            }
       }
        
      }while(esc2 < 1 || esc2 > 5);
           
        return person;
    }    
    
    /** Função para sortear números aleátorios dentro
     * de um intervalo, que é definido pelos parâmetros minimo e maximo. 
     * @param minimo @param maximo
     * @return 
     */
    public static int aleatorio(int minimo, int maximo){
        Random random = new Random();
        return random.nextInt((maximo - minimo) + 1) + minimo;
    }
    
    /**Função que defini o nivel 1 do jogo
     * Cada jogador digita um numero de 1 a 15 e apos a logica ser feita retorna um número que depois sera comparado e o jogador ganhador sera o que houver o maior numero
     * @param person @param frase @param arma
     * @return 
     */
    public int ataque1(String person, String arma, String frase){
       int hb = 1, atq = 1, num = 0, a;
       String ic;
        Mago m = new Mago();
        General g = new General();
        Soldado s = new Soldado();
        LutSumo ls = new LutSumo();
        Dragao da = new Dragao();
        
        Faca f = new Faca();
        Revolver r = new Revolver();
        Fuzil fz = new Fuzil();
        Fogo fg = new Fogo();
        Magia mg = new Magia();
        Desarmado ds = new Desarmado();
        
        Icon ic1 = new ImageIcon("mago.png");        
        Icon ic2 = new ImageIcon("general.png");
        Icon ic3 = new ImageIcon("soldado.png");
        Icon ic4 = new ImageIcon("sumo.png");
        Icon ic5 = new ImageIcon("dragao.png");
        
        
        switch(person){
           case "Mago" -> {
               JOptionPane.showMessageDialog(null, "Mago: " + frase , "MAGO ", JOptionPane.INFORMATION_MESSAGE, ic1);
               hb = m.habilidadeNO();
           }
           case "General" -> {
               JOptionPane.showMessageDialog(null, "General: " + frase , "GENERAL ", JOptionPane.INFORMATION_MESSAGE, ic2);
               hb = g.habilidadeNO();
           }
           case "Soldado" ->{
               JOptionPane.showMessageDialog(null, "Soldado: " + frase, "SOLDADO ", JOptionPane.INFORMATION_MESSAGE, ic3);
               hb = s.habilidadeNO();
           }
           case "Lutador de Sumo" -> {
               JOptionPane.showMessageDialog(null, "Lutador de Sumo: " + frase, "LUTADOR DE SUMO ", JOptionPane.INFORMATION_MESSAGE, ic4);
               hb = ls.habilidadeNO();
           }
           case "Dragao" -> {
               JOptionPane.showMessageDialog(null, "Dragao: awr", "Dragao", JOptionPane.INFORMATION_MESSAGE, ic5);
               hb = da.habilidadeNO();
           }
       }
        
        
       Icon ic7 = new ImageIcon("num.png"); 
        while(num < 1 || num > 15){
            String e  = JOptionPane.showInputDialog (null, person + " -> Digite um numero de 1 a 15 " , person, JOptionPane.QUESTION_MESSAGE, ic7, null, null).toString();
            num = Integer.parseInt(e);
        }
        
       switch (arma) {
            //DEFININDO A ARMA 
            case "Faca" -> atq = f.usarArma();
            case "Fuzil" -> atq = fz.usarArma();
            case "Desarmado" -> atq = ds.usarArma();
            case "Fogo" -> atq = fg.usarArma();
            case "Magia" -> atq = mg.usarArma();
            case "Revolver" -> atq = r.usarArma();
       }
       
       a = atq * (num/Game.aleatorio(1,6));
               
       return a * hb;
    }
    
    /**Função que defini o nivel 2 do jogo
     * Uma senha de 5 digitos é o foco do nível, o jogador devera inserir numero por numero, e este será resorteado constantemente a cada vez que o jogador errar, quando ele acerta passa para o próximo numero da combinacao até que todos os 5 sejam acertados pelo usuário
     * Ganha quem tiver acertado a sua combinação em menor tentativas
     * @param person @param frase
     * @return 
     */
    public int ataque2(String person, String frase){
        int n1, n2, n3, n4, n5, noChutes = 0;
        int ch1, ch2, ch3, ch4, ch5;
        //Adivinhe a combinacao quem tiver menos chutes ganha
        Icon ic1 = new ImageIcon("mago.png");        
        Icon ic2 = new ImageIcon("general.png");
        Icon ic3 = new ImageIcon("soldado.png");
        Icon ic4 = new ImageIcon("sumo.png");
        Icon ic5 = new ImageIcon("dragao.png");
        
        switch(person){
           case "Mago" -> {
               JOptionPane.showMessageDialog(null, "Mago: " + frase , "MAGO ", JOptionPane.INFORMATION_MESSAGE, ic1);
           }
           case "General" -> {
               JOptionPane.showMessageDialog(null, "General: " + frase , "GENERAL ", JOptionPane.INFORMATION_MESSAGE, ic2);
           }
           case "Soldado" ->{
               JOptionPane.showMessageDialog(null, "Soldado: " + frase, "SOLDADO ", JOptionPane.INFORMATION_MESSAGE, ic3);
           }
           case "Lutador de Sumo" -> {
               JOptionPane.showMessageDialog(null, "Lutador de Sumo: " + frase, "LUTADOR DE SUMO ", JOptionPane.INFORMATION_MESSAGE, ic4);
           }
           case "Dragao" -> {
               JOptionPane.showMessageDialog(null, "Dragao: awr", "Dragao", JOptionPane.INFORMATION_MESSAGE, ic5);
           }
       }
        
        Icon ic7 = new ImageIcon("num.png");
        JOptionPane.showMessageDialog(null, "ADIVINHE A SENHA  (numero por numero)", person, JOptionPane.INFORMATION_MESSAGE, ic7);
        //SENHA DE 5 DIGITOS
        
        do{
            n1 = Game.aleatorio(0, 9);
            String C1  = JOptionPane.showInputDialog (null, "Adivinhe o PRIMEIRO numero da senha: " , person, JOptionPane.QUESTION_MESSAGE, ic7, null, null).toString();
            ch1 = Integer.parseInt(C1);
            
            if (ch1 != n1 || ch1 < 0 && ch1 > 9){
                JOptionPane.showMessageDialog(null, "Tente de novo", person, JOptionPane.INFORMATION_MESSAGE);
                noChutes++;
            }
            else{
                JOptionPane.showMessageDialog (null, 
                        "Voce acertou o primeiro numero" + System.lineSeparator() +
                        "SENHA: " + n1 + "****" , person, JOptionPane.INFORMATION_MESSAGE, ic7); 
            }
        }while(ch1 != n1);
        
        
        do{
            n2 = Game.aleatorio(0, 9);
            String C2  = JOptionPane.showInputDialog (null, "Adivinhe o SEGUNDO numero da senha: " , person, JOptionPane.QUESTION_MESSAGE, ic7, null, null).toString();
            ch2 = Integer.parseInt(C2);
            if (ch2 != n2 || ch1 < 0 && ch1 > 9){
                JOptionPane.showMessageDialog(null, "Tente de novo", person, JOptionPane.INFORMATION_MESSAGE);
                noChutes++;
            }
            else{
                JOptionPane.showMessageDialog (null, 
                        "Voce acertou o segundo numero" + System.lineSeparator() +
                        "SENHA: " + n1 + n2 + "***" ,person, JOptionPane.INFORMATION_MESSAGE, ic7);
                }
        }while(ch2 != n2);
        
        
        do{
            n3 = Game.aleatorio(0, 9);
            String C3  = JOptionPane.showInputDialog (null, "Adivinhe o TERCEIRO numero da senha: " , person, JOptionPane.QUESTION_MESSAGE, ic7, null, null).toString();
            ch3 = Integer.parseInt(C3);
            if (ch3 != n3 || ch1 < 0 && ch1 > 9){
                 JOptionPane.showMessageDialog(null, "Tente de novo", person, JOptionPane.INFORMATION_MESSAGE);
                noChutes++;
            }
            else{
                JOptionPane.showMessageDialog (null, 
                        "Voce acertou o terceiro numero" + System.lineSeparator() +
                        "SENHA: " + n1 + n2 + n3 + "**"
		,person, JOptionPane.INFORMATION_MESSAGE, ic7);
            }
        }while(ch3 != n3);
        
        do{
            n4 = Game.aleatorio(0, 9);
            String C4  = JOptionPane.showInputDialog (null, "Adivinhe o QUARTO numero da senha: " , person, JOptionPane.QUESTION_MESSAGE, ic7, null, null).toString();
            ch4 = Integer.parseInt(C4);
            if (ch4 != n4 || ch1 < 0 && ch1 > 9){
                JOptionPane.showMessageDialog(null, "Tente de novo", person, JOptionPane.INFORMATION_MESSAGE);
                noChutes++;
            }
            else{
                JOptionPane.showMessageDialog (null, 
                        "Voce acertou o quarto numero" + System.lineSeparator() +
                        "SENHA: " + n1 + n2 + n3 + n4 + "*"
		,person, JOptionPane.INFORMATION_MESSAGE, ic7);
            }
        }while(ch4 != n4);
        
        
         do{
            n5 = Game.aleatorio(0, 9);
            String C5  = JOptionPane.showInputDialog (null, "Adivinhe o QUINTO numero da senha: " , person, JOptionPane.QUESTION_MESSAGE, ic7, null, null).toString();
            ch5 = Integer.parseInt(C5);
            if (ch5 != n5 || ch1 < 0 && ch1 > 9){
                JOptionPane.showMessageDialog(null, "Tente de novo", person, JOptionPane.INFORMATION_MESSAGE);
                noChutes++;
            }
            else{
                JOptionPane.showMessageDialog (null, 
                        "Voce acertou o ultimo numero" + System.lineSeparator() +
                        "SENHA: " + n1 + n2 + n3 + n4 + n5
		,person, JOptionPane.INFORMATION_MESSAGE, ic7);
            }
        }while(ch5 != n5);
        
            return noChutes;
        
    } 
    
    /** Função que defini o nivel 3 do jogo
     * O objetivo do nivel é fugir apos a abertura do cofre
     * Utilizando de uma logica em que há numeros, aleatórios, chamadas de funçoes de outras classes, inserção de numeros pelo usuario, e sua multiplicacao para que represente o usuário em sua fuga e de quem ele está correndo 
     * Caso o jogador consiga evacuar o local sem ser pego ele ganha o nível
     * @param person @param frase
     * @return 
     */
    public int ataque3(String person, String frase){
        //Perseguicao da policia?
        int AS = 0, A, R, Rand;
        int no2 = 0, no1 = 0;
        Game app = new Game();
        Mago m = new Mago();
        General g = new General();
        Soldado s = new Soldado();
        LutSumo ls = new LutSumo();
        Dragao da = new Dragao();
      
        Icon ic1 = new ImageIcon("mago.png");        
        Icon ic2 = new ImageIcon("general.png");
        Icon ic3 = new ImageIcon("soldado.png");
        Icon ic4 = new ImageIcon("sumo.png");
        Icon ic5 = new ImageIcon("dragao.png");
        Icon ic7 = new ImageIcon("num.png");
        
        switch(person){
           case "Mago" -> {
               JOptionPane.showMessageDialog(null, "Mago: " + frase , "MAGO ", JOptionPane.INFORMATION_MESSAGE, ic1);
           }
           case "General" -> {
               JOptionPane.showMessageDialog(null, "General: " + frase , "GENERAL ", JOptionPane.INFORMATION_MESSAGE, ic2);
           }
           case "Soldado" ->{
               JOptionPane.showMessageDialog(null, "Soldado: " + frase, "SOLDADO ", JOptionPane.INFORMATION_MESSAGE, ic3);
           }
           case "Lutador de Sumo" -> {
               JOptionPane.showMessageDialog(null, "Lutador de Sumo: " + frase, "LUTADOR DE SUMO ", JOptionPane.INFORMATION_MESSAGE, ic4);
           }
           case "Dragao" -> {
               JOptionPane.showMessageDialog(null, "Dragao: awr", "Dragao", JOptionPane.INFORMATION_MESSAGE, ic5);
           }
       }
        
        
        A = Game.aleatorio(1,5);
        //System.out.println("A = " + A);
        
        Rand = Game.aleatorio(1000, 5000);
        int G= Game.aleatorio(10, 100);
        
        do{
         String n  = JOptionPane.showInputDialog (null, "Digite um numero [2 a 20] " + person +": " , person, JOptionPane.QUESTION_MESSAGE, ic7, null, null).toString();
         no1 = Integer.parseInt(n);
        }while(no1<2 || no1>20);
        
        do{
         String n1  = JOptionPane.showInputDialog (null, "Digite um numero [150 a 500] " + person +": " , person, JOptionPane.QUESTION_MESSAGE, ic7, null, null).toString();
         no2 = Integer.parseInt(n1);
        }while(no2 < 150 || no2 > 500);
        
        switch(person){
            case "Mago" -> AS = m.correr(Rand,no1,no2);
            case "General" -> AS = g.correr(Rand,no1,no2);
            case "Soldado" -> AS = s.correr(Rand,no1,no2);
            case "Lutador de Sumo" -> AS = ls.correr(Rand,no1,no2);
            case "Dragao" -> AS = da.voar(no1, G ,no2);
        }
        
        //System.out.println("AS = " + AS);
        R = A * AS;
        //System.out.println("Resultado: " + R);
         
         //POLICIA(?)
         int Pol, aleat, T, comp;
         aleat = Game.aleatorio(1000, 3700);
         T = Game.aleatorio(((no1)), (no2)) /10;
         Pol = aleat * T * T;
        //System.out.println("Policia: " + Pol);
         
         if(Pol > R){
             comp = 0;
         }
         else if (Pol < R){
             comp = 1;
         }
         else{
             comp = Game.aleatorio(0,1);
         }
         //System.out.println("Comparacao = " + comp);
        return comp;
    
}
    
    /** Função para definir se o personagem que não conseguiu escapar da perseguicao consegue fugir da cadeia 
     *@param person @param frase
     * @return 
     */
    public int escapeCadeia(String person, String frase){
        int tent, R, a3;
        Game jg = new Game();
        Icon ic8 = new ImageIcon("prisao.png");
        
        tent = Game.aleatorio(0, 1);
        //System.out.println("V Extra: " + tent);
        if(tent == 0){
            R = 0; //Perdeu a chance de jogar de novo
        }
        else{
            JOptionPane.showMessageDialog(null, "ESCAPE DA CADEIA:" , person, JOptionPane.INFORMATION_MESSAGE, ic8);
            JOptionPane.showMessageDialog(null, person + " voce pode tentar fugir da cadeia." , person, JOptionPane.INFORMATION_MESSAGE, ic8);

            a3 = jg.ataque3(person, frase);
            if(a3 == 0){
                R = 0; // Perdeu na nova tentativa de fugir
            }
            else{
                R = 1; // Ganhou na nova tentativa de fugir
            }
        }
        //System.out.println("Resultado da vida extra: " + R);
        return R;
    }
    
    /**  
     * Se o jogador perder o terceiro round e escapar da policia ou ao utilizar de uma nova chance de escape
     * o prologo perdedor será retornado o notificando de sua derrota no game    
     * @param eC1  @param eC2 
     * @param person1 @param personag2 
     */    
    public void prologoPerdedor(int eC1, int eC2, String person1, String personag2){
        Game gam = new Game();
        Icon im7 = new ImageIcon("game-over.png");
        if(eC1 ==0 && eC2 ==0){
            // 1 ou 2 ganham
            JOptionPane.showMessageDialog(null, "VOCES PERDERAM O JOGO" , person1 + " e " + personag2, JOptionPane.INFORMATION_MESSAGE, im7);
            JOptionPane.showMessageDialog(null, "Parabens pela derrota " + person1 + "(do jogador 1) e " + personag2 + " (do jogador 2)" , person1 + " e " + personag2, JOptionPane.INFORMATION_MESSAGE, im7);
           }
        else{
            if(eC1 == 0){
                JOptionPane.showMessageDialog(null, "Parabens pela sua derrota " + person1 + "(do jogador 1)" , person1, JOptionPane.INFORMATION_MESSAGE, im7);                
            }    
            else if (eC2 == 0){
                JOptionPane.showMessageDialog(null, "Parabens pela sua derrota " + personag2 + " (do jogador 2)" , personag2, JOptionPane.INFORMATION_MESSAGE, im7);                                
            } 
        }
    }
    
    /**  
     * Se o jogador conseguir ganhar o terceiro round e escapar da policia ou ao utilizar de uma nova chance de escape
     * o prologo vencedor será retornado o notificando de sua vitoria no game    
     * @param eC1  @param eC2 
     * @param person1 @param personag2 
     */    
    public void prologoVencedor(int eC1, int eC2, String person1, String personag2){
        Game gam = new Game();
        Icon im8 = new ImageIcon("trofeu.png");
        if(eC1 >=1 && eC2 >= 1){
            // 1 ou 2 ganham
            JOptionPane.showMessageDialog(null, "VOCES VENCERAM O JOGO" , person1 + " e " + personag2, JOptionPane.INFORMATION_MESSAGE, im8);
            JOptionPane.showMessageDialog(null, "Parabens pela vitoria" + person1 + "(do jogador 1) e " + personag2 + " (do jogador 2)" , person1 + " e " + personag2, JOptionPane.INFORMATION_MESSAGE, im8);
        }
        else{
            if(eC1 >= 1){
                JOptionPane.showMessageDialog(null, "Parabens pela sua vitoria " + person1 + "(do jogador 1)" , person1, JOptionPane.INFORMATION_MESSAGE, im8);                               
            }    
            else if (eC2 >= 1){
                JOptionPane.showMessageDialog(null, "Parabens pela sua vitoria " + personag2 + " (do jogador 2)" , personag2, JOptionPane.INFORMATION_MESSAGE, im8);                                
            } 
        }
    }
    
    /**  
     * Após toda a trajetória pelo game do jogador o relatório do jogo é chamado e mostra quantas chances ele ganhou e quantas ele perdeu no primeiro, segundo e terceiro round (não está inclusa a vitória no escape extra)
     * @param ace1  @param person
     */    
    public void relatorio(int ace1,  String person){
        Icon im6 = new ImageIcon("relatorio.png");
        JOptionPane.showMessageDialog(null, "RELATORIO" + System.lineSeparator() + "Durante todo o jogo: " , person, JOptionPane.INFORMATION_MESSAGE, im6);                                

            switch (ace1) {
                case 0 -> 
                   JOptionPane.showMessageDialog(null, person + " perdeu todas as fases", person, JOptionPane.INFORMATION_MESSAGE, im6);                                
                case 1 -> {
                     JOptionPane.showMessageDialog (null, 
                        person + System.lineSeparator() +
                        "Ganhou 1 fase do jogo" + System.lineSeparator() +
                        "E perdeu 2 fases" , person, JOptionPane.INFORMATION_MESSAGE, im6);
                }
                case 2 -> {
                    JOptionPane.showMessageDialog (null, 
                         person + System.lineSeparator() +
                        "Ganhou 2 fases do jogo" + System.lineSeparator() +
                        "E perdeu 1 fase " , person, JOptionPane.INFORMATION_MESSAGE, im6);
                }
                case 3 -> 
                   JOptionPane.showMessageDialog(null, person + " ganhou todas as tres fases", person, JOptionPane.INFORMATION_MESSAGE, im6);                                                    
            }
    }
}
