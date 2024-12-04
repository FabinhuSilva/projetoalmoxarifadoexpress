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
private int id_empresa;
private String nomefabricanteca;
private String loteca;
private String observacaotroca;

    public epi() {
    }


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

    public epi(String descricao, int validade, boolean descartavel, boolean devolver, String instrucao, int ca, int id_empresa, String loteca, String observacaotroca) {
        this.descricao = descricao;
        this.validade = validade;
        this.descartavel = descartavel;
        this.devolver = devolver;
        this.instrucao = instrucao;
        this.ca = ca;
        this.id_empresa = id_empresa;
        this.loteca = loteca;
        this.observacaotroca = observacaotroca;
    }

      public epi(int id, String descricao, int validade, int ca, String loteca) {
        this.id = id;
        this.descricao = descricao;
        this.validade = validade;
        this.ca = ca;
        this.loteca = loteca;
    }

 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  
    
    public int getValidade() {
        return validade;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
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

    public boolean getDescartavel() {
        return descartavel;
    }

    public void setDescartavel(boolean descartavel) {
        this.descartavel = descartavel;
    }

    public boolean getDevolver() {
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

    @Override
    public String toString() {
        return this.getDescricao(); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
