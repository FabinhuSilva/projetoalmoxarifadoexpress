/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import View.cadastroEPI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabinhu
 */
public class cadastroEpiController {
    
    private cadastroEPI view;

    public cadastroEpiController(cadastroEPI view) {
        this.view = view;
    }

    
     
   public void inserirEpiBanco(){    
        
        String descricao = view.getDescricaoCadastroEpi().getText().trim();
        String descartavel = view.getDescartavelCadastroEpi().getSelectedItem().toString();
        String devolver = view.getEntregaTrocaCadastroEpi().getSelectedItem().toString();
        String validade = view.getValidadeCadastroEpi().getText();
        String observacao = view.getObservacaoCadastroEpi().getText().trim();
        String codigoCa = view.getCodigoCACadastroEpi().getText();
        String id_empresa = view.getCodigoFornCadastroEpi().getText();
        String loteCa = view.getLoteCaCadastroEpi().getText();
        String instrucao = view.getInstrucaoCadastroEpi().getText().trim();
        
               
        try {

        Connection conexaoBD = new conexaoBancoController().conectarBanco();

        
        //Testandoo
        //----------------------------------------------
          
              String sql = "INSERT INTO epi(descricao,descartavel, devolver, validade, observacao,codigoca,id_empresa,loteca,instrucao) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";


            PreparedStatement executar = null;
            executar = conexaoBD.prepareStatement(sql, executar.RETURN_GENERATED_KEYS);
            
            //conersoes
            int valiaddeInt = Integer.parseInt(validade);
            int codigocaInt = Integer.parseInt(codigoCa);
            int codigofornecedorInt = Integer.parseInt(id_empresa);
            int lotecaInt = Integer.parseInt(loteCa);         
            
            executar.setString(1, descricao);
            executar.setString  (2, descartavel);
            executar.setString(3,devolver);
            executar.setInt(4,valiaddeInt);
            executar.setString(5,observacao);
            executar.setInt(6,codigocaInt);
            executar.setInt(7,codigofornecedorInt);
            executar.setInt(8,lotecaInt);
            executar.setString(9,instrucao);
            
              executar.execute();
              ResultSet rs = executar.getGeneratedKeys();
          

        //----------------------------------------------
        
        
        // Icones a 32px para caixa de mensagem
                ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\salvar.png");
                JOptionPane.showMessageDialog(null," Usuario salvo com Sucesso!","Cadastro de Usuario",JOptionPane.PLAIN_MESSAGE,iconeSalvo );

        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro o Salvar Cadastro: "+ex,"Cadastro de Usuario", JOptionPane.ERROR_MESSAGE);
        }   
    }    
}
