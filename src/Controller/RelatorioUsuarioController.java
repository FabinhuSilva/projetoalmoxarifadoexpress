/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Relatorios.relatorioUsuario;
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
public class RelatorioUsuarioController {
 
    
      private final relatorioUsuario view;
        Connection conexao = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        PreparedStatement executar = null;
        
        Connection conexaoBD = new conexaoBancoController().conectarBanco();
     
        
    public RelatorioUsuarioController(relatorioUsuario view) {
        this.view = view;
        
    }
    
   
    public void consultarEmpresaNome(){
      
        int codigosituacaocadastro  = 0;
        if(view.getCboSitUsuario().getSelectedItem() == "Ativo"){
            codigosituacaocadastro = 0;
        }else{
            codigosituacaocadastro = 1;
        }
      
           String sql = "SELECT id,nome,login,email,'"+view.getCboSitUsuario().getSelectedItem()+"' as Situacao FROM usuario where nome LIKE ? and id_situacaocadastro = ? ";
             
       try {
    
            executar = conexaoBD.prepareStatement(sql);    
           
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setString(1, view.getNomeUsuario().getText()+"%");
            executar.setInt(2,codigosituacaocadastro);
            rs=executar.executeQuery();
          
        //a linha abixo vai usar a rs2XML.jar para preencher a Tabela
          view.getTabelaUsuarios().setModel(DbUtils.resultSetToTableModel(rs));    
        
       
          
       } catch (SQLException erro) {
            // Icones a 32px para caixa de mensagem
                ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
                JOptionPane.showMessageDialog(null," Erro na Consutla deste EPI \n Erro:  !"+erro,"Cadastro de EPI",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
       }
      
  }   
    
     public void consultartodos() throws SQLException{
     //https://www.youtube.com/watch?v=faPR87RX2c0&t=3s   
        int contadorRegistro = 0;
     
         Connection conectarBanco = new conexaoBancoController().conectarBanco();
         
         DefaultTableModel modelo = (DefaultTableModel) view.getTabelaUsuarios().getModel();
         modelo.setNumRows(0);
         
        view.getTabelaUsuarios().getColumnModel().getColumn(0).setPreferredWidth(80);
        view.getTabelaUsuarios().getColumnModel().getColumn(0).setResizable(false);
        
        view.getTabelaUsuarios().getColumnModel().getColumn(1).setPreferredWidth(600);
        view.getTabelaUsuarios().getColumnModel().getColumn(1).setResizable(true);
        
        view.getTabelaUsuarios().getColumnModel().getColumn(2).setPreferredWidth(300);
        view.getTabelaUsuarios().getColumnModel().getColumn(2).setResizable(true);
        
        view.getTabelaUsuarios().getColumnModel().getColumn(3).setPreferredWidth(300);
        view.getTabelaUsuarios().getColumnModel().getColumn(3).setResizable(true);
        
        view.getTabelaUsuarios().getColumnModel().getColumn(4).setPreferredWidth(800);
        view.getTabelaUsuarios().getColumnModel().getColumn(4).setResizable(true);
        
        view.getTabelaUsuarios().getColumnModel().getColumn(5).setPreferredWidth(80);
        view.getTabelaUsuarios().getColumnModel().getColumn(5).setResizable(false);
         
        try{
           //conexaoBD
           PreparedStatement pstm;
           ResultSet rs;
           String sql = "SELECT * FROM usuario;";
           pstm = conectarBanco.prepareStatement(sql);

           rs =  pstm.executeQuery();
           
           while(rs.next()){
               modelo.addRow(new Object[]{  
               rs.getInt(1),
               rs.getString(2),
               rs.getString(3),
               rs.getString(4),
               rs.getString(5),
               rs.getInt(6)   
               });
                contadorRegistro++;
           }
               conectarBanco.close();
               rs.close();
               pstm.close();
                     
                       // Icones a 32px para caixa de mensagem
                ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\salvar.png");
                JOptionPane.showMessageDialog(null, "Encontrados "+contadorRegistro+" Registros nesta consulta!","Consulta de Usuario",JOptionPane.PLAIN_MESSAGE,iconeSalvo);
                System.out.println("Consulta:"+sql);
               
               conectarBanco.close();
               rs.close();
               pstm.close();
           
           
        }catch(SQLException ex) {
            System.out.println("Erro: "+ex);
        }
    }
    
     
     public void oculatarCampos(){
         
         view.getOcultoIdUsuario().setVisible(false);
         view.getCodUsuarioAlterar().setEditable(false);
         view.getCodUsuarioAlterar().setEnabled(false);
         view.getOcultonomeFuncionario().setVisible(false);
                 
         //------------------------------------------
         
         view.getNomeUsuarioAlterar().setEnabled(false);
         view.getEmailUsuarioAlterar().setEnabled(false);
         view.getLoginUsuarioAlterar().setEnabled(false);
         view.getSenhaUsuarioAlterar().setEnabled(false);
         view.getCbosituacaoUsuarioAlterar().setEnabled(false);
         
         view.getBotaoAtualizarDados().setEnabled(false);
         
         
     }
     
     public void habilitarCampos(){
         
            view.getNomeUsuarioAlterar().setEnabled(true);
         view.getEmailUsuarioAlterar().setEnabled(true);
         view.getLoginUsuarioAlterar().setEnabled(true);
         view.getSenhaUsuarioAlterar().setEnabled(true);
         view.getCbosituacaoUsuarioAlterar().setEnabled(true);
         
         view.getBotaoAtualizarDados().setEnabled(true);
         
     }
     
     
     public void selecionarUsuario(){
         
        int setar = view.getTabelaUsuarios().getSelectedRow(); 
        int codigoFuncTabela = (int) view.getTabelaUsuarios().getModel().getValueAt(setar, 0);
        String nomeUsuario = (String) view.getTabelaUsuarios().getModel().getValueAt(setar, 1);
        view.getOcultoIdUsuario().setText(String.valueOf(codigoFuncTabela));
        view.getOcultonomeFuncionario().setText(String.valueOf(nomeUsuario));
     
         System.out.println(codigoFuncTabela);
         System.out.println(nomeUsuario);
         
     }
     
     public void limparTabela(){
         
          DefaultTableModel tabela = (DefaultTableModel)view.getTabelaUsuarios().getModel(); 
          tabela.setNumRows(0);
         
     }
     
      public void excluirUsuario(){
       
        if (!view.getOcultoIdUsuario().getText().isEmpty() == true) {
       
        int setar = view.getTabelaUsuarios().getSelectedRow(); 
        int codigoUsuario = Integer.valueOf(view.getTabelaUsuarios().getModel().getValueAt(setar, 0).toString());
        String nomeFuncionario = view.getTabelaUsuarios().getModel().getValueAt(setar, 1).toString();
       
           
       int i = JOptionPane.showConfirmDialog(null, "Deseja alterar o Status para Excluido do Usuario: ?\n usuario: "+nomeFuncionario,"Exclusão de Usuario",JOptionPane.OK_CANCEL_OPTION);
   
      
       
if(i == JOptionPane.OK_OPTION) {
     
       String sql = "Update usuario set id_situacaocadastro = 1 where id = ?;";
             
       try {
            executar = conexaoBD.prepareStatement(sql);    
            executar.setInt(1,Integer.valueOf( codigoUsuario));
            executar.execute();
            
   codigoUsuario = 0;
   limparTabela();
   
    ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\salvar.png");
    JOptionPane.showMessageDialog(null," Exclusão Realizada com Sucesso!","Exclusão de Usuario",JOptionPane.PLAIN_MESSAGE,iconeSalvo ); 
       }catch(SQLException erro){
            // Icones a 32px para caixa de mensagem
    ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
    JOptionPane.showMessageDialog(null," Erro Exclusão deste Usuario \n Erro:  !"+erro,"Cadastro de Usuario",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
           
       }
}else if(i == JOptionPane.CANCEL_OPTION) {
   
} 
       }else{
 // Icones a 32px para caixa de mensagem
    ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
    JOptionPane.showMessageDialog(null," \nSelecione um Funcinoario Valido para continuar a exclusão! \n ","Exclusão de Funcionario",JOptionPane.PLAIN_MESSAGE,iconeSalvo ); 
              
   }
  
      }
   
      public void carregarDados() throws SQLException{
       
          
            if (!view.getOcultoIdUsuario().getText().isEmpty() == true) {
                
                habilitarCampos();
          
        int codigosituacaocadastro  = 0;
        if(view.getCbosituacaoUsuarioAlterar().getSelectedItem() == "Ativo"){
            codigosituacaocadastro = 0;
        }else{
            codigosituacaocadastro = 1;
        }
    
          String sql = " SELECT * FROM usuario WHERE id = ?;";
       
           executar = conexaoBD.prepareStatement(sql);    
           
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setInt(1,Integer.valueOf( view.getOcultoIdUsuario().getText()));
            rs=executar.executeQuery();
         
          if(rs.next()){
                            
           view.getCodUsuarioAlterar().setText(rs.getString("id"));
           view.getNomeUsuarioAlterar().setText(rs.getString("nome"));
           view.getEmailUsuarioAlterar().setText(rs.getString("email"));
           view.getLoginUsuarioAlterar().setText(rs.getString("login"));
           view.getSenhaUsuarioAlterar().setText(rs.getString("senha"));  
                          
          }
            }else{
              // Icones a 32px para caixa de mensagem
    ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\atencao.png");
    JOptionPane.showMessageDialog(null," Selecione um Funcinoario Valido para continuar a Edição deste Cadastro! \n ","Exclusão de Funcionario",JOptionPane.PLAIN_MESSAGE,iconeSalvo );    
                
            }
   }
    
 public void alteraDadosUsuario() throws SQLException {

      
        int codigoSit  = 0;
        if(view.getCbosituacaoUsuarioAlterar().getSelectedItem() == "Ativo"){
            codigoSit = 0;
        }else{
            codigoSit = 1;
        }
    
        int codigoAlterado = Integer.valueOf(view.getOcultoIdUsuario().getText());
        System.out.println("ID Selecionado: " +codigoAlterado);
        
          String sql = "UPDATE usuario SET  nome = ?, login = ?, senha = ?, email = ?,id_situacaocadastro = '"+codigoSit+"'  WHERE id = '"+codigoAlterado+"';";


  int i = JOptionPane.showConfirmDialog(null, "Deseja atualizar os dados da Empresa: \n"+view.getNomeUsuarioAlterar().getText()+"\n"+"E-Mail : "+view.getEmailUsuarioAlterar().getText(),"Atualização de dados Usuario",JOptionPane.OK_CANCEL_OPTION);
  
  if(i == JOptionPane.YES_OPTION) {  
           executar = conexaoBD.prepareStatement(sql);    
           
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setString(1,view.getNomeUsuarioAlterar().getText());
            executar.setString(2,view.getEmailUsuarioAlterar().getText());
            executar.setString(3,view.getLoginUsuarioAlterar().getText());
            executar.setString(4,view.getSenhaUsuarioAlterar().getText());                       
                               
            
            executar.execute();
            
             limparcampos();
             limparTabela();
             oculatarCampos();
             
             
              // Icones a 32px para caixa de mensagem
    ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\salvar.png");
    JOptionPane.showMessageDialog(null," \nAtualização realizada com sucesso! \n ","Atualização de Usuario",JOptionPane.PLAIN_MESSAGE,iconeSalvo ); 
  } else if(i == JOptionPane.CANCEL_OPTION) {
   
    }                   
}
      
     public void limparcampos(){
         
           
           view.getNomeUsuarioAlterar().setText("");
           view.getEmailUsuarioAlterar().setText("");
           view.getLoginUsuarioAlterar().setText("");
           view.getSenhaUsuarioAlterar().setText("");  
     } 
      
}
