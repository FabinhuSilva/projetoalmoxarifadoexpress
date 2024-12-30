/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import View.cadastroEmpresa;
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
public class cadastroEmpresaController {
    
        private final cadastroEmpresa view;

    public cadastroEmpresaController(cadastroEmpresa view) {
        this.view = view;
    }
    
    
     public void inserirEmpresaBanco(){    
        
        String nomeEmpresa = view.getNomeEmpresa().getText().trim();
        int situacaoCadastro = view.getCbSituacaoCadastroEmpresa().getSelectedIndex();
        String cpfCnpjEmpresa = view.getCpfCnpjEmpresa().getText();
        String ieEmpresa = view.getIeEmpresa().getText();
        String enderecoEmpresa = view.getEnderecoEmpresa().getText().trim();   
               
        try {

        Connection conexaoBD = new conexaoBancoController().conectarBanco();

        
        //Testandoo
        //----------------------------------------------
          
              String sql = "INSERT INTO empresa(descricao, cnpj, ie, endereco, id_situacaocadastro) VALUES ( ?, ?, ?, ?, ?);";


            PreparedStatement executar = null;
            executar = conexaoBD.prepareStatement(sql, executar.RETURN_GENERATED_KEYS);
            
            /*conersoes
            int valiaddeInt = Integer.parseInt(validade);
            int codigocaInt = Integer.parseInt(codigoCa);
            int codigofornecedorInt = Integer.parseInt(id_empresa);
            int lotecaInt = Integer.parseInt(loteCa);         
            */
            
            executar.setString(1, nomeEmpresa);
            executar.setString(2,cpfCnpjEmpresa);
            executar.setString(3,ieEmpresa);
            executar.setString(4,enderecoEmpresa);
            executar.setInt(5, situacaoCadastro);
            
            
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
