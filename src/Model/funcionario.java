/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fabinhu
 */
public class funcionario {
    
    private int id;
    private String numeroChapa;
    private String cpf;
    private String nomeFuncionario;
    private Date dataAdmissao;
    private int status;

    public funcionario(int id, String numeroChapa, String cpf, String nomeFuncionario, String dataAdmissao, int status) {
        this.id = id;
        this.numeroChapa = numeroChapa;
        this.cpf = cpf;
        this.nomeFuncionario = nomeFuncionario;
        try {
            this.dataAdmissao = new SimpleDateFormat("dd/MM/yyyysss").parse(dataAdmissao);
        } catch (ParseException ex) {
            Logger.getLogger(agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.status = status;
    }

    public funcionario(String numeroChapa, String nomeFuncionario) {
        this.numeroChapa = numeroChapa;
        this.nomeFuncionario = nomeFuncionario;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroChapa() {
        return numeroChapa;
    }

    public void setNumeroChapa(String numeroChapa) {
        this.numeroChapa = numeroChapa;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
       
    
}
