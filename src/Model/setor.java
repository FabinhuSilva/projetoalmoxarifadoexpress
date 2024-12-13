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
public class setor {
    
    private int id;
    private String descricao;
    private int epiLiberados;
    private String riscoSetor;

    public setor(int id, String descricao, int epiLiberados) {
        this.id = id;
        this.descricao = descricao;
        this.epiLiberados = epiLiberados;
        
    }

    public setor() {
    }

    public String getRiscoSetor() {
        return riscoSetor;
    }

    public void setRiscoSetor(String riscoSetor) {
        this.riscoSetor = riscoSetor;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEpiLiberados() {
        return epiLiberados;
    }

    public void setEpiLiberados(int epiLiberados) {
        this.epiLiberados = epiLiberados;
    }

}
