/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Relatorios.relatorioFuncionario;
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
public class RelatorioFuncionarioController {
    
    
        private final relatorioFuncionario view;
        Connection conexao = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        PreparedStatement executar = null;
        
            Connection conexaoBD = new conexaoBancoController().conectarBanco();
     
        
    public RelatorioFuncionarioController(relatorioFuncionario view) {
        this.view = view;
        
    }
  
    
    public void oculatarCampos(){
        
          view.getPaneNomeConsulta().setColumnHeader(null);
          view.getOcultoIdEmpresa().setVisible(false);
          view.getOcultoIdFuncionario().setVisible(false);
          view.getPaneConsultaEmpresa().setColumnHeader(null);
                
      }
    
    
    public void selecionarCampos(){
      
        int setar = view.getTabelaNomeConsulta().getSelectedRow(); 
        int codigoFuncTabela = (int) view.getTabelaNomeConsulta().getModel().getValueAt(setar, 0);
        view.getOcultoIdFuncionario().setText(String.valueOf(codigoFuncTabela));
        view.getBotaoEditarMenu().setEnabled(true);
    }
    
    public void preencherIdOculto(){
      
    
      
         int codigosituacaocadastro  = 0;
        
        if(view.getCboSituacaoCadastro().getSelectedItem() == "Ativo"){
            codigosituacaocadastro = 0;
        }else{
            codigosituacaocadastro = 1;
        }
      
           String sql = "SELECT id,nome FROM funcionario where nome LIKE ? and id_situacaocadastro = ? ";
             
       try {
    
            executar = conexaoBD.prepareStatement(sql);    
           
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setString(1, view.getNomeFuncionario().getText()+"%");
            executar.setInt(2,codigosituacaocadastro);
            rs=executar.executeQuery();
          
        //a linha abixo vai usar a rs2XML.jar para preencher a Tabela
          view.getTabelaNomeConsulta().setModel(DbUtils.resultSetToTableModel(rs));    
        
       
          
       } catch (SQLException erro) {
            // Icones a 32px para caixa de mensagem
                ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
                JOptionPane.showMessageDialog(null," Erro na Consutla deste EPI \n Erro:  !"+erro,"Cadastro de EPI",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
       }
      
  }

    
    public void consultarNomeFuncionario(){  
        
        limparCamposAntesConsultaFuncionario();
        
        int codigoFuncionario = Integer.parseInt(view.getOcultoIdFuncionario().getText()); 
        
        int codigosituacaocadastro  = 0;
        if(view.getCboSituacaoCadastro().getSelectedItem() == "Ativo"){
            codigosituacaocadastro = 0;
        }else{
            codigosituacaocadastro = 1;
        }
        
        

       String sql = "SELECT funcionario.id,funcionario.nome,funcionario.chapa,empresa.id,empresa.descricao,setor.id,setor.nome FROM funcionario INNER JOIN empresa ON funcionario.id_empresa = empresa.id INNER JOIN setor ON funcionario.id_setor = setor.id WHERE funcionario.id = ? and funcionario.id_situacaocadastro = ?;";
             
       try {
            executar = conexaoBD.prepareStatement(sql);    
           
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setInt(1,Integer.valueOf( view.getOcultoIdFuncionario().getText()));
            executar.setInt(2,codigosituacaocadastro);
            rs=executar.executeQuery();
            
        //a linha abixo vai usar a rs2XML.jar para preencher a Tabela
          view.getTabelaFuncionario().setModel(DbUtils.resultSetToTableModel(rs));            
         
          /*
          if(rs.next()){
            view.getOcultoIdFuncionario().setText(rs.getString("id"));
            System.out.println(view.getOcultoIdFuncionario().getText());
          }*/
          
       } catch (SQLException erro) {
            // Icones a 32px para caixa de mensagem
                ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
                JOptionPane.showMessageDialog(null," Erro na Consutla deste SETOR \n Erro:  !"+erro,"Cadastro de Usuario",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
       }
   }
    
    
    //-------------------------- Consultar por empresa --------------------
    
    
   public void consultarEmpresa(){
           
        int codigosituacaocadastro  = 0;    
        
        if(view.getCboSituacaoCadastro().getSelectedItem() == "Ativo"){
            codigosituacaocadastro = 0;
        }else{
            codigosituacaocadastro = 1;
        }
                  
       int cnpjDigitado = 0;
       
           
        String sql = "SELECT * FROM empresa WHERE cnpj = ? and id_situacaocadastro = ?";
        
        
    try{
        executar = conexaoBD.prepareStatement(sql,rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_UPDATABLE);    
        // conteudo que vai ser colocado no lugar do '?' do SQL acima
        executar.setString(1,view.getCnpjEmpresaConsulta().getText());
        executar.setInt(2,codigosituacaocadastro);
        rs=executar.executeQuery();
        
        //Retorno da consulta
        view.getConsultaCNPJEmpresa().setModel(DbUtils.resultSetToTableModel(rs));     
        
        if (rs.first()) {
           
           // O sistema vai pegar a posição da tabela, no caso ali, os valores das coluas, sendo da primeira a ultima 
           view.getOcultoIdEmpresa().setText(rs.getString(1));
           view.getNomeempresaFuncionario().setText(rs.getString(2));
           
           
    
        }
         
        int setar = view.getTabelaNomeConsulta().getSelectedRow(); 
        int codigoFuncTabela = (int) view.getConsultaCNPJEmpresa().getModel().getValueAt(setar, 0);
        view.getOcultoIdFuncionario().setText(String.valueOf(codigoFuncTabela));
    
        
        if (rs.next()) {
           
           // O sistema vai pegar a posição da tabela, no caso ali, os valores das coluas, sendo da primeira a ultima 
           view.getOcultoIdEmpresa().setText(rs.getString("id"));
           view.getNomeempresaFuncionario().setText(rs.getString("descricao"));
           
           consultaFuncionarioPorEmpresa();

        } else {
            
            // Comando para limapr os campos quando digita errado
            JOptionPane.showMessageDialog(null,"Empresa não Encontrada! \n CNPJ: "+view.getCnpjEmpresaConsulta().getText()+" - Não Encontrado","Consulta de Empresa", JOptionPane.ERROR_MESSAGE);
       

        
        }
    }catch (SQLException ex ) {
      JOptionPane.showMessageDialog( null, "Erro: "+ex , "Aviso",JOptionPane.WARNING_MESSAGE );
            }
    }  
     
   public void consultaFuncionarioPorEmpresa(){
        
       limparCamposAntesConsultaEmpresa();
        
        int codigosituacaocadastro  = 0;
        if(view.getCboSituacaoCadastro().getSelectedItem() == "Ativo"){
            codigosituacaocadastro = 0;
        }else{
            codigosituacaocadastro = 1;
        }
        
              String sql = "SELECT func.id,func.nome,empresa.id, empresa.descricao,setor.id, setor.nome FROM funcionario func INNER JOIN empresa ON func.id_empresa = empresa.id INNER JOIN setor ON func.id_setor = setor.id WHERE empresa.id = ? and func.id_situacaocadastro = ?";
             
       try {
            executar = conexaoBD.prepareStatement(sql);    
           
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setInt(1, Integer.parseInt(view.getOcultoIdEmpresa().getText()));
            executar.setInt(2, codigosituacaocadastro);
            rs=executar.executeQuery();
            
        //a linha abixo vai usar a rs2XML.jar para preencher a Tabela
          view.getTabelaFuncionario().setModel(DbUtils.resultSetToTableModel(rs));            
            
         
       
       } catch (SQLException erro) {
            // Icones a 32px para caixa de mensagem
                ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
                JOptionPane.showMessageDialog(null," Erro na Consutla deste SETOR \n Erro:  !"+erro,"Cadastro de Usuario",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
       }
        
    } 
        
   public void limparCamposAntesConsultaEmpresa(){
       
       ((DefaultTableModel) view.getTabelaFuncionario().getModel()).setRowCount(0);
       ((DefaultTableModel) view.getTabelaNomeConsulta().getModel()).setRowCount(0);
       view.getNomeFuncionario().setText("");
       view.getOcultoIdFuncionario().setText("");
   

   }
   
   public void limparCamposAntesConsultaFuncionario(){
       
       ((DefaultTableModel) view.getTabelaFuncionario().getModel()).setRowCount(0);
       ((DefaultTableModel) view.getConsultaCNPJEmpresa().getModel()).setRowCount(0);
       view.getCnpjEmpresaConsulta().setText("");
       view.getNomeempresaFuncionario().setText("");
   }
   
   
   public void excluirFuncionario(){
       
        if (!view.getOcultoIdFuncionario().getText().isEmpty() == true) {
       
        int setar = view.getTabelaNomeConsulta().getSelectedRow(); 
        int codigoFuncionario = Integer.valueOf(view.getTabelaNomeConsulta().getModel().getValueAt(setar, 0).toString());
        String nomeFuncionario = view.getTabelaNomeConsulta().getModel().getValueAt(setar, 1).toString();
       
           
       int i = JOptionPane.showConfirmDialog(null, "Deseja alterar o Status para Excluido do Funcionario: ?\n Funcionario: "+nomeFuncionario);
   
       limparCamposAntesConsultaEmpresa();
       
if(i == JOptionPane.YES_OPTION) {
     
       String sql = "Update funcionario set id_situacaocadastro = 1 where id = ?;";
             
       try {
            executar = conexaoBD.prepareStatement(sql);    
            executar.setInt(1,Integer.valueOf( codigoFuncionario));
            executar.execute();
            
   codigoFuncionario = 0;
   
    ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\salvar.png");
    JOptionPane.showMessageDialog(null," Exclusão Realizada com Sucesso!","Exclusão de Funcionario",JOptionPane.PLAIN_MESSAGE,iconeSalvo ); 
       }catch(SQLException erro){
            // Icones a 32px para caixa de mensagem
    ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
    JOptionPane.showMessageDialog(null," Erro Exclusão deste Funcionario \n Erro:  !"+erro,"Cadastro de Usuario",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
           
       }
}else if(i == JOptionPane.CANCEL_OPTION) {
   
}
       }else{
 // Icones a 32px para caixa de mensagem
    ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
    JOptionPane.showMessageDialog(null," \nSelecione um Funcinoario Valido para continuar a exclusão! \n ","Exclusão de Funcionario",JOptionPane.PLAIN_MESSAGE,iconeSalvo );  
       }
              
   }
   
   
  public void bloquearCamposEditar(){
     
      view.getIdFuncinoarioAlterar().setEnabled(false);
      view.getComboStatusFuncinoarioAlterar().setEnabled(false);
      view.getObservacaoFuncinoarioAlterar().setEnabled(false);
      view.getNomeFuncinoarioAlterar().setEnabled(false);
      view.getRgFuncinoarioAlterar().setEnabled(false);
      view.getCpfFuncinoarioAlterar().setEnabled(false);
      view.getTabelaConsultaEmpresaAlterar().setEnabled(false);
      view.getTabelaConsultaSetorAlterar().setEnabled(false);
      view.getPaneEmpresa().setColumnHeader(null);
      view.getPaneSetor().setColumnHeader(null);
      view.getOcSelcSetorAlterar().setVisible(false);
      view.getOcSelcEmpresaAlterar().setVisible(false);
      view.getDtAdmFuncinoarioAlterar().setEnabled(false);
      view.getBotaoAtualizar().setEnabled(false);
      view.getChapaAlterar().setEnabled(false);
      view.getNomeSetorFuncinoarioAlterar().setEnabled(false);
      view.getNomeempresaFuncinarioalterar().setEnabled(false);
      view.getBotaoEditarMenu().setEnabled(false);
   
  }
   
  
   public void habilitarCamposEditar(){
     
      view.getIdFuncinoarioAlterar().setEnabled(true);
      view.getComboStatusFuncinoarioAlterar().setEnabled(true);
      view.getObservacaoFuncinoarioAlterar().setEnabled(true);
      view.getNomeFuncinoarioAlterar().setEnabled(true);
      view.getRgFuncinoarioAlterar().setEnabled(true);
      view.getCpfFuncinoarioAlterar().setEnabled(true);
      view.getTabelaConsultaEmpresaAlterar().setEnabled(true);
      view.getTabelaConsultaSetorAlterar().setEnabled(true);
      view.getPaneEmpresa().setColumnHeader(null);
      view.getPaneSetor().setColumnHeader(null);
     //view.getOcSelcSetorAlterar().setVisible(true);
     // view.getOcSelcEmpresaAlterar().setVisible(true);
      view.getBotaoAtualizar().setEnabled(true);
      view.getDtAdmFuncinoarioAlterar().setEnabled(true);
      view.getChapaAlterar().setEnabled(true);
      view.getNomeSetorFuncinoarioAlterar().setEnabled(true);
      view.getNomeempresaFuncinarioalterar().setEnabled(true);
  }
  
   public void editarFuncinoario() throws SQLException{
       
        int codigosituacaocadastro  = 0;
        if(view.getCboSituacaoCadastro().getSelectedItem() == "Ativo"){
            codigosituacaocadastro = 0;
        }else{
            codigosituacaocadastro = 1;
        }
    
          String sql = " SELECT * FROM funcionario WHERE id = ?;";
       
           executar = conexaoBD.prepareStatement(sql);    
           
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setInt(1,Integer.valueOf( view.getOcultoIdFuncionario().getText()));
            rs=executar.executeQuery();
         
          if(rs.next()){
            
             view.getIdFuncinoarioAlterar().setText( rs.getString("id"));
             view.getNomeFuncinoarioAlterar().setText( rs.getString("nome"));
             view.getRgFuncinoarioAlterar().setText( rs.getString("rg"));
             view.getCpfFuncinoarioAlterar().setText( rs.getString("cpf"));
             view.getObservacaoFuncinoarioAlterar().setText( rs.getString("observacao"));
             // ComboBox Pega o Valor da variavel : codigosituacaocadastro
             view.getChapaAlterar().setText(rs.getString("chapa"));
                           
          }
       
   }
   
   public void empresaselecionada(){
       
        int setarEmpresa = view.getTabelaConsultaEmpresaAlterar().getSelectedRow(); 
        int codigoEmpresaTabela = (int) view.getTabelaConsultaEmpresaAlterar().getModel().getValueAt(setarEmpresa, 0);
        view.getIdEmpresaOculto().setText(String.valueOf(codigoEmpresaTabela));
        System.out.println("Empresa: "+view.getIdEmpresaOculto().getText());
   
   }
   
   public void setarEmpresaEditar(){
       
       
           String sql = "SELECT id,descricao,cnpj FROM empresa WHERE descricao LIKE ?";
       
        try {
            executar = conexaoBD.prepareStatement(sql);    
            executar.setString(1, view.getNomeempresaFuncinarioalterar().getText()+"%");
            rs=executar.executeQuery();
            
        //a linha abixo vai usar a rs2XML.jar para preencher a Tabela
          view.getTabelaConsultaEmpresaAlterar().setModel(DbUtils.resultSetToTableModel(rs));  
          
                
       
        }catch(SQLException erro){
            System.out.println(erro);
            
        }
       
   }
  
      public void setorselecionada(){
       
        int selecionarSetor = view.getTabelaConsultaSetorAlterar().getSelectedRow(); 
        int codigoSetorTabela = (int) view.getTabelaConsultaSetorAlterar().getModel().getValueAt(selecionarSetor, 0);
        view.getIdSetorOculto().setText(String.valueOf(codigoSetorTabela));
        System.out.println("setor: " + view.getIdSetorOculto().getText());
        
   
   }
   
  
   public void setarSetorEditar(){
        
       
           String sql = "SELECT id,nome FROM setor WHERE nome LIKE ?;";
       
        try {
            executar = conexaoBD.prepareStatement(sql);    
            executar.setString(1, view.getNomeSetorFuncinoarioAlterar().getText()+"%");
            rs=executar.executeQuery();
            
        //a linha abixo vai usar a rs2XML.jar para preencher a Tabela
          view.getTabelaConsultaSetorAlterar().setModel(DbUtils.resultSetToTableModel(rs));  
          

        }catch(SQLException erro){
            System.out.println(erro);
            
        }
       
   }
   
   public void alteracamposFuncionario() throws SQLException{
       
    
        int codigosituacaocadastro  = 0;
        if(view.getComboStatusFuncinoarioAlterar().getSelectedItem() == "Ativo"){
            codigosituacaocadastro = 0;
        }else{
            codigosituacaocadastro = 1;
        }
    
        int codigoAlterado = Integer.valueOf(view.getIdFuncinoarioAlterar().getText());
        System.out.println("ID Selecionado: " +codigoAlterado);
        
          String sql = "UPDATE funcionario SET  nome = ?, cpf = ?, rg = ?, dataadmissao = ?, id_empresa = ?, id_setor = ?,chapa = ?, id_situacaocadastro = '"+codigosituacaocadastro+"', observacao = ? WHERE id = '"+codigoAlterado+"';";


  int i = JOptionPane.showConfirmDialog(null, "Deseja atualizar os dados do(a) colaborador: \n"+view.getNomeFuncinoarioAlterar().getText()+"\n"+"CPF: "+view.getCpfFuncinoarioAlterar().getText(),"Atualização de Funcionário",JOptionPane.OK_CANCEL_OPTION);
  
  if(i == JOptionPane.YES_OPTION) {  
           executar = conexaoBD.prepareStatement(sql);    
           
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setString(1,view.getNomeFuncinoarioAlterar().getText());
            executar.setString(2,view.getCpfFuncinoarioAlterar().getText());
            executar.setString(3,view.getRgFuncinoarioAlterar().getText());
            executar.setString(4,view.getDtAdmFuncinoarioAlterar().getText());
            executar.setInt(5, Integer.parseInt(view.getIdEmpresaOculto().getText()));
            executar.setInt(6,Integer.parseInt(view.getIdSetorOculto().getText()));
            executar.setString(7,view.getChapaAlterar().getText());
            executar.setString(8,view.getObservacaoFuncinoarioAlterar().getText());
                        
            executar.execute();
            
  } else if(i == JOptionPane.CANCEL_OPTION) {
   
}                   
          }
       
   }    
   
   
   


