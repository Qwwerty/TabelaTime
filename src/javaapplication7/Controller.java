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
    Object[] aux = new Object[10];
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
            timeEscolhido.add(timeController.get(i));
        }
        
        
        
    }
    
    public void simularJogo(){
                
        mostrarTimes();
        
        int a = gerador.nextInt(3);
        int b = gerador.nextInt(3);
        
        Tela.ExibirMessagem("Resultado: " + timeEscolhido.get(0).getNameTeam() + " " + a + " x " + b + " " + timeEscolhido.get(1).getNameTeam());
        
        if(a == b){
            Tela.ExibirMessagem("Impate");
        }
        else if(a > b){
            Tela.ExibirMessagem("O TIME " + timeEscolhido.get(0).getNameTeam() + " Ganhou" );
        }
        else{
            Tela.ExibirMessagem("O TIME " + timeEscolhido.get(1).getNameTeam() + " Ganhou" );
        }
        
        
    }
    
    public int getTotalTimes(){
        return timeController.size();
    }
    
    public void VerTabela(){
        
        objeto.setVisible(true);
        objeto.CarregaTabela();
    }
    
}
