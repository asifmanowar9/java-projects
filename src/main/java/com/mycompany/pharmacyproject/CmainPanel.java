/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pharmacyproject;

import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;
import javax.swing.JScrollPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Admin
 */
public class CmainPanel extends javax.swing.JFrame {

    /**
     * Creates new form CmainPanel
     */
    public CmainPanel() {
        initComponents();
        component();
    }
    public void component(){
        
        File read = new File("Medicines.txt");
        String[] col = {"Name","Code","Price(per Strip)","Company","Available Strips","Expiary Date"};

                DefaultTableModel model = new DefaultTableModel();
                 model.setColumnIdentifiers(col);
                jTable1.setModel(model);

        try{
            Scanner sc = new Scanner(read);
            String[] rows = new String[6];
            int i = 0;
            
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                rows[i] = line;
                System.out.println(line);
                if((i+1)%6 == 0){
                    model.addRow(rows);
                    i = 0;
                }
                else i++;
            }
            sc.close();
            Date obj = new Date();
            String date = obj.toString();
             //area.setText(date);
            
        }
        catch(Exception e){
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMname = new javax.swing.JTextField();
        txtCode = new javax.swing.JTextField();
        txtStrips = new javax.swing.JTextField();
        txtPps = new javax.swing.JTextField();
        Buy = new javax.swing.JButton();
        clea = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPn = new javax.swing.JTextField();
        txtFname = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        reload = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        receipt = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        clea1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(215, 243, 241));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 16, 16), 3));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setText("Medicine Name:");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setText("Code:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel3.setText("Strips:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel4.setText("Price per Strip:");

        txtMname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 16, 16), 3));
        txtMname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMnameKeyReleased(evt);
            }
        });

        txtCode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 16, 16), 3));
        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });
        txtCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodeKeyReleased(evt);
            }
        });

        txtStrips.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtStrips.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 16, 16), 3));
        txtStrips.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtStripsKeyReleased(evt);
            }
        });

        txtPps.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPps.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 16, 16), 3));
        txtPps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPpsActionPerformed(evt);
            }
        });
        txtPps.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPpsKeyReleased(evt);
            }
        });

        Buy.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Buy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trolley (2) (1).png"))); // NOI18N
        Buy.setText("Buy and Genarate Bill");
        Buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyActionPerformed(evt);
            }
        });

        clea.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        clea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear (6) (1).png"))); // NOI18N
        clea.setText("Clear");
        clea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel5.setText("Full Name:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel6.setText("Phone Number:");

        txtPn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 16, 16), 3));
        txtPn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPnKeyReleased(evt);
            }
        });

        txtFname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtFname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 16, 16), 3));
        txtFname.setMinimumSize(new java.awt.Dimension(0, 0));
        txtFname.setPreferredSize(new java.awt.Dimension(64, 30));
        txtFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFnameActionPerformed(evt);
            }
        });
        txtFname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFnameKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Buy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clea)
                        .addGap(2, 2, 2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabel5))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(jLabel1)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPps)
                            .addComponent(txtCode)
                            .addComponent(txtMname)
                            .addComponent(txtStrips)
                            .addComponent(txtPn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtMname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(txtCode)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStrips, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPps, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buy)
                    .addComponent(clea, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        jPanel2.setBackground(new java.awt.Color(55, 16, 16));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(55, 16, 16)));

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setMinimumSize(new java.awt.Dimension(1200, 700));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        reload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh (4) (1).png"))); // NOI18N
        reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reloadActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("List's Of Available Medicine");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(reload, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(142, 142, 142))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(reload, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(215, 243, 241));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 16, 16), 3));

        area.setEditable(false);
        area.setColumns(20);
        area.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        area.setRows(5);
        area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 16, 16), 2));
        jScrollPane2.setViewportView(area);

        receipt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        receipt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accounting (2).png"))); // NOI18N
        receipt.setText("Genarate Receipt");
        receipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiptActionPerformed(evt);
            }
        });

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit (1).png"))); // NOI18N
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        clea1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        clea1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear (6) (1).png"))); // NOI18N
        clea1.setText("Clear");
        clea1.setIconTextGap(0);
        clea1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        clea1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clea1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(receipt)
                        .addGap(47, 47, 47))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clea1)
                .addGap(105, 105, 105))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(logout)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2)
                .addGap(18, 18, 18)
                .addComponent(receipt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clea1)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed

    private void txtPpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPpsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPpsActionPerformed

    private void BuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyActionPerformed
    
                                          
    
    
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        SimpleDateFormat date = new SimpleDateFormat("MMM-d-y");
        
        String mName = txtMname.getText();
        String code = txtCode.getText();
        String strips = txtStrips.getText();
        String pps = txtPps.getText();
        String fullname = txtFname.getText();
        String pn = txtPn.getText();
        
         LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM-d-yyyy HH:mm:ss");
        String datef = now.format(formatter);
        
        if (!mName.isEmpty() && !mName.isBlank() && mName != null
                && !code.isEmpty() && !code.isBlank() && code != null
                && !strips.isEmpty() && !strips.isBlank() && strips != null
                && !pps.isEmpty() && !pps.isBlank() && pps != null
                && !fullname.isEmpty() && !fullname.isBlank() && fullname != null
                && !pn.isEmpty() && !pn.isBlank() && pn != null) {
            
int response = JOptionPane.showConfirmDialog(this, "Do you want to continue?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    
    if (response == JOptionPane.YES_OPTION) {

            area.setText(""); // Clear previous content
            area.append("\t*************************\n");
            area.append("\t         RECEIPT\n");
            area.append("\t*************************\n");
            area.append("\n");
            area.append("\tDate and Time : " + datef + "\n");
            area.append("\tFull Name : " + fullname + "\n");
            area.append("\tPhone Number : " + pn + "\n");
            area.append("\tMedicine Name : " + mName + "\n");
            area.append("\tMedicine Code : " + code + "\n");
            area.append("\tTotal Strips  : " + strips + "\n");
            
            double p = Double.parseDouble(pps);
            int t = Integer.parseInt(strips);
            double tp = t * p;
            
            area.append("\tTotal Price   : " + String.format("%.2f", tp) + "TK" + "\n");
            area.append("\tExpiry Date   : " + model.getValueAt(selectedRow, 5) + "\n");
            area.append("\n");
            area.append("\t*************************\n");
            area.append("\t      THANK YOU!\n");
            area.append("\t*************************\n");
            
            if (selectedRow != -1 && selectedRow < model.getRowCount()) {
                int cp = Integer.parseInt(txtStrips.getText());
                int cp2 = Integer.parseInt((String) model.getValueAt(selectedRow, 4));
                int cp3 = cp2 - cp;
                String sss = Integer.toString(cp3);
                
                model.setValueAt(sss, selectedRow, 4);
                
                // Collect updated rows
                ArrayList<String> updatedLines = new ArrayList<>();
                for (int i = 0; i < model.getRowCount(); i++) {
                    StringBuilder row = new StringBuilder();
                    for (int j = 0; j < model.getColumnCount(); j++) {
                        row.append(model.getValueAt(i, j)).append("\n");
                    }
                    updatedLines.add(row.toString().trim());
                }
                
                // Write updated lines to file
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("Medicines.txt"))) {
                    for (String line : updatedLines) {
                        writer.write(line);
                        writer.newLine();
                    }
                } catch (IOException ex) {
                    ex.printStackTrace(); // Added for better debugging
                }
            }
            
            // Update Customer Information
            ArrayList<String> userInfo = new ArrayList<>();
            //userInfo.add(fullname);
            //userInfo.add(pn);
            userInfo.add(mName);
            userInfo.add(strips);
            userInfo.add(pps);
            userInfo.add(Double.toString(tp));
            userInfo.add(datef);
            
            // Read existing content of the file into a list
            ArrayList<String> lines = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader("Customers.txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    lines.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            int startLineIndex = -1;
            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).contains(txtFname.getText())) {
                    startLineIndex = i + 2; // Start rewriting from two lines after the found line
                    break;
                }
            }
            
            // If the search text was found
            if (startLineIndex != -1 && startLineIndex < lines.size()) {
                // Replace the lines starting from startLineIndex with new content
                for (int i = 0; i < userInfo.size(); i++) {
                    if (startLineIndex + i < lines.size()) {
                        lines.set(startLineIndex + i, userInfo.get(i));
                    } else {
                        // If the new content exceeds the number of lines in the file, add new lines
                        lines.add(userInfo.get(i));
                    }
                }
                
                // Write the updated lines back to the file
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("Customers.txt"))) {
                    for (String updatedLine : lines) {
                        writer.write(updatedLine);
                        writer.newLine();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                
                System.out.println("File updated successfully.");
            } else {
                System.out.println("Search text not found in the file.");
            }
        }else
    {
        JOptionPane.showMessageDialog(null,"Canceled!");
    }
        } else {
            JOptionPane.showMessageDialog(null, "Enter all information");
        }
        try {
                    FileWriter ff = new FileWriter("ReceiptRecord.txt",true);
                    ff.write(area.getText()+"\n");
                    ff.close();
                } catch (IOException ex) {
                    Logger.getLogger(CmainPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        // Clear text fields
        txtMname.setText("");
        txtCode.setText("");
        txtStrips.setText("");
        txtPps.setText("");
        txtFname.setText("");
        txtPn.setText("");
    


    }//GEN-LAST:event_BuyActionPerformed

    private void cleaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleaActionPerformed

    txtMname.setText("");
    txtCode.setText("");
    txtStrips.setText("");
    txtPps.setText("");
    txtFname.setText("");
    txtPn.setText("");



// TODO add your handling code here:
    }//GEN-LAST:event_cleaActionPerformed

    private void receiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiptActionPerformed
        if (area.getText().isBlank()|| area.getText().isEmpty()|| area.getText() == null)
        {
            JOptionPane.showMessageDialog(null, "Please, Buy a medicine first.");
        } 
        else {
            int aaa = JOptionPane.showConfirmDialog(this, new JScrollPane(area), "Receipt", JOptionPane.YES_NO_OPTION);// TODO add your handling code here:
        if(aaa == YES_OPTION)
        {
            try {
                area.print();
                
            } catch (PrinterException e) {
                JOptionPane.showMessageDialog(this, "Failed to print receipt: " + e.getMessage(), "Print Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        }
        
        
    }//GEN-LAST:event_receiptActionPerformed

    private void txtCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodeKeyReleased
     DefaultTableModel ob=(DefaultTableModel) jTable1.getModel();
            TableRowSorter<DefaultTableModel> obj=new TableRowSorter<>(ob);
            jTable1.setRowSorter(obj);
            obj.setRowFilter(RowFilter.regexFilter(txtCode.getText()));


// TODO add your handling code here:
    }//GEN-LAST:event_txtCodeKeyReleased

    private void txtMnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMnameKeyReleased
    DefaultTableModel ob=(DefaultTableModel) jTable1.getModel();
            TableRowSorter<DefaultTableModel> obj=new TableRowSorter<>(ob);
            jTable1.setRowSorter(obj);
            obj.setRowFilter(RowFilter.regexFilter(txtMname.getText()));        // TODO add your handling code here:
    }//GEN-LAST:event_txtMnameKeyReleased

    private void txtStripsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStripsKeyReleased
     /*DefaultTableModel ob=(DefaultTableModel) jTable1.getModel();
            TableRowSorter<DefaultTableModel> obj=new TableRowSorter<>(ob);
            jTable1.setRowSorter(obj);
            obj.setRowFilter(RowFilter.regexFilter(txtStrips.getText()));*/

// TODO add your handling code here:
    }//GEN-LAST:event_txtStripsKeyReleased

    private void txtPpsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPpsKeyReleased
    DefaultTableModel ob=(DefaultTableModel) jTable1.getModel();
            TableRowSorter<DefaultTableModel> obj=new TableRowSorter<>(ob);
            jTable1.setRowSorter(obj);
            obj.setRowFilter(RowFilter.regexFilter(txtPps.getText()));        // TODO add your handling code here:
    }//GEN-LAST:event_txtPpsKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        txtMname.setText(model.getValueAt(selectedRow, 0).toString());
        txtCode.setText(model.getValueAt(selectedRow, 1).toString());
        //txtStrips.setText(model.getValueAt(selectedRow, 4).toString());
        txtPps.setText(model.getValueAt(selectedRow, 2).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void reloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloadActionPerformed
CmainPanel CmainPanelFrame = new CmainPanel();
            CmainPanelFrame.setVisible(true);
            CmainPanelFrame.pack();
            CmainPanelFrame.setLocationRelativeTo(null);
            //MedicineManagementFrame.setResizable(false);
            this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_reloadActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
            Choice ChoiceFrame = new Choice();
            ChoiceFrame.setVisible(true);
            ChoiceFrame.pack();
            ChoiceFrame.setLocationRelativeTo(null);
            //MedicineManagementFrame.setResizable(false);
            this.dispose();        



// TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void txtPnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPnKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPnKeyReleased

    private void txtFnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFnameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFnameKeyReleased

    private void txtFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFnameActionPerformed

    private void clea1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clea1ActionPerformed
        // TODO add your handling code here:
        area.setText("");
    }//GEN-LAST:event_clea1ActionPerformed

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
            java.util.logging.Logger.getLogger(CmainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CmainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CmainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CmainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CmainPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buy;
    private javax.swing.JTextArea area;
    private javax.swing.JButton clea;
    private javax.swing.JButton clea1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logout;
    private javax.swing.JButton receipt;
    private javax.swing.JButton reload;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtMname;
    private javax.swing.JTextField txtPn;
    private javax.swing.JTextField txtPps;
    private javax.swing.JTextField txtStrips;
    // End of variables declaration//GEN-END:variables
}
