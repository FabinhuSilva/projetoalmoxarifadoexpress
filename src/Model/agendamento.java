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
import java.sql.ResultSet;

/**
 * https://www.youtube.com/watch?v=s7BDXAL83XE&list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&index=5
 * @author Fabinhu
 */
public class agendamento {
    
    private int id;
    private String observacao;
    private Date datainicial;
    private Date datafinal;
    private funcionario funcionario;
    private empresa empresa;

    public agendamento(int id, String observacao, String datainicial, String datafinal, funcionario funcionario, empresa empresa) {
        this.id = id;
        this.observacao = observacao;
        try {
            this.datainicial = new SimpleDateFormat("dd/MM/yyyy").parse(datainicial);
        } catch (ParseException ex) {
            Logger.getLogger(agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.datafinal = new SimpleDateFormat("dd/MM/yyyy").parse(datafinal);
        } catch (ParseException ex) {
            Logger.getLogger(agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.funcionario = funcionario;
        this.empresa = empresa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Date getDatainicial() {
        return datainicial;
    }

    public void setDatainicial(Date datainicial) {
        this.datainicial = datainicial;
    }

    public Date getDatafinal() {
        return datafinal;
    }

    public void setDatafinal(Date datafinal) {
        this.datafinal = datafinal;
    }

    public funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(empresa empresa) {
        this.empresa = empresa;
    }
    
 
    
}
