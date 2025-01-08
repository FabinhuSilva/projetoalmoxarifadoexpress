/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import View.Relatorios.intRelatorioSetor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class RelatorioSetorController {
    
    private intRelatorioSetor view;
   
    public RelatorioSetorController(intRelatorioSetor view) {
        this.view = view;
    }
      
     Connection conexaoBD = new conexaoBancoController().conectarBanco();
     
     PreparedStatement executar = null;
     ResultSet rs = null;
     private int codigoSetor ;
     private String nome;
     private String riscoSetor;

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRiscoSetor() {
        return riscoSetor;
    }

    public void setRiscoSetor(String riscoSetor) {
        this.riscoSetor = riscoSetor;
    }
     
     
     
  public void consultarSetor(){
 
      
       String sql = "SELECT id,nome,riscosetor FROM setor WHERE nome LIKE ? AND id_situacaocadastro = ?";
             
       try {
            executar = conexaoBD.prepareStatement(sql);    
           int situacaoCadastro = 0; 
           String sit_cadastro = view.getCbStituacaoSetor().getSelectedItem().toString();
           
           
           if (sit_cadastro == "Ativo") {
               situacaoCadastro = 0;
           } else {
               situacaoCadastro = 1;
           }
           
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setString(1, view.getConsultarSetor().getText()+"%");
            executar.setInt(2, situacaoCadastro);
            rs=executar.executeQuery();
            
            //a linha abixo vai usar a rs2XML.jar para preencher a Tabela
          view.getTabelaSetor().setModel(DbUtils.resultSetToTableModel(rs));
        
           
       } catch (SQLException erro) {
           JOptionPane.showMessageDialog(null, "Erro ao Consultar EPI (método buscarnomeSetorRelatorioConsulta) : " + erro, "CSEC - Consulta de SETOR/EPI", JOptionPane.ERROR_MESSAGE);
       }
   }
  
         public int CodigoSetor(){
         
        int setar = view.getTabelaSetor().getSelectedRow();
        view.getCodigoSetor().setText(view.getTabelaSetor().getModel().getValueAt(setar, 0).toString());
        
        int codigoSetorHerdado = Integer.parseInt(view.getCodigoSetor().getText());
        System.out.println(codigoSetorHerdado);
             
        return codigoSetorHerdado;
        
     
        }
         
        
  public void preencherCamposSetor(){
   
           int setar = view.getTabelaSetor().getSelectedRow();
           
           view.getCodigoSetorRelatorio().setText(view.getTabelaSetor().getModel().getValueAt(setar, 0).toString());
           view.getDescricaoSetorRelatorio().setText(view.getTabelaSetor().getModel().getValueAt(setar, 1).toString());
           view.getRiscoSetorRelatorio().setText(view.getTabelaSetor().getModel().getValueAt(setar, 2).toString());
                      
         }
         
    
  public void preencherEpiSetor(){
      
      if (true) {
       String codigoSetor = view.getCodigoSetorRelatorio().getText() ;
        
       String sql = "SELECT epi.descricao, set.qtd_epi FROM SETOREPI set INNER JOIN setor ON set.id_setor = setor.id INNER JOIN epi ON set.id_epi=epi.id WHERE setor.id = '"+codigoSetor+"' ";
             
       try {
        
            //executar.setString(1, codigoSetor);
            executar = conexaoBD.prepareStatement(sql);    
                   
            //O trecho abaixo troca o ? pelo conteudo da caixa
            rs=executar.executeQuery();
            
            //a linha abixo vai usar a rs2XML.jar para preencher a Tabela
          view.getListaEpiSetor().setModel(DbUtils.resultSetToTableModel(rs));             
         }catch(SQLException erro){
             System.out.println(erro);
         }
          
      }else{
        
          // Icones a 32px para caixa de mensagem
                ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
                JOptionPane.showMessageDialog(null," Usuario salvo com Sucesso!","Cadastro de Usuario",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
      }
  }
    
  
  public void oculataCamposView(){
    
    //Campo codigo do Setor
    view.getCodigoSetorRelatorio().setEnabled(false);
    view.getCodigoSetor().setVisible(false);
    view.getDescsetor().setVisible(false);
    
//desabilitar o Botao editar Antes da consutla
    view.getBotaoEditar().setEnabled(false);
    
               
     // Deixar o Combo Em branco
     view.getCbosituacaoSetorRelatorio().setSelectedItem(null);
      
  }
  
  public void excluirSetor(){
          
     
    if (!view.getCodigoSetor().getText().equals("")) {
        
      int i = JOptionPane.showConfirmDialog(null, "Deseja alterar o STATUS deste setor para Excluido? \n\n    Setor: "+view.getCodigoSetor().getText()+" - "+view.getDescsetor().getText(),"",JOptionPane.OK_CANCEL_OPTION);
       
          if(i == JOptionPane.YES_OPTION) {
      
              
              int convertCodigoSetor = Integer.parseInt(view.getCodigoSetor().getText());
       try {
        
            String sql = "UPDATE setor SET id_situacaoCadastro = 1 where id = '"+convertCodigoSetor+"'";
      
             executar = conexaoBD.prepareStatement(sql);                

            executar.execute();
            
        ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\salvar.png");
        JOptionPane.showMessageDialog(null,"Exclusão Realizada com Sucesso!","Exclusão de Setor",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
        
         }catch(SQLException erro){
          ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");   
          JOptionPane.showMessageDialog(null,"Exclusão nao realizada! \n Erro: \n"+erro,"Exclusão de Setor",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
         }
                   
       
        }else if(i == JOptionPane.CANCEL_OPTION) {
            
            ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\atencao.png");
        JOptionPane.showMessageDialog(null,"Exclusão Cancelada!","Exclusão de Setor",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
                
        }
          
      
  } else{ 
        ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
        JOptionPane.showMessageDialog(null," Consulte e seleciona um SETOR para que o mesmo seja EXCLUIDO!","Exclusão de Setor",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
                
      }   
  
    }
  
  public void pegarSelecaoTabelaSetor(){
      int setar = view.getTabelaSetor().getSelectedRow();
           view.getCodigoSetor().setText(view.getTabelaSetor().getModel().getValueAt(setar, 0).toString());
           view.getDescsetor().setText(view.getTabelaSetor().getModel().getValueAt(setar, 1).toString());
  }
  
  
  public void atualizarCadastroSetor(){
      
        if (!view.getCodigoSetor().getText().equals("")) {
        
      int i = JOptionPane.showConfirmDialog(null, "Deseja Atualizar as informações deste Setor? \n\n    Setor: "+view.getCodigoSetor().getText()+" - "+view.getDescsetor().getText(),"",JOptionPane.OK_CANCEL_OPTION);
       
          if(i == JOptionPane.YES_OPTION) {
      
        String dscSetor = view.getDescricaoSetorRelatorio().getText().trim();
        String stcCadastro = view.getCbosituacaoSetorRelatorio().getSelectedItem().toString();
        String rcoSetor = view.getRiscoSetorRelatorio().getText();
        
         int idSituacaoCadastroConvert = 1;

            if (stcCadastro.equals("Ativo")) {
                idSituacaoCadastroConvert = 0;
            } else {
                idSituacaoCadastroConvert = 1;
            }
              
              int convertCodigoSetor = Integer.parseInt(view.getCodigoSetor().getText());
       try {
        
            String sql = "UPDATE setor SET nome='"+dscSetor+"',id_situacaoCadastro = '"+idSituacaoCadastroConvert+"',riscosetor = '"+rcoSetor+"' where id = '"+convertCodigoSetor+"'";
            //String sql = "UPDATE setor SET id_situacaoCadastro = 1 where id = ?";
             executar = conexaoBD.prepareStatement(sql);                
            //executar.execute(sql);
           // executar.setString(1,view.getCodigoSetor().getText());
            executar.execute();
            
        ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\salvar.png");
        JOptionPane.showMessageDialog(null,"Edição realizada com Sucesso!","Edição de Setor",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
        
          funcaoLimparCampos();
        
         }catch(SQLException erro){
          ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");   
          JOptionPane.showMessageDialog(null,"Edição nao realizada! \n Erro: \n"+erro,"Edição de Setor",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
         }
                   
       
        }else if(i == JOptionPane.CANCEL_OPTION) {
            
            ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\atencao.png");
        JOptionPane.showMessageDialog(null,"Edição Cancelada!","Edição de Setor",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
                
        }
  
  
          } else{ 
        ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
        JOptionPane.showMessageDialog(null," Selecione um SETOR Valido e clique em 'EDITAR' para seguir com as alterações!","Edição de Setor",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
                
      }   
  
  }
  
  public void funcaoLimparCampos(){
      
      view.getCodigoSetorRelatorio().setText("");
      view.getDescricaoSetorRelatorio().setText("");
      view.getRiscoSetorRelatorio().setText("");
      view.getCbosituacaoSetorRelatorio().setSelectedItem(null);
      view.getCodigoSetor().setText("");
      view.getDescsetor().setText("");
      
  }
  
}