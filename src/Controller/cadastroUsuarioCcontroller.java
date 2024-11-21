/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DAO.usuarioDAO;
import Model.usuario;
import View.cadastroUsuario;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabinhu
 */
public class cadastroUsuarioCcontroller {
    
    private cadastroUsuario view;

    public cadastroUsuarioCcontroller(cadastroUsuario view) {
        this.view = view;
    }

    public void inserirCadastroBanco(){    
        
        String nome = view.getNomeUsuario().getText();
        String login = view.getLoginUsuario().getText();
        String senha = view.getSenhaUsuario().getText();
        String email = view.getEmailUsuario().getText();
        //String situacaocadastro = view.getjcbSituacaoCadastro
        
        
      usuario usuarioTeste = new usuario(nome, login,senha,email,1);

        try {

        Connection conexaoBD = new conexaoBancoController().conectarBanco();
        usuarioDAO usuariodao = new usuarioDAO(conexaoBD);
        usuariodao.salvarUsuario(usuarioTeste);
        
        // Icones a 32px para caixa de mensagem
                ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\salvar.png");
                JOptionPane.showMessageDialog(null," Usuario salvo com Sucesso!","Cadastro de Usuario",JOptionPane.PLAIN_MESSAGE,iconeSalvo );

        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro o Salvar Cadastro: "+ex,"Cadastro de Usuario", JOptionPane.ERROR_MESSAGE);
        }
        
    }
  
    
}
