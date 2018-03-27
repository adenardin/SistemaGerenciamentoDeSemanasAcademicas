/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.EventoCL;
import Negocio.EventoBO;
import javax.swing.JOptionPane;

/**
 *
 * @author ronaima
 */
public class DetalheEventoUI extends javax.swing.JFrame {
    public static synchronized DetalheEventoUI getInstance(){
        DetalheEventoUI detalheEventoInstancia = null;
        if(detalheEventoInstancia == null){
            detalheEventoInstancia = new DetalheEventoUI();
        }
        detalheEventoInstancia.setLocationRelativeTo(null);
        return detalheEventoInstancia;
    }

    /**
     * Creates new form DetalheEventoUI
     */
    public DetalheEventoUI() {
        initComponents();
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
        txtDataFimPublicacaoEvento = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        btnInscreverse = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        lblCodigoEvento = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEvento = new javax.swing.JTable();
        lblNomeEvento = new javax.swing.JLabel();
        lblDescricaoEvento = new javax.swing.JLabel();
        lblDataInicioInscricaoEvento = new javax.swing.JLabel();
        lblDataFimInscricaoEvento = new javax.swing.JLabel();
        lblDataInicioEvento = new javax.swing.JLabel();
        lblDataFimEvento = new javax.swing.JLabel();
        lblDataFimPublicacaoEvento = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodPalestrante1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodPalestrante2 = new javax.swing.JTextField();
        txtCodPalestrante3 = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        txtCodigoEvento = new javax.swing.JTextField();
        txtNomeEvento = new javax.swing.JTextField();
        txtDescricaoEvento = new javax.swing.JTextField();
        txtDataInicioInscricaoEvento = new javax.swing.JTextField();
        txtDataFimInscricaoEvento = new javax.swing.JTextField();
        txtDataInicioEvento = new javax.swing.JTextField();
        txtDataFimEvento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Detalhe Evento");

        txtDataFimPublicacaoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataFimPublicacaoEventoActionPerformed(evt);
            }
        });

        txtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusActionPerformed(evt);
            }
        });

        btnInscreverse.setText("Inscrever-se");
        btnInscreverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscreverseActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pequisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        lblCodigoEvento.setText("Codigo Evento:");
        lblCodigoEvento.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblCodigoEventoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        tblEvento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblEvento.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblEventoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tblEvento);

        lblNomeEvento.setText("Nome Evento:");
        lblNomeEvento.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblNomeEventoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lblDescricaoEvento.setText("Descrição Evento:");
        lblDescricaoEvento.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblDescricaoEventoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lblDataInicioInscricaoEvento.setText("Data de Inicio Inscricao Evento:");
        lblDataInicioInscricaoEvento.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblDataInicioInscricaoEventoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lblDataFimInscricaoEvento.setText("Data Fim Inscricao Evento:");
        lblDataFimInscricaoEvento.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblDataFimInscricaoEventoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lblDataInicioEvento.setText("Data Inicio Evento:");
        lblDataInicioEvento.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblDataInicioEventoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lblDataFimEvento.setText("Data Fim Evento:");
        lblDataFimEvento.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblDataFimEventoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lblDataFimPublicacaoEvento.setText("Data Fim Publicacao Evento:");
        lblDataFimPublicacaoEvento.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblDataFimPublicacaoEventoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel5.setText("Codigo Palesta 1:");

        txtCodPalestrante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodPalestrante1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Codigo Palesta 2:");

        jLabel3.setText("Codigo Palesta 3:");

        txtCodPalestrante2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodPalestrante2ActionPerformed(evt);
            }
        });

        txtCodPalestrante3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodPalestrante3ActionPerformed(evt);
            }
        });

        lblStatus.setText("Status:");
        lblStatus.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblStatusAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        txtCodigoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoEventoActionPerformed(evt);
            }
        });

        txtNomeEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeEventoActionPerformed(evt);
            }
        });

        txtDescricaoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoEventoActionPerformed(evt);
            }
        });

        txtDataInicioInscricaoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataInicioInscricaoEventoActionPerformed(evt);
            }
        });

        txtDataFimInscricaoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataFimInscricaoEventoActionPerformed(evt);
            }
        });

        txtDataInicioEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataInicioEventoActionPerformed(evt);
            }
        });

        txtDataFimEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataFimEventoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodPalestrante3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodPalestrante2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodPalestrante1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCodigoEvento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCodigoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNomeEvento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNomeEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDescricaoEvento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDescricaoEvento))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDataInicioInscricaoEvento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDataInicioInscricaoEvento))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDataFimInscricaoEvento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDataFimInscricaoEvento))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDataInicioEvento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDataInicioEvento))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDataFimEvento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDataFimEvento))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDataFimPublicacaoEvento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDataFimPublicacaoEvento))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblStatus)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInscreverse)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigoEvento)
                            .addComponent(txtCodigoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomeEvento)
                            .addComponent(txtNomeEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDescricaoEvento)
                            .addComponent(txtDescricaoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDataInicioInscricaoEvento)
                            .addComponent(txtDataInicioInscricaoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDataFimInscricaoEvento)
                            .addComponent(txtDataFimInscricaoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDataInicioEvento)
                            .addComponent(txtDataInicioEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDataFimEvento)
                            .addComponent(txtDataFimEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataFimPublicacaoEvento)
                    .addComponent(txtDataFimPublicacaoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStatus)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCodPalestrante1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodPalestrante2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodPalestrante3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisar)
                    .addComponent(btnInscreverse))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataFimPublicacaoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataFimPublicacaoEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataFimPublicacaoEventoActionPerformed

    private void txtStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusActionPerformed

    private void btnInscreverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscreverseActionPerformed
            InscricaoEventoUI formInscricaoEvento = InscricaoEventoUI.getInstance();
        formInscricaoEvento.setVisible(true);
//        EventoBO evento = null;
//        try {
//            evento = readEvento();
//        } catch (ParseException ex) {
//            Logger.getLogger(EventoUI.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        EventoCL.newEvento(evento);
//        JOptionPane.showMessageDialog(null,"Evento cadastrado com sucesso!");
//        retrieveEvento();// TODO add your handling code here:
    }//GEN-LAST:event_btnInscreverseActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        int     cod = Integer.parseInt(txtCodigoEvento.getText());
        //        double  rend = Double.parseDouble(txtRenda.getText());
        String  nom = txtNomeEvento.getText();

        if(nom != null){
            EventoBO c = EventoCL.findEventoNome(nom);
            //findEvento(c);
        }else if(String.valueOf(cod) != null){

            String str = String.valueOf(cod);
            // suppose str becomes null after some operation(s).
            int number = 0;
            try
            {
                if(str != null)
                number = Integer.parseInt(str);
            }
            catch (NumberFormatException e)
            {
                number = 0;
            }

            EventoBO c = EventoCL.findEventoCod(number);
            //findEvento(c);
        }else{
            JOptionPane.showMessageDialog(null,"Digite um parâmetro válido!");
        }// TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void lblCodigoEventoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblCodigoEventoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCodigoEventoAncestorAdded

    private void tblEventoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblEventoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEventoAncestorAdded

    private void lblNomeEventoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblNomeEventoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNomeEventoAncestorAdded

    private void lblDescricaoEventoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblDescricaoEventoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblDescricaoEventoAncestorAdded

    private void lblDataInicioInscricaoEventoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblDataInicioInscricaoEventoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblDataInicioInscricaoEventoAncestorAdded

    private void lblDataFimInscricaoEventoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblDataFimInscricaoEventoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblDataFimInscricaoEventoAncestorAdded

    private void lblDataInicioEventoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblDataInicioEventoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblDataInicioEventoAncestorAdded

    private void lblDataFimEventoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblDataFimEventoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblDataFimEventoAncestorAdded

    private void lblDataFimPublicacaoEventoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblDataFimPublicacaoEventoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblDataFimPublicacaoEventoAncestorAdded

    private void txtCodPalestrante1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodPalestrante1ActionPerformed
        //implementar para puxar o palestrante por codigo
    }//GEN-LAST:event_txtCodPalestrante1ActionPerformed

    private void txtCodPalestrante2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodPalestrante2ActionPerformed
        //implementar para puxar o palestrante por codigo
    }//GEN-LAST:event_txtCodPalestrante2ActionPerformed

    private void txtCodPalestrante3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodPalestrante3ActionPerformed
        //implementar para puxar o palestrante por codigo
    }//GEN-LAST:event_txtCodPalestrante3ActionPerformed

    private void lblStatusAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblStatusAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblStatusAncestorAdded

    private void txtCodigoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoEventoActionPerformed

    private void txtNomeEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeEventoActionPerformed

    private void txtDescricaoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoEventoActionPerformed

    private void txtDataInicioInscricaoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataInicioInscricaoEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataInicioInscricaoEventoActionPerformed

    private void txtDataFimInscricaoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataFimInscricaoEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataFimInscricaoEventoActionPerformed

    private void txtDataInicioEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataInicioEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataInicioEventoActionPerformed

    private void txtDataFimEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataFimEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataFimEventoActionPerformed

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
            java.util.logging.Logger.getLogger(DetalheEventoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalheEventoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalheEventoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalheEventoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetalheEventoUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInscreverse;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigoEvento;
    private javax.swing.JLabel lblDataFimEvento;
    private javax.swing.JLabel lblDataFimInscricaoEvento;
    private javax.swing.JLabel lblDataFimPublicacaoEvento;
    private javax.swing.JLabel lblDataInicioEvento;
    private javax.swing.JLabel lblDataInicioInscricaoEvento;
    private javax.swing.JLabel lblDescricaoEvento;
    private javax.swing.JLabel lblNomeEvento;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTable tblEvento;
    private javax.swing.JTextField txtCodPalestrante1;
    private javax.swing.JTextField txtCodPalestrante2;
    private javax.swing.JTextField txtCodPalestrante3;
    private javax.swing.JTextField txtCodigoEvento;
    private javax.swing.JTextField txtDataFimEvento;
    private javax.swing.JTextField txtDataFimInscricaoEvento;
    private javax.swing.JTextField txtDataFimPublicacaoEvento;
    private javax.swing.JTextField txtDataInicioEvento;
    private javax.swing.JTextField txtDataInicioInscricaoEvento;
    private javax.swing.JTextField txtDescricaoEvento;
    private javax.swing.JTextField txtNomeEvento;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
