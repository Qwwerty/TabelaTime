/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author qwerty
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic herelat
        
        
        Object[] options = {"Cadastra", "Simular", "Ver Tabela", "Sair"};
        boolean aux = true;
        
        
        
        
        Controller objetoController  = new Controller();
        
        while(aux){
            
            //int escolha = Tela.LerInteiro("DIGITE 1- CADRASTA TIME OU 2- SIMULAR JOGOS: ");
            String x = (String) JOptionPane.showInputDialog(null, "Selecione alguma função", "MENU OPÇÕES", JOptionPane.WARNING_MESSAGE, null, options, null);
            
            switch(x){
                
                case "Cadastra":
                    
                    if(objetoController.getTotalTimes() <= 10){
                        Time objetoTime = new Time();
                        objetoTime.setName(Tela.LerString("DIGITE NOME DO SEU TIME: "));
                    
                        objetoController.cadrastaTime(objetoTime);
                        
                    }
                    else{
                        Tela.ExibirMessagem("TOTAL DE TIMES IGUAL A 10!!!");
                    }
                    
                    
                    
                    break;
                
                case "Simular":
                    objetoController.simularJogo();
                    break;
                    
                    
                case "Ver Tabela":
                    objetoController.VerTabela();
                    
                case "Sair":
                    aux = false;
                    break;
            }
            
            
        }
    }
    
}
