/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.ConfirmacaoPresencaCL;
import Controle.InscricaoEventoCL;
import Negocio.ConfirmacaoPresencaBO;
import Negocio.InscricaoEventoBO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ronaima
 */
public class InscricaoEventoUI extends javax.swing.JFrame {
     private static InscricaoEventoUI InscricaoEventoInstancia;  
    /**
     * Creates new form ColaboradorUI
     */
    public InscricaoEventoUI() {
        initComponents();
    }
    
    public static synchronized InscricaoEventoUI getInstance(){
        if(InscricaoEventoInstancia == null){
            InscricaoEventoInstancia = new InscricaoEventoUI();
        }
        // Abrir janela centralizada.
        InscricaoEventoInstancia.setLocationRelativeTo(null);
        return InscricaoEventoInstancia;
    }

    /**
     * Creates new form InscricaoEventoUI
     */
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRaAluno = new javax.swing.JTextField();
        txtCodigoEvento = new javax.swing.JTextField();
        btnConfirmarInscricao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInscricaoEvento = new javax.swing.JTable();
        txtCodInscricaoEvento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Inscrição Evento");

        jLabel2.setText("Ra Aluno:");

        jLabel3.setText("Codigo Evento:");

        txtRaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRaAlunoActionPerformed(evt);
            }
        });

        txtCodigoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoEventoActionPerformed(evt);
            }
        });

        btnConfirmarInscricao.setText("Confirmar Inscrição");
        btnConfirmarInscricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarInscricaoActionPerformed(evt);
            }
        });

        tblInscricaoEvento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código de Inscrição", "Código Evento", "RA Aluno"
            }
        ));
        tblInscricaoEvento.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblInscricaoEventoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tblInscricaoEvento);

        txtCodInscricaoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodInscricaoEventoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCodInscricaoEvento))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtRaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCodigoEvento)))
                    .addComponent(btnConfirmarInscricao))
                .addContainerGap(211, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodInscricaoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConfirmarInscricao)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoEventoActionPerformed

    private void txtRaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRaAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRaAlunoActionPerformed

    private void btnConfirmarInscricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarInscricaoActionPerformed
        InscricaoEventoBO evento = readInscricaoEvento();
        InscricaoEventoCL.newInscricaoEvento(evento);
        JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!");
        retrieveInscricaoEvento();
        txtCodigoEvento.setText("");
        txtCodInscricaoEvento.setText("");
        txtRaAluno.setText("");
      

    }//GEN-LAST:event_btnConfirmarInscricaoActionPerformed

    private void txtCodInscricaoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodInscricaoEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodInscricaoEventoActionPerformed

    private void tblInscricaoEventoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblInscricaoEventoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tblInscricaoEventoAncestorAdded

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
            java.util.logging.Logger.getLogger(InscricaoEventoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InscricaoEventoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InscricaoEventoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InscricaoEventoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InscricaoEventoUI().setVisible(true);
            }
        });
    }
    
    public void retrieveInscricaoEvento(){
        DefaultTableModel modelinho = new DefaultTableModel();

        modelinho.addColumn("Código de Inscricao de Evento");
        modelinho.addColumn("Código de Evento");
        modelinho.addColumn("RA do aluno");

        tblInscricaoEvento.setModel(modelinho);        

        InscricaoEventoCL.showInscricaoEvento().stream().forEach((c) -> {
            modelinho.addRow(new Object[]{
                c.getCodInscricaoEvento(),
                c.getCodEvento(),
                c.getRaAluno()
            });
         });
        tblInscricaoEvento.setModel(modelinho);
    }
    
    public InscricaoEventoBO readInscricaoEvento(){
        
        String RaAluno = txtRaAluno.getText();
            int raAluno = Integer.parseInt(RaAluno);
        String CodEvento = txtCodigoEvento.getText();
            int codEvento = Integer.parseInt(CodEvento);  
        String CodigoEvento = txtCodInscricaoEvento.getText();
            int codInscricaoEvento = Integer.parseInt(CodigoEvento); 
            
        return new InscricaoEventoBO( raAluno, codEvento,codInscricaoEvento);
    }    

    public void findInscricaoEvento(InscricaoEventoBO c){
        txtCodigoEvento.setText(String.valueOf(c.getCodEvento()));
        txtRaAluno.setText(String.valueOf(c.getRaAluno()));
        txtCodInscricaoEvento.setText(String.valueOf(c.getCodInscricaoEvento()));
    }  
    
 //   public void retrieveInscricaoEvento(){
//            DefaultTableModel modelinho=new DefaultTableModel();
//            modelinho.addColumn("Codigo Evento");
//            modelinho.addColumn("Ra Aluno");
//            
//            tblInscricaoEvento.setModel(modelinho);        
//            
//            for(InscricaoEventoBO c:InscricaoEventoCL.showInscricaoEvento()){
//                modelinho.addRow(new Object[]{c.getCodEvento(),c.getRaAluno()});
//            }
//            tblInscricaoEvento.setModel(modelinho);
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmarInscricao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblInscricaoEvento;
    private javax.swing.JTextField txtCodInscricaoEvento;
    private javax.swing.JTextField txtCodigoEvento;
    private javax.swing.JTextField txtRaAluno;
    // End of variables declaration//GEN-END:variables
}
