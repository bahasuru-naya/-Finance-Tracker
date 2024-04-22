/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package group.assignment;

import static group.assignment.DBconnection.getCon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class Income extends javax.swing.JFrame {

    /**
     * Creates new form Income
     */
    public Income() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private tracker trackerRef;
    private String username; // Add username variable

    public Income(tracker trackerRef, String username) {
        initComponents();
        setLocationRelativeTo(null);
        loadDataFromDatabase();
        this.trackerRef = trackerRef;
        this.username = username; // Assign username passed from tracker class
    }

    public void loadDataFromDatabase() {
        try {
              
            Connection con = DBconnection.getCon();
            System.out.println("sucessful");
            
             Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT income_id,amount,category,date FROM incomes");

            // Get metadata for column names
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            String[] columnNames = new String[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                columnNames[i - 1] = metaData.getColumnName(i);
            }

            // Load data into JTable
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(columnNames);
            while (resultSet.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    rowData[i] = resultSet.getObject(i + 1);
                }
                model.addRow(rowData);
            }
            jTable1.setModel(model);

            resultSet.close();
            statement.close();
            con.close();
            
        } catch (SQLException ex) {
            System.out.println(ex);
            
        } 
    }
    
     public static void insertIncome(String userName, double amount, String category, java.util.Date date) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = getCon();
            String query = "INSERT INTO incomes (user_name, amount, category, date) VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, userName);
            pstmt.setDouble(2, amount);
            pstmt.setString(3, category);
            pstmt.setDate(4, new java.sql.Date(date.getTime()));
            pstmt.executeUpdate();
            System.out.println("Income added successfully");
        } catch (SQLException ex) {
            System.out.println("Error adding income: " + ex.getMessage());
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error closing resources: " + ex.getMessage());
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        catogoriesComboBox = new javax.swing.JComboBox<>();
        catogoryLabel = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        amountTextField = new javax.swing.JTextField();
        doneButton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        newCatogoryLabel = new javax.swing.JLabel();
        newCatogoryTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Income");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Income Management");

        catogoriesComboBox.setToolTipText("");
        catogoriesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catogoriesComboBoxActionPerformed(evt);
            }
        });

        catogoryLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        catogoryLabel.setText("Catogory :");

        amountLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        amountLabel.setText("Amount :");

        doneButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        doneButton.setText("Done");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        newButton.setText("New");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        newCatogoryLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        newCatogoryLabel.setText("New Catogory :");

        newCatogoryTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCatogoryTextFieldActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "income_id", "amount", "category ", "date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(newCatogoryLabel)
                                .addGap(27, 27, 27)
                                .addComponent(newCatogoryTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(catogoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(catogoriesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(amountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(amountTextField)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newButton)
                            .addComponent(addButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(catogoriesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(catogoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newCatogoryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newCatogoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addComponent(doneButton)
                        .addGap(33, 33, 33))))
        );

        newCatogoryLabel.setVisible(false);
        newCatogoryTextField.setVisible(false);
        addButton.setVisible(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void catogoriesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catogoriesComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catogoriesComboBoxActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        // TODO add your handling code here:
        // Toggle visibility of new category fields
        boolean isVisible = !newCatogoryLabel.isVisible();
        newCatogoryLabel.setVisible(isVisible);
        newCatogoryTextField.setVisible(isVisible);
        addButton.setVisible(isVisible);
    }//GEN-LAST:event_newButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        // Get the text from new category text field
        String newCategory = newCatogoryTextField.getText().trim();

        // Check if the new category is not empty
        if (!newCategory.isEmpty()) {

            catogoriesComboBox.addItem(newCategory); // Add the new category

            catogoriesComboBox.setSelectedItem(newCategory); // select the newly added category

            newCatogoryTextField.setText(""); // Clear the text field for next entry
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void newCatogoryTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCatogoryTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newCatogoryTextFieldActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        // TODO add your handling code here:
        // Get the text from amount text field
        String amountText = amountTextField.getText().trim();

        // Check if the amount is a valid number
        try {
            double amount = Double.parseDouble(amountText);
            if (amount <= 0) {
                // Display error message if amount is not positive
                JOptionPane.showMessageDialog(this, "Please enter a valid positive amount.", "Invalid Amount", JOptionPane.ERROR_MESSAGE);
            } else {
                // Get the selected category from the combo box
                String category = (String) catogoriesComboBox.getSelectedItem();

                // Get the current date
                java.util.Date date = new java.util.Date();

                // Insert income into the database
                insertIncome(trackerRef.username, amount, category, date);

                // Update balance in tracker GUI
                trackerRef.updateBalance();

                dispose(); // Close the Income window
            }
        } catch (NumberFormatException e) {
            // Display error message if amount is not a number
            JOptionPane.showMessageDialog(this, "Please enter a valid numeric amount.", "Invalid Amount", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_doneButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JTextField amountTextField;
    private javax.swing.JComboBox<String> catogoriesComboBox;
    private javax.swing.JLabel catogoryLabel;
    private javax.swing.JButton doneButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton newButton;
    private javax.swing.JLabel newCatogoryLabel;
    private javax.swing.JTextField newCatogoryTextField;
    // End of variables declaration//GEN-END:variables
}
