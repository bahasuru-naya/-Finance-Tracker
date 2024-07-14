package group.assignment;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.sql.ResultSet;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.JOptionPane;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;

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
        jPanel5 = new javax.swing.JPanel();
        dateLabel = new javax.swing.JLabel();
        fromMonthComboBox = new javax.swing.JComboBox<>();
        fromDateComboBox = new javax.swing.JComboBox<>();
        fromYearComboBox = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        dateLabel1 = new javax.swing.JLabel();
        toMonthComboBox = new javax.swing.JComboBox<>();
        toDateComboBox = new javax.swing.JComboBox<>();
        toYearComboBox = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        typeLabel = new javax.swing.JLabel();
        reportTypeComboBox = new javax.swing.JComboBox<>();
        downloadExcelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reports");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reports");

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));

        dateLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        dateLabel.setText("From :");

        fromMonthComboBox.setMaximumRowCount(12);
        fromMonthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        fromMonthComboBox.setToolTipText("");
        fromMonthComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromMonthComboBoxActionPerformed(evt);
            }
        });

        fromDateComboBox.setMaximumRowCount(12);
        fromDateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        fromDateComboBox.setToolTipText("");
        fromDateComboBox.setName(""); // NOI18N
        fromDateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromDateComboBoxActionPerformed(evt);
            }
        });

        fromYearComboBox.setMaximumRowCount(12);
        fromYearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081", "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089", "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097", "2098", "2099", "2100" }));
        fromYearComboBox.setToolTipText("");
        fromYearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromYearComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(fromYearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(fromMonthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(fromDateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fromMonthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fromDateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fromYearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1))
        );

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));

        dateLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        dateLabel1.setText("To");

        toMonthComboBox.setMaximumRowCount(12);
        toMonthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        toMonthComboBox.setToolTipText("");
        toMonthComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toMonthComboBoxActionPerformed(evt);
            }
        });

        toDateComboBox.setMaximumRowCount(12);
        toDateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        toDateComboBox.setToolTipText("");
        toDateComboBox.setName(""); // NOI18N
        toDateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toDateComboBoxActionPerformed(evt);
            }
        });

        toYearComboBox.setMaximumRowCount(12);
        toYearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081", "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089", "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097", "2098", "2099", "2100" }));
        toYearComboBox.setToolTipText("");
        toYearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toYearComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(dateLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(toYearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(toMonthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(toDateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(toMonthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(toDateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(toYearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1))
        );

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));

        typeLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        typeLabel.setText("Incomes / Expenses :");

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
                .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(reportTypeComboBox, 0, 174, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reportTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        downloadExcelButton.setText("Excel Download");
        downloadExcelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadExcelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(485, 485, 485)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(downloadExcelButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(485, 485, 485))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 377, Short.MAX_VALUE)
                .addComponent(downloadExcelButton)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fromMonthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromMonthComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromMonthComboBoxActionPerformed

    private void fromDateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromDateComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromDateComboBoxActionPerformed

    private void fromYearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromYearComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromYearComboBoxActionPerformed

    private void toMonthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toMonthComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toMonthComboBoxActionPerformed

    private void toDateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toDateComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toDateComboBoxActionPerformed

    private void toYearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toYearComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toYearComboBoxActionPerformed

    private void reportTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportTypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reportTypeComboBoxActionPerformed

    private void downloadExcelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadExcelButtonActionPerformed
        // TODO add your handling code here:
        // Retrieve date range (example: from date pickers)
        String startDateBox = fromYearComboBox.getSelectedItem().toString() + "-"
                + fromMonthComboBox.getSelectedItem().toString() + "-"
                + fromDateComboBox.getSelectedItem().toString();

        String endDateBox = toYearComboBox.getSelectedItem().toString() + "-"
                + toMonthComboBox.getSelectedItem().toString() + "-"
                + toDateComboBox.getSelectedItem().toString();

        String reportType = reportTypeComboBox.getSelectedItem().toString();

        // Validate input
        if (startDateBox.equals("2024-Month-Date") || endDateBox.equals("2024-Month-Date")) {
            JOptionPane.showMessageDialog(this, "Please select start and end date.");
            return;
        }

        Date startDate = Date.valueOf(startDateBox);
        Date endDate = Date.valueOf(endDateBox);

        try {
            ResultSet incomes = null;
            ResultSet expenses = null;

            // Retrieve data from the database based on the report type
            if (reportType.equals("Incomes & Expenses")) {
                incomes = getIncomes(username, startDate, endDate);
                expenses = getExpenses(username, startDate, endDate);
                createExcelBoth("Report_" + startDateBox + "_" + endDateBox + ".xlsx", incomes, expenses); // Create the Excel file
            }
            else if (reportType.equals("Expenses")) {
                expenses = getExpenses(username, startDate, endDate);
                createExcelExpenses("Report_" + startDateBox + "_" + endDateBox + ".xlsx",expenses); // Create the Excel file
            }
            else if (reportType.equals("Incomes")) {
                incomes = getIncomes(username, startDate, endDate);
                createExcelIncomes("Report_" + startDateBox + "_" + endDateBox + ".xlsx", incomes); // Create the Excel file
            }

            // Show success or failed state
            JOptionPane.showMessageDialog(null, "Excel Report Generated Successfully");
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error Generating Excel Report");
        }
    }//GEN-LAST:event_downloadExcelButtonActionPerformed

    //method for create Excel file
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

        rowNum = rowNum + 2;

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
            row.createCell(0).setCellValue(expenses.getInt("expenses_id"));
            row.createCell(1).setCellValue(expenses.getString("category"));
            row.createCell(2).setCellValue(expenses.getFloat("amount"));
            row.createCell(3).setCellValue(expenses.getDate("date").toString());
            row.createCell(4).setCellValue(expenses.getString("notes"));
        }

        //Saving created excel file in PC
        String filePath = "C:/Users/Janith/Downloads/" + fileName; // Excel file saving path
        FileOutputStream fileOut = new FileOutputStream(filePath);
        workbook.write(fileOut);
        fileOut.close();
        workbook.close();
    }
    
    //method for create Excel file only incomes
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

        //Saving created excel file in PC
        String filePath = "C:/Users/Janith/Downloads/" + fileName; // Excel file saving path
        FileOutputStream fileOut = new FileOutputStream(filePath);
        workbook.write(fileOut);
        fileOut.close();
        workbook.close();
    }
    
    //method for create Excel file only expenses
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
            row.createCell(0).setCellValue(expenses.getInt("expenses_id"));
            row.createCell(1).setCellValue(expenses.getString("category"));
            row.createCell(2).setCellValue(expenses.getFloat("amount"));
            row.createCell(3).setCellValue(expenses.getDate("date").toString());
            row.createCell(4).setCellValue(expenses.getString("notes"));
        }

        //Saving created excel file in PC
        String filePath = "C:/Users/Janith/Downloads/" + fileName; // Excel file saving path
        FileOutputStream fileOut = new FileOutputStream(filePath);
        workbook.write(fileOut);
        fileOut.close();
        workbook.close();
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
    private javax.swing.JButton downloadExcelButton;
    private javax.swing.JComboBox<String> fromDateComboBox;
    private javax.swing.JComboBox<String> fromMonthComboBox;
    private javax.swing.JComboBox<String> fromYearComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JComboBox<String> reportTypeComboBox;
    private javax.swing.JComboBox<String> toDateComboBox;
    private javax.swing.JComboBox<String> toMonthComboBox;
    private javax.swing.JComboBox<String> toYearComboBox;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables
}
