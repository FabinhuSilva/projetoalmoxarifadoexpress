/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.cadastroConfigBanco;

/**
 *
 * @author Fabinhu
 */
public class conexaoBanco {
    
    private String urlCompleta;
    private String nomeBanco;
    private String ipBanco;
    private String porta;
    private String usuarioBanco;
    private String senhaBanco;

    public conexaoBanco(String nomeBanco, String ipBanco, String porta, String usuarioBanco, String senhaBanco) {
        this.nomeBanco = nomeBanco;
        this.ipBanco = ipBanco;
        this.porta = porta;
        this.usuarioBanco = usuarioBanco;
        this.senhaBanco = senhaBanco;
    }

    public conexaoBanco(cadastroConfigBanco aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     
    public String getUrlCompleta() {
        return urlCompleta;
    }

    public void setUrlCompleta(String urlCompleta) {
        this.urlCompleta = urlCompleta;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getIpBanco() {
        return ipBanco;
    }

    public void setIpBanco(String ipBaanco) {
        this.ipBanco = ipBanco;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
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
    
    
}
