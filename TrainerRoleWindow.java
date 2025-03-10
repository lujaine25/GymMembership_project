/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrontEnd;
import BackEnd.TrainerDatabase;
import Constants.FileNames;
import BackEnd.TrainerRole;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author youssef
 */
public class TrainerRoleWindow extends javax.swing.JFrame {
static TrainerRole trainer;
static {
    try{
        trainer = new TrainerRole(FileNames.MEMBER_FILENAME, FileNames.CLASS_FILENAME, FileNames.REGISTRATION_FILENAME);
    } catch (IOException e) {
        System.out.println("Error initializing TrainerRole: " + e.getMessage());
    }
}
    /**
     * Creates new form TrainerRole
     */
    public TrainerRoleWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        btnAddMember = new javax.swing.JButton();
        btnDisplayMember = new javax.swing.JButton();
        btnAddClass = new javax.swing.JButton();
        btnDisplayClass = new javax.swing.JButton();
        btnAddRegistration = new javax.swing.JButton();
        btnCancelRegistration = new javax.swing.JButton();
        btnDisplay = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(100, 10));
        setMinimumSize(new java.awt.Dimension(100, 10));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrontEnd/icons/coach.png"))); // NOI18N
        jLabel1.setText("TRAINER ROLE");

        btnAddMember.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrontEnd/icons/add.png"))); // NOI18N
        btnAddMember.setText("ADD MEMBER");
        btnAddMember.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAddMember.setMaximumSize(new java.awt.Dimension(100, 10));
        btnAddMember.setMinimumSize(new java.awt.Dimension(100, 10));
        btnAddMember.setName(""); // NOI18N
        btnAddMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMemberActionPerformed(evt);
            }
        });

        btnDisplayMember.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDisplayMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrontEnd/icons/monitor.png"))); // NOI18N
        btnDisplayMember.setText("DISPLAY MEMBERS");
        btnDisplayMember.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDisplayMember.setMaximumSize(new java.awt.Dimension(100, 10));
        btnDisplayMember.setMinimumSize(new java.awt.Dimension(100, 10));
        btnDisplayMember.setName(""); // NOI18N
        btnDisplayMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayMemberActionPerformed(evt);
            }
        });

        btnAddClass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddClass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrontEnd/icons/add.png"))); // NOI18N
        btnAddClass.setText("ADD CLASS");
        btnAddClass.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAddClass.setMaximumSize(new java.awt.Dimension(100, 10));
        btnAddClass.setMinimumSize(new java.awt.Dimension(100, 10));
        btnAddClass.setName(""); // NOI18N
        btnAddClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddClassActionPerformed(evt);
            }
        });

        btnDisplayClass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDisplayClass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrontEnd/icons/monitor.png"))); // NOI18N
        btnDisplayClass.setText("DISPLAY CLASSES");
        btnDisplayClass.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDisplayClass.setMaximumSize(new java.awt.Dimension(100, 10));
        btnDisplayClass.setMinimumSize(new java.awt.Dimension(100, 10));
        btnDisplayClass.setName(""); // NOI18N
        btnDisplayClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayClassActionPerformed(evt);
            }
        });

        btnAddRegistration.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddRegistration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrontEnd/icons/add.png"))); // NOI18N
        btnAddRegistration.setText("ADD REGISTRATION");
        btnAddRegistration.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAddRegistration.setMaximumSize(new java.awt.Dimension(100, 10));
        btnAddRegistration.setMinimumSize(new java.awt.Dimension(100, 10));
        btnAddRegistration.setName(""); // NOI18N
        btnAddRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRegistrationActionPerformed(evt);
            }
        });

        btnCancelRegistration.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelRegistration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrontEnd/icons/remove.png"))); // NOI18N
        btnCancelRegistration.setText("CANCEL REGISTRATION");
        btnCancelRegistration.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCancelRegistration.setMaximumSize(new java.awt.Dimension(100, 10));
        btnCancelRegistration.setMinimumSize(new java.awt.Dimension(100, 10));
        btnCancelRegistration.setName(""); // NOI18N
        btnCancelRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelRegistrationActionPerformed(evt);
            }
        });

        btnDisplay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrontEnd/icons/monitor.png"))); // NOI18N
        btnDisplay.setText("DISPLAY REGISTRATIONS");
        btnDisplay.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDisplay.setMaximumSize(new java.awt.Dimension(100, 10));
        btnDisplay.setMinimumSize(new java.awt.Dimension(100, 10));
        btnDisplay.setName(""); // NOI18N
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrontEnd/icons/logout.png"))); // NOI18N
        btnLogout.setText("LOGOUT");
        btnLogout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLogout.setMaximumSize(new java.awt.Dimension(100, 10));
        btnLogout.setMinimumSize(new java.awt.Dimension(100, 10));
        btnLogout.setName(""); // NOI18N
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
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
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddMember, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnAddRegistration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDisplayClass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelRegistration, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDisplay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLogout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDisplayMember, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(77, 77, 77))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnAddMember, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDisplayMember, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddClass, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDisplayClass, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMemberActionPerformed
        // TODO add your handling code here:
        new AddMemberWindow().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAddMemberActionPerformed

    private void btnDisplayMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayMemberActionPerformed
        // TODO add your handling code here:
        new DisplayMembersWindow().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnDisplayMemberActionPerformed

    private void btnAddClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddClassActionPerformed
    try {
        // TODO add your handling code here:
        new AddClassWindow().setVisible(true);
        dispose();
    } catch (IOException ex) {
        Logger.getLogger(TrainerRoleWindow.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnAddClassActionPerformed

    private void btnDisplayClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayClassActionPerformed
        // TODO add your handling code here:
        new DisplayClassesWindow().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnDisplayClassActionPerformed

    private void btnAddRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRegistrationActionPerformed
        // TODO add your handling code here:
        new RegisterMemberWindow().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAddRegistrationActionPerformed

    private void btnCancelRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelRegistrationActionPerformed
        // TODO add your handling code here:
        new CancelRegistrationWindow().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelRegistrationActionPerformed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        // TODO add your handling code here:
        new DisplayRegistrationsWindow().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        trainer.logout();
        new MainFrame().setVisible(true);
        // Close the current window
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(TrainerRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainerRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainerRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainerRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TrainerRoleWindow().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddClass;
    private javax.swing.JButton btnAddMember;
    private javax.swing.JButton btnAddRegistration;
    private javax.swing.JButton btnCancelRegistration;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnDisplayClass;
    private javax.swing.JButton btnDisplayMember;
    private javax.swing.JButton btnLogout;
    // End of variables declaration//GEN-END:variables
}
