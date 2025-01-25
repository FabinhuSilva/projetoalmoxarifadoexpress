/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.cadastroCargo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Fabinhu
 */
public class RelatorioCargoController {

private cadastroCargo view;

    public RelatorioCargoController(cadastroCargo view) {
        this.view = view;
    }


    
    
public void inserirCargo() throws SQLException{
    
        Connection conexao = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        PreparedStatement executar = null;
        
Connection conexaoBD = new conexaoBancoController().conectarBanco();

String descricaoCargo = view.getDescCargo().getText();
String habPessoal = view.getHabPessoal().getText();
String habTecnica = view.getHabTecnicas().getText();


 String sql = "INSERT INTO public.cargo(descricao, id_setor, situacaocadastro,habPessoal, habTecnicas)VALUES (, ?, ?, ?, ?, ?);";

   executar = conexaoBD.prepareStatement(sql);
 

executar.setString(1, descricaoCargo);
executar.setInt(2, 1);
executar.setString(3, habPessoal);
executar.setString(4, habTecnica);


}

    
}
