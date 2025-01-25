/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.EntregaEPI;
import View.Relatorios.intEntregaEPI;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;



/**
 *
 * @author Fabinhu
 */
public class entregaEPIController {
    
        PreparedStatement pst = null;
        ResultSet rs = null;
        PreparedStatement executar = null;
        Connection conexaoBD = new conexaoBancoController().conectarBanco();
        
        
        private final intEntregaEPI view;
        private  EntregaEPI viewFrame;
           
String exportaCodigo;

    public String getexportaCodigo() {
        return exportaCodigo;
    }

    public void setexportaCodigo(String exportaCodigo) {
        this.exportaCodigo = exportaCodigo;
    }


    public entregaEPIController(intEntregaEPI view){
    this.view = view;
}

public void bloqueiacampos(){
     view.setSize(535,820);
}
    
    
public void oculatarCampos(){
 
    view.getPaneFuncionario().setVisible(false);
    view.getBotaoEditar().setEnabled(false);
    view.getBotaoExcluir().setEnabled(false);
    view.getBotaoImprimir().setEnabled(false);
    view.getBotaoconsultarmenu().setEnabled(false);
    view.getOcultoselecao().setVisible(false);
    view.getIdOculdoFuncionario().setVisible(false);
    view.getIdOculdoCodEmpresaFuncionario().setVisible(false);
    view.setSize(520,230);
    view.getBotaoImprimirTela().setVisible(false);
    
    
    //bloqueados
    
             view.getCodFuncionario().setEnabled(false);
             view.getNomeFuncionario().setEditable(false);
             view.getRgFuncionario().setEditable(false);
             view.getCpfFuncionario().setEditable(false);
             view.getChapaFuncionario().setEditable(false);
             view.getDataAdmissaoFuncionario().setEditable(false);
             view.getCodigoSetorFuncionario().setEnabled(false);
             view.getIdOculdoCodEmpresaFuncionario().setEditable(false);
             view.getCodigoCargoFuncionario().setEnabled(false);
             view.getCnpjEmpresaFuncionario().setEnabled(false);
             view.getNomeEmpresaFuncionario().setEditable(false);
             view.getSetorFuncionario().setEditable(false);
             view.getCargoFuncionario().setEditable(false);
    
}

public void popularCampos() throws SQLException{
preencherCamposFuncionario();
preencherCamposSetorFuncionario();
preencherCamposEmpresaFuncionario();
preencherCamposCargoFuncionario();
preencherCamposEmpresaFuncionario();
atualizarEpi();
atualizarEPIExcecao();
}



public void selecionarFuncinoario() throws SQLException{
   
        int setar = view.getTabelaFuncionario().getSelectedRow();
        int codigoFuncTabela = (int) view.getTabelaFuncionario().getModel().getValueAt(setar, 0);
        view.getOcultoselecao().setText(String.valueOf(codigoFuncTabela)); 
     
}       


public void consultaFuncionario(){
      
           String sql = "SELECT id,nome,cpf,rg FROM funcionario where nome LIKE ?";
             
       try {
    
            executar = conexaoBD.prepareStatement(sql);    
            executar.setString(1, view.getNomeFuncionarioConsulta().getText()+"%");
            rs=executar.executeQuery();
            view.getTabelaFuncionario().setModel(DbUtils.resultSetToTableModel(rs));    
        
       
          
       } catch (SQLException erro) {
            // Icones a 32px para caixa de mensagem
                ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
                JOptionPane.showMessageDialog(null," Erro na Consutla deste EPI \n Erro:  !"+erro,"Entrega de EPI",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
       }
      
  }
    
    

 public void preencherCamposFuncionario() throws SQLException{
          
          String sql = " SELECT * FROM funcionario WHERE id = ?;";
       
           executar = conexaoBD.prepareStatement(sql);    
           
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setInt(1,Integer.valueOf( view.getOcultoselecao().getText()));
            rs=executar.executeQuery();
         
          if(rs.next()){
            
             view.getCodFuncionario().setText( rs.getString("id"));
             view.getNomeFuncionario().setText( rs.getString("nome"));
             view.getRgFuncionario().setText( rs.getString("rg"));
             view.getCpfFuncionario().setText( rs.getString("cpf"));
             view.getChapaFuncionario().setText(rs.getString("chapa"));
             view.getDataAdmissaoFuncionario().setText(rs.getString("dataadmissao"));
             view.getCodigoSetorFuncionario().setText(rs.getString("id_setor"));
             view.getIdOculdoCodEmpresaFuncionario().setText(rs.getString("id_empresa"));
             view.getCodigoCargoFuncionario().setText(rs.getString("id_cargo"));
             
                           
          }
       
   }

 
 public void preencherCamposEmpresaFuncionario() throws SQLException{
          
          String sql = " SELECT * FROM empresa WHERE id = ?;";
       
           executar = conexaoBD.prepareStatement(sql);    
           
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setInt(1,Integer.valueOf( view.getIdOculdoCodEmpresaFuncionario().getText()));
            rs=executar.executeQuery();
         
          if(rs.next()){
            
             view.getCnpjEmpresaFuncionario().setText( rs.getString("cnpj"));
             view.getNomeEmpresaFuncionario().setText( rs.getString("descricao"));           
                           
          }
       
   }

 
  public void preencherCamposSetorFuncionario() throws SQLException{
          
          String sql = " SELECT nome FROM setor WHERE id = ?;";
       
           executar = conexaoBD.prepareStatement(sql);    
           
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setInt(1,Integer.valueOf( view.getCodigoSetorFuncionario().getText()));
            rs=executar.executeQuery();
         
          if(rs.next()){
            
             view.getSetorFuncionario().setText( rs.getString("nome"));
             
                           
          }
       
   }
 
   public void preencherCamposCargoFuncionario() throws SQLException{
          
          String sql = " SELECT descricao FROM cargo WHERE id = ?;";
       
           executar = conexaoBD.prepareStatement(sql);    
           
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setInt(1,Integer.valueOf( view.getCodigoCargoFuncionario().getText()));
            rs=executar.executeQuery();
         
          if(rs.next()){
            
             view.getCargoFuncionario().setText( rs.getString("descricao"));
             
                           
          }
       
   }
  
  
   public void atualizarEpi(){
      
           String sql =  "select epi.id,epi.descricao,setp.qtd_epi from setorepi setp inner join epi on epi.id = setp.id_epi\n" +
"where setp.id_setor = ?";
             
       try {
    
            executar = conexaoBD.prepareStatement(sql);    
            executar.setInt(1,Integer.parseInt( view.getCodigoSetorFuncionario().getText()));
            rs=executar.executeQuery();
            view.getTabelaEPIFuncionario().setModel(DbUtils.resultSetToTableModel(rs));    
        
       
          
       } catch (SQLException erro) {
            // Icones a 32px para caixa de mensagem
                ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
                JOptionPane.showMessageDialog(null," Erro na Consutla deste EPI \n Erro:  !"+erro,"Entrega de EPI",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
       }
      
  }
   
   public void atualizarEPIExcecao(){
      
           String sql = "SELECT epi.id,epi.descricao, ex.qtd_epi FROM epiexcecao ex INNER JOIN epi on epi.id = ex.id_epi WHERE ex.id_funcionario = ?";
             
       try {
    
            executar = conexaoBD.prepareStatement(sql);    
            executar.setInt(1, Integer.parseInt(view.getOcultoselecao().getText()));
            rs=executar.executeQuery();
            view.getTabelaExcecaoEPIFuncionario().setModel(DbUtils.resultSetToTableModel(rs));    
        
       
          
       } catch (SQLException erro) {
            // Icones a 32px para caixa de mensagem
                ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
                JOptionPane.showMessageDialog(null," Erro na Consutla deste EPI \n Erro:  !"+erro,"Entrega de EPI",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
       }
      
  }
 
   //------------------ Metodo de Geração de Relatorio --------------
   
    
   
   public void gerarRelatorio() throws FileNotFoundException, IOException, JRException{  
    
       View.menuPrincipal menu = new View.menuPrincipal();

    
    int codFunc = Integer.parseInt(view.getOcultoselecao().getText());
    
    String jasper = "C:\\AlmoxarifadoExpress\\relatorios\\entregadeEPI.jasper";
    System.out.println("passou aqui 1");    
    
    HashMap<String, Object> parametro = new  HashMap<String, Object>();
    parametro.put("codigoFuncionario", codFunc);
    System.out.println("passou aqui 2");    
    byte[] bytes = null;
   
        System.out.println("passou aqui 3 ");    
        JasperReport relatorio = (JasperReport) JRLoader.loadObjectFromFile(jasper);
        bytes = JasperRunManager.runReportToPdf(relatorio, parametro, conexaoBD);
        System.out.println("passou aqui 4");    
        

//exibe o resultado  
JasperPrint impressao = JasperFillManager.fillReport( relatorio , parametro,conexaoBD );
JasperViewer viewer = new JasperViewer( impressao , false );
viewer.show();


        
/*
    Date dataHoraAtual = new Date();
    //String dataatual = new SimpleDateFormat("ddMMYYYY").format(dataHoraAtual);
        
    //Criando arquivo apartir do JASPER    
    File arquivo = new File("C:\\AlmoxarifadoExpress\\relatorios\\gerados","entregaEpi"+dataatual+".pdf");
    
    System.out.println("passou aqui 5");    
            if (arquivo.exists()) {
            arquivo.delete();
        }
            System.out.println("passou aqui 6 ");    
        
            FileOutputStream fos = new FileOutputStream(arquivo);
            
                fos.write(bytes);
            
                fos.flush();
            
                fos.close();
            
            System.out.println("passou aqui 7");    
            Desktop abrir = Desktop.getDesktop();
            
                abrir.open(arquivo);
    
  */              
   }
   
//https://www.youtube.com/watch?v=fXBNDIe5fCU
//https://www.youtube.com/watch?v=dET2WkH8dBo
    


public void carregarRelatorio(){
    
           View.menuPrincipal menu = new View.menuPrincipal();
           Date dataHoraAtual = new Date();
           JRResultSetDataSource jrRS;
           
    String dataatual = new SimpleDateFormat("ddMMYYYY").format(dataHoraAtual);   
    int codFunc = Integer.parseInt(view.getCodFuncionario().getText());
    //String codigofuncionario = view.getOcultoselecao().getText();
    String caminho_relatorio = "C:\\AlmoxarifadoExpress\\relatorios\\entregadeEPI.jrxml";
    
    /*
    
     String sql = " SELECT nome FROM setor WHERE id = ?;";
       
           executar = conexaoBD.prepareStatement(sql);    
    
            //View.menuPrincipal menu = new View.menuPrincipal();
        PreparedStatement pst = null;
        ResultSet rs = null;
        PreparedStatement executar = null;
        Connection conexaoBD = new conexaoBancoController().conectarBanco();
    
    ----------------------------------------------------------------
    
        String sql = " SELECT descricao FROM cargo WHERE id = ?;";
       
        executar = conexaoBD.prepareStatement(sql);    
           
        //O trecho abaixo troca o ? pelo conteudo da caixa
        executar.setInt(1,Integer.valueOf( view.getCodigoCargoFuncionario().getText()));
        rs=executar.executeQuery();
        
    
    ----------------------------------------------------------------------
    
    
    conexao conex = new conexao(); 
    conex.conecta();
    conex.executeSql("select * from bairro");
    JRResultSetDataSource jrRS = new JRResultSetDataSource(conex.resultset);
    
    //supondo que o teu ficheiro teste.jasper esteja dentro da tiua aplicação URL 
    arquivo = getClass().getResource("report2.jasper"); 
    HashMap map = new HashMap(); 
    JasperReport jasperReport = (JasperReport) JRLoader.loadObject(arquivo); 
    
    //aqui, como não vais passar parâmetros para dentro do relatório, e porque estou a assumir que não tenhas ligação com base de dados, os dois ultimos parametros são nulos 
    JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, map, jrRS); 
    
    //isto mostra.te o viewer, penso que é a melhor maneira, pois assim a pessoa escolhe o formato em que quer gravar, e o sitio onde gravar 
    JasperViewer jrviewer = new JasperViewer(jasperPrint, false); jrviewer.setVisible(true);
    
    
    */
            try {
                rs=executar.executeQuery("SELECT\n" +
                        "     func.chapa AS chapa,\n" +
                        "     func.id as codigoFunc,\n" +
                        "     func.dataadmissao as dtAdimissao,\n" +
                        "     func.nome AS nomeFuncionario,\n" +
                        "     func.cpf AS cpfFuncionario,\n" +
                        "     func.rg AS rgFuncionario,\n" +
                        "     func.id_cargo AS codigoCargo,\n" +
                        "     cg.descricao AS DescricaoCargo,\n" +
                        "     emp.cnpj AS cnpjEmpresa,\n" +
                        "     func.id_empresa AS codigoEmpresa,\n" +
                        "     emp.descricao AS descricaoEmpresa,\n" +
                        "     func.id_setor AS codigoSetor,\n" +
                        "     st.nome AS nomeSetor,\n" +
                        "     cg.descricao AS cargoDescricao,\n" +
                        "     sepi.id_epi AS setEPI,\n" +
                        "     sepi.qtd_epi AS setQtdEpi,\n" +
                        "     e.descricao AS epiDescricao\n" +
                        "FROM\n" +
                        "     funcionario func\n" +
                        "     --INNER JOIN funcionarioepi as fepi ON func.id = fepi.id_funcionario\n" +
                        "     INNER JOIN empresa as emp ON func.id_empresa = emp.id\n" +
                        "     INNER JOIN setor as st ON func.id_setor = st.id\n" +
                        "     INNER JOIN cargo as cg ON func.id_cargo = cg.id\n" +
                        "     INNER JOIN epiexcecao as ex ON func.id = ex.id_funcionario\n" +
                        "     INNER JOIN setorepi as sepi ON st.id = sepi.id_setor\n" +
                        "     INNER JOIN epi as e ON sepi.id_epi = e.id\n" +
                        "WHERE\n" +
                        "     func.id = $P{codigoFuncionario}");
            } catch (SQLException ex) {
                Logger.getLogger(entregaEPIController.class.getName()).log(Level.SEVERE, null, ex);
            }
    /* implementação da interface JRDataSource para DataSource ResultSet */
    jrRS = new JRResultSetDataSource( rs ); 
    
    
   
            try {
                //linha para abrir e compilar o relatorio
                JasperReport relatorio = JasperCompileManager.compileReport(caminho_relatorio);
                
                //-------------------hashMAP-----------
                 HashMap<String, Object> parametro = new  HashMap<String, Object>();
                 parametro.put("codigoFuncionario", codFunc);
                //-------------------------------------
                
                
                //preenche o relatorio com os parametros 
                
                //JasperPrint relatorio_preenchido = JasperFillManager.fillReport(relatorio,parametro,conexaoBD);
                JasperPrint relatorio_preenchido = JasperFillManager.fillReport(relatorio,parametro,conexaoBD);
                
                //mostra o relatorio - Tela de Visualização 
                JasperViewer.viewReport(relatorio_preenchido);
                try {
                    conexaoBD.close();
                } catch (SQLException ex) {
                    Logger.getLogger(entregaEPIController.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (JRException ex) {
                Logger.getLogger(entregaEPIController.class.getName()).log(Level.SEVERE, null, ex);
            }
}

}


