/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package incomeexpense;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author halis
 */
public class Useradm extends javax.swing.JFrame {

    
    public Useradm() {
        initComponents();
        SelectUser();
    }
        
    Connection Con = null;
    ResultSet Rs = null;
    Statement St = null;
    PreparedStatement add = null;
    
    
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        DashboardLabel = new javax.swing.JLabel();
        AusgabenLabel = new javax.swing.JLabel();
        EinkommenLabel = new javax.swing.JLabel();
        UebersichtEinnahmenLabel = new javax.swing.JLabel();
        UebersichtAusgabenLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        loeschenbtn = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserTable = new javax.swing.JTable();
        aktualisierenbtn = new java.awt.Button();
        hinzufuegenbtn = new java.awt.Button();
        UserField = new javax.swing.JTextField();
        PWField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(48, 58, 73));

        DashboardLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DashboardLabel.setForeground(new java.awt.Color(255, 255, 255));
        DashboardLabel.setText("Dashboard");
        DashboardLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashboardLabelMouseClicked(evt);
            }
        });

        AusgabenLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AusgabenLabel.setForeground(new java.awt.Color(255, 255, 255));
        AusgabenLabel.setText("Ausgaben");
        AusgabenLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AusgabenLabelMouseClicked(evt);
            }
        });

        EinkommenLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EinkommenLabel.setForeground(new java.awt.Color(255, 255, 255));
        EinkommenLabel.setText("Einkommen");
        EinkommenLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EinkommenLabelMouseClicked(evt);
            }
        });

        UebersichtEinnahmenLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UebersichtEinnahmenLabel.setForeground(new java.awt.Color(255, 255, 255));
        UebersichtEinnahmenLabel.setText("Übersicht Einnahmen");
        UebersichtEinnahmenLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UebersichtEinnahmenLabelMouseClicked(evt);
            }
        });

        UebersichtAusgabenLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UebersichtAusgabenLabel.setForeground(new java.awt.Color(255, 255, 255));
        UebersichtAusgabenLabel.setText("Übersicht Ausgaben");
        UebersichtAusgabenLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UebersichtAusgabenLabelMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nutzerverwaltung");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(UebersichtAusgabenLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AusgabenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UebersichtEinnahmenLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EinkommenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DashboardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DashboardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EinkommenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AusgabenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UebersichtEinnahmenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UebersichtAusgabenLabel)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(452, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Nutzerverwaltung");

        loeschenbtn.setActionCommand("Löschen");
        loeschenbtn.setBackground(new java.awt.Color(204, 204, 204));
        loeschenbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loeschenbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loeschenbtn.setLabel("Löschen");
        loeschenbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loeschenbtnMouseClicked(evt);
            }
        });
        loeschenbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loeschenbtnActionPerformed(evt);
            }
        });

        UserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "UID", "UNAME", "UPASS"
            }
        ));
        UserTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(UserTable);

        aktualisierenbtn.setActionCommand("Aktualisieren");
        aktualisierenbtn.setBackground(new java.awt.Color(204, 204, 204));
        aktualisierenbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        aktualisierenbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        aktualisierenbtn.setLabel("Aktualisieren");
        aktualisierenbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aktualisierenbtnMouseClicked(evt);
            }
        });
        aktualisierenbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aktualisierenbtnActionPerformed(evt);
            }
        });

        hinzufuegenbtn.setBackground(new java.awt.Color(204, 204, 204));
        hinzufuegenbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hinzufuegenbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hinzufuegenbtn.setLabel("Hinzufügen");
        hinzufuegenbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hinzufuegenbtnMouseClicked(evt);
            }
        });
        hinzufuegenbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hinzufuegenbtnActionPerformed(evt);
            }
        });

        UserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserFieldActionPerformed(evt);
            }
        });

        PWField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PWFieldActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("User");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Passwort");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGap(158, 158, 158)
                                    .addComponent(aktualisierenbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(hinzufuegenbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(27, 27, 27)
                            .addComponent(loeschenbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(9, 9, 9)))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(UserField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(PWField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(1270, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PWField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loeschenbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aktualisierenbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(hinzufuegenbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(32, 132, 252));
        jPanel4.setForeground(new java.awt.Color(32, 132, 252));
        jPanel4.setPreferredSize(new java.awt.Dimension(100, 54));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Finanzen");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 2103, Short.MAX_VALUE)
                .addGap(126, 126, 126))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1185, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   public void SelectUser(){
    
    try{
        Con = DriverManager.getConnection("jdbc:derby://localhost:1527/Finanzendb","user2","1234");
        St = Con.createStatement();
        Rs = St.executeQuery("Select * from user2.USERTBL");
        UserTable.setModel(DbUtils.resultSetToTableModel(Rs));
    }catch(SQLException e)
    {    
        e.printStackTrace();
    }
}     
    
    
    
    
    
    
    
    
    
    
    
    
    private void loeschenbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loeschenbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loeschenbtnActionPerformed

    private void aktualisierenbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aktualisierenbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aktualisierenbtnActionPerformed

    private void hinzufuegenbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hinzufuegenbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hinzufuegenbtnActionPerformed

    private void hinzufuegenbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hinzufuegenbtnMouseClicked
        // TODO add your handling code here:
        
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/Finanzendb","user2","1234");
            PreparedStatement add = Con.prepareStatement("insert into USERTBL(UNAME,UPASS) values(?,?)");
          
           //Werte werden in die Datenbank hinzugefügt  
            add.setString(1, UserField.getText());
            add.setString(2, PWField.getText());
            
            int row = add.executeUpdate(); 
             
            JOptionPane.showMessageDialog(this,"Nutzer erfolgreich hinzugefügt");
            Con.close();

        }
        catch(SQLException e)

        {

            e.printStackTrace();

        }
        
        
        
        
    }//GEN-LAST:event_hinzufuegenbtnMouseClicked

    private void UserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserFieldActionPerformed

    private void PWFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PWFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PWFieldActionPerformed

    private void aktualisierenbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aktualisierenbtnMouseClicked
        // TODO add your handling code here:
        
         if(UserField.getText().isEmpty() || PWField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"fehlende Informationen"); 
        }  
        else
        {
            try{
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/Finanzendb","user2","1234");
                int row = UserTable.getSelectedRow();
                String value = (UserTable.getModel().getValueAt(row, 0).toString());
                String updatequery = "Update user2.USERTBL set UNAME=?, UPASS=? where UID="+value;
                PreparedStatement Add = Con.prepareStatement(updatequery);
                Add.setString(1, UserField.getText());
                Add.setString(2, PWField.getText());
                
                
                
                Add.executeUpdate();
                
                DefaultTableModel model = (DefaultTableModel)UserTable.getModel();
                SelectUser();
                JOptionPane.showMessageDialog(this,"User erfolgreich aktualisiert");
            }catch(SQLException e){
                e.printStackTrace();
            }
            
        }
        
        
          
    }//GEN-LAST:event_aktualisierenbtnMouseClicked

    private void loeschenbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loeschenbtnMouseClicked
        // Funktion User löschen
        if(UserField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Wählen Sie den zu löschenden User");
        
        }
        else{
            try{
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/Finanzendb","user2","1234");
               
                int row = UserTable.getSelectedRow();
                String value = (UserTable.getModel().getValueAt(row, 0).toString());
                String query = "Delete from USERTBL where UID=" + value;
                
                PreparedStatement add = Con.prepareStatement(query);
                add.executeUpdate();
                DefaultTableModel model = (DefaultTableModel)UserTable.getModel();
                SelectUser();
                JOptionPane.showMessageDialog(this,"User erfolgreich gelöscht");
            }catch(SQLException e)
            {
                e.printStackTrace();
            
            }
        }
        
        
        
    }//GEN-LAST:event_loeschenbtnMouseClicked

    private void UserTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserTableMouseClicked
        // Userdaten anzeigen in den Textfields
        DefaultTableModel model = (DefaultTableModel)UserTable.getModel();
        int Myindex = UserTable.getSelectedRow();
        
        UserField.setText(model.getValueAt(Myindex, 1).toString());
        PWField.setText(model.getValueAt(Myindex, 2).toString());
       
    }//GEN-LAST:event_UserTableMouseClicked

    private void DashboardLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardLabelMouseClicked
        // TODO add your handling code here:
       new Dashboard().setVisible(true);
       this.dispose();
        
    }//GEN-LAST:event_DashboardLabelMouseClicked

    private void EinkommenLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EinkommenLabelMouseClicked
        // TODO add your handling code here:
        new Income().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EinkommenLabelMouseClicked

    private void AusgabenLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AusgabenLabelMouseClicked
        // TODO add your handling code here:
        new Expense().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AusgabenLabelMouseClicked

    private void UebersichtEinnahmenLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UebersichtEinnahmenLabelMouseClicked
        // TODO add your handling code here:
        new ViewIncome().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UebersichtEinnahmenLabelMouseClicked

    private void UebersichtAusgabenLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UebersichtAusgabenLabelMouseClicked
        // TODO add your handling code here:
        new ViewExpense().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UebersichtAusgabenLabelMouseClicked

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
            java.util.logging.Logger.getLogger(Useradm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Useradm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Useradm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Useradm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Useradm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AusgabenLabel;
    private javax.swing.JLabel DashboardLabel;
    private javax.swing.JLabel EinkommenLabel;
    private javax.swing.JTextField PWField;
    private javax.swing.JLabel UebersichtAusgabenLabel;
    private javax.swing.JLabel UebersichtEinnahmenLabel;
    private javax.swing.JTextField UserField;
    private javax.swing.JTable UserTable;
    private java.awt.Button aktualisierenbtn;
    private java.awt.Button hinzufuegenbtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Button loeschenbtn;
    // End of variables declaration//GEN-END:variables
}
