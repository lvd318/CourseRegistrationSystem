/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseregistrationsystem.ui;

import courseregistrationsystem.dao.SemesterDAO;
import courseregistrationsystem.entity.Semester;
import courseregistrationsystem.entity.SemesterId;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dinhp
 */
public class SemesterManagementPanel extends javax.swing.JPanel {

    SimpleDateFormat fm = new SimpleDateFormat("MM/dd/yyyy");
    
    public SemesterManagementPanel() {
        initComponents();
        LoadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSemesters = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtYear = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSemesterName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rbtnSemCurrent = new javax.swing.JRadioButton();
        StartDate = new com.toedter.calendar.JDateChooser();
        EndDate = new com.toedter.calendar.JDateChooser();

        tblSemesters.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "T??n h???c k??", "N??m h???c", "Ng??y b???t ?????u", "Ng??y k???t th??c", "K?? hi???n t???i"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSemesters.setColumnSelectionAllowed(true);
        tblSemesters.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSemestersMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblSemesters);
        tblSemesters.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Qu???n L?? H???c K??");

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courseregistrationsystem/icon/Actions-edit-delete-icon-16.png"))); // NOI18N
        btnDelete.setText("X??a");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courseregistrationsystem/icon/Actions-document-edit-icon-16.png"))); // NOI18N
        btnUpdate.setText("C???p nh???t");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearActionPerformed(evt);
            }
        });

        jLabel3.setText("T??n h???c k??:");

        jLabel4.setText("N??m h???c:");

        jLabel5.setText("Ng??y b???t ?????u:");

        txtSemesterName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSemesterNameActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courseregistrationsystem/icon/Save-icon.png"))); // NOI18N
        btnSave.setText("Th??m");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courseregistrationsystem/icon/new-icon-16.png"))); // NOI18N
        btnNew.setText("T???o m???i");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        jLabel6.setText("Ng??y k???t th??c:");

        jLabel7.setText("H???c k?? hi???n t???i:");

        rbtnSemCurrent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSemCurrentActionPerformed(evt);
            }
        });

        StartDate.setDateFormatString("MM/dd/yyyy");

        EndDate.setDateFormatString("MM/dd/yyyy");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnNew)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnUpdate)
                            .addComponent(btnSave)
                            .addComponent(btnDelete)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSemesterName, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(txtYear)
                            .addComponent(StartDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(11, 11, 11)
                        .addComponent(rbtnSemCurrent)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSemesterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(StartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(EndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rbtnSemCurrent))
                .addGap(4, 4, 4)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnSave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 862, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 37, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 37, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 31, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 31, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void LoadData(){
        SemesterDAO std = new SemesterDAO();
        DefaultTableModel dtm = (DefaultTableModel) tblSemesters.getModel();
        dtm.setNumRows(0);
        //SimpleDateFormat fm = new SimpleDateFormat("MM/dd/yyyy"); 
        for(Semester st : std.findAll()){
            dtm.addRow(new Object[]{st.getId().getSemName(), st.getId().getYear(),
                            fm.format(st.getStartDay()), fm.format(st.getEndDay()), st.isCurrentSem()});
        }
        //this.tblSemesters.setModel(dtm);
    }
    
    public boolean validateForm(){
        if(txtSemesterName.getText().isEmpty() || txtYear.getText().isEmpty()){
            return false;
        }
        return true;
    }
    
    private void tblSemestersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSemestersMouseClicked
        SemesterDAO std = new SemesterDAO();

        int id = tblSemesters.getSelectedRow();

        SemesterId semesterId = new SemesterId(tblSemesters.getValueAt(id, 0).toString(),
                                               Integer.parseInt(tblSemesters.getValueAt(id, 1).toString()));
        Semester st = std.findSemester(semesterId);
        txtSemesterName.setText(st.getId().getSemName());
        txtYear.setText(String.valueOf(st.getId().getYear()));
        if(st.isCurrentSem()){
            rbtnSemCurrent.setSelected(true);
        }
        else rbtnSemCurrent.setSelected(false);
        //SimpleDateFormat fm = new SimpleDateFormat("MM/dd/yyyy");
        try {
        Date Startdate = fm.parse(fm.format(st.getStartDay()));
        Date Enddate = fm.parse(fm.format(st.getEndDay()));
        StartDate.setDate(Startdate);
        EndDate.setDate(Enddate);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } 
    }//GEN-LAST:event_tblSemestersMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(!txtSemesterName.getText().isEmpty()){
            SemesterDAO sbd = new SemesterDAO();
            SemesterId semesterId = new SemesterId(txtSemesterName.getText(),Integer.parseInt(txtYear.getText()));
            Semester sb = sbd.findSemester(semesterId);

            if(sbd.deleteSemester(sb)){
                JOptionPane.showMessageDialog(null, "X??a h???c k?? th??nh c??ng");
                LoadData();
            }
            else {
                JOptionPane.showMessageDialog(null, "X??a th???t b???i");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Vui l??ng nh???p m?? HK c???n x??a");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(validateForm()){
            SemesterDAO stdao = new SemesterDAO();
            Semester st = new Semester();
            
            st.setId(new SemesterId(txtSemesterName.getText(),Integer.parseInt(txtYear.getText())));
            
            try{
            st.setStartDay(fm.parse(fm.format(StartDate.getDate())));
            st.setEndDay(fm.parse(fm.format(EndDate.getDate())));
            
            } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            } 
            
            st.setCurrentSem(rbtnSemCurrent.isSelected());
            
            for(Semester t : stdao.findAll()){
                if (t.isCurrentSem()){
                    if(st.isCurrentSem()){
                        t.setCurrentSem(false);
                        stdao.updateSemester(t);
                    }
                }
            }
            
            if(stdao.updateSemester(st)){
                JOptionPane.showMessageDialog(null, "H???c k?? ???? ???????c c???p nh???t");
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

    private void txtYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearActionPerformed

    private void txtSemesterNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSemesterNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSemesterNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(validateForm()){
            SemesterDAO sbdao = new SemesterDAO();
            Semester st = new Semester();
            
            st.setId(new SemesterId(txtSemesterName.getText(),Integer.parseInt(txtYear.getText())));
            
            try{
            st.setStartDay(fm.parse(fm.format(StartDate.getDate())));
            st.setEndDay(fm.parse(fm.format(EndDate.getDate())));
            
            } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            } 
            st.setCurrentSem(rbtnSemCurrent.isSelected());
            for(Semester t : sbdao.findAll()){
                if (t.isCurrentSem()){
                    if(st.isCurrentSem()){
                        t.setCurrentSem(false);
                        sbdao.updateSemester(t);
                    }
                }
            }
            
            if(sbdao.saveSemester(st)){
                JOptionPane.showMessageDialog(null, "Th??m 1 h???c k?? th??nh c??ng");
                LoadData();
            }
            else {
                JOptionPane.showMessageDialog(null, "Th??m h???c k?? th???t b???i");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Vui l??ng nh???p ?????y ????? th??ng tin");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtSemesterName.setText("");
        StartDate.setDate(null);
        txtYear.setText("");
        EndDate.setDate(null);
        rbtnSemCurrent.setSelected(false);
        //LoadData();
    }//GEN-LAST:event_btnNewActionPerformed

    private void rbtnSemCurrentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSemCurrentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnSemCurrentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser EndDate;
    private com.toedter.calendar.JDateChooser StartDate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rbtnSemCurrent;
    private javax.swing.JTable tblSemesters;
    private javax.swing.JTextField txtSemesterName;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
