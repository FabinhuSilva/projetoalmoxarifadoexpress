/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Relatorios;

import Controller.RelatorioEmpresaController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Fabinhu
 */
public class intRelatorioEmpresa extends javax.swing.JInternalFrame {

    
    private  final RelatorioEmpresaController controller;
    /**
     * Creates new form intRelatorioEmpresa
     */
    public intRelatorioEmpresa() {
        initComponents();
        controller = new RelatorioEmpresaController(this);
        controller.ocultarCamposEmpresa();
        controller.bloquearcamposeditar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        descEmpresa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cboSitEmpresa = new javax.swing.JComboBox<>();
        panedescEmpresa = new javax.swing.JScrollPane();
        TabelaDescEmpresa = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        cnpjEmpresa = new javax.swing.JTextField();
        ocultoIdEmpresa = new javax.swing.JTextField();
        ocultonomeEmpresa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nomeEmpresa = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaResultadoConsultaEmpresa = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        codAlterar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        descAlterar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cnpjcpfAlterar = new javax.swing.JTextField();
        ieAlterar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cboSituacaoAlterar = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        enderecoAlterar = new javax.swing.JTextField();
        botaoAtualizarDados = new javax.swing.JButton();
        botaoConsultarTela = new javax.swing.JButton();
        botaoSairTela = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        botaoconsultarmenu = new javax.swing.JMenu();
        botaoEditar = new javax.swing.JMenu();
        botaoImprimir = new javax.swing.JMenu();
        botaoExcluir = new javax.swing.JMenu();
        botaoIncluir = new javax.swing.JMenu();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Relatorrio de Empresa");
        setToolTipText("Consulta e Cadatro de Empresas Cadastradas");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Descrição");

        descEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                descEmpresaKeyReleased(evt);
            }
        });

        jLabel3.setText("Situação");

        cboSitEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Excluido" }));
        cboSitEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSitEmpresaActionPerformed(evt);
            }
        });

        TabelaDescEmpresa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TabelaDescEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaDescEmpresaMouseClicked(evt);
            }
        });
        panedescEmpresa.setViewportView(TabelaDescEmpresa);

        jLabel4.setText("CPF/CNPJ");

        cnpjEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cnpjEmpresaKeyReleased(evt);
            }
        });

        jLabel5.setText("Empresa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(descEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboSitEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panedescEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cnpjEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ocultoIdEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ocultonomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(descEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cboSitEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panedescEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cnpjEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ocultoIdEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ocultonomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(nomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tabelaResultadoConsultaEmpresa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabelaResultadoConsultaEmpresa);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setText("Cód.");

        jLabel7.setText("Descrição");

        jLabel8.setText("CPF/CNPJ");

        jLabel9.setText("I.E.");

        jLabel10.setText("Situação");

        cboSituacaoAlterar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Excluido" }));

        jLabel11.setText("Endereço");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(codAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7))
                            .addComponent(cnpjcpfAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 2, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ieAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboSituacaoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(descAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enderecoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(codAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(descAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cnpjcpfAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(ieAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(cboSituacaoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(enderecoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botaoAtualizarDados.setText("Atualizar Dados");
        botaoAtualizarDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoAtualizarDadosMouseClicked(evt);
            }
        });

        botaoConsultarTela.setText("Consultar");
        botaoConsultarTela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoConsultarTelaMouseClicked(evt);
            }
        });

        botaoSairTela.setText("Sair");
        botaoSairTela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSairTelaMouseClicked(evt);
            }
        });

        botaoconsultarmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/iconeConsultar24px.png"))); // NOI18N
        botaoconsultarmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoconsultarmenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(botaoconsultarmenu);

        botaoEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/iconeEditar24px.png"))); // NOI18N
        botaoEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoEditarMouseClicked(evt);
            }
        });
        jMenuBar1.add(botaoEditar);

        botaoImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/iconeImprimir24px.png"))); // NOI18N
        jMenuBar1.add(botaoImprimir);

        botaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/iconeExcluir24px.png"))); // NOI18N
        botaoExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoExcluirMouseClicked(evt);
            }
        });
        jMenuBar1.add(botaoExcluir);

        botaoIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/iconeNovo24px.png"))); // NOI18N
        botaoIncluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoIncluirMouseClicked(evt);
            }
        });
        jMenuBar1.add(botaoIncluir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoAtualizarDados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoConsultarTela)
                        .addGap(13, 13, 13)
                        .addComponent(botaoSairTela))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAtualizarDados)
                    .addComponent(botaoConsultarTela)
                    .addComponent(botaoSairTela))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboSitEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSitEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboSitEmpresaActionPerformed

    private void descEmpresaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descEmpresaKeyReleased
        controller.consultarEmpresaNome();
    }//GEN-LAST:event_descEmpresaKeyReleased

    private void TabelaDescEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaDescEmpresaMouseClicked
        controller.codigoEmpresa();
    }//GEN-LAST:event_TabelaDescEmpresaMouseClicked

    private void cnpjEmpresaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnpjEmpresaKeyReleased
        controller.consultarEmpresaCNPJ();
    }//GEN-LAST:event_cnpjEmpresaKeyReleased

    private void botaoAtualizarDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAtualizarDadosMouseClicked
        try {
            controller.alteracamposEmpresa();
        } catch (SQLException ex) {
            Logger.getLogger(intRelatorioEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoAtualizarDadosMouseClicked

    private void botaoConsultarTelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoConsultarTelaMouseClicked
        controller.consultarEmpresa();
        controller.limparCampos();
    }//GEN-LAST:event_botaoConsultarTelaMouseClicked

    private void botaoconsultarmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoconsultarmenuMouseClicked
        controller.consultarEmpresa();
        controller.limparCampos();
    }//GEN-LAST:event_botaoconsultarmenuMouseClicked

    private void botaoEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoEditarMouseClicked
        try {
            controller.desbloquearcamposeditar();
            controller.editarFuncinoario();
        } catch (SQLException ex) {
            Logger.getLogger(intRelatorioEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoEditarMouseClicked

    private void botaoExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoExcluirMouseClicked
        controller.excluirEmpreesa();
    }//GEN-LAST:event_botaoExcluirMouseClicked

    private void botaoSairTelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSairTelaMouseClicked
      dispose();
    }//GEN-LAST:event_botaoSairTelaMouseClicked

    private void botaoIncluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoIncluirMouseClicked
       View.cadastroEmpresa empresa = new View.cadastroEmpresa();
       empresa.setVisible(true);
    }//GEN-LAST:event_botaoIncluirMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaDescEmpresa;
    private javax.swing.JButton botaoAtualizarDados;
    private javax.swing.JButton botaoConsultarTela;
    private javax.swing.JMenu botaoEditar;
    private javax.swing.JMenu botaoExcluir;
    private javax.swing.JMenu botaoImprimir;
    private javax.swing.JMenu botaoIncluir;
    private javax.swing.JButton botaoSairTela;
    private javax.swing.JMenu botaoconsultarmenu;
    private javax.swing.JComboBox<String> cboSitEmpresa;
    private javax.swing.JComboBox<String> cboSituacaoAlterar;
    private javax.swing.JTextField cnpjEmpresa;
    private javax.swing.JTextField cnpjcpfAlterar;
    private javax.swing.JTextField codAlterar;
    private javax.swing.JTextField descAlterar;
    private javax.swing.JTextField descEmpresa;
    private javax.swing.JTextField enderecoAlterar;
    private javax.swing.JTextField ieAlterar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nomeEmpresa;
    private javax.swing.JTextField ocultoIdEmpresa;
    private javax.swing.JTextField ocultonomeEmpresa;
    private javax.swing.JScrollPane panedescEmpresa;
    private javax.swing.JTable tabelaResultadoConsultaEmpresa;
    // End of variables declaration//GEN-END:variables

    public JTable getTabelaDescEmpresa() {
        return TabelaDescEmpresa;
    }

    public void setTabelaDescEmpresa(JTable TabelaDescEmpresa) {
        this.TabelaDescEmpresa = TabelaDescEmpresa;
    }

    public JButton getBotaoAtualizarDados() {
        return botaoAtualizarDados;
    }

    public void setBotaoAtualizarDados(JButton botaoAtualizarDados) {
        this.botaoAtualizarDados = botaoAtualizarDados;
    }

    public JButton getBotaoConsultarTela() {
        return botaoConsultarTela;
    }

    public void setBotaoConsultarTela(JButton botaoConsultarTela) {
        this.botaoConsultarTela = botaoConsultarTela;
    }

    public JMenu getBotaoEditar() {
        return botaoEditar;
    }

    public void setBotaoEditar(JMenu botaoEditar) {
        this.botaoEditar = botaoEditar;
    }

    public JMenu getBotaoExcluir() {
        return botaoExcluir;
    }

    public void setBotaoExcluir(JMenu botaoExcluir) {
        this.botaoExcluir = botaoExcluir;
    }

    public JMenu getBotaoImprimir() {
        return botaoImprimir;
    }

    public void setBotaoImprimir(JMenu botaoImprimir) {
        this.botaoImprimir = botaoImprimir;
    }

    public JMenu getBotaoIncluir() {
        return botaoIncluir;
    }

    public void setBotaoIncluir(JMenu botaoIncluir) {
        this.botaoIncluir = botaoIncluir;
    }

    public JButton getBotaoSairTela() {
        return botaoSairTela;
    }

    public void setBotaoSairTela(JButton botaoSairTela) {
        this.botaoSairTela = botaoSairTela;
    }

    public JMenu getBotaoconsultarmenu() {
        return botaoconsultarmenu;
    }

    public void setBotaoconsultarmenu(JMenu botaoconsultarmenu) {
        this.botaoconsultarmenu = botaoconsultarmenu;
    }

    public JComboBox<String> getCboSitEmpresa() {
        return cboSitEmpresa;
    }

    public void setCboSitEmpresa(JComboBox<String> cboSitEmpresa) {
        this.cboSitEmpresa = cboSitEmpresa;
    }

    public JComboBox<String> getCboSituacaoAlterar() {
        return cboSituacaoAlterar;
    }

    public void setCboSituacaoAlterar(JComboBox<String> cboSituacaoAlterar) {
        this.cboSituacaoAlterar = cboSituacaoAlterar;
    }

    public JTextField getCnpjEmpresa() {
        return cnpjEmpresa;
    }

    public void setCnpjEmpresa(JTextField cnpjEmpresa) {
        this.cnpjEmpresa = cnpjEmpresa;
    }

    public JTextField getCnpjcpfAlterar() {
        return cnpjcpfAlterar;
    }

    public void setCnpjcpfAlterar(JTextField cnpjcpfAlterar) {
        this.cnpjcpfAlterar = cnpjcpfAlterar;
    }

    public JTextField getCodAlterar() {
        return codAlterar;
    }

    public void setCodAlterar(JTextField codAlterar) {
        this.codAlterar = codAlterar;
    }

    public JTextField getDescAlterar() {
        return descAlterar;
    }

    public void setDescAlterar(JTextField descAlterar) {
        this.descAlterar = descAlterar;
    }

    public JTextField getDescEmpresa() {
        return descEmpresa;
    }

    public void setDescEmpresa(JTextField descEmpresa) {
        this.descEmpresa = descEmpresa;
    }

    public JTextField getEnderecoAlterar() {
        return enderecoAlterar;
    }

    public void setEnderecoAlterar(JTextField enderecoAlterar) {
        this.enderecoAlterar = enderecoAlterar;
    }

    public JTextField getIeAlterar() {
        return ieAlterar;
    }

    public void setIeAlterar(JTextField ieAlterar) {
        this.ieAlterar = ieAlterar;
    }

    public JTextField getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(JTextField nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public JTextField getOcultoIdEmpresa() {
        return ocultoIdEmpresa;
    }

    public void setOcultoIdEmpresa(JTextField ocultoIdEmpresa) {
        this.ocultoIdEmpresa = ocultoIdEmpresa;
    }

    public JTextField getOcultonomeEmpresa() {
        return ocultonomeEmpresa;
    }

    public void setOcultonomeEmpresa(JTextField ocultonomeEmpresa) {
        this.ocultonomeEmpresa = ocultonomeEmpresa;
    }

    public JTable getTabelaResultadoConsultaEmpresa() {
        return tabelaResultadoConsultaEmpresa;
    }

    public void setTabelaResultadoConsultaEmpresa(JTable tabelaResultadoConsultaEmpresa) {
        this.tabelaResultadoConsultaEmpresa = tabelaResultadoConsultaEmpresa;
    }

    public JScrollPane getPanedescEmpresa() {
        return panedescEmpresa;
    }

    public void setPanedescEmpresa(JScrollPane panedescEmpresa) {
        this.panedescEmpresa = panedescEmpresa;
    }


}