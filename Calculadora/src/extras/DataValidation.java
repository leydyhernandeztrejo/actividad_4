/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;
import javax.swing.JOptionPane;

/**
 *
 * @author morenita
 */
public class DataValidation {
    public int sring2Int(String value){
        int result = 0;
        try{
            result = Integer.parseInt(value); 
            
        }catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null, "Error de valores" );
            result = 0;
        }
        return result;
    }
    public int sring2Float(String value){
        int result = 0;
        try{
            result = (int) Float.parseFloat(value); 
            
        }catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null, "Error al convertir el valor" );
            result = 0;
        }
        return result;
    }
    public int sring2Double(String value){
        int result = 0;
        try{
            result = (int) Double.parseDouble(value); 
            
        }catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null, "Error al convertir el valor" );
            result = 0;
        }
        return result;
    }
    
}
