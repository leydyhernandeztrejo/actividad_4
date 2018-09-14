/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.ModelCalculadora;
import views.ViewCalculadora;
import extras.DataValidation;

/**
 *
 * @author morenita
 */
public class ControllerCalculadora implements ActionListener {
    ModelCalculadora modelCalculadora;
    ViewCalculadora viewCalculadora;
    DataValidation dataValidation = new DataValidation();
    public ControllerCalculadora(ViewCalculadora viewCalculadora, ModelCalculadora modelCalculadora){
        this.viewCalculadora = viewCalculadora;
        this.modelCalculadora = modelCalculadora;
        viewCalculadora.jb_suma.addActionListener(this);
        viewCalculadora.jb_resta.addActionListener(this);
        viewCalculadora.jb_multiplicacion.addActionListener(this);
        viewCalculadora.jb_division.addActionListener(this);
        viewCalculadora.jb_modulo.addActionListener(this);
        desabilitar();
        initComponents();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==viewCalculadora.jb_suma){
            suma();
        }   
        else if (e.getSource()==viewCalculadora.jb_resta){
            resta();
        }
        else if (e.getSource()==viewCalculadora.jb_multiplicacion){
            multiplicacion();
        }
        else if (e.getSource()==viewCalculadora.jb_division){
            division();
        }
        else if (e.getSource()==viewCalculadora.jb_modulo){
            residuo();
        }
    }
    public void desabilitar(){
        viewCalculadora.jtf_resultado.setVisible(false);
    }
    
    public void suma(){
        float numero1= 0.0f;
        float numero2= 0.0f;
        float resultado=0.0f;
        
        modelCalculadora.setNumero1(viewCalculadora.jtf_numero1.getText());
        modelCalculadora.setNumero2(viewCalculadora.jtf_numero2.getText());
        modelCalculadora.setResultado(viewCalculadora.jtf_resultado.getText());
        
        numero1 = dataValidation.sring2Int(viewCalculadora.jtf_numero1.getText());
        numero2 = dataValidation.sring2Int(viewCalculadora.jtf_numero2.getText());
        
        resultado = (numero1 )+ (numero2);
        viewCalculadora.jtf_resultado.setText(String.valueOf(resultado));
        viewCalculadora.jl_message.setText("Resultado: " + (resultado));
    }
    public void resta(){
        float numero1= 0.0f;
        float numero2= 0.0f;
        float resultado=0.0f;
        
        modelCalculadora.setNumero1(viewCalculadora.jtf_numero1.getText());
        modelCalculadora.setNumero2(viewCalculadora.jtf_numero2.getText());
        modelCalculadora.setResultado(viewCalculadora.jtf_resultado.getText());
        
        numero1 = dataValidation.sring2Int(viewCalculadora.jtf_numero1.getText());
        numero2 = dataValidation.sring2Int(viewCalculadora.jtf_numero2.getText());
        
        resultado = numero1 - numero2;
        viewCalculadora.jtf_resultado.setText(String.valueOf(resultado));
        viewCalculadora.jl_message.setText("El resultado de la resta es: " + (resultado));
    }
    public void multiplicacion(){
        float numero1= 0.0f;
        float numero2= 0.0f;
        float resultado=0.0f;
        
        modelCalculadora.setNumero1(viewCalculadora.jtf_numero1.getText());
        modelCalculadora.setNumero2(viewCalculadora.jtf_numero2.getText());
        modelCalculadora.setResultado(viewCalculadora.jtf_resultado.getText());
        
        numero1 = dataValidation.sring2Int(viewCalculadora.jtf_numero1.getText());
        numero2 = dataValidation.sring2Int(viewCalculadora.jtf_numero2.getText());
        
        resultado = numero1 * numero2;
        viewCalculadora.jtf_resultado.setText(String.valueOf(resultado));
        viewCalculadora.jl_message.setText("El resultado de la multiplicacion es: " + (resultado));
    }
    public void division(){
        float numero1= 0.0f;
        float numero2= 0.0f;
        float resultado=0.0f;
        
        modelCalculadora.setNumero1(viewCalculadora.jtf_numero1.getText());
        modelCalculadora.setNumero2(viewCalculadora.jtf_numero2.getText());
        modelCalculadora.setResultado(viewCalculadora.jtf_resultado.getText());
        
        numero1 = dataValidation.sring2Int(viewCalculadora.jtf_numero1.getText());
        numero2 = dataValidation.sring2Int(viewCalculadora.jtf_numero2.getText());
        
        resultado = numero1 / numero2;
        viewCalculadora.jtf_resultado.setText(String.valueOf(resultado));
        viewCalculadora.jl_message.setText("El resultado de la division es: " + (resultado));
    }
    public void residuo(){
        float numero1= 0.0f;
        float numero2= 0.0f;
        float resultado=0.0f;
        
        modelCalculadora.setNumero1(viewCalculadora.jtf_numero1.getText());
        modelCalculadora.setNumero2(viewCalculadora.jtf_numero2.getText());
        modelCalculadora.setResultado(viewCalculadora.jtf_resultado.getText());
        
        numero1 = dataValidation.sring2Int(viewCalculadora.jtf_numero1.getText());
        numero2 = dataValidation.sring2Int(viewCalculadora.jtf_numero2.getText());
        
        resultado = numero1 % numero2;
        viewCalculadora.jtf_resultado.setText(String.valueOf(resultado));
        viewCalculadora.jl_message.setText("El residuo es: " + (resultado));
    }
    public final void initComponents(){
        viewCalculadora.setVisible(true);
        viewCalculadora.jl_message.setText(modelCalculadora.getResultado());
    }
}
