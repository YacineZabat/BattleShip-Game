/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;

import javax.swing.JButton;

import controller.DemoContoller;
import controller.GameModeController;

/**
 *
 * @author DELL
 */
public class Demo extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1854935924182239200L;

	 JButton[][] my_field = new JButton[10][10];
	    JButton[][] ennemy_field = new JButton[10][10];
		public Demo() {
	        initComponents();
	        initialisation(); 
	    }
	    
	    public JButton getButtonSuivant(){	return jButton1; }
	    public JButton[][] get_field1() {return my_field;}
		public JButton[][] get_field2() {return ennemy_field;}
   
		 private void initComponents() {

		        jpanel_type_jeu = new javax.swing.JPanel();
		        jLabel3 = new javax.swing.JLabel();
		        jLabel1 = new javax.swing.JLabel();
		        jLabel4 = new javax.swing.JLabel();
		        jB1 = new javax.swing.JButton();
		        jB2 = new javax.swing.JButton();
		        jB3 = new javax.swing.JButton();
		        jB4 = new javax.swing.JButton();
		        jB5 = new javax.swing.JButton();
		        jB6 = new javax.swing.JButton();
		        jB7 = new javax.swing.JButton();
		        jB8 = new javax.swing.JButton();
		        jB9 = new javax.swing.JButton();
		        jB10 = new javax.swing.JButton();
		        jB11 = new javax.swing.JButton();
		        jB12 = new javax.swing.JButton();
		        jB13 = new javax.swing.JButton();
		        jB14 = new javax.swing.JButton();
		        jB15 = new javax.swing.JButton();
		        jB16 = new javax.swing.JButton();
		        jB17 = new javax.swing.JButton();
		        jB18 = new javax.swing.JButton();
		        jB19 = new javax.swing.JButton();
		        jB20 = new javax.swing.JButton();
		        jB21 = new javax.swing.JButton();
		        jB22 = new javax.swing.JButton();
		        jB23 = new javax.swing.JButton();
		        jB24 = new javax.swing.JButton();
		        jB25 = new javax.swing.JButton();
		        jB26 = new javax.swing.JButton();
		        jB27 = new javax.swing.JButton();
		        jB28 = new javax.swing.JButton();
		        jB29 = new javax.swing.JButton();
		        jB30 = new javax.swing.JButton();
		        jB31 = new javax.swing.JButton();
		        jB32 = new javax.swing.JButton();
		        jB33 = new javax.swing.JButton();
		        jB34 = new javax.swing.JButton();
		        jB35 = new javax.swing.JButton();
		        jB36 = new javax.swing.JButton();
		        jB37 = new javax.swing.JButton();
		        jB38 = new javax.swing.JButton();
		        jB39 = new javax.swing.JButton();
		        jB40 = new javax.swing.JButton();
		        jB41 = new javax.swing.JButton();
		        jB42 = new javax.swing.JButton();
		        jB43 = new javax.swing.JButton();
		        jB44 = new javax.swing.JButton();
		        jB45 = new javax.swing.JButton();
		        jB46 = new javax.swing.JButton();
		        jB47 = new javax.swing.JButton();
		        jB48 = new javax.swing.JButton();
		        jB49 = new javax.swing.JButton();
		        jB50 = new javax.swing.JButton();
		        jB51 = new javax.swing.JButton();
		        jB52 = new javax.swing.JButton();
		        jB53 = new javax.swing.JButton();
		        jB54 = new javax.swing.JButton();
		        jB55 = new javax.swing.JButton();
		        jB56 = new javax.swing.JButton();
		        jB57 = new javax.swing.JButton();
		        jB58 = new javax.swing.JButton();
		        jB59 = new javax.swing.JButton();
		        jB60 = new javax.swing.JButton();
		        jB61 = new javax.swing.JButton();
		        jB62 = new javax.swing.JButton();
		        jB63 = new javax.swing.JButton();
		        jB64 = new javax.swing.JButton();
		        jB65 = new javax.swing.JButton();
		        jB66 = new javax.swing.JButton();
		        jB67 = new javax.swing.JButton();
		        jB68 = new javax.swing.JButton();
		        jB69 = new javax.swing.JButton();
		        jB70 = new javax.swing.JButton();
		        jB71 = new javax.swing.JButton();
		        jB72 = new javax.swing.JButton();
		        jB73 = new javax.swing.JButton();
		        jB74 = new javax.swing.JButton();
		        jB75 = new javax.swing.JButton();
		        jB76 = new javax.swing.JButton();
		        jB77 = new javax.swing.JButton();
		        jB78 = new javax.swing.JButton();
		        jB79 = new javax.swing.JButton();
		        jB80 = new javax.swing.JButton();
		        jB81 = new javax.swing.JButton();
		        jB82 = new javax.swing.JButton();
		        jB83 = new javax.swing.JButton();
		        jB84 = new javax.swing.JButton();
		        jB85 = new javax.swing.JButton();
		        jB86 = new javax.swing.JButton();
		        jB87 = new javax.swing.JButton();
		        jB88 = new javax.swing.JButton();
		        jB89 = new javax.swing.JButton();
		        jB90 = new javax.swing.JButton();
		        jB91 = new javax.swing.JButton();
		        jB92 = new javax.swing.JButton();
		        jB93 = new javax.swing.JButton();
		        jB94 = new javax.swing.JButton();
		        jB95 = new javax.swing.JButton();
		        jB96 = new javax.swing.JButton();
		        jB97 = new javax.swing.JButton();
		        jB98 = new javax.swing.JButton();
		        jB99 = new javax.swing.JButton();
		        jB101 = new javax.swing.JButton();
		        jB102 = new javax.swing.JButton();
		        jB103 = new javax.swing.JButton();
		        jB104 = new javax.swing.JButton();
		        jB105 = new javax.swing.JButton();
		        jB106 = new javax.swing.JButton();
		        jB107 = new javax.swing.JButton();
		        jB108 = new javax.swing.JButton();
		        jB109 = new javax.swing.JButton();
		        jB110 = new javax.swing.JButton();
		        jB111 = new javax.swing.JButton();
		        jB112 = new javax.swing.JButton();
		        jB113 = new javax.swing.JButton();
		        jB114 = new javax.swing.JButton();
		        jB115 = new javax.swing.JButton();
		        jB116 = new javax.swing.JButton();
		        jB117 = new javax.swing.JButton();
		        jB118 = new javax.swing.JButton();
		        jB119 = new javax.swing.JButton();
		        jB120 = new javax.swing.JButton();
		        jB121 = new javax.swing.JButton();
		        jB122 = new javax.swing.JButton();
		        jB123 = new javax.swing.JButton();
		        jB124 = new javax.swing.JButton();
		        jB125 = new javax.swing.JButton();
		        jB126 = new javax.swing.JButton();
		        jB127 = new javax.swing.JButton();
		        jB128 = new javax.swing.JButton();
		        jB129 = new javax.swing.JButton();
		        jB130 = new javax.swing.JButton();
		        jB131 = new javax.swing.JButton();
		        jB132 = new javax.swing.JButton();
		        jB133 = new javax.swing.JButton();
		        jB134 = new javax.swing.JButton();
		        jB135 = new javax.swing.JButton();
		        jB136 = new javax.swing.JButton();
		        jB137 = new javax.swing.JButton();
		        jB138 = new javax.swing.JButton();
		        jB139 = new javax.swing.JButton();
		        jB140 = new javax.swing.JButton();
		        jB141 = new javax.swing.JButton();
		        jB142 = new javax.swing.JButton();
		        jB143 = new javax.swing.JButton();
		        jB144 = new javax.swing.JButton();
		        jB145 = new javax.swing.JButton();
		        jB146 = new javax.swing.JButton();
		        jB147 = new javax.swing.JButton();
		        jB148 = new javax.swing.JButton();
		        jB149 = new javax.swing.JButton();
		        jB150 = new javax.swing.JButton();
		        jB151 = new javax.swing.JButton();
		        jB152 = new javax.swing.JButton();
		        jB153 = new javax.swing.JButton();
		        jB154 = new javax.swing.JButton();
		        jB155 = new javax.swing.JButton();
		        jB156 = new javax.swing.JButton();
		        jB157 = new javax.swing.JButton();
		        jB158 = new javax.swing.JButton();
		        jB159 = new javax.swing.JButton();
		        jB160 = new javax.swing.JButton();
		        jB161 = new javax.swing.JButton();
		        jB162 = new javax.swing.JButton();
		        jB163 = new javax.swing.JButton();
		        jB164 = new javax.swing.JButton();
		        jB165 = new javax.swing.JButton();
		        jB166 = new javax.swing.JButton();
		        jB167 = new javax.swing.JButton();
		        jB168 = new javax.swing.JButton();
		        jB169 = new javax.swing.JButton();
		        jB170 = new javax.swing.JButton();
		        jB171 = new javax.swing.JButton();
		        jB172 = new javax.swing.JButton();
		        jB173 = new javax.swing.JButton();
		        jB174 = new javax.swing.JButton();
		        jB175 = new javax.swing.JButton();
		        jB176 = new javax.swing.JButton();
		        jB177 = new javax.swing.JButton();
		        jB178 = new javax.swing.JButton();
		        jB179 = new javax.swing.JButton();
		        jB180 = new javax.swing.JButton();
		        jB181 = new javax.swing.JButton();
		        jB182 = new javax.swing.JButton();
		        jB183 = new javax.swing.JButton();
		        jB184 = new javax.swing.JButton();
		        jB185 = new javax.swing.JButton();
		        jB186 = new javax.swing.JButton();
		        jB187 = new javax.swing.JButton();
		        jB188 = new javax.swing.JButton();
		        jB189 = new javax.swing.JButton();
		        jB190 = new javax.swing.JButton();
		        jB191 = new javax.swing.JButton();
		        jB192 = new javax.swing.JButton();
		        jB193 = new javax.swing.JButton();
		        jB194 = new javax.swing.JButton();
		        jB195 = new javax.swing.JButton();
		        jB196 = new javax.swing.JButton();
		        jB197 = new javax.swing.JButton();
		        jB198 = new javax.swing.JButton();
		        jB199 = new javax.swing.JButton();
		        jB0 = new javax.swing.JButton();
		        jB100 = new javax.swing.JButton();
		        jLabel5 = new javax.swing.JLabel();
		        jButton1 = new javax.swing.JButton();
		        jButton1.addActionListener(new DemoContoller(this));
		        jB200 = new javax.swing.JButton();
		        jB202 = new javax.swing.JButton();
		        jLabel2 = new javax.swing.JLabel();
		        jLabel6 = new javax.swing.JLabel();
		        jB203 = new javax.swing.JButton();
		        jLabel7 = new javax.swing.JLabel();

		        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		        getContentPane().setLayout(new java.awt.CardLayout());

		        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
		        jLabel3.setText("Player 1");

		        jLabel1.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
		        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
		        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		        jLabel1.setText("BATAILLE NAVALE");
		        jLabel1.setAlignmentX(0.5F);
		        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

		        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
		        jLabel4.setText("Player2");

		        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
		        jLabel5.setText("  Mode Démo  ");
		        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

		        jButton1.setBackground(new java.awt.Color(0, 153, 51));
		        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		        jButton1.setText("Start Démonstration");
		      

		        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
		        jLabel2.setText("Tir raté");

		        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
		        jLabel6.setText("Tir réussi");


		        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
		        jLabel7.setText("Navire");

		        javax.swing.GroupLayout jpanel_type_jeuLayout = new javax.swing.GroupLayout(jpanel_type_jeu);
		        jpanel_type_jeu.setLayout(jpanel_type_jeuLayout);
		        jpanel_type_jeuLayout.setHorizontalGroup(
		            jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                .addContainerGap()
		                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                .addContainerGap())
		            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel_type_jeuLayout.createSequentialGroup()
		                .addGap(62, 62, 62)
		                .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                    .addComponent(jB0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jB10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jB20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jB30, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jB40, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jB50, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jB60, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jB70, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jB80, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jB90, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                        .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addGap(4, 4, 4)
		                        .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addComponent(jLabel3)
		                            .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                                .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
		                        .addGap(0, 0, Short.MAX_VALUE))
		                    .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                        .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                                .addComponent(jB71, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addGap(4, 4, 4)
		                                .addComponent(jB72, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB73, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB74, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB75, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB76, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB77, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB78, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB79, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                            .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                                .addComponent(jB81, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addGap(4, 4, 4)
		                                .addComponent(jB82, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB83, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB84, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB85, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB86, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB87, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB88, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB89, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                            .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                                .addComponent(jB91, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addGap(4, 4, 4)
		                                .addComponent(jB92, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB93, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB94, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB95, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB96, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB97, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB98, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB99, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                            .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                                .addComponent(jB31, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB32, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addGap(4, 4, 4)
		                                .addComponent(jB33, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB34, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB35, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB36, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB37, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB38, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB39, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                            .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                                .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                                    .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                                        .addComponent(jB51, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                        .addGap(4, 4, 4)
		                                        .addComponent(jB52, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                        .addComponent(jB53, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                        .addComponent(jB54, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                        .addComponent(jB55, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                        .addComponent(jB56, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                        .addComponent(jB57, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                        .addComponent(jB58, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                        .addComponent(jB59, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                                    .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                                        .addComponent(jB41, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                        .addComponent(jB42, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                        .addGap(4, 4, 4)
		                                        .addComponent(jB43, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                        .addComponent(jB44, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                        .addComponent(jB45, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                        .addComponent(jB46, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                        .addComponent(jB47, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                        .addComponent(jB48, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                        .addComponent(jB49, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                                    .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                                        .addComponent(jB61, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                        .addGap(4, 4, 4)
		                                        .addComponent(jB62, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                        .addComponent(jB63, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                        .addComponent(jB64, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                        .addComponent(jB65, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                        .addComponent(jB66, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                        .addComponent(jB67, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                        .addComponent(jB68, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                        .addComponent(jB69, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
		                                .addGap(75, 75, 75)
		                                .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                                    .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                                        .addComponent(jB203, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                                        .addComponent(jLabel7))
		                                    .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                                        .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                                            .addComponent(jB200, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                            .addComponent(jB202, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                                        .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                                            .addComponent(jLabel6)
		                                            .addComponent(jLabel2))))))
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel_type_jeuLayout.createSequentialGroup()
		                        .addGap(0, 0, Short.MAX_VALUE)
		                        .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                                .addComponent(jB11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addGap(4, 4, 4)
		                                .addComponent(jB13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                            .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                                .addComponent(jB21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addGap(4, 4, 4)
		                                .addComponent(jB23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB28, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB29, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
		                        .addGap(37, 37, 37)
		                        .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addComponent(jButton1)
		                            .addComponent(jLabel5))
		                        .addGap(18, 18, 18)))
		                .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                        .addComponent(jB100, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addComponent(jB110, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addComponent(jB120, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addComponent(jB130, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                    .addComponent(jB140, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jB150, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jB160, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jB170, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jB180, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jB190, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                        .addComponent(jB111, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addGap(4, 4, 4)
		                        .addComponent(jB112, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB113, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB114, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB115, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB116, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB117, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB118, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB119, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                    .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                        .addComponent(jB121, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addGap(4, 4, 4)
		                        .addComponent(jB122, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB123, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB124, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB125, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB126, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB127, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB128, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB129, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                    .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                        .addComponent(jB131, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addGap(4, 4, 4)
		                        .addComponent(jB132, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB133, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB134, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB135, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB136, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB137, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB138, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB139, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                    .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                        .addComponent(jB141, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addGap(4, 4, 4)
		                        .addComponent(jB142, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB143, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB144, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB145, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB146, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB147, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB148, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB149, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                    .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                        .addComponent(jB151, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addGap(4, 4, 4)
		                        .addComponent(jB152, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB153, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB154, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB155, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB156, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB157, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB158, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB159, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                    .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                        .addComponent(jB161, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addGap(4, 4, 4)
		                        .addComponent(jB162, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB163, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB164, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB165, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB166, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB167, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB168, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB169, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                    .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                        .addComponent(jB171, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addGap(4, 4, 4)
		                        .addComponent(jB172, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB173, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB174, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB175, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB176, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB177, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB178, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB179, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                    .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                        .addComponent(jB181, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addGap(4, 4, 4)
		                        .addComponent(jB182, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB183, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB184, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB185, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB186, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB187, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB188, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB189, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                    .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                        .addComponent(jB191, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addGap(4, 4, 4)
		                        .addComponent(jB192, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB193, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB194, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB195, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB196, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB197, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB198, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB199, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                    .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                        .addComponent(jB101, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addGap(4, 4, 4)
		                        .addComponent(jB102, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jB103, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addComponent(jLabel4)
		                            .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                                .addComponent(jB104, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB105, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB106, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB107, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB108, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB109, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
		                .addGap(14, 14, 14))
		        );
		        jpanel_type_jeuLayout.setVerticalGroup(
		            jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                .addContainerGap()
		                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addGap(36, 36, 36)
		                .addComponent(jLabel5)
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jLabel3)
		                    .addComponent(jLabel4))
		                .addGap(44, 44, 44)
		                .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                    .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                        .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                            .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                                .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                                    .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                                        .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                                            .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                                                .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                                                    .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                                                        .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                                                            .addComponent(jB40, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                                                                .addComponent(jB41, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                .addComponent(jB42, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                .addComponent(jB44, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                .addComponent(jB46, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                .addComponent(jB47, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                .addComponent(jB48, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                .addComponent(jB49, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                .addComponent(jB43, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                .addComponent(jB45, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
		                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                                        .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                                                            .addComponent(jB51, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addComponent(jB53, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addComponent(jB52, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addComponent(jB55, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addComponent(jB54, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addComponent(jB57, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addComponent(jB58, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addComponent(jB56, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addComponent(jB59, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
		                                                    .addComponent(jB50, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                    .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                                                        .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                                                            .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                                                                .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                                                                    .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                                                                        .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
		                                                                            .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                                                                                .addComponent(jB0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                                                                                .addComponent(jB10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                                                                            .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                                                                                .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                                                                                    .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                                    .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                                    .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                                    .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                                    .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                                    .addComponent(jB7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                                    .addComponent(jB8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                                    .addComponent(jB6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                                    .addComponent(jB9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                                                                .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                                                                                    .addComponent(jB11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                                    .addComponent(jB12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                                    .addComponent(jB14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                                    .addComponent(jB16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                                    .addComponent(jB17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                                    .addComponent(jB18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                                    .addComponent(jB19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                                    .addComponent(jB13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                                    .addComponent(jB15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
		                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                                                        .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                                                                            .addComponent(jB21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                            .addComponent(jB22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                            .addComponent(jB24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                            .addComponent(jB26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                            .addComponent(jB27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                            .addComponent(jB28, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                            .addComponent(jB23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                            .addComponent(jB25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                            .addComponent(jB29, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
		                                                                    .addComponent(jB20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanel_type_jeuLayout.createSequentialGroup()
		                                                                        .addGap(42, 42, 42)
		                                                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
		                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                                                .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                                                                    .addComponent(jB31, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                    .addComponent(jB32, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                    .addComponent(jB34, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                    .addComponent(jB36, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                    .addComponent(jB37, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                    .addComponent(jB38, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                    .addComponent(jB33, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                    .addComponent(jB35, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                    .addComponent(jB39, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
		                                                            .addComponent(jB30, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                                                        .addGap(84, 84, 84)))
		                                                .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                                                    .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                                        .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                                                            .addComponent(jB61, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addComponent(jB63, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addComponent(jB62, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addComponent(jB65, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addComponent(jB64, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addComponent(jB67, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addComponent(jB68, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addComponent(jB66, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addComponent(jB69, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
		                                                    .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                                                        .addGap(7, 7, 7)
		                                                        .addComponent(jLabel7))))
		                                            .addComponent(jB60, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                        .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                                            .addComponent(jB71, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                            .addComponent(jB73, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                            .addComponent(jB72, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                            .addComponent(jB75, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                            .addComponent(jB74, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                            .addComponent(jB77, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                            .addComponent(jB78, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                            .addComponent(jB76, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                            .addComponent(jB79, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
		                                    .addComponent(jB70, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                                    .addComponent(jB81, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                    .addComponent(jB83, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                    .addComponent(jB82, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                    .addComponent(jB85, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                    .addComponent(jB84, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                    .addComponent(jB87, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                    .addComponent(jB88, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                    .addComponent(jB86, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                    .addComponent(jB89, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
		                            .addComponent(jB80, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                            .addComponent(jB91, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jB93, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jB92, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jB95, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jB94, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jB97, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jB98, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jB96, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jB99, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
		                    .addComponent(jB90, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                        .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                            .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                                .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                                    .addComponent(jB171, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                    .addComponent(jB173, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                    .addComponent(jB172, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                    .addComponent(jB175, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                    .addComponent(jB174, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                    .addComponent(jB177, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                    .addComponent(jB178, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                    .addComponent(jB176, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                    .addComponent(jB179, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                    .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                                        .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                                            .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                                                .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                                                    .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                                                        .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                                                            .addComponent(jB141, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addComponent(jB143, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addComponent(jB142, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addComponent(jB145, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addComponent(jB144, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addComponent(jB147, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addComponent(jB148, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addComponent(jB146, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addComponent(jB149, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                                        .addComponent(jB150, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                                                    .addComponent(jB151, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                    .addComponent(jB153, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                    .addComponent(jB152, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                    .addComponent(jB155, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                    .addComponent(jB154, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                    .addComponent(jB157, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                    .addComponent(jB158, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                    .addComponent(jB156, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                    .addComponent(jB159, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                    .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                                                        .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                                                            .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                                                                .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                                                                    .addComponent(jB121, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                    .addComponent(jB123, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                    .addComponent(jB122, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                    .addComponent(jB125, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                    .addComponent(jB124, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                    .addComponent(jB127, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                    .addComponent(jB128, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                    .addComponent(jB126, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                    .addComponent(jB129, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                    .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
		                                                                        .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                                                                            .addComponent(jB101, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                            .addComponent(jB103, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                            .addComponent(jB102, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                            .addComponent(jB105, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                            .addComponent(jB104, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                            .addComponent(jB107, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                            .addComponent(jB108, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                            .addComponent(jB106, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                            .addComponent(jB109, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                            .addComponent(jB100, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                                                        .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                                                                            .addComponent(jB111, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                            .addComponent(jB113, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                            .addComponent(jB112, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                            .addComponent(jB115, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                            .addComponent(jB114, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                            .addComponent(jB117, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                            .addComponent(jB118, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                            .addComponent(jB116, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                            .addComponent(jB119, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                            .addComponent(jB110, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                                                        .addComponent(jB120, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
		                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                                                .addComponent(jB130, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                                                            .addComponent(jB131, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addComponent(jB133, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addComponent(jB132, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addComponent(jB135, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addComponent(jB134, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addComponent(jB137, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addComponent(jB138, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addComponent(jB136, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addComponent(jB139, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                                        .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                                                            .addComponent(jB140, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel_type_jeuLayout.createSequentialGroup()
		                                                                .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                                                                    .addComponent(jB200, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
		                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                                                .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                                                                    .addComponent(jLabel6)
		                                                                    .addComponent(jB202, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))))
		                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                                .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                                                    .addComponent(jB160, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                    .addComponent(jB203, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
		                                            .addComponent(jB161, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                            .addComponent(jB163, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                            .addComponent(jB162, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                            .addComponent(jB165, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                            .addComponent(jB164, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                            .addComponent(jB167, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                            .addComponent(jB168, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                            .addComponent(jB166, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                            .addComponent(jB169, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                        .addComponent(jB170, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jB180, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                            .addComponent(jB181, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jB183, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jB182, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jB185, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jB184, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jB187, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jB188, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jB186, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jB189, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                            .addComponent(jB191, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jB193, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jB192, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jB195, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jB194, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jB197, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jB198, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jB196, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jB199, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jB190, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
		                .addContainerGap(51, Short.MAX_VALUE))
		        );
        getContentPane().add(jpanel_type_jeu, "card2");

        pack();
    }// </editor-fold>                        

   
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
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Demo().setVisible(true);
            }
        });
    }
    private void initialisation(){
        
        // remplir la matrice de field a gauche
        my_field[0][0] = jB0;
        my_field[0][1] = jB1;
        my_field[0][2] = jB2;
        my_field[0][3] = jB3;
        my_field[0][4] = jB4;
        my_field[0][5] = jB5;
        my_field[0][6] = jB6;
        my_field[0][7] = jB7;
        my_field[0][8] = jB8;
        my_field[0][9] = jB9;
        my_field[1][0] = jB10;
        my_field[1][1] = jB11;
        my_field[1][2] = jB12;
        my_field[1][3] = jB13;
        my_field[1][4] = jB14;
        my_field[1][5] = jB15;
        my_field[1][6] = jB16;
        my_field[1][7] = jB17;
        my_field[1][8] = jB18;
        my_field[1][9] = jB19;
        my_field[2][0] = jB20;
        my_field[2][1] = jB21;
        my_field[2][2] = jB22;
        my_field[2][3] = jB23;
        my_field[2][4] = jB24;
        my_field[2][5] = jB25;
        my_field[2][6] = jB26;
        my_field[2][7] = jB27;
        my_field[2][8] = jB28;
        my_field[2][9] = jB29;
        my_field[3][0] = jB30;
        my_field[3][1] = jB31;
        my_field[3][2] = jB32;
        my_field[3][3] = jB33;
        my_field[3][4] = jB34;
        my_field[3][5] = jB35;
        my_field[3][6] = jB36;
        my_field[3][7] = jB37;
        my_field[3][8] = jB38;
        my_field[3][9] = jB39;
        my_field[4][0] = jB40;
        my_field[4][1] = jB41;
        my_field[4][2] = jB42;
        my_field[4][3] = jB43;
        my_field[4][4] = jB44;
        my_field[4][5] = jB45;
        my_field[4][6] = jB46;
        my_field[4][7] = jB47;
        my_field[4][8] = jB48;
        my_field[4][9] = jB49;
        my_field[5][0] = jB50;
        my_field[5][1] = jB51;
        my_field[5][2] = jB52;
        my_field[5][3] = jB53;
        my_field[5][4] = jB54;
        my_field[5][5] = jB55;
        my_field[5][6] = jB56;
        my_field[5][7] = jB57;
        my_field[5][8] = jB58;
        my_field[5][9] = jB59;
        my_field[6][0] = jB60;
        my_field[6][1] = jB61;
        my_field[6][2] = jB62;
        my_field[6][3] = jB63;
        my_field[6][4] = jB64;
        my_field[6][5] = jB65;
        my_field[6][6] = jB66;
        my_field[6][7] = jB67;
        my_field[6][8] = jB68;
        my_field[6][9] = jB69;
        my_field[7][0] = jB70;
        my_field[7][1] = jB71;
        my_field[7][2] = jB72;
        my_field[7][3] = jB73;
        my_field[7][4] = jB74;
        my_field[7][5] = jB75;
        my_field[7][6] = jB76;
        my_field[7][7] = jB77;
        my_field[7][8] = jB78;
        my_field[7][9] = jB79;
        my_field[8][0] = jB80;
        my_field[8][1] = jB81;
        my_field[8][2] = jB82;
        my_field[8][3] = jB83;
        my_field[8][4] = jB84;
        my_field[8][5] = jB85;
        my_field[8][6] = jB86;
        my_field[8][7] = jB87;
        my_field[8][8] = jB88;
        my_field[8][9] = jB89;
        my_field[9][0] = jB90;
        my_field[9][1] = jB91;
        my_field[9][2] = jB92;
        my_field[9][3] = jB93;
        my_field[9][4] = jB94;
        my_field[9][5] = jB95;
        my_field[9][6] = jB96;
        my_field[9][7] = jB97;
        my_field[9][8] = jB98;
        my_field[9][9] = jB99;
        
         // remplir la matrice de field a gauche
        ennemy_field[0][0] = jB100;
        ennemy_field[0][1] = jB101;
        ennemy_field[0][2] = jB102;
        ennemy_field[0][3] = jB103;
        ennemy_field[0][4] = jB104;
        ennemy_field[0][5] = jB105;
        ennemy_field[0][6] = jB106;
        ennemy_field[0][7] = jB107;
        ennemy_field[0][8] = jB108;
        ennemy_field[0][9] = jB109;
        ennemy_field[1][0] = jB110;
        ennemy_field[1][1] = jB111;
        ennemy_field[1][2] = jB112;
        ennemy_field[1][3] = jB113;
        ennemy_field[1][4] = jB114;
        ennemy_field[1][5] = jB115;
        ennemy_field[1][6] = jB116;
        ennemy_field[1][7] = jB117;
        ennemy_field[1][8] = jB118;
        ennemy_field[1][9] = jB119;
        ennemy_field[2][0] = jB120;
        ennemy_field[2][1] = jB121;
        ennemy_field[2][2] = jB122;
        ennemy_field[2][3] = jB123;
        ennemy_field[2][4] = jB124;
        ennemy_field[2][5] = jB125;
        ennemy_field[2][6] = jB126;
        ennemy_field[2][7] = jB127;
        ennemy_field[2][8] = jB128;
        ennemy_field[2][9] = jB129;
        ennemy_field[3][0] = jB130;
        ennemy_field[3][1] = jB131;
        ennemy_field[3][2] = jB132;
        ennemy_field[3][3] = jB133;
        ennemy_field[3][4] = jB134;
        ennemy_field[3][5] = jB135;
        ennemy_field[3][6] = jB136;
        ennemy_field[3][7] = jB137;
        ennemy_field[3][8] = jB138;
        ennemy_field[3][9] = jB139;
        ennemy_field[4][0] = jB140;
        ennemy_field[4][1] = jB141;
        ennemy_field[4][2] = jB142;
        ennemy_field[4][3] = jB143;
        ennemy_field[4][4] = jB144;
        ennemy_field[4][5] = jB145;
        ennemy_field[4][6] = jB146;
        ennemy_field[4][7] = jB147;
        ennemy_field[4][8] = jB148;
        ennemy_field[4][9] = jB149;
        ennemy_field[5][0] = jB150;
        ennemy_field[5][1] = jB151;
        ennemy_field[5][2] = jB152;
        ennemy_field[5][3] = jB153;
        ennemy_field[5][4] = jB154;
        ennemy_field[5][5] = jB155;
        ennemy_field[5][6] = jB156;
        ennemy_field[5][7] = jB157;
        ennemy_field[5][8] = jB158;
        ennemy_field[5][9] = jB159;
        ennemy_field[6][0] = jB160;
        ennemy_field[6][1] = jB161;
        ennemy_field[6][2] = jB162;
        ennemy_field[6][3] = jB163;
        ennemy_field[6][4] = jB164;
        ennemy_field[6][5] = jB165;
        ennemy_field[6][6] = jB166;
        ennemy_field[6][7] = jB167;
        ennemy_field[6][8] = jB168;
        ennemy_field[6][9] = jB169;
        ennemy_field[7][0] = jB170;
        ennemy_field[7][1] = jB171;
        ennemy_field[7][2] = jB172;
        ennemy_field[7][3] = jB173;
        ennemy_field[7][4] = jB174;
        ennemy_field[7][5] = jB175;
        ennemy_field[7][6] = jB176;
        ennemy_field[7][7] = jB177;
        ennemy_field[7][8] = jB178;
        ennemy_field[7][9] = jB179;
        ennemy_field[8][0] = jB180;
        ennemy_field[8][1] = jB181;
        ennemy_field[8][2] = jB182;
        ennemy_field[8][3] = jB183;
        ennemy_field[8][4] = jB184;
        ennemy_field[8][5] = jB185;
        ennemy_field[8][6] = jB186;
        ennemy_field[8][7] = jB187;
        ennemy_field[8][8] = jB188;
        ennemy_field[8][9] = jB189;
        ennemy_field[9][0] = jB190;
        ennemy_field[9][1] = jB191;
        ennemy_field[9][2] = jB192;
        ennemy_field[9][3] = jB193;
        ennemy_field[9][4] = jB194;
        ennemy_field[9][5] = jB195;
        ennemy_field[9][6] = jB196;
        ennemy_field[9][7] = jB197;
        ennemy_field[9][8] = jB198;
        ennemy_field[9][9] = jB199; 
        jB200.setBackground(Color.blue); 
        jB202.setBackground(Color.red); 
        jB203.setBackground(Color.black);
        
        // scenario 
        my_field[5][2].setBackground(Color.black);    
        my_field[5][3].setBackground(Color.black);    
        my_field[9][4].setBackground(Color.black);    
        my_field[9][5].setBackground(Color.black);    
        my_field[9][6].setBackground(Color.black);   
        
        ennemy_field[2][7].setBackground(Color.black); 
        ennemy_field[2][8].setBackground(Color.black); 
        ennemy_field[8][2].setBackground(Color.black); 
        ennemy_field[8][3].setBackground(Color.black); 
        ennemy_field[8][4].setBackground(Color.black); 



    }

    // Variables declaration - do not modify                     
    // Variables declaration - do not modify                     
    private javax.swing.JButton jB0;
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB10;
    private javax.swing.JButton jB100;
    private javax.swing.JButton jB101;
    private javax.swing.JButton jB102;
    private javax.swing.JButton jB103;
    private javax.swing.JButton jB104;
    private javax.swing.JButton jB105;
    private javax.swing.JButton jB106;
    private javax.swing.JButton jB107;
    private javax.swing.JButton jB108;
    private javax.swing.JButton jB109;
    private javax.swing.JButton jB11;
    private javax.swing.JButton jB110;
    private javax.swing.JButton jB111;
    private javax.swing.JButton jB112;
    private javax.swing.JButton jB113;
    private javax.swing.JButton jB114;
    private javax.swing.JButton jB115;
    private javax.swing.JButton jB116;
    private javax.swing.JButton jB117;
    private javax.swing.JButton jB118;
    private javax.swing.JButton jB119;
    private javax.swing.JButton jB12;
    private javax.swing.JButton jB120;
    private javax.swing.JButton jB121;
    private javax.swing.JButton jB122;
    private javax.swing.JButton jB123;
    private javax.swing.JButton jB124;
    private javax.swing.JButton jB125;
    private javax.swing.JButton jB126;
    private javax.swing.JButton jB127;
    private javax.swing.JButton jB128;
    private javax.swing.JButton jB129;
    private javax.swing.JButton jB13;
    private javax.swing.JButton jB130;
    private javax.swing.JButton jB131;
    private javax.swing.JButton jB132;
    private javax.swing.JButton jB133;
    private javax.swing.JButton jB134;
    private javax.swing.JButton jB135;
    private javax.swing.JButton jB136;
    private javax.swing.JButton jB137;
    private javax.swing.JButton jB138;
    private javax.swing.JButton jB139;
    private javax.swing.JButton jB14;
    private javax.swing.JButton jB140;
    private javax.swing.JButton jB141;
    private javax.swing.JButton jB142;
    private javax.swing.JButton jB143;
    private javax.swing.JButton jB144;
    private javax.swing.JButton jB145;
    private javax.swing.JButton jB146;
    private javax.swing.JButton jB147;
    private javax.swing.JButton jB148;
    private javax.swing.JButton jB149;
    private javax.swing.JButton jB15;
    private javax.swing.JButton jB150;
    private javax.swing.JButton jB151;
    private javax.swing.JButton jB152;
    private javax.swing.JButton jB153;
    private javax.swing.JButton jB154;
    private javax.swing.JButton jB155;
    private javax.swing.JButton jB156;
    private javax.swing.JButton jB157;
    private javax.swing.JButton jB158;
    private javax.swing.JButton jB159;
    private javax.swing.JButton jB16;
    private javax.swing.JButton jB160;
    private javax.swing.JButton jB161;
    private javax.swing.JButton jB162;
    private javax.swing.JButton jB163;
    private javax.swing.JButton jB164;
    private javax.swing.JButton jB165;
    private javax.swing.JButton jB166;
    private javax.swing.JButton jB167;
    private javax.swing.JButton jB168;
    private javax.swing.JButton jB169;
    private javax.swing.JButton jB17;
    private javax.swing.JButton jB170;
    private javax.swing.JButton jB171;
    private javax.swing.JButton jB172;
    private javax.swing.JButton jB173;
    private javax.swing.JButton jB174;
    private javax.swing.JButton jB175;
    private javax.swing.JButton jB176;
    private javax.swing.JButton jB177;
    private javax.swing.JButton jB178;
    private javax.swing.JButton jB179;
    private javax.swing.JButton jB18;
    private javax.swing.JButton jB180;
    private javax.swing.JButton jB181;
    private javax.swing.JButton jB182;
    private javax.swing.JButton jB183;
    private javax.swing.JButton jB184;
    private javax.swing.JButton jB185;
    private javax.swing.JButton jB186;
    private javax.swing.JButton jB187;
    private javax.swing.JButton jB188;
    private javax.swing.JButton jB189;
    private javax.swing.JButton jB19;
    private javax.swing.JButton jB190;
    private javax.swing.JButton jB191;
    private javax.swing.JButton jB192;
    private javax.swing.JButton jB193;
    private javax.swing.JButton jB194;
    private javax.swing.JButton jB195;
    private javax.swing.JButton jB196;
    private javax.swing.JButton jB197;
    private javax.swing.JButton jB198;
    private javax.swing.JButton jB199;
    private javax.swing.JButton jB2;
    private javax.swing.JButton jB20;
    private javax.swing.JButton jB200;
    private javax.swing.JButton jB202;
    private javax.swing.JButton jB203;
    private javax.swing.JButton jB21;
    private javax.swing.JButton jB22;
    private javax.swing.JButton jB23;
    private javax.swing.JButton jB24;
    private javax.swing.JButton jB25;
    private javax.swing.JButton jB26;
    private javax.swing.JButton jB27;
    private javax.swing.JButton jB28;
    private javax.swing.JButton jB29;
    private javax.swing.JButton jB3;
    private javax.swing.JButton jB30;
    private javax.swing.JButton jB31;
    private javax.swing.JButton jB32;
    private javax.swing.JButton jB33;
    private javax.swing.JButton jB34;
    private javax.swing.JButton jB35;
    private javax.swing.JButton jB36;
    private javax.swing.JButton jB37;
    private javax.swing.JButton jB38;
    private javax.swing.JButton jB39;
    private javax.swing.JButton jB4;
    private javax.swing.JButton jB40;
    private javax.swing.JButton jB41;
    private javax.swing.JButton jB42;
    private javax.swing.JButton jB43;
    private javax.swing.JButton jB44;
    private javax.swing.JButton jB45;
    private javax.swing.JButton jB46;
    private javax.swing.JButton jB47;
    private javax.swing.JButton jB48;
    private javax.swing.JButton jB49;
    private javax.swing.JButton jB5;
    private javax.swing.JButton jB50;
    private javax.swing.JButton jB51;
    private javax.swing.JButton jB52;
    private javax.swing.JButton jB53;
    private javax.swing.JButton jB54;
    private javax.swing.JButton jB55;
    private javax.swing.JButton jB56;
    private javax.swing.JButton jB57;
    private javax.swing.JButton jB58;
    private javax.swing.JButton jB59;
    private javax.swing.JButton jB6;
    private javax.swing.JButton jB60;
    private javax.swing.JButton jB61;
    private javax.swing.JButton jB62;
    private javax.swing.JButton jB63;
    private javax.swing.JButton jB64;
    private javax.swing.JButton jB65;
    private javax.swing.JButton jB66;
    private javax.swing.JButton jB67;
    private javax.swing.JButton jB68;
    private javax.swing.JButton jB69;
    private javax.swing.JButton jB7;
    private javax.swing.JButton jB70;
    private javax.swing.JButton jB71;
    private javax.swing.JButton jB72;
    private javax.swing.JButton jB73;
    private javax.swing.JButton jB74;
    private javax.swing.JButton jB75;
    private javax.swing.JButton jB76;
    private javax.swing.JButton jB77;
    private javax.swing.JButton jB78;
    private javax.swing.JButton jB79;
    private javax.swing.JButton jB8;
    private javax.swing.JButton jB80;
    private javax.swing.JButton jB81;
    private javax.swing.JButton jB82;
    private javax.swing.JButton jB83;
    private javax.swing.JButton jB84;
    private javax.swing.JButton jB85;
    private javax.swing.JButton jB86;
    private javax.swing.JButton jB87;
    private javax.swing.JButton jB88;
    private javax.swing.JButton jB89;
    private javax.swing.JButton jB9;
    private javax.swing.JButton jB90;
    private javax.swing.JButton jB91;
    private javax.swing.JButton jB92;
    private javax.swing.JButton jB93;
    private javax.swing.JButton jB94;
    private javax.swing.JButton jB95;
    private javax.swing.JButton jB96;
    private javax.swing.JButton jB97;
    private javax.swing.JButton jB98;
    private javax.swing.JButton jB99;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jpanel_type_jeu;
    // End of variables declaration                   
}
