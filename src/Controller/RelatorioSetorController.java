/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Model.DAO.Relatorio.relatorioConsultaUsuario;
import javax.swing.ListSelectionModel;


/**
 * private final Connection conBanco;

    public usuarioDAO(Connection conBanco) {
        this.conBanco = conBanco;
    }
    * https://www.youtube.com/watch?v=gDOxpJ_kjEw
    * https://www.youtube.com/watch?v=O4BdT0q-740&t=7s Conexao com Banco
    * 
    * 
 * @author Fabinhu
 */
public class RelatorioSetorController {
    
  private Connection conBanco;

    public RelatorioSetorController() {
        
    }

    /*
    public RelatorioSetorController(Connection conBanco) {
        this.conBanco = conBanco;
    }*/
 
    public void sqlConsultaRelatorio(String SqlConsulta){ 
         
        /* Carregar todos os campos
        
        CampoDeTexto.setText(""); 
           Para deixar os campos vazios
        
        */
    }
    
}
