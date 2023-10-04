/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pemilu.ui.admin;

import pemilu.ui.voter.VoterList;
import pemilu.ui.MainFrame;
import pemilu.ui.auth.Login;

/**
 *
 * @author rakhacimano
 */
public class AdminDashboard extends javax.swing.JPanel {

    private MainFrame mainFrame;

    public AdminDashboard(MainFrame mainFrame) {
        this.mainFrame = mainFrame;

        initComponents();
        linkHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/house-window.png"))); // NOI18N
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        linkLogout = new javax.swing.JLabel();
        linkHome = new javax.swing.JLabel();
        linkVoter = new javax.swing.JLabel();
        linkCandidate = new javax.swing.JLabel();
        linkResults = new javax.swing.JLabel();
        titlePage = new javax.swing.JLabel();
        labelPage = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(28, 31, 38));

        linkLogout.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        linkLogout.setForeground(new java.awt.Color(255, 51, 51));
        linkLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sign-out-alt.png"))); // NOI18N
        linkLogout.setText("Logout");
        linkLogout.setIconTextGap(8);
        linkLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkLogoutMouseClicked(evt);
            }
        });

        linkHome.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        linkHome.setForeground(new java.awt.Color(230, 230, 230));
        linkHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/house-window.png"))); // NOI18N
        linkHome.setText("Home");
        linkHome.setIconTextGap(8);
        linkHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkHomeMouseClicked(evt);
            }
        });

        linkVoter.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        linkVoter.setForeground(new java.awt.Color(230, 230, 230));
        linkVoter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/users.png"))); // NOI18N
        linkVoter.setText("Voter");
        linkVoter.setIconTextGap(8);
        linkVoter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkVoterMouseClicked(evt);
            }
        });

        linkCandidate.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        linkCandidate.setForeground(new java.awt.Color(230, 230, 230));
        linkCandidate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user-pen.png"))); // NOI18N
        linkCandidate.setText("Candidate");
        linkCandidate.setIconTextGap(8);
        linkCandidate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkCandidateMouseClicked(evt);
            }
        });

        linkResults.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        linkResults.setForeground(new java.awt.Color(230, 230, 230));
        linkResults.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tally.png"))); // NOI18N
        linkResults.setText("Results");
        linkResults.setIconTextGap(8);
        linkResults.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkResultsMouseClicked(evt);
            }
        });

        titlePage.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        titlePage.setForeground(new java.awt.Color(230, 230, 230));
        titlePage.setText("Pemilu Uganda");
        titlePage.setIconTextGap(8);
        titlePage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titlePageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titlePage)
                    .addComponent(linkResults)
                    .addComponent(linkCandidate)
                    .addComponent(linkVoter)
                    .addComponent(linkHome)
                    .addComponent(linkLogout))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titlePage)
                .addGap(48, 48, 48)
                .addComponent(linkHome)
                .addGap(32, 32, 32)
                .addComponent(linkVoter)
                .addGap(32, 32, 32)
                .addComponent(linkCandidate)
                .addGap(32, 32, 32)
                .addComponent(linkResults)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                .addComponent(linkLogout)
                .addGap(24, 24, 24))
        );

        labelPage.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 24)); // NOI18N
        labelPage.setForeground(new java.awt.Color(230, 230, 230));
        labelPage.setText("Admin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addComponent(labelPage)
                .addGap(195, 195, 195))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelPage)
                .addGap(241, 241, 241))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void linkLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkLogoutMouseClicked
        mainFrame.showView(new Login(mainFrame));
    }//GEN-LAST:event_linkLogoutMouseClicked

    private void linkHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkHomeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_linkHomeMouseClicked

    private void linkVoterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkVoterMouseClicked
        mainFrame.showView(new VoterList(mainFrame));
    }//GEN-LAST:event_linkVoterMouseClicked

    private void linkCandidateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkCandidateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_linkCandidateMouseClicked

    private void linkResultsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkResultsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_linkResultsMouseClicked

    private void titlePageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlePageMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_titlePageMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelPage;
    private javax.swing.JLabel linkCandidate;
    private javax.swing.JLabel linkHome;
    private javax.swing.JLabel linkLogout;
    private javax.swing.JLabel linkResults;
    private javax.swing.JLabel linkVoter;
    private javax.swing.JLabel titlePage;
    // End of variables declaration//GEN-END:variables
}
