/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package group.assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Expenses extends javax.swing.JFrame {

    /**
     * Creates new form Expenses
     */
    public Expenses() {
        initComponents();
        setLocationRelativeTo(null);
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
        catogoryLabel = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        notesLabel = new javax.swing.JLabel();
        catogoriesComboBox = new javax.swing.JComboBox<>();
        amountTextField = new javax.swing.JTextField();
        yearTextField = new javax.swing.JTextField();
        monthComboBox = new javax.swing.JComboBox<>();
        dateComboBox = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        notesTextArea = new javax.swing.JTextArea();
        newCatogoryLabel = new javax.swing.JLabel();
        newCatogoryTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        doneButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        newButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Expenses");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Expense Management");

        catogoryLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        catogoryLabel.setText("Category :");

        amountLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        amountLabel.setText("Amount :");

        dateLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        dateLabel.setText("Date :");

        notesLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        notesLabel.setText("Notes :");

        catogoriesComboBox.setToolTipText("");
        catogoriesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catogoriesComboBoxActionPerformed(evt);
            }
        });

        yearTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearTextFieldActionPerformed(evt);
            }
        });

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

        notesTextArea.setColumns(20);
        notesTextArea.setRows(5);
        jScrollPane2.setViewportView(notesTextArea);

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

        doneButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        doneButton.setText("SUBMIT");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Expense_id", "Amount", "Category ", "Date", "Notes"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        newButton.setText("New");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(amountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(catogoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(notesLabel)
                                    .addComponent(newCatogoryLabel))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(newCatogoryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(9, 9, 9)
                                            .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(dateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(catogoriesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(newButton))
                                        .addComponent(amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(catogoriesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(catogoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(yearTextField)
                    .addComponent(monthComboBox)
                    .addComponent(dateComboBox))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newCatogoryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newCatogoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doneButton)
                    .addComponent(deleteButton))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        newCatogoryLabel.setVisible(false);
        newCatogoryTextField.setVisible(false);
        newCatogoryLabel.setVisible(false);
        newCatogoryTextField.setVisible(false);
        addButton.setVisible(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void catogoriesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catogoriesComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catogoriesComboBoxActionPerformed

    private void yearTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearTextFieldActionPerformed

    private void monthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthComboBoxActionPerformed

    private void dateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateComboBoxActionPerformed

    private void newCatogoryTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCatogoryTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newCatogoryTextFieldActionPerformed

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

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doneButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        // TODO add your handling code here:
        // Toggle visibility of new category fields
        boolean isVisible = !newCatogoryLabel.isVisible();
        newCatogoryLabel.setVisible(isVisible);
        newCatogoryTextField.setVisible(isVisible);
        addButton.setVisible(isVisible);
    }//GEN-LAST:event_newButtonActionPerformed

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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> monthComboBox;
    private javax.swing.JButton newButton;
    private javax.swing.JLabel newCatogoryLabel;
    private javax.swing.JTextField newCatogoryTextField;
    private javax.swing.JLabel notesLabel;
    private javax.swing.JTextArea notesTextArea;
    private javax.swing.JTextField yearTextField;
    // End of variables declaration//GEN-END:variables
}
