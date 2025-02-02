/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Relatorios;

import Controller.RelatorioEmpresaController;
import Controller.classeUtilitaria;
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
public class relatorioEmpresa extends javax.swing.JFrame {

    private  RelatorioEmpresaController controller;  
     
    
    /**
     * Creates new form relatorioEmpresa
     */
    public relatorioEmpresa() {
        initComponents();
        //controller = new RelatorioEmpresaController(this);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        descEmpresa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cnpjEmpresa = new javax.swing.JTextField();
        lblCadastroEpiDecolverTroca = new javax.swing.JLabel();
        cboSitEmpresa = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        nomeEmpresa = new javax.swing.JTextField();
        panedescEmpresa = new javax.swing.JScrollPane();
        TabelaDescEmpresa = new javax.swing.JTable();
        ocultoIdEmpresa = new javax.swing.JTextField();
        ocultonomeEmpresa = new javax.swing.JTextField();
        botaoSairTela = new javax.swing.JButton();
        botaoConsultarTela = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        codAlterar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        descAlterar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cnpjcpfAlterar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ieAlterar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        enderecoAlterar = new javax.swing.JTextField();
        lblCadastroEpiDecolverTroca1 = new javax.swing.JLabel();
        cboSituacaoAlterar = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaResultadoConsultaEmpresa = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        botaoAtualizarDados = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        botaoconsultarmenu = new javax.swing.JMenu();
        botaoEditar = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        botaoExcluir = new javax.swing.JMenu();
        jmIncluir = new javax.swing.JMenu();

        setTitle("Consulta de Cadastro de Empresa");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Descrição");

        descEmpresa.setToolTipText("Digite uma Descrição");
        descEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                descEmpresaKeyReleased(evt);
            }
        });

        jLabel2.setText("CPF/CNPJ");

        cnpjEmpresa.setToolTipText("Digite um CNPJ");
        cnpjEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cnpjEmpresaKeyReleased(evt);
            }
        });

        lblCadastroEpiDecolverTroca.setText("Situação");

        cboSitEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Excluido" }));
        cboSitEmpresa.setToolTipText("Situação Cadastral");

        jLabel3.setText("Empresa");

        nomeEmpresa.setToolTipText("Nome Fantasia da Empresa");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(lblCadastroEpiDecolverTroca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboSitEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cnpjEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ocultoIdEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ocultonomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panedescEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(descEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCadastroEpiDecolverTroca)
                    .addComponent(cboSitEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panedescEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnpjEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(nomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(ocultoIdEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ocultonomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        botaoSairTela.setText("Sair");
        botaoSairTela.setToolTipText("Sair");
        botaoSairTela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSairTelaMouseClicked(evt);
            }
        });

        botaoConsultarTela.setText("Consultar");
        botaoConsultarTela.setToolTipText("Consultar");
        botaoConsultarTela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoConsultarTelaMouseClicked(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setText("Cód. ");

        codAlterar.setToolTipText("Código Interno");

        jLabel6.setText("Descrição");

        descAlterar.setToolTipText("Descrição");

        jLabel7.setText("CPF/CNPJ");

        cnpjcpfAlterar.setToolTipText("CNPJ");

        jLabel8.setText("I.E.");

        ieAlterar.setToolTipText("Inscrição Estadual");

        jLabel9.setText("Endereço");

        enderecoAlterar.setToolTipText("Endereço ");

        lblCadastroEpiDecolverTroca1.setText("Situação ");

        cboSituacaoAlterar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Excluido" }));
        cboSituacaoAlterar.setToolTipText("Sitação Cadastral");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enderecoAlterar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cnpjcpfAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ieAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(lblCadastroEpiDecolverTroca1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboSituacaoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descAlterar)))
                .addGap(13, 13, 13))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(codAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cnpjcpfAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCadastroEpiDecolverTroca1)
                    .addComponent(cboSituacaoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(ieAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(enderecoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tabelaResultadoConsultaEmpresa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaResultadoConsultaEmpresa.setToolTipText("Selecione uma Empresa para Exclusão ou edição de Cadastro");
        jScrollPane1.setViewportView(tabelaResultadoConsultaEmpresa);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Editar Dados Empresa");

        botaoAtualizarDados.setText("Atualizar Dados");
        botaoAtualizarDados.setToolTipText("Atualizar Dados Edittados");
        botaoAtualizarDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoAtualizarDadosMouseClicked(evt);
            }
        });

        botaoconsultarmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/iconeConsultar24px.png"))); // NOI18N
        botaoconsultarmenu.setToolTipText("Consultar");
        jMenuBar1.add(botaoconsultarmenu);

        botaoEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/iconeEditar24px.png"))); // NOI18N
        botaoEditar.setToolTipText("Editar");
        botaoEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoEditarMouseClicked(evt);
            }
        });
        jMenuBar1.add(botaoEditar);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/iconeImprimir24px.png"))); // NOI18N
        jMenu3.setToolTipText("Imprimir");
        jMenuBar1.add(jMenu3);

        botaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/iconeExcluir32px.png"))); // NOI18N
        botaoExcluir.setToolTipText("Excluir Cadastro");
        botaoExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoExcluirMouseClicked(evt);
            }
        });
        jMenuBar1.add(botaoExcluir);

        jmIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/iconeNovo24px.png"))); // NOI18N
        jmIncluir.setToolTipText("Novo Cadastro");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoAtualizarDados)
                                .addGap(368, 368, 368)
                                .addComponent(botaoConsultarTela)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoSairTela))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 10, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoSairTela)
                        .addComponent(botaoConsultarTela))
                    .addComponent(botaoAtualizarDados))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmIncluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmIncluirMouseClicked
        View.cadastroEmpresa empresa = new View.cadastroEmpresa();
        empresa.setVisible(true);
        
    }//GEN-LAST:event_jmIncluirMouseClicked

    private void jmIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmIncluirActionPerformed

    }//GEN-LAST:event_jmIncluirActionPerformed

    private void descEmpresaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descEmpresaKeyReleased
      controller.consultarEmpresaNome();
    }//GEN-LAST:event_descEmpresaKeyReleased

    private void TabelaDescEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaDescEmpresaMouseClicked
        controller.codigoEmpresa();
        
    }//GEN-LAST:event_TabelaDescEmpresaMouseClicked

    private void botaoConsultarTelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoConsultarTelaMouseClicked
       
        controller.consultarEmpresa();
        controller.limparCampos();
        
    }//GEN-LAST:event_botaoConsultarTelaMouseClicked

    private void cnpjEmpresaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnpjEmpresaKeyReleased
         controller.consultarEmpresaCNPJ();
    }//GEN-LAST:event_cnpjEmpresaKeyReleased

    private void botaoExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoExcluirMouseClicked
       controller.excluirEmpreesa();
    }//GEN-LAST:event_botaoExcluirMouseClicked

    private void botaoEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoEditarMouseClicked
        try {   
            controller.desbloquearcamposeditar();
            controller.editarFuncinoario();
        } catch (SQLException ex) {
            Logger.getLogger(relatorioEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoEditarMouseClicked

    private void botaoAtualizarDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAtualizarDadosMouseClicked
        try {
            controller.alteracamposEmpresa();
        } catch (SQLException ex) {
            Logger.getLogger(relatorioEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoAtualizarDadosMouseClicked

    private void botaoSairTelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSairTelaMouseClicked
        System.exit(0);
    }//GEN-LAST:event_botaoSairTelaMouseClicked

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
            java.util.logging.Logger.getLogger(relatorioEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(relatorioEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(relatorioEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(relatorioEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    /* Create and display the form */
  /*      java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
                new relatorioEmpresa().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaDescEmpresa;
    private javax.swing.JButton botaoAtualizarDados;
    private javax.swing.JButton botaoConsultarTela;
    private javax.swing.JMenu botaoEditar;
    private javax.swing.JMenu botaoExcluir;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu jmIncluir;
    private javax.swing.JLabel lblCadastroEpiDecolverTroca;
    private javax.swing.JLabel lblCadastroEpiDecolverTroca1;
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

    public JButton getBotaoConsultarTela() {
        return botaoConsultarTela;
    }

    public void setBotaoConsultarTela(JButton botaoConsultarTela) {
        this.botaoConsultarTela = botaoConsultarTela;
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

    public JTextField getCnpjEmpresa() {
        return cnpjEmpresa;
    }

    public void setCnpjEmpresa(JTextField cnpjEmpresa) {
        this.cnpjEmpresa = cnpjEmpresa;
    }

    public JTextField getDescEmpresa() {
        return descEmpresa;
    }

    public void setDescEmpresa(JTextField descEmpresa) {
        this.descEmpresa = descEmpresa;
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

    public JScrollPane getPanedescEmpresa() {
        return panedescEmpresa;
    }

    public void setPanedescEmpresa(JScrollPane panedescEmpresa) {
        this.panedescEmpresa = panedescEmpresa;
    }

    public JTable getTabelaResultadoConsultaEmpresa() {
        return tabelaResultadoConsultaEmpresa;
    }

    public void setTabelaResultadoConsultaEmpresa(JTable tabelaResultadoConsultaEmpresa) {
        this.tabelaResultadoConsultaEmpresa = tabelaResultadoConsultaEmpresa;
    }

    public JTextField getOcultonomeEmpresa() {
        return ocultonomeEmpresa;
    }

    public void setOcultonomeEmpresa(JTextField ocultonomeEmpresa) {
        this.ocultonomeEmpresa = ocultonomeEmpresa;
    }

    public RelatorioEmpresaController getController() {
        return controller;
    }

    public void setController(RelatorioEmpresaController controller) {
        this.controller = controller;
    }

    public JComboBox<String> getCboSituacaoAlterar() {
        return cboSituacaoAlterar;
    }

    public void setCboSituacaoAlterar(JComboBox<String> cboSituacaoAlterar) {
        this.cboSituacaoAlterar = cboSituacaoAlterar;
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

    public JButton getBotaoAtualizarDados() {
        return botaoAtualizarDados;
    }

    public void setBotaoAtualizarDados(JButton botaoAtualizarDados) {
        this.botaoAtualizarDados = botaoAtualizarDados;
    }



}
