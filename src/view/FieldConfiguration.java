/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controller.FieldConfigurationController;
import model.Battle;
import model.Coordinates;
import model.Player;
import model.Position;
import model.Ship;
import model.ShipType;


public class FieldConfiguration extends javax.swing.JFrame {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Battle battle; 
    ArrayList<Boolean> ships_choices;
    JCheckBox[][] placements_navire; 
    ArrayList<JButton> buttons_valides;
    ArrayList<JCheckBox> deja_choisi; 
    int idPlayer;
    Player player;
    
    public FieldConfiguration() {
    	super("field Configuration");
        initComponents();
    }
    
    public FieldConfiguration(Battle battle, ArrayList<Boolean> ships_choices,int idPlayer) {

    
        this.battle = battle; 
        
        this.ships_choices = ships_choices; 
        placements_navire = new JCheckBox[10][10];
        // utiliser pour enable button suivant dans jpanel placement navires 
        buttons_valides = new ArrayList<>();
        // utiliser pour comparer les nouveau choix de navires avec l'ancien (placement navires)
        deja_choisi = new ArrayList<>(); 
     
    	if (idPlayer == 1)
    		player = battle.getPlayer1();
    	else
    		player  = battle.getPlayer2();
        initComponents();
        initialisation();
    }
 
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        valider_placement = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        p12 = new javax.swing.JLabel();
        p22 = new javax.swing.JLabel();
        p32 = new javax.swing.JLabel();
        p42 = new javax.swing.JLabel();
        p52 = new javax.swing.JLabel();
        p11 = new javax.swing.JButton();
        p21 = new javax.swing.JButton();
        p31 = new javax.swing.JButton();
        p41 = new javax.swing.JButton();
        p51 = new javax.swing.JButton();
        s0_0 = new javax.swing.JCheckBox();
        s0_1 = new javax.swing.JCheckBox();
        s0_2 = new javax.swing.JCheckBox();
        s0_3 = new javax.swing.JCheckBox();
        s0_4 = new javax.swing.JCheckBox();
        s0_5 = new javax.swing.JCheckBox();
        s0_6 = new javax.swing.JCheckBox();
        s0_7 = new javax.swing.JCheckBox();
        s0_8 = new javax.swing.JCheckBox();
        s0_9 = new javax.swing.JCheckBox();
        s0_11 = new javax.swing.JCheckBox();
        s0_12 = new javax.swing.JCheckBox();
        s0_13 = new javax.swing.JCheckBox();
        s0_14 = new javax.swing.JCheckBox();
        s0_15 = new javax.swing.JCheckBox();
        s0_16 = new javax.swing.JCheckBox();
        s0_17 = new javax.swing.JCheckBox();
        s0_18 = new javax.swing.JCheckBox();
        s0_19 = new javax.swing.JCheckBox();
        s0_10 = new javax.swing.JCheckBox();
        s0_20 = new javax.swing.JCheckBox();
        s0_21 = new javax.swing.JCheckBox();
        s0_22 = new javax.swing.JCheckBox();
        s0_23 = new javax.swing.JCheckBox();
        s0_24 = new javax.swing.JCheckBox();
        s0_25 = new javax.swing.JCheckBox();
        s0_26 = new javax.swing.JCheckBox();
        s0_27 = new javax.swing.JCheckBox();
        s0_28 = new javax.swing.JCheckBox();
        s0_29 = new javax.swing.JCheckBox();
        s0_30 = new javax.swing.JCheckBox();
        s0_31 = new javax.swing.JCheckBox();
        s0_32 = new javax.swing.JCheckBox();
        s0_33 = new javax.swing.JCheckBox();
        s0_34 = new javax.swing.JCheckBox();
        s0_35 = new javax.swing.JCheckBox();
        s0_36 = new javax.swing.JCheckBox();
        s0_37 = new javax.swing.JCheckBox();
        s0_38 = new javax.swing.JCheckBox();
        s0_39 = new javax.swing.JCheckBox();
        s0_40 = new javax.swing.JCheckBox();
        s0_41 = new javax.swing.JCheckBox();
        s0_42 = new javax.swing.JCheckBox();
        s0_43 = new javax.swing.JCheckBox();
        s0_44 = new javax.swing.JCheckBox();
        s0_45 = new javax.swing.JCheckBox();
        s0_46 = new javax.swing.JCheckBox();
        s0_47 = new javax.swing.JCheckBox();
        s0_48 = new javax.swing.JCheckBox();
        s0_49 = new javax.swing.JCheckBox();
        s0_50 = new javax.swing.JCheckBox();
        s0_51 = new javax.swing.JCheckBox();
        s0_52 = new javax.swing.JCheckBox();
        s0_53 = new javax.swing.JCheckBox();
        s0_54 = new javax.swing.JCheckBox();
        s0_55 = new javax.swing.JCheckBox();
        s0_56 = new javax.swing.JCheckBox();
        s0_57 = new javax.swing.JCheckBox();
        s0_58 = new javax.swing.JCheckBox();
        s0_59 = new javax.swing.JCheckBox();
        s0_60 = new javax.swing.JCheckBox();
        s0_61 = new javax.swing.JCheckBox();
        s0_62 = new javax.swing.JCheckBox();
        s0_63 = new javax.swing.JCheckBox();
        s0_64 = new javax.swing.JCheckBox();
        s0_65 = new javax.swing.JCheckBox();
        s0_66 = new javax.swing.JCheckBox();
        s0_67 = new javax.swing.JCheckBox();
        s0_68 = new javax.swing.JCheckBox();
        s0_69 = new javax.swing.JCheckBox();
        s0_70 = new javax.swing.JCheckBox();
        s0_71 = new javax.swing.JCheckBox();
        s0_72 = new javax.swing.JCheckBox();
        s0_73 = new javax.swing.JCheckBox();
        s0_74 = new javax.swing.JCheckBox();
        s0_75 = new javax.swing.JCheckBox();
        s0_76 = new javax.swing.JCheckBox();
        s0_77 = new javax.swing.JCheckBox();
        s0_78 = new javax.swing.JCheckBox();
        s0_79 = new javax.swing.JCheckBox();
        s0_80 = new javax.swing.JCheckBox();
        s0_81 = new javax.swing.JCheckBox();
        s0_82 = new javax.swing.JCheckBox();
        s0_83 = new javax.swing.JCheckBox();
        s0_84 = new javax.swing.JCheckBox();
        s0_85 = new javax.swing.JCheckBox();
        s0_86 = new javax.swing.JCheckBox();
        s0_87 = new javax.swing.JCheckBox();
        s0_88 = new javax.swing.JCheckBox();
        s0_89 = new javax.swing.JCheckBox();
        s0_90 = new javax.swing.JCheckBox();
        s0_91 = new javax.swing.JCheckBox();
        s0_92 = new javax.swing.JCheckBox();
        s0_93 = new javax.swing.JCheckBox();
        s0_94 = new javax.swing.JCheckBox();
        s0_95 = new javax.swing.JCheckBox();
        s0_96 = new javax.swing.JCheckBox();
        s0_97 = new javax.swing.JCheckBox();
        s0_98 = new javax.swing.JCheckBox();
        s0_99 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        valider_placement.setText("Suivant");
        valider_placement.setEnabled(false);
        valider_placement.addActionListener(new FieldConfigurationController(battle, this, ships_choices));

        
        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel6.setText("Player "+player.getId());

        p12.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        p12.setText("Porte-avoin (5 case)");
        p12.setEnabled(false);

        p22.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        p22.setText("Sous-marin nucléaire (4 cases)");
        p22.setEnabled(false);

        p32.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        p32.setText("Cuirassé furtif 1 (3 cases)");
        p32.setEnabled(false);

        p42.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        p42.setText("Cuirassé furtif 1 (3 cases)");
        p42.setEnabled(false);

        p52.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        p52.setText("Zodiac de troupes d'interventions (2 cases)");
        p52.setEnabled(false);

        p11.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        p11.setText("valider");
        p11.setEnabled(false);
        p11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p11ActionPerformed(evt);
            }
        });

        p21.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        p21.setText("valider");
        p21.setEnabled(false);
        p21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p21ActionPerformed(evt);
            }
        });

        p31.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        p31.setText("valider");
        p31.setEnabled(false);
        p31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p31ActionPerformed(evt);
            }
        });

        p41.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        p41.setText("valider");
        p41.setEnabled(false);
        p41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p41ActionPerformed(evt);
            }
        });

        p51.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        p51.setText("valider");
        p51.setEnabled(false);
        p51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p51ActionPerformed(evt);
            }
        });

        s0_0.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_0.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_0.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_0.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_0.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_1.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_1.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_1.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_2.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_2.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_2.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_3.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_3.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_3.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_4.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_4.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_4.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_5.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_5.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_5.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_6.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_6.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_6.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_7.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_7.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_7.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_8.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_8.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_8.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_8.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_9.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_9.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_9.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_9.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_11.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_11.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_11.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_11.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_12.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_12.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_12.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_12.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_13.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_13.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_13.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_13.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_14.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_14.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_14.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_14.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_15.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_15.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_15.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_15.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_16.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_16.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_16.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_16.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_17.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_17.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_17.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_17.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_18.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_18.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_18.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_18.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_19.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_19.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_19.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_19.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_10.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_10.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_10.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_10.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_20.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_20.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_20.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_20.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_21.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_21.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_21.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_21.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_22.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_22.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_22.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_22.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_23.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_23.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_23.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_23.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_24.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_24.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_24.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_24.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_24.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_25.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_25.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_25.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_25.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_25.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_26.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_26.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_26.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_26.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_26.setPreferredSize(new java.awt.Dimension(25, 25));
        s0_26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s0_26ActionPerformed(evt);
            }
        });

        s0_27.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_27.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_27.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_27.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_27.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_28.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_28.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_28.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_28.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_28.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_29.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_29.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_29.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_29.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_29.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_30.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_30.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_30.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_30.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_30.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_31.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_31.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_31.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_31.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_31.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_32.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_32.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_32.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_32.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_32.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_33.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_33.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_33.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_33.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_33.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_34.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_34.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_34.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_34.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_34.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_35.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_35.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_35.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_35.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_35.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_36.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_36.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_36.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_36.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_36.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_37.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_37.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_37.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_37.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_37.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_38.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_38.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_38.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_38.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_38.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_39.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_39.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_39.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_39.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_39.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_40.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_40.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_40.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_40.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_40.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_41.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_41.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_41.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_41.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_41.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_42.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_42.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_42.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_42.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_42.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_43.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_43.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_43.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_43.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_43.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_44.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_44.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_44.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_44.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_44.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_45.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_45.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_45.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_45.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_45.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_46.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_46.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_46.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_46.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_46.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_47.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_47.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_47.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_47.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_47.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_48.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_48.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_48.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_48.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_48.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_49.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_49.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_49.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_49.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_49.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_50.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_50.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_50.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_50.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_50.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_51.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_51.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_51.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_51.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_51.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_52.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_52.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_52.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_52.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_52.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_53.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_53.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_53.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_53.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_53.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_54.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_54.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_54.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_54.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_54.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_55.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_55.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_55.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_55.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_55.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_56.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_56.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_56.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_56.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_56.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_57.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_57.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_57.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_57.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_57.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_58.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_58.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_58.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_58.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_58.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_59.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_59.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_59.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_59.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_59.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_60.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_60.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_60.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_60.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_60.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_61.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_61.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_61.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_61.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_61.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_62.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_62.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_62.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_62.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_62.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_63.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_63.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_63.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_63.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_63.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_64.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_64.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_64.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_64.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_64.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_65.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_65.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_65.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_65.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_65.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_66.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_66.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_66.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_66.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_66.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_67.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_67.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_67.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_67.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_67.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_68.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_68.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_68.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_68.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_68.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_69.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_69.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_69.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_69.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_69.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_70.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_70.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_70.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_70.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_70.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_71.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_71.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_71.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_71.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_71.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_72.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_72.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_72.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_72.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_72.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_73.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_73.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_73.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_73.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_73.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_74.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_74.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_74.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_74.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_74.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_75.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_75.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_75.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_75.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_75.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_76.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_76.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_76.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_76.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_76.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_77.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_77.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_77.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_77.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_77.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_78.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_78.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_78.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_78.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_78.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_79.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_79.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_79.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_79.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_79.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_80.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_80.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_80.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_80.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_80.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_81.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_81.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_81.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_81.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_81.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_82.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_82.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_82.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_82.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_82.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_83.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_83.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_83.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_83.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_83.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_84.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_84.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_84.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_84.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_84.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_85.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_85.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_85.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_85.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_85.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_86.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_86.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_86.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_86.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_86.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_87.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_87.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_87.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_87.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_87.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_88.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_88.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_88.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_88.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_88.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_89.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_89.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_89.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_89.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_89.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_90.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_90.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_90.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_90.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_90.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_91.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_91.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_91.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_91.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_91.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_92.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_92.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_92.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_92.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_92.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_93.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_93.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_93.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_93.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_93.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_94.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_94.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_94.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_94.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_94.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_95.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_95.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_95.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_95.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_95.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_96.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_96.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_96.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_96.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_96.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_97.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_97.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_97.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_97.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_97.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_98.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_98.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_98.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_98.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_98.setPreferredSize(new java.awt.Dimension(25, 25));

        s0_99.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s0_99.setMargin(new java.awt.Insets(0, 0, 0, 0));
        s0_99.setMaximumSize(new java.awt.Dimension(40, 40));
        s0_99.setMinimumSize(new java.awt.Dimension(40, 40));
        s0_99.setPreferredSize(new java.awt.Dimension(25, 25));

        jButton1.setText("precedent");
        jButton1.addActionListener(new FieldConfigurationController(battle, this, ships_choices));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BATAILLE NAVALE");
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel7.setText("Placement des navires : ");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(p51)
                                .addGap(18, 18, 18)
                                .addComponent(p52))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(p21)
                                    .addComponent(p11)
                                    .addComponent(p31)
                                    .addComponent(p41))
                                .addGap(29, 29, 29)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(p42)
                                    .addComponent(p32)
                                    .addComponent(p12)
                                    .addComponent(p22)))
                            .addComponent(jLabel6)))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelLayout.createSequentialGroup()
                            .addComponent(s0_90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s0_91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s0_92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s0_93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s0_94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s0_95, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s0_96, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s0_97, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s0_98, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s0_99, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(s0_80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s0_81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s0_82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s0_83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s0_84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s0_85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s0_86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s0_87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s0_88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s0_89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(s0_70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s0_71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s0_72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s0_73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s0_74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s0_75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s0_76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s0_77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s0_78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s0_79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelLayout.createSequentialGroup()
                                                .addComponent(s0_20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(s0_21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(s0_22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(s0_23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(s0_24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(s0_25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(s0_26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(s0_27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(s0_28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(s0_29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanelLayout.createSequentialGroup()
                                                .addComponent(s0_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(s0_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(s0_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(s0_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(s0_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(s0_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(s0_16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(s0_17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(s0_18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(s0_19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanelLayout.createSequentialGroup()
                                            .addComponent(s0_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(s0_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(s0_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(s0_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(s0_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(s0_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(s0_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(s0_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(s0_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(s0_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addComponent(s0_30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(s0_31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(s0_32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(s0_33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(s0_34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(s0_35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(s0_36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(s0_37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(s0_38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(s0_39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addComponent(s0_40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(s0_41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(s0_42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(s0_43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(s0_44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(s0_45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(s0_46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(s0_47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(s0_48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(s0_49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addComponent(s0_50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(s0_51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(s0_52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(s0_53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(s0_54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(s0_55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(s0_56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(s0_57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(s0_58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(s0_59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanelLayout.createSequentialGroup()
                                    .addComponent(s0_60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(s0_61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(s0_62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(s0_63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(s0_64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(s0_65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(s0_66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(s0_67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(s0_68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(s0_69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(valider_placement, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLayout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addComponent(jLabel7)
                    .addContainerGap(796, Short.MAX_VALUE)))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel6)
                .addGap(14, 14, 14)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(s0_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(s0_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(s0_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(s0_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(s0_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(s0_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s0_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(s0_20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(s0_23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(s0_22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s0_29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(s0_30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(s0_33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(s0_32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s0_39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(s0_40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(s0_43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(s0_42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s0_49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(s0_50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(s0_53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(s0_52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s0_59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(s0_60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(s0_63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(s0_62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s0_69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(s0_70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(s0_73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(s0_72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s0_79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(s0_80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(s0_83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(s0_82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s0_89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(s0_90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(s0_93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_95, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_96, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_97, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s0_98, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(s0_92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s0_99, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valider_placement, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p12)
                            .addComponent(p11))
                        .addGap(25, 25, 25)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p21)
                            .addComponent(p22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p32)
                            .addComponent(p31))
                        .addGap(22, 22, 22)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p41)
                            .addComponent(p42))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p51)
                            .addComponent(p52))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLayout.createSequentialGroup()
                    .addGap(168, 168, 168)
                    .addComponent(jLabel7)
                    .addContainerGap(452, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel, "card6");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void p11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p11ActionPerformed
        try {
            ArrayList<Coordinates> newplaces;
            newplaces = recupererNouveauTirs_sans_save();
            System.out.println(newplaces);
            if(newplaces.size() != 5){
                JOptionPane.showMessageDialog(null,"La taille de navire doit être égale à 5");
            }

            else if(Coordinates.getPositionOfCoordinates(newplaces) == null){
                JOptionPane.showMessageDialog(null,"Les positions de navire doivent être alignées ");
            }

            else{
                // recuperer les nouveau placeement
                newplaces = recupererNouveauTirs();
                // disable it
                disableCases_with_borders(newplaces);
                p11.setEnabled(false);
                p12.setForeground(Color.blue);

                // set data for player 1 or 2
                Ship ship = new Ship(ShipType.AircraftCarrier);
                Position position = Coordinates.getPositionOfCoordinates(newplaces);

                player.getBattlefield().addShip(ship, position);
              
            }

        } catch (Exception ex) {
            Logger.getLogger(Principale.class.getName()).log(Level.SEVERE, null, ex);
        }

        // enable button suivant
        boolean en = true;
        for (JButton buttons_valide : buttons_valides) {
            if(buttons_valide.isEnabled()){
                en = false;
                break;
            }
        }
        if(en){
            valider_placement.setEnabled(true);
        }
        else{
            valider_placement.setEnabled(false);
        }

    }//GEN-LAST:event_p11ActionPerformed

    private void p21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p21ActionPerformed
        try {
            ArrayList<Coordinates> newplaces;
            newplaces = recupererNouveauTirs_sans_save();
            if(newplaces.size() != 4){
                JOptionPane.showMessageDialog(null,"La taille de navire doit être égale à 4");
            }
            else if(Coordinates.getPositionOfCoordinates(newplaces) == null){
                JOptionPane.showMessageDialog(null,"Les positions de navire doivent être alignées ");
            }
            

            else{
                // recuperer les nouveau placeement
                newplaces = recupererNouveauTirs();
                // disable it
                disableCases_with_borders(newplaces);
                p21.setEnabled(false);
                p22.setForeground(Color.blue);

                // set data for player 1 or 2
                Ship ship = new Ship(ShipType.NuclearSubmarine);
                Position position = Coordinates.getPositionOfCoordinates(newplaces);

                
                player.getBattlefield().addShip(ship, position);
               
            }

        } catch (Exception ex) {
            Logger.getLogger(Principale.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean en = true;
        for (JButton buttons_valide : buttons_valides) {
            if(buttons_valide.isEnabled()){
                en = false;
                break;
            }
        }
        if(en){
            valider_placement.setEnabled(true);
        }
        else{
            valider_placement.setEnabled(false);
        }
    }//GEN-LAST:event_p21ActionPerformed

    private void p31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p31ActionPerformed
        try {
            ArrayList<Coordinates> newplaces;
            newplaces = recupererNouveauTirs_sans_save();
            if(newplaces.size() != 3){
                JOptionPane.showMessageDialog(null,"La taille de navire doit être égale à 3");
            }

            else if(Coordinates.getPositionOfCoordinates(newplaces) == null){
                JOptionPane.showMessageDialog(null,"Les positions de navire doivent être alignées ");
            }

            else{
                // recuperer les nouveau placeement
                newplaces = recupererNouveauTirs();
                // disable it
                disableCases_with_borders(newplaces);
                p31.setEnabled(false);
                p32.setForeground(Color.blue);

                // set data for player 1 or 2
                Ship ship = new Ship(ShipType.Ironclad);
                Position position = Coordinates.getPositionOfCoordinates(newplaces);

                player.getBattlefield().addShip(ship, position);
               
            }

        } catch (Exception ex) {
            Logger.getLogger(Principale.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean en = true;
        for (JButton buttons_valide : buttons_valides) {
            if(buttons_valide.isEnabled()){
                en = false;
                break;
            }
        }
        if(en){
            valider_placement.setEnabled(true);
        }
        else{
            valider_placement.setEnabled(false);
        }
    }//GEN-LAST:event_p31ActionPerformed

    private void p41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p41ActionPerformed
        try {
            ArrayList<Coordinates> newplaces;
            newplaces = recupererNouveauTirs_sans_save();
            if(newplaces.size() != 3){
                JOptionPane.showMessageDialog(null,"La taille de navire doit être égale à 3");
            }

            else if(Coordinates.getPositionOfCoordinates(newplaces) == null){
                JOptionPane.showMessageDialog(null,"Les positions de navire doivent être alignées ");
            }

            else{
                // recuperer les nouveau placeement
                newplaces = recupererNouveauTirs();
                // disable it
                disableCases_with_borders(newplaces);
                p41.setEnabled(false);
                p42.setForeground(Color.blue);

                // set data for player 1 or 2
                Ship ship = new Ship(ShipType.Ironclad);
                Position position = Coordinates.getPositionOfCoordinates(newplaces);

                player.getBattlefield().addShip(ship, position);
                
            }

        } catch (Exception ex) {
            Logger.getLogger(Principale.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean en = true;
        for (JButton buttons_valide : buttons_valides) {
            if(buttons_valide.isEnabled()){
                en = false;
                break;
            }
        }
        if(en){
            valider_placement.setEnabled(true);
        }
        else{
            valider_placement.setEnabled(false);
        }
    }//GEN-LAST:event_p41ActionPerformed

    private void p51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p51ActionPerformed
        try {
            ArrayList<Coordinates> newplaces;
            newplaces = recupererNouveauTirs_sans_save();
            if(newplaces.size() != 2){
                JOptionPane.showMessageDialog(null,"La taille de navire doit être égale à 2");
            }

            else if(Coordinates.getPositionOfCoordinates(newplaces) == null){
                JOptionPane.showMessageDialog(null,"Les positions de navire doivent être alignées ");
            }

            else{
                // recuperer les nouveau placeement
                newplaces = recupererNouveauTirs();
                // disable it
                disableCases_with_borders(newplaces);
                p51.setEnabled(false);
                p52.setForeground(Color.blue);

                // set data for player 1 or 2
                Ship ship = new Ship(ShipType.Zodiac);
                Position position = Coordinates.getPositionOfCoordinates(newplaces);

                player.getBattlefield().addShip(ship, position);
               
            }

        } catch (Exception ex) {
            Logger.getLogger(Principale.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean en = true;
        for (JButton buttons_valide : buttons_valides) {
            if(buttons_valide.isEnabled()){
                en = false;
                break;
            }
        }
        if(en){
            valider_placement.setEnabled(true);
        }
        else{
            valider_placement.setEnabled(false);
        }
    }//GEN-LAST:event_p51ActionPerformed

    private void s0_26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s0_26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s0_26ActionPerformed

    private void initialisation(){
         // remplir les buttons valider 
        buttons_valides.add(p11); 
        buttons_valides.add(p21); 
        buttons_valides.add(p31); 
        buttons_valides.add(p41); 
        buttons_valides.add(p51); 

        // remplir la matrice de checkbox
        placements_navire[0][0] = s0_0;
        placements_navire[0][1] = s0_1;
        placements_navire[0][2] = s0_2;
        placements_navire[0][3] = s0_3;
        placements_navire[0][4] = s0_4;
        placements_navire[0][5] = s0_5;
        placements_navire[0][6] = s0_6;
        placements_navire[0][7] = s0_7;
        placements_navire[0][8] = s0_8;
        placements_navire[0][9] = s0_9;
        placements_navire[1][0] = s0_10;
        placements_navire[1][1] = s0_11;
        placements_navire[1][2] = s0_12;
        placements_navire[1][3] = s0_13;
        placements_navire[1][4] = s0_14;
        placements_navire[1][5] = s0_15;
        placements_navire[1][6] = s0_16;
        placements_navire[1][7] = s0_17;
        placements_navire[1][8] = s0_18;
        placements_navire[1][9] = s0_19;
        placements_navire[2][0] = s0_20;
        placements_navire[2][1] = s0_21;
        placements_navire[2][2] = s0_22;
        placements_navire[2][3] = s0_23;
        placements_navire[2][4] = s0_24;
        placements_navire[2][5] = s0_25;
        placements_navire[2][6] = s0_26;
        placements_navire[2][7] = s0_27;
        placements_navire[2][8] = s0_28;
        placements_navire[2][9] = s0_29;
        placements_navire[3][0] = s0_30;
        placements_navire[3][1] = s0_31;
        placements_navire[3][2] = s0_32;
        placements_navire[3][3] = s0_33;
        placements_navire[3][4] = s0_34;
        placements_navire[3][5] = s0_35;
        placements_navire[3][6] = s0_36;
        placements_navire[3][7] = s0_37;
        placements_navire[3][8] = s0_38;
        placements_navire[3][9] = s0_39;
        placements_navire[4][0] = s0_40;
        placements_navire[4][1] = s0_41;
        placements_navire[4][2] = s0_42;
        placements_navire[4][3] = s0_43;
        placements_navire[4][4] = s0_44;
        placements_navire[4][5] = s0_45;
        placements_navire[4][6] = s0_46;
        placements_navire[4][7] = s0_47;
        placements_navire[4][8] = s0_48;
        placements_navire[4][9] = s0_49;
        placements_navire[5][0] = s0_50;
        placements_navire[5][1] = s0_51;
        placements_navire[5][2] = s0_52;
        placements_navire[5][3] = s0_53;
        placements_navire[5][4] = s0_54;
        placements_navire[5][5] = s0_55;
        placements_navire[5][6] = s0_56;
        placements_navire[5][7] = s0_57;
        placements_navire[5][8] = s0_58;
        placements_navire[5][9] = s0_59;
        placements_navire[6][0] = s0_60;
        placements_navire[6][1] = s0_61;
        placements_navire[6][2] = s0_62;
        placements_navire[6][3] = s0_63;
        placements_navire[6][4] = s0_64;
        placements_navire[6][5] = s0_65;
        placements_navire[6][6] = s0_66;
        placements_navire[6][7] = s0_67;
        placements_navire[6][8] = s0_68;
        placements_navire[6][9] = s0_69;
        placements_navire[7][0] = s0_70;
        placements_navire[7][1] = s0_71;
        placements_navire[7][2] = s0_72;
        placements_navire[7][3] = s0_73;
        placements_navire[7][4] = s0_74;
        placements_navire[7][5] = s0_75;
        placements_navire[7][6] = s0_76;
        placements_navire[7][7] = s0_77;
        placements_navire[7][8] = s0_78;
        placements_navire[7][9] = s0_79;
        placements_navire[8][0] = s0_80;
        placements_navire[8][1] = s0_81;
        placements_navire[8][2] = s0_82;
        placements_navire[8][3] = s0_83;
        placements_navire[8][4] = s0_84;
        placements_navire[8][5] = s0_85;
        placements_navire[8][6] = s0_86;
        placements_navire[8][7] = s0_87;
        placements_navire[8][8] = s0_88;
        placements_navire[8][9] = s0_89;
        placements_navire[9][0] = s0_90;
        placements_navire[9][1] = s0_91;
        placements_navire[9][2] = s0_92;
        placements_navire[9][3] = s0_93;
        placements_navire[9][4] = s0_94;
        placements_navire[9][5] = s0_95;
        placements_navire[9][6] = s0_96;
        placements_navire[9][7] = s0_97;
        placements_navire[9][8] = s0_98;
        placements_navire[9][9] = s0_99;
        
        // didable or enable button
        p11.setEnabled(ships_choices.get(0));
        p12.setEnabled(ships_choices.get(0));
        p21.setEnabled(ships_choices.get(1));
        p22.setEnabled(ships_choices.get(1));
        p31.setEnabled(ships_choices.get(2));
        p32.setEnabled(ships_choices.get(2));
        p41.setEnabled(ships_choices.get(3));
        p42.setEnabled(ships_choices.get(3));
        p51.setEnabled(ships_choices.get(4));
        p52.setEnabled(ships_choices.get(4));
        
    } 
    
     
    public void disableCases_with_borders(ArrayList<Coordinates> listCoordinates){
        for (Coordinates l : listCoordinates) {
            int i = l.getI(); 
            int j = l.getJ(); 
            placements_navire[i][j].setEnabled(false);
            // disable border
            
            if(i> 0){
                placements_navire[i-1][j].setEnabled(false);
            }
             if(i < 9){
                placements_navire[i+1][j].setEnabled(false);
            }
              if(j> 0){
                placements_navire[i][j-1].setEnabled(false);
            }
             if(j < 9){
                placements_navire[i][j+1].setEnabled(false);
            }
             
            if(i> 0 && j > 0){
                placements_navire[i-1][j-1].setEnabled(false);
            }
            
          
              if(i<9 && j <9){
                placements_navire[i+1][j+1].setEnabled(false);
            }
              
            if(i> 0 && j < 9){
                placements_navire[i-1][j+1].setEnabled(false);
            }
            
              if(i<9 && j >0){
                placements_navire[i+1][j-1].setEnabled(false);
            }     
        }
    }
    
     public ArrayList<Coordinates> recupererNouveauTirs_sans_save() throws Exception{
         ArrayList<Coordinates> nouveauTir = new ArrayList<>(); 
        
        for(int i=0; i<10; i++){
            for(int j =0; j<10; j++){
                if(deja_choisi.contains(placements_navire[i][j]) == false && placements_navire[i][j].isSelected()){
                    Coordinates c = new Coordinates(i,j); 
                    nouveauTir.add(c);  
                }
            }
        }
        return nouveauTir;  
    }
    
    public ArrayList<Coordinates> recupererNouveauTirs() throws Exception{
         ArrayList<Coordinates> nouveauTir = new ArrayList<>(); 
        
        for(int i=0; i<10; i++){
            for(int j =0; j<10; j++){
                if(deja_choisi.contains(placements_navire[i][j]) == false && placements_navire[i][j].isSelected()){
                    deja_choisi.add(placements_navire[i][j]); 
                    Coordinates c = new Coordinates(i,j); 
                    nouveauTir.add(c);  
                }
            }
        }
        return nouveauTir; 
    }
    

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
            java.util.logging.Logger.getLogger(FieldConfiguration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FieldConfiguration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FieldConfiguration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FieldConfiguration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FieldConfiguration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel;
    private javax.swing.JButton p11;
    private javax.swing.JLabel p12;
    private javax.swing.JButton p21;
    private javax.swing.JLabel p22;
    private javax.swing.JButton p31;
    private javax.swing.JLabel p32;
    private javax.swing.JButton p41;
    private javax.swing.JLabel p42;
    private javax.swing.JButton p51;
    private javax.swing.JLabel p52;
    private javax.swing.JCheckBox s0_0;
    private javax.swing.JCheckBox s0_1;
    private javax.swing.JCheckBox s0_10;
    private javax.swing.JCheckBox s0_11;
    private javax.swing.JCheckBox s0_12;
    private javax.swing.JCheckBox s0_13;
    private javax.swing.JCheckBox s0_14;
    private javax.swing.JCheckBox s0_15;
    private javax.swing.JCheckBox s0_16;
    private javax.swing.JCheckBox s0_17;
    private javax.swing.JCheckBox s0_18;
    private javax.swing.JCheckBox s0_19;
    private javax.swing.JCheckBox s0_2;
    private javax.swing.JCheckBox s0_20;
    private javax.swing.JCheckBox s0_21;
    private javax.swing.JCheckBox s0_22;
    private javax.swing.JCheckBox s0_23;
    private javax.swing.JCheckBox s0_24;
    private javax.swing.JCheckBox s0_25;
    private javax.swing.JCheckBox s0_26;
    private javax.swing.JCheckBox s0_27;
    private javax.swing.JCheckBox s0_28;
    private javax.swing.JCheckBox s0_29;
    private javax.swing.JCheckBox s0_3;
    private javax.swing.JCheckBox s0_30;
    private javax.swing.JCheckBox s0_31;
    private javax.swing.JCheckBox s0_32;
    private javax.swing.JCheckBox s0_33;
    private javax.swing.JCheckBox s0_34;
    private javax.swing.JCheckBox s0_35;
    private javax.swing.JCheckBox s0_36;
    private javax.swing.JCheckBox s0_37;
    private javax.swing.JCheckBox s0_38;
    private javax.swing.JCheckBox s0_39;
    private javax.swing.JCheckBox s0_4;
    private javax.swing.JCheckBox s0_40;
    private javax.swing.JCheckBox s0_41;
    private javax.swing.JCheckBox s0_42;
    private javax.swing.JCheckBox s0_43;
    private javax.swing.JCheckBox s0_44;
    private javax.swing.JCheckBox s0_45;
    private javax.swing.JCheckBox s0_46;
    private javax.swing.JCheckBox s0_47;
    private javax.swing.JCheckBox s0_48;
    private javax.swing.JCheckBox s0_49;
    private javax.swing.JCheckBox s0_5;
    private javax.swing.JCheckBox s0_50;
    private javax.swing.JCheckBox s0_51;
    private javax.swing.JCheckBox s0_52;
    private javax.swing.JCheckBox s0_53;
    private javax.swing.JCheckBox s0_54;
    private javax.swing.JCheckBox s0_55;
    private javax.swing.JCheckBox s0_56;
    private javax.swing.JCheckBox s0_57;
    private javax.swing.JCheckBox s0_58;
    private javax.swing.JCheckBox s0_59;
    private javax.swing.JCheckBox s0_6;
    private javax.swing.JCheckBox s0_60;
    private javax.swing.JCheckBox s0_61;
    private javax.swing.JCheckBox s0_62;
    private javax.swing.JCheckBox s0_63;
    private javax.swing.JCheckBox s0_64;
    private javax.swing.JCheckBox s0_65;
    private javax.swing.JCheckBox s0_66;
    private javax.swing.JCheckBox s0_67;
    private javax.swing.JCheckBox s0_68;
    private javax.swing.JCheckBox s0_69;
    private javax.swing.JCheckBox s0_7;
    private javax.swing.JCheckBox s0_70;
    private javax.swing.JCheckBox s0_71;
    private javax.swing.JCheckBox s0_72;
    private javax.swing.JCheckBox s0_73;
    private javax.swing.JCheckBox s0_74;
    private javax.swing.JCheckBox s0_75;
    private javax.swing.JCheckBox s0_76;
    private javax.swing.JCheckBox s0_77;
    private javax.swing.JCheckBox s0_78;
    private javax.swing.JCheckBox s0_79;
    private javax.swing.JCheckBox s0_8;
    private javax.swing.JCheckBox s0_80;
    private javax.swing.JCheckBox s0_81;
    private javax.swing.JCheckBox s0_82;
    private javax.swing.JCheckBox s0_83;
    private javax.swing.JCheckBox s0_84;
    private javax.swing.JCheckBox s0_85;
    private javax.swing.JCheckBox s0_86;
    private javax.swing.JCheckBox s0_87;
    private javax.swing.JCheckBox s0_88;
    private javax.swing.JCheckBox s0_89;
    private javax.swing.JCheckBox s0_9;
    private javax.swing.JCheckBox s0_90;
    private javax.swing.JCheckBox s0_91;
    private javax.swing.JCheckBox s0_92;
    private javax.swing.JCheckBox s0_93;
    private javax.swing.JCheckBox s0_94;
    private javax.swing.JCheckBox s0_95;
    private javax.swing.JCheckBox s0_96;
    private javax.swing.JCheckBox s0_97;
    private javax.swing.JCheckBox s0_98;
    private javax.swing.JCheckBox s0_99;
    private javax.swing.JButton valider_placement;
    // End of variables declaration//GEN-END:variables

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Battle getBattle() {
		return battle;
	}

	public ArrayList<Boolean> getShips_choices() {
		return ships_choices;
	}

	public JCheckBox[][] getPlacements_navire() {
		return placements_navire;
	}

	public ArrayList<JButton> getButtons_valides() {
		return buttons_valides;
	}

	public ArrayList<JCheckBox> getDeja_choisi() {
		return deja_choisi;
	}

	public int getIdPlayer() {
		return idPlayer;
	}

	public Player getPlayer() {
		return player;
	}

	public javax.swing.JButton getjButton1() {
		return jButton1;
	}

	public javax.swing.JLabel getjLabel1() {
		return jLabel1;
	}

	public javax.swing.JLabel getjLabel6() {
		return jLabel6;
	}

	public javax.swing.JLabel getjLabel7() {
		return jLabel7;
	}

	public javax.swing.JPanel getjPanel() {
		return jPanel;
	}

	public javax.swing.JButton getP11() {
		return p11;
	}

	public javax.swing.JLabel getP12() {
		return p12;
	}

	public javax.swing.JButton getP21() {
		return p21;
	}

	public javax.swing.JLabel getP22() {
		return p22;
	}

	public javax.swing.JButton getP31() {
		return p31;
	}

	public javax.swing.JLabel getP32() {
		return p32;
	}

	public javax.swing.JButton getP41() {
		return p41;
	}

	public javax.swing.JLabel getP42() {
		return p42;
	}

	public javax.swing.JButton getP51() {
		return p51;
	}

	public javax.swing.JLabel getP52() {
		return p52;
	}

	public javax.swing.JCheckBox getS0_0() {
		return s0_0;
	}

	public javax.swing.JCheckBox getS0_1() {
		return s0_1;
	}

	public javax.swing.JCheckBox getS0_10() {
		return s0_10;
	}

	public javax.swing.JCheckBox getS0_11() {
		return s0_11;
	}

	public javax.swing.JCheckBox getS0_12() {
		return s0_12;
	}

	public javax.swing.JCheckBox getS0_13() {
		return s0_13;
	}

	public javax.swing.JCheckBox getS0_14() {
		return s0_14;
	}

	public javax.swing.JCheckBox getS0_15() {
		return s0_15;
	}

	public javax.swing.JCheckBox getS0_16() {
		return s0_16;
	}

	public javax.swing.JCheckBox getS0_17() {
		return s0_17;
	}

	public javax.swing.JCheckBox getS0_18() {
		return s0_18;
	}

	public javax.swing.JCheckBox getS0_19() {
		return s0_19;
	}

	public javax.swing.JCheckBox getS0_2() {
		return s0_2;
	}

	public javax.swing.JCheckBox getS0_20() {
		return s0_20;
	}

	public javax.swing.JCheckBox getS0_21() {
		return s0_21;
	}

	public javax.swing.JCheckBox getS0_22() {
		return s0_22;
	}

	public javax.swing.JCheckBox getS0_23() {
		return s0_23;
	}

	public javax.swing.JCheckBox getS0_24() {
		return s0_24;
	}

	public javax.swing.JCheckBox getS0_25() {
		return s0_25;
	}

	public javax.swing.JCheckBox getS0_26() {
		return s0_26;
	}

	public javax.swing.JCheckBox getS0_27() {
		return s0_27;
	}

	public javax.swing.JCheckBox getS0_28() {
		return s0_28;
	}

	public javax.swing.JCheckBox getS0_29() {
		return s0_29;
	}

	public javax.swing.JCheckBox getS0_3() {
		return s0_3;
	}

	public javax.swing.JCheckBox getS0_30() {
		return s0_30;
	}

	public javax.swing.JCheckBox getS0_31() {
		return s0_31;
	}

	public javax.swing.JCheckBox getS0_32() {
		return s0_32;
	}

	public javax.swing.JCheckBox getS0_33() {
		return s0_33;
	}

	public javax.swing.JCheckBox getS0_34() {
		return s0_34;
	}

	public javax.swing.JCheckBox getS0_35() {
		return s0_35;
	}

	public javax.swing.JCheckBox getS0_36() {
		return s0_36;
	}

	public javax.swing.JCheckBox getS0_37() {
		return s0_37;
	}

	public javax.swing.JCheckBox getS0_38() {
		return s0_38;
	}

	public javax.swing.JCheckBox getS0_39() {
		return s0_39;
	}

	public javax.swing.JCheckBox getS0_4() {
		return s0_4;
	}

	public javax.swing.JCheckBox getS0_40() {
		return s0_40;
	}

	public javax.swing.JCheckBox getS0_41() {
		return s0_41;
	}

	public javax.swing.JCheckBox getS0_42() {
		return s0_42;
	}

	public javax.swing.JCheckBox getS0_43() {
		return s0_43;
	}

	public javax.swing.JCheckBox getS0_44() {
		return s0_44;
	}

	public javax.swing.JCheckBox getS0_45() {
		return s0_45;
	}

	public javax.swing.JCheckBox getS0_46() {
		return s0_46;
	}

	public javax.swing.JCheckBox getS0_47() {
		return s0_47;
	}

	public javax.swing.JCheckBox getS0_48() {
		return s0_48;
	}

	public javax.swing.JCheckBox getS0_49() {
		return s0_49;
	}

	public javax.swing.JCheckBox getS0_5() {
		return s0_5;
	}

	public javax.swing.JCheckBox getS0_50() {
		return s0_50;
	}

	public javax.swing.JCheckBox getS0_51() {
		return s0_51;
	}

	public javax.swing.JCheckBox getS0_52() {
		return s0_52;
	}

	public javax.swing.JCheckBox getS0_53() {
		return s0_53;
	}

	public javax.swing.JCheckBox getS0_54() {
		return s0_54;
	}

	public javax.swing.JCheckBox getS0_55() {
		return s0_55;
	}

	public javax.swing.JCheckBox getS0_56() {
		return s0_56;
	}

	public javax.swing.JCheckBox getS0_57() {
		return s0_57;
	}

	public javax.swing.JCheckBox getS0_58() {
		return s0_58;
	}

	public javax.swing.JCheckBox getS0_59() {
		return s0_59;
	}

	public javax.swing.JCheckBox getS0_6() {
		return s0_6;
	}

	public javax.swing.JCheckBox getS0_60() {
		return s0_60;
	}

	public javax.swing.JCheckBox getS0_61() {
		return s0_61;
	}

	public javax.swing.JCheckBox getS0_62() {
		return s0_62;
	}

	public javax.swing.JCheckBox getS0_63() {
		return s0_63;
	}

	public javax.swing.JCheckBox getS0_64() {
		return s0_64;
	}

	public javax.swing.JCheckBox getS0_65() {
		return s0_65;
	}

	public javax.swing.JCheckBox getS0_66() {
		return s0_66;
	}

	public javax.swing.JCheckBox getS0_67() {
		return s0_67;
	}

	public javax.swing.JCheckBox getS0_68() {
		return s0_68;
	}

	public javax.swing.JCheckBox getS0_69() {
		return s0_69;
	}

	public javax.swing.JCheckBox getS0_7() {
		return s0_7;
	}

	public javax.swing.JCheckBox getS0_70() {
		return s0_70;
	}

	public javax.swing.JCheckBox getS0_71() {
		return s0_71;
	}

	public javax.swing.JCheckBox getS0_72() {
		return s0_72;
	}

	public javax.swing.JCheckBox getS0_73() {
		return s0_73;
	}

	public javax.swing.JCheckBox getS0_74() {
		return s0_74;
	}

	public javax.swing.JCheckBox getS0_75() {
		return s0_75;
	}

	public javax.swing.JCheckBox getS0_76() {
		return s0_76;
	}

	public javax.swing.JCheckBox getS0_77() {
		return s0_77;
	}

	public javax.swing.JCheckBox getS0_78() {
		return s0_78;
	}

	public javax.swing.JCheckBox getS0_79() {
		return s0_79;
	}

	public javax.swing.JCheckBox getS0_8() {
		return s0_8;
	}

	public javax.swing.JCheckBox getS0_80() {
		return s0_80;
	}

	public javax.swing.JCheckBox getS0_81() {
		return s0_81;
	}

	public javax.swing.JCheckBox getS0_82() {
		return s0_82;
	}

	public javax.swing.JCheckBox getS0_83() {
		return s0_83;
	}

	public javax.swing.JCheckBox getS0_84() {
		return s0_84;
	}

	public javax.swing.JCheckBox getS0_85() {
		return s0_85;
	}

	public javax.swing.JCheckBox getS0_86() {
		return s0_86;
	}

	public javax.swing.JCheckBox getS0_87() {
		return s0_87;
	}

	public javax.swing.JCheckBox getS0_88() {
		return s0_88;
	}

	public javax.swing.JCheckBox getS0_89() {
		return s0_89;
	}

	public javax.swing.JCheckBox getS0_9() {
		return s0_9;
	}

	public javax.swing.JCheckBox getS0_90() {
		return s0_90;
	}

	public javax.swing.JCheckBox getS0_91() {
		return s0_91;
	}

	public javax.swing.JCheckBox getS0_92() {
		return s0_92;
	}

	public javax.swing.JCheckBox getS0_93() {
		return s0_93;
	}

	public javax.swing.JCheckBox getS0_94() {
		return s0_94;
	}

	public javax.swing.JCheckBox getS0_95() {
		return s0_95;
	}

	public javax.swing.JCheckBox getS0_96() {
		return s0_96;
	}

	public javax.swing.JCheckBox getS0_97() {
		return s0_97;
	}

	public javax.swing.JCheckBox getS0_98() {
		return s0_98;
	}

	public javax.swing.JCheckBox getS0_99() {
		return s0_99;
	}

	public javax.swing.JButton getValider_placement() {
		return valider_placement;
	}
}
