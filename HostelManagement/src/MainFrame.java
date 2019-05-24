
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
public class MainFrame extends javax.swing.JFrame {
    boolean table=false;
     boolean table2=false;
      String Driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/";
        String url2 = "jdbc:mysql://localhost/Hostel";
        String uName = "root";
        String pwd = "";
    Customer     c;
   Graph     f;
    AddWardonFrame awf;
      ViewWardonFrame vwf; 
        AddRoomFrame arf ;
          ViewCustomerFrame vcf; 
          ViewRoomFrame vrf;
    /**
     * Creates new form MainFrame
     */
    public MainFrame() throws ClassNotFoundException, SQLException{
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
        
          
          
          
          
          
          
    
    // this.vwf    = new ViewWardonFrame();
     //this.arf    = new AddRoomFrame();
      // this. vrf    = new ViewRoomFrame();
     //this.vcf    = new  ViewCustomerFrame();
   
        initComponents();
      //  desktoppane.add(c);
      //  desktoppane.add(f);
      //   desktoppane.add(awf);
        //  desktoppane.add(vwf);
       //    desktoppane.add(arf);
       //     desktoppane.add(vcf);
          //   desktoppane.add(vrf);
       //        ((javax.swing.plaf.basic.BasicInternalFrameUI)c.getUI()).setNorthPane(null);
//            ((javax.swing.plaf.basic.BasicInternalFrameUI)f.getUI()).setNorthPane(null);
//              ((javax.swing.plaf.basic.BasicInternalFrameUI)awf.getUI()).setNorthPane(null);
//               ((javax.swing.plaf.basic.BasicInternalFrameUI)vwf.getUI()).setNorthPane(null);
//                ((javax.swing.plaf.basic.BasicInternalFrameUI)arf.getUI()).setNorthPane(null);
//                 ((javax.swing.plaf.basic.BasicInternalFrameUI)vcf.getUI()).setNorthPane(null);
//                  ((javax.swing.plaf.basic.BasicInternalFrameUI)vrf.getUI()).setNorthPane(null);
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
        Addbutton = new javax.swing.JButton();
        viewwarden = new javax.swing.JButton();
        addroom = new javax.swing.JButton();
        viewcustomer = new javax.swing.JButton();
        graph = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        viewroom = new javax.swing.JButton();
        customergraph = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        Addbutton.setBackground(new java.awt.Color(255, 102, 255));
        Addbutton.setForeground(new java.awt.Color(255, 255, 255));
        Addbutton.setText("Add Warden");
        Addbutton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 255), 2, true));
        Addbutton.setFocusable(false);
        Addbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddbuttonMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AddbuttonMouseReleased(evt);
            }
        });
        Addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbuttonActionPerformed(evt);
            }
        });

        viewwarden.setBackground(new java.awt.Color(255, 102, 255));
        viewwarden.setForeground(new java.awt.Color(255, 255, 255));
        viewwarden.setText("View Warden");
        viewwarden.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 255), 2, true));
        viewwarden.setFocusable(false);
        viewwarden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewwardenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewwardenMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewwardenMousePressed(evt);
            }
        });
        viewwarden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewwardenActionPerformed(evt);
            }
        });

        addroom.setBackground(new java.awt.Color(255, 102, 255));
        addroom.setForeground(new java.awt.Color(255, 255, 255));
        addroom.setText("Add Room");
        addroom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 255), 2, true));
        addroom.setFocusable(false);
        addroom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addroomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addroomMouseExited(evt);
            }
        });
        addroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addroomActionPerformed(evt);
            }
        });

        viewcustomer.setBackground(new java.awt.Color(255, 102, 255));
        viewcustomer.setForeground(new java.awt.Color(255, 255, 255));
        viewcustomer.setText("View Custumer");
        viewcustomer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 255), 2, true));
        viewcustomer.setFocusable(false);
        viewcustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewcustomerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewcustomerMouseExited(evt);
            }
        });
        viewcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewcustomerActionPerformed(evt);
            }
        });

        graph.setBackground(new java.awt.Color(255, 102, 255));
        graph.setForeground(new java.awt.Color(255, 255, 255));
        graph.setText("Fee Graph");
        graph.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 255), 2, true));
        graph.setFocusable(false);
        graph.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                graphMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                graphMouseExited(evt);
            }
        });
        graph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    graphActionPerformed(evt);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        logout.setBackground(new java.awt.Color(255, 102, 255));
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Logout");
        logout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 255), 2, true));
        logout.setFocusable(false);
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

        viewroom.setBackground(new java.awt.Color(255, 102, 255));
        viewroom.setForeground(new java.awt.Color(255, 255, 255));
        viewroom.setText("View Room");
        viewroom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 255), 2, true));
        viewroom.setFocusable(false);
        viewroom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewroomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewroomMouseExited(evt);
            }
        });
        viewroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewroomActionPerformed(evt);
            }
        });

        customergraph.setBackground(new java.awt.Color(255, 102, 255));
        customergraph.setForeground(new java.awt.Color(255, 255, 255));
        customergraph.setText("CustomerGraph");
        customergraph.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 255), 2, true));
        customergraph.setFocusable(false);
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
                try {
                    customergraphActionPerformed(evt);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Addbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(graph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(viewcustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addroom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewwarden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewroom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customergraph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(Addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(viewwarden, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(addroom, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewroom, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customergraph, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(graph, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 255, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Owner Section");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(753, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(572, 572, 572))
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

    private void AddbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbuttonActionPerformed
        // TODO add your handling code here:
     awf    = new AddWardonFrame();
       desktoppane.add(awf);
        awf.setVisible(true);
  
     
    }//GEN-LAST:event_AddbuttonActionPerformed

    private void viewwardenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewwardenActionPerformed
        // TODO add your handling code here:
         vwf    = new ViewWardonFrame(); 
         desktoppane.add(vwf);

          vwf.setVisible(true);
     
    }//GEN-LAST:event_viewwardenActionPerformed

    private void addroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addroomActionPerformed
        // TODO add your handling code here:
       arf    = new AddRoomFrame();
       desktoppane.add(arf);
  
        arf.setVisible(true);
 
    }//GEN-LAST:event_addroomActionPerformed

    private void viewcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewcustomerActionPerformed
        // TODO add your handling code here:
        vcf    = new  ViewCustomerFrame();
        desktoppane.add(vcf);
    
        vcf.setVisible(true);
     
    }//GEN-LAST:event_viewcustomerActionPerformed

    private void graphActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException, SQLException {//GEN-FIRST:event_graphActionPerformed
       f=  new  Graph();
         desktoppane.add(f);
       
          f.setVisible(true);
          
          
    }//GEN-LAST:event_graphActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
       Home window = new Home();
       window.frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void AddbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbuttonMouseEntered
        // TODO add your handling code here:
     Addbutton.setBackground(Color.BLACK);
    }//GEN-LAST:event_AddbuttonMouseEntered

    private void viewwardenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewwardenMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_viewwardenMousePressed

    private void AddbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbuttonMouseReleased
        // TODO add your handling code here:
          
    }//GEN-LAST:event_AddbuttonMouseReleased

    private void AddbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbuttonMouseExited
        // TODO add your handling code here:
         Addbutton.setBackground(Color.magenta);
      
    }//GEN-LAST:event_AddbuttonMouseExited

    private void viewroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewroomActionPerformed
        // TODO add your handling code here:
         vrf    = new ViewRoomFrame();
         desktoppane.add(vrf);
    
        vrf.setVisible(true);
      
    }//GEN-LAST:event_viewroomActionPerformed

    private void customergraphActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException, SQLException {//GEN-FIRST:event_customergraphActionPerformed
        // TODO add your handling code here:
        
         c = new Customer();
              desktoppane.add(c);
        
        c.setVisible(true);
       
    }//GEN-LAST:event_customergraphActionPerformed

    private void viewwardenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewwardenMouseEntered
        // TODO add your handling code here:
          viewwarden.setBackground(Color.BLACK);
    }//GEN-LAST:event_viewwardenMouseEntered

    private void viewwardenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewwardenMouseExited
        // TODO add your handling code here:
         viewwarden.setBackground(Color.magenta);
    }//GEN-LAST:event_viewwardenMouseExited

    private void addroomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addroomMouseEntered
        // TODO add your handling code here:
             addroom.setBackground(Color.BLACK);
    }//GEN-LAST:event_addroomMouseEntered

    private void addroomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addroomMouseExited
        // TODO add your handling code here:
          addroom.setBackground(Color.magenta);
    }//GEN-LAST:event_addroomMouseExited

    private void viewroomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewroomMouseEntered
        // TODO add your handling code here:
         viewroom.setBackground(Color.BLACK);
    }//GEN-LAST:event_viewroomMouseEntered

    private void viewroomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewroomMouseExited
        // TODO add your handling code here:
         viewroom.setBackground(Color.magenta);
    }//GEN-LAST:event_viewroomMouseExited

    private void viewcustomerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewcustomerMouseEntered
        // TODO add your handling code here:
         viewcustomer.setBackground(Color.BLACK);
    }//GEN-LAST:event_viewcustomerMouseEntered

    private void viewcustomerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewcustomerMouseExited
        // TODO add your handling code here:
                 viewcustomer.setBackground(Color.magenta);
    }//GEN-LAST:event_viewcustomerMouseExited

    private void customergraphMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customergraphMouseEntered
        // TODO add your handling code here:
           customergraph.setBackground(Color.BLACK);
    }//GEN-LAST:event_customergraphMouseEntered

    private void customergraphMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customergraphMouseExited
        // TODO add your handling code here:
                          customergraph.setBackground(Color.magenta);
    }//GEN-LAST:event_customergraphMouseExited

    private void graphMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graphMouseEntered
        // TODO add your handling code here:
         graph.setBackground(Color.BLACK);
    }//GEN-LAST:event_graphMouseEntered

    private void graphMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graphMouseExited
        // TODO add your handling code here:
        graph.setBackground(Color.magenta);
    }//GEN-LAST:event_graphMouseExited

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
                    new MainFrame().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MainFrame2.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbutton;
    private javax.swing.JButton addroom;
    private javax.swing.JButton customergraph;
    private javax.swing.JDesktopPane desktoppane;
    private javax.swing.JButton graph;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logout;
    private javax.swing.JButton viewcustomer;
    private javax.swing.JButton viewroom;
    private javax.swing.JButton viewwarden;
    // End of variables declaration//GEN-END:variables
}
