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
    }
    
    public void consultarEmpresaNome(){
        
        //bloquear na pesquisa por Descrição
        view.getNomeEmpresaEPi().setEnabled(false);
        view.getLoteCAEpiConsulta().setEnabled(false);
        view.getCodigoCAEPIConsulta().setEnabled(false);
        view.getCboOperadorValidade().setEnabled(false);
        view.getValidadeEPIConsulta().setEnabled(false);
      
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
    
    
    
    
    
}
