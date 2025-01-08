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
public class usuario {
    
    private int id;
    private String nome;
    private String login;
    private String senha;
    private String email;
    private int situacaoCadastro;
    
    
    public usuario(String nome, String login, String senha, String email, int situacaoCadastro) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.situacaoCadastro = situacaoCadastro;
    }

    public usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public usuario(int id, String nome, String login, String senha, String email, int situacaoCadastro) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.situacaoCadastro = situacaoCadastro;
    }
 
    
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSituacaoCadastro() {
        return situacaoCadastro;
    }

    public void setSituacaoCadastro(int situacaoCadastro) {
        this.situacaoCadastro = situacaoCadastro;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
