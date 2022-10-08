/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Employee;
import model.EmployeeHistory;

/**
 *
 * @author nihar
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    
    EmployeeHistory empHistory;
    public CreateJPanel(EmployeeHistory empHistory) {
        this.empHistory = empHistory;
        initComponents();
    }
    public String imgePath = "";
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnSave = new javax.swing.JButton();
        jTxtName = new javax.swing.JTextField();
        jTxtEmpID = new javax.swing.JTextField();
        jTxtAge = new javax.swing.JTextField();
        jTxtLevel = new javax.swing.JTextField();
        jTxtEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTxtCellPhoneNum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtTeamInfo1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jOpenBtn = new javax.swing.JButton();
        jTxtStartDate = new javax.swing.JTextField();
        jTxtPositionTitle = new javax.swing.JTextField();
        jTxtGender = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        jBtnSave.setText("Save");
        jBtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSaveActionPerformed(evt);
            }
        });

        jTxtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNameActionPerformed(evt);
            }
        });

        jTxtEmpID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtEmpIDKeyPressed(evt);
            }
        });

        jTxtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtAgeKeyPressed(evt);
            }
        });

        jLabel1.setText("Name");

        jLabel2.setText("Employee ID");

        jTxtCellPhoneNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCellPhoneNumActionPerformed(evt);
            }
        });
        jTxtCellPhoneNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtCellPhoneNumKeyPressed(evt);
            }
        });

        jLabel3.setText("Age");

        jLabel4.setText("Gender");

        jLabel5.setText("Start Date");

        jLabel6.setText("Level");

        jLabel7.setText("Team Info");

        jLabel8.setText("Position Title");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Contact Info");

        jLabel10.setText("Cell Phone");

        jLabel11.setText("Email Address");

        jOpenBtn.setText("Upload image");
        jOpenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOpenBtnActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Create Employee");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jOpenBtn)
                        .addGap(210, 210, 210)
                        .addComponent(jBtnSave))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel10))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTxtName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtEmpID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtAge, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtCellPhoneNum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtGender))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(128, 128, 128)
                                        .addComponent(jLabel6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addComponent(jLabel5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTxtLevel)
                                    .addComponent(jTxtTeamInfo1)
                                    .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtStartDate)
                                    .addComponent(jTxtPositionTitle))))))
                .addContainerGap(117, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel12)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTxtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTxtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTxtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTxtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTxtCellPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTxtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTxtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTxtTeamInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTxtPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addComponent(jLabel9)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSave)
                    .addComponent(jOpenBtn))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSaveActionPerformed
        String name = jTxtName.getText();
        int empId = Integer.parseInt(jTxtEmpID.getText());
        int age = Integer.parseInt(jTxtAge.getText());
        String gender = jTxtGender.getText();
        String startDate = jTxtStartDate.getText();
        String level = jTxtLevel.getText();
        String teamInfo = jTxtTeamInfo1.getText();
        String title = jTxtPositionTitle.getText();
        String cellPhoneNumber = jTxtCellPhoneNum.getText();
        String email = jTxtEmail.getText();
        
        
        Pattern pattern = Pattern.compile("\\d{10}");
        Matcher matcher = pattern.matcher(cellPhoneNumber);
        
        String emailFormate ="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\."  
                + "[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$"; 
        Pattern p = Pattern.compile(emailFormate); 
        
        boolean checkUniqueId = false;
        for(Employee e: empHistory.getEmpHistory()){
            if(e.getEmpId() == empId){
                checkUniqueId = true;
            }
            else{
                continue;
            }
        }
        
        if(imgePath.length()==0)
        {
            JOptionPane.showMessageDialog(null, "Please upload a picture");
        }
        else if(!matcher.matches())
        {
            JOptionPane.showMessageDialog(null, "Please enter a 10 digit cell phone number");
            jTxtCellPhoneNum.setText(null);
                
        }
        else if(!p.matcher(email).matches()){
            {
                JOptionPane.showMessageDialog(null, "Please enter a valid email id");
                jTxtEmail.setText(null);
                
            }
        }
        else if(checkUniqueId){
            JOptionPane.showMessageDialog(null, "Please enter a unique Employee Id");
                jTxtEmpID.setText(null);
        }
        else
        {
        Employee emp = empHistory.addNewEmployee();
        emp.setName(name);
        emp.setEmpId(empId);
        emp.setAge(age);
        emp.setStartDate(startDate);
        emp.setGender(gender);
        emp.setLevel(level);
        emp.setTeamInfo(teamInfo);
        emp.setPositionTitle(title);
        emp.setCellPhoneNumber(cellPhoneNumber);
        emp.setEmailAddress(email);
        emp.setPhoto(imgePath);
        
            JOptionPane.showMessageDialog(this, "Information is saved");
                jTxtName.setText(null);
                jTxtEmpID.setText(null);
                jTxtStartDate.setText(null);
                jTxtLevel.setText(null);
                jTxtAge.setText(null);
                jTxtTeamInfo1.setText(null);
                jTxtGender.setText(null);
                jTxtPositionTitle.setText(null);
                jTxtCellPhoneNum.setText(null);
                jTxtEmail.setText(null);
                imgePath = null;
            
        }
        
       
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnSaveActionPerformed

    private void jOpenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOpenBtnActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.image", "jpg");
        chooser.addChoosableFileFilter(filter);
        chooser.showOpenDialog(null);
        File file = chooser.getSelectedFile();
        imgePath = file.getAbsolutePath();

        // TODO add your handling code here:
    }//GEN-LAST:event_jOpenBtnActionPerformed

    private void jTxtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNameActionPerformed

    private void jTxtEmpIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtEmpIDKeyPressed
        char ch = evt.getKeyChar();
                if(Character.isDigit(ch)){
                }
                else{
                    JOptionPane.showMessageDialog(null, "Only numbers are allowed!");
                    jTxtEmpID.setText(null);
                }
    }//GEN-LAST:event_jTxtEmpIDKeyPressed

    private void jTxtAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtAgeKeyPressed
            
            char ch = evt.getKeyChar();
                if(Character.isDigit(ch)){
                }
                else {
                    JOptionPane.showMessageDialog(null, "Only numbers are allowed!");
                    jTxtAge.setText(null);
                }
    }//GEN-LAST:event_jTxtAgeKeyPressed

    private void jTxtCellPhoneNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtCellPhoneNumKeyPressed
        char ch = evt.getKeyChar();

                if(Character.isDigit(ch)){
                }
                else{
                    JOptionPane.showMessageDialog(null, "Only numbers are allowed!");
                    jTxtCellPhoneNum.setText(null);
                }
    }//GEN-LAST:event_jTxtCellPhoneNumKeyPressed

    private void jTxtCellPhoneNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCellPhoneNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCellPhoneNumActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jOpenBtn;
    private javax.swing.JTextField jTxtAge;
    private javax.swing.JTextField jTxtCellPhoneNum;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtEmpID;
    private javax.swing.JTextField jTxtGender;
    private javax.swing.JTextField jTxtLevel;
    private javax.swing.JTextField jTxtName;
    private javax.swing.JTextField jTxtPositionTitle;
    private javax.swing.JTextField jTxtStartDate;
    private javax.swing.JTextField jTxtTeamInfo1;
    // End of variables declaration//GEN-END:variables
}