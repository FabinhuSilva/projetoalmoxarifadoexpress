/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Relatorios.relatorioEmpresa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Fabinhu
 */
public class RelatorioEmpresaController {
 
        private final relatorioEmpresa view;
        Connection conexao = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        PreparedStatement executar = null;
        
            Connection conexaoBD = new conexaoBancoController().conectarBanco();
     
        
    public RelatorioEmpresaController(relatorioEmpresa view) {
        this.view = view;
        
    }
    
    
     public void consultarEmpresaNome(){
      
        int codigosituacaocadastro  = 0;
        if(view.getCboSitEmpresa().getSelectedItem() == "Ativo"){
            codigosituacaocadastro = 0;
        }else{
            codigosituacaocadastro = 1;
        }
      
           String sql = "SELECT id,descricao,cnpj FROM empresa where descricao LIKE ? and id_situacaocadastro = ? ";
             
       try {
    
            executar = conexaoBD.prepareStatement(sql);    
           
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setString(1, view.getDescEmpresa().getText()+"%");
            executar.setInt(2,codigosituacaocadastro);
            rs=executar.executeQuery();
          
        //a linha abixo vai usar a rs2XML.jar para preencher a Tabela
          view.getTabelaDescEmpresa().setModel(DbUtils.resultSetToTableModel(rs));    
        
       
          
       } catch (SQLException erro) {
            // Icones a 32px para caixa de mensagem
                ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
                JOptionPane.showMessageDialog(null," Erro na Consutla deste EPI \n Erro:  !"+erro,"Cadastro de EPI",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
       }
      
  }   
    
     public void ocultarCamposEmpresa(){
         
         view.getPanedescEmpresa().setColumnHeader(null);
         view.getOcultoIdEmpresa().setVisible(false);
         view.getOcultonomeEmpresa().setVisible(false);
         
     }
     
     
        public void codigoEmpresa(){
      
        int setar = view.getTabelaDescEmpresa().getSelectedRow(); 
        int codigoFuncTabela = (int) view.getTabelaDescEmpresa().getModel().getValueAt(setar, 0);
        String nomeEmpresa = (String) view.getTabelaDescEmpresa().getModel().getValueAt(setar, 1); 
        view.getOcultoIdEmpresa().setText(String.valueOf(codigoFuncTabela));
        view.getOcultonomeEmpresa().setText(String.valueOf(nomeEmpresa));

    
    }
     
     
 public void consultarEmpresaCNPJ(){
      
        int codigosituacaocadastro  = 0;
        if(view.getCboSitEmpresa().getSelectedItem() == "Ativo"){
            codigosituacaocadastro = 0;
        }else{
            codigosituacaocadastro = 1;
        }
      
           String sql = "SELECT id,descricao,cnpj FROM empresa where cnpj = ? and id_situacaocadastro = ? ";
             
       try {
    
            executar = conexaoBD.prepareStatement(sql, rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_UPDATABLE);    
           
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setString(1, view.getCnpjEmpresa().getText());
            executar.setInt(2,codigosituacaocadastro);
            rs=executar.executeQuery();
          
        //a linha abixo vai usar a rs2XML.jar para preencher a Tabela
        
           if (rs.first()) {
               
               view.getOcultoIdEmpresa().setText(rs.getString("id"));
               view.getNomeEmpresa().setText(rs.getString("descricao"));
               view.getOcultonomeEmpresa().setText(rs.getString("descricao"));
               System.out.println(view.getOcultonomeEmpresa().getText());
           }
        

          
       } catch (SQLException erro) {
            // Icones a 32px para caixa de mensagem
                ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
                JOptionPane.showMessageDialog(null," Erro na Consutla deste EPI \n Erro:  !"+erro,"Cadastro de EPI",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
       }
      
  } 
    
 
  public void consultarEmpresa(){
      
      if (!view.getOcultoIdEmpresa().getText().isEmpty() == true) {
          
      
        int codigosituacaocadastro  = 0;
        if(view.getCboSitEmpresa().getSelectedItem() == "Ativo"){
            codigosituacaocadastro = 0;
        }else{
            codigosituacaocadastro = 1;
        }
      
           String sql = "SELECT id, descricao,cnpj,ie,endereco,'"+view.getCboSitEmpresa().getSelectedItem()+"' as SituacãoCad FROM empresa where id = ? and id_situacaocadastro = ? ";
             
       try {
    
            executar = conexaoBD.prepareStatement(sql, rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_UPDATABLE);    
           
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setInt(1,Integer.parseInt( view.getOcultoIdEmpresa().getText()));
            executar.setInt(2,codigosituacaocadastro);
            rs=executar.executeQuery();
          
        //a linha abixo vai usar a rs2XML.jar para preencher a Tabela
         view.getTabelaResultadoConsultaEmpresa().setModel(DbUtils.resultSetToTableModel(rs));    
     
          
       } catch (SQLException erro) {
            // Icones a 32px para caixa de mensagem
                ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
                JOptionPane.showMessageDialog(null," Erro na Consutla de Empresa \n Erro:  !"+erro,"Consulta de Empresa",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
       }
       
      }else{
          
           ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
           JOptionPane.showMessageDialog(null," \nSeleciona uma empresa seja consultando por Descrição ou CNPJ!","Consulta de Empresa",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
          
      }  
  } 
  
  
  public void limparCampos(){
      
      DefaultTableModel tabela = (DefaultTableModel) view.getTabelaDescEmpresa().getModel(); 
      tabela.setNumRows(0);
      view.getCnpjEmpresa().setText("");
      view.getNomeEmpresa().setText("");
      view.getDescEmpresa().setText("");
      
  }

     
        public void excluirEmpreesa(){
       
        if (!view.getOcultoIdEmpresa().getText().isEmpty() == true) {
       
            /*
        int setar = view.getTabelaNomeConsulta().getSelectedRow(); 
        int codigoFuncionario = Integer.valueOf(view.getTabelaNomeConsulta().getModel().getValueAt(setar, 0).toString());
        String nomeFuncionario = view.getTabelaNomeConsulta().getModel().getValueAt(setar, 1).toString();
         */
           
       int i = JOptionPane.showConfirmDialog(null, "Deseja alterar o Status para Excluido desta Empresa?\n Emrpesa: "+view.getOcultonomeEmpresa().getText(),"Exclusão Empresa",JOptionPane.OK_CANCEL_OPTION);
   
       
if(i == JOptionPane.YES_OPTION) {
     
       String sql = "Update empresa set id_situacaocadastro = 1 where id = ?;";
             
       try {
            executar = conexaoBD.prepareStatement(sql);    
            executar.setInt(1,Integer.valueOf( view.getOcultoIdEmpresa().getText()));
            executar.execute();
            
  view.getOcultoIdEmpresa().setText("0");
   
    ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\salvar.png");
    JOptionPane.showMessageDialog(null," Exclusão Realizada com Sucesso!","Exclusão de Empresa",JOptionPane.PLAIN_MESSAGE,iconeSalvo ); 
       }catch(SQLException erro){
            // Icones a 32px para caixa de mensagem
    ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
    JOptionPane.showMessageDialog(null," Erro Exclusão desta Empresa \n Erro:  !"+erro,"Cadastro de Empresa",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
           
       }
}else if(i == JOptionPane.CANCEL_OPTION) {
   
}
       }else{
 // Icones a 32px para caixa de mensagem
    ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
    JOptionPane.showMessageDialog(null," \nSelecione uma Empresa Valida para continuar a exclusão! \n ","Exclusão de Funcionario",JOptionPane.PLAIN_MESSAGE,iconeSalvo );  
       }
              
   }
 
        
    public void bloquearcamposeditar(){
     
        view.getCodAlterar().setEditable(false);
        view.getCodAlterar().setEnabled(false);
        
        view.getDescAlterar().setEnabled(false);
        view.getCnpjcpfAlterar().setEnabled(false);
        view.getIeAlterar().setEnabled(false);
        view.getCboSituacaoAlterar().setEnabled(false);
        view.getEnderecoAlterar().setEnabled(false);
        
    }
    public void desbloquearcamposeditar(){
     
        view.getCodAlterar().setEditable(false);
        view.getCodAlterar().setEnabled(true);
        
        view.getDescAlterar().setEnabled(true);
        view.getCnpjcpfAlterar().setEnabled(true);
        view.getIeAlterar().setEnabled(true);
        view.getCboSituacaoAlterar().setEnabled(true);
        view.getEnderecoAlterar().setEnabled(true);
        
        //-----Combo Setor
        view.getCboSituacaoAlterar().addItem("");
        view.getCboSituacaoAlterar().setSelectedIndex(2);
    }

 public void editarFuncinoario() throws SQLException{
       
        int codigosituacaocadastro  = 0;
        if(view.getCboSituacaoAlterar().getSelectedItem() == "Ativo"){
            codigosituacaocadastro = 0;
        }else{
            codigosituacaocadastro = 1;
        }
    
          String sql = " SELECT * FROM empresa WHERE id = ?;";
       
           executar = conexaoBD.prepareStatement(sql);    
           
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setInt(1,Integer.valueOf( view.getOcultoIdEmpresa().getText()));
            rs=executar.executeQuery();
         
          if(rs.next()){
            
             view.getCodAlterar().setText( rs.getString("id"));
             view.getDescAlterar().setText( rs.getString("descricao"));
             view.getCnpjcpfAlterar().setText( rs.getString("cnpj"));
             view.getIeAlterar().setText( rs.getString("ie"));
             view.getEnderecoAlterar().setText(rs.getString("endereco"));
                           
          }
       
   }

  public void alteracamposEmpresa() throws SQLException{
       
    
      
        int codigoSit  = 0;
        if(view.getCboSitEmpresa().getSelectedItem() == "Ativo"){
            codigoSit = 0;
        }else{
            codigoSit = 1;
        }
    
        int codigoAlterado = Integer.valueOf(view.getOcultoIdEmpresa().getText());
        System.out.println("ID Selecionado: " +codigoAlterado);
        
          String sql = "UPDATE empresa SET  descricao = ?, cnpj = ?, ie = ?, endereco = ?,id_situacaocadastro = '"+codigoSit+"'  WHERE id = '"+view.getCodAlterar().getText()+"';";


  int i = JOptionPane.showConfirmDialog(null, "Deseja atualizar os dados da Empresa: \n"+view.getDescAlterar().getText()+"\n"+"CNPJ/CPF: "+view.getCnpjcpfAlterar().getText(),"Atualização de dados Empresa",JOptionPane.OK_CANCEL_OPTION);
  
  if(i == JOptionPane.YES_OPTION) {  
           executar = conexaoBD.prepareStatement(sql);    
           
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setString(1,view.getDescAlterar().getText());
            executar.setString(2,view.getCnpjcpfAlterar().getText());
            executar.setString(3,view.getIeAlterar().getText());
            executar.setString(4,view.getEnderecoAlterar().getText());                       
            executar.execute();
            
             limparcampos();
             
              // Icones a 32px para caixa de mensagem
    ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\salvar.png");
    JOptionPane.showMessageDialog(null," \nAtualização realizada com sucesso! \n ","Atualização de Emprsa",JOptionPane.PLAIN_MESSAGE,iconeSalvo ); 
  } else if(i == JOptionPane.CANCEL_OPTION) {
   
    }                   
}
 
  public void limparcampos(){
      
             view.getCodAlterar().setText( "");
             view.getDescAlterar().setText( "");
             view.getCnpjcpfAlterar().setText( "");
             view.getIeAlterar().setText( "");
             view.getEnderecoAlterar().setText("");
             
             bloquearcamposeditar();
      
  }
  
}
