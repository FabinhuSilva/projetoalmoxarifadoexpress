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
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
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

      Connection conexaoBD = new conexaoBancoController().conectarBanco();
      PreparedStatement pst = null;
      ResultSet rs = null;
      PreparedStatement executar = null;
      
      String logindigitado = "";

    public String getLogindigitado() {
        return logindigitado;
    }

    public void setLogindigitado(String logindigitado) {
        this.logindigitado = logindigitado;
    }
        

  
    
    public void autenticarLogin() throws SQLException {
        //Buscar Usuario da View
        String usuarioLogin = view.getTxtloginUsuario().getText();
        String senhaLogin = view.getTxtLoginSenha().getText();
        
        usuario usuarioSenhaLogin = new usuario(usuarioLogin, senhaLogin);
          
        //Verificar se Existe no Banco
        
           usuarioDAO usuariodao = new usuarioDAO(conexaoBD);
        
        boolean usuarioCadastrado = usuariodao.consultarUsuarioSenhaLogin(usuarioSenhaLogin);
        
        //Se Sim, direcionar para o Menu
       login menuLogin = new login();
        if(usuarioCadastrado){
       menuPrincipal telademenu  = new menuPrincipal();
       escreverNome();     
       //telademenu.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
       telademenu.setVisible(true); 
      
             }else{
            // Icones a 32px para caixa de mensagem
            ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\erro.png");
            JOptionPane.showMessageDialog(null," Usuario e Senha invalidos!","Login",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
         menuLogin.setVisible(true);
        }
    }

    public void acessarCadastroBanco() {
       cadastroConfigBanco configuracaoBanco  = new cadastroConfigBanco();
       configuracaoBanco.setVisible(true);
    }
 
    
          public void escreverNome(){
        
        View.login lg = new View.login();  
       
        String nomeUsuario = view.getTxtloginUsuario().getText();
        System.out.println(nomeUsuario);
          String sql = "SELECT * FROM usuario where login = '"+nomeUsuario+"'";
             
       try {
    
            executar = conexaoBD.prepareStatement(sql);               rs=executar.executeQuery();
             if(rs.next()){
            menuPrincipal telademenu  = new menuPrincipal();
         telademenu.nomeUsuarioMenu.setText(rs.getString(2));
             }
            
       }catch(SQLException e){
           System.out.println(e);
       }  

       
      }
    
    
    
    
  }
    
    /*

     public void gravaLog(){
        
        arquivoConfiguracaoBanco carregarVariaveis = new arquivoConfiguracaoBanco();
        carregarVariaveis.escrever();
        
         View.menuPrincipal mp =new View.menuPrincipal();
      
        
        Date dataHoraAtual = new Date();
        String dataFormatada = new SimpleDateFormat("ddMMYYYY").format(dataHoraAtual);
        
        
         //Criando o diretorio
        java.io.File diretorio = new java.io.File("C:\\AlmoxarifadoExpress\\log"); 
        boolean statusDiretorio = statusDiretorio = diretorio.mkdir();
        System.out.print("Repositorio Criado? = "+statusDiretorio);        
        
        
       String diretorioLog =  "C:\\AlmoxarifadoExpress\\log";
        
        //Criando o Arquivo
        java.io.File arquivo = new java.io.File(diretorioLog, "'"+dataFormatada+"'LOGalmoxarifado'"+getLogindigitado()+"'.txt"); 
      
        try{
        boolean statusArq = arquivo.createNewFile();
        System.out.print("Arquivo e Pasta Criado? " + statusArq);    
        }catch(IOException e){
             e.printStackTrace();
        }
      
        
        //File diretorioArquivo = new File("C:\\AlmoxarifadoExpress");
        //File arquivoConfiguracao = new File(diretorioLog,"almoxarifado.txt");
        
        try{
            //neste ponto criamos o arquivo fisicamente
            arquivo.createNewFile();
            
            
            1 - Devemos passar no construtoro do FileWireter qual o araquivo vamos manipular
                1.1 - Este Construtor aceita dois parametros (File ou String)
            2 - O Paremetro TRUE indica que reescreveremos no arquivo sem apagar o que ja Existe
            3 - O FALSE apagaria o Conteuo do Arquivo e escrreveria o novo conteudo
            4 - Se nao usar o segundo parametro, elepor padrao sera FALSE
            
            
            //Esta Linha abre o Fluzo do Arquivo
            FileWriter gravarEmArquivo = new FileWriter(arquivo,false);
            
            //Agora na classe PrintWriter vamos escrever no arquivo
            PrintWriter escreverEmArquivo = new PrintWriter(gravarEmArquivo);
            
            //Agora Vamos escrever no arquivo  '"+codigoSit+"'
            
            String linhaLog = "LOGUsuario='"+mp.getNomeUsuario().getText()+"'-Data='"+dataFormatada+"'";
            
            escreverEmArquivo.println(mp.getNomeUsuario().getText());
            escreverEmArquivo.println(linhaLog);
                        
            //metodo FLUSH que libera escrita no arquivo
            
            escreverEmArquivo.flush();
            
            gravarEmArquivo.close();
            
        }catch(IOException e){
            
            e.printStackTrace();
        }
        
    }*/
    
    
    

