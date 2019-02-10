/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;

/**
 *
 * @author ricardobalduino
 */
public class CadastroEmpresaControlador implements FocusListener {

//    public boolean validarNome(String nome){
//        
//    }
//    
//    public boolean validarCnpj(String cnpj){
//        
//    }

    @Override
    public void focusGained(FocusEvent e) {
        JTextField txt = (JTextField) e.getComponent();
        
        if ( !"".equals( txt.getText().trim() ) ){
            
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
