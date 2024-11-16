/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Controller.conexaoBancoController;
import static Model.DAO.funcionarioDAO.formatarData;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabinhu
 */
public class empresaDAO {

    public empresaDAO() {
    }

    
    public empresaDAO(conexaoBancoController controller) {
    }



public static void salvarEmpresa(){
            
        Controller.conexaoBancoController conecta = new Controller.conexaoBancoController();
        conecta.conectarBanco();
        
            //conexaoBanco conectaBanco = new conexaoBancoController();
            String sql = "INSERT INTO empresa(descricao,cnpj,ie,endereco,id_situacaocadastro) VALUES (?,?,?,?,?)";
                       
             try (PreparedStatement executar = conecta.getC().prepareStatement(sql)){
 
                    
                     executar.setString(1, "FV Software"); 
                     executar.setString(2,"32574210875"); 
                     executar.setString(3,"454858383"); 
                     executar.setString(4,"rua iolando Donati, 209 Jd Planalto");
                     executar.setInt(5, 1); 
                                        
                     
            int linhasAfetadas = executar.executeUpdate();
            if (linhasAfetadas > 0){
                // Icones a 32px para caixa de mensagem
                ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\salvar.png");
                System.out.println(linhasAfetadas + " linhas inseridas no banco de dados com sucesso");
                    JOptionPane.showMessageDialog(null," Usuario salvo com Sucesso!","Cadastro de Usuario",JOptionPane.PLAIN_MESSAGE,iconeSalvo );
            }else{
                    JOptionPane.showMessageDialog(null,"Erro o Salvar Cadastro","Cadastro de Usuario", JOptionPane.ERROR_MESSAGE);  
            }    
          //  executar.execute();
            
            //Fechando conexões
            executar.close();
            conecta.getC().close();
                     
                    //Statement stm = (Statement) conectaBanco.getC().createStatement();
                    //ResultSet resultado = stm.executeQuery(sql);
                    
             }catch (SQLException e) {
                System.err.println("Erro ao gravar no banco de dados, consultar suporte técnico||| Código: " + e.getMessage());
            }finally{
    }
        }

    
}

