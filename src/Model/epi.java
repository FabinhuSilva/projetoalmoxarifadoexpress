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
public class epi {
    
private int id;
private String descricao;
private int validade;
private boolean descartavel;
private boolean devolver;
private String instrucao;
private int ca;
private String nomefabricanteca;
private String loteca;
private String observacaotroca;


    public epi(int id, String descricao, int validade, boolean descartavel, boolean devolver, String instrucao, int ca, String nomefabricanteca, String loteca, String observacaotroca) {
        this.id = id;
        this.descricao = descricao;
        this.validade = validade;
        this.descartavel = descartavel;
        this.devolver = devolver;
        this.instrucao = instrucao;
        this.ca = ca;
        this.nomefabricanteca = nomefabricanteca;
        this.loteca = loteca;
        this.observacaotroca = observacaotroca;

    }

    public epi(int id, String descricao, int ca, String nomefabricanteca, String loteca) {
        this.id = id;
        this.descricao = descricao;
        this.ca = ca;
        this.nomefabricanteca = nomefabricanteca;
        this.loteca = loteca;
    }
    
    

    
    public String getDescricao() {
        return descricao;
    }

    public String getObservacaoTroca() {
        return observacaotroca;
    }

    public void setObservacaoTroca(String observacao) {
        this.observacaotroca = observacaotroca;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isDescartavel() {
        return descartavel;
    }

    public void setDescartavel(boolean descartavel) {
        this.descartavel = descartavel;
    }

    public boolean isDevolver() {
        return devolver;
    }

    public void setDevolver(boolean devolver) {
        this.devolver = devolver;
    }

    public String getInstrucao() {
        return instrucao;
    }

    public void setInstrucao(String instrucao) {
        this.instrucao = instrucao;
    }

    public int getCa() {
        return ca;
    }

    public void setCa(int ca) {
        this.ca = ca;
    }

    public String getNomefabricanteca() {
        return nomefabricanteca;
    }

    public void setNomefabricanteca(String nomefabricanteca) {
        this.nomefabricanteca = nomefabricanteca;
    }

    public String getLoteca() {
        return loteca;
    }

    public void setLoteca(String loteca) {
        this.loteca = loteca;
    }
   
    
}
