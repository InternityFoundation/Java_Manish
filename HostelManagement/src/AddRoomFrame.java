
import java.awt.Component;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class AddRoomFrame extends javax.swing.JInternalFrame {

    int oldid;
    private Component f;

    /**
     * Creates new form AddRoomFrame
     */
    public AddRoomFrame() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        cancel = new javax.swing.JButton();
        addnow = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        fans = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        bed_id = new javax.swing.JComboBox();
        sharing = new javax.swing.JComboBox();
        floorno = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        roomtype = new javax.swing.JComboBox();

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Add Room");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(524, 524, 524))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        cancel.setBackground(new java.awt.Color(192, 57, 43));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        addnow.setBackground(new java.awt.Color(34, 167, 240));
        addnow.setText("Add Now");
        addnow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnowActionPerformed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(236, 240, 241));
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Sharing:");

        jLabel15.setBackground(new java.awt.Color(236, 240, 241));
        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Room Type:");

        jLabel16.setBackground(new java.awt.Color(236, 240, 241));
        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("No of Beds:");

        fans.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        fans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fansActionPerformed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(236, 240, 241));
        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("No Of Fans:");

        bed_id.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        bed_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bed_idActionPerformed(evt);
            }
        });

        sharing.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sharing", "Non Sharing" }));
        sharing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sharingActionPerformed(evt);
            }
        });

        floorno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6" }));
        floorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floornoActionPerformed(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(236, 240, 241));
        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Floor No:");

        roomtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "NonAC" }));
        roomtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomtypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(13, 488, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(101, 101, 101)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roomtype, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(floorno, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sharing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bed_id, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fans, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(464, 464, 464))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(643, 643, 643))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addnow, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(537, 537, 537))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(210, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(floorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(42, 42, 42)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sharing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(39, 39, 39)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bed_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(fans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(addnow, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cancelActionPerformed

    private void addnowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnowActionPerformed

        String Driver = "com.mysql.jdbc.Driver";

        String url2 = "jdbc:mysql://localhost/Hostel";
        String roomid = "R100";
        String newid = null;
        String uName = "root";
        String pwd = "manish13595";

        boolean cd = false;
        boolean ef = false;
        boolean table = false;

        int j;

        //alse created table
        try {
            Class.forName(Driver); //Register JDBC Driver

            System.out.println("Creating for table...");
            Connection conn = DriverManager.getConnection(url2, uName, pwd); //Open a connection

            DatabaseMetaData dbm = conn.getMetaData();
            ResultSet tables = dbm.getTables(null, null, "roomdetail", null);
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

                Class.forName(Driver); //Register JDBC Driver

                System.out.println("Creating a table...");
                Connection con = DriverManager.getConnection(url2, uName, pwd); //Open a connection

                Statement stmt = con.createStatement();
                String sql = "create table roomdetail(roomid varchar(25),floorno varchar(10),roomtype varchar(25),sharing varchar(25),bed_Id varchar(25),fans varchar(25))";
                stmt.executeUpdate(sql);
                ef = true;
                table = true;
                System.out.println("CreateTable sucessfully");
            } catch (Exception e) {
                System.out.println("table creation failed");
                e.printStackTrace();
            }
        }
        //for insert data
        if (ef == true) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url2, uName, pwd); //Open a connection
                PreparedStatement ps = conn.prepareStatement("select * from roomdetail");
                ResultSet rs = ps.executeQuery();
                //first time is not run.its runs second time
                while (rs.next()) {
                    roomid = rs.getString(1);
                    System.out.println(roomid + "this is current id");

                }

                //only first time run when table created firstly
                if (roomid.equals("R100")) {
                    oldid = Integer.parseInt(roomid.substring(1, 4));
                    newid = "R" + String.valueOf(++oldid);
                } else {
                    oldid = Integer.parseInt(roomid.substring(1, 4));
                    newid = "R" + String.valueOf(++oldid);
                }
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                Class.forName(Driver); //Register JDBC Driver
                Connection con = DriverManager.getConnection(url2, uName, pwd); //Open a connection

                String data5 = (String) bed_id.getItemAt(bed_id.getSelectedIndex());
                int bed = Integer.parseInt(data5);
                String id;
                String data2 = (String) floorno.getItemAt(floorno.getSelectedIndex());
                String data3 = (String) roomtype.getItemAt(roomtype.getSelectedIndex());
                String data4 = (String) sharing.getItemAt(sharing.getSelectedIndex());
                String data6 = (String) fans.getItemAt(fans.getSelectedIndex());
                PreparedStatement s = con.prepareStatement("insert into roomdetail values(?,?,?,?,?,?)");
                for (j = 1; j <= bed; j++) {

                    s.setString(1, newid);

                    s.setString(2, data2);

                    s.setString(3, data3);

                    s.setString(4, data4);

                    data5 = "B" + j;

                    s.setString(5, data5);

                    s.setString(6, data6);

                    int i = s.executeUpdate();
                }

                JOptionPane.showMessageDialog(f, " insert Successfully ");

                System.out.println(j + " record inserted");

                con.close();
            } catch (Exception e) {
                System.out.println("record creation failed");
                JOptionPane.showMessageDialog(f, "insert unsuccessfully!", "Alert", JOptionPane.WARNING_MESSAGE);
                e.printStackTrace();
            }

        }

    }//GEN-LAST:event_addnowActionPerformed

    private void fansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fansActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fansActionPerformed

    private void bed_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bed_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bed_idActionPerformed

    private void sharingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sharingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sharingActionPerformed

    private void floornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floornoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_floornoActionPerformed

    private void roomtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomtypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addnow;
    private javax.swing.JComboBox bed_id;
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox fans;
    private javax.swing.JComboBox floorno;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JComboBox roomtype;
    private javax.swing.JComboBox sharing;
    // End of variables declaration//GEN-END:variables
}
