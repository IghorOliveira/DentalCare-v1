/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ighor.view;

import com.ighor.control.CadastroPacienteControl;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

/**
 *
 * @author Ighor Alves
 */
public class CadastroPacienteView extends javax.swing.JFrame {

    private final CadastroPacienteControl control;

    /**
     * Creates new form CadastroPacienteView
     */
    public CadastroPacienteView() {
        initComponents();
        control = new CadastroPacienteControl(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_CadastroPacienteCadastrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btn_CadastroPacienteLimpar = new javax.swing.JButton();
        btn_CadastroPacienteFechar = new javax.swing.JButton();
        txt_CadastroPacienteNome = new javax.swing.JTextField();
        txt_CadastroPacienteCpf = new javax.swing.JTextField();
        txt_CadastroPacienteTelefone = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_CadastroPacienteCelular = new javax.swing.JFormattedTextField();
        txt_CadastroPacienteDataNascimento = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setText("Telefone:");

        jLabel7.setText("Celular:");

        btn_CadastroPacienteCadastrar.setText("Cadastrar");
        btn_CadastroPacienteCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastroPacienteCadastrarActionPerformed(evt);
            }
        });

        jLabel8.setText("Data de Nascimento:");

        btn_CadastroPacienteLimpar.setText("Limpar");
        btn_CadastroPacienteLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastroPacienteLimparActionPerformed(evt);
            }
        });

        btn_CadastroPacienteFechar.setText("Fechar");
        btn_CadastroPacienteFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastroPacienteFecharActionPerformed(evt);
            }
        });

        jLabel1.setText("Cadastro de Paciente");

        jLabel2.setText("Nome Completo:");

        jLabel3.setText("CPF:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(btn_CadastroPacienteCadastrar)
                        .addGap(66, 66, 66)
                        .addComponent(btn_CadastroPacienteLimpar)
                        .addGap(62, 62, 62)
                        .addComponent(btn_CadastroPacienteFechar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_CadastroPacienteNome)
                                    .addComponent(txt_CadastroPacienteCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_CadastroPacienteTelefone)
                                    .addComponent(txt_CadastroPacienteCelular)
                                    .addComponent(txt_CadastroPacienteDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_CadastroPacienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(txt_CadastroPacienteCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_CadastroPacienteTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_CadastroPacienteCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_CadastroPacienteDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_CadastroPacienteCadastrar)
                    .addComponent(btn_CadastroPacienteLimpar)
                    .addComponent(btn_CadastroPacienteFechar))
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CadastroPacienteCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastroPacienteCadastrarActionPerformed
        // TODO add your handling code here:
        control.cadastrarCliente();
    }//GEN-LAST:event_btn_CadastroPacienteCadastrarActionPerformed

    private void btn_CadastroPacienteLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastroPacienteLimparActionPerformed
        // TODO add your handling code here:
        control.limparTela();
    }//GEN-LAST:event_btn_CadastroPacienteLimparActionPerformed

    private void btn_CadastroPacienteFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastroPacienteFecharActionPerformed
        // TODO add your handling code here:
        control.voltarMenuPrincipal();
    }//GEN-LAST:event_btn_CadastroPacienteFecharActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroPacienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPacienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPacienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPacienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPacienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CadastroPacienteCadastrar;
    private javax.swing.JButton btn_CadastroPacienteFechar;
    private javax.swing.JButton btn_CadastroPacienteLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JFormattedTextField txt_CadastroPacienteCelular;
    private javax.swing.JTextField txt_CadastroPacienteCpf;
    private javax.swing.JFormattedTextField txt_CadastroPacienteDataNascimento;
    private javax.swing.JTextField txt_CadastroPacienteNome;
    private javax.swing.JFormattedTextField txt_CadastroPacienteTelefone;
    // End of variables declaration//GEN-END:variables

    public JButton getBtn_CadastroPacienteCadastrar() {
        return btn_CadastroPacienteCadastrar;
    }

    public void setBtn_CadastroPacienteCadastrar(JButton btn_CadastroPacienteCadastrar) {
        this.btn_CadastroPacienteCadastrar = btn_CadastroPacienteCadastrar;
    }

    public JButton getBtn_CadastroPacienteFechar() {
        return btn_CadastroPacienteFechar;
    }

    public void setBtn_CadastroPacienteFechar(JButton btn_CadastroPacienteFechar) {
        this.btn_CadastroPacienteFechar = btn_CadastroPacienteFechar;
    }

    public JButton getBtn_CadastroPacienteLimpar() {
        return btn_CadastroPacienteLimpar;
    }

    public void setBtn_CadastroPacienteLimpar(JButton btn_CadastroPacienteLimpar) {
        this.btn_CadastroPacienteLimpar = btn_CadastroPacienteLimpar;
    }

    public JFormattedTextField getTxt_CadastroPacienteCelular() {
        return txt_CadastroPacienteCelular;
    }

    public void setTxt_CadastroPacienteCelular(JFormattedTextField txt_CadastroPacienteCelular) {
        this.txt_CadastroPacienteCelular = txt_CadastroPacienteCelular;
    }

    public JTextField getTxt_CadastroPacienteCpf() {
        return txt_CadastroPacienteCpf;
    }

    public void setTxt_CadastroPacienteCpf(JTextField txt_CadastroPacienteCpf) {
        this.txt_CadastroPacienteCpf = txt_CadastroPacienteCpf;
    }

    public JFormattedTextField getTxt_CadastroPacienteDataNascimento() {
        return txt_CadastroPacienteDataNascimento;
    }

    public void setTxt_CadastroPacienteDataNascimento(JFormattedTextField txt_CadastroPacienteDataNascimento) {
        this.txt_CadastroPacienteDataNascimento = txt_CadastroPacienteDataNascimento;
    }

    public JTextField getTxt_CadastroPacienteNome() {
        return txt_CadastroPacienteNome;
    }

    public void setTxt_CadastroPacienteNome(JTextField txt_CadastroPacienteNome) {
        this.txt_CadastroPacienteNome = txt_CadastroPacienteNome;
    }

    public JFormattedTextField getTxt_CadastroPacienteTelefone() {
        return txt_CadastroPacienteTelefone;
    }

    public void setTxt_CadastroPacienteTelefone(JFormattedTextField txt_CadastroPacienteTelefone) {
        this.txt_CadastroPacienteTelefone = txt_CadastroPacienteTelefone;
    }

    


}
