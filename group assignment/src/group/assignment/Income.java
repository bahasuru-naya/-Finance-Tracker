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
        deleteButton = new javax.swing.JButton();
        dateLabel = new javax.swing.JLabel();
        monthComboBox = new javax.swing.JComboBox<>();
        dateComboBox = new javax.swing.JComboBox<>();
        yearTextField = new javax.swing.JTextField();
        newCatogoryLabel1 = new javax.swing.JLabel();
        yearTextField1 = new javax.swing.JTextField();

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
        doneButton.setText("SUBMIT");
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

        deleteButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        dateLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        dateLabel.setText("Date :");

        monthComboBox.setMaximumRowCount(12);
        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        monthComboBox.setSelectedIndex(-1);
        monthComboBox.setToolTipText("");
        monthComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthComboBoxActionPerformed(evt);
            }
        });

        dateComboBox.setMaximumRowCount(12);
        dateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dateComboBox.setSelectedIndex(-1);
        dateComboBox.setToolTipText("");
        dateComboBox.setName(""); // NOI18N
        dateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateComboBoxActionPerformed(evt);
            }
        });

        yearTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearTextFieldActionPerformed(evt);
            }
        });

        newCatogoryLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        newCatogoryLabel1.setText("New Catogory :");

        yearTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(81, 81, 81))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(newCatogoryLabel)
                                .addGap(27, 27, 27)
                                .addComponent(newCatogoryTextField)
                                .addGap(18, 18, 18)
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(yearTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                        .addGap(19, 19, 19)
                        .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(dateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newCatogoryLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yearTextField1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(catogoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(catogoriesComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(newButton))
                            .addComponent(amountTextField))))
                .addGap(482, 482, 482))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
                            .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(monthComboBox)
                            .addComponent(dateComboBox)
                            .addComponent(yearTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(newCatogoryLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(71, 71, 71))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(yearTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newCatogoryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newCatogoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(doneButton)
                            .addComponent(deleteButton))))
                .addContainerGap())
        );

        newCatogoryLabel.setVisible(false);
        newCatogoryTextField.setVisible(false);
        addButton.setVisible(false);
        dateComboBox.getAccessibleContext().setAccessibleName("");
        newCatogoryTextField.setVisible(false);
        newCatogoryLabel.setVisible(false);
        newCatogoryTextField.setVisible(false);

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

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            // If no row is selected, display an alert message
            JOptionPane.showMessageDialog(this, "Please select a record to delete.", "No Record Selected", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Get the value of the first column (income_id) of the selected row
        int incomeId = (int) jTable1.getValueAt(selectedRow, 0);

        // Confirm with the user before deleting
        int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this record?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            // If user confirms deletion, proceed to delete the record from the database
            try {
                Connection con = DBconnection.getCon();
                String query = "DELETE FROM incomes WHERE income_id = ?";
                PreparedStatement pstmt = con.prepareStatement(query);
                pstmt.setInt(1, incomeId);
                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    // If deletion is successful, reload the data in the table
                    loadDataFromDatabase();
                    JOptionPane.showMessageDialog(this, "Record deleted successfully.", "Delete Successful", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to delete record.", "Delete Failed", JOptionPane.ERROR_MESSAGE);
                }
                pstmt.close();
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex);
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Delete Failed", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void monthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthComboBoxActionPerformed

    private void dateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateComboBoxActionPerformed

    private void yearTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearTextFieldActionPerformed

    private void yearTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JTextField amountTextField;
    private javax.swing.JComboBox<String> catogoriesComboBox;
    private javax.swing.JLabel catogoryLabel;
    private javax.swing.JComboBox<String> dateComboBox;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton doneButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> monthComboBox;
    private javax.swing.JButton newButton;
    private javax.swing.JLabel newCatogoryLabel;
    private javax.swing.JLabel newCatogoryLabel1;
    private javax.swing.JTextField newCatogoryTextField;
    private javax.swing.JTextField yearTextField;
    private javax.swing.JTextField yearTextField1;
    // End of variables declaration//GEN-END:variables
}
