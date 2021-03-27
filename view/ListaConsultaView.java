/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ighor.view;

import com.ighor.control.ListaConsultaControl;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Ighor Alves
 */
public class ListaConsultaView extends javax.swing.JFrame {

    private final ListaConsultaControl control;

    /**
     * Creates new form ListaConsultaView
     */
    public ListaConsultaView() {
        initComponents();
        control=new ListaConsultaControl(this);
        iniciar();
    }

    private void iniciar() {
        control.iniciarTabela();
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
        jLabel3 = new javax.swing.JLabel();
        txt_ListaConsultaPesquisar = new javax.swing.JTextField();
        btn_ListaConsultaBuscar = new javax.swing.JButton();
        btn_ListaConsultaFechar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_ListaConsultaDados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Agenda de Consultas");

        jLabel3.setText("Pesquisar:");

        btn_ListaConsultaBuscar.setText("Buscar");
        btn_ListaConsultaBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ListaConsultaBuscarActionPerformed(evt);
            }
        });

        btn_ListaConsultaFechar.setText("Fechar");

        tbl_ListaConsultaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Data", "Horario", "Descricao", "Valor", "Paciente", "Funcionario", "Procedimento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_ListaConsultaDados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel3)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_ListaConsultaBuscar)
                                .addGap(52, 52, 52)
                                .addComponent(btn_ListaConsultaFechar))
                            .addComponent(txt_ListaConsultaPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_ListaConsultaPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ListaConsultaBuscar)
                    .addComponent(btn_ListaConsultaFechar))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ListaConsultaBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ListaConsultaBuscarActionPerformed
        // TODO add your handling code here:
        control.buscarConsulta();
    }//GEN-LAST:event_btn_ListaConsultaBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(ListaConsultaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaConsultaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaConsultaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaConsultaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaConsultaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ListaConsultaBuscar;
    private javax.swing.JButton btn_ListaConsultaFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_ListaConsultaDados;
    private javax.swing.JTextField txt_ListaConsultaPesquisar;
    // End of variables declaration//GEN-END:variables

    public JButton getBtn_ListaConsultaBuscar() {
        return btn_ListaConsultaBuscar;
    }

    public void setBtn_ListaConsultaBuscar(JButton btn_ListaConsultaBuscar) {
        this.btn_ListaConsultaBuscar = btn_ListaConsultaBuscar;
    }

    public JButton getBtn_ListaConsultaFechar() {
        return btn_ListaConsultaFechar;
    }

    public void setBtn_ListaConsultaFechar(JButton btn_ListaConsultaFechar) {
        this.btn_ListaConsultaFechar = btn_ListaConsultaFechar;
    }

    public JTable getTbl_ListaConsultaDados() {
        return tbl_ListaConsultaDados;
    }

    public void setTbl_ListaConsultaDados(JTable tbl_ListaConsultaDados) {
        this.tbl_ListaConsultaDados = tbl_ListaConsultaDados;
    }

    public JTextField getTxt_ListaConsultaPesquisar() {
        return txt_ListaConsultaPesquisar;
    }

    public void setTxt_ListaConsultaPesquisar(JTextField txt_ListaConsultaPesquisar) {
        this.txt_ListaConsultaPesquisar = txt_ListaConsultaPesquisar;
    }


    

}
