package group.assignment;

import java.io.File;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.ByteArrayOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import javax.swing.*;
import java.io.FileOutputStream;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author LENOVO
 */
public class Reports extends javax.swing.JFrame {

    /**
     * Creates new form Reports
     */
    private tracker trackerRef;
    private String username;

    public Reports() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public Reports(tracker trackerRef, String username) {
        initComponents();
        setLocationRelativeTo(null);
        this.trackerRef = trackerRef;
        this.username = username; // Assign username passed from tracker class
        try {
            // Load the icon from the resources
            ImageIcon icon = new ImageIcon("./src/pics/pic17.png");
            setIconImage(icon.getImage());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Icon image not found.");
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        dateLabel = new javax.swing.JLabel();
        fromDateChooser = new com.toedter.calendar.JDateChooser();
        jPanel6 = new javax.swing.JPanel();
        dateLabel1 = new javax.swing.JLabel();
        toDateChooser = new com.toedter.calendar.JDateChooser();
        jPanel7 = new javax.swing.JPanel();
        typeLabel = new javax.swing.JLabel();
        reportTypeComboBox = new javax.swing.JComboBox<>();
        panel1 = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        textField1 = new java.awt.TextField();
        input = new java.awt.TextField();
        jPanel8 = new javax.swing.JPanel();
        typeLabel1 = new javax.swing.JLabel();
        fileTypeComboBox = new javax.swing.JComboBox<>();
        generateButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reports");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(165, 208, 255));

        jPanel1.setBackground(new java.awt.Color(225, 241, 253));

        jPanel5.setBackground(new java.awt.Color(225, 241, 253));

        dateLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(0, 0, 0));
        dateLabel.setText("Date From :");

        fromDateChooser.setDateFormatString("yyyy-MM-dd");
        fromDateChooser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fromDateChooser.setMaximumSize(new java.awt.Dimension(214748364, 214748364));
        fromDateChooser.setPreferredSize(new java.awt.Dimension(87, 20));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(dateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(fromDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fromDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(1, 1, 1))
        );

        jPanel6.setBackground(new java.awt.Color(225, 241, 253));

        dateLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dateLabel1.setForeground(new java.awt.Color(0, 0, 0));
        dateLabel1.setText("Date To :");

        toDateChooser.setDateFormatString("yyyy-MM-dd");
        toDateChooser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        toDateChooser.setMaximumSize(new java.awt.Dimension(214748364, 214748364));
        toDateChooser.setPreferredSize(new java.awt.Dimension(87, 20));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(dateLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(toDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(dateLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        jPanel7.setBackground(new java.awt.Color(225, 241, 253));

        typeLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        typeLabel.setForeground(new java.awt.Color(0, 0, 0));
        typeLabel.setText("Incomes / Expenses :");

        reportTypeComboBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        reportTypeComboBox.setMaximumRowCount(12);
        reportTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Incomes & Expenses", "Incomes", "Expenses" }));
        reportTypeComboBox.setToolTipText("");
        reportTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportTypeComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reportTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(reportTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        panel1.setBackground(new java.awt.Color(225, 241, 253));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Name for Report :");

        textField1.setText("textField1");

        input.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(input, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(225, 241, 253));

        typeLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        typeLabel1.setForeground(new java.awt.Color(0, 0, 0));
        typeLabel1.setText("File Type : ");

        fileTypeComboBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fileTypeComboBox.setMaximumRowCount(12);
        fileTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Excel", "PDF" }));
        fileTypeComboBox.setToolTipText("");
        fileTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileTypeComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(typeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fileTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        generateButton.setBackground(new java.awt.Color(40, 40, 255));
        generateButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        generateButton.setForeground(new java.awt.Color(255, 255, 255));
        generateButton.setText("Generate");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(generateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(299, 299, 299))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(generateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/report.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel1.setBackground(new java.awt.Color(40, 40, 230));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(40, 40, 230));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reports Generate");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(440, 440, 440)
                        .addComponent(jLabel1)))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reportTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportTypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reportTypeComboBoxActionPerformed

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed

    }//GEN-LAST:event_inputActionPerformed

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        // Validate inputs
        if (fromDateChooser.getDate() == null || toDateChooser.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Please select both From and To dates.");
            return;
        }

        // Validate report type
        if (reportTypeComboBox.getSelectedItem() == null || reportTypeComboBox.getSelectedItem().toString().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select a report type.");
            return;
        }

        // Validate report name
        if (input.getText().trim().isEmpty()) {
            String reportName = JOptionPane.showInputDialog(this, "Enter report name:");
            if (reportName == null || reportName.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a report name.");
                return;
            }
            input.setText(reportName);
        }

        // Validate file type
        if (fileTypeComboBox.getSelectedItem() == null || fileTypeComboBox.getSelectedItem().toString().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select a file type.");
            return;
        }

        try {
            // Get selected dates
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String fromDateStr = dateFormat.format(fromDateChooser.getDate());
            String toDateStr = dateFormat.format(toDateChooser.getDate());

            Date fromDate = Date.valueOf(fromDateStr);
            Date toDate = Date.valueOf(toDateStr);

            // Get selected report type
            String reportType = (String) reportTypeComboBox.getSelectedItem();

            // Get selected file type
            String fileType = (String) fileTypeComboBox.getSelectedItem();

            ResultSet incomes = null;
            ResultSet expenses = null;

            if (reportType.equalsIgnoreCase("Incomes") || reportType.equalsIgnoreCase("Incomes & Expenses")) {
                incomes = getIncomes(username, fromDate, toDate);
            }

            if (reportType.equalsIgnoreCase("Expenses") || reportType.equalsIgnoreCase("Incomes & Expenses")) {
                expenses = getExpenses(username, fromDate, toDate);
            }

            String reportName = input.getText().trim();

            // Generate report based on selected report type and file type
            if (fileType.equalsIgnoreCase("Excel")) {
                if (reportType.equalsIgnoreCase("Incomes")) {
                    createExcelIncomes(reportName + ".xlsx", incomes);
                } else if (reportType.equalsIgnoreCase("Expenses")) {
                    createExcelExpenses(reportName + ".xlsx", expenses);
                } else if (reportType.equalsIgnoreCase("Incomes & Expenses")) {
                    createExcelBoth(reportName + ".xlsx", incomes, expenses);
                }
            } else if (fileType.equalsIgnoreCase("PDF")) {
                if (reportType.equalsIgnoreCase("Incomes")) {
                    createPdfIncomes(reportName + ".pdf", incomes);
                } else if (reportType.equalsIgnoreCase("Expenses")) {
                    createPdfExpenses(reportName + ".pdf", expenses);
                } else if (reportType.equalsIgnoreCase("Incomes & Expenses")) {
                    createPdfBoth(reportName + ".pdf", incomes, expenses);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error generating report: " + e.getMessage());
        }
    }//GEN-LAST:event_generateButtonActionPerformed

    private void fileTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileTypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileTypeComboBoxActionPerformed

    // Method for creating Excel file with both incomes and expenses
    private void createExcelBoth(String fileName, ResultSet incomes, ResultSet expenses) throws Exception {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Finance Tracker Report");

        int rowNum = 0;

        // Add incomes table
        Row headerRow = sheet.createRow(rowNum++);
        headerRow.createCell(0).setCellValue("Incomes:");

        headerRow = sheet.createRow(rowNum++);
        headerRow.createCell(0).setCellValue("ID");
        headerRow.createCell(1).setCellValue("Category");
        headerRow.createCell(2).setCellValue("Amount");
        headerRow.createCell(3).setCellValue("Date");
        headerRow.createCell(4).setCellValue("Notes");

        while (incomes.next()) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(incomes.getInt("income_id"));
            row.createCell(1).setCellValue(incomes.getString("category"));
            row.createCell(2).setCellValue(incomes.getFloat("amount"));
            row.createCell(3).setCellValue(incomes.getDate("date").toString());
            row.createCell(4).setCellValue(incomes.getString("notes"));
        }

        rowNum += 2;

        // Add expenses table
        headerRow = sheet.createRow(rowNum++);
        headerRow.createCell(0).setCellValue("Expenses:");

        headerRow = sheet.createRow(rowNum++);
        headerRow.createCell(0).setCellValue("ID");
        headerRow.createCell(1).setCellValue("Category");
        headerRow.createCell(2).setCellValue("Amount");
        headerRow.createCell(3).setCellValue("Date");
        headerRow.createCell(4).setCellValue("Notes");

        while (expenses.next()) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(expenses.getInt("expense_id"));
            row.createCell(1).setCellValue(expenses.getString("category"));
            row.createCell(2).setCellValue(expenses.getFloat("amount"));
            row.createCell(3).setCellValue(expenses.getDate("date").toString());
            row.createCell(4).setCellValue(expenses.getString("notes"));
        }
        // Saving created excel file in PC
        saveExcelFile(fileName, workbook);
    }

    // Method for creating Excel file with only incomes
    private void createExcelIncomes(String fileName, ResultSet incomes) throws Exception {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Finance Tracker Report");

        int rowNum = 0;

        // Add incomes table
        Row headerRow = sheet.createRow(rowNum++);
        headerRow.createCell(0).setCellValue("Incomes:");

        headerRow = sheet.createRow(rowNum++);
        headerRow.createCell(0).setCellValue("ID");
        headerRow.createCell(1).setCellValue("Category");
        headerRow.createCell(2).setCellValue("Amount");
        headerRow.createCell(3).setCellValue("Date");
        headerRow.createCell(4).setCellValue("Notes");

        while (incomes.next()) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(incomes.getInt("income_id"));
            row.createCell(1).setCellValue(incomes.getString("category"));
            row.createCell(2).setCellValue(incomes.getFloat("amount"));
            row.createCell(3).setCellValue(incomes.getDate("date").toString());
            row.createCell(4).setCellValue(incomes.getString("notes"));
        }

        // Saving created excel file in PC
        saveExcelFile(fileName, workbook);
    }

    // Method for creating Excel file with only expenses
    private void createExcelExpenses(String fileName, ResultSet expenses) throws Exception {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Finance Tracker Report");

        int rowNum = 0;

        // Add expenses table
        Row headerRow = sheet.createRow(rowNum++);
        headerRow.createCell(0).setCellValue("Expenses:");

        headerRow = sheet.createRow(rowNum++);
        headerRow.createCell(0).setCellValue("ID");
        headerRow.createCell(1).setCellValue("Category");
        headerRow.createCell(2).setCellValue("Amount");
        headerRow.createCell(3).setCellValue("Date");
        headerRow.createCell(4).setCellValue("Notes");

        while (expenses.next()) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(expenses.getInt("expense_id"));
            row.createCell(1).setCellValue(expenses.getString("category"));
            row.createCell(2).setCellValue(expenses.getFloat("amount"));
            row.createCell(3).setCellValue(expenses.getDate("date").toString());
            row.createCell(4).setCellValue(expenses.getString("notes"));
        }

        // Saving created excel file in PC
        saveExcelFile(fileName, workbook);
    }

    // Method for saving Ecxel file
    private void saveExcelFile(String fileName, Workbook workbook) throws Exception {
        // Create a file chooser to select the save location
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select Save Location");
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Files", "xlsx");
        fileChooser.setFileFilter(filter);

        int returnValue = fileChooser.showSaveDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath() + "/" + fileName;
            FileOutputStream fileOut = new FileOutputStream(filePath);
            workbook.write(fileOut);
            fileOut.close();
            workbook.close();
            JOptionPane.showMessageDialog(this, "Report saved successfully at: " + filePath);
        } else {
            // User cancelled, do nothing
        }
    }

    // Method for creating PDF file with incomes
    private void createPdfIncomes(String fileName, ResultSet incomes) throws Exception {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(fileName));
        document.open();

        document.add(new Paragraph("Incomes Report"));
        document.add(new Paragraph(" "));

        PdfPTable table = new PdfPTable(5);
        table.addCell("ID");
        table.addCell("Category");
        table.addCell("Amount");
        table.addCell("Date");
        table.addCell("Notes");

        while (incomes.next()) {
            table.addCell(String.valueOf(incomes.getInt("income_id")));
            table.addCell(incomes.getString("category"));
            table.addCell(String.valueOf(incomes.getFloat("amount")));
            table.addCell(incomes.getDate("date").toString());
            table.addCell(incomes.getString("notes"));
        }

        document.add(table);
        document.close();
        savePdfFile(fileName, document);  // Save the PDF file
    }

    // Method for creating PDF file with expenses
    private void createPdfExpenses(String fileName, ResultSet expenses) throws Exception {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(fileName));
        document.open();

        document.add(new Paragraph("Expenses Report"));
        document.add(new Paragraph(" "));

        PdfPTable table = new PdfPTable(5);
        table.addCell("ID");
        table.addCell("Category");
        table.addCell("Amount");
        table.addCell("Date");
        table.addCell("Notes");

        while (expenses.next()) {
            table.addCell(String.valueOf(expenses.getInt("expense_id")));
            table.addCell(expenses.getString("category"));
            table.addCell(String.valueOf(expenses.getFloat("amount")));
            table.addCell(expenses.getDate("date").toString());
            table.addCell(expenses.getString("notes"));
        }

        document.add(table);
        document.close();
        savePdfFile(fileName, document);  // Save the PDF file
    }

// Method for creating PDF file with both incomes and expenses
    private void createPdfBoth(String fileName, ResultSet incomes, ResultSet expenses) throws Exception {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(fileName));
        document.open();

        document.add(new Paragraph("Incomes and Expenses Report"));
        document.add(new Paragraph(" "));

        document.add(new Paragraph("Incomes:"));
        PdfPTable table = new PdfPTable(5);
        table.addCell("ID");
        table.addCell("Category");
        table.addCell("Amount");
        table.addCell("Date");
        table.addCell("Notes");

        while (incomes.next()) {
            table.addCell(String.valueOf(incomes.getInt("income_id")));
            table.addCell(incomes.getString("category"));
            table.addCell(String.valueOf(incomes.getFloat("amount")));
            table.addCell(incomes.getDate("date").toString());
            table.addCell(incomes.getString("notes"));
        }

        document.add(table);
        document.add(new Paragraph(" "));

        document.add(new Paragraph("Expenses:"));
        table = new PdfPTable(5);
        table.addCell("ID");
        table.addCell("Category");
        table.addCell("Amount");
        table.addCell("Date");
        table.addCell("Notes");

        while (expenses.next()) {
            table.addCell(String.valueOf(expenses.getInt("expense_id")));
            table.addCell(expenses.getString("category"));
            table.addCell(String.valueOf(expenses.getFloat("amount")));
            table.addCell(expenses.getDate("date").toString());
            table.addCell(expenses.getString("notes"));
        }

        document.add(table);
        document.close();
        savePdfFile(fileName, document);  // Save the PDF file
    }

    private void savePdfFile(String fileName, Document document) throws Exception {
        // Create a file chooser to select the save location
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select Save Location");
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int returnValue = fileChooser.showSaveDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedDir = fileChooser.getSelectedFile();
            String filePath = selectedDir.getAbsolutePath() + File.separator + fileName;

            // Create PdfWriter instance before closing the document
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            // Document should be opened before closing it

            JOptionPane.showMessageDialog(this, "PDF Report saved successfully at: " + filePath);
        } else {
            // User cancelled, do nothing
        }
    }

    private ResultSet getIncomes(String userName, Date startDate, Date endDate) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/finance_tracker?zeroDateTimeBehavior=convertToNull", "root", "");
        String query = "SELECT * FROM incomes WHERE user_name = ? AND date BETWEEN ? AND ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, userName);
        stmt.setDate(2, startDate);
        stmt.setDate(3, endDate);
        return stmt.executeQuery();
    }

    private ResultSet getExpenses(String userName, Date startDate, Date endDate) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/finance_tracker?zeroDateTimeBehavior=convertToNull", "root", "");
        String query = "SELECT * FROM expenses WHERE user_name = ? AND date BETWEEN ? AND ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, userName);
        stmt.setDate(2, startDate);
        stmt.setDate(3, endDate);
        return stmt.executeQuery();
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel dateLabel1;
    private javax.swing.JComboBox<String> fileTypeComboBox;
    private com.toedter.calendar.JDateChooser fromDateChooser;
    private javax.swing.JButton generateButton;
    private java.awt.TextField input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private java.awt.Panel panel1;
    private javax.swing.JComboBox<String> reportTypeComboBox;
    private java.awt.TextField textField1;
    private com.toedter.calendar.JDateChooser toDateChooser;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JLabel typeLabel1;
    // End of variables declaration//GEN-END:variables
}
