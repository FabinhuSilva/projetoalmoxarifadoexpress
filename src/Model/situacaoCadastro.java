/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Fabinhu
 */
public class situacaoCadastro {
    
    private int id;
    private String situacaoCadastro;

    public situacaoCadastro(int id, String situacaoCadastro) {
        this.id = id;
        this.situacaoCadastro = situacaoCadastro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSituacaoCadastro() {
        return situacaoCadastro;
    }

    public void setSituacaoCadastro(String situacaoCadastro) {
        this.situacaoCadastro = situacaoCadastro;
    }
    
    
}
