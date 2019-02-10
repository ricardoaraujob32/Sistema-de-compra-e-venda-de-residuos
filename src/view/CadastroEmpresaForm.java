/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author ricardobalduino
 */
public class CadastroEmpresaForm {
    private JDialog dialogo;

    public CadastroEmpresaForm(JFrame frame) {
        dialogo = new JDialog(frame, "Teste", true);
        Container container = dialogo.getContentPane();
        JButton btnNovo = new JButton("Novo");
        JButton btnAlterar = new JButton("Alterar");
        JButton btnExcluir = new JButton("Excluir");
        JButton btnFechar = new JButton("Fechar");
        JPanel pnlCentro = new PainelCentral();
        JPanel pnlSul = new JPanel( new FlowLayout(FlowLayout.CENTER) ) ;
        
        container.setLayout( new BorderLayout() );
                
        pnlSul.add(btnNovo);
        pnlSul.add(btnAlterar);
        pnlSul.add(btnExcluir);
        pnlSul.add(btnFechar);
        
        container.add(pnlCentro, BorderLayout.CENTER);
        container.add(pnlSul, BorderLayout.SOUTH);
        
        dialogo.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        dialogo.setSize(600, 400);
        dialogo.setVisible(true);
        dialogo.setResizable(false);
    }
    
    
}

class PainelCentral extends JPanel {    
    public PainelCentral() {        
        Box boxOeste = Box.createVerticalBox();
        Box boxCentro = Box.createVerticalBox();
        JTextField txtNome = new JTextField(50);
        JTextField txtCnpj = new JTextField(20);
        JTextField txtRamo = new JTextField(50);
        JTextField txtEndereco = new JTextField(50);
        JTextField txtBairro = new JTextField(50);
        JTextField txtTelefone = new JTextField(20);
        JTextField txtResponsavel = new JTextField(50);
        JTextField txtRg = new JTextField(15);
        JTextField txtCargo = new JTextField(50);
        JTextField txtEmail = new JTextField(50);
        String label[] = {"Nome:", "CNPJ:", "Ramo:", "Endereço:",
            "Bairro:", "Telefone:", "Responsável:", "RG:", "Cargo:", "E-Mail:"};
                
        setLayout( new BorderLayout() );
        
        for (int i = 0; i < label.length; i++) {
            boxOeste.add( Box.createVerticalStrut(10) );
            boxOeste.add( new JLabel(label[i], SwingConstants.RIGHT) );
            boxOeste.add( Box.createVerticalStrut(7) );
        }
        
        boxCentro.add( Box.createVerticalStrut(10) );
        boxCentro.add(txtNome);
        
        boxCentro.add( Box.createVerticalStrut(10) );
        boxCentro.add(txtCnpj);
        
        boxCentro.add( Box.createVerticalStrut(10) );
        boxCentro.add(txtRamo);
        
        boxCentro.add( Box.createVerticalStrut(10) );
        boxCentro.add(txtEndereco);
        
        boxCentro.add( Box.createVerticalStrut(10) );
        boxCentro.add(txtBairro);
        
        boxCentro.add( Box.createVerticalStrut(10) );
        boxCentro.add(txtTelefone);
        
        boxCentro.add( Box.createVerticalStrut(10) );
        boxCentro.add(txtResponsavel);
        
        boxCentro.add( Box.createVerticalStrut(10) );
        boxCentro.add(txtRg);
        
        boxCentro.add( Box.createVerticalStrut(10) );
        boxCentro.add(txtCargo);
        
        boxCentro.add( Box.createVerticalStrut(10) );
        boxCentro.add(txtEmail);
        
        add(boxOeste, BorderLayout.WEST);
        add(boxCentro, BorderLayout.CENTER);
    }
}
