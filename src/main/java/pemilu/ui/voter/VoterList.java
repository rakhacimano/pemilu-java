/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pemilu.ui.voter;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pemilu.models.User;
import pemilu.models.Voter;
import pemilu.services.DatabaseService;
import pemilu.services.PasswordGenerator;
import pemilu.ui.MainFrame;
import pemilu.ui.auth.Login;
import pemilu.ui.candidate.CandidateList;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author rakhacimano
 */
public class VoterList extends javax.swing.JPanel {

    private MainFrame mainFrame;
    public DefaultTableModel model;

    public VoterList(MainFrame mainFrame) {
        this.mainFrame = mainFrame;

        initComponents();
        initTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSideBar = new javax.swing.JPanel();
        linkLogout = new javax.swing.JLabel();
        linkCandidate = new javax.swing.JLabel();
        linkHome = new javax.swing.JLabel();
        linkVoter = new javax.swing.JLabel();
        titlePage = new javax.swing.JLabel();
        labelPage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVoter = new javax.swing.JTable();
        labelName = new javax.swing.JLabel();
        inputName = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        inputUsername = new javax.swing.JTextField();
        labelUsername = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

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
                    .addComponent(linkVoter)
                    .addComponent(linkHome)
                    .addComponent(linkCandidate)
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
                .addComponent(linkVoter)
                .addGap(32, 32, 32)
                .addComponent(linkCandidate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(linkLogout)
                .addGap(24, 24, 24))
        );

        labelPage.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 24)); // NOI18N
        labelPage.setForeground(new java.awt.Color(230, 230, 230));
        labelPage.setText("Voter");
        labelPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelPageMouseClicked(evt);
            }
        });

        tableVoter.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 12)); // NOI18N
        tableVoter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "USERNAME", "PASSWORD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        // Terapkan cell renderer ke setiap kolom yang perlu di-center
        tableVoter.getColumnModel().getColumn(0).setCellRenderer(centerRenderer); // Kolom 0 (Nama)
        tableVoter.getColumnModel().getColumn(1).setCellRenderer(centerRenderer); // Kolom 1 (Username)
        tableVoter.getColumnModel().getColumn(2).setCellRenderer(centerRenderer); // Kolom 2 (Password)
        tableVoter.setRowHeight(32);
        tableVoter.setSurrendersFocusOnKeystroke(true);
        tableVoter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableVoterMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableVoter);

        labelName.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        labelName.setForeground(new java.awt.Color(230, 230, 230));
        labelName.setText("Full Name");

        inputName.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 12)); // NOI18N
        inputName.setForeground(new java.awt.Color(230, 230, 230));

        btnAdd.setBackground(new java.awt.Color(0, 153, 204));
        btnAdd.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(230, 230, 230));
        btnAdd.setText("Add New Voter");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        inputUsername.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 12)); // NOI18N
        inputUsername.setForeground(new java.awt.Color(230, 230, 230));

        labelUsername.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        labelUsername.setForeground(new java.awt.Color(230, 230, 230));
        labelUsername.setText("Username");

        btnEdit.setBackground(new java.awt.Color(255, 153, 51));
        btnEdit.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(230, 230, 230));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit.png"))); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 51, 51));
        btnDelete.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(230, 230, 230));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trash.png"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(204, 204, 204));
        btnCancel.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(230, 230, 230));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cross.png"))); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
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
                    .addComponent(inputName)
                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPage)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addComponent(labelName)
                    .addComponent(inputUsername)
                    .addComponent(labelUsername))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(labelPage)
                .addGap(24, 24, 24)
                .addComponent(labelName)
                .addGap(8, 8, 8)
                .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(labelUsername)
                .addGap(8, 8, 8)
                .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 24, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void initTable() {
        model = (DefaultTableModel) tableVoter.getModel();
        List<User> users = DatabaseService.getAllUsers();

        for (User user : users) {
            if (user instanceof Voter) {
                Voter voter = (Voter) user;
                model.addRow(new Object[]{voter.getName(), voter.getUsername(), voter.getPassword()}); // Ganti dengan data yang ingin Anda tampilkan
            }
        }
    }

    private void linkLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkLogoutMouseClicked
        mainFrame.showView(new Login(mainFrame));
    }//GEN-LAST:event_linkLogoutMouseClicked

    private void linkCandidateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkCandidateMouseClicked
        mainFrame.showView(new CandidateList(mainFrame));
    }//GEN-LAST:event_linkCandidateMouseClicked

    private void labelPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPageMouseClicked
        mainFrame.showView(new VoterList(mainFrame));
    }//GEN-LAST:event_labelPageMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String name = inputName.getText();
        String username = inputUsername.getText();

        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username harus diisi.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Pengecekan username unik di sini
            if (!DatabaseService.isUsernameUnique(username)) {
                JOptionPane.showMessageDialog(this, "Username '" + username + "' sudah digunakan. Silakan pilih username lain.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                return; // Keluar dari method jika username tidak unik
            }

            // Jika username unik, lanjutkan dengan menghasilkan kata sandi acak
            String newPassword = PasswordGenerator.generateRandomPassword();
            Voter voter = new Voter(name, username, newPassword);

            if (DatabaseService.addUser(voter)) {
                // Jika berhasil disimpan ke DatabaseService, tambahkan ke model tabel
                model = (DefaultTableModel) tableVoter.getModel();
                model.addRow(new Object[]{voter.getName(), voter.getUsername(), voter.getPassword()});
            } else {
                JOptionPane.showMessageDialog(null, "Username '" + username + "' sudah digunakan. Silakan pilih username lain.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }

            inputName.setText("");
            inputUsername.setText("");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void tableVoterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableVoterMouseClicked
        int selectedRow = tableVoter.getSelectedRow();

        if (selectedRow >= 0) {
            DefaultTableModel model = (DefaultTableModel) tableVoter.getModel();

            String nama = model.getValueAt(selectedRow, 0).toString();
            String username = model.getValueAt(selectedRow, 1).toString();

            inputName.setText(nama);
            inputUsername.setText(username);
        }
    }//GEN-LAST:event_tableVoterMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int selectedRow = tableVoter.getSelectedRow();

        if (selectedRow >= 0) {
            DefaultTableModel model = (DefaultTableModel) tableVoter.getModel();

            String name = inputName.getText();
            String username = inputUsername.getText();

            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nama harus diisi.", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (username.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Username harus diisi.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                String editedUsername = model.getValueAt(selectedRow, 1).toString();

                // Cek apakah username yang ingin diedit sudah ada
                if (DatabaseService.isUsernameUnique(username) || username.equals(editedUsername)) {
                    // Username unik atau sama dengan username sebelumnya, lanjutkan dengan edit
                    User editedUser = DatabaseService.getUserByUsername(editedUsername);

                    if (editedUser != null) {
                        // Perbarui data User yang sedang diedit
                        editedUser.setName(name);
                        editedUser.setUsername(username);

                        // Perbarui tampilan tabel
                        model.setValueAt(name, selectedRow, 0); // Mengganti kolom "Nama"
                        model.setValueAt(username, selectedRow, 1); // Mengganti kolom "Username"

                        inputName.setText("");
                        inputUsername.setText("");
                    } else {
                        JOptionPane.showMessageDialog(this, "User dengan username '" + username + "' tidak ditemukan.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Username '" + username + "' sudah digunakan. Silakan pilih username lain.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih baris yang akan diedit.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = tableVoter.getSelectedRow();

        if (selectedRow >= 0) {
            DefaultTableModel model = (DefaultTableModel) tableVoter.getModel();

            // Dapatkan username dari baris terpilih untuk menghapus data dari DatabaseService
            String usernameToDelete = (String) model.getValueAt(selectedRow, 1);

            // Hapus data dari DatabaseService
            DatabaseService.deleteUserByUsername(usernameToDelete);

            // Hapus baris terpilih dari model tabel
            model.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "Pilih baris yang akan dihapus.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        inputName.setText("");
        inputUsername.setText("");
    }//GEN-LAST:event_btnCancelActionPerformed

    private void linkHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkHomeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_linkHomeMouseClicked

    private void linkVoterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkVoterMouseClicked
        mainFrame.showView(new VoterList(mainFrame));
    }//GEN-LAST:event_linkVoterMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPage;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JLabel linkCandidate;
    private javax.swing.JLabel linkHome;
    private javax.swing.JLabel linkLogout;
    private javax.swing.JLabel linkVoter;
    private javax.swing.JPanel panelSideBar;
    private javax.swing.JTable tableVoter;
    private javax.swing.JLabel titlePage;
    // End of variables declaration//GEN-END:variables
}
