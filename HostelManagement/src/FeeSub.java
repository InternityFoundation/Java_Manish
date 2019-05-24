

import java.awt.Component;
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
public class FeeSub extends javax.swing.JInternalFrame {

    private Component f;

   
    public FeeSub() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lcust = new javax.swing.JLabel();
        ldt = new javax.swing.JLabel();
        lamount = new javax.swing.JLabel();
        tname = new javax.swing.JTextField();
        tfamount = new javax.swing.JTextField();
        cbday = new javax.swing.JComboBox<>();
        cbmonth = new javax.swing.JComboBox<>();
        cbyear = new javax.swing.JComboBox<>();
        bsub = new javax.swing.JButton();
        bview = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        feetable = new javax.swing.JTable();
        lcust1 = new javax.swing.JLabel();
        tfcust1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lcust.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lcust.setText("Name");

        ldt.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        ldt.setText("Date");

        lamount.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lamount.setText("Amount");

        tname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnameActionPerformed(evt);
            }
        });

        tfamount.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfamountActionPerformed(evt);
            }
        });

        cbday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbdayActionPerformed(evt);
            }
        });

        cbmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cbmonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmonthActionPerformed(evt);
            }
        });

        cbyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "year", "2016", "2017", "2018", "2019", "2020" }));
        cbyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbyearActionPerformed(evt);
            }
        });

        bsub.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        bsub.setText("Submit");
        bsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsubActionPerformed(evt);
            }
        });

        bview.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        bview.setText("View Fee");
        bview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bviewActionPerformed(evt);
            }
        });

        feetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Customer ID", "Date", "Amount"
            }
        ));
        jScrollPane1.setViewportView(feetable);
        if (feetable.getColumnModel().getColumnCount() > 0) {
            feetable.getColumnModel().getColumn(2).setResizable(false);
        }

        lcust1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lcust1.setText("Customer ID");

        tfcust1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfcust1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcust1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lcust)
                                    .addComponent(ldt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbmonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(cbyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tname, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lamount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfamount, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(lcust1)
                        .addGap(55, 55, 55)
                        .addComponent(tfcust1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 443, Short.MAX_VALUE)
                .addComponent(bview, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(472, 472, 472)
                .addComponent(bsub, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lcust1)
                            .addComponent(tfcust1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bview)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lcust))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbmonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ldt))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lamount))
                .addGap(47, 47, 47)
                .addComponent(bsub)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbyearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbyearActionPerformed

    private void bsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsubActionPerformed
       String Driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/";
        String url2 = "jdbc:mysql://localhost/Hostel";
        String uName = "root";
        String pwd = "";
          String roomid = "C100";
           String newid = null;
       String sum=null;
        boolean cd = false;
                     String day, month, year;
        boolean ef = false;
        boolean table = false;
        boolean count = false;
        boolean ef2 = false;
        boolean table2 = false;
        boolean update = false;
        
        String datak = null;
        String date=null;

     

          

           
                try {
                    Class.forName(Driver); //Register JDBC Driver

                    System.out.println("Checking for  table...");
                    Connection conn = DriverManager.getConnection(url2, uName, pwd); //Open a connection

                    DatabaseMetaData dbm = conn.getMetaData();
                    ResultSet tables = dbm.getTables(null, null, "FeeSub", null);
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
                        String sql = "create table FeeSub(Customer_Id VARCHAR(25),Name VARCHAR(25),In_Date VARCHAR(25),Amount Int(10))";
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
              day=cbday.getSelectedItem().toString();
                              month=cbmonth.getSelectedItem().toString();
                              year=cbyear.getSelectedItem().toString();
                              date=day+"/"+month+"/"+year;
                    try {
                        Class.forName(Driver);
                        Connection conn = DriverManager.getConnection(url2, uName, pwd);
                        PreparedStatement pst = conn.prepareStatement("insert into FeeSub values(?,?,?,?)");
                pst.setString(1,tfcust1.getText());
                  pst.setString(2,tname.getText());
                pst.setString(3,date);
                int amount=Integer.parseInt(tfamount.getText());
                pst.setInt(4,amount);
            
               pst.executeUpdate();

                        JOptionPane.showMessageDialog(f, "Fee insertion successfully");
                        count = true;
                    } catch (Exception ex) {
                        System.out.println("record insertion failed");
                        ex.printStackTrace();
                    }

                 if(count==true){
                   try{
                        Class.forName(Driver);
                        Connection conn = DriverManager.getConnection(url2, uName, pwd);
                        String sql="select sum(Amount) from FeeSub where In_Date='"+date+"'";
                      PreparedStatement ps = conn.prepareStatement(sql);
                            ResultSet rs=ps.executeQuery();
                            if (rs.next()) {

                                sum = rs.getString("sum(Amount)");
                                System.out.println("count is" + sum);
                            }
                        ps.close();
                   }catch(Exception ex){
                       ex.printStackTrace();
                   } 
                   try {
                            Class.forName(Driver); //Register JDBC Driver

                            System.out.println("Checking for table...");
                            Connection conn = DriverManager.getConnection(url2, uName, pwd); //Open a connection

                            DatabaseMetaData dbm = conn.getMetaData();
                            ResultSet tables = dbm.getTables(null, null, "feegraph", null);
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

                                System.out.println("Creating a feegraph table...");
                                Connection con = DriverManager.getConnection(url2, uName, pwd); //Open a connection

                                Statement stmt = con.createStatement();
                                String sql = "create table feegraph(total_amount varchar(10),date varchar(10))";
                                stmt.executeUpdate(sql);
                                ef2 = true;
                                table2 = true;
                                System.out.println("Fee Table sucessfully");
                            } catch (Exception e) {
                                System.out.println("Fee Table failed");
                                e.printStackTrace();
                            }

                        }
                    if (ef2 == true) {

                            try {
                                Class.forName(Driver); //Register JDBC Driver
                                Connection con = DriverManager.getConnection(url2, uName, pwd); //Open a connection
                                PreparedStatement s = con.prepareStatement("insert into feegraph values(?,?)");
                                s.setString(1, sum);

                                s.setString(2, date);
                                int i = s.executeUpdate();
                                 JOptionPane.showMessageDialog(f, " feegraph insertion  successfully");
                            } catch (Exception e) {
                                System.out.println("record creation failed");
                                e.printStackTrace();
                            }

                        }
                 //for second time we update no of customer
                        if (update == true) {
                            
                            
                            
                            try {
                                int flag = 1;

                                   Class.forName("com.mysql.jdbc.Driver");
                                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel", "root", "");
                                  Statement s=c.createStatement();
          
    
                                    ResultSet rs=s.executeQuery("select *from feegraph");
                                    
                                      while(rs.next())
                  {
			if(rs.getString(2).equals(date))
                        {
                          
                            JOptionPane.showMessageDialog(f,"date is found");
                             try{
                              System.out.println("date is equal");
                               Class.forName(Driver); //Register JDBC Driver
                                Connection con = DriverManager.getConnection(url2, uName, pwd); //Open a connection
                               PreparedStatement s2 = c.prepareStatement("update  feegraph set total_amount= ? where date=?");

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
                         JOptionPane.showMessageDialog(f,"date is not","Alert" ,JOptionPane.WARNING_MESSAGE); 
                         
                         try {
                                Class.forName(Driver); //Register JDBC Driver
                                Connection con = DriverManager.getConnection(url2, uName, pwd); //Open a connection
                                PreparedStatement s3 = con.prepareStatement("insert into feegraph values(?,?)");
                                s3.setString(1, sum);

                                s3.setString(2, date);
                                int i = s3.executeUpdate();
                                 JOptionPane.showMessageDialog(f, " feegraph insertion  successfully");
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
     
    }//GEN-LAST:event_bsubActionPerformed

    private void bviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bviewActionPerformed
        // TODO add your handling code here:
      
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Hostel","root","");
            String q="select * from  FeeSub";
            PreparedStatement  s = c.prepareStatement(q);

            ResultSet rs=s.executeQuery();
            feetable.setModel(DbUtils.resultSetToTableModel(rs));

            JOptionPane.showMessageDialog(f,"Successfully ");

            c.close();
        }

        catch (Exception e) {
            System.out.println(e);
        }  
    }//GEN-LAST:event_bviewActionPerformed

    private void tfamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfamountActionPerformed

    private void tnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnameActionPerformed

    private void cbmonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbmonthActionPerformed

    private void tfcust1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcust1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcust1ActionPerformed

    private void cbdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbdayActionPerformed

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
            java.util.logging.Logger.getLogger(FeeSub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeeSub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeeSub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeeSub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeeSub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bsub;
    private javax.swing.JButton bview;
    private javax.swing.JComboBox<String> cbday;
    private javax.swing.JComboBox<String> cbmonth;
    private javax.swing.JComboBox<String> cbyear;
    private javax.swing.JTable feetable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lamount;
    private javax.swing.JLabel lcust;
    private javax.swing.JLabel lcust1;
    private javax.swing.JLabel ldt;
    private javax.swing.JTextField tfamount;
    private javax.swing.JTextField tfcust1;
    private javax.swing.JTextField tname;
    // End of variables declaration//GEN-END:variables
}
