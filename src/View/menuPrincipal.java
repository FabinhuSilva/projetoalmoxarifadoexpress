/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.conexaoBancoController;
import Model.DAO.usuarioDAO;
import Model.usuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabinhu
 */
public class menuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public menuPrincipal() {
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

        lblMenuPrincipalimagemFundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmCadastro = new javax.swing.JMenu();
        jmiCadastroEPI = new javax.swing.JMenuItem();
        jmCadastroFuncionario = new javax.swing.JMenuItem();
        jmCadastroEmpresa = new javax.swing.JMenuItem();
        jmCadastroUsuario = new javax.swing.JMenuItem();
        jmOperacao = new javax.swing.JMenu();
        jmOpercaoEntregaEPI = new javax.swing.JMenuItem();
        jmOperacaoAjusteEstoque = new javax.swing.JMenuItem();
        jmOperacaoAgendaEntregaEPI = new javax.swing.JMenuItem();
        jmRelatorio = new javax.swing.JMenu();
        jmRelatorioEstoque = new javax.swing.JMenuItem();
        jmRelatorioEntregasEpi = new javax.swing.JMenu();
        jmRelatorioentregasAgendadas = new javax.swing.JMenuItem();
        jmImportacao = new javax.swing.JMenu();
        jmmImportacaoEstoque = new javax.swing.JMenuItem();
        jmImportacaoEntregaEPI = new javax.swing.JMenuItem();
        jmSair = new javax.swing.JMenu();
        MenuTesteFuncoes = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AlmoxarifadoExpress");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMenuPrincipalimagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Captura de tela 2024-10-20 163747.jpg"))); // NOI18N
        getContentPane().add(lblMenuPrincipalimagemFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 640));

        jmCadastro.setText("Cadastro");

        jmiCadastroEPI.setText("EPI");
        jmiCadastroEPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastroEPIActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiCadastroEPI);

        jmCadastroFuncionario.setText("Funcionario");
        jmCadastro.add(jmCadastroFuncionario);

        jmCadastroEmpresa.setText("Empresa");
        jmCadastro.add(jmCadastroEmpresa);

        jmCadastroUsuario.setText("Usuario Sistema");
        jmCadastro.add(jmCadastroUsuario);

        jMenuBar1.add(jmCadastro);

        jmOperacao.setText("Operação");

        jmOpercaoEntregaEPI.setText("Entrega de EPI");
        jmOperacao.add(jmOpercaoEntregaEPI);

        jmOperacaoAjusteEstoque.setText("Ajuste de Estoque");
        jmOperacao.add(jmOperacaoAjusteEstoque);

        jmOperacaoAgendaEntregaEPI.setText("Agenda de Entrega EPI");
        jmOperacao.add(jmOperacaoAgendaEntregaEPI);

        jMenuBar1.add(jmOperacao);

        jmRelatorio.setText("Relatórios");

        jmRelatorioEstoque.setText("Relatório Estoque EPI");
        jmRelatorio.add(jmRelatorioEstoque);

        jmRelatorioEntregasEpi.setText("Relatório Entrega de EPI");
        jmRelatorio.add(jmRelatorioEntregasEpi);

        jmRelatorioentregasAgendadas.setText("Relatório Entregas Agendadas");
        jmRelatorio.add(jmRelatorioentregasAgendadas);

        jMenuBar1.add(jmRelatorio);

        jmImportacao.setText("Importações");

        jmmImportacaoEstoque.setText("Importação de Entrada de EPI");
        jmImportacao.add(jmmImportacaoEstoque);

        jmImportacaoEntregaEPI.setText("Importação de Etrega de EPI");
        jmImportacao.add(jmImportacaoEntregaEPI);

        jMenuBar1.add(jmImportacao);

        jmSair.setText("Sair");
        jmSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmSair);

        MenuTesteFuncoes.setText("Menu de Testes");

        jMenuItem1.setText("Testando alterações");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuTesteFuncoes.add(jMenuItem1);

        jMenuBar1.add(MenuTesteFuncoes);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiCadastroEPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastroEPIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiCadastroEPIActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try{
        Connection conexaoBanco = new conexaoBancoController().conectarBanco();
        usuarioDAO usuarioCadastro = new usuarioDAO(conexaoBanco);
        
        //Testabdi Inserir
        usuario inserirUsuario = new usuario("fabiano","fabimenu"," fabimenusenha","fabiemailemail.com.br", 0);
        usuario usuarioInseridoEmBanco = usuarioCadastro.salvarUsuario(inserirUsuario);
        
        //Testando Select por ID
        usuario usuarioSelecionadoNoInsert = usuarioCadastro.consultaPorId(usuarioInseridoEmBanco);
        
        //Testando Deleção
        usuarioCadastro.excluirUsuario(usuarioSelecionadoNoInsert);
        
        
            //selecionando todos
            ArrayList<usuario> selecionarTodosUsuarios = usuarioCadastro.selecionarTodos();
        
            for (usuario selecionar : selecionarTodosUsuarios) {
                System.out.println(selecionar.getId()+" | "+selecionar.getNome());
            }
                
        }catch(SQLException ex){
            System.out.println("Erro: "+ex);
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSairMouseClicked
        Connection conexaoBanco = (Connection) new conexaoBancoController();
        try {
            conexaoBanco.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro Apresentado ao SAIR: "+ex);
        }
        System.exit(0);
    }//GEN-LAST:event_jmSairMouseClicked

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
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuTesteFuncoes;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jmCadastro;
    private javax.swing.JMenuItem jmCadastroEmpresa;
    private javax.swing.JMenuItem jmCadastroFuncionario;
    private javax.swing.JMenuItem jmCadastroUsuario;
    private javax.swing.JMenu jmImportacao;
    private javax.swing.JMenuItem jmImportacaoEntregaEPI;
    private javax.swing.JMenu jmOperacao;
    private javax.swing.JMenuItem jmOperacaoAgendaEntregaEPI;
    private javax.swing.JMenuItem jmOperacaoAjusteEstoque;
    private javax.swing.JMenuItem jmOpercaoEntregaEPI;
    private javax.swing.JMenu jmRelatorio;
    private javax.swing.JMenu jmRelatorioEntregasEpi;
    private javax.swing.JMenuItem jmRelatorioEstoque;
    private javax.swing.JMenuItem jmRelatorioentregasAgendadas;
    private javax.swing.JMenu jmSair;
    private javax.swing.JMenuItem jmiCadastroEPI;
    private javax.swing.JMenuItem jmmImportacaoEstoque;
    private javax.swing.JLabel lblMenuPrincipalimagemFundo;
    // End of variables declaration//GEN-END:variables
}