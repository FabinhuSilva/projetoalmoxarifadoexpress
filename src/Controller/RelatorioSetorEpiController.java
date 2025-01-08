/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Relatorios.intRelatorioSetorEPI;
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
public class RelatorioSetorEpiController {

     private intRelatorioSetorEPI view;
    
     Connection conexaoBD = new conexaoBancoController().conectarBanco();
     PreparedStatement executar = null;
     ResultSet rs = null;
    
    public RelatorioSetorEpiController(intRelatorioSetorEPI view) {
        this.view = view;
        
    }
    
   public void ocultarcampos(){
       
       view.getBotaoCONSULTAR().setEnabled(false);
       view.getBotaoExcluir().setEnabled(false);
        
       
   }
    
    
  public void consultarSetorRelatorio(){
       
      
    /* Busca Avançada
      https://www.youtube.com/watch?v=9ZrJvH790Es&list=PLbEOwbQR9lqxsTusvu8wfkUECrmcV81MU&index=26
    */
      
      
       String sql = "SELECT * FROM setor WHERE nome LIKE ? ";

String nomeColuna = "";       
       try {
            executar = conexaoBD.prepareStatement(sql);    
            
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setString(1, view.getConsultaSetorRelatorio().getText()+"%");
            rs=executar.executeQuery();
            
            //a linha abixo vai usar a rs2XML.jar para preencher a Tabela
          view.getTabelaSetoresConsulta().setModel(DbUtils.resultSetToTableModel(rs));
        
           
       } catch (SQLException erro) {
           JOptionPane.showMessageDialog(null, "Erro ao Consultar EPI (método buscarnomeSetorRelatorioConsulta) : " + erro, "CSEC - Consulta de SETOR/EPI", JOptionPane.ERROR_MESSAGE);
       }
   }
  
         public void preencherCamposSetor(){
   
           int setar = view.getTabelaSetoresConsulta().getSelectedRow();
           
           view.getCodigoSetorconsulta().setText(view.getTabelaSetoresConsulta().getModel().getValueAt(setar, 0).toString());
           view.getNomeSetorConsulta().setText(view.getTabelaSetoresConsulta().getModel().getValueAt(setar, 1).toString());
           
         }
  
       public void carregarSetorEpi(){
           
                 String sql = "SELECT  setorepi.id_epi, e.descricao, setorepi.qtd_epi,e.validade,e.codigoca,e.loteca FROM setorepi INNER JOIN epi e ON setorepi.id_epi = e.id WHERE setorepi.id_setor = ?  ";
                 
       
       try {
           
           int codigoSetor = Integer.valueOf(view.getCodigoSetorconsulta().getText()).intValue();
           
            executar = conexaoBD.prepareStatement(sql, rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_UPDATABLE);    
            
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setInt(1, codigoSetor);
            rs=executar.executeQuery();
            
            //a linha abixo vai usar a rs2XML.jar para preencher a Tabela
            view.getTabelaSetorEpiRelatorio().setModel(DbUtils.resultSetToTableModel(rs));
           
            int totalresultados = 0;
            if (rs.first() == false) {
             
             // Icones a 32px para caixa de mensagem
            ImageIcon iconeAtencao = new ImageIcon("c:\\almoxarifadoExpress\\icone\\atencao.png");
            JOptionPane.showMessageDialog(null, " Não há EPI cadastro para este Setor!", "Consulta de Setor e EPI", JOptionPane.PLAIN_MESSAGE, iconeAtencao);
            
           }
       } catch (SQLException erro) {
           JOptionPane.showMessageDialog(null, "Erro ao Carregar EPI (método RESULTADO) : " + erro, "CSEC - Consulta de SETOR", JOptionPane.ERROR_MESSAGE);
       }
       
    }
       
        public void excluirSetorEPI(){
         
            int resposta = JOptionPane.showConfirmDialog(null, " Deseja realmente Excluir o cadastro de Setor e EPI? ");
            
            if (resposta == JOptionPane.YES_OPTION) {
                
                                  String sql = "DELETE FROM setorepi WHERE id_setor = ?  ";
       
       try {
           
           int codigoSetor = Integer.valueOf(view.getCodigoSetorconsulta().getText()).intValue();
           
            executar = conexaoBD.prepareStatement(sql);    
            
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setInt(1, codigoSetor);
            executar.execute();
            //rs=executar.executeQuery();
            
            //a linha abixo vai usar a rs2XML.jar para preencher a Tabela
            //view.getListaEpiAdicionados().setModel(DbUtils.resultSetToTableModel(rs));
            JOptionPane.showMessageDialog(null, "Exclusão Realizado com Sucesso! ", "Exclusão de SETOR / EPI", JOptionPane.INFORMATION_MESSAGE);
       } catch (SQLException erro) {
           JOptionPane.showMessageDialog(null, "Erro ao Excluir Lista Anterior (método LIMPARBANCEPISETOR) : " + erro, "CSEC - Consulta de SETOREPI", JOptionPane.ERROR_MESSAGE);
       }
                
            } else if(resposta == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Exclusão de vinculos EPI e SETOR Canceladas" , "Exclusão de Setor e EPI", JOptionPane.CANCEL_OPTION); 
            }else if(resposta == JOptionPane.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(null, "Cancelado com Sucesso!" , "Exclusão de Setor e EPI", JOptionPane.CANCEL_OPTION); 
            }
            
        }
           
}
