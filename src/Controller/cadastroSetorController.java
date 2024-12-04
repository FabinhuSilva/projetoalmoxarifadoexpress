/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.cadastroSetor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabinhu
 */
public class cadastroSetorController {

    private cadastroSetor view;

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public cadastroSetorController(cadastroSetor view) {
        this.view = view;

    }

    public void inserirSetorBanco() {

        String nome = view.getNomeSetor().getText().trim();
        String situacaoCadastro = view.getSituacaoCadastroSetor().getSelectedItem().toString();
        String riscoSetor = view.getRiscosSetor().getText();

        try {
            Connection conexaoBD = new conexaoBancoController().conectarBanco();
            String sql = "INSERT INTO SETOR(nome, id_situacaocadastro, riscosetor) VALUES (?, ?,?);";

            PreparedStatement executar = null;
            executar = conexaoBD.prepareStatement(sql, executar.RETURN_GENERATED_KEYS);

            //Conversões
            int idSituacaoCadastroConvert = 1;

            if (situacaoCadastro.equals("Ativo")) {
                idSituacaoCadastroConvert = 1;
            } else {
                idSituacaoCadastroConvert = 0;
            }

            executar.setString(1, nome);
            executar.setInt(2, idSituacaoCadastroConvert);
            executar.setString(3,riscoSetor);

            executar.execute();
            ResultSet rs = executar.getGeneratedKeys();

            // Icones a 32px para caixa de mensagem
            ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\salvar.png");
            JOptionPane.showMessageDialog(null, " Usuario salvo com Sucesso!", "Cadastro de Usuario", JOptionPane.PLAIN_MESSAGE, iconeSalvo);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro o Salvar Cadastro: " + ex, "Cadastro de Usuario", JOptionPane.ERROR_MESSAGE);
        }
    }

   
}
