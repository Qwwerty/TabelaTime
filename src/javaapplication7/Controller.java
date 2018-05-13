/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author qwerty
 */
public class Controller extends javax.swing.JPanel{
    
    public Controller(){
        
        timeController = new ArrayList<>();
        timeEscolhido = new ArrayList<>();
        objeto = new teste();    
    }
    
    
    ///Variaveis...
    public ArrayList<Time> timeController;
    ArrayList<Time> timeEscolhido;
    Object[] aux = new Object[11];
    Random gerador = new Random();
    teste objeto;
    
    
    
    
    ///Functions...
    public boolean cadrastaTime(Time objeto){
        
        timeController.add(objeto);
       
       return true;   
       
    }
    
    private void mostrarTimes(){
        for (int i = 0; i < timeController.size(); i++) {
            aux[i] = timeController.get(i).getNameTeam();
        }
        
        for(int i = 0; i < 2; i++){
            String x = (String) JOptionPane.showInputDialog(null, "ESCOLHA " + (i+1), "Times", JOptionPane.WARNING_MESSAGE, null, aux, null);
           
            for (int J = 0; J < timeController.size(); J++) {
                if(x.equals( timeController.get(J).getNameTeam())){
                        timeEscolhido.add(i, timeController.get(J));
                }
            }
           
        }
        
        
        
    }
    
    public void simularJogo(){
                
        mostrarTimes();
        
        int a = gerador.nextInt(3);
        int b = gerador.nextInt(3);
        
        Tela.ExibirMessagem("Resultado: " + timeEscolhido.get(0).getNameTeam() + " " + a + " x " + b + " " + timeEscolhido.get(1).getNameTeam());
        
        if(a == b){
            Tela.ExibirMessagem("Impate");
            
            ///PONTUAÇÃO.... TIME 1
            timeEscolhido.get(0).setEmpate(1);
            timeEscolhido.get(0).setTotalPontos(1);
            timeEscolhido.get(0).setGolsMarcados(a);
            timeEscolhido.get(0).setGolsSofridos(b);
            timeEscolhido.get(0).setTotalJogos(1);
            
            ///====================================================================
           ///PONTUAÇÃO.... TIME 2
            timeEscolhido.get(1).setEmpate(1);
            timeEscolhido.get(1).setTotalPontos(1);
            timeEscolhido.get(1).setGolsMarcados(b);
            timeEscolhido.get(1).setGolsSofridos(a);
            timeEscolhido.get(1).setTotalJogos(1);
            
            
            
        }
        else if(a > b){
            
             ///PONTUAÇÃO.... TIME 1
            timeEscolhido.get(0).setVitoria(1);
            timeEscolhido.get(0).setTotalPontos(3);
            timeEscolhido.get(0).setGolsMarcados(a);
            timeEscolhido.get(0).setGolsSofridos(b);
            timeEscolhido.get(0).setTotalJogos(1);
            
            ///====================================================================
           ///PONTUAÇÃO.... TIME 2
            timeEscolhido.get(1).setGolsMarcados(b);
            timeEscolhido.get(1).setGolsSofridos(a);
            timeEscolhido.get(1).setTotalJogos(1);
            timeEscolhido.get(1).setDerrota(1);
            
            Tela.ExibirMessagem("O TIME " + timeEscolhido.get(0).getNameTeam() + " Ganhou" );
            
        }
        else{
            
            ///PONTUAÇÃO.... TIME 1
            timeEscolhido.get(1).setVitoria(1);
            timeEscolhido.get(1).setTotalPontos(3);
            timeEscolhido.get(1).setGolsMarcados(b);
            timeEscolhido.get(1).setGolsSofridos(a);
            timeEscolhido.get(1).setTotalJogos(1);
            
            ///====================================================================
           ///PONTUAÇÃO.... TIME 2
            timeEscolhido.get(0).setGolsMarcados(a);
            timeEscolhido.get(0).setGolsSofridos(b);
            timeEscolhido.get(0).setTotalJogos(1);
            timeEscolhido.get(0).setDerrota(1);
            
            
            
            Tela.ExibirMessagem("O TIME " + timeEscolhido.get(1).getNameTeam() + " Ganhou" );
        }
        
        ///LIMPAR O ARRAY DE TIMES ESCOLHIDOS...
       
        
    }
    
    public int getTotalTimes(){
        return timeController.size();
    }
    
    public void VerTabela(){
       
        objeto.CarregaTabela();
        objeto.setVisible(true);
       
    }
    
    public void TabelaConsole(){
        
        
        System.out.println("Nome do time  Total de Jogos  Vitoria   Empate  Derrota  Total de Pontos   Gols Marcados   Gols Sofridos  Saldo de Gols");
        for (int i = 0; i < getTotalTimes(); i++) {
            System.out.println(timeController.get(i).getNameTeam() + "                " + timeController.get(i).getTotalJogos()  + "                " +
                                   timeController.get(i).getVitoria() + "           " + timeController.get(i).getEmpate()  + "            " +
                                timeController.get(i).getDerrota() + "               " + timeController.get(i).getTotalPontos()  + "                         " +
                            timeController.get(i).getGolsMarcados()  + "                     " + timeController.get(i).getGolsSofridos()  + "                     " + 
                        timeController.get(i).getSaldoGols());
        }
    }
    
}
