/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ighor.view;

import com.ighor.control.ListaConsultaControl;
import com.ighor.control.ListaProcedimentoControl;
import static java.awt.SystemColor.control;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Ighor Alves
 */
public class ListaProcedimentoView extends javax.swing.JFrame {

    /**
     * Creates new form ListaProcedimentosView
     */
    
    private final ListaProcedimentoControl control;
    
    public ListaProcedimentoView() {
        initComponents();
        control = new ListaProcedimentoControl(this);
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
        txt_ListarProcedimentoTexto = new javax.swing.JTextField();
        btn_ListarProcedimentoBuscar = new javax.swing.JButton();
        btn_ListarProcedimentoFechar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_ListarProcedimentoDados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Lista de Procedimentos Cadastrados");

        jLabel3.setText("Pesquisar:");

        btn_ListarProcedimentoBuscar.setText("Buscar");

        btn_ListarProcedimentoFechar.setText("Fechar");

        tbl_ListarProcedimentoDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Descrição", "Valor Sugerido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_ListarProcedimentoDados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(286, 286, 286))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel3)
                        .addGap(25, 25, 25)
                        .addComponent(txt_ListarProcedimentoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(btn_ListarProcedimentoBuscar)
                        .addGap(71, 71, 71)
                        .addComponent(btn_ListarProcedimentoFechar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_ListarProcedimentoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ListarProcedimentoBuscar)
                    .addComponent(btn_ListarProcedimentoFechar))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ListaProcedimentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaProcedimentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaProcedimentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaProcedimentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaProcedimentoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ListarProcedimentoBuscar;
    private javax.swing.JButton btn_ListarProcedimentoFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_ListarProcedimentoDados;
    private javax.swing.JTextField txt_ListarProcedimentoTexto;
    // End of variables declaration//GEN-END:variables

    public JButton getBtn_ListarProcedimentoBuscar() {
        return btn_ListarProcedimentoBuscar;
    }

    public void setBtn_ListarProcedimentoBuscar(JButton btn_ListarProcedimentoBuscar) {
        this.btn_ListarProcedimentoBuscar = btn_ListarProcedimentoBuscar;
    }

    public JButton getBtn_ListarProcedimentoFechar() {
        return btn_ListarProcedimentoFechar;
    }

    public void setBtn_ListarProcedimentoFechar(JButton btn_ListarProcedimentoFechar) {
        this.btn_ListarProcedimentoFechar = btn_ListarProcedimentoFechar;
    }

    public JTable getTbl_ListarProcedimentoDados() {
        return tbl_ListarProcedimentoDados;
    }

    public void setTbl_ListarProcedimentoDados(JTable tbl_ListarProcedimentoDados) {
        this.tbl_ListarProcedimentoDados = tbl_ListarProcedimentoDados;
    }

    public JTextField getTxt_ListarProcedimentoTexto() {
        return txt_ListarProcedimentoTexto;
    }

    public void setTxt_ListarProcedimentoTexto(JTextField txt_ListarProcedimentoTexto) {
        this.txt_ListarProcedimentoTexto = txt_ListarProcedimentoTexto;
    }


    
}