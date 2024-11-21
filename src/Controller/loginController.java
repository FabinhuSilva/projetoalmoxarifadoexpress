/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.DAO.usuarioDAO;
import Model.usuario;
import View.cadastroConfigBanco;
import View.login;
import View.menuPrincipal;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Controller.conexaoBancoController;
import javax.swing.JFrame;
/**
 *
 * @author Fabinhu
 */
public class loginController {

    private final login view;

    
    public loginController(login view) {
        this.view = view;        
    }


    public void autenticarLogin() throws SQLException {
        //Buscar Usuario da View
        String usuarioLogin = view.getTxtloginUsuario().getText();
        String senhaLogin = view.getTxtLoginSenha().getText();
        
        usuario usuarioSenhaLogin = new usuario(usuarioLogin, senhaLogin);
        
        
        //Verificar se Existe no Banco
        
        Connection conexaoBD = new conexaoBancoController().conectarBanco();
        usuarioDAO usuariodao = new usuarioDAO(conexaoBD);
        
        boolean usuarioCadastrado = usuariodao.consultarUsuarioSenhaLogin(usuarioSenhaLogin);
        
        //Se Sim, direcionar para o Menu
        if(usuarioCadastrado){
       menuPrincipal telademenu  = new menuPrincipal();
       telademenu.setVisible(true);  
       login menuLogin = new login();
       menuLogin.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        }else{
            // Icones a 32px para caixa de mensagem
            ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
            JOptionPane.showMessageDialog(null," Usuario e Senha invalidos!","Login",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
        }
    }

    public void acessarCadastroBanco() {
       cadastroConfigBanco configuracaoBanco  = new cadastroConfigBanco();
       configuracaoBanco.setVisible(true);
    }
    
}
