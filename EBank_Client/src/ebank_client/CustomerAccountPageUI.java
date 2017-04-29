/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebank_client;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.lang.Exception;

/**
 *
 * @author USER
 */
public class CustomerAccountPageUI extends javax.swing.JFrame {

    /**
     * Creates new form CustomerAccountPageUI
     */
    public CustomerAccountPageUI(String name, String birthDate, String address, String mobile, String email, String accountType, String accountNumber, String sortCode, String balance, String card) {

        initComponents();

        // read the header image as a BufferedImage
        BufferedImage img1 = null;
        try {
            img1 = ImageIO.read(new File("images/ShortHeader.jpg"));
        } catch (IOException e) {
            // error message
            JOptionPane.showMessageDialog(new JFrame(), "Loading image for Reel 1 failed", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        // resize the BufferedImage
        //Image dimg1 = img1.getScaledInstance(510, 90, BufferedImage.SCALE_SMOOTH);
        Image dimg1 = img1.getScaledInstance(lblHeader.getWidth(), lblHeader.getHeight() + 10, BufferedImage.SCALE_SMOOTH);

        // assign to reel label
        ImageIcon imageIcon1 = new ImageIcon(dimg1);
        lblHeader.setIcon(imageIcon1);

        // initialize text fields with given details of the selected customer
        txtName.setText(name);
        txtBirthDate.setText(birthDate);
        txtAddress.setText(address);
        txtMobile.setText(mobile);
        txtEmail.setText(email);
        txtAccountType.setText(accountType);
        txtAccountNumber.setText(accountNumber);
        txtSortCode.setText(sortCode);
        txtBalance.setText(balance);
        txtCard.setText(card);

        // account number cannot be changed
        txtAccountNumber.setEnabled(false);

        // check name (got after clicking Select button)
        if (name.isEmpty()) {
            // only creating is possible
            btnEdit.setEnabled(false);
            btnDelete.setEnabled(false);

        } else {
            // only edit & delete possible
            btnCreate.setEnabled(false);

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

        txtName = new javax.swing.JTextField();
        txtBirthDate = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtMobile = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAccountType = new javax.swing.JTextField();
        txtAccountNumber = new javax.swing.JTextField();
        txtSortCode = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtBalance = new javax.swing.JTextField();
        txtCard = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblHeader = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setLocation(new java.awt.Point(500, 200));
        setResizable(false);

        jLabel1.setText("Name :");

        jLabel2.setText("Birth Date :");

        jLabel3.setText("Address :");

        jLabel4.setText("Mobile :");

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel5.setText("Account Type :");

        jLabel6.setText("Account Number :");

        jLabel7.setText("Sort Code :");

        jLabel8.setText("Balance :");

        jLabel9.setText("Card :");

        jLabel10.setText("E-Mail :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(185, 6, 65));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Customer Account");

        lblHeader.setBackground(new java.awt.Color(0, 102, 102));
        lblHeader.setOpaque(true);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("YYYY-MM-DD");

        jLabel13.setForeground(new java.awt.Color(153, 0, 0));
        jLabel13.setText("*");

        jLabel14.setForeground(new java.awt.Color(153, 0, 0));
        jLabel14.setText("*");

        jLabel15.setForeground(new java.awt.Color(153, 0, 0));
        jLabel15.setText("*");

        jLabel16.setForeground(new java.awt.Color(153, 0, 0));
        jLabel16.setText("*");

        jLabel17.setForeground(new java.awt.Color(153, 0, 0));
        jLabel17.setText("*");

        jLabel18.setForeground(new java.awt.Color(153, 0, 0));
        jLabel18.setText("*");

        jLabel19.setForeground(new java.awt.Color(153, 0, 0));
        jLabel19.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10)
                        .addComponent(jLabel4))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(2, 2, 2)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMobile)
                    .addComponent(txtAddress)
                    .addComponent(txtName)
                    .addComponent(txtEmail)
                    .addComponent(txtAccountNumber)
                    .addComponent(txtSortCode)
                    .addComponent(txtBalance)
                    .addComponent(txtCard, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(txtAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCreate)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(123, 123, 123))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel11)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSortCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        try {

            if (Session.isLoggedIn) {

                // user logged in
                // get values from GUI
                String name = txtName.getText();
                String birthDate = txtBirthDate.getText();
                String address = txtAddress.getText();
                String mobile = txtMobile.getText();
                String email = txtEmail.getText();
                String accountType = txtAccountType.getText();
                String accountNumber = txtAccountNumber.getText();
                String sortCode = txtSortCode.getText();
                double balance = Double.parseDouble(txtBalance.getText());
                String card = txtCard.getText();

                if (name.isEmpty() || birthDate.isEmpty() || address.isEmpty() || mobile.isEmpty() || accountType.isEmpty() || accountNumber.isEmpty()) {

                    // required fields not filled
                    throw new Exception("Please fill in the required details");

                } else if (balance < 0) {

                    // negative amount for balance is not possible
                    throw new Exception("Invalid amount for balance");

                } else {

                    // edit the record in the table, which has the given email & accountNumber
                    editCustomer(name, birthDate, address, mobile, email, accountType, accountNumber, sortCode, balance, card);

                    JOptionPane.showMessageDialog(new JFrame(), "Successfully Edited!", "Success",
                            JOptionPane.INFORMATION_MESSAGE);

                    this.setVisible(false);
                    CustomersListUI customersListUI = new CustomersListUI();
                    customersListUI.setVisible(true);
                }

            } else {

                // user not logged in
                throw new Exception("You are not logged in. Please login to continue");
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(new JFrame(), "Invalid value for Balance. Please enter a number", "Error",
                    JOptionPane.ERROR_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(new JFrame(), ex.getLocalizedMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        try {

            if (Session.isLoggedIn) {

                // user logged in
                // get values from GUI
                String name = txtName.getText();
                String birthDate = txtBirthDate.getText();
                String address = txtAddress.getText();
                String mobile = txtMobile.getText();
                String email = txtEmail.getText();
                String accountType = txtAccountType.getText();
                String accountNumber = txtAccountNumber.getText();
                String sortCode = txtSortCode.getText();
                double balance = Double.parseDouble(txtBalance.getText());
                String card = txtCard.getText();

                if (name.isEmpty() || birthDate.isEmpty() || address.isEmpty() || mobile.isEmpty() || accountType.isEmpty() || accountNumber.isEmpty()) {

                    // required fields not filled
                    throw new Exception("Please fill in the required details");

                } else if (balance < 0) {

                    // negative amount for balance is not possible
                    throw new Exception("Invalid amount for balance");

                } else {

                    // insert a record into table 'customers' with the given details
                    createCustomer(name, birthDate, address, mobile, email, accountType, accountNumber, sortCode, balance, card);

                    JOptionPane.showMessageDialog(new JFrame(), "Successfully Created!", "Success",
                            JOptionPane.INFORMATION_MESSAGE);

                    this.setVisible(false);
                    CustomersListUI customersListUI = new CustomersListUI();
                    customersListUI.setVisible(true);
                }

            } else {

                // user not logged in
                throw new Exception("You are not logged in. Please login to continue");
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(new JFrame(), "Invalid value for Balance. Please enter a number", "Error",
                    JOptionPane.ERROR_MESSAGE);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(new JFrame(), e.getLocalizedMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {

            if (Session.isLoggedIn) {

                // user logged in
                // get values from GUI
                String accountNumber = txtAccountNumber.getText();

                if (accountNumber.isEmpty()) {
                    // account number not specified
                    throw new Exception("Please specify the account number to delete");
                } else {
                    // account number specified
                    // delete the record from the table, which has the given email and accountNumber
                    deleteCustomer(accountNumber);

                    JOptionPane.showMessageDialog(new JFrame(), "Successfully Deleted!", "Success",
                            JOptionPane.INFORMATION_MESSAGE);

                    this.setVisible(false);
                    CustomersListUI customersListUI = new CustomersListUI();
                    customersListUI.setVisible(true);
                }

            } else {

                // user not logged in
                throw new Exception("You are not logged in. Please login to continue");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(new JFrame(), e.getLocalizedMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JTextField txtAccountNumber;
    private javax.swing.JTextField txtAccountType;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtBirthDate;
    private javax.swing.JTextField txtCard;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSortCode;
    // End of variables declaration//GEN-END:variables

    private static int deleteCustomer(java.lang.String accountNumber) throws Exception {
        EBank_Client_Customer.EBankCustomerWS_Service service = new EBank_Client_Customer.EBankCustomerWS_Service();
        EBank_Client_Customer.EBankCustomerWS port = service.getEBankCustomerWSPort();
        return port.deleteCustomer(accountNumber);
    }

    private static int editCustomer(java.lang.String name, java.lang.String birthDate, java.lang.String address, java.lang.String mobile, java.lang.String email, java.lang.String accountType, java.lang.String accountNumber, java.lang.String sortCode, double balance, java.lang.String card) throws Exception {
        EBank_Client_Customer.EBankCustomerWS_Service service = new EBank_Client_Customer.EBankCustomerWS_Service();
        EBank_Client_Customer.EBankCustomerWS port = service.getEBankCustomerWSPort();
        return port.editCustomer(name, birthDate, address, mobile, email, accountType, accountNumber, sortCode, balance, card);
    }

    private static int createCustomer(java.lang.String name, java.lang.String birthDate, java.lang.String address, java.lang.String mobile, java.lang.String email, java.lang.String accountType, java.lang.String accountNumber, java.lang.String sortCode, double balance, java.lang.String card) throws Exception {
        EBank_Client_Customer.EBankCustomerWS_Service service = new EBank_Client_Customer.EBankCustomerWS_Service();
        EBank_Client_Customer.EBankCustomerWS port = service.getEBankCustomerWSPort();
        return port.createCustomer(name, birthDate, address, mobile, email, accountType, accountNumber, sortCode, balance, card);
    }
}
