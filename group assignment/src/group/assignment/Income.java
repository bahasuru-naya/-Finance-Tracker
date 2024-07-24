package group.assignment;

import static group.assignment.DBconnection.getCon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Income extends javax.swing.JFrame {

    private tracker trackerRef;
    private String username;

    public Income() {
        initComponents();
        setLocationRelativeTo(null);
        loadCategories(); // Load categories from the database
        setNewCategoryVisibility(false); // Initially hide new category adding items
        loadDataFromDatabase(); // Load data into the table from the database
        try {
            // Load the icon from the resources
            ImageIcon icon = new ImageIcon("./src/pics/pic17.png");
            setIconImage(icon.getImage());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Icon image not found.");
        }
    }

    public Income(tracker trackerRef, String username) {
        initComponents();
        setLocationRelativeTo(null);
        this.trackerRef = trackerRef;
        this.username = username; // Assign username passed from tracker class
        loadCategories(); // Load categories from the database
        setNewCategoryVisibility(false); // Initially hide new category adding items
        loadDataFromDatabase(); // Load data into the table from the database
        try {
            // Load the icon from the resources
            ImageIcon icon = new ImageIcon("./src/pics/pic17.png");
            setIconImage(icon.getImage());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Icon image not found.");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        catogoryLabel = new javax.swing.JLabel();
        catogoriesComboBox = new javax.swing.JComboBox<>();
        newButton = new javax.swing.JButton();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        newCatogoryLabel = new javax.swing.JLabel();
        newCategoryTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        notesTextArea = new javax.swing.JTextArea();
        notesLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        dateLabel = new javax.swing.JLabel();
        yearComboBox = new javax.swing.JComboBox<>();
        monthComboBox = new javax.swing.JComboBox<>();
        dateComboBox = new javax.swing.JComboBox<>();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        amountLabel = new javax.swing.JLabel();
        amountTextField = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Income");

        kGradientPanel1.setkEndColor(new java.awt.Color(165, 208, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(165, 208, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(40, 40, 230));
        jLabel1.setText("Income Management");

        kGradientPanel6.setkEndColor(new java.awt.Color(225, 241, 253));
        kGradientPanel6.setkStartColor(new java.awt.Color(225, 241, 253));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Income ID", "Amount", "Category", "Date", "Notes"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        kGradientPanel3.setkEndColor(new java.awt.Color(225, 241, 253));
        kGradientPanel3.setkGradientFocus(600);
        kGradientPanel3.setkStartColor(new java.awt.Color(225, 241, 253));

        catogoryLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        catogoryLabel.setForeground(new java.awt.Color(0, 0, 0));
        catogoryLabel.setText("Catogory :");

        catogoriesComboBox.setToolTipText("");
        catogoriesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catogoriesComboBoxActionPerformed(evt);
            }
        });

        newButton.setBackground(new java.awt.Color(40, 40, 255));
        newButton.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        newButton.setForeground(new java.awt.Color(255, 255, 255));
        newButton.setText("New");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addComponent(catogoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(catogoriesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(catogoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(catogoriesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        kGradientPanel4.setkEndColor(new java.awt.Color(225, 241, 253));
        kGradientPanel4.setkGradientFocus(600);
        kGradientPanel4.setkStartColor(new java.awt.Color(225, 241, 253));

        newCatogoryLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        newCatogoryLabel.setForeground(new java.awt.Color(0, 0, 0));
        newCatogoryLabel.setText("New Catogory :");

        newCategoryTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCategoryTextFieldActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(40, 40, 255));
        addButton.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                .addComponent(newCatogoryLabel)
                .addGap(38, 38, 38)
                .addComponent(newCategoryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newCatogoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newCategoryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        newCatogoryLabel.setVisible(false);
        addButton.setVisible(false);

        notesTextArea.setColumns(20);
        notesTextArea.setRows(5);
        jScrollPane2.setViewportView(notesTextArea);

        notesLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        notesLabel.setForeground(new java.awt.Color(0, 0, 0));
        notesLabel.setText("Notes :");

        submitButton.setBackground(new java.awt.Color(40, 40, 255));
        submitButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(40, 40, 255));
        deleteButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        dateLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(0, 0, 0));
        dateLabel.setText("Date :");

        yearComboBox.setMaximumRowCount(12);
        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081", "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089", "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097", "2098", "2099", "2100" }));
        yearComboBox.setToolTipText("");
        yearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearComboBoxActionPerformed(evt);
            }
        });

        monthComboBox.setMaximumRowCount(12);
        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        monthComboBox.setToolTipText("");
        monthComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthComboBoxActionPerformed(evt);
            }
        });

        dateComboBox.setMaximumRowCount(12);
        dateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dateComboBox.setToolTipText("");
        dateComboBox.setName(""); // NOI18N
        dateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateComboBoxActionPerformed(evt);
            }
        });

        kGradientPanel5.setkEndColor(new java.awt.Color(225, 241, 253));
        kGradientPanel5.setkGradientFocus(600);
        kGradientPanel5.setkStartColor(new java.awt.Color(225, 241, 253));

        amountLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        amountLabel.setForeground(new java.awt.Color(0, 0, 0));
        amountLabel.setText("Amount :");

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addComponent(amountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        editButton.setBackground(new java.awt.Color(40, 40, 255));
        editButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setText("EDIT");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel6Layout = new javax.swing.GroupLayout(kGradientPanel6);
        kGradientPanel6.setLayout(kGradientPanel6Layout);
        kGradientPanel6Layout.setHorizontalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1081, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(kGradientPanel6Layout.createSequentialGroup()
                        .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addComponent(notesLabel))
                            .addComponent(kGradientPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(dateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(24, Short.MAX_VALUE))))
        );
        kGradientPanel6Layout.setVerticalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(kGradientPanel6Layout.createSequentialGroup()
                        .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(submitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel6Layout.createSequentialGroup()
                        .addComponent(notesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(kGradientPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        newCatogoryLabel.setVisible(false);
        dateComboBox.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(kGradientPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(401, 401, 401)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(kGradientPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadDataFromDatabase() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Clear existing rows from the table
        try {
            Connection con = DBconnection.getCon();
            String query = "SELECT * FROM incomes WHERE user_name = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, username); // Assuming you have the username stored in a variable
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("income_id");
                float amount = rs.getFloat("amount");
                String category = rs.getString("category");
                String date = rs.getString("date");
                String notes = rs.getString("notes");
                // Add data to the table
                model.addRow(new Object[]{id, amount, category, date, notes});
            }
            rs.close();
            pst.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error loading data from the database: " + ex.getMessage());
        }
    }

    private void catogoriesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catogoriesComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catogoriesComboBoxActionPerformed

    private void setNewCategoryVisibility(boolean visible) {
        newCatogoryLabel.setVisible(visible);
        newCategoryTextField.setVisible(visible);
        addButton.setVisible(visible);
    }

    private void loadCategories() {
        catogoriesComboBox.removeAllItems(); // Clear existing items
        try {
            Connection con = getCon();
            String query = "SELECT DISTINCT category FROM incomes";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                catogoriesComboBox.addItem(rs.getString("category"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error loading categories: " + ex.getMessage());
        }
    }

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        // Check if the new category adding fields are currently visible
        boolean isVisible = newCatogoryLabel.isVisible();

        // Toggle the visibility of the new category adding fields
        setNewCategoryVisibility(!isVisible);
    }//GEN-LAST:event_newButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // Get user input
        String amount = amountTextField.getText();
        String category = catogoriesComboBox.getSelectedItem().toString();
        String notes = notesTextArea.getText();
        String date = yearComboBox.getSelectedItem().toString() + "-"
                + monthComboBox.getSelectedItem().toString() + "-"
                + dateComboBox.getSelectedItem().toString();

        // Validate input
        if (amount.isEmpty() || category.isEmpty() || date.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.");
            return;
        }

        try {
            Connection con = getCon();
            if (isEditMode) {
                // Update the existing record
                String query = "UPDATE incomes SET amount = ?, category = ?, date = ?, notes = ? WHERE income_id = ?";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, amount);
                pst.setString(2, category);
                pst.setString(3, date);
                pst.setString(4, notes);
                pst.setInt(5, editIncomeID);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Income updated successfully.");
            } else {
                // Insert new record
                String query = "INSERT INTO incomes (user_name, amount, category, date, notes) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, username);
                pst.setString(2, amount);
                pst.setString(3, category);
                pst.setString(4, date);
                pst.setString(5, notes);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Income added successfully.");
            }
            loadDataFromDatabase(); // Refresh the table
            trackerRef.updateBalance();

            // Reset form fields and flags
            amountTextField.setText("");
            catogoriesComboBox.setSelectedIndex(0);
            yearComboBox.setSelectedIndex(0);
            monthComboBox.setSelectedIndex(0);
            dateComboBox.setSelectedIndex(0);
            notesTextArea.setText("");
            isEditMode = false;
            editIncomeID = -1;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error adding/updating income: " + ex.getMessage());
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        int incomeID = (int) jTable1.getValueAt(selectedRow, 0); // Assuming the first column is the ID
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this income entry?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                Connection con = getCon();
                String query = "DELETE FROM incomes WHERE income_id = ?";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setInt(1, incomeID);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Income entry deleted successfully.");
                // Update the table
                loadDataFromDatabase();
                trackerRef.updateBalance();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error deleting income: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void monthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthComboBoxActionPerformed

    private void dateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateComboBoxActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // Get the new category from the text field
        String newCategory = newCategoryTextField.getText().trim();
        if (newCategory.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a new category.");
            return;
        }

        // Add the new category to the dropdown menu
        catogoriesComboBox.addItem(newCategory);

        // Clear the text field after adding the category
        newCategoryTextField.setText("");

        // Hide the new category adding items
        setNewCategoryVisibility(false);
    }//GEN-LAST:event_addButtonActionPerformed

    private void yearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearComboBoxActionPerformed

    private void newCategoryTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCategoryTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newCategoryTextFieldActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit.");
            return;
        }

        // Retrieve data from the selected row
        editIncomeID = (int) jTable1.getValueAt(selectedRow, 0);
        float amount = (float) jTable1.getValueAt(selectedRow, 1);
        String category = (String) jTable1.getValueAt(selectedRow, 2);
        String date = (String) jTable1.getValueAt(selectedRow, 3);
        String notes = (String) jTable1.getValueAt(selectedRow, 4);

        // Populate the form fields with the selected row's data
        amountTextField.setText(String.valueOf(amount));
        catogoriesComboBox.setSelectedItem(category);
        // Split the date to populate year, month, and date combo boxes
        String[] dateParts = date.split("-");
        yearComboBox.setSelectedItem(dateParts[0]);
        monthComboBox.setSelectedItem(dateParts[1]);
        dateComboBox.setSelectedItem(dateParts[2]);
        notesTextArea.setText(notes);

        // Set the edit mode flag to true
        isEditMode = true;
    }//GEN-LAST:event_editButtonActionPerformed

    private boolean isEditMode = false;
    private int editIncomeID = -1; // To store the ID of the income being edited

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
    private javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    private keeptoo.KGradientPanel kGradientPanel6;
    private javax.swing.JComboBox<String> monthComboBox;
    private javax.swing.JButton newButton;
    private javax.swing.JTextField newCategoryTextField;
    private javax.swing.JLabel newCatogoryLabel;
    private javax.swing.JLabel notesLabel;
    private javax.swing.JTextArea notesTextArea;
    private javax.swing.JButton submitButton;
    private javax.swing.JComboBox<String> yearComboBox;
    // End of variables declaration//GEN-END:variables
}
