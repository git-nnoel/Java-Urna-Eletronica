/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pedro
 */
public class PrimeiroCargo extends javax.swing.JFrame {

    /**
     * Creates new form PrimeiroCargo
     */
    MainSystem Main = new MainSystem();
    public PrimeiroCargo() {
        initComponents();
    }
    
    public void setInfo(String nome, String idade, String img){
        System.out.println("PASSO 3 CONTÉM: " + nome + " " + idade + " " + img);
        InsertNOME.setText(nome);
        InsertIDADE.setText(idade);
        
    }
    
    public void SetInvisible(){
    this.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton10 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        InsertNOME = new javax.swing.JLabel();
        InsertIDADE = new javax.swing.JLabel();
        LabelIMG = new javax.swing.JLabel();
        Numpad2 = new javax.swing.JButton();
        Numpad1 = new javax.swing.JButton();
        Numpad3 = new javax.swing.JButton();
        Numpad5 = new javax.swing.JButton();
        Numpad4 = new javax.swing.JButton();
        Numpad6 = new javax.swing.JButton();
        Numpad8 = new javax.swing.JButton();
        Numpad7 = new javax.swing.JButton();
        Numpad9 = new javax.swing.JButton();
        Numpad0 = new javax.swing.JButton();
        BotaoBranco = new javax.swing.JButton();
        BotaoConfirma = new javax.swing.JButton();
        BotaoCorrige = new javax.swing.JButton();

        jButton10.setText("1");
        jButton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton10.setContentAreaFilled(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 36)); // NOI18N
        jLabel1.setText("URNA ELETRÔNICA");

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("NOME:");

        jLabel3.setText("IDADE:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("CARGO: PRESIDENTE");

        jLabel5.setFont(new java.awt.Font("Sitka Text", 0, 11)); // NOI18N
        jLabel5.setText("TECLE VERDE PARA CONFIRMAR");

        jLabel7.setFont(new java.awt.Font("Sitka Text", 0, 11)); // NOI18N
        jLabel7.setText("TECLE LARANJA PARA CORRIGIR");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(InsertIDADE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(InsertNOME, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(LabelIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(InsertNOME))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(InsertIDADE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        Numpad2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Numpad2.setText("2");
        Numpad2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Numpad2.setContentAreaFilled(false);
        Numpad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numpad2ActionPerformed(evt);
            }
        });

        Numpad1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Numpad1.setText("1");
        Numpad1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Numpad1.setContentAreaFilled(false);
        Numpad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numpad1ActionPerformed(evt);
            }
        });

        Numpad3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Numpad3.setText("3");
        Numpad3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Numpad3.setContentAreaFilled(false);
        Numpad3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numpad3ActionPerformed(evt);
            }
        });

        Numpad5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Numpad5.setText("5");
        Numpad5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Numpad5.setContentAreaFilled(false);
        Numpad5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numpad5ActionPerformed(evt);
            }
        });

        Numpad4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Numpad4.setText("4");
        Numpad4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Numpad4.setContentAreaFilled(false);
        Numpad4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numpad4ActionPerformed(evt);
            }
        });

        Numpad6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Numpad6.setText("6");
        Numpad6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Numpad6.setContentAreaFilled(false);
        Numpad6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numpad6ActionPerformed(evt);
            }
        });

        Numpad8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Numpad8.setText("8");
        Numpad8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Numpad8.setContentAreaFilled(false);
        Numpad8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numpad8ActionPerformed(evt);
            }
        });

        Numpad7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Numpad7.setText("7");
        Numpad7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Numpad7.setContentAreaFilled(false);
        Numpad7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numpad7ActionPerformed(evt);
            }
        });

        Numpad9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Numpad9.setText("9");
        Numpad9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Numpad9.setContentAreaFilled(false);
        Numpad9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numpad9ActionPerformed(evt);
            }
        });

        Numpad0.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Numpad0.setText("0");
        Numpad0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Numpad0.setContentAreaFilled(false);
        Numpad0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numpad0ActionPerformed(evt);
            }
        });

        BotaoBranco.setText("BRANCO");
        BotaoBranco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotaoBranco.setContentAreaFilled(false);
        BotaoBranco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBrancoActionPerformed(evt);
            }
        });

        BotaoConfirma.setText("CONFIRMA");
        BotaoConfirma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotaoConfirma.setContentAreaFilled(false);
        BotaoConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoConfirmaActionPerformed(evt);
            }
        });

        BotaoCorrige.setText("CORRIGE");
        BotaoCorrige.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotaoCorrige.setContentAreaFilled(false);
        BotaoCorrige.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCorrigeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(Numpad1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Numpad2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(Numpad4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Numpad5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Numpad6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(138, 138, 138)
                            .addComponent(Numpad3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Numpad0, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(Numpad7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Numpad8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Numpad9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(BotaoBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoCorrige, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Numpad1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Numpad2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Numpad3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Numpad4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Numpad5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Numpad6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Numpad7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Numpad8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Numpad9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Numpad0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotaoBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoCorrige, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Numpad3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numpad3ActionPerformed
        int Num = 3;
        try {
            Main.SetCod(Num);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PrimeiroCargo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Numpad3ActionPerformed

    private void Numpad0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numpad0ActionPerformed
        int Num = 0;
        try {
            Main.SetCod(Num);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PrimeiroCargo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Numpad0ActionPerformed

    private void BotaoBrancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBrancoActionPerformed
        this.setVisible(false);
        new SegundoCargo().setVisible(true);
        Main.VotoBranco();
    }//GEN-LAST:event_BotaoBrancoActionPerformed

    private void BotaoConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoConfirmaActionPerformed
        this.setVisible(false);
        Main.AddVote();
    }//GEN-LAST:event_BotaoConfirmaActionPerformed

    private void BotaoCorrigeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCorrigeActionPerformed
        Main.ClearVote();
    }//GEN-LAST:event_BotaoCorrigeActionPerformed

    private void Numpad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numpad1ActionPerformed
        int Num = 1;
        try {
            Main.SetCod(Num);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PrimeiroCargo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Numpad1ActionPerformed

    private void Numpad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numpad2ActionPerformed
        int Num = 2;
        try {
            Main.SetCod(Num);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PrimeiroCargo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Numpad2ActionPerformed

    private void Numpad4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numpad4ActionPerformed
        int Num = 4;
        try {
            Main.SetCod(Num);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PrimeiroCargo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Numpad4ActionPerformed

    private void Numpad5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numpad5ActionPerformed
        int Num = 5;
        try {
            Main.SetCod(Num);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PrimeiroCargo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Numpad5ActionPerformed

    private void Numpad6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numpad6ActionPerformed
        int Num = 6;
        try {
            Main.SetCod(Num);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PrimeiroCargo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Numpad6ActionPerformed

    private void Numpad7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numpad7ActionPerformed
        int Num = 7;
        try {
            Main.SetCod(Num);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PrimeiroCargo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Numpad7ActionPerformed

    private void Numpad8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numpad8ActionPerformed
        int Num = 8;
        try {
            Main.SetCod(Num);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PrimeiroCargo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Numpad8ActionPerformed

    private void Numpad9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numpad9ActionPerformed
        int Num = 9;
        try {
            Main.SetCod(Num);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PrimeiroCargo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Numpad9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoBranco;
    private javax.swing.JButton BotaoConfirma;
    private javax.swing.JButton BotaoCorrige;
    private javax.swing.JLabel InsertIDADE;
    private javax.swing.JLabel InsertNOME;
    private javax.swing.JLabel LabelIMG;
    private javax.swing.JButton Numpad0;
    private javax.swing.JButton Numpad1;
    private javax.swing.JButton Numpad2;
    private javax.swing.JButton Numpad3;
    private javax.swing.JButton Numpad4;
    private javax.swing.JButton Numpad5;
    private javax.swing.JButton Numpad6;
    private javax.swing.JButton Numpad7;
    private javax.swing.JButton Numpad8;
    private javax.swing.JButton Numpad9;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
