
package Model.DAO;

import Controller.conexaoBancoController;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabinhu
 */
public class funcionarioDAO {

    public funcionarioDAO() {
    }

    public funcionarioDAO(conexaoBancoController controller) {
    }
    
/*    private Date data;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        try{
        this.data = new SimpleDateFormat("dd/MM/yyyy").parse(data);
        }catch(ParseException p){
            System.out.println(p);
        }
    }*/
     
        public static String formatarData(String data){
        SimpleDateFormat formatar = new SimpleDateFormat("dd/mm/yyyy");
        Date dataDigitada = null;
        try {
            dataDigitada = formatar.parse(data);            
        } catch (Exception e) {
            e.printStackTrace();
        }
        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
        data = format.format(dataDigitada);
        
        return data;        
       
    }
    
    public static void salvarFuncionario(){
            
        Controller.conexaoBancoController conecta = new Controller.conexaoBancoController();
        conecta.conectarBanco();
        
            //conexaoBanco conectaBanco = new conexaoBancoController();
            String sql = "INSERT INTO funcionario(nome,cpf,rg,dataadmissao,id_empresa, id_setor,id_situacaocadastro) VALUES (?,?,?,?,?,?,?)";
            String dataDigitada =  "03/11/2024";
            dataDigitada = formatarData(dataDigitada); 
             
             try (PreparedStatement executar = conecta.getC().prepareStatement(sql)){
 
                    
                     executar.setString(1, "fabiano 01-11-24"); //Nome Completo
                     executar.setString(2,"32574210875"); // Login
                     executar.setString(3,"454858383"); // Senha
                     executar.setString(4,dataDigitada); // E-?Mail
                     executar.setInt(5, 1); // E-?Mail
                     executar.setInt(6, 2); // E-?Mail
                     executar.setInt(7, 3); // E-?Mail
                    
                     
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
