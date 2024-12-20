/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.DAO.agendamentoDAO;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabinhu
 */
public class agendaEntregaEPI extends javax.swing.JFrame {

    /**
     * Creates new form agendaEntregaEPI
     */
    public agendaEntregaEPI() {
        initComponents();
        //Executar o JComboBox em Branco 
        cbxEmpresa.setSelectedIndex(-1);
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
        lblAgendaChapa = new javax.swing.JLabel();
        jtfAgendaChapa = new javax.swing.JTextField();
        jtfAgendaCPF = new javax.swing.JTextField();
        lblAgendaCPF = new javax.swing.JLabel();
        jtfAgendaNome = new javax.swing.JTextField();
        lblAgendaNome = new javax.swing.JLabel();
        lblAgendaEmpresa = new javax.swing.JLabel();
        jtfAgendaSetor = new javax.swing.JTextField();
        lblAgendaSetor = new javax.swing.JLabel();
        lblAgendaDadosColaborador = new javax.swing.JLabel();
        cbxEmpresa = new javax.swing.JComboBox<>();
        lblAgendaTituloTela = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtAgendaObservacao = new javax.swing.JTextArea();
        lblAgendaObservacao1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblAgendaAgendasRealizadas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbAgendaCancelar = new javax.swing.JButton();
        jbAgendaSalvar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        lblAgendaListadeEPI = new javax.swing.JLabel();
        jsAgendaListaEPI = new javax.swing.JScrollPane();
        jlAgendaListaEpi = new javax.swing.JList<>();
        jPanel6 = new javax.swing.JPanel();
        lblAgendaDataAgendamento1 = new javax.swing.JLabel();
        lAgendaDataFinal = new javax.swing.JTextField();
        AgendaDataInicial = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblAgendaChapa.setText("Chapa");

        lblAgendaCPF.setText("CPF");

        lblAgendaNome.setText("Nome");

        lblAgendaEmpresa.setText("Empresa");

        lblAgendaSetor.setText("Setor");

        lblAgendaDadosColaborador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgendaDadosColaborador.setText("Dados Colaborador");

        cbxEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a empresa" }));
        cbxEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEmpresaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAgendaDadosColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAgendaEmpresa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAgendaSetor)
                                .addGap(18, 18, 18)
                                .addComponent(jtfAgendaSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAgendaNome)
                                .addGap(18, 18, 18)
                                .addComponent(jtfAgendaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAgendaCPF)
                                .addGap(18, 18, 18)
                                .addComponent(jtfAgendaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAgendaChapa)
                                .addGap(18, 18, 18)
                                .addComponent(jtfAgendaChapa, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblAgendaDadosColaborador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgendaEmpresa)
                    .addComponent(cbxEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgendaChapa)
                    .addComponent(jtfAgendaChapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgendaNome)
                    .addComponent(jtfAgendaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgendaCPF)
                    .addComponent(jtfAgendaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgendaSetor)
                    .addComponent(jtfAgendaSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 320, 220));

        lblAgendaTituloTela.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lblAgendaTituloTela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgendaTituloTela.setText("Agendamento de Entrega de EPI");
        lblAgendaTituloTela.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblAgendaTituloTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 360, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtAgendaObservacao.setColumns(20);
        jtAgendaObservacao.setRows(5);
        jScrollPane4.setViewportView(jtAgendaObservacao);

        lblAgendaObservacao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgendaObservacao1.setText("Observações");
        lblAgendaObservacao1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblAgendaObservacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 326, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblAgendaObservacao1)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 430, 220));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblAgendaAgendasRealizadas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgendaAgendasRealizadas.setText("Agendas Realizadas");
        lblAgendaAgendasRealizadas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Chapa", "CPF", "Nome Colaborador", "Empresa", "Setor", "Data Inicial Entrega", "Data Final Entrega", "Retirado"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAgendaAgendasRealizadas, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAgendaAgendasRealizadas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 760, 190));

        jbAgendaCancelar.setText("Cancelar");
        getContentPane().add(jbAgendaCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 580, 120, -1));

        jbAgendaSalvar.setText("Salvar");
        getContentPane().add(jbAgendaSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 580, 120, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblAgendaListadeEPI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgendaListadeEPI.setText("Lista de EPI");
        lblAgendaListadeEPI.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlAgendaListaEpi.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jsAgendaListaEPI.setViewportView(jlAgendaListaEpi);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jsAgendaListaEPI)
                    .addComponent(lblAgendaListadeEPI, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAgendaListadeEPI, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsAgendaListaEPI, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, 290, 530));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblAgendaDataAgendamento1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgendaDataAgendamento1.setText("Data Agendamento");
        lblAgendaDataAgendamento1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setText("Data Inicial");

        jLabel2.setText("Data Final");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(lblAgendaDataAgendamento1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 641, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AgendaDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lAgendaDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(lblAgendaDataAgendamento1)
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgendaDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAgendaDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 760, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEmpresaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgendaDataInicial;
    private javax.swing.JComboBox<String> cbxEmpresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbAgendaCancelar;
    private javax.swing.JButton jbAgendaSalvar;
    private javax.swing.JList<String> jlAgendaListaEpi;
    private javax.swing.JScrollPane jsAgendaListaEPI;
    private javax.swing.JTextArea jtAgendaObservacao;
    private javax.swing.JTextField jtfAgendaCPF;
    private javax.swing.JTextField jtfAgendaChapa;
    private javax.swing.JTextField jtfAgendaNome;
    private javax.swing.JTextField jtfAgendaSetor;
    private javax.swing.JTextField lAgendaDataFinal;
    private javax.swing.JLabel lblAgendaAgendasRealizadas;
    private javax.swing.JLabel lblAgendaCPF;
    private javax.swing.JLabel lblAgendaChapa;
    private javax.swing.JLabel lblAgendaDadosColaborador;
    private javax.swing.JLabel lblAgendaDataAgendamento1;
    private javax.swing.JLabel lblAgendaEmpresa;
    private javax.swing.JLabel lblAgendaListadeEPI;
    private javax.swing.JLabel lblAgendaNome;
    private javax.swing.JLabel lblAgendaObservacao1;
    private javax.swing.JLabel lblAgendaSetor;
    private javax.swing.JLabel lblAgendaTituloTela;
    // End of variables declaration//GEN-END:variables

       
     public void DadosCombBoxEmpresa(){
      
     
  }


}

