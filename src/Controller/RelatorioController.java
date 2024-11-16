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
public class RelatorioController {
    
  private Connection conBanco;

    public RelatorioController() {
        
    }

    /*
    public RelatorioController(Connection conBanco) {
        this.conBanco = conBanco;
    }*/
 
    public void sqlConsultaRelatorio(String SqlConsulta){
     
        //Usar isEmpty() para campo vazio
       String sql = null;
       
        sql = "select * from usuario where nome = "+conteudonome+" and login="conteudologin" and email="conteudoemail" and id_situacaocadastro="";";
        
       if(nome == vazio && login == vazio && email == vazio){
          
       }else if(login =! vazio ){
           sql = "select * from usuario where nome like "conteudo_campo_nome" ";
       }else if(login == vazio && email == vazio){
           sql = "select * from usuario where nome like "conteudo_campo_nome" ";
           
       }
        
        
    }
    
    public void limparTelaConsultaRelatorio(){
        
        /* Carregar todos os campos
        
        CampoDeTexto.setText(""); 
           Para deixar os campos vazios
        
        */
    }
    
}
