/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospitaldatabase;

import java.sql.*;
import javax.swing.*; 
import javax.swing.text.Position;
/**
 *
 * @author diego
 */
public class AddVehicle extends javax.swing.JFrame {

    final void FillList(){
        try{
        String url = "jdbc:derby://localhost:1527/NewHospitalData";
        String username = "dsoto";
        String password = "dsoto";
        
        Connection con = DriverManager.getConnection(url, username, password);
        Statement stmt = con.createStatement();
        
        String Query = "SELECT * FROM VEHICLE";
        
        ResultSet rs = stmt.executeQuery(Query);
        
        DefaultListModel DLM = new DefaultListModel();
        
        
        
        while(rs.next()){
            DLM.addElement(rs.getString(1));
            
        }
        
        List1.setModel(DLM);
        
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString()); 
        }
    }
    
    public AddVehicle() {
        initComponents();
        FillList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        VehicleTagText = new javax.swing.JTextField();
        DriverNameText = new javax.swing.JTextField();
        DateOfArrivalText = new javax.swing.JTextField();
        TimeOfArrivalText = new javax.swing.JTextField();
        AddVehicleBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        SearchText = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        List1 = new javax.swing.JList<>();
        BackBtn = new javax.swing.JButton();
        dropDown1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Vehicle Tag:");

        jLabel2.setText("Driver Name:");

        jLabel3.setText("Date of Arrival:");

        jLabel4.setText("Time of Arrival:");

        AddVehicleBtn.setText("Add Vehicle");
        AddVehicleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddVehicleBtnActionPerformed(evt);
            }
        });

        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        List1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                List1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(List1);

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        dropDown1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        dropDown1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropDown1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dropDown1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138)
                        .addComponent(BackBtn))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(VehicleTagText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(DriverNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(98, 98, 98)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(SearchText)
                                .addComponent(SearchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(DateOfArrivalText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TimeOfArrivalText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(58, 58, 58)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(AddVehicleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(67, 67, 67)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VehicleTagText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DriverNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DateOfArrivalText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TimeOfArrivalText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(AddVehicleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BackBtn)
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dropDown1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddVehicleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddVehicleBtnActionPerformed
         
       try{
        String url = "jdbc:derby://localhost:1527/NewHospitalData";
        String username = "dsoto";
        String password = "dsoto";
        
        Connection con = DriverManager.getConnection(url, username, password);
        Statement stmt = con.createStatement();
        String Query = "INSERT INTO VEHICLE (VEHICLE_TAG, DRIVER_NAME, DATE_OF_ARRIVAL, TIME_OF_ARRIVAL) VALUES ('"+VehicleTagText.getText()+"' , '"+DriverNameText.getText()+"' , '"+DateOfArrivalText.getText()+"' , '"+TimeOfArrivalText.getText()+"')";
       
        stmt.execute(Query);
        
        JOptionPane.showMessageDialog(null, "Vehicle added to database.");
        
        VehicleTagText.setText(null);
        DriverNameText.setText(null);
        DateOfArrivalText.setText(null);
        TimeOfArrivalText.setText(null);
        
        FillList();
       }
       catch(SQLException ex){
           JOptionPane.showMessageDialog(null, ex.toString());
       }
       
        
    }//GEN-LAST:event_AddVehicleBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        try{
        String url = "jdbc:derby://localhost:1527/NewHospitalData";
        String username = "dsoto";
        String password = "dsoto";
        
        Connection con = DriverManager.getConnection(url, username, password);
        Statement stmt = con.createStatement();
        
        String Query = "UPDATE VEHICLE SET VEHICLE_TAG = '"+VehicleTagText.getText()+"', DRIVER_NAME = '"+DriverNameText.getText()+"', DATE_OF_ARRIVAL = '"+DateOfArrivalText.getText()+"', TIME_OF_ARRIVAL = '"+TimeOfArrivalText.getText()+"' WHERE VEHICLE_TAG = '"+List1.getSelectedValue()+"'";
        
        stmt.execute(Query);
        
        JOptionPane.showMessageDialog(null, "Vehicle Info Updated Successfully.");
            
        FillList();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString()); 
        }
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        try{
        String url = "jdbc:derby://localhost:1527/NewHospitalData";
        String username = "dsoto";
        String password = "dsoto";
        
        Connection con = DriverManager.getConnection(url, username, password);
        Statement stmt = con.createStatement();
        
        String Query = "DELETE FROM VEHICLE WHERE VEHICLE_TAG = '"+List1.getSelectedValue()+"'";
        
        stmt.execute(Query);
        
        JOptionPane.showMessageDialog(null, "Vehicle Deleted Successfully.");
            
        FillList();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString()); 
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void List1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_List1ValueChanged
        try{
        String url = "jdbc:derby://localhost:1527/NewHospitalData";
        String username = "dsoto";
        String password = "dsoto";
        
        Connection con = DriverManager.getConnection(url, username, password);
        Statement stmt = con.createStatement();
        
        String Query = "SELECT * FROM VEHICLE WHERE VEHICLE_TAG = '"+List1.getSelectedValue()+"'";
        
        ResultSet rs = stmt.executeQuery(Query);
        
        
        
        while(rs.next()){
            
            VehicleTagText.setText(rs.getString(1));
            DriverNameText.setText(rs.getString(2));
            DateOfArrivalText.setText(rs.getString(3));
            TimeOfArrivalText.setText(rs.getString(4));
            
        }
        
        
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString()); 
        }
    }//GEN-LAST:event_List1ValueChanged

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        int result = List1.getNextMatch(SearchText.getText(), 0, Position.Bias.Forward);
        List1.setSelectedIndex(result);
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        Main ad = new Main();
        ad.setVisible(true);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void dropDown1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropDown1ActionPerformed
        int result = List1.getNextMatch(SearchText.getText(), 0, Position.Bias.Forward);
        List1.setSelectedIndex(result);
    }//GEN-LAST:event_dropDown1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddVehicle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddVehicleBtn;
    private javax.swing.JButton BackBtn;
    private javax.swing.JTextField DateOfArrivalText;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextField DriverNameText;
    private javax.swing.JList<String> List1;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JTextField SearchText;
    private javax.swing.JTextField TimeOfArrivalText;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JTextField VehicleTagText;
    private javax.swing.JComboBox<String> dropDown1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}