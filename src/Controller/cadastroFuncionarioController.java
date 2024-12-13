/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.cadastroFuncionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;



/**
 *conexaoBancoController().conectarBanco(); 
 * @author Fabinhu
 */
public class cadastroFuncionarioController {
    
    
      private cadastroFuncionario view;
        Connection conexao = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        PreparedStatement executar = null;
        
            Connection conexaoBD = new conexaoBancoController().conectarBanco();
     
        
    public cadastroFuncionarioController(cadastroFuncionario view) {
        this.view = view;
        
    }
    
    
     public void inserirFuncionarioBanco(){    
        
        String chapaFuncionario = (String) view.getChapaFuncionario().getText().trim();
        String situacaoCadastro = view.getSituacaofuncionario().getSelectedItem().toString();
        String nomeFuncionario = view.getNomeFuncionario().getText();;
        String cpfFuncinoario = view.getCpfFuncionario().getText();
        String rgFuncionario = view.getRgFuncionario().getText().trim();
        String idEmpresa = view.getIdEmpresaFuncionario().getText();
        String observacaoFuncionario = view.getObservacaoFuncionario().getText();                        
               
        try {
              
        String sql = "INSERT INTO funcionario(nome,cpf,rg,id_empresa, id_situacaocadastro,chapa,observacao) VALUES (?, ?, ?, ?, ?, ?, ?);";                  

            PreparedStatement executar = null;
            executar = conexaoBD.prepareStatement(sql, executar.RETURN_GENERATED_KEYS);
            
            //Conversões
             int idEmpresaConvert = Integer.parseInt(idEmpresa);
             int idSituacaoCadastroConvert=1;
            
             if(situacaoCadastro.equals("Ativo") ){
                 idSituacaoCadastroConvert = 1;
             }else{
                 idSituacaoCadastroConvert = 0;
             }
             
            /*conversoes
            int valiaddeInt = Integer.parseInt(validade);
            int codigocaInt = Integer.parseInt(codigoCa);
            int codigofornecedorInt = Integer.parseInt(id_empresa);
            int lotecaInt = Integer.parseInt(loteCa);         
            */
            executar.setString(1, nomeFuncionario);
            executar.setString  (2, cpfFuncinoario);
            executar.setString(3,rgFuncionario);
            executar.setInt(4,idEmpresaConvert);
            executar.setInt(5,idSituacaoCadastroConvert);
            executar.setString(6,chapaFuncionario);
            executar.setString(7,observacaoFuncionario);
        
            
              executar.execute();
              ResultSet rs = executar.getGeneratedKeys();
          

        // Icones a 32px para caixa de mensagem
                ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\salvar.png");
                JOptionPane.showMessageDialog(null," Usuario salvo com Sucesso!","Cadastro de Usuario",JOptionPane.PLAIN_MESSAGE,iconeSalvo );

        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro o Salvar Cadastro: "+ex,"Cadastro de Usuario", JOptionPane.ERROR_MESSAGE);
        }   
    }    
     
public void consultarEmpresa() throws SQLException{
    
       
        conexao = new conexaoBancoController().conectarBanco(); 
    
        String sql = "SELECT * FROM EMPRESA WHERE cnpj = ?;";
        
        
    try{
        
        pst=conexao.prepareStatement(sql);
        // conteudo que vai ser colocado no lugar do '?' do SQL acima
        pst.setString(1,view.getCnpjEmpresaFuncionario().getText());
        rs=pst.executeQuery();
        
        //Retorno da consulta
        if (rs.next()) {
           
           // O sistema vai pegar a posição da tabela, no caso ali, os valores das coluas, sendo da primeira a ultima 
           view.getIdEmpresaFuncionario().setText(rs.getString(1));
           view.getNomeEmpresaFuncionario().setText(rs.getString(2));
           view.getEnderecoEmpresaFuncionario().setText(rs.getString(5));

        } else {
            
            // Comando para limapr os campos quando digita errado
           view.getIdEmpresaFuncionario().setText(" ");
           view.getNomeEmpresaFuncionario().setText(" ");
           view.getEnderecoEmpresaFuncionario().setText(" ");
           
            JOptionPane.showMessageDialog(null,"Empresa não Encontrada! \n CNPJ: "+view.getCnpjEmpresaFuncionario().getText(),"Consulta de Empresa", JOptionPane.ERROR_MESSAGE);

        
        }
    }catch (SQLException ex ) {
      JOptionPane.showMessageDialog( null, "Erro: "+ex , "Aviso",JOptionPane.WARNING_MESSAGE );
            }

              
}

public void bloquearCampos(){
    //Cadastro de funcionario
        view.getIdFuncionario().setEditable(false);
        
    
    //Cadastro de Empresa
        view.getIdEmpresaFuncionario().setEditable(false);
        view.getNomeEmpresaFuncionario().setEditable(false);
        view.getEnderecoEmpresaFuncionario().setEditable(false);
        view.getBotaoPesquisarEmpresa().setEnabled(false);
        
     //cadastro Setor
        view.getCodSetorFuncionario().setEditable(false);
        view.getDescSetorFuncionario().setEditable(false);
    
    /*RemoverGrid de Tabela
    Lembrando que esta linha tem que ser dada no JScrool Pane da Tabela
    */
        view.getPaneSetor().setColumnHeader(null);
    
        
     
     //excessoes do Cadastro
     
    
     
        
}


public void consultarSetorFuncionario(){
      
       String sql = "SELECT id,nome,riscosetor FROM setor WHERE nome LIKE ? AND id_situacaocadastro = 0";
             
       try {
            executar = conexaoBD.prepareStatement(sql);    
           
            //O trecho abaixo troca o ? pelo conteudo da caixa
            executar.setString(1, view.getConsultaSetorFuncionario().getText()+"%");
            rs=executar.executeQuery();
            
        //a linha abixo vai usar a rs2XML.jar para preencher a Tabela
          view.getTabelaConsultaSetor().setModel(DbUtils.resultSetToTableModel(rs));            
            
         //Retorno da consulta
       
       } catch (SQLException erro) {
            // Icones a 32px para caixa de mensagem
                ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
                JOptionPane.showMessageDialog(null," Erro na Consutla deste SETOR \n Erro:  !"+erro,"Cadastro de Usuario",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
       }
   }

      public void CodigoSetor(){
         
        int setar = view.getTabelaConsultaSetor().getSelectedRow();
        
        String codSetor = Integer.toString((int) view.getTabelaConsultaSetor().getModel().getValueAt(setar, 0));
        String descricaoSetor = (String) view.getTabelaConsultaSetor().getModel().getValueAt(setar, 1);
        
          System.out.println(codSetor +"-"+ descricaoSetor);
        
        view.getCodSetorFuncionario().setText(Integer.toString((int) view.getTabelaConsultaSetor().getModel().getValueAt(setar, 0)));
        view.getDescSetorFuncionario().setText((String) view.getTabelaConsultaSetor().getModel().getValueAt(setar, 1));
        
        
      }
         
          
}

    
    
    

