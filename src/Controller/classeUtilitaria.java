/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.menuPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import Controller.loginController;
import java.text.DateFormat;
import java.util.Calendar;
import javax.swing.JLabel;

/**
 *
 * @author Fabinhu
 */
public class classeUtilitaria {

     private final menuPrincipal view;
    
       
     
    public classeUtilitaria(menuPrincipal view) {
        this.view = view;
       
    }
    
      Connection conexaoBD = new conexaoBancoController().conectarBanco();
      PreparedStatement pst = null;
      ResultSet rs = null;
      PreparedStatement executar = null; 
      
       
    
public void encerrarAplicativo(){
        
               int i = JOptionPane.showConfirmDialog(null, "Deseja encerrar o Sistema?\n" ,"Encerrando",JOptionPane.OK_CANCEL_OPTION);
   
       
if(i == JOptionPane.YES_OPTION) {
  System.exit(0);
 
}else if(i == JOptionPane.CANCEL_OPTION) {
   
}

}

public void atualizarData(){
    
    Date dataHoraAtual = new Date();
    String dataFormatada = new SimpleDateFormat("dd/MM/YYYY").format(dataHoraAtual);
    view.getData().setText(dataFormatada); 
  
   
}

public void atualizarHora(){
 
    //view.getHora().setBounds(10,37,60,20);
    Thread th = new Thread(new Runnable() { //cria uma thread
        public void run() {
            while(true) { //roda indefinidamente
                Date data = Calendar.getInstance().getTime();
                DateFormat h = DateFormat.getTimeInstance();
                view.getHora().setText(h.format(data));     
                try {
                    Thread.sleep(1000); //espera 1 segundo para fazer a nova evolução
                } catch(InterruptedException ex){
                }
            }
        }
    }); th.start();
    
}

}
