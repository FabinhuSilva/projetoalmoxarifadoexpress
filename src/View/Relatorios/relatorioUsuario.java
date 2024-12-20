/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Relatorios;

import javax.swing.JTable;
import Controller.RelatorioSetorController;
import Controller.cadastroUsuarioCcontroller;
import Controller.conexaoBancoController;
import Model.DAO.Relatorio.relatorioConsultaUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import Controller.conexaoBancoController;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

/**
 *https://www.youtube.com/watch?v=WJ3700ZIxBc
 * Sobre JTABLE e popular com o banco
 * @author Fabinhu
 */
public class relatorioUsuario extends javax.swing.JFrame {
    
  // private Connection conBanco;

    /**
     * Creates new form RelatorioUsuario
     */
    public relatorioUsuario() {
        initComponents();
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        relatorioNome = new javax.swing.JTextField();
        relatorioLogin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        relatorioEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        relatorioComboSituacaoCadastro = new javax.swing.JComboBox<>();
        botaoSair = new javax.swing.JButton();
        botaoConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuarios = new javax.swing.JTable();
        botaoImprimir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmConsultar = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        SALVAR = new javax.swing.JMenu();
        jmIncluir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Nome");

        jLabel3.setText("Login");

        jLabel5.setText("E-Mail");

        jLabel6.setText("Status");

        relatorioComboSituacaoCadastro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Excluido" }));
        relatorioComboSituacaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorioComboSituacaoCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(relatorioNome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addComponent(relatorioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(relatorioEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(relatorioComboSituacaoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(relatorioNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(relatorioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(relatorioEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(relatorioComboSituacaoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 800, 90));

        botaoSair.setText("Sair");
        botaoSair.setMaximumSize(new java.awt.Dimension(70, 32));
        getContentPane().add(botaoSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 540, 70, -1));

        botaoConsultar.setText("Consultar");
        botaoConsultar.setPreferredSize(new java.awt.Dimension(80, 32));
        botaoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 540, 90, -1));

        tabelaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Login", "Senha", "E-Mail", "Situacao Cadastro"
            }
        ));
        jScrollPane1.setViewportView(tabelaUsuarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 800, 440));

        botaoImprimir.setText("Imprimir");
        getContentPane().add(botaoImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, -1, -1));

        jmConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/iconeConsultar24px.png"))); // NOI18N
        jMenuBar1.add(jmConsultar);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/iconeExcluir32px.png"))); // NOI18N
        jMenuBar1.add(jMenu1);

        SALVAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/iconeSalvar24px.png"))); // NOI18N
        jMenuBar1.add(SALVAR);

        jmIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/iconeNovo24px.png"))); // NOI18N
        jmIncluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmIncluirMouseClicked(evt);
            }
        });
        jmIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmIncluirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmIncluir);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void relatorioComboSituacaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorioComboSituacaoCadastroActionPerformed
    }//GEN-LAST:event_relatorioComboSituacaoCadastroActionPerformed

    private void botaoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarActionPerformed
       try {
           preencherTabela();
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro encontrado durante consulta: "+ex, "Consulta de Usuario", HEIGHT);
       }
    }//GEN-LAST:event_botaoConsultarActionPerformed

    private void jmIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmIncluirActionPerformed
       

    }//GEN-LAST:event_jmIncluirActionPerformed

    private void jmIncluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmIncluirMouseClicked
         View.cadastroUsuario usuario = new View.cadastroUsuario();
        usuario.setVisible(true);
    }//GEN-LAST:event_jmIncluirMouseClicked

      
     public void preencherTabela() throws SQLException{
     //https://www.youtube.com/watch?v=faPR87RX2c0&t=3s   
        int contadorRegistro = 0;
     
         Connection conectarBanco = new conexaoBancoController().conectarBanco();
         
         DefaultTableModel modelo = (DefaultTableModel) tabelaUsuarios.getModel();
         modelo.setNumRows(0);
         
        tabelaUsuarios.getColumnModel().getColumn(0).setPreferredWidth(80);
        tabelaUsuarios.getColumnModel().getColumn(0).setResizable(false);
        
        tabelaUsuarios.getColumnModel().getColumn(1).setPreferredWidth(600);
        tabelaUsuarios.getColumnModel().getColumn(1).setResizable(true);
        
        tabelaUsuarios.getColumnModel().getColumn(2).setPreferredWidth(300);
        tabelaUsuarios.getColumnModel().getColumn(2).setResizable(true);
        
        tabelaUsuarios.getColumnModel().getColumn(3).setPreferredWidth(300);
        tabelaUsuarios.getColumnModel().getColumn(3).setResizable(true);
        
        tabelaUsuarios.getColumnModel().getColumn(4).setPreferredWidth(800);
        tabelaUsuarios.getColumnModel().getColumn(4).setResizable(true);
        
        tabelaUsuarios.getColumnModel().getColumn(5).setPreferredWidth(80);
        tabelaUsuarios.getColumnModel().getColumn(5).setResizable(false);
         
        try{
           //conexaoBD
           PreparedStatement pstm;
           ResultSet rs;
           String sql = "SELECT * FROM usuario;";
           pstm = conectarBanco.prepareStatement(sql);

           rs =  pstm.executeQuery();
           
           while(rs.next()){
               modelo.addRow(new Object[]{  
               rs.getInt(1),
               rs.getString(2),
               rs.getString(3),
               rs.getString(4),
               rs.getString(5),
               rs.getInt(6)   
               });
                contadorRegistro++;
           }
               conectarBanco.close();
               rs.close();
               pstm.close();
                     
                       // Icones a 32px para caixa de mensagem
                ImageIcon iconeSalvo = new ImageIcon("c:\\almoxarifadoExpress\\icone\\salvar.png");
                JOptionPane.showMessageDialog(null, "Encontrados "+contadorRegistro+" Registros nesta consulta!","Consulta de Usuario",JOptionPane.PLAIN_MESSAGE,iconeSalvo);
                System.out.println("Consulta:"+sql);
               
               conectarBanco.close();
               rs.close();
               pstm.close();
           
           
        }catch(SQLException ex) {
            System.out.println("Erro: "+ex);
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(relatorioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(relatorioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(relatorioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(relatorioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new relatorioUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu SALVAR;
    private javax.swing.JButton botaoConsultar;
    private javax.swing.JButton botaoImprimir;
    private javax.swing.JButton botaoSair;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu jmConsultar;
    private javax.swing.JMenu jmIncluir;
    private javax.swing.JComboBox<String> relatorioComboSituacaoCadastro;
    private javax.swing.JTextField relatorioEmail;
    private javax.swing.JTextField relatorioLogin;
    private javax.swing.JTextField relatorioNome;
    private javax.swing.JTable tabelaUsuarios;
    // End of variables declaration//GEN-END:variables

    public JTextField getRelatorioEmail() {
        return relatorioEmail;
    }

    public JTextField getRelatorioLogin() {
        return relatorioLogin;
    }

    public JTextField getRelatorioNome() {
        return relatorioNome;
    }



    public JTable getTabelaUsuarios() {
        return tabelaUsuarios;
    }

     
}
