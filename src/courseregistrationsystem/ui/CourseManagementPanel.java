/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseregistrationsystem.ui;

import courseregistrationsystem.dao.CourseDAO;
import courseregistrationsystem.dao.SemesterDAO;
import courseregistrationsystem.dao.SubjectDAO;
import courseregistrationsystem.entity.Course;
import courseregistrationsystem.entity.Semester;
import courseregistrationsystem.entity.Subject;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dinhp
 */
public class CourseManagementPanel extends javax.swing.JPanel {

    /**
     * Creates new form CourseManagementPanel
     */
    public CourseManagementPanel() {
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
        tblCourses = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        txtGvlt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSubjectId = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnFind2 = new javax.swing.JButton();
        txtRoom = new javax.swing.JTextField();
        txtDay = new javax.swing.JTextField();
        txtCa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSlots = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbNameCurrentSemester = new javax.swing.JLabel();
        lbYearCurrentSemester = new javax.swing.JLabel();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        tblCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã môn", "Tên môn", "Số tín chỉ", "GVLT", "Phòng học", "Thứ", "Ca", "Sỉ số tối đa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCourses.setColumnSelectionAllowed(true);
        tblCourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCoursesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblCourses);
        tblCourses.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tblCourses.getColumnModel().getColumnCount() > 0) {
            tblCourses.getColumnModel().getColumn(0).setPreferredWidth(25);
            tblCourses.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblCourses.getColumnModel().getColumn(6).setPreferredWidth(25);
            tblCourses.getColumnModel().getColumn(7).setPreferredWidth(25);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản Lý Học Phần");

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courseregistrationsystem/icon/Actions-edit-delete-icon-16.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtGvlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGvltActionPerformed(evt);
            }
        });

        jLabel3.setText("Mã môn:");

        jLabel4.setText("GVLT:");

        jLabel5.setText("Phòng học:");

        txtSubjectId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubjectIdActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courseregistrationsystem/icon/Save-icon.png"))); // NOI18N
        btnSave.setText("Thêm");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courseregistrationsystem/icon/new-icon-16.png"))); // NOI18N
        btnNew.setText("Tạo mới");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        jLabel6.setText("Thứ:");

        jLabel7.setText("Ca học:");

        btnFind2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courseregistrationsystem/icon/search-icon-16.png"))); // NOI18N
        btnFind2.setText("Tìm kiếm");
        btnFind2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFind2ActionPerformed(evt);
            }
        });

        txtRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomActionPerformed(evt);
            }
        });

        txtDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDayActionPerformed(evt);
            }
        });

        txtCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCaActionPerformed(evt);
            }
        });

        jLabel8.setText("Sỉ số tối đa:");

        txtSlots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSlotsActionPerformed(evt);
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
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFind2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnDelete)
                            .addComponent(btnSave)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSlots, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(txtSubjectId)
                            .addComponent(txtGvlt)
                            .addComponent(txtRoom)
                            .addComponent(txtDay)
                            .addComponent(txtCa))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSubjectId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtGvlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSlots, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnSave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFind2)
                    .addComponent(btnDelete))
                .addGap(42, 42, 42))
        );

        jLabel2.setText("Học Kì:");

        jLabel9.setText("Năm học:");

        lbNameCurrentSemester.setText(".");

        lbYearCurrentSemester.setText(".");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbNameCurrentSemester)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(lbYearCurrentSemester)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(lbNameCurrentSemester)
                    .addComponent(lbYearCurrentSemester))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 838, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void LoadData(){
        CourseDAO std = new CourseDAO();
        SemesterDAO sdao = new SemesterDAO();
        Semester semesterCurrent = null;
        DefaultTableModel dtm = (DefaultTableModel) tblCourses.getModel();
        dtm.setNumRows(0);
        
        for(Semester t : sdao.findAll()){
                    if (t.isCurrentSem()){
                        semesterCurrent = t;
                    }
                }
        lbNameCurrentSemester.setText(semesterCurrent.getId().getSemName());
        lbYearCurrentSemester.setText(String.valueOf(semesterCurrent.getId().getYear()));
        
        for(Course st : std.findAll()){
            if(st.getSemName().toString().equals(semesterCurrent.getId().getSemName()) && 
                    (st.getYear() == semesterCurrent.getId().getYear())){
                dtm.addRow(new Object[]{st.getCourseId(), st.getSubjectId(), st.getSubjectName(), st.getCredits(), st.getGvlt(),
                        st.getRoom(), st.getThu(), st.getCa(), st.getSlots()});
            }
        }
    }
    private void tblCoursesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCoursesMouseClicked
        CourseDAO std = new CourseDAO();

        int id = tblCourses.getSelectedRow();

        txtSubjectId.setText(tblCourses.getValueAt(id, 1).toString());
        txtGvlt.setText(tblCourses.getValueAt(id, 4).toString());
        txtRoom.setText(tblCourses.getValueAt(id, 5).toString());
        txtDay.setText(tblCourses.getValueAt(id, 6).toString());
        txtCa.setText(tblCourses.getValueAt(id, 7).toString());
        txtSlots.setText(tblCourses.getValueAt(id, 8).toString());
    }//GEN-LAST:event_tblCoursesMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(!txtSubjectId.getText().isEmpty()){
            CourseDAO sbd = new CourseDAO();
            int id = tblCourses.getSelectedRow();
            int stt = Integer.parseInt(tblCourses.getValueAt(id, 0).toString());
            Course sb = sbd.findCourse(stt);
            

            if(sbd.deleteCourse(sb)){
                JOptionPane.showMessageDialog(null, "Xóa học phần thành công");
                LoadData();
            }
            else {
                JOptionPane.showMessageDialog(null, "Xóa thất bại");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Vui lòng nhập mã cần xóa");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
    public boolean validateForm(){
        if(txtSubjectId.getText().isEmpty() || txtGvlt.getText().isEmpty() ||txtCa.getText().isEmpty()
                || txtDay.getText().isEmpty() || txtRoom.getText().isEmpty() || txtSlots.getText().isEmpty()){
            return false;
        }
        return true;
    }
    
    private void txtGvltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGvltActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGvltActionPerformed

    private void txtSubjectIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubjectIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubjectIdActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(validateForm()){
            CourseDAO stdao = new CourseDAO();
            SubjectDAO sbdao = new SubjectDAO();
            SemesterDAO sdao = new SemesterDAO();
            Course st = new Course();
            Subject sb = new Subject();
            Semester semester = new Semester();

            sb = sbdao.findSubject(txtSubjectId.getText().toString());
            if(sb != null){
                for(Semester t : sdao.findAll()){
                    if (t.isCurrentSem()){
                        //semester = sdao.findSemester(t.getId());
                        semester = t;
                    }
                }
                st.setSubjectId(txtSubjectId.getText());
                st.setSubjectName(sb.getSubjectName());
                st.setCredits(sb.getCredits());
                st.setGvlt(txtGvlt.getText());
                st.setRoom(txtRoom.getText());
                st.setCa(txtCa.getText());
                st.setThu(txtDay.getText());
                st.setSlots(Integer.parseInt(txtSlots.getText()));
                st.setSemName(semester.getId().getSemName());
                st.setYear(semester.getId().getYear());
            }else{
                JOptionPane.showMessageDialog(null, "Mã môn học không tồn tại trong hệ thống");
            }
            
            if(stdao.saveCourse(st)){
                JOptionPane.showMessageDialog(null, "Thêm 1 học phần thành công");
                LoadData();
            }
            else {
                JOptionPane.showMessageDialog(null, "Thêm học phần thất bại");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Vui lòng nhập đầy đủ thông tin");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtSubjectId.setText("");
        txtGvlt.setText("");
        txtRoom.setText("");
        txtDay.setText("");
        txtCa.setText("");
        txtSlots.setText("");
        LoadData();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnFind2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFind2ActionPerformed
        
    }//GEN-LAST:event_btnFind2ActionPerformed

    private void txtRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomActionPerformed

    private void txtDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDayActionPerformed

    private void txtCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCaActionPerformed

    private void txtSlotsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSlotsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSlotsActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind2;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbNameCurrentSemester;
    private javax.swing.JLabel lbYearCurrentSemester;
    private javax.swing.JTable tblCourses;
    private javax.swing.JTextField txtCa;
    private javax.swing.JTextField txtDay;
    private javax.swing.JTextField txtGvlt;
    private javax.swing.JTextField txtRoom;
    private javax.swing.JTextField txtSlots;
    private javax.swing.JTextField txtSubjectId;
    // End of variables declaration//GEN-END:variables
}