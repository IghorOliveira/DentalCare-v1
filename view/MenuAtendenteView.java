/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ighor.view;

import com.ighor.control.MenuAtendenteControl;

/**
 *
 * @author Ighor Alves
 */
public class MenuAtendenteView extends javax.swing.JFrame {

    private final MenuAtendenteControl control;

    /**
     * Creates new form MenuAtendenteView
     */
    public MenuAtendenteView() {
        initComponents();
        control = new MenuAtendenteControl(this);
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
        jmb_Atend = new javax.swing.JMenuBar();
        jmn_AtendConsulta = new javax.swing.JMenu();
        jmi_AtendMarcarConsulta = new javax.swing.JMenuItem();
        jmi_AtendAgendaConsultas = new javax.swing.JMenuItem();
        jmn_AtendCadastrar = new javax.swing.JMenu();
        jmi_AtendCadPaciente = new javax.swing.JMenuItem();
        jmi_AtendCadAtendente = new javax.swing.JMenuItem();
        jmi_AtendCadDentista = new javax.swing.JMenuItem();
        jmi_AtendCadProcedimento = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmn_AtendListar = new javax.swing.JMenu();
        jmi_AtendListarCPacientes = new javax.swing.JMenuItem();
        jmi_AtendListarAtendentes = new javax.swing.JMenuItem();
        jmi_AtendListarDentistas = new javax.swing.JMenuItem();
        jmi_AtendListarProcedimentos = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jmn_AtendPerfil = new javax.swing.JMenu();
        jmn_AtendSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Atendente");

        jmn_AtendConsulta.setText("Consulta");

        jmi_AtendMarcarConsulta.setText("Marcar Consulta");
        jmi_AtendMarcarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_AtendMarcarConsultaActionPerformed(evt);
            }
        });
        jmn_AtendConsulta.add(jmi_AtendMarcarConsulta);

        jmi_AtendAgendaConsultas.setText("Agenda de Consultas");
        jmi_AtendAgendaConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_AtendAgendaConsultasActionPerformed(evt);
            }
        });
        jmn_AtendConsulta.add(jmi_AtendAgendaConsultas);

        jmb_Atend.add(jmn_AtendConsulta);

        jmn_AtendCadastrar.setText("Cadastrar");

        jmi_AtendCadPaciente.setText("Cadastrar Paciente");
        jmi_AtendCadPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_AtendCadPacienteActionPerformed(evt);
            }
        });
        jmn_AtendCadastrar.add(jmi_AtendCadPaciente);

        jmi_AtendCadAtendente.setText("Cadastrar Atendente");
        jmi_AtendCadAtendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_AtendCadAtendenteActionPerformed(evt);
            }
        });
        jmn_AtendCadastrar.add(jmi_AtendCadAtendente);

        jmi_AtendCadDentista.setText("Cadastrar Dentista");
        jmi_AtendCadDentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_AtendCadDentistaActionPerformed(evt);
            }
        });
        jmn_AtendCadastrar.add(jmi_AtendCadDentista);

        jmi_AtendCadProcedimento.setText("Cadastrar Procedimento");
        jmi_AtendCadProcedimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_AtendCadProcedimentoActionPerformed(evt);
            }
        });
        jmn_AtendCadastrar.add(jmi_AtendCadProcedimento);

        jMenuItem1.setText("Cadastrar Cargo");
        jmn_AtendCadastrar.add(jMenuItem1);

        jmb_Atend.add(jmn_AtendCadastrar);

        jmn_AtendListar.setText("Listar");

        jmi_AtendListarCPacientes.setText("Listar Pacientes");
        jmi_AtendListarCPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_AtendListarCPacientesActionPerformed(evt);
            }
        });
        jmn_AtendListar.add(jmi_AtendListarCPacientes);

        jmi_AtendListarAtendentes.setText("Listar Atendentes");
        jmi_AtendListarAtendentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_AtendListarAtendentesActionPerformed(evt);
            }
        });
        jmn_AtendListar.add(jmi_AtendListarAtendentes);

        jmi_AtendListarDentistas.setText("Listar Dentistas");
        jmi_AtendListarDentistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_AtendListarDentistasActionPerformed(evt);
            }
        });
        jmn_AtendListar.add(jmi_AtendListarDentistas);

        jmi_AtendListarProcedimentos.setText("Listar Procedimentos");
        jmi_AtendListarProcedimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_AtendListarProcedimentosActionPerformed(evt);
            }
        });
        jmn_AtendListar.add(jmi_AtendListarProcedimentos);

        jMenuItem2.setText("Listar Cargos");
        jmn_AtendListar.add(jMenuItem2);

        jmb_Atend.add(jmn_AtendListar);

        jmn_AtendPerfil.setText("Perfil");
        jmb_Atend.add(jmn_AtendPerfil);

        jmn_AtendSair.setText("Sair");
        jmb_Atend.add(jmn_AtendSair);

        setJMenuBar(jmb_Atend);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel1)
                .addContainerGap(206, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Menu Atendente");
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_AtendMarcarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_AtendMarcarConsultaActionPerformed
        // TODO add your handling code here:
        control.abrirMarcarConsultaView();
    }//GEN-LAST:event_jmi_AtendMarcarConsultaActionPerformed

    private void jmi_AtendAgendaConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_AtendAgendaConsultasActionPerformed
        // TODO add your handling code here:
        control.abrirListaConsultaView();
    }//GEN-LAST:event_jmi_AtendAgendaConsultasActionPerformed

    private void jmi_AtendCadPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_AtendCadPacienteActionPerformed
        // TODO add your handling code here:
        control.abrirCadastroPacienteView();
    }//GEN-LAST:event_jmi_AtendCadPacienteActionPerformed

    private void jmi_AtendCadAtendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_AtendCadAtendenteActionPerformed
        // TODO add your handling code here:
        control.abrirCadastroAtendenteView();
    }//GEN-LAST:event_jmi_AtendCadAtendenteActionPerformed

    private void jmi_AtendCadDentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_AtendCadDentistaActionPerformed
        // TODO add your handling code here:
        control.abrirCadastroDentistaView();
    }//GEN-LAST:event_jmi_AtendCadDentistaActionPerformed

    private void jmi_AtendCadProcedimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_AtendCadProcedimentoActionPerformed
        // TODO add your handling code here:
        control.abrirCadastroProcedimentoView();
    }//GEN-LAST:event_jmi_AtendCadProcedimentoActionPerformed

    private void jmi_AtendListarCPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_AtendListarCPacientesActionPerformed
        // TODO add your handling code here:
        control.abrirListaPacienteView();
    }//GEN-LAST:event_jmi_AtendListarCPacientesActionPerformed

    private void jmi_AtendListarAtendentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_AtendListarAtendentesActionPerformed
        // TODO add your handling code here:
        control.abrirListaAtendenteView();
    }//GEN-LAST:event_jmi_AtendListarAtendentesActionPerformed

    private void jmi_AtendListarDentistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_AtendListarDentistasActionPerformed
        // TODO add your handling code here:
        control.abrirListaDentistaView();
    }//GEN-LAST:event_jmi_AtendListarDentistasActionPerformed

    private void jmi_AtendListarProcedimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_AtendListarProcedimentosActionPerformed
        // TODO add your handling code here:
        control.abrirListaProcedimentoView();
    }//GEN-LAST:event_jmi_AtendListarProcedimentosActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAtendenteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAtendenteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAtendenteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAtendenteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAtendenteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuBar jmb_Atend;
    private javax.swing.JMenuItem jmi_AtendAgendaConsultas;
    private javax.swing.JMenuItem jmi_AtendCadAtendente;
    private javax.swing.JMenuItem jmi_AtendCadDentista;
    private javax.swing.JMenuItem jmi_AtendCadPaciente;
    private javax.swing.JMenuItem jmi_AtendCadProcedimento;
    private javax.swing.JMenuItem jmi_AtendListarAtendentes;
    private javax.swing.JMenuItem jmi_AtendListarCPacientes;
    private javax.swing.JMenuItem jmi_AtendListarDentistas;
    private javax.swing.JMenuItem jmi_AtendListarProcedimentos;
    private javax.swing.JMenuItem jmi_AtendMarcarConsulta;
    private javax.swing.JMenu jmn_AtendCadastrar;
    private javax.swing.JMenu jmn_AtendConsulta;
    private javax.swing.JMenu jmn_AtendListar;
    private javax.swing.JMenu jmn_AtendPerfil;
    private javax.swing.JMenu jmn_AtendSair;
    // End of variables declaration//GEN-END:variables


    
    
}
