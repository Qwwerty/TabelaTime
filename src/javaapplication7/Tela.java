/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
import javax.swing.JOptionPane;

/**
 *
 * @author qwerty
 */
public class Tela {
       
    
    public static String LerString(String sMsg){
        return  JOptionPane.showInputDialog(sMsg);
    }
    
    public static int LerInteiro(String sMsg){   
        String valor = LerString(sMsg);
        return Integer.parseInt(valor);
    }
    
    public static double LerNumeroReal(String sMsg){
        String valor = LerString(sMsg);
        return Double.parseDouble(valor);
    }
    
    public static void ExibirMessagem(String sMsg){
        JOptionPane.showMessageDialog(null, sMsg);
    }
    
}