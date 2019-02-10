/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author ricardobalduino
 */
public class NewClass extends JFrame {

    public NewClass() throws HeadlessException {
        super("Teste");
        getContentPane().setLayout(new BorderLayout());
        Date date = new Date();
        SpinnerDateModel sdm = new SpinnerDateModel(date, null, null, Calendar.DAY_OF_MONTH);
        JSpinner spinner = new JSpinner(sdm);
        JSpinner.DateEditor de = new JSpinner.DateEditor(spinner, "dd/mm/yyyy");
        add(spinner, BorderLayout.SOUTH );
        setSize(100, 100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args){
        new NewClass();
    }
    
}
