/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseregistrationsystem.ui;

import courseregistrationsystem.entity.Account;
import courseregistrationsystem.dao.AccountDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dinhp
 */
public class AccountManagementPanel extends javax.swing.JPanel {

    /**
     * Creates new form AccountManagementPanel
     */
    public AccountManagementPanel() {
        initComponents();
        LoadData();
    }

    private void LoadData(){
        AccountDAO ad = new AccountDAO();
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Tài khoản");
        dtm.addColumn("Mật khẩu");
        for(Account acc : ad.findAll()){
            dtm.addRow(new Object[]{acc.getUsername(), acc.getPassword()});
        }
        this.tblAccounts.setModel(dtm);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAccounts = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnDelete2 = new javax.swing.JButton();
        btnResetPassword2 = new javax.swing.JButton();
        txtPassword2 = new javax.swing.JTextField();
        btnUpdate2 = new javax.swing.JButton();
        txtUsername2 = new javax.swing.JTextField();
        btnFind2 = new javax.swing.JButton();
        btnNew2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSave2 = new javax.swing.JButton();

        tblAccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAccounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAccountsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAccounts);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản Lý Tài Khoản");

        btnDelete2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courseregistrationsystem/icon/Actions-edit-delete-icon-16.png"))); // NOI18N
        btnDelete2.setText("Xóa");
        btnDelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnResetPassword2.setText("Reset mật khẩu");
        btnResetPassword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetPasswordActionPerformed(evt);
            }
        });

        txtPassword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnUpdate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courseregistrationsystem/icon/Actions-document-edit-icon-16.png"))); // NOI18N
        btnUpdate2.setText("Cập nhật");
        btnUpdate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtUsername2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        btnFind2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courseregistrationsystem/icon/search-icon-16.png"))); // NOI18N
        btnFind2.setText("Tìm kiếm");
        btnFind2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnNew2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courseregistrationsystem/icon/new-icon-16.png"))); // NOI18N
        btnNew2.setText("Tạo mới");
        btnNew2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        jLabel7.setText("Mật khẩu:");

        jLabel8.setText("Tài khoản:");

        btnSave2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courseregistrationsystem/icon/Save-icon.png"))); // NOI18N
        btnSave2.setText("Thêm");
        btnSave2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsername2))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(6, 6, 6)
                            .addComponent(txtPassword2))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnFind2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(btnNew2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(btnResetPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(btnUpdate2)
                                .addComponent(btnSave2)
                                .addComponent(btnDelete2))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtUsername2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew2)
                    .addComponent(btnSave2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate2)
                    .addComponent(btnFind2))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(btnResetPassword2)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(validateForm()){
            AccountDAO ad = new AccountDAO();
            Account acc = new Account();
            acc.setUsername(this.txtUsername.getText());
            acc.setPassword(this.txtPassword.getText());
            if(ad.saveAccount(acc)){
                JOptionPane.showMessageDialog(null, "Thêm 1 tài khoản thành công");
                LoadData();
            }
            else {
                JOptionPane.showMessageDialog(null, "Thêm tài khoản thất bại");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Vui lòng nhập đầy đủ thông tin");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtUsername.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        AccountDAO ad = new AccountDAO();
        if(txtUsername.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Tài khoản cần phải nhập để tìm kiếm");
        }
        else{
            try{
                Account acc = ad.findAccount(txtUsername.getText());

                if(acc != null){
                    txtUsername.setText(acc.getUsername());
                    txtPassword.setText(acc.getPassword());

                    //Fill Data in table
                    DefaultTableModel dtm = new DefaultTableModel();
                    dtm.addColumn("Tài khoản");
                    dtm.addColumn("Mật khẩu");
                    dtm.addRow(new Object[]{acc.getUsername(), acc.getPassword()});
                    this.tblAccounts.setModel(dtm);
                }else
                JOptionPane.showMessageDialog(null,"Không tìm thấy tài khoản này");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnFindActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(validateForm()){
            AccountDAO ad = new AccountDAO();
            Account acc = new Account();
            acc.setUsername(this.txtUsername.getText());
            acc.setPassword(this.txtPassword.getText());

            if(ad.updateAccount(acc)){
                JOptionPane.showMessageDialog(null, "Tài khoản đã được cập nhật");
                LoadData();
            }
            else {
                JOptionPane.showMessageDialog(null, "Cập nhật thất bại");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Nhập đầy đủ thông tin để cập nhật");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnResetPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetPasswordActionPerformed
        if(!txtUsername.getText().isEmpty()){
            AccountDAO ad = new AccountDAO();
            Account acc = ad.findAccount(txtUsername.getText());
            acc.setPassword(acc.getUsername());

            if(ad.updateAccount(acc)){
                JOptionPane.showMessageDialog(null, "Khởi tạo mật khẩu mặc định");
                LoadData();
            }
            else {
                JOptionPane.showMessageDialog(null, "Khởi tạo thất bại");
            }
        }
    }//GEN-LAST:event_btnResetPasswordActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(!txtUsername.getText().isEmpty()){
            AccountDAO ad = new AccountDAO();
            Account acc = ad.findAccount(txtUsername.getText());

            if(ad.deleteAccount(acc)){
                JOptionPane.showMessageDialog(null, "Xóa tài khoản thành công");
                LoadData();
            }
            else {
                JOptionPane.showMessageDialog(null, "Xóa thất bại");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Vui lòng nhập tài khoản cần xóa");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblAccountsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAccountsMouseClicked
        AccountDAO ad = new AccountDAO();
        try{
            int id = tblAccounts.getSelectedRow();
            String accudentId = tblAccounts.getValueAt(id, 0).toString();
            Account acc = ad.findAccount(accudentId);

            txtUsername.setText(acc.getUsername());
            txtPassword.setText(acc.getUsername());
        }catch(Exception e){
        }
    }//GEN-LAST:event_tblAccountsMouseClicked
    
    public boolean validateForm(){
        if(txtUsername.getText().isEmpty() || txtPassword.getText().isEmpty()){
            return false;
        }
        return true;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnDelete2;
    private javax.swing.JButton btnDelete3;
    private javax.swing.JButton btnDelete4;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnFind1;
    private javax.swing.JButton btnFind2;
    private javax.swing.JButton btnFind3;
    private javax.swing.JButton btnFind4;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNew1;
    private javax.swing.JButton btnNew2;
    private javax.swing.JButton btnNew3;
    private javax.swing.JButton btnNew4;
    private javax.swing.JButton btnResetPassword;
    private javax.swing.JButton btnResetPassword1;
    private javax.swing.JButton btnResetPassword2;
    private javax.swing.JButton btnResetPassword3;
    private javax.swing.JButton btnResetPassword4;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSave1;
    private javax.swing.JButton btnSave2;
    private javax.swing.JButton btnSave3;
    private javax.swing.JButton btnSave4;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JButton btnUpdate2;
    private javax.swing.JButton btnUpdate3;
    private javax.swing.JButton btnUpdate4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblAccounts;
    private javax.swing.JTable tblAccounts1;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPassword1;
    private javax.swing.JTextField txtPassword2;
    private javax.swing.JTextField txtPassword3;
    private javax.swing.JTextField txtPassword4;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtUsername1;
    private javax.swing.JTextField txtUsername2;
    private javax.swing.JTextField txtUsername3;
    private javax.swing.JTextField txtUsername4;
    // End of variables declaration//GEN-END:variables
}
