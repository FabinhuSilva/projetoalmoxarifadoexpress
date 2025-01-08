/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.classeUtilitaria;
import Controller.conexaoBancoController;
import Controller.loginController;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Fabinhu
 */
public class menuPrincipal extends javax.swing.JFrame {

    
    private  classeUtilitaria controller; 
    private View.login login;
    
    /**
     * Creates new form MenuPrincipal
     */
    
    
    public menuPrincipal() {
        initComponents();
        controller = new classeUtilitaria(this);
        jmRelatorio.setEnabled(false);
        jmImportacao.setEnabled(false);
        controller.atualizarData();
        controller.atualizarHora();
        
                
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        hora = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmCadastroEPI = new javax.swing.JMenu();
        jmCadastroFuncionario = new javax.swing.JMenuItem();
        jmCadastroEmpresa = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jmiCadastroEPI = new javax.swing.JMenuItem();
        jmCadastroUsuario = new javax.swing.JMenuItem();
        menuEPISetor = new javax.swing.JMenuItem();
        jmCadastroExEpi = new javax.swing.JMenuItem();
        jmEntregaEpi = new javax.swing.JMenu();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AlmoxarifadoExpress");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hora.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        hora.setForeground(new java.awt.Color(255, 255, 255));
        hora.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        hora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/iconeRelogio24px.png"))); // NOI18N
        desktop.add(hora);
        hora.setBounds(1090, 820, 120, 30);

        data.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        data.setForeground(new java.awt.Color(255, 255, 255));
        data.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/iconeCalendario24px.png"))); // NOI18N
        desktop.add(data);
        data.setBounds(10, 820, 130, 30);

        getContentPane().add(desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 850));

        jmCadastroEPI.setText("Cadastro");
        jmCadastroEPI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmCadastroEPIMouseClicked(evt);
            }
        });
        jmCadastroEPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastroEPIActionPerformed(evt);
            }
        });

        jmCadastroFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/iconeFuncionario16px.png"))); // NOI18N
        jmCadastroFuncionario.setText("Funcionario");
        jmCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastroFuncionarioActionPerformed(evt);
            }
        });
        jmCadastroEPI.add(jmCadastroFuncionario);

        jmCadastroEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/iconeEmpresa16px.png"))); // NOI18N
        jmCadastroEmpresa.setText("Empresa");
        jmCadastroEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmCadastroEmpresaMouseClicked(evt);
            }
        });
        jmCadastroEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastroEmpresaActionPerformed(evt);
            }
        });
        jmCadastroEPI.add(jmCadastroEmpresa);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/iconeSetor16px.png"))); // NOI18N
        jMenuItem3.setText("Setor");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jmCadastroEPI.add(jMenuItem3);

        jmiCadastroEPI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/iconeEPI16px_1.png"))); // NOI18N
        jmiCadastroEPI.setText("EPI");
        jmiCadastroEPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastroEPIActionPerformed(evt);
            }
        });
        jmCadastroEPI.add(jmiCadastroEPI);

        jmCadastroUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/iconeUsuarioSistema16px.png"))); // NOI18N
        jmCadastroUsuario.setText("Usuario Sistema");
        jmCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastroUsuarioActionPerformed(evt);
            }
        });
        jmCadastroEPI.add(jmCadastroUsuario);

        menuEPISetor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/iconeSetorEpi16px.png"))); // NOI18N
        menuEPISetor.setText("EPI por Setor");
        menuEPISetor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuEPISetorMouseClicked(evt);
            }
        });
        menuEPISetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEPISetorActionPerformed(evt);
            }
        });
        jmCadastroEPI.add(menuEPISetor);

        jmCadastroExEpi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/iconeExcecap16px.png"))); // NOI18N
        jmCadastroExEpi.setText("Exceção EPI");
        jmCadastroExEpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastroExEpiActionPerformed(evt);
            }
        });
        jmCadastroEPI.add(jmCadastroExEpi);

        jMenuBar1.add(jmCadastroEPI);

        jmEntregaEpi.setText("Operação");
        jmEntregaEpi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmEntregaEpiMouseClicked(evt);
            }
        });

        jmOpercaoEntregaEPI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/iconeEntregaEpi24px.png"))); // NOI18N
        jmOpercaoEntregaEPI.setText("Entrega de EPI");
        jmOpercaoEntregaEPI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmOpercaoEntregaEPIMouseClicked(evt);
            }
        });
        jmEntregaEpi.add(jmOpercaoEntregaEPI);

        jmOperacaoAjusteEstoque.setText("Ajuste de Estoque");
        jmEntregaEpi.add(jmOperacaoAjusteEstoque);

        jmOperacaoAgendaEntregaEPI.setText("Agenda de Entrega EPI");
        jmEntregaEpi.add(jmOperacaoAgendaEntregaEPI);

        jMenuBar1.add(jmEntregaEpi);

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
        jmSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1233, 912));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //getContentPane().add(jDesktopPane);
    
    private void jmiCadastroEPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastroEPIActionPerformed
      View.Relatorios.intRelatorioEPI Relepi = new View.Relatorios.intRelatorioEPI();
      desktop.add(Relepi);
      Relepi.setVisible(true)   ;
    }//GEN-LAST:event_jmiCadastroEPIActionPerformed

    private void jmSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSairMouseClicked
     controller.encerrarAplicativo();
    }//GEN-LAST:event_jmSairMouseClicked

    private void jmSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSairActionPerformed
  
    }//GEN-LAST:event_jmSairActionPerformed

    private void jmCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastroFuncionarioActionPerformed
        View.Relatorios.intRelatorioFuncionario Relfuncionario = new View.Relatorios.intRelatorioFuncionario();
        desktop.add(Relfuncionario);
        Relfuncionario.setVisible(true);
    }//GEN-LAST:event_jmCadastroFuncionarioActionPerformed

    private void jmCadastroEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastroEmpresaActionPerformed
     View.Relatorios.intRelatorioEmpresa Relempresa = new View.Relatorios.intRelatorioEmpresa();
      desktop.add(Relempresa);
      Relempresa.setVisible(true);    

    }//GEN-LAST:event_jmCadastroEmpresaActionPerformed

    private void jmCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastroUsuarioActionPerformed
        View.Relatorios.intRelatorioUsuario menuUsuario = new View.Relatorios.intRelatorioUsuario();
        desktop.add(menuUsuario);
        menuUsuario.setVisible(true);
    }//GEN-LAST:event_jmCadastroUsuarioActionPerformed

    private void jmCadastroEPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastroEPIActionPerformed
    View.Relatorios.intRelatorioEPI RelEPI = new View.Relatorios.intRelatorioEPI();
    desktop.add(RelEPI);
    RelEPI.setVisible(true);
    
                                         }//GEN-LAST:event_jmCadastroEPIActionPerformed

    private void jmCadastroEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmCadastroEmpresaMouseClicked
      View.Relatorios.intRelatorioEmpresa Relempresa = new View.Relatorios.intRelatorioEmpresa();
      desktop.add(Relempresa);
      Relempresa.setVisible(true);  
    //empresa.show();
    }//GEN-LAST:event_jmCadastroEmpresaMouseClicked

    private void jmCadastroEPIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmCadastroEPIMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jmCadastroEPIMouseClicked

    private void menuEPISetorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEPISetorMouseClicked
  
    }//GEN-LAST:event_menuEPISetorMouseClicked

    private void menuEPISetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEPISetorActionPerformed
        View.Relatorios.intRelatorioSetorEPI menuSetorEPI = new View.Relatorios.   intRelatorioSetorEPI();
        desktop.add(menuSetorEPI);
        menuSetorEPI.setVisible(true);
    }//GEN-LAST:event_menuEPISetorActionPerformed

    private void jmCadastroExEpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastroExEpiActionPerformed
    View.Relatorios.intRelatorioExcecao RelEx = new View.Relatorios.intRelatorioExcecao();
    desktop.add(RelEx);
    RelEx.setVisible(true);
    }//GEN-LAST:event_jmCadastroExEpiActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        View.Relatorios.intRelatorioSetor RelSetor = new View.Relatorios.intRelatorioSetor();
        desktop.add(RelSetor);
        RelSetor.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jmEntregaEpiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmEntregaEpiMouseClicked
         
    }//GEN-LAST:event_jmEntregaEpiMouseClicked

    private void jmOpercaoEntregaEPIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmOpercaoEntregaEPIMouseClicked
       View.EntregaEPI entrega = new View.EntregaEPI();
        entrega.setVisible(true);
    }//GEN-LAST:event_jmOpercaoEntregaEPIMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel data;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel hora;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu jmCadastroEPI;
    private javax.swing.JMenuItem jmCadastroEmpresa;
    private javax.swing.JMenuItem jmCadastroExEpi;
    private javax.swing.JMenuItem jmCadastroFuncionario;
    private javax.swing.JMenuItem jmCadastroUsuario;
    private javax.swing.JMenu jmEntregaEpi;
    private javax.swing.JMenu jmImportacao;
    private javax.swing.JMenuItem jmImportacaoEntregaEPI;
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
    private javax.swing.JMenuItem menuEPISetor;
    // End of variables declaration//GEN-END:variables

    public JDesktopPane getDesktop() {
        return desktop;
    }

    public void setdesktop(JDesktopPane desktop) {
        this.desktop = desktop;
    }

    public JLabel getData() {
        return data;
    }

    public void setData(JLabel data) {
        this.data = data;
    }

    public JLabel getHora() {
        return hora;
    }

    public void setHora(JLabel hora) {
        this.hora = hora;
    }





    
}
