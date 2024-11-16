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
public class empresa {
    
    private int id;
    private String cnpj;
    private String ie;
    private String nomeEmpresa;
    private String endereco;

    public empresa() {
    }

   
    
    public empresa(int id, String nomeEmpresa) {
        this.id = id;
        this.nomeEmpresa = nomeEmpresa;
    }
       

    public empresa(int id, String cnpj,String ie, String nomeEmpresa,String endereco) {
        this.id = id;
        this.cnpj = cnpj;
        this.ie = ie;
        this.nomeEmpresa = nomeEmpresa;
        this.endereco = endereco;
                
    
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }


    
    
}
