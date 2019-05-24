
import java.awt.Color;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class MainFrame2 extends javax.swing.JFrame {
     boolean table=false;
     boolean table2=false;
      String Driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/";
        String url2 = "jdbc:mysql://localhost/Hostel";
        String uName = "root";
        String pwd = "";
    
    
Customer     c;
   Graph     f;
    ViewRoomFrame vr ;
    CustDetails cd;
     FeeSub fs ;
       ViewCustomerFrame vsf ;
    /**
     * Creates new form MainFrame
     */
    public MainFrame2() throws ClassNotFoundException, SQLException {
        
         try {
                            Class.forName(Driver); //Register JDBC Driver

                            System.out.println("Checking for table...");
                            Connection conn = DriverManager.getConnection(url2, uName, pwd); //Open a connection

                            DatabaseMetaData dbm = conn.getMetaData();
                            ResultSet tables = dbm.getTables(null, null, "feegraph", null);
                            if (tables.next()) {
                                System.out.println("Table exists");
                                
                                
                                table = true;

                            } else {
                                System.out.println("Table does not exist");
                                table = false;
                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        } 
        if(table==false){
        try {

                                Class.forName(Driver); //Register JDBC Driver

                                System.out.println("Creating a feegraph table...");
                                Connection con = DriverManager.getConnection(url2, uName, pwd); //Open a connection

                                Statement stmt = con.createStatement();
                                String sql = "create table feegraph(total_amount varchar(10),date varchar(10))";
                                stmt.executeUpdate(sql);
                               
                                System.out.println("Fee Table sucessfully");
                            } catch (Exception e) {
                                System.out.println("Fee Table failed");
                                e.printStackTrace();
                            }
    }
        
        
        
        
          try {
                            Class.forName(Driver); //Register JDBC Driver

                            System.out.println("Checking for table...");
                            Connection conn = DriverManager.getConnection(url2, uName, pwd); //Open a connection

                            DatabaseMetaData dbm = conn.getMetaData();
                            ResultSet tables = dbm.getTables(null, null, "custumergraph", null);
                            if (tables.next()) {
                                System.out.println("Table exists");
                                
                                
                                table2 = true;

                            } else {
                                System.out.println("Table does not exist");
                                table = false;
                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        } 
          
          if(table2==false){
        
         try {

                                Class.forName(Driver); //Register JDBC Driver

                                System.out.println("Creating a custumergraph table...");
                                Connection con = DriverManager.getConnection(url2, uName, pwd); //Open a connection

                                Statement stmt = con.createStatement();
                                String sql = "create table custumergraph(no_of_customer varchar(25),date varchar(10))";
                                stmt.executeUpdate(sql);
                               
                                System.out.println("CreateTable sucessfully");
                            } catch (Exception e) {
                                System.out.println("table creation failed");
                                e.printStackTrace();
                            }
    }
        
        
        
        
 
        
        initComponents();
     //   desktoppane.add(vr);
      //  desktoppane.add(vr);
     //   desktoppane.add(c);
       // desktoppane.add(cd);
       // desktoppane.add(fs);
       // desktoppane.add(f);
       // desktoppane.add(vsf);
     //   ((javax.swing.plaf.basic.BasicInternalFrameUI)c.getUI()).setNorthPane(null);
       // ((javax.swing.plaf.basic.BasicInternalFrameUI)vr.getUI()).setNorthPane(null);
       // ((javax.swing.plaf.basic.BasicInternalFrameUI)cd.getUI()).setNorthPane(null);
       // ((javax.swing.plaf.basic.BasicInternalFrameUI)fs.getUI()).setNorthPane(null);
       // ((javax.swing.plaf.basic.BasicInternalFrameUI)f.getUI()).setNorthPane(null);
       // ((javax.swing.plaf.basic.BasicInternalFrameUI)vsf.getUI()).setNorthPane(null);
         this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktoppane = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        checkrooms = new javax.swing.JButton();
        addcustomer = new javax.swing.JButton();
        fees = new javax.swing.JButton();
        showcustomer = new javax.swing.JButton();
        customergraph = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        feegraph = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktoppane.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout desktoppaneLayout = new javax.swing.GroupLayout(desktoppane);
        desktoppane.setLayout(desktoppaneLayout);
        desktoppaneLayout.setHorizontalGroup(
            desktoppaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        desktoppaneLayout.setVerticalGroup(
            desktoppaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 0, 204));

        checkrooms.setBackground(new java.awt.Color(255, 102, 255));
        checkrooms.setForeground(new java.awt.Color(255, 255, 255));
        checkrooms.setText("Check Rooms");
        checkrooms.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 255), 2, true));
        checkrooms.setFocusable(false);
        checkrooms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                checkroomsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                checkroomsMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                checkroomsMouseReleased(evt);
            }
        });
        checkrooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkroomsActionPerformed(evt);
            }
        });

        addcustomer.setBackground(new java.awt.Color(255, 102, 255));
        addcustomer.setForeground(new java.awt.Color(255, 255, 255));
        addcustomer.setText("Add Customer");
        addcustomer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 255), 2, true));
        addcustomer.setFocusable(false);
        addcustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addcustomerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addcustomerMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addcustomerMousePressed(evt);
            }
        });
        addcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcustomerActionPerformed(evt);
            }
        });

        fees.setBackground(new java.awt.Color(255, 102, 255));
        fees.setForeground(new java.awt.Color(255, 255, 255));
        fees.setText("Fees");
        fees.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 255), 2, true));
        fees.setFocusable(false);
        fees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                feesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                feesMouseExited(evt);
            }
        });
        fees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feesActionPerformed(evt);
            }
        });

        showcustomer.setBackground(new java.awt.Color(255, 102, 255));
        showcustomer.setForeground(new java.awt.Color(255, 255, 255));
        showcustomer.setText("Show Customer");
        showcustomer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 255), 2, true));
        showcustomer.setFocusable(false);
        showcustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                showcustomerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                showcustomerMouseExited(evt);
            }
        });
        showcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showcustomerActionPerformed(evt);
            }
        });

        customergraph.setBackground(new java.awt.Color(255, 102, 255));
        customergraph.setForeground(new java.awt.Color(255, 255, 255));
        customergraph.setText("Custumer Graph");
        customergraph.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 255), 2, true));
        customergraph.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customergraphMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customergraphMouseExited(evt);
            }
        });
        customergraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customergraphActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(255, 102, 255));
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Logout");
        logout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 255), 2, true));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        feegraph.setBackground(new java.awt.Color(255, 102, 255));
        feegraph.setForeground(new java.awt.Color(255, 255, 255));
        feegraph.setText("Fee Graph");
        feegraph.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 255), 2, true));
        feegraph.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                feegraphMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                feegraphMouseExited(evt);
            }
        });
        feegraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feegraphActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkrooms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customergraph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(showcustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fees, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addcustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(feegraph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(checkrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fees, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(showcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customergraph, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(feegraph, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );

        jPanel2.setBackground(new java.awt.Color(102, 255, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("WardenSection");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(741, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(584, 584, 584))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktoppane))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(desktoppane)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkroomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkroomsActionPerformed
       vr = new ViewRoomFrame();  
   desktoppane.add(vr);
        vr.setVisible(true);
      
   
   
    }//GEN-LAST:event_checkroomsActionPerformed

    private void addcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcustomerActionPerformed
       cd= new CustDetails();
        desktoppane.add(cd);
        cd.setVisible(true);
    
     
    }//GEN-LAST:event_addcustomerActionPerformed

    private void feesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feesActionPerformed
        // TODO add your handling code here:
    fs = new  FeeSub ();
      desktoppane.add(fs);
        fs.setVisible(true);  
    }//GEN-LAST:event_feesActionPerformed

    private void showcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showcustomerActionPerformed
        // TODO add your handling code here:
     vsf = new   ViewCustomerFrame();
     desktoppane.add(vsf);
     
        vsf.setVisible(true); 
    }//GEN-LAST:event_showcustomerActionPerformed

    private void customergraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customergraphActionPerformed
        
          
         try {
             c = new Customer();
             desktoppane.add(c);
             
             c.setVisible(true);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(MainFrame2.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(MainFrame2.class.getName()).log(Level.SEVERE, null, ex);
         }
         
     
        
         
    }//GEN-LAST:event_customergraphActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
       Home window = new Home();
       window.frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void checkroomsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkroomsMouseEntered
        // TODO add your handling code here:
        checkrooms.setBackground(Color.BLACK);
    }//GEN-LAST:event_checkroomsMouseEntered

    private void addcustomerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addcustomerMousePressed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_addcustomerMousePressed

    private void checkroomsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkroomsMouseReleased
        // TODO add your handling code here:
      
    }//GEN-LAST:event_checkroomsMouseReleased

    private void checkroomsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkroomsMouseExited
        // TODO add your handling code here:
          checkrooms.setBackground(Color.magenta);
        
    }//GEN-LAST:event_checkroomsMouseExited

    private void feegraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feegraphActionPerformed
         try {
             f=  new  Graph();
             desktoppane.add(f);
             
             f.setVisible(true);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(MainFrame2.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(MainFrame2.class.getName()).log(Level.SEVERE, null, ex);
         }
          
    }//GEN-LAST:event_feegraphActionPerformed

    private void addcustomerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addcustomerMouseEntered
        // TODO add your handling code here:
         addcustomer.setBackground(Color.BLACK);
    }//GEN-LAST:event_addcustomerMouseEntered

    private void addcustomerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addcustomerMouseExited
        // TODO add your handling code here:
         addcustomer.setBackground(Color.magenta);
    }//GEN-LAST:event_addcustomerMouseExited

    private void feesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feesMouseEntered
        // TODO add your handling code here:
         fees.setBackground(Color.BLACK);
    }//GEN-LAST:event_feesMouseEntered

    private void feesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feesMouseExited
        // TODO add your handling code here:
          fees.setBackground(Color.magenta);
    }//GEN-LAST:event_feesMouseExited

    private void showcustomerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showcustomerMouseEntered
        // TODO add your handling code here:
            showcustomer.setBackground(Color.BLACK);
    }//GEN-LAST:event_showcustomerMouseEntered

    private void showcustomerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showcustomerMouseExited
        // TODO add your handling code here:
          showcustomer.setBackground(Color.magenta);
    }//GEN-LAST:event_showcustomerMouseExited

    private void customergraphMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customergraphMouseEntered
        // TODO add your handling code here:
          customergraph.setBackground(Color.BLACK);
    }//GEN-LAST:event_customergraphMouseEntered

    private void customergraphMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customergraphMouseExited
        // TODO add your handling code here:
         customergraph.setBackground(Color.magenta);
    }//GEN-LAST:event_customergraphMouseExited

    private void feegraphMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feegraphMouseEntered
        // TODO add your handling code here:
          feegraph.setBackground(Color.BLACK);
    }//GEN-LAST:event_feegraphMouseEntered

    private void feegraphMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feegraphMouseExited
        // TODO add your handling code here:
         feegraph.setBackground(Color.magenta);
    }//GEN-LAST:event_feegraphMouseExited

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        // TODO add your handling code here:
          logout.setBackground(Color.BLACK);
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        // TODO add your handling code here:
         logout.setBackground(Color.magenta);
    }//GEN-LAST:event_logoutMouseExited

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainFrame2().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MainFrame2.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addcustomer;
    private javax.swing.JButton checkrooms;
    private javax.swing.JButton customergraph;
    private javax.swing.JDesktopPane desktoppane;
    private javax.swing.JButton feegraph;
    private javax.swing.JButton fees;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logout;
    private javax.swing.JButton showcustomer;
    // End of variables declaration//GEN-END:variables
}
