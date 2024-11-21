/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;



//import View.cadastroConfigBanco;
//import java.beans.Statement;
import View.cadastroConfigBanco;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Fabinhu
 */
public class conexaoBancoController {

    public conexaoBancoController() {
    }
       
     private String nomeBanco;
     private String ipBanco; 
     private String portaBanco;
     private String usuarioBanco;
     private String senhaBanco;
      private String urlCompleta; 
      private Connection c ;

     
      
    @SuppressWarnings("PackageVisibleField")
      String driverjdbc; // =  "org.postgresql.Driver";

    public conexaoBancoController(cadastroConfigBanco aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


  
    public String getUrlCompleta() {
        return urlCompleta;
    }

    public void setUrlCompleta(String urlCompleta) {
        this.urlCompleta = urlCompleta;
    }

       
    public String getUsuarioBanco() {
        return usuarioBanco;
    }

    public void setUsuarioBanco(String usuarioBanco) {
        this.usuarioBanco = usuarioBanco;
    }

    public String getSenhaBanco() {
        return senhaBanco;
    }

    public void setSenhaBanco(String senhaBanco) {
        this.senhaBanco = senhaBanco;
    }
      
    public String getIpBanco() {
        return ipBanco;
    }

    public void setIpBanco(String ipBanco) {
        this.ipBanco = ipBanco;
    }

    public String getPortaBanco() {
        return portaBanco;
    }

    public void setPortaBanco(String portaBanco) {
        this.portaBanco = portaBanco;
    }    
      
    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }
     
    public Connection getC() {
        return c;
    }

    public void setC(Connection c) {
        this.c = c;
    }
   
    
   public Connection conectarBanco(){
     
          //Dados Validados
       setNomeBanco("almoxarifado");
       setIpBanco("127.0.0.1");
       setPortaBanco("5432");
       setUsuarioBanco("postgres");
       setSenhaBanco("VrPost@Server");
       driverjdbc = "org.postgresql.Driver";
       setUrlCompleta("jdbc:postgresql://"+getIpBanco()+":"+getPortaBanco()+"/"+getNomeBanco());
       
      
      try {
        Class.forName(driverjdbc);
        setC((Connection) DriverManager.getConnection(urlCompleta, getUsuarioBanco(), getSenhaBanco()));
        System.out.println("Conecato com sucesso!");


          } catch (Exception e) {
          System.err.println(e);
          e.printStackTrace();
            } 
      return getC();
}
       
}


    

