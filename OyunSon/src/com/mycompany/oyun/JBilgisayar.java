
package com.mycompany.oyun;

import Nesneler.AgirTas;
import Nesneler.Kagit;
import Nesneler.Makas;
import Oyuncular.Bilgisayar;
import Test.*;
import java.util.ArrayList;
import Nesneler.Nesne;
import Nesneler.OzelKagit;
import Nesneler.Tas;
import Nesneler.UstaMakas;
import Oyuncular.Kullanıcı;
import java.util.Random;
import java.util.Scanner;


public class JBilgisayar extends javax.swing.JFrame {

    ArrayList<Object> list1 = new ArrayList<Object>(); //bilgisayar
    ArrayList<Object> list2 = new ArrayList<Object>(); //bilgisayar2
    Bilgisayar bilgisayar1 = new Bilgisayar();
    Bilgisayar bilgisayar2 = new Bilgisayar();
    int j=0;
    boolean d1=false,d2=false;
   
    public JBilgisayar() {
        initComponents();
        jPanelSonuc.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSkor = new javax.swing.JPanel();
        jPanelSonuc = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jpanelSavas = new javax.swing.JPanel();
        jbtnpc2 = new javax.swing.JButton();
        jbtnpc1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jpnlpc1ozellik = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelSkor.setBackground(new java.awt.Color(255, 0, 255));

        jPanelSonuc.setBackground(new java.awt.Color(51, 255, 51));

        jTextField1.setText("BİLGİSAYAR1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setText("BİLGİSAYAR2");

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jTextField3.setText("            SONUÇ:");

        jLabel3.setText("                                         jLabel3");

        javax.swing.GroupLayout jPanelSonucLayout = new javax.swing.GroupLayout(jPanelSonuc);
        jPanelSonuc.setLayout(jPanelSonucLayout);
        jPanelSonucLayout.setHorizontalGroup(
            jPanelSonucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSonucLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(jPanelSonucLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelSonucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelSonucLayout.createSequentialGroup()
                        .addGroup(jPanelSonucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelSonucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        jPanelSonucLayout.setVerticalGroup(
            jPanelSonucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSonucLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelSonucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelSonucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTextField4.setText("SKOR");

        jTextField5.setText("BİLGİSAYAR:");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setText("KULLANICI:");

        jTextField7.setText("ROUND:");

        javax.swing.GroupLayout jPanelSkorLayout = new javax.swing.GroupLayout(jPanelSkor);
        jPanelSkor.setLayout(jPanelSkorLayout);
        jPanelSkorLayout.setHorizontalGroup(
            jPanelSkorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSkorLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelSkorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField4)
                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(jTextField6)
                    .addComponent(jTextField7))
                .addGap(18, 18, 18)
                .addGroup(jPanelSkorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelSonuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanelSkorLayout.setVerticalGroup(
            jPanelSkorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSkorLayout.createSequentialGroup()
                .addGroup(jPanelSkorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSkorLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanelSkorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelSkorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelSkorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelSkorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanelSkorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelSonuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jpanelSavas.setBackground(new java.awt.Color(0, 0, 255));

        jbtnpc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnpc2ActionPerformed(evt);
            }
        });

        jbtnpc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnpc1ActionPerformed(evt);
            }
        });

        jButton1.setText("OYNAT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jpnlpc1ozellik.setBackground(new java.awt.Color(204, 204, 204));

        jTextField8.setText("PC1 NESNE ÖZELLİĞİ");

        jTextField10.setText("İSİM");

        jLabel8.setText("jLabel8");

        jTextField11.setText("DAYANIKLILIK");
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jLabel9.setText("jLabel9");

        jTextField12.setText("SEVİYE PUAN");

        jLabel10.setText("jLabel10");

        javax.swing.GroupLayout jpnlpc1ozellikLayout = new javax.swing.GroupLayout(jpnlpc1ozellik);
        jpnlpc1ozellik.setLayout(jpnlpc1ozellikLayout);
        jpnlpc1ozellikLayout.setHorizontalGroup(
            jpnlpc1ozellikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlpc1ozellikLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlpc1ozellikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpnlpc1ozellikLayout.createSequentialGroup()
                        .addGroup(jpnlpc1ozellikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpnlpc1ozellikLayout.setVerticalGroup(
            jpnlpc1ozellikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlpc1ozellikLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setToolTipText("");

        jTextField9.setText("PC2 NESNE ÖZELLİĞİ");

        jTextField13.setText("İSİM");

        jLabel11.setText("jLabel11");

        jTextField14.setText("DAYANIKLILIK");

        jLabel12.setText("jLabel12");

        jTextField15.setText("SEVİYE PUAN");

        jLabel13.setText("jLabel13");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField15, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jButton2.setText("PC1 DESTE OLUŞTUR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("PC2 DESTE OLUŞTUR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelSavasLayout = new javax.swing.GroupLayout(jpanelSavas);
        jpanelSavas.setLayout(jpanelSavasLayout);
        jpanelSavasLayout.setHorizontalGroup(
            jpanelSavasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelSavasLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpanelSavasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelSavasLayout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpanelSavasLayout.createSequentialGroup()
                        .addComponent(jpnlpc1ozellik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jpanelSavasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpanelSavasLayout.createSequentialGroup()
                                .addComponent(jbtnpc1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jbtnpc2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(29, 29, 29))
        );
        jpanelSavasLayout.setVerticalGroup(
            jpanelSavasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelSavasLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jpanelSavasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jpanelSavasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelSavasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbtnpc1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnpc2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpnlpc1ozellik, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelSkor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanelSavas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelSkor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanelSavas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnpc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnpc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnpc1ActionPerformed

    private void jbtnpc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnpc2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnpc2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if(d1==true && d2==true)
       {
        Object a = bilgisayar1.nesneSec(bilgisayar1.nesneListesi);
        Object b = bilgisayar2.nesneSec(bilgisayar2.nesneListesi);
       if(a instanceof Tas)
       {
       jbtnpc1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tas.png")));
       }
      if(a instanceof Kagit)
       {
       jbtnpc1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kagit.png")));
       }
       if(a instanceof Makas)
       {
       jbtnpc1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/makas.png")));
       }
        if(a instanceof AgirTas)
       {
       jbtnpc1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agirtas.png")));
       }
          if(a instanceof UstaMakas)
       {
       jbtnpc1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agirmakas.png")));
       }
        if(a instanceof OzelKagit)
       {
       jbtnpc1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/a.png")));
       }
        if(b instanceof Tas)
       {
       jbtnpc2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tas.png")));
       }
      if(b instanceof Kagit)
       {
       jbtnpc2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kagit.png")));
       }
       if(b instanceof Makas)
       {
       jbtnpc2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/makas.png")));
       }
       if(b instanceof AgirTas)
       {
       jbtnpc2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agirtas.png")));
       }
         if(b instanceof UstaMakas)
       {
       jbtnpc2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agirmakas.png")));
       }
        if(b instanceof OzelKagit)
       {
       jbtnpc2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/a.png")));
       }
       
            String s1=String.valueOf(b);
            jLabel11.setText(s1);
            String s2=String.valueOf(a);
            jLabel8.setText(s2);
        battle(a, b,j);
         j++;
        jLabel7.setText(Integer.toString(j)); 
        if(j==20)
        {
            jButton1.setEnabled(false);
            jPanelSonuc.setVisible(true);
        
        
           double x1=bilgisayar1.netSkorugor();       
           jLabel1.setText(Double.toString(x1));
           double y1=bilgisayar2.netSkorugor();
           jLabel2.setText(Double.toString(y1));
           if(x1>y1)
           {
               jLabel3.setText("BİLGİSAYAR1 KAZANDI");
           }
           else if(y1>x1)
           {
               jLabel3.setText("BİLGİSAYAR2 KAZANDI");
           }
           else
           {
               jLabel3.setText("BERABERE");
           }
       }
        
        
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        BnesneUret(list2);
        bilgisayar2.nesneListesi=list2;
        jButton3.setEnabled(false);
        d2=true;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        BnesneUret(list1);
        bilgisayar1.nesneListesi=list1;
        jButton2.setEnabled(false);
        d1=true;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
              
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

 
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JBilgisayar().setVisible(true);
            }
        });
    }
       public void BnesneUret(ArrayList<Object> list) {

        for (int j = 0; j < 5; j++) {
            Random r = new Random();
            int rInt = r.nextInt(3);
            if (rInt == 0) {
                list.add(new Tas());
            }
            if (rInt == 1) {
                list.add(new Makas());
            } else if (rInt == 2) {
                list.add(new Kagit());
            }
        }

    }

       
        public void battle(Object a,Object b,int j) {
            System.out.println("j:"+j);
            if(j<5)
            {
                if (!((Nesne) a).isNesneKullanildiMi()) {
                    ((Nesne) a).setNesneKullanildiMi(true);
                } else {
                    while (((Nesne) a).isNesneKullanildiMi()) {
                        a = bilgisayar1.nesneSec(bilgisayar1.nesneListesi);
                    }
                    ((Nesne) a).setNesneKullanildiMi(true);
                }

                if (!((Nesne) b).isNesneKullanildiMi()) {
                    ((Nesne) b).setNesneKullanildiMi(true);
                } else {
                    while (((Nesne) b).isNesneKullanildiMi()) {
                        b = bilgisayar2.nesneSec(bilgisayar2.nesneListesi);
                    }
                    ((Nesne) b).setNesneKullanildiMi(true);
                } 
            }
            
         

 

        if (a instanceof Tas) {
            if (b instanceof Kagit) {
                ((Tas) a).nesnePuaniGoster(((Tas) a).durumGuncelle(((Tas) a).etkiHesapla(b)));
                ((Kagit) b).nesnePuaniGoster(((Kagit) b).durumGuncelle(((Kagit) b).etkiHesapla(a)));

                bilgisayar1.skorGoster(((Kagit) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((Tas) a).etkiHesapla(b));

                if (((Tas) a).getDayaniklilik() <= 20) {
                    ((Kagit) b).setSeviyePuani(((Kagit) b).getSeviyePuani() + 20);
                    System.out.println("Kagıt son seviye puanı:" + ((Kagit) b).getSeviyePuani());
                    System.out.println("Tas son seviye puanı:" + ((Tas) a).getSeviyePuani());
                    if (((Kagit) b).getSeviyePuani() >= 30) {
                        bilgisayar2.nesneListesi.add(new OzelKagit(2.0, ((Kagit) b).getNufuz(), ((Kagit) b).getDayaniklilik(), ((Kagit) b).getSeviyePuani(), ((Kagit) b).getName()));
                        bilgisayar2.nesneListesi.remove(b);
                        
                    }
                }
                double x1=bilgisayar1.netSkorugor();       
                jLabel6.setText(Double.toString(x1));
                double y1=bilgisayar2.netSkorugor();
                jLabel5.setText(Double.toString(y1));
                        
            }
         else   if (b instanceof Tas) {

                ((Tas) a).nesnePuaniGoster(((Tas) a).durumGuncelle(((Tas) a).etkiHesapla(b)));
                ((Tas) b).nesnePuaniGoster(((Tas) b).durumGuncelle(((Tas) b).etkiHesapla(a)));

                System.out.println("Etki yok , berabere");

            }
         else   if (b instanceof Makas) {

                bilgisayar1.skorGoster(((Tas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Makas) b).etkiHesapla(a));

                ((Tas) a).nesnePuaniGoster(((Tas) a).durumGuncelle(((Tas) a).etkiHesapla(b)));
                ((Makas) b).nesnePuaniGoster(((Makas) b).durumGuncelle(((Makas) b).etkiHesapla(a)));
                if (((Makas) b).getDayaniklilik() <= 20) {
                    ((Tas) a).setSeviyePuani(((Tas) a).getSeviyePuani() + 20);
                    System.out.println("Tas son seviye puanı:" + ((Tas) a).getSeviyePuani());
                    System.out.println("Makas son seviye puanı:" + ((Makas) b).getSeviyePuani());
                    if (((Tas) a).getSeviyePuani() >= 30) {
                        bilgisayar1.nesneListesi.add(new AgirTas());
                        bilgisayar1.nesneListesi.remove(a);
                    }
                }
               double x1=bilgisayar1.netSkorugor();       
                jLabel6.setText(Double.toString(x1));
                double y1=bilgisayar2.netSkorugor();
                jLabel5.setText(Double.toString(y1));
            }
        }

       else if (a instanceof Makas) {
            if (b instanceof Kagit) {
                ((Makas) a).nesnePuaniGoster(((Makas) a).durumGuncelle(((Makas) a).etkiHesapla(b)));
                ((Kagit) b).nesnePuaniGoster(((Kagit) b).durumGuncelle(((Kagit) b).etkiHesapla(a)));

                bilgisayar1.skorGoster(((Makas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Kagit) b).etkiHesapla(a));
                if (((Kagit) b).getDayaniklilik() <= 20) {
                    ((Makas) a).setSeviyePuani(((Makas) a).getSeviyePuani() + 20);
                    System.out.println("Makas son seviye puanı:" + ((Makas) a).getSeviyePuani());
                    System.out.println("Kagıt son seviye puanı:" + ((Kagit) b).getSeviyePuani());
                    if (((Makas) a).getSeviyePuani() >= 30) {
                        bilgisayar1.nesneListesi.add(new UstaMakas());
                        bilgisayar1.nesneListesi.remove(a);

                    }
                }
                double x1=bilgisayar1.netSkorugor();       
                jLabel6.setText(Double.toString(x1));
                double y1=bilgisayar2.netSkorugor();
                jLabel5.setText(Double.toString(y1));

            }

          else  if (b instanceof Tas) {
                ((Makas) a).nesnePuaniGoster(((Makas) a).durumGuncelle(((Makas) a).etkiHesapla(b)));
                ((Tas) b).nesnePuaniGoster(((Tas) b).durumGuncelle(((Tas) b).etkiHesapla(a)));

                bilgisayar1.skorGoster(((Makas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Tas) b).etkiHesapla(a));
                if (((Makas) a).getDayaniklilik() <= 20) {
                    ((Tas) b).setSeviyePuani(((Tas) b).getSeviyePuani() + 20);
                    System.out.println("Tas son seviye puanı:" + ((Tas) b).getSeviyePuani());
                    System.out.println("Makas son seviye puanı:" + ((Makas) a).getSeviyePuani());
                    if (((Tas) b).getSeviyePuani() >= 30) {
                        bilgisayar2.nesneListesi.add(new AgirTas());
                        bilgisayar2.nesneListesi.remove(b);
                        System.out.println(bilgisayar2.nesneListesi);

                    }
                }
              double x1=bilgisayar1.netSkorugor();       
                jLabel6.setText(Double.toString(x1));
                double y1=bilgisayar2.netSkorugor();
                jLabel5.setText(Double.toString(y1));

            }
          else  if (b instanceof Makas) {
                ((Makas) a).nesnePuaniGoster(((Makas) a).durumGuncelle(((Makas) a).etkiHesapla(b)));
                ((Makas) b).nesnePuaniGoster(((Makas) b).durumGuncelle(((Makas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((Makas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Makas) b).etkiHesapla(a));
                System.out.println("Etki yok ,berabere");
            }
        }

      else  if (a instanceof Kagit) {
            if (b instanceof Kagit) {
                ((Kagit) a).nesnePuaniGoster(((Kagit) a).durumGuncelle(((Kagit) a).etkiHesapla(b)));
                ((Kagit) b).nesnePuaniGoster(((Kagit) b).durumGuncelle(((Kagit) b).etkiHesapla(a)));

                System.out.println("Etki yok,berabere");
            }

          else  if (b instanceof Tas) {
                ((Kagit) a).nesnePuaniGoster(((Kagit) a).durumGuncelle(((Kagit) a).etkiHesapla(b)));
                ((Tas) b).nesnePuaniGoster(((Tas) b).durumGuncelle(((Tas) b).etkiHesapla(a)));

                bilgisayar1.skorGoster(((Kagit) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Tas) b).etkiHesapla(a));
                if (((Tas) b).getDayaniklilik() <= 20) {
                    ((Kagit) a).setSeviyePuani(((Kagit) a).getSeviyePuani() + 20);
                    System.out.println("Kagıt son seviye puanı:" + ((Kagit) a).getSeviyePuani());
                    System.out.println("Tas son seviye puanı:" + ((Tas) b).getSeviyePuani());
                    if (((Kagit) a).getSeviyePuani() >= 30) {
                        bilgisayar1.nesneListesi.add(new OzelKagit());
                        bilgisayar1.nesneListesi.remove(a);
                        System.out.println(bilgisayar1.nesneListesi);

                    }

                }
                double x1=bilgisayar1.netSkorugor();       
                jLabel6.setText(Double.toString(x1));
                double y1=bilgisayar2.netSkorugor();
                jLabel5.setText(Double.toString(y1));

            }
          else  if (b instanceof Makas) {
                ((Kagit) a).nesnePuaniGoster(((Kagit) a).durumGuncelle(((Kagit) a).etkiHesapla(b)));
                ((Makas) b).nesnePuaniGoster(((Makas) b).durumGuncelle(((Makas) b).etkiHesapla(a)));

                bilgisayar1.skorGoster(((Kagit) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Makas) b).etkiHesapla(a));

                if (((Kagit) a).getDayaniklilik() <= 20) {
                    ((Makas) b).setSeviyePuani(((Makas) b).getSeviyePuani() + 20);
                    System.out.println("Makas son seviye puanı:" + ((Makas) b).getSeviyePuani());
                    System.out.println("Kagıt son seviye puanı:" + ((Kagit) a).getSeviyePuani());
                    if (((Makas) b).getSeviyePuani() >= 30) {
                        bilgisayar2.nesneListesi.add(new UstaMakas());
                        bilgisayar2.nesneListesi.remove(b);

                    }
                }
                double x1=bilgisayar1.netSkorugor();       
                jLabel6.setText(Double.toString(x1));
                double y1=bilgisayar2.netSkorugor();
                jLabel5.setText(Double.toString(y1));
            }

        }

      else  if (a instanceof OzelKagit) {
            if (b instanceof Kagit) {
                System.out.println("Etki yok .berabere ");
            }

           else  if (b instanceof OzelKagit) {
                System.out.println("Etki yok .berabere ");
            }
            else if (b instanceof UstaMakas) {
                ((UstaMakas) b).nesnePuaniGoster(((UstaMakas) b).durumGuncelle(((UstaMakas) b).etkiHesapla(a)));
                ((OzelKagit) a).nesnePuaniGoster(((OzelKagit) a).durumGuncelle(((OzelKagit) a).etkiHesapla(b)));
                bilgisayar1.skorGoster(((UstaMakas) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((OzelKagit) a).etkiHesapla(b));
                if (((OzelKagit) b).getDayaniklilik() <= 20) {
                    ((UstaMakas) a).setSeviyePuani(((UstaMakas) a).getSeviyePuani() + 20);
                    System.out.println("  Usta Makas son seviye puanı:" + ((UstaMakas) b).getSeviyePuani());
                    System.out.println(" Ozel Kagit son seviye puanı:" + ((OzelKagit) a).getSeviyePuani());
                }
            }

          else  if (b instanceof Makas) {
                ((Makas) b).nesnePuaniGoster(((Makas) b).durumGuncelle(((Makas) b).etkiHesapla(a)));
                ((OzelKagit) a).nesnePuaniGoster(((OzelKagit) a).durumGuncelle(((OzelKagit) a).etkiHesapla(b)));
                bilgisayar1.skorGoster(((Makas) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((OzelKagit) a).etkiHesapla(b));
                if (((OzelKagit) a).getDayaniklilik() <= 20) {
                    ((Makas) b).setSeviyePuani(((Makas) a).getSeviyePuani() + 20);
                    System.out.println("  Usta Makas son seviye puanı:" + ((Makas) b).getSeviyePuani());
                    System.out.println(" Ozel Kagit son seviye puanı:" + ((OzelKagit) a).getSeviyePuani());
                }
            }

          else  if (b instanceof Tas) {
                ((Tas) b).nesnePuaniGoster(((Tas) b).durumGuncelle(((Tas) b).etkiHesapla(a)));
                ((OzelKagit) a).nesnePuaniGoster(((OzelKagit) a).durumGuncelle(((OzelKagit) a).etkiHesapla(b)));
                bilgisayar1.skorGoster(((Tas) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((OzelKagit) a).etkiHesapla(b));
                if (((Tas) b).getDayaniklilik() <= 20) {
                    ((OzelKagit) a).setSeviyePuani(((OzelKagit) a).getSeviyePuani() + 20);
                    System.out.println("  Tas son seviye puanı:" + ((Tas) b).getSeviyePuani());
                    System.out.println(" Ozel Kagit son seviye puanı:" + ((OzelKagit) a).getSeviyePuani());
                }
            }

          else  if (b instanceof AgirTas) {
                ((AgirTas) b).nesnePuaniGoster(((AgirTas) b).durumGuncelle(((AgirTas) b).etkiHesapla(a)));
                ((OzelKagit) a).nesnePuaniGoster(((OzelKagit) a).durumGuncelle(((OzelKagit) a).etkiHesapla(b)));
                bilgisayar1.skorGoster(((AgirTas) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((OzelKagit) a).etkiHesapla(b));
                if (((AgirTas) b).getDayaniklilik() <= 20) {
                    ((OzelKagit) a).setSeviyePuani(((OzelKagit) a).getSeviyePuani() + 20);
                    System.out.println(" Agir Tas son seviye puanı:" + ((AgirTas) b).getSeviyePuani());
                    System.out.println(" Ozel Kagit son seviye puanı:" + ((OzelKagit) a).getSeviyePuani());
                }
            }

        }

        ////////////////////////////////////////
      else  if (b instanceof OzelKagit) {
            if (a instanceof Tas) {
                ((Tas) a).nesnePuaniGoster(((Tas) a).durumGuncelle(((Tas) a).etkiHesapla(b)));
                ((OzelKagit) b).nesnePuaniGoster(((OzelKagit) b).durumGuncelle(((OzelKagit) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((OzelKagit) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((Tas) a).etkiHesapla(b));
                if (((Tas) a).getDayaniklilik() <= 20) {
                    ((OzelKagit) b).setSeviyePuani(((OzelKagit) b).getSeviyePuani() + 20);
                    System.out.println(" Ozel Kagıt son seviye puanı:" + ((OzelKagit) b).getSeviyePuani());
                    System.out.println("Tas son seviye puanı:" + ((Tas) a).getSeviyePuani());
                }

              else  if (a instanceof AgirTas) {
                    ((AgirTas) a).nesnePuaniGoster(((AgirTas) a).durumGuncelle(((AgirTas) a).etkiHesapla(b)));
                    ((OzelKagit) b).nesnePuaniGoster(((OzelKagit) b).durumGuncelle(((OzelKagit) b).etkiHesapla(a)));
                    bilgisayar1.skorGoster(((OzelKagit) b).etkiHesapla(a));
                    bilgisayar2.skorGoster(((AgirTas) a).etkiHesapla(b));
                    if (((AgirTas) a).getDayaniklilik() <= 20) {
                        ((OzelKagit) b).setSeviyePuani(((OzelKagit) b).getSeviyePuani() + 20);
                        System.out.println(" Ozel Kagıt son seviye puanı:" + ((OzelKagit) b).getSeviyePuani());
                        System.out.println(" Agir Tas son seviye puanı:" + ((AgirTas) a).getSeviyePuani());
                    }

                }

              else  if (a instanceof Kagit) {
                    ((Kagit) a).nesnePuaniGoster(((Kagit) a).durumGuncelle(((Kagit) a).etkiHesapla(b)));
                    ((OzelKagit) b).nesnePuaniGoster(((OzelKagit) b).durumGuncelle(((OzelKagit) b).etkiHesapla(a)));
                    bilgisayar1.skorGoster(((OzelKagit) b).etkiHesapla(a));
                    bilgisayar2.skorGoster(((Kagit) a).etkiHesapla(b));
                    System.out.println("Etki yok , berabere");

                }

             else   if (a instanceof OzelKagit) {
                    ((OzelKagit) a).nesnePuaniGoster(((OzelKagit) a).durumGuncelle(((OzelKagit) a).etkiHesapla(b)));
                    ((OzelKagit) b).nesnePuaniGoster(((OzelKagit) b).durumGuncelle(((OzelKagit) b).etkiHesapla(a)));
                    bilgisayar1.skorGoster(((OzelKagit) b).etkiHesapla(a));
                    bilgisayar2.skorGoster(((OzelKagit) a).etkiHesapla(b));
                    System.out.println("Etki yok , berabere");

                }

              else  if (a instanceof Makas) {
                    ((Makas) a).nesnePuaniGoster(((Makas) a).durumGuncelle(((Makas) a).etkiHesapla(b)));
                    ((OzelKagit) b).nesnePuaniGoster(((OzelKagit) b).durumGuncelle(((OzelKagit) b).etkiHesapla(a)));
                    bilgisayar1.skorGoster(((OzelKagit) b).etkiHesapla(a));
                    bilgisayar2.skorGoster(((Makas) a).etkiHesapla(b));
                    if (((OzelKagit) a).getDayaniklilik() <= 20) {
                        ((Makas) b).setSeviyePuani(((Makas) b).getSeviyePuani() + 20);
                        System.out.println(" Ozel Kagıt son seviye puanı:" + ((OzelKagit) b).getSeviyePuani());
                        System.out.println("Makas son seviye puanı:" + ((Makas) a).getSeviyePuani());
                    }

                }

             else   if (a instanceof UstaMakas) {
                    ((UstaMakas) a).nesnePuaniGoster(((UstaMakas) a).durumGuncelle(((UstaMakas) a).etkiHesapla(b)));
                    ((OzelKagit) b).nesnePuaniGoster(((OzelKagit) b).durumGuncelle(((OzelKagit) b).etkiHesapla(a)));
                    bilgisayar1.skorGoster(((OzelKagit) b).etkiHesapla(a));
                    bilgisayar2.skorGoster(((UstaMakas) a).etkiHesapla(b));
                    if (((OzelKagit) a).getDayaniklilik() <= 20) {
                        ((UstaMakas) b).setSeviyePuani(((UstaMakas) b).getSeviyePuani() + 20);
                        System.out.println(" Ozel Kagıt son seviye puanı:" + ((OzelKagit) b).getSeviyePuani());
                        System.out.println("Usta Makas son seviye puanı:" + ((UstaMakas) a).getSeviyePuani());
                    }
                }
            }
        }

        //////////////////////////////////////
      else  if (a instanceof AgirTas) {
            if (b instanceof Tas) {
                bilgisayar1.skorGoster(((AgirTas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Tas) b).etkiHesapla(a));
                ((AgirTas) a).nesnePuaniGoster(((AgirTas) a).durumGuncelle(((AgirTas) a).etkiHesapla(b)));
                ((Tas) b).nesnePuaniGoster(((Tas) b).durumGuncelle(((Tas) b).etkiHesapla(a)));
                System.out.println("Beraber ");
            }
          else  if (b instanceof AgirTas) {
                bilgisayar1.skorGoster(((AgirTas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((AgirTas) b).etkiHesapla(a));
                ((AgirTas) a).nesnePuaniGoster(((AgirTas) a).durumGuncelle(((AgirTas) a).etkiHesapla(b)));
                ((AgirTas) b).nesnePuaniGoster(((AgirTas) b).durumGuncelle(((AgirTas) b).etkiHesapla(a)));
                System.out.println("Beraber ");
            }

         else   if (b instanceof Makas) {
                bilgisayar1.skorGoster(((AgirTas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Makas) b).etkiHesapla(a));
                ((AgirTas) a).nesnePuaniGoster(((AgirTas) a).durumGuncelle(((AgirTas) a).etkiHesapla(b)));
                ((Makas) b).nesnePuaniGoster(((Makas) b).durumGuncelle(((Makas) b).etkiHesapla(a)));
                if (((Makas) b).getDayaniklilik() <= 20) {
                    ((AgirTas) a).setSeviyePuani(((AgirTas) a).getSeviyePuani() + 20);
                    System.out.println("Agir Tas son seviye puanı:" + ((AgirTas) a).getSeviyePuani());
                    System.out.println("Makas son seviye puanı:" + ((Makas) b).getSeviyePuani());
                }
            }

         else   if (b instanceof UstaMakas) {
                bilgisayar1.skorGoster(((AgirTas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((UstaMakas) b).etkiHesapla(a));
                ((AgirTas) a).nesnePuaniGoster(((AgirTas) a).durumGuncelle(((AgirTas) a).etkiHesapla(b)));
                ((UstaMakas) b).nesnePuaniGoster(((UstaMakas) b).durumGuncelle(((UstaMakas) b).etkiHesapla(a)));
                if (((UstaMakas) b).getDayaniklilik() <= 20) {
                    ((AgirTas) a).setSeviyePuani(((AgirTas) a).getSeviyePuani() + 20);
                    System.out.println(" Agir Tas son seviye puanı:" + ((AgirTas) a).getSeviyePuani());
                    System.out.println("Usta Makas son seviye puanı:" + ((Makas) a).getSeviyePuani());
                }
            }

         else   if (b instanceof Kagit) {
                bilgisayar1.skorGoster(((AgirTas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Kagit) b).etkiHesapla(a));
                ((AgirTas) a).nesnePuaniGoster(((AgirTas) a).durumGuncelle(((AgirTas) a).etkiHesapla(b)));
                ((Kagit) b).nesnePuaniGoster(((Kagit) b).durumGuncelle(((Kagit) b).etkiHesapla(a)));
                if (((AgirTas) a).getDayaniklilik() <= 20) {
                    ((Kagit) b).setSeviyePuani(((Kagit) b).getSeviyePuani() + 20);
                    System.out.println(" Agir Tas son seviye puanı:" + ((AgirTas) a).getSeviyePuani());
                    System.out.println("Kagit son seviye puanı:" + ((Kagit) b).getSeviyePuani());
                }
            }

         else   if (b instanceof OzelKagit) {
                bilgisayar1.skorGoster(((AgirTas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((OzelKagit) b).etkiHesapla(a));
                ((AgirTas) a).nesnePuaniGoster(((AgirTas) a).durumGuncelle(((AgirTas) a).etkiHesapla(b)));
                ((OzelKagit) b).nesnePuaniGoster(((OzelKagit) b).durumGuncelle(((OzelKagit) b).etkiHesapla(a)));
                if (((AgirTas) a).getDayaniklilik() <= 20) {
                    ((OzelKagit) b).setSeviyePuani(((OzelKagit) b).getSeviyePuani() + 20);
                    System.out.println(" Agir Tas son seviye puanı:" + ((AgirTas) a).getSeviyePuani());
                    System.out.println(" Ozel Kagit son seviye puanı:" + ((OzelKagit) b).getSeviyePuani());
                }
            }

        }
        ////////////////////////////////////////////
     else   if (b instanceof AgirTas) {
            if (a instanceof OzelKagit) {
                ((OzelKagit) a).nesnePuaniGoster(((OzelKagit) a).durumGuncelle(((OzelKagit) a).etkiHesapla(b)));
                ((AgirTas) b).nesnePuaniGoster(((AgirTas) b).durumGuncelle(((AgirTas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((OzelKagit) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((AgirTas) b).etkiHesapla(a));
                if (((AgirTas) b).getDayaniklilik() <= 20) {
                    ((OzelKagit) a).setSeviyePuani(((OzelKagit) a).getSeviyePuani() + 20);
                    System.out.println(" Ozel Kagit son seviye puanı:" + ((OzelKagit) a).getSeviyePuani());
                    System.out.println(" Agir Tas son seviye puanı:" + ((AgirTas) b).getSeviyePuani());
                }
            }

        else    if (a instanceof Kagit) {
                ((Kagit) a).nesnePuaniGoster(((Kagit) a).durumGuncelle(((Kagit) a).etkiHesapla(b)));
                ((AgirTas) b).nesnePuaniGoster(((AgirTas) b).durumGuncelle(((AgirTas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((Kagit) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((AgirTas) b).etkiHesapla(a));
                if (((AgirTas) b).getDayaniklilik() <= 20) {
                    ((Kagit) a).setSeviyePuani(((Kagit) a).getSeviyePuani() + 20);
                    System.out.println("  Kagit son seviye puanı:" + ((Kagit) a).getSeviyePuani());
                    System.out.println(" Agir Tas son seviye puanı:" + ((AgirTas) b).getSeviyePuani());
                }
            }

          else  if (a instanceof Makas) {
                ((Makas) a).nesnePuaniGoster(((Makas) a).durumGuncelle(((Makas) a).etkiHesapla(b)));
                ((AgirTas) b).nesnePuaniGoster(((AgirTas) b).durumGuncelle(((AgirTas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((Makas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((AgirTas) b).etkiHesapla(a));
                if (((Makas) a).getDayaniklilik() <= 20) {
                    ((AgirTas) b).setSeviyePuani(((AgirTas) b).getSeviyePuani() + 20);
                    System.out.println("  Makas son seviye puanı:" + ((Makas) a).getSeviyePuani());
                    System.out.println(" Agir Tas son seviye puanı:" + ((AgirTas) b).getSeviyePuani());
                }
            }
         else   if (a instanceof UstaMakas) {
                ((UstaMakas) a).nesnePuaniGoster(((UstaMakas) a).durumGuncelle(((UstaMakas) a).etkiHesapla(b)));
                ((AgirTas) b).nesnePuaniGoster(((AgirTas) b).durumGuncelle(((AgirTas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((UstaMakas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((AgirTas) b).etkiHesapla(a));
                if (((UstaMakas) a).getDayaniklilik() <= 20) {
                    ((AgirTas) b).setSeviyePuani(((AgirTas) b).getSeviyePuani() + 20);
                    System.out.println("  Usta Makas son seviye puanı:" + ((UstaMakas) a).getSeviyePuani());
                    System.out.println(" Agir Tas son seviye puanı:" + ((AgirTas) b).getSeviyePuani());
                }
            }

         else   if (a instanceof Tas) {
                ((Tas) a).nesnePuaniGoster(((Tas) a).durumGuncelle(((Tas) a).etkiHesapla(b)));
                ((AgirTas) b).nesnePuaniGoster(((AgirTas) b).durumGuncelle(((AgirTas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((Tas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((AgirTas) b).etkiHesapla(a));
                System.out.println("Durum berabere ");
            }

         else   if (a instanceof AgirTas) {
                ((AgirTas) a).nesnePuaniGoster(((AgirTas) a).durumGuncelle(((AgirTas) a).etkiHesapla(b)));
                ((AgirTas) b).nesnePuaniGoster(((AgirTas) b).durumGuncelle(((AgirTas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((AgirTas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((AgirTas) b).etkiHesapla(a));
                System.out.println("Etki yok ,berabere");
            }

        }
        /////////////////////////////////
      else  if (a instanceof UstaMakas) {
            if (b instanceof UstaMakas) {
                ((UstaMakas) a).nesnePuaniGoster(((UstaMakas) a).durumGuncelle(((UstaMakas) a).etkiHesapla(b)));
                ((UstaMakas) b).nesnePuaniGoster(((UstaMakas) b).durumGuncelle(((UstaMakas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((UstaMakas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((UstaMakas) b).etkiHesapla(a));
                System.out.println("Beraber ");
            }

          else  if (b instanceof Makas) {
                ((UstaMakas) a).nesnePuaniGoster(((UstaMakas) a).durumGuncelle(((UstaMakas) a).etkiHesapla(b)));
                ((Makas) b).nesnePuaniGoster(((Makas) b).durumGuncelle(((Makas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((UstaMakas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Makas) b).etkiHesapla(a));
                System.out.println("Beraber ");
            }

          else  if (b instanceof Tas) {
                ((UstaMakas) a).nesnePuaniGoster(((UstaMakas) a).durumGuncelle(((UstaMakas) a).etkiHesapla(b)));
                ((Tas) b).nesnePuaniGoster(((Tas) b).durumGuncelle(((Tas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((UstaMakas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Tas) b).etkiHesapla(a));
                if (((UstaMakas) a).getDayaniklilik() <= 20) {
                    ((Tas) b).setSeviyePuani(((Tas) b).getSeviyePuani() + 20);
                    System.out.println("  Tas son seviye puanı:" + ((Tas) b).getSeviyePuani());
                    System.out.println(" Usta Makas son seviye puanı:" + ((UstaMakas) a).getSeviyePuani());
                }
            }

          else  if (b instanceof AgirTas) {
                ((UstaMakas) a).nesnePuaniGoster(((UstaMakas) a).durumGuncelle(((UstaMakas) a).etkiHesapla(b)));
                ((AgirTas) b).nesnePuaniGoster(((AgirTas) b).durumGuncelle(((AgirTas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((UstaMakas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((AgirTas) b).etkiHesapla(a));
                if (((UstaMakas) b).getDayaniklilik() <= 20) {
                    ((AgirTas) b).setSeviyePuani(((AgirTas) b).getSeviyePuani() + 20);
                    System.out.println("Agir Tas son seviye puanı:" + ((AgirTas) b).getSeviyePuani());
                    System.out.println(" Usta Makas son seviye puanı:" + ((UstaMakas) a).getSeviyePuani());
                }
            }

          else  if (b instanceof Kagit) {
                ((UstaMakas) a).nesnePuaniGoster(((UstaMakas) a).durumGuncelle(((UstaMakas) a).etkiHesapla(b)));
                ((Kagit) b).nesnePuaniGoster(((Kagit) b).durumGuncelle(((Kagit) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((UstaMakas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Kagit) b).etkiHesapla(a));
                if (((Kagit) b).getDayaniklilik() <= 20) {
                    ((UstaMakas) a).setSeviyePuani(((UstaMakas) a).getSeviyePuani() + 20);
                    System.out.println("Kagit son seviye puanı:" + ((Kagit) b).getSeviyePuani());
                    System.out.println(" Usta Makas son seviye puanı:" + ((UstaMakas) a).getSeviyePuani());
                }
            }

         else   if (b instanceof OzelKagit) {
                ((UstaMakas) a).nesnePuaniGoster(((UstaMakas) a).durumGuncelle(((UstaMakas) a).etkiHesapla(b)));
                ((OzelKagit) b).nesnePuaniGoster(((OzelKagit) b).durumGuncelle(((OzelKagit) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((UstaMakas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((OzelKagit) b).etkiHesapla(a));
                if (((OzelKagit) b).getDayaniklilik() <= 20) {
                    ((UstaMakas) a).setSeviyePuani(((UstaMakas) a).getSeviyePuani() + 20);
                    System.out.println(" Ozel Kagit son seviye puanı:" + ((OzelKagit) b).getSeviyePuani());
                    System.out.println(" Usta Makas son seviye puanı:" + ((UstaMakas) a).getSeviyePuani());
                }
            }
        }
        ///////////////////////////////////////

     else   if (b instanceof UstaMakas) {
            if (a instanceof UstaMakas) {
                ((UstaMakas) b).nesnePuaniGoster(((UstaMakas) b).durumGuncelle(((UstaMakas) b).etkiHesapla(a)));
                ((UstaMakas) a).nesnePuaniGoster(((UstaMakas) a).durumGuncelle(((UstaMakas) a).etkiHesapla(b)));
                bilgisayar1.skorGoster(((UstaMakas) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((UstaMakas) a).etkiHesapla(b));
                System.out.println("Beraber ");
            }

         else   if (a instanceof Makas) {
                ((UstaMakas) b).nesnePuaniGoster(((UstaMakas) b).durumGuncelle(((UstaMakas) b).etkiHesapla(a)));
                ((Makas) a).nesnePuaniGoster(((Makas) a).durumGuncelle(((Makas) a).etkiHesapla(b)));
                bilgisayar1.skorGoster(((UstaMakas) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((Makas) a).etkiHesapla(b));
                System.out.println("Beraber ");
            }

         else   if (a instanceof Tas) {
                ((UstaMakas) b).nesnePuaniGoster(((UstaMakas) b).durumGuncelle(((UstaMakas) b).etkiHesapla(a)));
                ((Tas) a).nesnePuaniGoster(((Tas) a).durumGuncelle(((Tas) a).etkiHesapla(b)));
                bilgisayar1.skorGoster(((UstaMakas) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((Tas) a).etkiHesapla(b));
                if (((UstaMakas) b).getDayaniklilik() <= 20) {
                    ((Tas) a).setSeviyePuani(((Tas) a).getSeviyePuani() + 20);
                    System.out.println("  Tas son seviye puanı:" + ((Tas) a).getSeviyePuani());
                    System.out.println(" Usta Makas son seviye puanı:" + ((UstaMakas) b).getSeviyePuani());
                }
            }

          else  if (a instanceof AgirTas) {
                ((UstaMakas) b).nesnePuaniGoster(((UstaMakas) b).durumGuncelle(((UstaMakas) b).etkiHesapla(a)));
                ((AgirTas) a).nesnePuaniGoster(((AgirTas) a).durumGuncelle(((AgirTas) a).etkiHesapla(b)));
                bilgisayar1.skorGoster(((UstaMakas) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((AgirTas) a).etkiHesapla(b));
                if (((UstaMakas) b).getDayaniklilik() <= 20) {
                    ((AgirTas) a).setSeviyePuani(((AgirTas) a).getSeviyePuani() + 20);
                    System.out.println("Agir Tas son seviye puanı:" + ((AgirTas) a).getSeviyePuani());
                    System.out.println(" Usta Makas son seviye puanı:" + ((UstaMakas) b).getSeviyePuani());
                }
            }

         else   if (a instanceof Kagit) {
                ((UstaMakas) b).nesnePuaniGoster(((UstaMakas) b).durumGuncelle(((UstaMakas) b).etkiHesapla(a)));
                ((Kagit) a).nesnePuaniGoster(((Kagit) a).durumGuncelle(((Kagit) a).etkiHesapla(b)));
                bilgisayar1.skorGoster(((UstaMakas) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((Kagit) a).etkiHesapla(b));
                if (((Kagit) a).getDayaniklilik() <= 20) {
                    ((UstaMakas) b).setSeviyePuani(((UstaMakas) b).getSeviyePuani() + 20);
                    System.out.println("Kagit son seviye puanı:" + ((Kagit) a).getSeviyePuani());
                    System.out.println(" Usta Makas son seviye puanı:" + ((UstaMakas) b).getSeviyePuani());
                }
            }

         else   if (a instanceof OzelKagit) {
                ((UstaMakas) b).nesnePuaniGoster(((UstaMakas) b).durumGuncelle(((UstaMakas) b).etkiHesapla(a)));
                ((OzelKagit) a).nesnePuaniGoster(((OzelKagit) a).durumGuncelle(((OzelKagit) a).etkiHesapla(b)));
                bilgisayar1.skorGoster(((UstaMakas) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((OzelKagit) a).etkiHesapla(b));
                if (((OzelKagit) a).getDayaniklilik() <= 20) {
                    ((UstaMakas) b).setSeviyePuani(((UstaMakas) b).getSeviyePuani() + 20);
                    System.out.println(" Ozel Kagit son seviye puanı:" + ((OzelKagit) a).getSeviyePuani());
                    System.out.println(" Usta Makas son seviye puanı:" + ((UstaMakas) b).getSeviyePuani());
                }
            }
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelSkor;
    private javax.swing.JPanel jPanelSonuc;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton jbtnpc1;
    private javax.swing.JButton jbtnpc2;
    private javax.swing.JPanel jpanelSavas;
    private javax.swing.JPanel jpnlpc1ozellik;
    // End of variables declaration//GEN-END:variables
}
