package view;

import controller.GameModeController;

public class GameMode extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int battle_mode = 0 ; 
    public GameMode() {
    	super("GameMode");
        initComponents();
    }

    private void initComponents() {

        jpanel_type_jeu = new javax.swing.JPanel();
        jButton_demo = new javax.swing.JButton();
        jButton_1jouer = new javax.swing.JButton();
        jButton_2jouers = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jButton_demo.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jButton_demo.setText("Démo");
        jButton_demo.setAlignmentX(0.5F);
        jButton_demo.addActionListener(new GameModeController(this));

        jButton_1jouer.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jButton_1jouer.setText("1 joueur");
        jButton_1jouer.addActionListener(new GameModeController(this));

        jButton_2jouers.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jButton_2jouers.setText("2 Joueurs");
        jButton_2jouers.addActionListener(new GameModeController(this));
        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        jLabel3.setText("Choisir le type de jeu :");

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BATAILLE NAVALE");
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jpanel_type_jeuLayout = new javax.swing.GroupLayout(jpanel_type_jeu);
        jpanel_type_jeu.setLayout(jpanel_type_jeuLayout);
        jpanel_type_jeuLayout.setHorizontalGroup(
            jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
                .addGap(415, 415, 415)
                .addGroup(jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_demo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_1jouer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_2jouers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(426, Short.MAX_VALUE))
            .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        
        jpanel_type_jeuLayout.setVerticalGroup(
            jpanel_type_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_type_jeuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addGap(61, 61, 61)
                .addComponent(jButton_demo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton_1jouer, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton_2jouers, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        getContentPane().add(jpanel_type_jeu, "card2");

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
            java.util.logging.Logger.getLogger(GameMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameMode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_1jouer;
    private javax.swing.JButton jButton_2jouers;
    private javax.swing.JButton jButton_demo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jpanel_type_jeu;
    // End of variables declaration//GEN-END:variables
	public int getBattle_mode() {
		return battle_mode;
	}

	public javax.swing.JButton getjButton_1jouer() {
		return jButton_1jouer;
	}

	public javax.swing.JButton getjButton_2jouers() {
		return jButton_2jouers;
	}

	public javax.swing.JButton getjButton_demo() {
		return jButton_demo;
	}

	public javax.swing.JLabel getjLabel1() {
		return jLabel1;
	}

	public javax.swing.JLabel getjLabel3() {
		return jLabel3;
	}

	public javax.swing.JPanel getJpanel_type_jeu() {
		return jpanel_type_jeu;
	}

	public void setBattle_mode(int battle_mode) {
		this.battle_mode = battle_mode;
	}

	public void setjButton_1jouer(javax.swing.JButton jButton_1jouer) {
		this.jButton_1jouer = jButton_1jouer;
	}

	public void setjButton_2jouers(javax.swing.JButton jButton_2jouers) {
		this.jButton_2jouers = jButton_2jouers;
	}

	public void setjButton_demo(javax.swing.JButton jButton_demo) {
		this.jButton_demo = jButton_demo;
	}

	public void setjLabel1(javax.swing.JLabel jLabel1) {
		this.jLabel1 = jLabel1;
	}

	public void setjLabel3(javax.swing.JLabel jLabel3) {
		this.jLabel3 = jLabel3;
	}

	public void setJpanel_type_jeu(javax.swing.JPanel jpanel_type_jeu) {
		this.jpanel_type_jeu = jpanel_type_jeu;
	}
}
