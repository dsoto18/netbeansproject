/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospitaldatabase;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author diego
 */
public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddEmployeeBtn = new javax.swing.JButton();
        AddMedRecBtn = new javax.swing.JButton();
        AddVehicleBtn = new javax.swing.JButton();
        AddAppointmentBtn = new javax.swing.JButton();
        AddPharmacyBtn = new javax.swing.JButton();
        AddDoctorBtn = new javax.swing.JButton();
        AddPrescriptionBtn = new javax.swing.JButton();
        AddReceptionistBtn = new javax.swing.JButton();
        AddDiagnosisBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        AddEmployeeBtn.setText("Add Employee");
        AddEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEmployeeBtnActionPerformed(evt);
            }
        });

        AddMedRecBtn.setText("Add Medical Record");
        AddMedRecBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMedRecBtnActionPerformed(evt);
            }
        });

        AddVehicleBtn.setText("Add Vehicle");
        AddVehicleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddVehicleBtnActionPerformed(evt);
            }
        });

        AddAppointmentBtn.setText("Add Appointment");
        AddAppointmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAppointmentBtnActionPerformed(evt);
            }
        });

        AddPharmacyBtn.setText("Add Pharmacy");
        AddPharmacyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPharmacyBtnActionPerformed(evt);
            }
        });

        AddDoctorBtn.setText("Add Doctor");
        AddDoctorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDoctorBtnActionPerformed(evt);
            }
        });

        AddPrescriptionBtn.setText("Add Prescription");
        AddPrescriptionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPrescriptionBtnActionPerformed(evt);
            }
        });

        AddReceptionistBtn.setText("Add Receptionist");
        AddReceptionistBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddReceptionistBtnActionPerformed(evt);
            }
        });

        AddDiagnosisBtn.setText("Add Diagnosis");
        AddDiagnosisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDiagnosisBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddAppointmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AddReceptionistBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddVehicleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AddPrescriptionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddMedRecBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AddDoctorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddEmployeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AddPharmacyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AddDiagnosisBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddEmployeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddPharmacyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddDiagnosisBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddMedRecBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddDoctorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddVehicleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddPrescriptionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddAppointmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddReceptionistBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEmployeeBtnActionPerformed
        AddEmployee ad = new AddEmployee();
        ad.setVisible(true);
    }//GEN-LAST:event_AddEmployeeBtnActionPerformed

    private void AddMedRecBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMedRecBtnActionPerformed
        AddMedicalRecord ad = new AddMedicalRecord();
        ad.setVisible(true);
    }//GEN-LAST:event_AddMedRecBtnActionPerformed

    private void AddVehicleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddVehicleBtnActionPerformed
        AddVehicle ad = new AddVehicle();
        ad.setVisible(true);
    }//GEN-LAST:event_AddVehicleBtnActionPerformed

    private void AddAppointmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAppointmentBtnActionPerformed
        AddAppointment ad = new AddAppointment();
        ad.setVisible(true);
    }//GEN-LAST:event_AddAppointmentBtnActionPerformed

    private void AddPharmacyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPharmacyBtnActionPerformed
        AddPharmacy ad = new AddPharmacy();
        ad.setVisible(true);
    }//GEN-LAST:event_AddPharmacyBtnActionPerformed

    private void AddDoctorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDoctorBtnActionPerformed
        AddDoctor ad = new AddDoctor();
        ad.setVisible(true);
    }//GEN-LAST:event_AddDoctorBtnActionPerformed

    private void AddPrescriptionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPrescriptionBtnActionPerformed
        AddPrescriptions ad = new AddPrescriptions();
        ad.setVisible(true);
    }//GEN-LAST:event_AddPrescriptionBtnActionPerformed

    private void AddReceptionistBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddReceptionistBtnActionPerformed
        AddReceptionist ad = new AddReceptionist();
        ad.setVisible(true);
    }//GEN-LAST:event_AddReceptionistBtnActionPerformed

    private void AddDiagnosisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDiagnosisBtnActionPerformed
        AddDiagnosis ad = new AddDiagnosis();
        ad.setVisible(true);
    }//GEN-LAST:event_AddDiagnosisBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAppointmentBtn;
    private javax.swing.JButton AddDiagnosisBtn;
    private javax.swing.JButton AddDoctorBtn;
    private javax.swing.JButton AddEmployeeBtn;
    private javax.swing.JButton AddMedRecBtn;
    private javax.swing.JButton AddPharmacyBtn;
    private javax.swing.JButton AddPrescriptionBtn;
    private javax.swing.JButton AddReceptionistBtn;
    private javax.swing.JButton AddVehicleBtn;
    // End of variables declaration//GEN-END:variables
}
