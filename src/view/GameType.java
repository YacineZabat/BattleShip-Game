package view;

import java.util.ArrayList;
import controller.GameTypeController;
import model.Battle;

/**
 *
 * @author DELL
 */
public class GameType extends javax.swing.JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int battle_type = 0; 
    int battle_mode; 
    Battle battle; 
    ArrayList<Boolean> ship_choices = new ArrayList<>(); 
    
    public GameType() {
    	super("Game Type");
        initComponents();
    }
    
    public GameType(int battle_mode) {
    	super("Game Type");
        initComponents();
        this.battle_mode = battle_mode; 
        this.ship_choices.add(false); 
        this.ship_choices.add(false); 
        this.ship_choices.add(false); 
        this.ship_choices.add(false);
        this.ship_choices.add(false); 
               
    }

    private void initComponents() {

        jPanel_typeBataille = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton_precedent_page_type = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jCheckBox_choix1 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox_choix2 = new javax.swing.JCheckBox();
        jCheckBox_choix3 = new javax.swing.JCheckBox();
        jCheckBox_choix4 = new javax.swing.JCheckBox();
        jCheckBox_choix5 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        jLabel2.setText("Choisir le type de la bataille :");

        jButton_precedent_page_type.setText("Précedent");
        jButton_precedent_page_type.addActionListener(new GameTypeController(this));

        jComboBox1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bataille navale", "Mission radar", "Opération artillerie", "Alerte rouge" }));
        jComboBox1.addActionListener(new GameTypeController(this));

        jCheckBox_choix1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jCheckBox_choix1.setText("Porte-avion (5 cases)");
        jCheckBox_choix1.addActionListener(new GameTypeController(this));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        jLabel5.setText("Choisir les navires : ");

        jCheckBox_choix2.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jCheckBox_choix2.setText("Sous-marin nucléaire (4 cases)");
        jCheckBox_choix2.addActionListener(new GameTypeController(this));

        jCheckBox_choix3.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jCheckBox_choix3.setText("Cuirassé furtif 1 (3 cases)");
        jCheckBox_choix3.addActionListener(new GameTypeController(this));

        jCheckBox_choix4.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jCheckBox_choix4.setText("Cuirassé furtif 2 (3 cases)");
        jCheckBox_choix4.addActionListener(new GameTypeController(this));

        jCheckBox_choix5.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jCheckBox_choix5.setText("Zodiac de troupes d'interventions (2 cases)");
        jCheckBox_choix5.addActionListener(new GameTypeController(this));

        jButton3.setText("Suivant");
        jButton3.addActionListener(new GameTypeController(this));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BATAILLE NAVALE");
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel_typeBatailleLayout = new javax.swing.GroupLayout(jPanel_typeBataille);
        jPanel_typeBataille.setLayout(jPanel_typeBatailleLayout);
        jPanel_typeBatailleLayout.setHorizontalGroup(
            jPanel_typeBatailleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_typeBatailleLayout.createSequentialGroup()
                .addGroup(jPanel_typeBatailleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_typeBatailleLayout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addGroup(jPanel_typeBatailleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel_typeBatailleLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel_typeBatailleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox_choix2)
                                    .addComponent(jCheckBox_choix1)
                                    .addComponent(jCheckBox_choix3)
                                    .addComponent(jCheckBox_choix5)
                                    .addComponent(jCheckBox_choix4)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel_typeBatailleLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel_typeBatailleLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton_precedent_page_type, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_typeBatailleLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(37, 37, 37))
        );
        jPanel_typeBatailleLayout.setVerticalGroup(
            jPanel_typeBatailleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_typeBatailleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox_choix1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox_choix2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox_choix3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox_choix4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox_choix5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel_typeBatailleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_precedent_page_type, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel_typeBataille, "card4");

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
        // remplir les buttons valider
  
    //GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(GameType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameType().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton_precedent_page_type;
    private javax.swing.JCheckBox jCheckBox_choix1;
    private javax.swing.JCheckBox jCheckBox_choix2;
    private javax.swing.JCheckBox jCheckBox_choix3;
    private javax.swing.JCheckBox jCheckBox_choix4;
    private javax.swing.JCheckBox jCheckBox_choix5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel_typeBataille;
    // End of variables declaration//GEN-END:variables

	public int getBattle_type() {
		return battle_type;
	}

	public void setBattle_type(int battle_type) {
		this.battle_type = battle_type;
	}

	public int getBattle_mode() {
		return battle_mode;
	}

	public void setBattle_mode(int battle_mode) {
		this.battle_mode = battle_mode;
	}

	public Battle getBattle() {
		return battle;
	}

	public void setBattle(Battle battle) {
		this.battle = battle;
	}

	public ArrayList<Boolean> getShip_choices() {
		return ship_choices;
	}

	public void setShip_choices(ArrayList<Boolean> ship_choices) {
		this.ship_choices = ship_choices;
	}

	public javax.swing.JButton getjButton3() {
		return jButton3;
	}

	public void setjButton3(javax.swing.JButton jButton3) {
		this.jButton3 = jButton3;
	}

	public javax.swing.JButton getjButton_precedent_page_type() {
		return jButton_precedent_page_type;
	}

	public void setjButton_precedent_page_type(javax.swing.JButton jButton_precedent_page_type) {
		this.jButton_precedent_page_type = jButton_precedent_page_type;
	}

	public javax.swing.JCheckBox getjCheckBox_choix1() {
		return jCheckBox_choix1;
	}

	public void setjCheckBox_choix1(javax.swing.JCheckBox jCheckBox_choix1) {
		this.jCheckBox_choix1 = jCheckBox_choix1;
	}

	public javax.swing.JCheckBox getjCheckBox_choix2() {
		return jCheckBox_choix2;
	}

	public void setjCheckBox_choix2(javax.swing.JCheckBox jCheckBox_choix2) {
		this.jCheckBox_choix2 = jCheckBox_choix2;
	}

	public javax.swing.JCheckBox getjCheckBox_choix3() {
		return jCheckBox_choix3;
	}

	public void setjCheckBox_choix3(javax.swing.JCheckBox jCheckBox_choix3) {
		this.jCheckBox_choix3 = jCheckBox_choix3;
	}

	public javax.swing.JCheckBox getjCheckBox_choix4() {
		return jCheckBox_choix4;
	}

	public void setjCheckBox_choix4(javax.swing.JCheckBox jCheckBox_choix4) {
		this.jCheckBox_choix4 = jCheckBox_choix4;
	}

	public javax.swing.JCheckBox getjCheckBox_choix5() {
		return jCheckBox_choix5;
	}

	public void setjCheckBox_choix5(javax.swing.JCheckBox jCheckBox_choix5) {
		this.jCheckBox_choix5 = jCheckBox_choix5;
	}

	public javax.swing.JComboBox<String> getjComboBox1() {
		return jComboBox1;
	}

	public void setjComboBox1(javax.swing.JComboBox<String> jComboBox1) {
		this.jComboBox1 = jComboBox1;
	}

	public javax.swing.JLabel getjLabel1() {
		return jLabel1;
	}

	public void setjLabel1(javax.swing.JLabel jLabel1) {
		this.jLabel1 = jLabel1;
	}

	public javax.swing.JLabel getjLabel2() {
		return jLabel2;
	}

	public void setjLabel2(javax.swing.JLabel jLabel2) {
		this.jLabel2 = jLabel2;
	}

	public javax.swing.JLabel getjLabel5() {
		return jLabel5;
	}

	public void setjLabel5(javax.swing.JLabel jLabel5) {
		this.jLabel5 = jLabel5;
	}

	public javax.swing.JPanel getjPanel_typeBataille() {
		return jPanel_typeBataille;
	}

	public void setjPanel_typeBataille(javax.swing.JPanel jPanel_typeBataille) {
		this.jPanel_typeBataille = jPanel_typeBataille;
	}
}
