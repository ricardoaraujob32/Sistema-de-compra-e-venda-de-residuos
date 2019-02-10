/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author ricardobalduino
 */
public class MenuPrincipal {
    private JFrame janela;

    public MenuPrincipal() {
        janela = new JFrame("Ecolore");
        Container container = janela.getContentPane();
        
    }
    
    private JMenuBar criarMenu(){
        JMenuBar barra = new JMenuBar();
        JMenu btnNovo = new JMenu("Novo");
        JMenu btnCadastro = new JMenu("Cadastro");
        JMenuItem menuCadEmpresa = new JMenuItem("Cadastrar empresa");
        JMenuItem menuCadAnuncio = new JMenuItem("Anunciar resíduo");
        
        
        return barra;
    }
    
}

class PainelMenuPrincipal extends JPanel {
    
}
