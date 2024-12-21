/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Relatorios.relatorioExcecaoEpi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Fabinhu
 */
public class RelatorioExcecaoEpiController {
    
    
      private final relatorioExcecaoEpi view;
      Connection conexaoBD = new conexaoBancoController().conectarBanco();
      PreparedStatement executar = null;
      ResultSet rs = null;
   
    public RelatorioExcecaoEpiController(relatorioExcecaoEpi view) {
    this.view = view;        	
    
}
    
    
     public void ocultarCamposEx(){
        
         //remover Com informações da Tabela
         view.getPaneConsultaExFuncionario().setColumnHeader(null);
         
         //ocultando campos estrategicos
         view.getCodigoFuncionarioEx().setVisible(false);
         view.getSetoridFuncEx().setVisible(false);
         view.getOcultoIdEmpresa().setVisible(false);
         
         //Ocultar  botao da tela de relatorio
         view.getBotaoConsultar().setEnabled(false);
         view.getBotaoImprimir().setEnabled(false);
         view.getBotaoConsultarEx().setEnabled(false);
         view.getBotaoExcluirMenu().setEnabled(false);
 
     }
     
 
     public void consultarFuncionarioEx(){
 
      
       String sql = "SELECT id,nome,cpf FROM funcionario WHERE nome LIKE ? AND id_situacaocadastro = 0";
             
       try {
            executar = conexaoBD.prepareStatement(sql);           

           
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setString(1, view.getConsultaExFuncionario().getText()+"%");
            rs=executar.executeQuery();
            
            //a linha abixo vai usar a rs2XML.jar para preencher a Tabela
          view.getTabelaConsultaExFuncionario().setModel(DbUtils.resultSetToTableModel(rs));
        
                
       } catch (SQLException erro) {
           JOptionPane.showMessageDialog(null, "Erro ao Consultar Funcionario (método ConsultarFuncinoarioEx) : " + erro, "CSEC - Consulta de Funcionario Ex.", JOptionPane.ERROR_MESSAGE);
       }
   }
         
     
     public void preencherDadosFuncionario(){
           
           int setar = view.getTabelaConsultaExFuncionario().getSelectedRow(); 
           int codigofuncionario = Integer.parseInt(view.getTabelaConsultaExFuncionario().getModel().getValueAt(setar, 0).toString());
           
           
           view.getBotaoConsultar().setEnabled(true);
           view.getBotaoConsultarEx().setEnabled(true);
           
             String sql = "SELECT * FROM funcionario WHERE id = ? AND id_situacaocadastro = 0";
             
       try {
            executar = conexaoBD.prepareStatement(sql);           

            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setInt(1, codigofuncionario);
            rs=executar.executeQuery();
            
            if (rs.next()) {

           view.getCodigoFuncionarioEx().setText(String.valueOf(codigofuncionario));
           view.getNomeFuncEx().setText(rs.getString("nome"));
           view.getCpfFuncEx().setText(rs.getString("cpf"));
           view.getChapaFuncEx().setText(rs.getString("chapa"));
           view.getSetoridFuncEx().setText(rs.getString("id_setor"));
           view.getOcultoIdEmpresa().setText(rs.getString("id_empresa"));
          
           
            preencherDadosSetorEx();
           } 
           
       } catch (SQLException erro) {
           JOptionPane.showMessageDialog(null, "Erro ao Consultar Funcionario : " + erro, "CSEC - Consulta de Funcionario Ex.", JOptionPane.ERROR_MESSAGE);
       }
   }
 
    
   public void preencherDadosSetorEx(){
       
       int idsetorex = Integer.parseInt(view.getSetoridFuncEx().getText());
       System.out.println(idsetorex);
       
                    String sql = "SELECT nome FROM setor WHERE id = ? AND id_situacaocadastro = 0";
             
       try {
            executar = conexaoBD.prepareStatement(sql);           

            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setInt(1, idsetorex);
            rs=executar.executeQuery();
            
            if (rs.next()) {
           view.getSetorNomeFuncEx().setText(rs.getString("nome"));
           
            }
           
            }catch(SQLException erro){
        JOptionPane.showMessageDialog(null, "Erro ao Consultar Funcionario : " + erro, "CSEC - Consulta de Funcionario Ex.", JOptionPane.ERROR_MESSAGE);
                    }
   }    
   
   
   public void preencherExcecaoEPI(){
       
         
       String sql = "SELECT epi.id, epi.descricao, exp.qtd_epi,setor.nome FROM epiexcecao exp INNER JOIN epi on epi.id = exp.id_epi INNER JOIN funcionario on funcionario.id = exp.id_funcionario INNER JOIN setor on setor.id = funcionario.id_setor WHERE funcionario.id = ? ";
             
       try {
            executar = conexaoBD.prepareStatement(sql);           

           
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setInt(1, Integer.parseInt(view.getCodigoFuncionarioEx().getText()));
            rs=executar.executeQuery();
            
            //a linha abixo vai usar a rs2XML.jar para preencher a Tabela
          view.getTabelaResultadoEx().setModel(DbUtils.resultSetToTableModel(rs));
        
                
       } catch (SQLException erro) {
           JOptionPane.showMessageDialog(null, "Erro ao Consultar Funcionario (método ConsultarFuncinoarioEx) : " + erro, "CSEC - Consulta de Funcionario Ex.", JOptionPane.ERROR_MESSAGE);
       }
       
   }
     
   
     public void excluirEPISetorEx(){
       
         int i = JOptionPane.showConfirmDialog(null,"Deseja Excluir todas as Exceções para este Funcinario: \n Nome: "+view.getNomeFuncEx().getText()+"\nChapa: "+view.getChapaFuncEx().getText()+"\n","Exclusão de Exceção de Uso de EPI" ,JOptionPane.OK_CANCEL_OPTION);
         
        if(i == JOptionPane.YES_OPTION) {
   
                            String sql = "DELETE FROM epiexcecao WHERE id_funcionario = ?  ";
       
       try {
           
           int id_funcionarioex = Integer.valueOf(view.getCodigoFuncionarioEx().getText()).intValue();
           
            executar = conexaoBD.prepareStatement(sql);    
            
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setInt(1, id_funcionarioex);
            executar.execute();
            ImageIcon iconeAtencao = new ImageIcon("c:\\almoxarifadoExpress\\icone\\salvar.png");
            JOptionPane.showMessageDialog(null, "Exceções Excluidas com Sucesso!", "Exclusão de exceção de  EPI", JOptionPane.PLAIN_MESSAGE, iconeAtencao);
           
       } catch (SQLException erro) {
            // Icones a 32px para caixa de mensagem
            ImageIcon iconeAtencao = new ImageIcon("c:\\almoxarifadoExpress\\icone\\atencao.png");
            JOptionPane.showMessageDialog(null, "Erro ao Excluir Exceções: \n"+erro, "Exclusão de exceção de  EPI", JOptionPane.PLAIN_MESSAGE, iconeAtencao);
       }
        }
            else if(i == JOptionPane.NO_OPTION) {
             
            }

       }
   
   
}
