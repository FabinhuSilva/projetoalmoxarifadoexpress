/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import View.cadastroSetorEpi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//biblioteca para facilitar as importações do banco com Jtable
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Fabinhu
 */
public class cadastroSetorEpiController {
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
       int contador_linha = 0;
       int contador_coluna= 0;
       
          
        int codigoSetor = 0;
        int codigoepi = 0;
        int quantidade_epi = 0;

    public int getContador_linha() {
        return contador_linha;
    }

    public void setContador_linha(int contador_linha) {
        this.contador_linha = contador_linha;
    }
    
        
        
    private cadastroSetorEpi view;

    public cadastroSetorEpiController(cadastroSetorEpi view) {
        this.view = view;
    }
    
 Connection conexaoBD = new conexaoBancoController().conectarBanco();
 PreparedStatement executar = null;
    
    
      public void inserirSetorEpiBanco() throws SQLException {
          
       
        
            do{ 
        
                try{
                    
             salvarSetorEpiBanco();       
                               
                }catch(Exception erro){
                ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
                JOptionPane.showMessageDialog(null, " Erro ao Salvar Setor e EPI: !"+erro, "Cadastro de Setor e EPI", JOptionPane.PLAIN_MESSAGE, iconeSalvo);  
                }        
            }while(quantidade_linha > getContador_linha());
            
            // Icones a 32px para caixa de mensagem
            ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\salvar.png");
            JOptionPane.showMessageDialog(null, " Usuario salvo com Sucesso!", "Cadastro de Usuario", JOptionPane.PLAIN_MESSAGE, iconeSalvo);
          
      }
    
   public void salvarSetorEpiBanco(){
       int quantidade_linha = view.getListaEpiAdicionados().getRowCount();
       
         try{
         codigoSetor = Integer.parseInt((String)view.getCodigoSetor().getText());
         codigoepi=Integer.parseInt((String) view.getListaEpiAdicionados().getValueAt​( getContador_linha(), 0));
         quantidade_epi=Integer.parseInt((String) view.getListaEpiAdicionados().getValueAt​( getContador_linha(), 2));
                
             //Banco de Dados
            String sql = "INSERT INTO setorepi(id_setor,id_epi,qtd_epi) VALUES (?, ?,?);";
            PreparedStatement executar = null;
            executar = conexaoBD.prepareStatement(sql);

            executar.setInt(1, codigoSetor);
            executar.setInt(2, codigoepi);
            executar.setInt(3,quantidade_epi);
       
            executar.execute();

           setContador_linha(contador_linha++);
            contador_coluna++;
                }catch(SQLException erro){
                ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
                JOptionPane.showMessageDialog(null, " Erro ao Salvar Setor e EPI: !"+erro, "Cadastro de Setor e EPI", JOptionPane.PLAIN_MESSAGE, iconeSalvo);  
                }

   }   
      
      
      
   public void  buscarnomeEpi(){
              
    //---------------------------------------- Testaando ourta forma
    //https://www.youtube.com/watch?v=Lj27VNzppM8&list=PLbEOwbQR9lqxsTusvu8wfkUECrmcV81MU&index=25
    //https://www.youtube.com/watch?v=9ZrJvH790Es&list=PLbEOwbQR9lqxsTusvu8wfkUECrmcV81MU&index=26
    
       String sql = "SELECT * FROM EPI WHERE descricao LIKE ? ";
       
       try {
           
            executar = conexaoBD.prepareStatement(sql);    
            
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setString(1, view.getPesquisaNomeEpi().getText()+"%");
            rs=executar.executeQuery();
            
            //a linha abixo vai usar a rs2XML.jar para preencher a Tabela
            view.getTabelaEpi().setModel(DbUtils.resultSetToTableModel(rs));
           
       } catch (SQLException erro) {
           JOptionPane.showMessageDialog(null, "Erro ao Consultar EPI (método RESULTADO) : " + erro, "CSEC - Consulta de EPI", JOptionPane.ERROR_MESSAGE);
       }
       
   }
    
       public void preencherCamposEpi(){
   
           int setar = view.getTabelaEpi().getSelectedRow();
           
           view.getCodigoEpi().setText(view.getTabelaEpi().getModel().getValueAt(setar, 0).toString());
           view.getDescricaoEpi().setText(view.getTabelaEpi().getModel().getValueAt(setar, 1).toString());
           view.getValidadeEpi().setText(view.getTabelaEpi().getModel().getValueAt(setar, 4).toString());
           view.getCaEpi().setText(view.getTabelaEpi().getModel().getValueAt(setar, 6).toString());
           view.getLotecaEpi().setText(view.getTabelaEpi().getModel().getValueAt(setar, 7).toString());
           
       }

   public void  buscarnomeSetor(){
              
       String sql = "SELECT * FROM setor WHERE nome LIKE ? ";
       
       try {
           
            executar = conexaoBD.prepareStatement(sql);    
            
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setString(1, view.getPesquisaSetor().getText()+"%");
            rs=executar.executeQuery();
            
            //a linha abixo vai usar a rs2XML.jar para preencher a Tabela
            view.getTabelaSetor().setModel(DbUtils.resultSetToTableModel(rs));
           
       } catch (SQLException erro) {
           JOptionPane.showMessageDialog(null, "Erro ao Consultar EPI (método RESULTADO) : " + erro, "CSEC - Consulta de SETOR", JOptionPane.ERROR_MESSAGE);
       }
       
   }
    
       public void preencherCamposSetor(){
   
           int setar = view.getTabelaSetor().getSelectedRow();
           
           view.getCodigoSetor().setText(view.getTabelaSetor().getModel().getValueAt(setar, 0).toString());
           view.getNomeSetor().setText(view.getTabelaSetor().getModel().getValueAt(setar, 1).toString());
           view.getRiscoSetor().setText(view.getTabelaSetor().getModel().getValueAt(setar, 3).toString());
                      
       }
       public void adicionarEpi(){
           
           DefaultTableModel dtm = (DefaultTableModel) view.getListaEpiAdicionados().getModel();
           dtm.addRow(new Object[]{view.getCodigoEpi().getText(),view.getDescricaoEpi().getText(),view.getQuantidadeEpi().getText(),view.getValidadeEpi().getText(),view.getCaEpi().getText(),view.getLotecaEpi().getText()}); 
           
       }

       public void excluirEpi(){
         
       DefaultTableModel dtm = (DefaultTableModel) view.getListaEpiAdicionados().getModel();
       dtm.removeRow(view.getListaEpiAdicionados().getSelectedRow());
       }
}
