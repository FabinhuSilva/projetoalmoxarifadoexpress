/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.cadastroSetorController;
import Controller.cadastroSetorEpiController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Fabinhu
 */
public class cadastroSetorEpi extends javax.swing.JFrame {

    /**
     * Creates new form cadastroSetorEpi
     */
    
    private final cadastroSetorEpiController controller;

     
    public cadastroSetorEpi() throws SQLException {
        initComponents();
         controller = new cadastroSetorEpiController(this);
                 caEpi.setVisible(false);
                 lotecaEpi.setVisible(false);
                 validadeEpi.setVisible(false);

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
        riscoSetor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pesquisaSetor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        codigoSetor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nomeSetor = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaSetor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        botaoAdicionarEpi = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        codigoEpi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        descricaoEpi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        caEpi = new javax.swing.JTextField();
        lotecaEpi = new javax.swing.JTextField();
        pesquisaNomeEpi = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaEpi = new javax.swing.JTable();
        validadeEpi = new javax.swing.JTextField();
        quantidadeEpi = new javax.swing.JTextField();
        botaoCancelarSetorEpi = new javax.swing.JButton();
        botaoSalvarSetorEpi = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaEpiAdicionados = new javax.swing.JTable();
        botaoExcluirEpi = new javax.swing.JButton();
        botaoCarregarEpi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Riscos");

        jLabel3.setText("Setor");

        pesquisaSetor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesquisaSetorKeyReleased(evt);
            }
        });

        jLabel4.setText("Cód. Setor");

        jLabel5.setText("Setor");

        tabelaSetor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelaSetor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaSetorMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaSetor);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeSetor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(codigoSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(riscoSetor))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(pesquisaSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pesquisaSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(riscoSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(34, 34, 34))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 470, 230));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de EPI por Setor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 500, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setText("EPI");

        botaoAdicionarEpi.setText("Adicionar");
        botaoAdicionarEpi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoAdicionarEpiMouseClicked(evt);
            }
        });

        jLabel7.setText("Cód. EPI");

        jLabel8.setText("Descrição");

        jLabel9.setText("Qtdd.");

        pesquisaNomeEpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaNomeEpiActionPerformed(evt);
            }
        });
        pesquisaNomeEpi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesquisaNomeEpiKeyReleased(evt);
            }
        });

        tabelaEpi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelaEpi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaEpiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaEpi);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(codigoEpi, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(descricaoEpi, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(quantidadeEpi, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(pesquisaNomeEpi, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(validadeEpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caEpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lotecaEpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoAdicionarEpi)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pesquisaNomeEpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(codigoEpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descricaoEpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoAdicionarEpi)
                            .addComponent(lotecaEpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caEpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(validadeEpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantidadeEpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addGap(59, 59, 59))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 470, 230));

        botaoCancelarSetorEpi.setText("Cancelar");
        getContentPane().add(botaoCancelarSetorEpi, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 520, -1, -1));

        botaoSalvarSetorEpi.setText("Salvar");
        botaoSalvarSetorEpi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSalvarSetorEpiMouseClicked(evt);
            }
        });
        botaoSalvarSetorEpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarSetorEpiActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSalvarSetorEpi, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 520, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        listaEpiAdicionados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod.", "Descrição", "Qtd.", "Validade", "C.A.", "Lote C.A."
            }
        ));
        jScrollPane1.setViewportView(listaEpiAdicionados);

        botaoExcluirEpi.setText("Excluir");
        botaoExcluirEpi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoExcluirEpiMouseClicked(evt);
            }
        });

        botaoCarregarEpi.setText("Listar EPIs ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(botaoCarregarEpi))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoExcluirEpi)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoCarregarEpi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoExcluirEpi)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 470, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarSetorEpiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSalvarSetorEpiMouseClicked
        try {
            controller.inserirSetorEpiBanco();
        } catch (SQLException ex) {
            Logger.getLogger(cadastroSetorEpi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoSalvarSetorEpiMouseClicked

    private void botaoSalvarSetorEpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarSetorEpiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoSalvarSetorEpiActionPerformed

    private void pesquisaNomeEpiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisaNomeEpiKeyReleased
      controller.buscarnomeEpi();
    }//GEN-LAST:event_pesquisaNomeEpiKeyReleased

    private void pesquisaNomeEpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaNomeEpiActionPerformed
       
    }//GEN-LAST:event_pesquisaNomeEpiActionPerformed

    private void tabelaEpiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaEpiMouseClicked
        //evento que sera usado para setor os campos da tabela quando clicado na lista
        controller.preencherCamposEpi();
    }//GEN-LAST:event_tabelaEpiMouseClicked

    private void pesquisaSetorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisaSetorKeyReleased
        controller.buscarnomeSetor();
    }//GEN-LAST:event_pesquisaSetorKeyReleased

    private void tabelaSetorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaSetorMouseClicked
        controller.preencherCamposSetor();
    }//GEN-LAST:event_tabelaSetorMouseClicked

    private void botaoAdicionarEpiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAdicionarEpiMouseClicked
        controller.adicionarEpi();
    }//GEN-LAST:event_botaoAdicionarEpiMouseClicked

    private void botaoExcluirEpiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoExcluirEpiMouseClicked
       controller.excluirEpi();
    }//GEN-LAST:event_botaoExcluirEpiMouseClicked

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
            java.util.logging.Logger.getLogger(cadastroSetorEpi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroSetorEpi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroSetorEpi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroSetorEpi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new cadastroSetorEpi().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(cadastroSetorEpi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionarEpi;
    private javax.swing.JButton botaoCancelarSetorEpi;
    private javax.swing.JButton botaoCarregarEpi;
    private javax.swing.JButton botaoExcluirEpi;
    private javax.swing.JButton botaoSalvarSetorEpi;
    private javax.swing.JTextField caEpi;
    private javax.swing.JTextField codigoEpi;
    private javax.swing.JTextField codigoSetor;
    private javax.swing.JTextField descricaoEpi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable listaEpiAdicionados;
    private javax.swing.JTextField lotecaEpi;
    private javax.swing.JTextField nomeSetor;
    private javax.swing.JTextField pesquisaNomeEpi;
    private javax.swing.JTextField pesquisaSetor;
    private javax.swing.JTextField quantidadeEpi;
    private javax.swing.JTextField riscoSetor;
    private javax.swing.JTable tabelaEpi;
    private javax.swing.JTable tabelaSetor;
    private javax.swing.JTextField validadeEpi;
    // End of variables declaration//GEN-END:variables

    public JTextField getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(JTextField codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public JTextField getPesquisaSetor() {
        return pesquisaSetor;
    }

    public void setPesquisaSetor(JTextField consultaSetor) {
        this.pesquisaSetor = consultaSetor;
    }

    public JTextField getNomeSetor() {
        return nomeSetor;
    }

    public void setNomeSetor(JTextField nomeSetor) {
        this.nomeSetor = nomeSetor;
    }

    public JTextField getRiscoSetor() {
        return riscoSetor;
    }

    public void setRiscoSetor(JTextField riscoSetor) {
        this.riscoSetor = riscoSetor;
    }

    public JTextField getPesquisaNomeEpi() {
        return pesquisaNomeEpi;
    }

    public void setPesquisaNomeEpi(JTextField pesquisaNomeEpi) {
        this.pesquisaNomeEpi = pesquisaNomeEpi;
    }

    public JTextField getCaEpi() {
        return caEpi;
    }

    public void setCaEpi(JTextField caEpi) {
        this.caEpi = caEpi;
    }

    public JTextField getCodigoEpi() {
        return codigoEpi;
    }

    public void setCodigoEpi(JTextField codigoEpi) {
        this.codigoEpi = codigoEpi;
    }

    public JTextField getDescricaoEpi() {
        return descricaoEpi;
    }

    public void setDescricaoEpi(JTextField descricaoEpi) {
        this.descricaoEpi = descricaoEpi;
    }

    public JTextField getLotecaEpi() {
        return lotecaEpi;
    }

    public void setLotecaEpi(JTextField lotecaEpi) {
        this.lotecaEpi = lotecaEpi;
    }

    public JTextField getValidadeEpi() {
        return validadeEpi;
    }

    public void setValidadeEpi(JTextField validadeEpi) {
        this.validadeEpi = validadeEpi;
    }

    public JTable getTabelaEpi() {
        return tabelaEpi;
    }

    public void setTabelaEpi(JTable tabelaEpi) {
        this.tabelaEpi = tabelaEpi;
    }

    public JTable getTabelaSetor() {
        return tabelaSetor;
    }

    public void setTabelaSetor(JTable tabelaSetor) {
        this.tabelaSetor = tabelaSetor;
    }

    public JTable getListaEpiAdicionados() {
        return listaEpiAdicionados;
    }

    public void setListaEpiAdicionados(JTable listaEpiAdicionados) {
        this.listaEpiAdicionados = listaEpiAdicionados;
    }

    public JTextField getQuantidadeEpi() {
        return quantidadeEpi;
    }

    public void setQuantidadeEpi(JTextField qtdEpi) {
        this.quantidadeEpi = quantidadeEpi;
    }

 

}
