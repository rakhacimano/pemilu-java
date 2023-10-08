/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pemilu.ui.voter;

import pemilu.ui.MainFrame;
import pemilu.ui.auth.Login;

/**
 *
 * @author rakhacimano
 */
public class VoterDashboard extends javax.swing.JPanel {

    private MainFrame mainFrame;
    private String loggedInUsername;
    
    public VoterDashboard(MainFrame mainFrame, String loggedInUsername) {
        this.mainFrame = mainFrame;
        this.loggedInUsername = loggedInUsername;
        
        initComponents();
        
        infoLoggedInUsername.setText(loggedInUsername);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPage = new javax.swing.JLabel();
        panelSideBar = new javax.swing.JPanel();
        linkLogout = new javax.swing.JLabel();
        linkVote = new javax.swing.JLabel();
        linkHome = new javax.swing.JLabel();
        titlePage = new javax.swing.JLabel();
        infoLoggedInUsername = new javax.swing.JTextField();

        labelPage.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 24)); // NOI18N
        labelPage.setForeground(new java.awt.Color(230, 230, 230));
        labelPage.setText("Voter");
        labelPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelPageMouseClicked(evt);
            }
        });

        panelSideBar.setBackground(new java.awt.Color(28, 31, 38));

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

        linkVote.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        linkVote.setForeground(new java.awt.Color(230, 230, 230));
        linkVote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vote-yea-white.png"))); // NOI18N
        linkVote.setText("Vote");
        linkVote.setIconTextGap(8);
        linkVote.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkVoteMouseClicked(evt);
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

        titlePage.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        titlePage.setForeground(new java.awt.Color(230, 230, 230));
        titlePage.setText("Pemilu Uganda");
        titlePage.setIconTextGap(8);

        javax.swing.GroupLayout panelSideBarLayout = new javax.swing.GroupLayout(panelSideBar);
        panelSideBar.setLayout(panelSideBarLayout);
        panelSideBarLayout.setHorizontalGroup(
            panelSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSideBarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titlePage)
                    .addComponent(linkHome)
                    .addComponent(linkVote)
                    .addComponent(linkLogout))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelSideBarLayout.setVerticalGroup(
            panelSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSideBarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titlePage)
                .addGap(48, 48, 48)
                .addComponent(linkHome)
                .addGap(32, 32, 32)
                .addComponent(linkVote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addComponent(linkLogout)
                .addGap(24, 24, 24))
        );

        infoLoggedInUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoLoggedInUsernameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelSideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPage)
                    .addComponent(infoLoggedInUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(306, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(labelPage)
                .addGap(18, 18, 18)
                .addComponent(infoLoggedInUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void labelPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPageMouseClicked
        mainFrame.showView(new Login(mainFrame));
    }//GEN-LAST:event_labelPageMouseClicked

    private void linkLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkLogoutMouseClicked
        mainFrame.showView(new Login(mainFrame));
    }//GEN-LAST:event_linkLogoutMouseClicked

    private void linkVoteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkVoteMouseClicked
        mainFrame.showView(new VoteCandidate(mainFrame, loggedInUsername));
    }//GEN-LAST:event_linkVoteMouseClicked

    private void linkHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkHomeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_linkHomeMouseClicked

    private void infoLoggedInUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoLoggedInUsernameActionPerformed
        
    }//GEN-LAST:event_infoLoggedInUsernameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField infoLoggedInUsername;
    private javax.swing.JLabel labelPage;
    private javax.swing.JLabel linkHome;
    private javax.swing.JLabel linkLogout;
    private javax.swing.JLabel linkVote;
    private javax.swing.JPanel panelSideBar;
    private javax.swing.JLabel titlePage;
    // End of variables declaration//GEN-END:variables
}
