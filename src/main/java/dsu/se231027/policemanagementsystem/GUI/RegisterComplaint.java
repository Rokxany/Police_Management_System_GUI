/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dsu.se231027.policemanagementsystem.GUI;

import java.awt.TextComponent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Hamza Nizamani
 */
public class RegisterComplaint extends javax.swing.JFrame {

    /**
     * Creates new form RegisterComplaint
     */
    public RegisterComplaint() {
        initComponents();
    }
    
    private boolean validateCNIC() {
        String cnic = TextCNIC.getText();
        String regex = "^[0-9]{5}-[0-9]{7}-[0-9]$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(cnic);
        boolean matchFound = matcher.find();
        if(matchFound) {
          System.out.println("Match found");
          return true;
        } else {
          System.out.println("Match not found");
          return false;
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TextCNIC = new javax.swing.JTextField();
        TextName = new javax.swing.JTextField();
        TextPhoneNumber = new javax.swing.JTextField();
        TextEmailAddress = new javax.swing.JTextField();
        TextAddress = new javax.swing.JTextArea();
        ComboCity = new javax.swing.JComboBox<>();
        LabelCNICValidator = new javax.swing.JLabel();
        ComboComplaintType = new javax.swing.JComboBox<>();
        TextComplaintDetails = new javax.swing.JTextArea();
        ButtonReset = new javax.swing.JButton();
        ButtonSave = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CancelButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(720, 480));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 350));

        TextCNIC.setToolTipText("xxxxx-xxxxxxx-x");
        TextCNIC.setBorder(javax.swing.BorderFactory.createTitledBorder("Your CNIC"));
        TextCNIC.setNextFocusableComponent(TextPhoneNumber);
        TextCNIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCNICActionPerformed(evt);
            }
        });

        TextName.setBorder(javax.swing.BorderFactory.createTitledBorder("Your Name"));
        TextName.setNextFocusableComponent(TextCNIC);
        TextName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNameActionPerformed(evt);
            }
        });

        TextPhoneNumber.setBorder(javax.swing.BorderFactory.createTitledBorder("Phone Number"));
        TextPhoneNumber.setNextFocusableComponent(TextEmailAddress);
        TextPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextPhoneNumberActionPerformed(evt);
            }
        });

        TextEmailAddress.setBorder(javax.swing.BorderFactory.createTitledBorder("Email Address"));
        TextEmailAddress.setNextFocusableComponent(TextAddress);
        TextEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextEmailAddressActionPerformed(evt);
            }
        });

        TextAddress.setColumns(20);
        TextAddress.setRows(5);
        TextAddress.setBorder(javax.swing.BorderFactory.createTitledBorder("Address"));
        TextAddress.setNextFocusableComponent(ComboCity);

        ComboCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Karachi", "Lahore", "Islamabad", "Peshawar" }));
        ComboCity.setBorder(javax.swing.BorderFactory.createTitledBorder("City"));
        ComboCity.setNextFocusableComponent(ComboComplaintType);
        ComboCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCityActionPerformed(evt);
            }
        });

        LabelCNICValidator.setForeground(new java.awt.Color(204, 0, 0));
        LabelCNICValidator.setText(" ");
        LabelCNICValidator.setFocusable(false);

        ComboComplaintType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Theft", "Kidnapping", "Robbery", "Murder", "Other" }));
        ComboComplaintType.setBorder(javax.swing.BorderFactory.createTitledBorder("Complaint Type"));
        ComboComplaintType.setNextFocusableComponent(TextComplaintDetails);
        ComboComplaintType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboComplaintTypeActionPerformed(evt);
            }
        });

        TextComplaintDetails.setColumns(20);
        TextComplaintDetails.setRows(5);
        TextComplaintDetails.setTabSize(4);
        TextComplaintDetails.setBorder(javax.swing.BorderFactory.createTitledBorder("Complaint Details"));

        ButtonReset.setBackground(new java.awt.Color(169, 78, 78));
        ButtonReset.setText("Reset");
        ButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonResetActionPerformed(evt);
            }
        });

        ButtonSave.setBackground(new java.awt.Color(114, 160, 92));
        ButtonSave.setText("Save");
        ButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextName)
                    .addComponent(TextCNIC)
                    .addComponent(TextPhoneNumber)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelCNICValidator, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 230, Short.MAX_VALUE))
                    .addComponent(TextEmailAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(TextAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(ButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ComboCity, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboComplaintType, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextComplaintDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelCNICValidator)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextCNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TextPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TextEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(ComboCity, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboComplaintType, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextComplaintDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register Complaint");

        CancelButton.setBackground(new java.awt.Color(204, 204, 204));
        CancelButton.setText("Go back");
        CancelButton.setNextFocusableComponent(TextName);
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 102, 102));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("X");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(CancelButton))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
        new Dashboard().setVisible(true);
        
    }//GEN-LAST:event_formWindowClosed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        dispose();
        new Dashboard().setVisible(true);
        
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void TextPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextPhoneNumberActionPerformed

    private void TextNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNameActionPerformed

    private void TextCNICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCNICActionPerformed
        if(validateCNIC()) {
            LabelCNICValidator.setText(" ");
        }
        else {
            LabelCNICValidator.setText("Invalid CNIC!");
        }
    }//GEN-LAST:event_TextCNICActionPerformed

    private void ComboCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboCityActionPerformed

    private void TextEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextEmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextEmailAddressActionPerformed

    private void ComboComplaintTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboComplaintTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboComplaintTypeActionPerformed

    private void ButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonResetActionPerformed

        // Empties All Text Boxes
        TextName.setText("");
        TextCNIC.setText("");
        TextEmailAddress.setText("");
        TextPhoneNumber.setText("");
        ComboCity.setSelectedIndex(0);
        ComboComplaintType.setSelectedIndex(0);
        TextAddress.setText("");
        TextComplaintDetails.setText("");
        //Resets Warnings
        LabelCNICValidator.setText(" ");

    }//GEN-LAST:event_ButtonResetActionPerformed

    private void ButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSaveActionPerformed
        if(validateCNIC()) {
            LabelCNICValidator.setText(" ");
            JOptionPane.showMessageDialog(this, "Name: "+TextName.getText()+"\nCNIC: "+TextCNIC.getText()+"\nPhone Number : "+TextPhoneNumber.getText()+"\nEmail Address: "+TextEmailAddress.getText()+"\nAddress: "+TextAddress.getText()+"\nCity: "+ComboCity.getSelectedItem()+"\nComplaint Type: "+ComboComplaintType.getSelectedItem()+"\nComplaint Details: "+TextComplaintDetails.getText());
        }
        else {
            LabelCNICValidator.setText("Invalid CNIC!");
            JOptionPane.showMessageDialog(this, "Invalid CNIC, Please Enter Correct CNIC Number", "CNIC Format Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ButtonSaveActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        dispose();

    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterComplaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterComplaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterComplaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterComplaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterComplaint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonReset;
    private javax.swing.JButton ButtonSave;
    private javax.swing.JButton CancelButton;
    private javax.swing.JComboBox<String> ComboCity;
    private javax.swing.JComboBox<String> ComboComplaintType;
    private javax.swing.JLabel LabelCNICValidator;
    private javax.swing.JTextArea TextAddress;
    private javax.swing.JTextField TextCNIC;
    private javax.swing.JTextArea TextComplaintDetails;
    private javax.swing.JTextField TextEmailAddress;
    private javax.swing.JTextField TextName;
    private javax.swing.JTextField TextPhoneNumber;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}