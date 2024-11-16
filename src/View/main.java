/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Controller.arquivoConfiguracaoBanco;
import Controller.conexaoBancoController;
import Model.DAO.usuarioDAO;
import Model.epi;
import Model.usuario;
import com.sun.jdi.connect.spi.Connection;
import java.sql.ResultSet;

import java.sql.SQLException;
/**
 *
 * @author Fabinhu
 */
public class main {
    
    public static void main(String[] args) throws SQLException {
    
      /*         usuario usuarioTeste = new usuario("Fabiano071124", "LoginFabiano","SenhaFabiano","fabiano.fesilva@gmail.com",1);

      java.sql.Connection conexaoBD = new conexaoBancoController().getC();
      Model.DAO.usuarioDAO usuario = new Model.DAO.usuarioDAO((java.sql.Connection) conexaoBD);
      usuario.salvarUsuario(usuarioTeste);
        */
        
     
   // Model.DAO.setorDAO setor = new Model.DAO.setorDAO();
    //setor.salvarSetor();   
    
    //Model.DAO.funcionarioDAO setor = new Model.DAO.funcionarioDAO();
    //setor.salvarFuncionario();   
    
    /*
    String sql = "select * from emrpesa";
    
    Controller.conexaoBancoController conecta = new Controller.conexaoBancoController();
   
    
    Model.DAO.agendamentoDAO agenda = new Model.DAO.agendamentoDAO();
   
    ResultSet rs = agenda.buscaCadastro(sql);
    
    try{
        while(rs.next()){
            int id = rs.getInt("id");
            String descricao = rs.getString("Nome Empresa");
            String cnpj = rs.getString("CNPJ");
            String ie = rs.getString("Inscrição  Estadual");
            String observacao = rs.getString("Observacao");
            int id_situacaocadastro= rs.getInt("Situacao Cadastro");
            System.out.println("Empresa"+id+" - "+descricao);
            
            
            
        }
    }catch(Exception e){
        System.out.println(e);
    }
    
    */
     
    
    //Model.DAO.usuarioDAO usuario = new Model.DAO.usuarioDAO();
    //usuario.salvarUsuario();
     
        //Controller.arquivoConfiguracaoBanco arquivo  = new Controller.arquivoConfiguracaoBanco();
        
       /*arquivoConfiguracaoBanco dadosBanco = new arquivoConfiguracaoBanco();
        dadosBanco.escrever();
        */
    /*   
    dadosBanco.setNomeBanco("almoxarifado");
    dadosBanco.setEnderecoBanco("127.0.0.1");
    dadosBanco.setPortaBanco(5432);
    dadosBanco.setUsuarioBanco("postgres");
    dadosBanco.setSenhaBanco("VrPost@Server");
    */
    
    
    
    
    
    

        
 
     
       /* 
        String descricao = "Fabiano";
        System.out.println(descricao);
        
        Model.epi cadastro = new Model.epi(1,"protetor auriocular",30,true,true,"Colocar no ouvido limpo",10,"Fabiano empresa de EPI","123456","trocar apenas com a apresentação do velho");
        System.out.println(cadastro.getDescricao());
        System.out.println(cadastro.getInstrucao());
        */
        
        
        
        
    }    
}


//, 30,1,1,"Colocar no ouvido limpo",10,"Fabiano empresa de EPI","123456","trocar apenas com a apresentação do velho"