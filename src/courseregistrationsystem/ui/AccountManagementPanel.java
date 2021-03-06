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

    public void LoadData(){
        AccountDAO ad = new AccountDAO();
        DefaultTableModel dtm = (DefaultTableModel) tblAccounts.getModel();
        dtm.setNumRows(0);
        for(Account acc : ad.findAll()){
            dtm.addRow(new Object[]{ acc.getHoten(),acc.getUsername(), acc.getPassword()});
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
        txtPassword = new javax.swing.JTextField();
        btnUpdate2 = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        btnFind2 = new javax.swing.JButton();
        btnNew2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSave2 = new javax.swing.JButton();
        txtHoten = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        tblAccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "H??? t??n", "T??i kho???n", "M???t kh???u"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        jLabel1.setText("Qu???n L?? T??i Kho???n");

        btnDelete2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courseregistrationsystem/icon/Actions-edit-delete-icon-16.png"))); // NOI18N
        btnDelete2.setText("X??a");
        btnDelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnResetPassword2.setText("Reset m???t kh???u");
        btnResetPassword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetPasswordActionPerformed(evt);
            }
        });

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnUpdate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courseregistrationsystem/icon/Actions-document-edit-icon-16.png"))); // NOI18N
        btnUpdate2.setText("C???p nh???t");
        btnUpdate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        btnFind2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courseregistrationsystem/icon/search-icon-16.png"))); // NOI18N
        btnFind2.setText("T??m ki???m");
        btnFind2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnNew2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courseregistrationsystem/icon/new-icon-16.png"))); // NOI18N
        btnNew2.setText("T???o m???i");
        btnNew2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        jLabel7.setText("M???t kh???u:");

        jLabel8.setText("T??i kho???n:");

        btnSave2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courseregistrationsystem/icon/Save-icon.png"))); // NOI18N
        btnSave2.setText("Th??m");
        btnSave2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtHoten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHotentxtUsernameActionPerformed(evt);
            }
        });

        jLabel11.setText("H??? t??n:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
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
                            .addComponent(btnDelete2))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(btnResetPassword2)))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtHotentxtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHotentxtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHotentxtUsernameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(validateForm()){
            AccountDAO ad = new AccountDAO();
            Account acc = new Account();
            acc.setUsername(this.txtUsername.getText());
            acc.setPassword(this.txtPassword.getText());
            acc.setHoten(this.txtHoten.getText());
            if(ad.saveAccount(acc)){
                JOptionPane.showMessageDialog(null, "Th??m 1 t??i kho???n th??nh c??ng");
                LoadData();
            }
            else {
                JOptionPane.showMessageDialog(null, "Th??m t??i kho???n th???t b???i");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Vui l??ng nh???p ?????y ????? th??ng tin");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtUsername.setText("");
        txtPassword.setText("");
        txtHoten.setText("");
        LoadData();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        AccountDAO ad = new AccountDAO();
        if(txtUsername.getText().equals("")){
            JOptionPane.showMessageDialog(null,"T??i kho???n c???n ph???i nh???p ????? t??m ki???m");
        }
        else{
            try{
                Account acc = ad.findAccount(txtUsername.getText());

                if(acc != null){
                    txtUsername.setText(acc.getUsername());
                    txtPassword.setText(acc.getPassword());
                    txtHoten.setText(acc.getHoten());

                    //Fill Data in table
                    DefaultTableModel dtm = (DefaultTableModel) tblAccounts.getModel();
                    dtm.setNumRows(0);
                    dtm.addRow(new Object[]{ acc.getHoten(),acc.getUsername(), acc.getPassword()});
                    this.tblAccounts.setModel(dtm);
                }else
                JOptionPane.showMessageDialog(null,"Kh??ng t??m th???y t??i kho???n n??y");
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
            acc.setHoten(this.txtHoten.getText());

            if(ad.updateAccount(acc)){
                JOptionPane.showMessageDialog(null, "T??i kho???n ???? ???????c c???p nh???t");
                LoadData();
            }
            else {
                JOptionPane.showMessageDialog(null, "C???p nh???t th???t b???i");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Nh???p ?????y ????? th??ng tin ????? c???p nh???t");
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
                JOptionPane.showMessageDialog(null, "Kh???i t???o m???t kh???u m???c ?????nh");
                LoadData();
            }
            else {
                JOptionPane.showMessageDialog(null, "Kh???i t???o th???t b???i");
            }
        }
    }//GEN-LAST:event_btnResetPasswordActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(!txtUsername.getText().isEmpty()){
            AccountDAO ad = new AccountDAO();
            Account acc = ad.findAccount(txtUsername.getText());

            if(ad.deleteAccount(acc)){
                JOptionPane.showMessageDialog(null, "X??a t??i kho???n th??nh c??ng");
                LoadData();
            }
            else {
                JOptionPane.showMessageDialog(null, "X??a th???t b???i");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Vui l??ng nh???p t??i kho???n c???n x??a");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblAccountsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAccountsMouseClicked
        AccountDAO ad = new AccountDAO();
        try{
            int id = tblAccounts.getSelectedRow();
            String username = tblAccounts.getValueAt(id,1).toString();
            Account acc = ad.findAccount(username);

            txtUsername.setText(acc.getUsername());
            txtPassword.setText(acc.getPassword());
            txtHoten.setText(acc.getHoten());
        }catch(Exception e){
        }
    }//GEN-LAST:event_tblAccountsMouseClicked
    
    public boolean validateForm(){
        if(txtUsername.getText().isEmpty() || txtPassword.getText().isEmpty() || txtHoten.getText().isEmpty()){
            return false;
        }
        return true;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete2;
    private javax.swing.JButton btnFind2;
    private javax.swing.JButton btnNew2;
    private javax.swing.JButton btnResetPassword2;
    private javax.swing.JButton btnSave2;
    private javax.swing.JButton btnUpdate2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblAccounts;
    private javax.swing.JTextField txtHoten;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
