/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.cadastroExcecaoEPI;
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
public class cadastroExEpiController {

   private cadastroExcecaoEPI view;
   
    public cadastroExEpiController(cadastroExcecaoEPI view) {
        this.view = view;
    }
      
     Connection conexaoBD = new conexaoBancoController().conectarBanco();
     PreparedStatement executar = null;
     ResultSet rs = null;
     int Quantidade_linha  = 0;
     int contador_linha = 0;

    public int getQuantidade_linha() {
        return Quantidade_linha;
    }

    public void setQuantidade_linha(int Quantidade_linha) {
        this.Quantidade_linha = Quantidade_linha;
    }

    public int getContador_linha() {
        return contador_linha;
    }

    public void setContador_linha(int contador_linha) {
        this.contador_linha = contador_linha;
    }
     
     
    
     public void consultarFuncionarioEx(){
 
      
       String sql = "SELECT id,nome,cpf FROM funcionario WHERE nome LIKE ? AND id_situacaocadastro = 0";
             
       try {
            executar = conexaoBD.prepareStatement(sql);           

           
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setString(1, view.getConsultaFuncionarioEx().getText()+"%");
            rs=executar.executeQuery();
            
            //a linha abixo vai usar a rs2XML.jar para preencher a Tabela
          view.getTabelaConsultaEx().setModel(DbUtils.resultSetToTableModel(rs));
        
           
       } catch (SQLException erro) {
           JOptionPane.showMessageDialog(null, "Erro ao Consultar Funcionario (método ConsultarFuncinoarioEx) : " + erro, "CSEC - Consulta de Funcionario Ex.", JOptionPane.ERROR_MESSAGE);
       }
   }
     
    
     public void ocultarCamposEx(){
        
         //remover Com informações da Tabela
         view.getPaneTabelaConsultaEx().setColumnHeader(null);
         view.getPaneTabelaEpiEx().setColumnHeader(null);
         
         //Ocultar campo Estrategico
         view.getOcultoIdEpi().setVisible(false);
         view.getOcultoIdEmpresaFuncionario().setVisible(false);
         
                    
         
         //Bloquear dados do Funcionario
         view.getCodFuncionarioEx().setEditable(false);
         view.getChapaFuncionarioEx().setEditable(false);
         view.getDataAdmissaoEx().setEditable(false);
         view.getNomeFuncionarioEx().setEditable(false);
         view.getCpfFuncionarioEx().setEditable(false);
         view.getRgFuncionarioEx().setEditable(false);
         view.getEmpresaFuncionarioEx().setEditable(false);
         view.getObservacaoFuncionarioEx().setEditable(false);
         
      
     }
    
    
       public void preencherDadosFuncionario(){
           
           int setar = view.getTabelaConsultaEx().getSelectedRow(); 
           int codigofuncionario = Integer.parseInt(view.getTabelaConsultaEx().getModel().getValueAt(setar, 0).toString());
           
           
             String sql = "SELECT * FROM funcionario WHERE id = ? AND id_situacaocadastro = 0";
             
       try {
            executar = conexaoBD.prepareStatement(sql);           

            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setInt(1, codigofuncionario);
            rs=executar.executeQuery();
            
            if (rs.next()) {

           view.getCodFuncionarioEx().setText(String.valueOf(codigofuncionario));
           view.getChapaFuncionarioEx().setText(rs.getString("chapa"));
           view.getDataAdmissaoEx().setText(rs.getString("dataadmissao"));
           view.getNomeFuncionarioEx().setText(rs.getString("nome"));
           view.getCpfFuncionarioEx().setText(rs.getString("cpf"));
           view.getRgFuncionarioEx().setText(rs.getString("rg"));
           view.getOcultoSetorIdEx().setText(rs.getString("id_setor"));
           view.getOcultoIdEmpresaFuncionario().setText(String.valueOf(rs.getString("id_empresa")));
           view.getObservacaoFuncionarioEx().setText(rs.getString("observacao"));
           
            preencherDadosEmpresaEx();
            preencherDadosSetorEx();
            atualizarListaEpi();
            atualizarEpiExc ();
           } 
           
       } catch (SQLException erro) {
           JOptionPane.showMessageDialog(null, "Erro ao Consultar Funcionario : " + erro, "CSEC - Consulta de Funcionario Ex.", JOptionPane.ERROR_MESSAGE);
       }
   }
 
   public void preencherDadosEmpresaEx(){
       
       int idEmpresa = Integer.parseInt(view.getOcultoIdEmpresaFuncionario().getText());
       
                    String sql = "SELECT descricao FROM Empresa WHERE id = ? AND id_situacaocadastro = 0";
             
       try {
            executar = conexaoBD.prepareStatement(sql);           

            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setInt(1, idEmpresa);
            rs=executar.executeQuery();
            
            if (rs.next()) {
           view.getEmpresaFuncionarioEx().setText(rs.getString("descricao"));
            }
           
            }catch(SQLException erro){
        JOptionPane.showMessageDialog(null, "Erro ao Consultar Funcionario : " + erro, "CSEC - Consulta de Funcionario Ex.", JOptionPane.ERROR_MESSAGE);
                    }
   }    
   
   
   public void preencherDadosSetorEx(){
       
       int idsetorex = Integer.parseInt(view.getOcultoSetorIdEx().getText());
       System.out.println(idsetorex);
       
                    String sql = "SELECT nome,riscosetor FROM setor WHERE id = ? AND id_situacaocadastro = 0";
             
       try {
            executar = conexaoBD.prepareStatement(sql);           

            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setInt(1, idsetorex);
            rs=executar.executeQuery();
            
            if (rs.next()) {
           view.getNomeSetorFuncEx().setText(rs.getString("nome"));
           view.getRiscosetorEx().setText(rs.getString("riscosetor"));
            }
           
            }catch(SQLException erro){
        JOptionPane.showMessageDialog(null, "Erro ao Consultar Funcionario : " + erro, "CSEC - Consulta de Funcionario Ex.", JOptionPane.ERROR_MESSAGE);
                    }
   }    
   
   
   
   //****** Ajustar metodos
   
   
   public void consultarEpiEx(){
      
       String sql = "SELECT id,descricao FROM epi WHERE descricao LIKE ? AND id_situacaocadastro = 0";
             
       try {
    
            executar = conexaoBD.prepareStatement(sql);    
           
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setString(1, view.getConsultaEpiEx().getText()+"%");
            rs=executar.executeQuery();
            
        //a linha abixo vai usar a rs2XML.jar para preencher a Tabela
          view.getTabelaEpiEx().setModel(DbUtils.resultSetToTableModel(rs));            
            
       
       } catch (SQLException erro) {
            // Icones a 32px para caixa de mensagem
                ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
                JOptionPane.showMessageDialog(null," Erro na Consutla deste EPI \n Erro:  !"+erro,"Cadastro de EPI",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
       }
   }
   
   public void inserirEpiEx() throws SQLException{
       
       int setar = view.getTabelaEpiEx().getSelectedRow(); 
       int codigoEpiTabela = Integer.parseInt(view.getTabelaEpiEx().getModel().getValueAt(setar, 0).toString());
       
               
         if (!view.getCodFuncionarioEx().getText().trim().isEmpty()) {
            
             
          try{
          String sql = "INSERT INTO epiexcecao(id_epi,qtd_epi,id_funcionario) VALUES (?,?,?);";                  

            PreparedStatement executar = null;
            executar = conexaoBD.prepareStatement(sql);
            
            executar.setInt(1, codigoEpiTabela);
            executar.setInt(2, Integer.parseInt(view.getQtdEpiEx().getText()));
            executar.setInt(3, Integer.parseInt(view.getCodFuncionarioEx().getText()));

              executar.execute();
              

        // Icones a 32px para caixa de mensagem
                ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\salvar.png");
                JOptionPane.showMessageDialog(null," Exceção de EPI salvo com Sucesso!","Cadastro de EPI",JOptionPane.PLAIN_MESSAGE,iconeSalvo );

        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro o Salvar Exceção EPI! \n  Erro: "+ex,"Cadastro de EPI", JOptionPane.ERROR_MESSAGE);
          
      }
         }else{
           // Icones a 32px para caixa de mensagem
                ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\atencao.png");
                JOptionPane.showMessageDialog(null,"Selecione um Funcionario para atribuir este EPI","Cadastro deExceção de EPI",JOptionPane.PLAIN_MESSAGE,iconeSalvo );  
         }
        }
 
   
   
  public void atualizarEpiExc (){
      
  int codSetorex = Integer.parseInt(view.getCodFuncionarioEx().getText());
          
          
           String sql = "SELECT epi.descricao, ex.qtd_epi FROM epiexcecao ex INNER JOIN epi on epi.id = ex.id_epi WHERE ex.id_funcionario = ?";
             
       try {
    
            executar = conexaoBD.prepareStatement(sql);    
           
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setInt(1, codSetorex);
            rs=executar.executeQuery();
            
        //a linha abixo vai usar a rs2XML.jar para preencher a Tabela
          view.getTabelaEpiSetorFuncionarioEx().setModel(DbUtils.resultSetToTableModel(rs));    
          
           
       } catch (SQLException erro) {
            // Icones a 32px para caixa de mensagem
                ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
                JOptionPane.showMessageDialog(null," Erro na Consutla deste EPI \n Erro:  !"+erro,"Cadastro de EPI",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
       }
      
  }
   
  public void atualizarListaEpi(){
      
      int codigosetorex = Integer.parseInt(view.getOcultoSetorIdEx().getText());  
      
           String sql = "SELECT epi.descricao, sp.qtd_epi FROM setorepi sp INNER JOIN setor on setor.id = sp.id_setor INNER JOIN epi on epi.id = sp.id_epi WHERE sp.id_setor = ?";
             
       try {
    
            executar = conexaoBD.prepareStatement(sql);    
           
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setInt(1, codigosetorex);
            rs=executar.executeQuery();
            
        //a linha abixo vai usar a rs2XML.jar para preencher a Tabela
          view.getTabelaEpiSetorEx().setModel(DbUtils.resultSetToTableModel(rs));    
          
           
       } catch (SQLException erro) {
            // Icones a 32px para caixa de mensagem
                ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
                JOptionPane.showMessageDialog(null," Erro na Consutla deste EPI \n Erro:  !"+erro,"Cadastro de EPI",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
       }
      
  }
   
  
  
  //---------------------------  REMOVER -----------------------------------
  
  //REMOVER DA LISTA
    public void excluirEpiEx(){
         
       DefaultTableModel dtm = (DefaultTableModel) view.getTabelaEpiSetorFuncionarioEx().getModel();
       dtm.removeRow(view.getTabelaEpiSetorFuncionarioEx().getSelectedRow());

       }
    
     public void limparBancoEPISetor(){
           
                            String sql = "DELETE FROM epiexcecao WHERE id_funcionario = ?  ";
       
       try {
           
           int id_funcionarioex = Integer.valueOf(view.getCodFuncionarioEx().getText()).intValue();
           
            executar = conexaoBD.prepareStatement(sql);    
            
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setInt(1, id_funcionarioex);
            executar.execute();
 
           
       } catch (SQLException erro) {
           JOptionPane.showMessageDialog(null, "Erro ao Excluir os EPI desta lista : " + erro, "Consulta de Excecão EPI", JOptionPane.ERROR_MESSAGE);
       }
           
       }
    
    public void salvarSetorEpiBanco(){
       
         try{
         setQuantidade_linha(view.getTabelaEpiSetorFuncionarioEx().getRowCount());// = view.getListaEpiAdicionados().getRowCount();
         
         /*
         int codigoSetor = Integer.parseInt((String)view.getOcultoSetorIdEx().getText());
         int codigoepi=Integer.parseInt((String) view.getListaEpiAdicionados().getValueAt​( getContador_linha(), 0));
         quantidade_epi=Integer.parseInt((String) view.getListaEpiAdicionados().getValueAt​( getContador_linha(), 2));
           */
         
         int valor_id_epi = 0;
         int valor_qtd_epi = 0;
         int id_funcionario = 0;
         
             //Banco de Dados
            String sql = "INSERT INTO setorepi(id_setor,id_epi,qtd_epi) VALUES (?, ?,?);";
            PreparedStatement executar = null;
            executar = conexaoBD.prepareStatement(sql);

            executar.setInt(1, valor_id_epi);
            executar.setInt(2, valor_qtd_epi);
            executar.setInt(3,id_funcionario);
       
            executar.execute();

           setContador_linha(getContador_linha()+1);
           //contador_coluna++;
                }catch(SQLException erro){
                ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
                JOptionPane.showMessageDialog(null, " Erro ao Salvar Setor e EPI: !"+erro, "Cadastro de Setor e EPI", JOptionPane.PLAIN_MESSAGE, iconeSalvo);  
                }

   }
     
     
      public void inserirEpiExBanco() throws SQLException {
        
          limparBancoEPISetor();
          
            do{ 
        
                try{
                    
             salvarSetorEpiBanco();       
                               
                }catch(Exception erro){
                ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
                JOptionPane.showMessageDialog(null, " Erro ao Salvar Exceções de EPI: !"+erro, "Cadastro de Setor e EPI", JOptionPane.PLAIN_MESSAGE, iconeSalvo);  
                }        
            }while(getQuantidade_linha() > getContador_linha());
             setQuantidade_linha(0);
             setContador_linha(0);
             // Icones a 32px para caixa de mensagem
            ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\salvar.png");
            JOptionPane.showMessageDialog(null, " Salvo com Sucesso! ", "Constulta de Setor e EPI", JOptionPane.PLAIN_MESSAGE, iconeSalvo);   
          
      }
    
      
  
}
