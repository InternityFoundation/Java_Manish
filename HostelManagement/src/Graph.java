
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.*;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Graph  extends javax.swing.JInternalFrame{
    
      String Driver = "com.mysql.jdbc.Driver";
           String url2 = "jdbc:mysql://localhost/Hostel";

	    String uName ="root";
	    String pwd = "";
              int row=0;
    ArrayList<Graphdata> data=new ArrayList<>();
    
    Graph() throws ClassNotFoundException, SQLException{
     
		setSize(1280,806);
    
                
           Class.forName(Driver); //Register JDBC Driver

	          System.out.println("Creating a connection...");
	       Connection   conn = DriverManager.getConnection(url2, uName,pwd); //Open a connection
               
               Statement stmt=conn.createStatement();  
               ResultSet rs=stmt.executeQuery("select * from feegraph"); 
               Statement stmt2=conn.createStatement(); 
                 ResultSet rs2=stmt2.executeQuery("select * from feegraph");
                   while (rs2.next()) {

                               row++;
                              
                            }
           
                   DefaultCategoryDataset dataset=new DefaultCategoryDataset();

            
           
            while(rs.next()){
            
           //   rs.absolute(i);
            Graphdata graph=new Graphdata(rs.getString(1),rs.getString(2));
            data.add(graph);
            
            }
            Collections.reverse(data);
            
            ArrayList<Graphdata> arr=new ArrayList<>();
            
     
        
        int e=0;
         for(Graphdata obj:data)      
         {
             e++;
             if(e>7)
            {
              
             }else{
          
                 arr.add(obj);
                
             
             }
             
             Collections.reverse(arr);
             
             for(Graphdata obj1:arr)      
             {
              dataset.addValue(Integer.parseInt(obj1.getSum()),"graph",obj1.getDate().substring(0,2) );
            }
             
             
            
            
    }      
	//	dataset.executeQuery(query);
		JFreeChart chart = ChartFactory.createLineChart("Name-Age Graph", "Date->", "Ammount->",
				dataset, PlotOrientation.VERTICAL, true, true, false);
		ChartPanel chartPanel = new ChartPanel(chart);
     
	//	chartPanel.setBounds(200,200, 200, 100);
		  chartPanel.setPreferredSize(new java.awt.Dimension(50, 50));
	    
		setContentPane(chartPanel);
	    
                 setLayout(null);
               
                 


    }
    
   
    
    
}
