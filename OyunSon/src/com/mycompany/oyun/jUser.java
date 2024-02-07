
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


public class jUser extends javax.swing.JFrame {

    
    
    public jUser() {
        initComponents();
        jPanelVS.setVisible(false);
        jPanelSkor.setVisible(false);
        JPanelSkorGoster.setVisible(false);
        jbtnUsVS.setVisible(false);
        
    }

    Scanner scan = new Scanner(System.in);
    ArrayList<Object> list1 = new ArrayList<Object>(); //bilgisayar
    ArrayList<Object> list3 = new ArrayList<Object>(); //kullanıcı
    Bilgisayar bilgisayar1 = new Bilgisayar();
    Kullanıcı kullanıcı = new Kullanıcı();
    int i=0;
    int count=0;
    int t1=0,t2=0,t3=0,t4=0,t5=0;
    boolean d1=false,d2=false,d3=false,d4=false,d5=false;
    
   
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDeste = new javax.swing.JPanel();
        jLabelNesneSec = new javax.swing.JLabel();
        jbtnNesneTas = new javax.swing.JButton();
        jBtnNesneMakas = new javax.swing.JButton();
        qqq = new javax.swing.JTextField();
        jBtnNesneileri = new javax.swing.JButton();
        jbtnNesneKagit1 = new javax.swing.JButton();
        jtxtFieldtoplamNesne = new javax.swing.JTextField();
        jtxtFieldNesne2 = new javax.swing.JTextField();
        jPanelSkor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSkorUser = new javax.swing.JTextField();
        JPanelSkorGoster = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSonskorKullanici = new javax.swing.JLabel();
        jSonskorPc = new javax.swing.JLabel();
        aa = new javax.swing.JLabel();
        jPanelSonuc = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanelVS = new javax.swing.JPanel();
        jbtnUs2 = new javax.swing.JButton();
        jbtnUs4 = new javax.swing.JButton();
        jbtnUs3 = new javax.swing.JButton();
        jbtnUs5 = new javax.swing.JButton();
        jbtnUs1 = new javax.swing.JButton();
        jbtnPcVs = new javax.swing.JButton();
        jOYNA = new javax.swing.JButton();
        jbtnUsVS = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jbtnPcNesnesec = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelDeste.setBackground(new java.awt.Color(153, 153, 153));

        jLabelNesneSec.setText("                                                                 NESNE SEÇİNİZ");

        jbtnNesneTas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tas.png"))); // NOI18N
        jbtnNesneTas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNesneTasActionPerformed(evt);
            }
        });

        jBtnNesneMakas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/makas.png"))); // NOI18N
        jBtnNesneMakas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNesneMakasActionPerformed(evt);
            }
        });

        qqq.setText("Toplam nesne sayısı:");
        qqq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qqqActionPerformed(evt);
            }
        });

        jBtnNesneileri.setText("İLERİ");
        jBtnNesneileri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNesneileriActionPerformed(evt);
            }
        });

        jbtnNesneKagit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kagit.png"))); // NOI18N
        jbtnNesneKagit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNesneKagit1ActionPerformed(evt);
            }
        });

        jtxtFieldtoplamNesne.setText("0");
        jtxtFieldtoplamNesne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFieldtoplamNesneActionPerformed(evt);
            }
        });

        jtxtFieldNesne2.setText("                      NESNE YOK");
        jtxtFieldNesne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFieldNesne2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDesteLayout = new javax.swing.GroupLayout(jPanelDeste);
        jPanelDeste.setLayout(jPanelDesteLayout);
        jPanelDesteLayout.setHorizontalGroup(
            jPanelDesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDesteLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelDesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNesneSec, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDesteLayout.createSequentialGroup()
                        .addComponent(jbtnNesneTas, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnNesneKagit1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnNesneMakas, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanelDesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDesteLayout.createSequentialGroup()
                                .addComponent(jtxtFieldNesne2)
                                .addGap(10, 10, 10))
                            .addGroup(jPanelDesteLayout.createSequentialGroup()
                                .addGroup(jPanelDesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBtnNesneileri, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelDesteLayout.createSequentialGroup()
                                        .addComponent(qqq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtxtFieldtoplamNesne, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 9, Short.MAX_VALUE)))))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanelDesteLayout.setVerticalGroup(
            jPanelDesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDesteLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelNesneSec)
                .addGap(18, 18, 18)
                .addGroup(jPanelDesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDesteLayout.createSequentialGroup()
                        .addComponent(jtxtFieldNesne2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qqq, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtFieldtoplamNesne, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnNesneileri, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBtnNesneMakas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnNesneKagit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnNesneTas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        jPanelSkor.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("         SKOR");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("BİLGİSAYAR :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("KULLANICI   :");

        jSkorUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSkorUserActionPerformed(evt);
            }
        });

        JPanelSkorGoster.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setText("     KULLANICI");

        jLabel5.setText("        BİLGİSAYAR");

        aa.setText("          SONUC");

        javax.swing.GroupLayout JPanelSkorGosterLayout = new javax.swing.GroupLayout(JPanelSkorGoster);
        JPanelSkorGoster.setLayout(JPanelSkorGosterLayout);
        JPanelSkorGosterLayout.setHorizontalGroup(
            JPanelSkorGosterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelSkorGosterLayout.createSequentialGroup()
                .addGroup(JPanelSkorGosterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelSkorGosterLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(aa))
                    .addGroup(JPanelSkorGosterLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(JPanelSkorGosterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelSonuc, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JPanelSkorGosterLayout.createSequentialGroup()
                                .addGroup(JPanelSkorGosterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSonskorKullanici, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                                .addGap(31, 31, 31)
                                .addGroup(JPanelSkorGosterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                    .addComponent(jSonskorPc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        JPanelSkorGosterLayout.setVerticalGroup(
            JPanelSkorGosterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelSkorGosterLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(JPanelSkorGosterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelSkorGosterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSonskorKullanici, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jSonskorPc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelSonuc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelSkorLayout = new javax.swing.GroupLayout(jPanelSkor);
        jPanelSkor.setLayout(jPanelSkorLayout);
        jPanelSkorLayout.setHorizontalGroup(
            jPanelSkorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSkorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelSkorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelSkorLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanelSkorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelSkorLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSkorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSkorUser, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(JPanelSkorGoster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanelSkorLayout.setVerticalGroup(
            jPanelSkorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSkorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelSkorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSkorLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelSkorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelSkorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSkorUser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(jPanelSkorLayout.createSequentialGroup()
                        .addComponent(JPanelSkorGoster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        jPanelVS.setBackground(new java.awt.Color(153, 153, 153));

        jbtnUs2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUs2ActionPerformed(evt);
            }
        });

        jbtnUs4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUs4ActionPerformed(evt);
            }
        });

        jbtnUs3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUs3ActionPerformed(evt);
            }
        });

        jbtnUs5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUs5ActionPerformed(evt);
            }
        });

        jbtnUs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUs1ActionPerformed(evt);
            }
        });

        jbtnPcVs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPcVsActionPerformed(evt);
            }
        });

        jOYNA.setText("OYNA");
        jOYNA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOYNAActionPerformed(evt);
            }
        });

        jbtnUsVS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUsVSActionPerformed(evt);
            }
        });

        jLabel6.setText("              BİLGİSAYAR SEÇİMİ:");

        jLabel7.setText("               KULLANICI SEÇİMİ:");

        jbtnPcNesnesec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPcNesnesecActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jTextField1.setText("KULLANICININ SEÇTİĞİ NESNE BİLGİLERİ");

        jLabel10.setText("İSİM:");

        jLabel11.setText("jLabel11");

        jLabel12.setText("DAYANIKLILIK:");

        jLabel13.setText("jLabel13");

        jLabel14.setText("SEVİYE PUANI:");

        jLabel15.setText("jLabel15");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jTextField2.setText("BİLGİSAYARIN SEÇTİĞİ NESNE BİLGİLERİ");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel16.setText("İSİM:");

        jLabel17.setText("jLabel17");

        jLabel18.setText("DAYANIKLILIK:");

        jLabel19.setText("jLabel19");

        jLabel20.setText("SEVİYE PUANI:");

        jLabel21.setText("jLabel21");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelVSLayout = new javax.swing.GroupLayout(jPanelVS);
        jPanelVS.setLayout(jPanelVSLayout);
        jPanelVSLayout.setHorizontalGroup(
            jPanelVSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnPcNesnesec, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVSLayout.createSequentialGroup()
                        .addComponent(jbtnUs1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(jbtnUs2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                        .addComponent(jbtnUs3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175))
                    .addGroup(jPanelVSLayout.createSequentialGroup()
                        .addGroup(jPanelVSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelVSLayout.createSequentialGroup()
                                .addGap(352, 352, 352)
                                .addComponent(jOYNA, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelVSLayout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelVSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelVSLayout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(jbtnUsVS, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(131, 131, 131)
                                        .addComponent(jbtnPcVs, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelVSLayout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 23, Short.MAX_VALUE)))
                .addGroup(jPanelVSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVSLayout.createSequentialGroup()
                        .addComponent(jbtnUs4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138)
                        .addComponent(jbtnUs5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        jPanelVSLayout.setVerticalGroup(
            jPanelVSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVSLayout.createSequentialGroup()
                .addGroup(jPanelVSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVSLayout.createSequentialGroup()
                        .addGroup(jPanelVSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelVSLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanelVSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanelVSLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jbtnPcNesnesec, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanelVSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnUsVS, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnPcVs, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVSLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelVSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)))
                .addComponent(jOYNA, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanelVSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnUs2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnUs3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnUs1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnUs4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnUs5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelVS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanelDeste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelSkor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelDeste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelSkor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelVS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnNesneMakasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNesneMakasActionPerformed
        if(i<5){
        jtxtFieldNesne2.setText("Makas desteye eklendi.");
        list3.add(new Makas());
        i++;
        String yeni1 = String.valueOf(i);
        jtxtFieldtoplamNesne.setText(yeni1);
        
        }
        else
        {
            jtxtFieldNesne2.setText("Deste dolu.");
            jBtnNesneMakas.setEnabled(false);
        }
    }//GEN-LAST:event_jBtnNesneMakasActionPerformed

    private void jBtnNesneileriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNesneileriActionPerformed
        if(i==5)  {    
        jBtnNesneileri.setEnabled(true);
        jPanelDeste.setVisible(false);
        jPanelVS.setVisible(true);
        jPanelSkor.setVisible(true);
        }
        jbtnUs1.doClick();
        jbtnUs2.doClick();
        jbtnUs3.doClick();
        jbtnUs4.doClick();
        jbtnUs5.doClick();
        jbtnPcNesnesec.doClick();
        jbtnPcNesnesec.setVisible(false);
        jbtnUsVS.setVisible(false);
        
    }//GEN-LAST:event_jBtnNesneileriActionPerformed

    private void qqqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qqqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qqqActionPerformed

    private void jbtnNesneTasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNesneTasActionPerformed
  if(i<5){
        jtxtFieldNesne2.setText("Tas desteye eklendi.");
        list3.add(new Tas());
        i++;
         String yeni1 = String.valueOf(i);
        jtxtFieldtoplamNesne.setText(yeni1);
        }
        else
        {
            jbtnNesneTas.setEnabled(false);
            jtxtFieldNesne2.setText("Deste dolu.");
            
        }
    }//GEN-LAST:event_jbtnNesneTasActionPerformed

    private void jbtnNesneKagit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNesneKagit1ActionPerformed
        if(i<5){
        jtxtFieldNesne2.setText("Kağıt desteye eklendi.");
        list3.add(new Kagit());
        i++;
         String yeni1 = String.valueOf(i);
        jtxtFieldtoplamNesne.setText(yeni1);
        }
        else
        {
            jtxtFieldNesne2.setText("Deste dolu.");
            jbtnNesneKagit1.setEnabled(false);
        }
    }//GEN-LAST:event_jbtnNesneKagit1ActionPerformed

    private void jtxtFieldtoplamNesneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFieldtoplamNesneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtFieldtoplamNesneActionPerformed

    private void jtxtFieldNesne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFieldNesne2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtFieldNesne2ActionPerformed

    private void jbtnUs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUs1ActionPerformed
        kullanıcı.nesneListesi=list3;
        if(t1==0)
        {
        if(kullanıcı.nesneListesi.get(0) instanceof Tas)
        {   
        jbtnUs1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tas.png")));
        }
        if(kullanıcı.nesneListesi.get(0) instanceof Kagit)
        {
        jbtnUs1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kagit.png")));
        }
        if(kullanıcı.nesneListesi.get(0) instanceof Makas)
        {
        jbtnUs1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/makas.png")));
        }
        t1++;
        }
        else{
            
        System.out.println(list3.get(0));
        if(kullanıcı.nesneListesi.get(0) instanceof Tas)
        {
        jbtnUsVS.setVisible(true);
        jbtnUsVS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tas.png")));
        }
        if(kullanıcı.nesneListesi.get(0) instanceof Kagit)
        {
        jbtnUsVS.setVisible(true);
        jbtnUsVS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kagit.png")));
        }
        if(kullanıcı.nesneListesi.get(0) instanceof Makas)
        {
        jbtnUsVS.setVisible(true);
        jbtnUsVS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/makas.png")));
        }
       d1=true;
        }
        
    }//GEN-LAST:event_jbtnUs1ActionPerformed

    private void jbtnUs2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUs2ActionPerformed
         kullanıcı.nesneListesi=list3;
        if(t2==0){
        if(kullanıcı.nesneListesi.get(1) instanceof Tas)
        {
        jbtnUs2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tas.png")));
        }
        if(kullanıcı.nesneListesi.get(1) instanceof Kagit)
        {
         jbtnUs2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kagit.png")));
        }
        if(kullanıcı.nesneListesi.get(1) instanceof Makas)
        {
         jbtnUs2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/makas.png")));
        }
        t2++;
        }
        else
        {         
        if(kullanıcı.nesneListesi.get(1) instanceof Tas)
        {
        jbtnUsVS.setVisible(true);
        jbtnUsVS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tas.png")));
        }
        if(kullanıcı.nesneListesi.get(1) instanceof Kagit)
        {
         jbtnUsVS.setVisible(true);
         jbtnUsVS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kagit.png")));
        }
        if(kullanıcı.nesneListesi.get(1) instanceof Makas)
        {
         jbtnUsVS.setVisible(true);
         jbtnUsVS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/makas.png")));
        }
  
        }
        d2=true;
         
    }//GEN-LAST:event_jbtnUs2ActionPerformed

    private void jbtnUs3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUs3ActionPerformed
         kullanıcı.nesneListesi=list3;
        if(t3==0){
        if(kullanıcı.nesneListesi.get(2) instanceof Tas)
        {
         jbtnUs3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tas.png")));
        }
        if(kullanıcı.nesneListesi.get(2) instanceof Kagit)
        {
        jbtnUs3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kagit.png")));
        }
        if(kullanıcı.nesneListesi.get(2) instanceof Makas)
        {
        jbtnUs3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/makas.png")));
        }
        t3++;
          }
          else
          {
            
        if(kullanıcı.nesneListesi.get(2) instanceof Tas)
        {
         jbtnUsVS.setVisible(true);
         jbtnUsVS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tas.png")));
        }
        if(kullanıcı.nesneListesi.get(2) instanceof Kagit)
        {
        jbtnUsVS.setVisible(true);
        jbtnUsVS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kagit.png")));
        }
        if(kullanıcı.nesneListesi.get(2) instanceof Makas)
        {
        jbtnUsVS.setVisible(true);
        jbtnUsVS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/makas.png")));
        }
        
          }
       d3=true;
    }//GEN-LAST:event_jbtnUs3ActionPerformed

    private void jbtnUs4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUs4ActionPerformed
        kullanıcı.nesneListesi=list3;
        if(t4==0){
        if(kullanıcı.nesneListesi.get(3) instanceof Tas)
        {
        jbtnUs4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tas.png")));
        }
        if(kullanıcı.nesneListesi.get(3) instanceof Kagit)
        {
         jbtnUs4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kagit.png")));
        }
        if(kullanıcı.nesneListesi.get(3) instanceof Makas)
        {
        jbtnUs4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/makas.png")));
        }
        t4++;
          }
        else
        {
        System.out.println("cicikus4");
        if(kullanıcı.nesneListesi.get(3) instanceof Tas)
        {
         jbtnUsVS.setVisible(true);
         jbtnUsVS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tas.png")));
        }
        if(kullanıcı.nesneListesi.get(3) instanceof Kagit)
        {
        jbtnUsVS.setVisible(true);
        jbtnUsVS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kagit.png")));
        }
        if(kullanıcı.nesneListesi.get(3) instanceof Makas)
        {
        jbtnUsVS.setVisible(true);
        jbtnUsVS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/makas.png")));
        }
        
        }
        d4=true;
    }//GEN-LAST:event_jbtnUs4ActionPerformed

    private void jbtnUs5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUs5ActionPerformed
       kullanıcı.nesneListesi=list3;
        if(t5==0){
        if(kullanıcı.nesneListesi.get(4) instanceof Tas)
        {
        jbtnUs5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tas.png")));
        }
        if(kullanıcı.nesneListesi.get(4) instanceof Kagit)
        {
        jbtnUs5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kagit.png")));
        }
        if(kullanıcı.nesneListesi.get(4) instanceof Makas)
        {
        jbtnUs5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/makas.png")));
        }
        t5++;
        }
        else
        {
        System.out.println("cicikus5");
        if(kullanıcı.nesneListesi.get(4) instanceof Tas)
        {
        jbtnUsVS.setVisible(true);
        jbtnUsVS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tas.png")));
        }
        if(kullanıcı.nesneListesi.get(4) instanceof Kagit)
        {
        jbtnUsVS.setVisible(true);
        jbtnUsVS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kagit.png")));
        }
        if(kullanıcı.nesneListesi.get(4) instanceof Makas)
        {
        jbtnUsVS.setVisible(true);
        jbtnUsVS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/makas.png")));
        }
    
        }
        d5=true;
    }//GEN-LAST:event_jbtnUs5ActionPerformed

    private void jOYNAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOYNAActionPerformed
        if(count<5)
        {
        if(d1==true)
        {
            count++;
         jLabel9.setText("Round :"+Integer.toString(count));
        Object b=kullanıcı.nesneListesi.get(0);
        Object a=bilgisayar1.nesneSec(bilgisayar1.nesneListesi);
        
        if(a instanceof Tas)
        {
        jbtnPcVs.setVisible(true);
        jbtnPcVs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tas.png")));
        }
        if(a instanceof Kagit)
        {
        jbtnPcVs.setVisible(true);
        jbtnPcVs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kagit.png")));
        }
        if(a instanceof Makas)
        {
        jbtnPcVs.setVisible(true);
        jbtnPcVs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/makas.png")));
        }
            battle(a, b,count);
            String s1=String.valueOf(b);
            jLabel8.setText(s1);
            String s2=String.valueOf(a);
            jLabel17.setText(s2);
            d1=false;
            jbtnUs1.setEnabled(false);
            
        }
        
       else if(d2==true)
        {
            count++;
             jLabel9.setText("Round :"+Integer.toString(count));
        Object b=kullanıcı.nesneListesi.get(1);
        Object k=bilgisayar1.nesneSec(bilgisayar1.nesneListesi);
        if(k instanceof Tas)
        {
        jbtnPcVs.setVisible(true);
        jbtnPcVs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tas.png")));
        }
        if(k instanceof Kagit)
        {
        jbtnPcVs.setVisible(true);
        jbtnPcVs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kagit.png")));
        }
        if(k instanceof Makas)
        {
        jbtnPcVs.setVisible(true);
        jbtnPcVs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/makas.png")));
        }
            battle(k, b,count);
            String s1=String.valueOf(b);
            jLabel11.setText(s1);
             String s2=String.valueOf(k);
            jLabel17.setText(s2);
            d2=false;
            jbtnUs2.setEnabled(false);
        }
        
      else  if(d3==true)
        {
            count++;
             jLabel9.setText("Round :"+Integer.toString(count));
            Object b=kullanıcı.nesneListesi.get(2);
            
            Object c=bilgisayar1.nesneSec(bilgisayar1.nesneListesi);
        if(c instanceof Tas)
        {
        jbtnPcVs.setVisible(true);
        jbtnPcVs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tas.png")));
        }
        if(c instanceof Kagit)
        {
        jbtnPcVs.setVisible(true);
        jbtnPcVs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kagit.png")));
        }
        if(c instanceof Makas)
        {
        jbtnPcVs.setVisible(true);
        jbtnPcVs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/makas.png")));
        }
         battle(c, b,count);
         String s1=String.valueOf(b);
            jLabel11.setText(s1);
             String s2=String.valueOf(c);
            jLabel17.setText(s2);
            d3=false;
            jbtnUs3.setEnabled(false);
        }
        
      else  if(d4==true)
        {
            count++;
             jLabel9.setText("Round :"+Integer.toString(count));
           Object b=kullanıcı.nesneListesi.get(3);
           
               
        Object d=bilgisayar1.nesneSec(bilgisayar1.nesneListesi);
        if(d instanceof Tas)
        {
        jbtnPcVs.setVisible(true);
        jbtnPcVs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tas.png")));
        }
        if(d instanceof Kagit)
        {
        jbtnPcVs.setVisible(true);
        jbtnPcVs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kagit.png")));
        }
        if(d instanceof Makas)
        {
        jbtnPcVs.setVisible(true);
        jbtnPcVs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/makas.png")));
        }
           battle(d, b,count);
           String s1=String.valueOf(b);
            jLabel11.setText(s1);
             String s2=String.valueOf(d);
            jLabel17.setText(s2);
            d4=false;
            jbtnUs4.setEnabled(false);
           
        }
       else if(d5==true)
        {
            count++;
             jLabel9.setText("Round :"+Integer.toString(count));
             Object b=kullanıcı.nesneListesi.get(4);
             
             Object e=bilgisayar1.nesneSec(bilgisayar1.nesneListesi);
        if(e instanceof Tas)
        {
        jbtnPcVs.setVisible(true);
        jbtnPcVs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tas.png")));
        }
        if(e instanceof Kagit)
        {
        jbtnPcVs.setVisible(true);
        jbtnPcVs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kagit.png")));
        }
        if(e instanceof Makas)
        {
        jbtnPcVs.setVisible(true);
        jbtnPcVs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/makas.png")));
        }
         battle(e, b,count);
         String s1=String.valueOf(b);
            jLabel11.setText(s1);
             String s2=String.valueOf(e);
            jLabel17.setText(s2);
            d5=false;
           jbtnUs5.setEnabled(false);
        }
        }
        else if(count>=5 && count<10)
        {
           jbtnUs1.setEnabled(true); 
           jbtnUs2.setEnabled(true);
           jbtnUs3.setEnabled(true);
           jbtnUs4.setEnabled(true);
           jbtnUs5.setEnabled(true);
           
           if(d1==true)
        {
            count++;
         jLabel9.setText("Round :"+Integer.toString(count));
        Object b=kullanıcı.nesneListesi.get(0);
            
        Object a=bilgisayar1.nesneSec(bilgisayar1.nesneListesi);
        if(a instanceof Tas)
        {
        jbtnPcVs.setVisible(true);
        jbtnPcVs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tas.png")));
        }
        if(a instanceof Kagit)
        {
        jbtnPcVs.setVisible(true);
        jbtnPcVs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kagit.png")));
        }
        if(a instanceof Makas)
        {
        jbtnPcVs.setVisible(true);
        jbtnPcVs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/makas.png")));
        }
            battle(a, b,count);
            String s1=String.valueOf(b);
            jLabel11.setText(s1);
             String s2=String.valueOf(a);
            jLabel17.setText(s2);
            d1=false;
            
        }
        
       else if(d2==true)
        {
            count++;
             jLabel9.setText("Round :"+Integer.toString(count));
        Object b=kullanıcı.nesneListesi.get(1);
        Object k=bilgisayar1.nesneSec(bilgisayar1.nesneListesi);
        if(k instanceof Tas)
        {
        jbtnPcVs.setVisible(true);
        jbtnPcVs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tas.png")));
        }
        if(k instanceof Kagit)
        {
        jbtnPcVs.setVisible(true);
        jbtnPcVs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kagit.png")));
        }
        if(k instanceof Makas)
        {
        jbtnPcVs.setVisible(true);
        jbtnPcVs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/makas.png")));
        }
            battle(k, b,count);
            String s1=String.valueOf(b);
            jLabel11.setText(s1);
             String s2=String.valueOf(k);
            jLabel17.setText(s2);
            d2=false;
        }
        
      else  if(d3==true)
        {
            count++;
             jLabel9.setText("Round :"+Integer.toString(count));
            Object b=kullanıcı.nesneListesi.get(2);
            
            Object c=bilgisayar1.nesneSec(bilgisayar1.nesneListesi);
        if(c instanceof Tas)
        {
        jbtnPcVs.setVisible(true);
        jbtnPcVs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tas.png")));
        }
        if(c instanceof Kagit)
        {
        jbtnPcVs.setVisible(true);
        jbtnPcVs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kagit.png")));
        }
        if(c instanceof Makas)
        {
        jbtnPcVs.setVisible(true);
        jbtnPcVs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/makas.png")));
        }
         battle(c, b,count);
         String s1=String.valueOf(b);
            jLabel11.setText(s1);
             String s2=String.valueOf(c);
            jLabel17.setText(s2);
            d3=false;
            
        }
        
      else  if(d4==true)
        {
            count++;
             jLabel9.setText("Round :"+Integer.toString(count));
           Object b=kullanıcı.nesneListesi.get(3);
           
               
        Object d=bilgisayar1.nesneSec(bilgisayar1.nesneListesi);
        if(d instanceof Tas)
        {
        jbtnPcVs.setVisible(true);
        jbtnPcVs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tas.png")));
        }
        if(d instanceof Kagit)
        {
        jbtnPcVs.setVisible(true);
        jbtnPcVs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kagit.png")));
        }
        if(d instanceof Makas)
        {
        jbtnPcVs.setVisible(true);
        jbtnPcVs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/makas.png")));
        }
           battle(d, b,count);
           String s1=String.valueOf(b);
            jLabel11.setText(s1);
             String s2=String.valueOf(d);
            jLabel17.setText(s2);
            d4=false;
            
           
        }
       else if(d5==true)
        {
            count++;
             jLabel9.setText("Round :"+Integer.toString(count));
             Object b=kullanıcı.nesneListesi.get(4);
             
             Object e=bilgisayar1.nesneSec(bilgisayar1.nesneListesi);
        if(e instanceof Tas)
        {
        jbtnPcVs.setVisible(true);
        jbtnPcVs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tas.png")));
        }
        if(e instanceof Kagit)
        {
        jbtnPcVs.setVisible(true);
        jbtnPcVs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kagit.png")));
        }
        if(e instanceof Makas)
        {
        jbtnPcVs.setVisible(true);
        jbtnPcVs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/makas.png")));
        }
         battle(e, b,count);
         String s1=String.valueOf(b);
            jLabel11.setText(s1);
            String s2=String.valueOf(e);
            jLabel17.setText(s2);
            d5=false;
        }   
        }
        else if(count==10)
        {
           jbtnUs1.setEnabled(false); 
           jbtnUs2.setEnabled(false);
           jbtnUs3.setEnabled(false);
           jbtnUs4.setEnabled(false);
           jbtnUs5.setEnabled(false);
           JPanelSkorGoster.setVisible(true);
           double x1=bilgisayar1.netSkorugor();       
           jSonskorPc.setText(Double.toString(x1));
           double y1=kullanıcı.netSkorugor();
           jSonskorKullanici.setText(Double.toString(y1));
           if(x1>y1)
           {
               jPanelSonuc.setText("BİLGİSAYAR KAZANDI");
           }
           else if(y1>x1)
           {
               jPanelSonuc.setText("KULLANICI KAZANDI");
           }
           else
           {
               jPanelSonuc.setText("BERABERE");
           }
        }
       
    }//GEN-LAST:event_jOYNAActionPerformed

    private void jbtnUsVSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUsVSActionPerformed
       
    }//GEN-LAST:event_jbtnUsVSActionPerformed

    private void jbtnPcVsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPcVsActionPerformed
       
       
       
    }//GEN-LAST:event_jbtnPcVsActionPerformed

    private void jbtnPcNesnesecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPcNesnesecActionPerformed
        BnesneUret(list1);
        bilgisayar1.nesneListesi=list1;
      
        
    }//GEN-LAST:event_jbtnPcNesnesecActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jSkorUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSkorUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSkorUserActionPerformed

  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public  void run() {
                new jUser().setVisible(true);
             
                
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
                        b = kullanıcı.nesneSec(kullanıcı.nesneListesi);
                    }
                    ((Nesne) b).setNesneKullanildiMi(true);
                } 
            }
            


        if (a instanceof Tas) {
            if (b instanceof Kagit) {
                ((Tas) a).nesnePuaniGoster(((Tas) a).durumGuncelle(((Tas) a).etkiHesapla(b)));
                ((Kagit) b).nesnePuaniGoster(((Kagit) b).durumGuncelle(((Kagit) b).etkiHesapla(a)));

                bilgisayar1.skorGoster(((Kagit) b).etkiHesapla(a));
                kullanıcı.skorGoster(((Tas) a).etkiHesapla(b));

                if (((Tas) a).getDayaniklilik() <= 20) {
                    ((Kagit) b).setSeviyePuani(((Kagit) b).getSeviyePuani() + 20);
                    System.out.println("Kagıt son seviye puanı:" + ((Kagit) b).getSeviyePuani());
                    System.out.println("Tas son seviye puanı:" + ((Tas) a).getSeviyePuani());
                    if (((Kagit) b).getSeviyePuani() >= 30) {
                        kullanıcı.nesneListesi.add(new OzelKagit(2.0, ((Kagit) b).getNufuz(), ((Kagit) b).getDayaniklilik(), ((Kagit) b).getSeviyePuani(), ((Kagit) b).getName()));
                        kullanıcı.nesneListesi.remove(b);
                        
                    }
                }
                double x1=bilgisayar1.netSkorugor();       
                jLabel8.setText(Double.toString(x1));
                double y1=kullanıcı.netSkorugor();
                jSkorUser.setText(Double.toString(y1));
                        
            }
         else   if (b instanceof Tas) {

                ((Tas) a).nesnePuaniGoster(((Tas) a).durumGuncelle(((Tas) a).etkiHesapla(b)));
                ((Tas) b).nesnePuaniGoster(((Tas) b).durumGuncelle(((Tas) b).etkiHesapla(a)));

                System.out.println("Etki yok , berabere");

            }
         else   if (b instanceof Makas) {

                bilgisayar1.skorGoster(((Tas) a).etkiHesapla(b));
                kullanıcı.skorGoster(((Makas) b).etkiHesapla(a));

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
                jLabel8.setText(Double.toString(x1));
                double y1=kullanıcı.netSkorugor();
                jSkorUser.setText(Double.toString(y1));
            }
        }

       else if (a instanceof Makas) {
            if (b instanceof Kagit) {
                ((Makas) a).nesnePuaniGoster(((Makas) a).durumGuncelle(((Makas) a).etkiHesapla(b)));
                ((Kagit) b).nesnePuaniGoster(((Kagit) b).durumGuncelle(((Kagit) b).etkiHesapla(a)));

                bilgisayar1.skorGoster(((Makas) a).etkiHesapla(b));
                kullanıcı.skorGoster(((Kagit) b).etkiHesapla(a));
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
                jLabel8.setText(Double.toString(x1));
                double y1=kullanıcı.netSkorugor();
                jSkorUser.setText(Double.toString(y1));

            }

          else  if (b instanceof Tas) {
                ((Makas) a).nesnePuaniGoster(((Makas) a).durumGuncelle(((Makas) a).etkiHesapla(b)));
                ((Tas) b).nesnePuaniGoster(((Tas) b).durumGuncelle(((Tas) b).etkiHesapla(a)));

                bilgisayar1.skorGoster(((Makas) a).etkiHesapla(b));
                kullanıcı.skorGoster(((Tas) b).etkiHesapla(a));
                if (((Makas) a).getDayaniklilik() <= 20) {
                    ((Tas) b).setSeviyePuani(((Tas) b).getSeviyePuani() + 20);
                    System.out.println("Tas son seviye puanı:" + ((Tas) b).getSeviyePuani());
                    System.out.println("Makas son seviye puanı:" + ((Makas) a).getSeviyePuani());
                    if (((Tas) b).getSeviyePuani() >= 30) {
                        kullanıcı.nesneListesi.add(new AgirTas());
                        kullanıcı.nesneListesi.remove(b);
                        System.out.println(kullanıcı.nesneListesi);

                    }
                }
                double x1=bilgisayar1.netSkorugor();       
                jLabel8.setText(Double.toString(x1));
                double y1=kullanıcı.netSkorugor();
                jSkorUser.setText(Double.toString(y1));

            }
          else  if (b instanceof Makas) {
                ((Makas) a).nesnePuaniGoster(((Makas) a).durumGuncelle(((Makas) a).etkiHesapla(b)));
                ((Makas) b).nesnePuaniGoster(((Makas) b).durumGuncelle(((Makas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((Makas) a).etkiHesapla(b));
                kullanıcı.skorGoster(((Makas) b).etkiHesapla(a));
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
                kullanıcı.skorGoster(((Tas) b).etkiHesapla(a));
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
                jLabel8.setText(Double.toString(x1));
                double y1=kullanıcı.netSkorugor();
                jSkorUser.setText(Double.toString(y1));

            }
          else  if (b instanceof Makas) {
                ((Kagit) a).nesnePuaniGoster(((Kagit) a).durumGuncelle(((Kagit) a).etkiHesapla(b)));
                ((Makas) b).nesnePuaniGoster(((Makas) b).durumGuncelle(((Makas) b).etkiHesapla(a)));

                bilgisayar1.skorGoster(((Kagit) a).etkiHesapla(b));
                kullanıcı.skorGoster(((Makas) b).etkiHesapla(a));

                if (((Kagit) a).getDayaniklilik() <= 20) {
                    ((Makas) b).setSeviyePuani(((Makas) b).getSeviyePuani() + 20);
                    System.out.println("Makas son seviye puanı:" + ((Makas) b).getSeviyePuani());
                    System.out.println("Kagıt son seviye puanı:" + ((Kagit) a).getSeviyePuani());
                    if (((Makas) b).getSeviyePuani() >= 30) {
                        kullanıcı.nesneListesi.add(new UstaMakas());
                        kullanıcı.nesneListesi.remove(b);

                    }
                }
                double x1=bilgisayar1.netSkorugor();       
                jLabel8.setText(Double.toString(x1));
                double y1=kullanıcı.netSkorugor();
                jSkorUser.setText(Double.toString(y1));

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
                kullanıcı.skorGoster(((OzelKagit) a).etkiHesapla(b));
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
                kullanıcı.skorGoster(((OzelKagit) a).etkiHesapla(b));
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
                kullanıcı.skorGoster(((OzelKagit) a).etkiHesapla(b));
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
                kullanıcı.skorGoster(((OzelKagit) a).etkiHesapla(b));
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
                kullanıcı.skorGoster(((Tas) a).etkiHesapla(b));
                if (((Tas) a).getDayaniklilik() <= 20) {
                    ((OzelKagit) b).setSeviyePuani(((OzelKagit) b).getSeviyePuani() + 20);
                    System.out.println(" Ozel Kagıt son seviye puanı:" + ((OzelKagit) b).getSeviyePuani());
                    System.out.println("Tas son seviye puanı:" + ((Tas) a).getSeviyePuani());
                }

              else  if (a instanceof AgirTas) {
                    ((AgirTas) a).nesnePuaniGoster(((AgirTas) a).durumGuncelle(((AgirTas) a).etkiHesapla(b)));
                    ((OzelKagit) b).nesnePuaniGoster(((OzelKagit) b).durumGuncelle(((OzelKagit) b).etkiHesapla(a)));
                    bilgisayar1.skorGoster(((OzelKagit) b).etkiHesapla(a));
                    kullanıcı.skorGoster(((AgirTas) a).etkiHesapla(b));
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
                    kullanıcı.skorGoster(((Kagit) a).etkiHesapla(b));
                    System.out.println("Etki yok , berabere");

                }

             else   if (a instanceof OzelKagit) {
                    ((OzelKagit) a).nesnePuaniGoster(((OzelKagit) a).durumGuncelle(((OzelKagit) a).etkiHesapla(b)));
                    ((OzelKagit) b).nesnePuaniGoster(((OzelKagit) b).durumGuncelle(((OzelKagit) b).etkiHesapla(a)));
                    bilgisayar1.skorGoster(((OzelKagit) b).etkiHesapla(a));
                    kullanıcı.skorGoster(((OzelKagit) a).etkiHesapla(b));
                    System.out.println("Etki yok , berabere");

                }

              else  if (a instanceof Makas) {
                    ((Makas) a).nesnePuaniGoster(((Makas) a).durumGuncelle(((Makas) a).etkiHesapla(b)));
                    ((OzelKagit) b).nesnePuaniGoster(((OzelKagit) b).durumGuncelle(((OzelKagit) b).etkiHesapla(a)));
                    bilgisayar1.skorGoster(((OzelKagit) b).etkiHesapla(a));
                    kullanıcı.skorGoster(((Makas) a).etkiHesapla(b));
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
                    kullanıcı.skorGoster(((UstaMakas) a).etkiHesapla(b));
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
                kullanıcı.skorGoster(((Tas) b).etkiHesapla(a));
                ((AgirTas) a).nesnePuaniGoster(((AgirTas) a).durumGuncelle(((AgirTas) a).etkiHesapla(b)));
                ((Tas) b).nesnePuaniGoster(((Tas) b).durumGuncelle(((Tas) b).etkiHesapla(a)));
                System.out.println("Beraber ");
            }
          else  if (b instanceof AgirTas) {
                bilgisayar1.skorGoster(((AgirTas) a).etkiHesapla(b));
                kullanıcı.skorGoster(((AgirTas) b).etkiHesapla(a));
                ((AgirTas) a).nesnePuaniGoster(((AgirTas) a).durumGuncelle(((AgirTas) a).etkiHesapla(b)));
                ((AgirTas) b).nesnePuaniGoster(((AgirTas) b).durumGuncelle(((AgirTas) b).etkiHesapla(a)));
                System.out.println("Beraber ");
            }

         else   if (b instanceof Makas) {
                bilgisayar1.skorGoster(((AgirTas) a).etkiHesapla(b));
                kullanıcı.skorGoster(((Makas) b).etkiHesapla(a));
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
                kullanıcı.skorGoster(((UstaMakas) b).etkiHesapla(a));
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
                kullanıcı.skorGoster(((Kagit) b).etkiHesapla(a));
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
                kullanıcı.skorGoster(((OzelKagit) b).etkiHesapla(a));
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
                kullanıcı.skorGoster(((AgirTas) b).etkiHesapla(a));
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
                kullanıcı.skorGoster(((AgirTas) b).etkiHesapla(a));
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
                kullanıcı.skorGoster(((AgirTas) b).etkiHesapla(a));
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
                kullanıcı.skorGoster(((AgirTas) b).etkiHesapla(a));
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
                kullanıcı.skorGoster(((AgirTas) b).etkiHesapla(a));
                System.out.println("Durum berabere ");
            }

         else   if (a instanceof AgirTas) {
                ((AgirTas) a).nesnePuaniGoster(((AgirTas) a).durumGuncelle(((AgirTas) a).etkiHesapla(b)));
                ((AgirTas) b).nesnePuaniGoster(((AgirTas) b).durumGuncelle(((AgirTas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((AgirTas) a).etkiHesapla(b));
                kullanıcı.skorGoster(((AgirTas) b).etkiHesapla(a));
                System.out.println("Etki yok ,berabere");
            }

        }
        /////////////////////////////////
      else  if (a instanceof UstaMakas) {
            if (b instanceof UstaMakas) {
                ((UstaMakas) a).nesnePuaniGoster(((UstaMakas) a).durumGuncelle(((UstaMakas) a).etkiHesapla(b)));
                ((UstaMakas) b).nesnePuaniGoster(((UstaMakas) b).durumGuncelle(((UstaMakas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((UstaMakas) a).etkiHesapla(b));
                kullanıcı.skorGoster(((UstaMakas) b).etkiHesapla(a));
                System.out.println("Beraber ");
            }

          else  if (b instanceof Makas) {
                ((UstaMakas) a).nesnePuaniGoster(((UstaMakas) a).durumGuncelle(((UstaMakas) a).etkiHesapla(b)));
                ((Makas) b).nesnePuaniGoster(((Makas) b).durumGuncelle(((Makas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((UstaMakas) a).etkiHesapla(b));
                kullanıcı.skorGoster(((Makas) b).etkiHesapla(a));
                System.out.println("Beraber ");
            }

          else  if (b instanceof Tas) {
                ((UstaMakas) a).nesnePuaniGoster(((UstaMakas) a).durumGuncelle(((UstaMakas) a).etkiHesapla(b)));
                ((Tas) b).nesnePuaniGoster(((Tas) b).durumGuncelle(((Tas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((UstaMakas) a).etkiHesapla(b));
                kullanıcı.skorGoster(((Tas) b).etkiHesapla(a));
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
                kullanıcı.skorGoster(((AgirTas) b).etkiHesapla(a));
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
                kullanıcı.skorGoster(((Kagit) b).etkiHesapla(a));
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
                kullanıcı.skorGoster(((OzelKagit) b).etkiHesapla(a));
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
                kullanıcı.skorGoster(((UstaMakas) a).etkiHesapla(b));
                System.out.println("Beraber ");
            }

         else   if (a instanceof Makas) {
                ((UstaMakas) b).nesnePuaniGoster(((UstaMakas) b).durumGuncelle(((UstaMakas) b).etkiHesapla(a)));
                ((Makas) a).nesnePuaniGoster(((Makas) a).durumGuncelle(((Makas) a).etkiHesapla(b)));
                bilgisayar1.skorGoster(((UstaMakas) b).etkiHesapla(a));
                kullanıcı.skorGoster(((Makas) a).etkiHesapla(b));
                System.out.println("Beraber ");
            }

         else   if (a instanceof Tas) {
                ((UstaMakas) b).nesnePuaniGoster(((UstaMakas) b).durumGuncelle(((UstaMakas) b).etkiHesapla(a)));
                ((Tas) a).nesnePuaniGoster(((Tas) a).durumGuncelle(((Tas) a).etkiHesapla(b)));
                bilgisayar1.skorGoster(((UstaMakas) b).etkiHesapla(a));
                kullanıcı.skorGoster(((Tas) a).etkiHesapla(b));
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
                kullanıcı.skorGoster(((AgirTas) a).etkiHesapla(b));
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
                kullanıcı.skorGoster(((Kagit) a).etkiHesapla(b));
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
                kullanıcı.skorGoster(((OzelKagit) a).etkiHesapla(b));
                if (((OzelKagit) a).getDayaniklilik() <= 20) {
                    ((UstaMakas) b).setSeviyePuani(((UstaMakas) b).getSeviyePuani() + 20);
                    System.out.println(" Ozel Kagit son seviye puanı:" + ((OzelKagit) a).getSeviyePuani());
                    System.out.println(" Usta Makas son seviye puanı:" + ((UstaMakas) b).getSeviyePuani());
                }
            }
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelSkorGoster;
    private javax.swing.JLabel aa;
    private javax.swing.JButton jBtnNesneMakas;
    private javax.swing.JButton jBtnNesneileri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelNesneSec;
    private javax.swing.JButton jOYNA;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelDeste;
    private javax.swing.JPanel jPanelSkor;
    private javax.swing.JLabel jPanelSonuc;
    private javax.swing.JPanel jPanelVS;
    private javax.swing.JTextField jSkorUser;
    private javax.swing.JLabel jSonskorKullanici;
    private javax.swing.JLabel jSonskorPc;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jbtnNesneKagit1;
    private javax.swing.JButton jbtnNesneTas;
    private javax.swing.JButton jbtnPcNesnesec;
    private javax.swing.JButton jbtnPcVs;
    private javax.swing.JButton jbtnUs1;
    private javax.swing.JButton jbtnUs2;
    private javax.swing.JButton jbtnUs3;
    private javax.swing.JButton jbtnUs4;
    private javax.swing.JButton jbtnUs5;
    private javax.swing.JButton jbtnUsVS;
    private javax.swing.JTextField jtxtFieldNesne2;
    private javax.swing.JTextField jtxtFieldtoplamNesne;
    private javax.swing.JTextField qqq;
    // End of variables declaration//GEN-END:variables
}
