
package Model.DAO;

import Model.usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;


/**
 * @author Fabinhu
 */
public class usuarioDAO {

    private final Connection conBanco;

    public usuarioDAO(Connection conBanco) {
        this.conBanco = conBanco;
    }
    
  
 public usuario salvarUsuario(usuario usuario) throws SQLException{

        
            String sql = "INSERT INTO usuario(nome,login,senha,email,id_situacaocadastro) VALUES (?,?,?,?,?);";
            

            PreparedStatement executar = null;
            executar = conBanco.prepareStatement(sql, executar.RETURN_GENERATED_KEYS);
            
            executar.setString(1, usuario.getNome());
            executar.setString(2,usuario.getLogin());
            executar.setString(3,usuario.getSenha());
            executar.setString(4,usuario.getEmail());
            executar.setInt(5,usuario.getSituacaoCadastro());
            
            executar.execute();
            ResultSet rs = executar.getGeneratedKeys();
            if (rs.next()){
                int id=rs.getInt("id");
                usuario.setId(id);
            }
          
                return usuario;
     }

    public boolean consultarUsuarioSenhaLogin(usuario usuarioSenhaLogin) throws SQLException {
        
        String sqlCadastroUsuario = "SELECT * FROM USUARIO WHERE login = ? and senha = ?";
        
        PreparedStatement executar = conBanco.prepareStatement(sqlCadastroUsuario);
        
        executar.setString( 1,usuarioSenhaLogin.getLogin());
        executar.setString( 2,usuarioSenhaLogin.getSenha());
        
        
        executar.execute();
        
        ResultSet resultSet = executar.getResultSet();
        
       
        return resultSet.next();
    }

    public void alterarUsuario(usuario usuario) throws SQLException{
        
         String sql = "UPDATE usuario SET nome = ?,login = ?,senha = ?,email = ?,id_situacaocadastro= ? WHERE id=?";
               
                PreparedStatement executar = conBanco.prepareStatement(sql);

                
                
                executar.setString(1, usuario.getNome());
                executar.setString(2,usuario.getLogin());
                executar.setString(3,usuario.getSenha());
                executar.setString(4,usuario.getEmail());
                executar.setInt(5,usuario.getSituacaoCadastro());
                executar.setInt(6, usuario.getId());
                
                
                executar.execute();
                
                conBanco.close(); 
        
    }
    
    public void cadastraNovoOuAlteraExistente(usuario usuario) throws SQLException{
        
        if(usuario.getId() > 0){
            alterarUsuario(usuario);
        }else{
            salvarUsuario(usuario);
        } 
    }
    
    public ArrayList<usuario> selecionarTodos() throws SQLException{
       
        String sqlConsultaTodos = "SELECT * FROM usuario";
        
        PreparedStatement executar = conBanco.prepareStatement(sqlConsultaTodos);
        
        return pesquisaUsuario(executar);
    }

    private ArrayList<usuario> pesquisaUsuario(PreparedStatement executar) throws SQLException {
        @SuppressWarnings("Convert2Diamond")
        ArrayList<usuario> listaUsuarios = new ArrayList<usuario>();
        
        executar.execute();
        ResultSet resultSet = executar.getResultSet();
        
        while(resultSet.next()){
            int id = resultSet.getInt("id");
            String nome = resultSet.getString("nome");
            String login = resultSet.getString("login");
            String Senha = resultSet.getString("senha");
            String email = resultSet.getString("email");
            int situacaocadastro  = resultSet.getInt("id_situacaocadastro");
            
            usuario usuarioComDadosDoBanco = new usuario(id, nome, login, Senha, email, situacaocadastro);
            listaUsuarios.add(usuarioComDadosDoBanco);                                       
        }
        return listaUsuarios;
    }
    
    
    public usuario consultaPorId(usuario usuario) throws SQLException{
      
        String sqlConsultaPorId = "SELECT * FROM usuario WHERE id= ?";

        PreparedStatement executar = conBanco.prepareStatement(sqlConsultaPorId);         
        executar.setInt(1, usuario.getId());

        //return pesquisaUsuario(executar).get(0);
        
        ArrayList<usuario> listaCompleta = pesquisaUsuario(executar);
        return listaCompleta.get(0);
       
    }

public void excluirUsuario(usuario usuario) throws SQLException{
    
       String sql = "UPDATE usuario SET id_situacaocadastro= ? WHERE id=?";
               
                PreparedStatement executar = conBanco.prepareStatement(sql);

                
                executar.setInt(1,77);
                executar.setInt(2, usuario.getId());
                
                executar.execute();
                conBanco.close(); 
    
}
    
}
     
     
    
     


