/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import View.Relatorios.relatorioEpi;
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
public class RelatorioEpiController {
    
      private final relatorioEpi view;
        Connection conexao = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        PreparedStatement executar = null;
        
Connection conexaoBD = new conexaoBancoController().conectarBanco();
     
        
    public RelatorioEpiController(relatorioEpi view) {
        this.view = view;
        
    }
    
    public void ocultarCampos(){
        view.getIdOcultoEPI().setVisible(false);
        view.getIdOcultoEmpresa().setVisible(false);
        view.getNomeOcultoEPI().setVisible(false);
        view.getNomeOcultoemprsa().setVisible(false);
        view.getIdOcultoEmpresaalterar().setVisible(false);
        
            view.getCodAlterarEPI().setEnabled(false);
             view.getDescAlterarEPI().setEnabled(false);
             view.getValAlterarEPI().setEnabled(false);
             view.getCodCAAlterarEPI().setEnabled(false);
             view.getLoteCAAlterarEPI().setEnabled(false);
             view.getIdOcultoEmpresa().setEnabled(false);
             view.getObservacaoAlterarEPI().setEnabled(false);
             view.getRiscoAlterarEPI().setEnabled(false);
             view.getCboDescartavelAlterarEPI().setEnabled(false);
             view.getCboDevolvetAlterarEPI().setEnabled(false);
             view.getCbosituacaoEpiAlterar().setEnabled(false);
             view.getDescEmpAlterarEPI().setEnabled(false);
             view.getCodEmpAlterarEPI().setEnabled(false);
    }
    
    public void consultarEPIDesc(){
         
        view.getBotaoEditar().setEnabled(true);
        
        int codigosituacaocadastro  = 0;
        if(view.getCboSituacaoEpi().getSelectedItem() == "Ativo"){
            codigosituacaocadastro = 0;
        }else{
            codigosituacaocadastro = 1;
        }
        
         int descartavel  = 0;
        if(view.getCboDescartavelConsulta().getSelectedItem() == "Sim"){
            descartavel = 0;
        }else{
            descartavel = 1;
        }
        
        int devolver  = 0;
        if(view.getCboDevolverconsulta().getSelectedItem() == "Sim"){
            devolver = 0;
        }else{
            devolver = 1;
        }
        
      
           String sql = "SELECT * FROM epi where descricao LIKE ? and id_situacaocadastro = ?  and descartavel = ? and devolver = ?";
             
       try {
    
            executar = conexaoBD.prepareStatement(sql);    
           
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setString(1, view.getDescEpi().getText()+"%");
            executar.setInt(2,codigosituacaocadastro);
            executar.setInt(3,descartavel);
            executar.setInt(4,devolver);
            rs=executar.executeQuery();
          
        //a linha abixo vai usar a rs2XML.jar para preencher a Tabela
          view.getTabelaConsutlaEpi().setModel(DbUtils.resultSetToTableModel(rs));    


       
          
       } catch (SQLException erro) {
            // Icones a 32px para caixa de mensagem
                ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
                JOptionPane.showMessageDialog(null," Erro na Consutla deste EPI \n Erro:  !"+erro,"Consulta de EPI",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
       }
      
  } 
    
    
  public void consultarEmpresaDesc(){
              
      
        view.getBotaoEditar().setEnabled(false);
        
        int codigosituacaocadastro  = 0;
        if(view.getCboSituacaoEpi().getSelectedItem() == "Ativo"){
            codigosituacaocadastro = 0;
        }else{
            codigosituacaocadastro = 1;
        }
        
         int descartavel  = 0;
        if(view.getCboDescartavelConsulta().getSelectedItem() == "Sim"){
            descartavel = 0;
        }else{
            descartavel = 1;
        }
        
        int devolver  = 0;
        if(view.getCboDevolverconsulta().getSelectedItem() == "Sim"){
            devolver = 0;
        }else{
            devolver = 1;
        }
        
      
           String sql = "SELECT epi.id, epi.descricao,epi.validade,epi.codigoca,epi.loteca,epi.instrucao,epi.id_situacaocadastro, epi.devolver,epi.descartavel,empresa.id,empresa.descricao,empresa.cnpj, empresa.ie FROM epi INNER JOIN empresa on empresa.id = epi.id_empresa WHERE empresa.descricao LIKE ? and epi.id_situacaocadastro = ?  and epi.descartavel = ? and epi.devolver = ?";
             
       try {
    
            executar = conexaoBD.prepareStatement(sql);    
           
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setString(1, view.getNomeEmpresaEPi().getText()+"%");
            executar.setInt(2,codigosituacaocadastro);
            executar.setInt(3,descartavel);
            executar.setInt(4,devolver);
            rs=executar.executeQuery();
          
        //a linha abixo vai usar a rs2XML.jar para preencher a Tabela
          view.getTabelaConsutlaEpi().setModel(DbUtils.resultSetToTableModel(rs));    
                      
          
       } catch (SQLException erro) {
            // Icones a 32px para caixa de mensagem
                ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
                JOptionPane.showMessageDialog(null," Erro na Consutla deste EPI \n Erro:  !"+erro,"Consulta de EPI",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
       }
      
  }  
 

         public void codigoEpi(){
      
        int setar = view.getTabelaConsutlaEpi().getSelectedRow(); 
        int codigoEpiTabela = (int) view.getTabelaConsutlaEpi().getModel().getValueAt(setar, 0);
        view.getNomeOcultoEPI().setText((String) view.getTabelaConsutlaEpi().getModel().getValueAt(setar, 1));
        int codigoEmpresa = (int) view.getTabelaConsutlaEpi().getModel().getValueAt(setar, 5);
        
        view.getIdOcultoEPI().setText(String.valueOf(codigoEpiTabela));
        view.getIdOcultoEmpresa().setText(String.valueOf(codigoEmpresa));
        //view.getIdOcultoEPI().setText(String.valueOf(codigoEpiTabela));
             System.out.println(view.getIdOcultoEPI().getText());
             System.out.println( view.getNomeOcultoEPI().getText());
             System.out.println(view.getIdOcultoEmpresa().getText());
         }
  
  
        public void excluirEPI(){
       
            
            
        if (!view.getIdOcultoEPI().getText().isEmpty() == true) {
       
           
       int i = JOptionPane.showConfirmDialog(null, "Deseja alterar o Status para Excluido deste EPI?\n Emrpesa: "+view.getNomeOcultoEPI().getText(),"Exclusão EPI",JOptionPane.OK_CANCEL_OPTION);
   
       
if(i == JOptionPane.YES_OPTION) {
     
       String sql = "Update epi set id_situacaocadastro = 1 where id = ?;";
             
       try {
            executar = conexaoBD.prepareStatement(sql);    
            executar.setInt(1,Integer.valueOf( view.getIdOcultoEPI().getText()));
            executar.execute();
            
  view.getIdOcultoEPI().setText("0");
   
    ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\salvar.png");
    JOptionPane.showMessageDialog(null," Exclusão Realizada com Sucesso!","Exclusão de EPI",JOptionPane.PLAIN_MESSAGE,iconeSalvo ); 
       }catch(SQLException erro){
            // Icones a 32px para caixa de mensagem
    ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
    JOptionPane.showMessageDialog(null," Erro Exclusão desta EPI \n Erro:  !"+erro,"Cadastro de EPI",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
           
       }
}else if(i == JOptionPane.CANCEL_OPTION) {
   
}
       }else{
 // Icones a 32px para caixa de mensagem
    ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
    JOptionPane.showMessageDialog(null," \nSelecione um EPI Valido para continuar a exclusão! \n ","Exclusão de Funcionario",JOptionPane.PLAIN_MESSAGE,iconeSalvo );  
       }
              
   }
    
        
        public void editarEpi() throws SQLException{
            
          if (!view.getIdOcultoEPI().getText().isEmpty() == true) {
              
            
             view.getCodAlterarEPI().setEnabled(true);
             view.getCodAlterarEPI().setEditable(false);
             
             view.getDescAlterarEPI().setEnabled(true);
             view.getValAlterarEPI().setEnabled(true);
             view.getCodCAAlterarEPI().setEnabled(true);
             view.getLoteCAAlterarEPI().setEnabled(true);
             view.getIdOcultoEmpresa().setEnabled(true);
             view.getObservacaoAlterarEPI().setEnabled(true);
             view.getRiscoAlterarEPI().setEnabled(true);
             view.getCboDescartavelAlterarEPI().setEnabled(true);
             view.getCboDevolvetAlterarEPI().setEnabled(true);
             view.getCbosituacaoEpiAlterar().setEnabled(true);
             view.getDescEmpAlterarEPI().setEnabled(true);
             view.getCodEmpAlterarEPI().setEnabled(true);
       
        int codigosituacaocadastro  = 0;
        if(view.getCbosituacaoEpiAlterar().getSelectedItem() == "Ativo"){
            codigosituacaocadastro = 0;
        }else{
            codigosituacaocadastro = 1;
        }
    
          String sql = " SELECT * FROM epi WHERE id = ?;";
       
           executar = conexaoBD.prepareStatement(sql);    
           
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setInt(1,Integer.valueOf( view.getIdOcultoEPI().getText()));
            rs=executar.executeQuery();
         
          if(rs.next()){
            
             view.getCodAlterarEPI().setText( rs.getString("id"));
             view.getDescAlterarEPI().setText( rs.getString("descricao"));
             view.getValAlterarEPI().setText( rs.getString("validade"));
             view.getCodCAAlterarEPI().setText( rs.getString("codigoca"));
             view.getLoteCAAlterarEPI().setText(rs.getString("loteca"));
             
             view.getObservacaoAlterarEPI().setText(rs.getString("observacao"));
             view.getRiscoAlterarEPI().setText(rs.getString("instrucao"));
          
          }
            
            
   }else{
    ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
    JOptionPane.showMessageDialog(null," \nSelecione um EPI Valido para continuar a Edição! \n ","Edição de Funcionario",JOptionPane.PLAIN_MESSAGE,iconeSalvo ); 
    
}   
        }


        public void nomeempresa() throws SQLException{
            
        
         String sql2 = " SELECT id,descricao FROM empresa WHERE cnpj = ?;";
       
           executar = conexaoBD.prepareStatement(sql2);    
           
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setString(1, view.getCodEmpAlterarEPI().getText());
            rs=executar.executeQuery();
         
          if(rs.next()){
              view.getIdOcultoEmpresaalterar().setText(rs.getString("id"));
              view.getDescEmpAlterarEPI().setText( rs.getString("descricao"));
          }
            System.out.println(view.getIdOcultoEmpresaalterar().getText());
        }
        
        
        public void atualizarDadosEpi() throws SQLException{
       
    
      
        int codigoSit  = 0;
        if(view.getCbosituacaoEpiAlterar().getSelectedItem() == "Ativo"){
            codigoSit = 0;
        }else{
            codigoSit = 1;
        }
        
        int descartavel  = 0;
        if(view.getCboDescartavelAlterarEPI().getSelectedItem() == "Sim"){
            descartavel = 0;
        }else{
            descartavel = 1;
        }
        
        int devolver  = 0;
        if(view.getCboDevolvetAlterarEPI().getSelectedItem() == "Sim"){
            devolver = 0;
        }else{
            devolver = 1;
        }
        
        
    
        int codigoAlterado = Integer.valueOf(view.getCodAlterarEPI().getText());
        System.out.println("ID Selecionado: " +codigoAlterado);
        
          String sql = "UPDATE epi SET  descricao = ?, validade = ?, observacao = ?, codigoca = ?,loteca = ? , id_empresa = ?, instrucao = ?,id_situacaocadastro = ?, devolver = ?, descartavel = ?  WHERE id = '"+view.getCodAlterarEPI().getText()+"';";


  int i = JOptionPane.showConfirmDialog(null, "Deseja atualizar os dados do EPI: \n Código: "+view.getCodAlterarEPI().getText()+"\n"+"Descrição : "+view.getDescAlterarEPI().getText(),"Atualização de dados de EPI",JOptionPane.OK_CANCEL_OPTION);
  
  if(i == JOptionPane.YES_OPTION) {  
           executar = conexaoBD.prepareStatement(sql);    
           
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setString(1,view.getDescAlterarEPI().getText());
            executar.setInt(2,Integer.valueOf(view.getValAlterarEPI().getText()));
            executar.setString(3,view.getObservacaoAlterarEPI().getText());
            executar.setInt(4,Integer.valueOf(view.getCodCAAlterarEPI().getText()));                       
            executar.setString(5,view.getLoteCAAlterarEPI().getText());                       
            executar.setInt(6,Integer.valueOf(view.getIdOcultoEmpresaalterar().getText()));                       
            executar.setString(7,view.getRiscoAlterarEPI().getText());                       
            executar.setInt(8,codigoSit);                       
            executar.setInt(9,devolver);                       
            executar.setInt(10,descartavel);                       
            executar.execute();
            
             limparcampos();
             
              // Icones a 32px para caixa de mensagem
    ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\salvar.png");
    JOptionPane.showMessageDialog(null," \nAtualização realizada com sucesso! \n ","Atualização de EPI",JOptionPane.PLAIN_MESSAGE,iconeSalvo ); 
  } else if(i == JOptionPane.CANCEL_OPTION) {
   
    }                   
}
 
  public void limparcampos(){
      
             view.getCodAlterarEPI().setText("");
             view.getDescAlterarEPI().setText( "");
             view.getValAlterarEPI().setText( "");
             view.getObservacaoAlterarEPI().setText( "");
             view.getCodCAAlterarEPI().setText( "");
             view.getLoteCAAlterarEPI().setText("");
             view.getCodEmpAlterarEPI().setText("");
             view.getRiscoAlterarEPI().setText("");
             view.getDescEmpAlterarEPI().setText("");
           
             
             ocultarCampos();
      
  }
        
}



