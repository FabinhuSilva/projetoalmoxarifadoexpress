
package View;


import Controller.classeUtilitaria;
import Controller.conexaoBancoController;
import Controller.loginController;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/** 
 *
 * @author Fabinhu
 * 
 */
public class login extends javax.swing.JFrame {

    private final loginController Controller;
    
          
    public login() {
        initComponents();
        Controller = new loginController(this);
       
      
       }

    
   
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btConfigurar = new javax.swing.JButton();
        lblLoginVersao = new javax.swing.JLabel();
        jbLoginEntrar = new javax.swing.JButton();
        txtLoginSenha = new javax.swing.JPasswordField();
        txtloginUsuario = new javax.swing.JTextField();
        lblTextoSenha = new javax.swing.JLabel();
        lblTextoUsuario = new javax.swing.JLabel();
        lblTextoLogin = new javax.swing.JLabel();
        lblQuadradoLogin = new javax.swing.JLabel();
        lblLoginFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setMinimumSize(new java.awt.Dimension(514, 380));
        setName("TelaLogin"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("SAIR");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 90, -1));

        btConfigurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/iconeConfigurar32px.png"))); // NOI18N
        btConfigurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfigurarActionPerformed(evt);
            }
        });
        getContentPane().add(btConfigurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 40, 40));

        lblLoginVersao.setBackground(new java.awt.Color(255, 255, 255));
        lblLoginVersao.setForeground(new java.awt.Color(0, 0, 0));
        lblLoginVersao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginVersao.setText("V. 1.0");
        lblLoginVersao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(lblLoginVersao, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        jbLoginEntrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbLoginEntrar.setText("Entrar");
        jbLoginEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbLoginEntrarMouseClicked(evt);
            }
        });
        jbLoginEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLoginEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jbLoginEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 110, -1));

        txtLoginSenha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtLoginSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtLoginSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 190, 30));

        txtloginUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtloginUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtloginUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 190, 30));

        lblTextoSenha.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        lblTextoSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoSenha.setText("Senha");
        lblTextoSenha.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(lblTextoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 80, -1));

        lblTextoUsuario.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        lblTextoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoUsuario.setText("Usuário");
        lblTextoUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(lblTextoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 90, -1));

        lblTextoLogin.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        lblTextoLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoLogin.setText("Login");
        lblTextoLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblTextoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, -1));

        lblQuadradoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/quadradoLogin.png"))); // NOI18N
        getContentPane().add(lblQuadradoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 440, 230));

        lblLoginFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/fundoLogin.jpg"))); // NOI18N
        getContentPane().add(lblLoginFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 500, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLoginEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLoginEntrarActionPerformed
      
        try {
            Controller.autenticarLogin();
            this.dispose();
             
        } catch (SQLException ex) {
            System.out.println("Erro Botao Salvar : "+ex);
        }

    }//GEN-LAST:event_jbLoginEntrarActionPerformed

    private void btConfigurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfigurarActionPerformed
        View.cadastroConfigBanco banco = new View.cadastroConfigBanco();
        banco.setVisible(true);
       //Controller.acessarCadastroBanco();
    }//GEN-LAST:event_btConfigurarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    System.exit(0);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jbLoginEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLoginEntrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbLoginEntrarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConfigurar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jbLoginEntrar;
    private javax.swing.JLabel lblLoginFundo;
    private javax.swing.JLabel lblLoginVersao;
    private javax.swing.JLabel lblQuadradoLogin;
    private javax.swing.JLabel lblTextoLogin;
    private javax.swing.JLabel lblTextoSenha;
    private javax.swing.JLabel lblTextoUsuario;
    private javax.swing.JPasswordField txtLoginSenha;
    private javax.swing.JTextField txtloginUsuario;
    // End of variables declaration//GEN-END:variables

    public JPasswordField getTxtLoginSenha() {
        return txtLoginSenha;
    }

    public void setTxtLoginSenha(JPasswordField txtLoginSenha) {
        this.txtLoginSenha = txtLoginSenha;
    }

    public JTextField getTxtloginUsuario() {
        return txtloginUsuario;
    }

    public void setTxtloginUsuario(JTextField txtloginUsuario) {
        this.txtloginUsuario = txtloginUsuario;
    }

    /*
    public void exibeMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null,"Mensagem mostada na tela", "mensagem para usuario", JOptionPane.ERROR_MESSAGE);
    }

    public JPasswordField getJpfLoginSenha() {
        return txtLoginSenha;
    }

    public void setJpfLoginSenha(JPasswordField jpfLoginSenha) {
        this.txtLoginSenha = jpfLoginSenha;
    }

    public JTextField getJtfLoginUsuario() {
        return txtloginUsuario;
    }

    public void setJtfLoginUsuario(JTextField jtfLoginUsuario) {
        this.txtloginUsuario = jtfLoginUsuario;
    }
*/     

    
    
}

