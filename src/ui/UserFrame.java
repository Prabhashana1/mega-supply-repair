package ui;

import dao.UserDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.User;

/**
 *
 * @author prabhashana
 */
public class UserFrame extends javax.swing.JFrame {

    //create object for accessing user CRUD operations
    private UserDAO userDAO = new UserDAO();


    public UserFrame() {
        initComponents();
        getAllUser();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUsers = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        combRole = new javax.swing.JComboBox<>();
        cheShowPassword = new javax.swing.JCheckBox();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtSearchBar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblUserId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 204, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Manage Users");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "User Name", "User Password", "User Role"
            }
        )
        {
            public boolean isCellEditable(int row, int column){
                return false;
            }
        }
    );
    tableUsers.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tableUsersMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(tableUsers);
    if (tableUsers.getColumnModel().getColumnCount() > 0) {
        tableUsers.getColumnModel().getColumn(0).setMinWidth(100);
        tableUsers.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableUsers.getColumnModel().getColumn(0).setMaxWidth(100);
    }

    jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
    jLabel2.setText("User ID:");

    jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
    jLabel3.setText("User Name:");

    jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
    jLabel4.setText("Password:");

    jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
    jLabel5.setText("Role:");

    txtUserName.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

    combRole.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
    combRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "user", "admin" }));

    cheShowPassword.setText("show password");
    cheShowPassword.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cheShowPasswordActionPerformed(evt);
        }
    });

    btnAdd.setFont(new java.awt.Font("Helvetica Neue", 1, 17)); // NOI18N
    btnAdd.setText("Add User");
    btnAdd.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAddActionPerformed(evt);
        }
    });

    btnUpdate.setFont(new java.awt.Font("Helvetica Neue", 1, 17)); // NOI18N
    btnUpdate.setText("Update User");
    btnUpdate.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnUpdateActionPerformed(evt);
        }
    });

    btnClear.setFont(new java.awt.Font("Helvetica Neue", 1, 17)); // NOI18N
    btnClear.setText("Clear Field");
    btnClear.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnClearActionPerformed(evt);
        }
    });

    btnDelete.setFont(new java.awt.Font("Helvetica Neue", 1, 17)); // NOI18N
    btnDelete.setForeground(new java.awt.Color(255, 0, 51));
    btnDelete.setText("Delete User");
    btnDelete.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnDeleteActionPerformed(evt);
        }
    });

    txtSearchBar.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            txtSearchBarKeyReleased(evt);
        }
    });

    jLabel7.setText("Search here:");

    txtPassword.setColumns(10);
    txtPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

    lblUserId.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
    lblUserId.setFocusable(false);

    javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
    kGradientPanel1.setLayout(kGradientPanel1Layout);
    kGradientPanel1Layout.setHorizontalGroup(
        kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(kGradientPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addGap(98, 98, 98)
                    .addComponent(btnAdd))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel1Layout.createSequentialGroup()
                            .addGap(266, 266, 266)
                            .addComponent(btnUpdate)
                            .addGap(71, 71, 71)
                            .addComponent(btnClear)
                            .addGap(70, 70, 70)
                            .addComponent(btnDelete))
                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cheShowPassword)
                                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtPassword)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5)
                            .addGap(6, 6, 6)))
                    .addComponent(combRole, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
    );
    kGradientPanel1Layout.setVerticalGroup(
        kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(kGradientPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(42, 42, 42)
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3)
                .addComponent(jLabel4)
                .addComponent(jLabel5)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(combRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2)
                .addComponent(lblUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(cheShowPassword)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnAdd)
                .addComponent(btnUpdate)
                .addComponent(btnClear)
                .addComponent(btnDelete))
            .addGap(33, 33, 33)
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel7))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 500));

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtClear();
    }//GEN-LAST:event_btnClearActionPerformed

    //show password option
    private void cheShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheShowPasswordActionPerformed
        if (cheShowPassword.isSelected()) {
            txtPassword.setEchoChar((char) 0);
        } else {
            txtPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_cheShowPasswordActionPerformed

    //add new user
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        String role = (String) combRole.getSelectedItem();

        if (userName.isEmpty() || password.isEmpty() || role.isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are mandatory!!", "warning", JOptionPane.WARNING_MESSAGE);
        } else {
            User user = new User(userName, password, role);
            if (userDAO.saveUser(user)) {
                JOptionPane.showMessageDialog(rootPane, "New user added");
                getAllUser();
            } else {
                JOptionPane.showMessageDialog(null, "An error occurred while saving a user", "warning", JOptionPane.WARNING_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnAddActionPerformed

    //delete user
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        String userName = txtUserName.getText();
        if (userName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select user form table", "warning", JOptionPane.WARNING_MESSAGE);
        } else {
            int result = JOptionPane.showConfirmDialog(rootPane, "Are you want delete user?", "Confirmation", JOptionPane.YES_NO_OPTION);

            if (result == JOptionPane.YES_OPTION) {
                if (userDAO.deleteUser(userName)) {
                    JOptionPane.showMessageDialog(rootPane, "User deleted");
                    getAllUser();
                    txtClear();
                } else {
                    JOptionPane.showMessageDialog(null, "An error occurred while deleting a user", "warning", JOptionPane.WARNING_MESSAGE);
                    txtClear();
                }
            }

        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    //get selected user form table to textFeilds
    private void tableUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUsersMouseClicked
        
        DefaultTableModel model = (DefaultTableModel) tableUsers.getModel();
        int i = tableUsers.getSelectedRow();

        try {
            lblUserId.setText(model.getValueAt(i, 0).toString());
            txtUserName.setText(model.getValueAt(i, 1).toString());
            txtPassword.setText(model.getValueAt(i, 2).toString());

            combRole.setSelectedItem(model.getValueAt(i, 3).toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "An error occurred: " + e, "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_tableUsersMouseClicked

    //user update action
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        String role = (String) combRole.getSelectedItem();

        if (userName.isEmpty() || password.isEmpty() || role.isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are mandatory, You can select user from table", "warning", JOptionPane.WARNING_MESSAGE);
        } else {
            int result = JOptionPane.showConfirmDialog(rootPane, "Are you want delete user?", "Confirmation", JOptionPane.YES_NO_OPTION);

            if (result == JOptionPane.YES_OPTION) {
                User user = new User(userName, password, role);
                if (userDAO.updateUser(user)) {
                    JOptionPane.showMessageDialog(rootPane, "User details updated");
                    getAllUser();
                    txtClear();
                } else {
                    JOptionPane.showMessageDialog(null, "An error occurred while updating a user", "warning", JOptionPane.WARNING_MESSAGE);
                }
            }

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtSearchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchBarKeyReleased
        
        DefaultTableModel model = (DefaultTableModel) tableUsers.getModel();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<>(model);
        tableUsers.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + txtSearchBar.getText().toLowerCase(),1));
    }//GEN-LAST:event_txtSearchBarKeyReleased

    //method for clear input areas
    private void txtClear() {
        lblUserId.setText("");
        txtUserName.setText("");
        txtPassword.setText("");
        combRole.setSelectedIndex(0);
    }

    //method for get all user from database to UI
    private void getAllUser() {
        List<User> users = userDAO.getAllUsers();
        DefaultTableModel model = (DefaultTableModel) tableUsers.getModel();
        model.setRowCount(0);

        for (User user : users) {
            model.addRow(new Object[]{user.getUserId(), user.getUserName(), user.getPassword(), user.getRole()});
        }
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
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox cheShowPassword;
    private javax.swing.JComboBox<String> combRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField lblUserId;
    private javax.swing.JTable tableUsers;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtSearchBar;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
