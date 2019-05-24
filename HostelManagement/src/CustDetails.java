
import java.awt.Component;
import java.awt.event.KeyEvent;
import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author manish
 */
public class CustDetails extends javax.swing.JInternalFrame {

    int oldid;
    private Component f;

    /**
     * Creates new form CustDetails
     */
    public CustDetails() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LReg = new javax.swing.JLabel();
        LName = new javax.swing.JLabel();
        LAadh = new javax.swing.JLabel();
        LMob = new javax.swing.JLabel();
        LDate = new javax.swing.JLabel();
        LRoom = new javax.swing.JLabel();
        LBed = new javax.swing.JLabel();
        LSec_Mon = new javax.swing.JLabel();
        LRent = new javax.swing.JLabel();
        LProfession = new javax.swing.JLabel();
        LGender = new javax.swing.JLabel();
        LMess = new javax.swing.JLabel();
        LCity = new javax.swing.JLabel();
        LState = new javax.swing.JLabel();
        LPincode = new javax.swing.JLabel();
        LAddress = new javax.swing.JLabel();
        TFName = new javax.swing.JTextField();
        TFAadhar = new javax.swing.JTextField();
        TFRoom_No = new javax.swing.JTextField();
        TFBed_No = new javax.swing.JTextField();
        TFSec_Mon = new javax.swing.JTextField();
        TFRent = new javax.swing.JTextField();
        TFProfession = new javax.swing.JTextField();
        TFMob_No = new javax.swing.JTextField();
        TFCity = new javax.swing.JTextField();
        TFState = new javax.swing.JTextField();
        TFPincode = new javax.swing.JTextField();
        CBDay = new javax.swing.JComboBox<>();
        CBMonth = new javax.swing.JComboBox<>();
        CBYear = new javax.swing.JComboBox<>();
        CBGender = new javax.swing.JComboBox<>();
        TFAddress = new javax.swing.JScrollPane();
        TFAddr = new javax.swing.JTextArea();
        BSubmitt = new javax.swing.JButton();
        RBYes = new javax.swing.JRadioButton();
        RBNo = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        LReg.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        LReg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LReg.setText("Registration Form");

        LName.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LName.setText("Name");

        LAadh.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LAadh.setText("Aadhar No.");

        LMob.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LMob.setText("Mob No.");

        LDate.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LDate.setText("In Date");

        LRoom.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LRoom.setText("Room No.");

        LBed.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LBed.setText("Bed No.");

        LSec_Mon.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LSec_Mon.setText("Security Money");

        LRent.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LRent.setText("Rent Cost");

        LProfession.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LProfession.setText("Profession");

        LGender.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LGender.setText("Gender");

        LMess.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LMess.setText("Mess");

        LCity.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LCity.setText("City");

        LState.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LState.setText("State");

        LPincode.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LPincode.setText("Pincode");

        LAddress.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LAddress.setText("Address");

        TFName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TFName.setToolTipText("error");
        TFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFNameActionPerformed(evt);
            }
        });
        TFName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFNameKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFNameKeyPressed(evt);
            }
        });

        TFAadhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFAadharActionPerformed(evt);
            }
        });
        TFAadhar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFAadharKeyTyped(evt);
            }
        });

        TFBed_No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFBed_NoActionPerformed(evt);
            }
        });

        TFSec_Mon.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TFSec_Mon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFSec_MonKeyTyped(evt);
            }
        });

        TFRent.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TFRent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFRentKeyTyped(evt);
            }
        });

        TFProfession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFProfessionActionPerformed(evt);
            }
        });
        TFProfession.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFProfessionKeyPressed(evt);
            }
        });

        TFMob_No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFMob_NoActionPerformed(evt);
            }
        });
        TFMob_No.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFMob_NoKeyTyped(evt);
            }
        });

        TFCity.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TFCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFCityActionPerformed(evt);
            }
        });
        TFCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFCityKeyPressed(evt);
            }
        });

        TFState.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TFState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFStateActionPerformed(evt);
            }
        });
        TFState.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFStateKeyPressed(evt);
            }
        });

        TFPincode.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TFPincode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFPincodeKeyTyped(evt);
            }
        });

        CBDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        CBDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBDayActionPerformed(evt);
            }
        });

        CBMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        CBYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "year", "2016", "2017", "2018", "2019", "2020" }));

        CBGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Transgender", "other" }));

        TFAddr.setColumns(20);
        TFAddr.setRows(5);
        TFAddress.setViewportView(TFAddr);

        BSubmitt.setText("Submitt");
        BSubmitt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSubmittActionPerformed(evt);
            }
        });

        RBYes.setText("yes");
        RBYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBYesActionPerformed(evt);
            }
        });

        RBNo.setText("no");
        RBNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LGender)
                                    .addComponent(LProfession)
                                    .addComponent(LMess)
                                    .addComponent(LCity))
                                .addGap(80, 80, 80)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TFCity)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(CBGender, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(RBYes, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(RBNo)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TFProfession, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LPincode)
                                    .addComponent(LAddress)
                                    .addComponent(LRent)
                                    .addComponent(LState))
                                .addGap(84, 84, 84)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TFPincode)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TFRent, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TFState, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LMob)
                                    .addComponent(LAadh)
                                    .addComponent(LDate)
                                    .addComponent(LBed)
                                    .addComponent(LName, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LRoom)
                                    .addComponent(LSec_Mon))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TFName)
                                    .addComponent(TFAadhar)
                                    .addComponent(TFMob_No)
                                    .addComponent(TFRoom_No)
                                    .addComponent(TFBed_No)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(CBDay, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CBMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CBYear, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(TFSec_Mon, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(TFAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(BSubmitt, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(LReg)))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LReg)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFAadhar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LAadh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LMob)
                    .addComponent(TFMob_No, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBDay, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBYear, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFRoom_No, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LRoom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFBed_No, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFSec_Mon, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LSec_Mon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFRent, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LRent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFProfession, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LProfession))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LGender)
                    .addComponent(CBGender, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LMess)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RBYes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RBNo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LCity)
                    .addComponent(TFCity, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(LState)
                        .addGap(18, 18, 18)
                        .addComponent(LPincode))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(TFState, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TFPincode, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(BSubmitt)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(351, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFAadharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFAadharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFAadharActionPerformed

    private void TFMob_NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFMob_NoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFMob_NoActionPerformed

    private void TFBed_NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFBed_NoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFBed_NoActionPerformed

    private void TFProfessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFProfessionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFProfessionActionPerformed

    private void CBDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBDayActionPerformed

    private void TFCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFCityActionPerformed

    private void TFStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFStateActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_TFStateActionPerformed

    private void BSubmittActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSubmittActionPerformed
        // TODO Auto-generated method stub

        String Driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/";
        String url2 = "jdbc:mysql://localhost/Hostel";
        String uName = "root";
        String pwd = "";
        String roomid = "C100";
        String newid = null;
        boolean ab = false;
        boolean cd = false;
        String day, month, year;
        boolean ef = false;
        boolean table = false;
        boolean count = false;
        boolean ef2 = false;
        boolean table2 = false;
        boolean update = false;
        String sum = null;
        String datak = null;
        String date = null;

        if (TFAddr.getText().isEmpty() || TFAadhar.getText().isEmpty() || TFBed_No.getText().isEmpty()
                || TFCity.getText().isEmpty() || TFMob_No.getText().isEmpty() || TFName.getText().isEmpty()
                || TFPincode.getText().isEmpty() || TFProfession.getText().isEmpty()
                || TFRent.getText().isEmpty() || TFRoom_No.getText().isEmpty() || TFSec_Mon.getText().isEmpty()
                || TFState.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Please enter all Fields");
        } else {

            try {
                Class.forName(Driver); //Register JDBC Driver

                System.out.println("Checking  for  database...");
                Connection conn = DriverManager.getConnection(url, uName, pwd); //Open a connection

                ResultSet resultSet = conn.getMetaData().getCatalogs();

                while (resultSet.next()) {
                    String databaseName = resultSet.getString(1);

                    if (databaseName.equals("Hostel")) {
                        ab = true;
                        cd = true;
                        System.out.println("Database exist already");
                    } else {
                        ab = false;
                    }
                }
                resultSet.close();

            } catch (Exception e) {
                e.printStackTrace();
            }

            if (ab == false) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection(url, uName, pwd); //Open a connection
                    Statement statement = con.createStatement();
                    int myResult = statement.executeUpdate("CREATE DATABASE IF NOT EXISTS Hostel"); //should get 0
                    cd = true;
                    ab = true;
                    System.out.println("Database created successfully");

                } catch (Exception e) {
                    System.out.println("Database creation failed");
                    e.printStackTrace();
                }
            }

            if (cd == true) {
                try {
                    Class.forName(Driver); //Register JDBC Driver

                    System.out.println("Checking for  table...");
                    Connection conn = DriverManager.getConnection(url2, uName, pwd); //Open a connection

                    DatabaseMetaData dbm = conn.getMetaData();
                    ResultSet tables = dbm.getTables(null, null, "Cust_Detail", null);
                    if (tables.next()) {
                        System.out.println("Table exists");
                        ef = true;
                        table = true;
                    } else {
                        System.out.println("Table does not exist");
                        table = false;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

                if (table == false) {
                    try {
                        Class.forName(Driver);
                        Connection conn = DriverManager.getConnection(url2, uName, pwd);
                        Statement stmt = conn.createStatement();
                        String sql = "create table  Cust_Detail(Customer_ID varchar(25),FName varchar(25),Aadhar varchar(25),Mob varchar(25)"
                                + ",In_Date varchar(25),Room_No varchar(25),Bed_No varchar(25),Security_Money varchar(25),Rent_Cost varchar(25),Profession varchar(25),"
                                + "Gender varchar(25),Mess varchar(25),"
                                + "City varchar(25),State varchar(25),"
                                + "Pincode varchar(25),Address varchar(25))";
                        stmt.executeUpdate(sql);
                        ef = true;
                        table = true;
                        System.out.println("CreateTable sucessfully");

                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        System.out.println("Table creation failed");
                        e.printStackTrace();
                    }
                }

                if (ef == true) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = DriverManager.getConnection(url2, uName, pwd); //Open a connection
                        PreparedStatement ps = conn.prepareStatement("select * from Cust_Detail");
                        ResultSet rs = ps.executeQuery();
                        //first time is not run.its runs second time
                        while (rs.next()) {
                            roomid = rs.getString(1);
                            System.out.println(roomid + "this is current id");

                        }

                        //only first time run when table created firstly
                        if (roomid.equals("C100")) {
                            oldid = Integer.parseInt(roomid.substring(1, 4));
                            newid = "C" + String.valueOf(++oldid);
                        } else {
                            oldid = Integer.parseInt(roomid.substring(1, 4));
                            newid = "C" + String.valueOf(++oldid);
                        }
                        conn.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        Class.forName(Driver);
                        Connection conn = DriverManager.getConnection(url2, uName, pwd);
                        PreparedStatement pst = conn.prepareStatement("insert into Cust_Detail values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

                        pst.setString(1, newid);
                        pst.setString(2, TFName.getText());
                        pst.setString(3, TFAadhar.getText());
                        pst.setString(4, TFMob_No.getText());

                        day = CBDay.getSelectedItem().toString();
                        month = CBMonth.getSelectedItem().toString();
                        year = CBYear.getSelectedItem().toString();
                        date = day + ":" + month + ":" + year;

                        pst.setString(5, date);
                        pst.setString(6, TFRoom_No.getText());
                        pst.setString(7, TFBed_No.getText());
                        pst.setString(8, TFSec_Mon.getText());
                        pst.setString(9, TFRent.getText());
                        pst.setString(10, TFProfession.getText());
                        pst.setString(11, CBGender.getSelectedItem().toString());
                        if (RBYes.isSelected()) {
                            pst.setString(12, RBYes.getText());
                        } else {
                            pst.setString(12, RBNo.getText());
                        }
                        //  pst.setString(13,RBNo.getText());
                        pst.setString(13, TFCity.getText());
                        pst.setString(14, TFState.getText());
                        pst.setString(15, TFPincode.getText());
                        pst.setString(16, TFAddr.getText());
                        int i = pst.executeUpdate();

                        JOptionPane.showMessageDialog(f, "record insertion successfully");
                        count = true;
                    } catch (Exception ex) {
                        System.out.println("record insertion failed");
                        ex.printStackTrace();
                    }

                    if (count == true) {
                        try {
                            Class.forName(Driver);
                            Connection conn = DriverManager.getConnection(url2, uName, pwd);
                            String sql = "select count(*) from Cust_Detail where In_Date='" + date + "'";
                            PreparedStatement ps = conn.prepareStatement(sql);
                            ResultSet rs = ps.executeQuery();
                            if (rs.next()) {

                                sum = rs.getString("count(*)");
                                System.out.println("count is" + sum);
                            }

                            ps.close();
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                        try {
                            Class.forName(Driver); //Register JDBC Driver

                            System.out.println("Checking for table...");
                            Connection conn = DriverManager.getConnection(url2, uName, pwd); //Open a connection

                            DatabaseMetaData dbm = conn.getMetaData();
                            ResultSet tables = dbm.getTables(null, null, "custumergraph", null);
                            if (tables.next()) {
                                System.out.println("Table exists");
                                update = true;
                                table2 = true;

                            } else {
                                System.out.println("Table does not exist");
                                table2 = false;
                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        if (table2 == false) {
                            try {

                                Class.forName(Driver); //Register JDBC Driver

                                System.out.println("Creating a custumergraph table...");
                                Connection con = DriverManager.getConnection(url2, uName, pwd); //Open a connection

                                Statement stmt = con.createStatement();
                                String sql = "create table custumergraph(no_of_customer varchar(25),date varchar(10))";
                                stmt.executeUpdate(sql);
                                ef2 = true;
                                table2 = true;
                                System.out.println("CreateTable sucessfully");
                            } catch (Exception e) {
                                System.out.println("table creation failed");
                                e.printStackTrace();
                            }

                        }
                        if (ef2 == true) {

                            try {
                                Class.forName(Driver); //Register JDBC Driver
                                Connection con = DriverManager.getConnection(url2, uName, pwd); //Open a connection
                                PreparedStatement s = con.prepareStatement("insert into custumergraph values(?,?)");
                                s.setString(1, sum);

                                s.setString(2, date);
                                int i = s.executeUpdate();
                                JOptionPane.showMessageDialog(f, "record insertion in custumergraph successfully");
                            } catch (Exception e) {
                                System.out.println("record creation failed");
                                e.printStackTrace();
                            }

                        }
                        //for second time we update no of customer
                      // for second time we update no of customer
                        if (update == true) {
                            
                            
                            
                            try {
                                int flag = 1;

                                   Class.forName("com.mysql.jdbc.Driver");
                                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel", "root", "");
                                  Statement s=c.createStatement();
          
    
                                    ResultSet rs=s.executeQuery("select *from custumergraph");
                                    
                                      while(rs.next())
                  {
			if(rs.getString(2).equals(date))
                        {
                          
                          
                             try{
                              System.out.println("date is equal");
                               Class.forName(Driver); //Register JDBC Driver
                                Connection con = DriverManager.getConnection(url2, uName, pwd); //Open a connection
                               PreparedStatement s2 = c.prepareStatement("update  custumergraph set no_of_customer= ? where date=?");

                                s2.setString(1, sum);
                                s2.setString(2, date);

                                int j = s2.executeUpdate();
                                JOptionPane.showMessageDialog(f, "Successfully updated"); 
                           }catch (ClassNotFoundException | SQLException e) {
                                System.out.println(e);
                                }
                            flag=0;
                        }
                       
                        
                   
                 }
                   if(flag==1)
                        {
                        
                         
                         try {
                                Class.forName(Driver); //Register JDBC Driver
                                Connection con = DriverManager.getConnection(url2, uName, pwd); //Open a connection
                                PreparedStatement s3 = con.prepareStatement("insert into custumergraph values(?,?)");
                                s3.setString(1, sum);

                                s3.setString(2, date);
                                int i = s3.executeUpdate();
                                 JOptionPane.showMessageDialog(f, " custumergraph insertion  successfully");
                            } catch (Exception e) {
                                System.out.println("record creation failed");
                                e.printStackTrace();
                            }
                        }
                 
           
                
                            }catch (ClassNotFoundException | SQLException e) {
                                System.out.println(e);

                        }

                   
                 }

                    }

                }

            }

        }
    }//GEN-LAST:event_BSubmittActionPerformed

    private void RBYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBYesActionPerformed

    private void RBNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBNoActionPerformed

    private void TFNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFNameKeyTyped

    }//GEN-LAST:event_TFNameKeyTyped

    private void TFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNameActionPerformed

    }//GEN-LAST:event_TFNameActionPerformed

    private void TFAadharKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFAadharKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
    }//GEN-LAST:event_TFAadharKeyTyped
    }
    private void TFMob_NoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFMob_NoKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
    }//GEN-LAST:event_TFMob_NoKeyTyped
    }
    private void TFSec_MonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFSec_MonKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
    }//GEN-LAST:event_TFSec_MonKeyTyped
    }
    private void TFRentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFRentKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
    }//GEN-LAST:event_TFRentKeyTyped
    }
    private void TFPincodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFPincodeKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
    }//GEN-LAST:event_TFPincodeKeyTyped
    }
    private void TFNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFNameKeyPressed
        char c = evt.getKeyChar();
        //code for JTextField that accet letter whitespace and delete backspace key only
        //iso control for edit operation(delete key and backspace key allow)
        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
            TFName.setEditable(true);
        } else {
            getToolkit().beep();
            TFName.setEditable(false);
        }
    }//GEN-LAST:event_TFNameKeyPressed

    private void TFProfessionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFProfessionKeyPressed
        char c = evt.getKeyChar();

        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
            TFProfession.setEditable(true);
        } else {
            getToolkit().beep();
            TFProfession.setEditable(false);
        }
    }//GEN-LAST:event_TFProfessionKeyPressed

    private void TFCityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFCityKeyPressed
        char c = evt.getKeyChar();

        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
            TFCity.setEditable(true);
        } else {
            getToolkit().beep();
            TFCity.setEditable(false);
        }
    }//GEN-LAST:event_TFCityKeyPressed

    private void TFStateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFStateKeyPressed
        char c = evt.getKeyChar();

        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
            TFState.setEditable(true);
        } else {
            getToolkit().beep();
            TFState.setEditable(false);
        }
    }//GEN-LAST:event_TFStateKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustDetails().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BSubmitt;
    private javax.swing.JComboBox<String> CBDay;
    private javax.swing.JComboBox<String> CBGender;
    private javax.swing.JComboBox<String> CBMonth;
    private javax.swing.JComboBox<String> CBYear;
    private javax.swing.JLabel LAadh;
    private javax.swing.JLabel LAddress;
    private javax.swing.JLabel LBed;
    private javax.swing.JLabel LCity;
    private javax.swing.JLabel LDate;
    private javax.swing.JLabel LGender;
    private javax.swing.JLabel LMess;
    private javax.swing.JLabel LMob;
    private javax.swing.JLabel LName;
    private javax.swing.JLabel LPincode;
    private javax.swing.JLabel LProfession;
    private javax.swing.JLabel LReg;
    private javax.swing.JLabel LRent;
    private javax.swing.JLabel LRoom;
    private javax.swing.JLabel LSec_Mon;
    private javax.swing.JLabel LState;
    private javax.swing.JRadioButton RBNo;
    private javax.swing.JRadioButton RBYes;
    private javax.swing.JTextField TFAadhar;
    private javax.swing.JTextArea TFAddr;
    private javax.swing.JScrollPane TFAddress;
    private javax.swing.JTextField TFBed_No;
    private javax.swing.JTextField TFCity;
    private javax.swing.JTextField TFMob_No;
    private javax.swing.JTextField TFName;
    private javax.swing.JTextField TFPincode;
    private javax.swing.JTextField TFProfession;
    private javax.swing.JTextField TFRent;
    private javax.swing.JTextField TFRoom_No;
    private javax.swing.JTextField TFSec_Mon;
    private javax.swing.JTextField TFState;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
