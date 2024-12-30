/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.menuPrincipal;
import java.awt.Component;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabinhu
 */
public class classeUtilitaria {

     private final menuPrincipal view;
    
    public classeUtilitaria(menuPrincipal view) {
        this.view = view;
       
    }
    
    
    
public void encerrarAplicativo(){
        
               int i = JOptionPane.showConfirmDialog(null, "Deseja encerrar o Sistema?\n" ,"Encerrando",JOptionPane.OK_CANCEL_OPTION);
   
       
if(i == JOptionPane.YES_OPTION) {
  System.exit(0);
 
}else if(i == JOptionPane.CANCEL_OPTION) {
   
}
  
    
    
    
    
    }
}    
    

