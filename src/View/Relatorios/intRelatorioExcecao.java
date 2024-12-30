/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Relatorios;

import Controller.RelatorioExcecaoEpiController;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Fabinhu
 */
public class intRelatorioExcecao extends javax.swing.JInternalFrame {

    /**
     * Creates new form intRelatorioExcecao
     */
    
    private RelatorioExcecaoEpiController controller;
    
    public intRelatorioExcecao() {
        initComponents();
        controller = new RelatorioExcecaoEpiController(this);
        controller.ocultarCamposEx();
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
        consultaExFuncionario = new javax.swing.JTextField();
        paneConsultaExFuncionario = new javax.swing.JScrollPane();
        tabelaConsultaExFuncionario = new javax.swing.JTable();
        setoridFuncEx = new javax.swing.JTextField();
        ocultoIdEmpresa = new javax.swing.JTextField();
        codigoFuncionarioEx = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nomeFuncEx = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cpfFuncEx = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        chapaFuncEx = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        setorNomeFuncEx = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaResultadoEx = new javax.swing.JTable();
        botaoSair = new javax.swing.JButton();
        botaoConsultarEx = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        botaoConsultar = new javax.swing.JMenu();
        botaoEditar = new javax.swing.JMenu();
        botaoImprimir = new javax.swing.JMenu();
        botaoExcluirMenu = new javax.swing.JMenu();
        botaoIncluir = new javax.swing.JMenu();

        setClosable(true);
        setIconifiable(true);
        setTitle("Consulta de Funcionário");
        setToolTipText("Consulta, Edição e Exclusão de Funcionários");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Funcinoario");

        consultaExFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                consultaExFuncionarioKeyReleased(evt);
            }
        });

        tabelaConsultaExFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaConsultaExFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaConsultaExFuncionarioMouseClicked(evt);
            }
        });
        paneConsultaExFuncionario.setViewportView(tabelaConsultaExFuncionario);

        jLabel2.setText("Nome");

        nomeFuncEx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomeFuncExKeyReleased(evt);
            }
        });

        jLabel3.setText("CPF");

        jLabel4.setText("Chapa");

        jLabel5.setText("Setor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ocultoIdEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(setoridFuncEx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(paneConsultaExFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                                    .addComponent(consultaExFuncionario))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(codigoFuncionarioEx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeFuncEx)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpfFuncEx, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chapaFuncEx, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(setorNomeFuncEx)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(consultaExFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(codigoFuncionarioEx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ocultoIdEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(setoridFuncEx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paneConsultaExFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeFuncEx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cpfFuncEx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(chapaFuncEx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(setorNomeFuncEx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TabelaResultadoEx.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TabelaResultadoEx);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botaoSair.setText("Sair");
        botaoSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSairMouseClicked(evt);
            }
        });

        botaoConsultarEx.setText("Consultar");
        botaoConsultarEx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoConsultarExMouseClicked(evt);
            }
        });

        botaoConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/iconeConsultar24px.png"))); // NOI18N
        botaoConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoConsultarMouseClicked(evt);
            }
        });
        jMenuBar1.add(botaoConsultar);

        botaoEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/iconeEditar24px.png"))); // NOI18N
        botaoEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoEditarMouseClicked(evt);
            }
        });
        jMenuBar1.add(botaoEditar);

        botaoImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/iconeImprimir24px.png"))); // NOI18N
        jMenuBar1.add(botaoImprimir);

        botaoExcluirMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/iconeExcluir24px.png"))); // NOI18N
        botaoExcluirMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoExcluirMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(botaoExcluirMenu);

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
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoConsultarEx)
                        .addGap(18, 18, 18)
                        .addComponent(botaoSair)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSair)
                    .addComponent(botaoConsultarEx))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoConsultarMouseClicked
    controller.preencherExcecaoEPI();
    getBotaoImprimir().setEnabled(true);
    }//GEN-LAST:event_botaoConsultarMouseClicked

    private void botaoEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoEditarMouseClicked
    View.cadastroExcecaoEPI cadEx = new View.cadastroExcecaoEPI();
    cadEx.setVisible(true);
    }//GEN-LAST:event_botaoEditarMouseClicked

    private void botaoExcluirMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoExcluirMenuMouseClicked
     controller.excluirEPISetorEx();
    }//GEN-LAST:event_botaoExcluirMenuMouseClicked

    private void botaoIncluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoIncluirMouseClicked
      
    }//GEN-LAST:event_botaoIncluirMouseClicked

    private void consultaExFuncionarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_consultaExFuncionarioKeyReleased
        controller.consultarFuncionarioEx();
    }//GEN-LAST:event_consultaExFuncionarioKeyReleased

    private void tabelaConsultaExFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaConsultaExFuncionarioMouseClicked
        controller.preencherDadosFuncionario();
        getBotaoExcluirMenu().setEnabled(true);
    }//GEN-LAST:event_tabelaConsultaExFuncionarioMouseClicked

    private void nomeFuncExKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeFuncExKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFuncExKeyReleased

    private void botaoSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSairMouseClicked
        dispose();
    }//GEN-LAST:event_botaoSairMouseClicked

    private void botaoConsultarExMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoConsultarExMouseClicked
        controller.preencherExcecaoEPI();
        getBotaoImprimir().setEnabled(true);
    }//GEN-LAST:event_botaoConsultarExMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaResultadoEx;
    private javax.swing.JMenu botaoConsultar;
    private javax.swing.JButton botaoConsultarEx;
    private javax.swing.JMenu botaoEditar;
    private javax.swing.JMenu botaoExcluirMenu;
    private javax.swing.JMenu botaoImprimir;
    private javax.swing.JMenu botaoIncluir;
    private javax.swing.JButton botaoSair;
    private javax.swing.JTextField chapaFuncEx;
    private javax.swing.JTextField codigoFuncionarioEx;
    private javax.swing.JTextField consultaExFuncionario;
    private javax.swing.JTextField cpfFuncEx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nomeFuncEx;
    private javax.swing.JTextField ocultoIdEmpresa;
    private javax.swing.JScrollPane paneConsultaExFuncionario;
    private javax.swing.JTextField setorNomeFuncEx;
    private javax.swing.JTextField setoridFuncEx;
    private javax.swing.JTable tabelaConsultaExFuncionario;
    // End of variables declaration//GEN-END:variables

    public RelatorioExcecaoEpiController getController() {
        return controller;
    }

    public void setController(RelatorioExcecaoEpiController controller) {
        this.controller = controller;
    }

    public JMenu getBotaoEditar() {
        return botaoEditar;
    }

    public void setBotaoEditar(JMenu botaoEditar) {
        this.botaoEditar = botaoEditar;
    }

    public JMenu getBotaoExcluir() {
        return botaoExcluirMenu;
    }

    public void setBotaoExcluir(JMenu botaoExcluir) {
        this.botaoExcluirMenu = botaoExcluir;
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

    public JMenu getBotaoconsultarmenu() {
        return botaoConsultar;
    }

    public void setBotaoconsultarmenu(JMenu botaoconsultarmenu) {
        this.botaoConsultar = botaoconsultarmenu;
    }

    public JTextField getCodigoFuncionarioEx() {
        return codigoFuncionarioEx;
    }

    public void setCodigoFuncionarioEx(JTextField codigoFuncionarioEx) {
        this.codigoFuncionarioEx = codigoFuncionarioEx;
    }

    public JTextField getConsultaExFuncionario() {
        return consultaExFuncionario;
    }

    public void setConsultaExFuncionario(JTextField consultaExFuncionario) {
        this.consultaExFuncionario = consultaExFuncionario;
    }

    public JTextField getOcultoIdEmpresa() {
        return ocultoIdEmpresa;
    }

    public void setOcultoIdEmpresa(JTextField ocultoIdEmpresa) {
        this.ocultoIdEmpresa = ocultoIdEmpresa;
    }

    public JTextField getSetoridFuncEx() {
        return setoridFuncEx;
    }

    public void setSetoridFuncEx(JTextField setoridFuncEx) {
        this.setoridFuncEx = setoridFuncEx;
    }

    public JMenu getBotaoConsultar() {
        return botaoConsultar;
    }

    public void setBotaoConsultar(JMenu botaoConsultar) {
        this.botaoConsultar = botaoConsultar;
    }

    public JMenu getBotaoExcluirMenu() {
        return botaoExcluirMenu;
    }

    public void setBotaoExcluirMenu(JMenu botaoExcluirMenu) {
        this.botaoExcluirMenu = botaoExcluirMenu;
    }

    public JTable getTabelaConsultaExFuncionario() {
        return tabelaConsultaExFuncionario;
    }

    public void setTabelaConsultaExFuncionario(JTable tabelaConsultaExFuncionario) {
        this.tabelaConsultaExFuncionario = tabelaConsultaExFuncionario;
    }

    public JTextField getChapaFuncEx() {
        return chapaFuncEx;
    }

    public void setChapaFuncEx(JTextField chapaFuncEx) {
        this.chapaFuncEx = chapaFuncEx;
    }

    public JTextField getCpfFuncEx() {
        return cpfFuncEx;
    }

    public void setCpfFuncEx(JTextField cpfFuncEx) {
        this.cpfFuncEx = cpfFuncEx;
    }

    public JTextField getNomeFuncEx() {
        return nomeFuncEx;
    }

    public void setNomeFuncEx(JTextField nomeFuncEx) {
        this.nomeFuncEx = nomeFuncEx;
    }

    public JScrollPane getPaneConsultaExFuncionario() {
        return paneConsultaExFuncionario;
    }

    public void setPaneConsultaExFuncionario(JScrollPane paneConsultaExFuncionario) {
        this.paneConsultaExFuncionario = paneConsultaExFuncionario;
    }

    public JTextField getSetorNomeFuncEx() {
        return setorNomeFuncEx;
    }

    public void setSetorNomeFuncEx(JTextField setorNomeFuncEx) {
        this.setorNomeFuncEx = setorNomeFuncEx;
    }

    public JButton getBotaoConsultarEx() {
        return botaoConsultarEx;
    }

    public void setBotaoConsultarEx(JButton botaoConsultarEx) {
        this.botaoConsultarEx = botaoConsultarEx;
    }

    public JButton getBotaoSair() {
        return botaoSair;
    }

    public void setBotaoSair(JButton botaoSair) {
        this.botaoSair = botaoSair;
    }

    public JTable getTabelaResultadoEx() {
        return TabelaResultadoEx;
    }

    public void setTabelaResultadoEx(JTable TabelaResultadoEx) {
        this.TabelaResultadoEx = TabelaResultadoEx;
    }


    
}
