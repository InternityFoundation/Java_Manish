import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.Timer;

import java.util.*;
import java.io.*;
public class Home {

	JFrame frame;
	private JLabel label,label1,l1;
	private	JMenu home,about,login,registration,contact,developer_Team;
	private	JMenuItem Home,About_Us,Owner,Warden1,Owner1,Contact,Developer_Team;
	private	JMenuBar mb;
	private  Timer tm;
	private int x=0;
	private String[] list={
			"C:\\Users\\Akash Kumar\\Documents\\NetBeansProjects\\HostelManagement\\src\\folder\\photo1.jpg" ,
			"C:\\Users\\Akash Kumar\\Documents\\NetBeansProjects\\HostelManagement\\src\\folder\\photo2.jpg",
			"C:\\Users\\Akash Kumar\\Documents\\NetBeansProjects\\HostelManagement\\src\\folder\\photo3.jpg",
			"C:\\Users\\Akash Kumar\\Documents\\NetBeansProjects\\HostelManagement\\src\\folder\\photo4.jpg",
			"C:\\Users\\Akash Kumar\\Documents\\NetBeansProjects\\HostelManagement\\src\\folder\\photo5.jpg",
			"C:\\Users\\Akash Kumar\\Documents\\NetBeansProjects\\HostelManagement\\src\\folder\\photo6.jpg"
	};
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		  EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home() {
		  initialize();
	}
   
	private void SetImageSize(int i){  
          ImageIcon icon =new ImageIcon(list[i]); 
          Image img=icon.getImage();
          Image newImg=img.getScaledInstance(l1.getWidth(),l1.getHeight(),Image.SCALE_SMOOTH);
          ImageIcon  newImc=new ImageIcon(newImg); 
          l1.setIcon(newImc);  
        }
        
        private void SetImageSizec(JLabel l,String st){  
          ImageIcon icon =new ImageIcon(st); 
          Image img=icon.getImage();
          Image newImg=img.getScaledInstance(l.getWidth(),l.getHeight(),Image.SCALE_SMOOTH);
          ImageIcon  newImc=new ImageIcon(newImg); 
          l.setIcon(newImc);  
        }
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		   frame = new JFrame(); frame.getContentPane().setBackground(Color.orange);
		   frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  
		   frame.getContentPane().setLayout(null);
		
		
		    UIManager.put("Menu.selectionBackground",
	             new javax.swing.plaf.ColorUIResource(Color.green)); 
		    UIManager.put("MenuItem.selectionBackground",
	             new javax.swing.plaf.ColorUIResource(Color.pink));    
		    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); 
		    
		 
		    label=new JLabel(); 
		    label.setBounds(0,0,screenSize.width,100);   
		  //  label.setIcon(new ImageIcon("C:\\Users\\user\\.nbi\\Documents\\NetBeansProjects\\HostelManagement\\src\\folder\\images.jpg")); 
                 //  SetImageSizec(label,"images.jpg");
		    SetImageSizec(label,"C:\\Users\\Akash Kumar\\Documents\\NetBeansProjects\\HostelManagement\\src\\folder\\images.jpg");
		    mb=new JMenuBar();
		    mb.setBounds(0, 100, screenSize.width, 50);
		    mb.setBackground(Color.RED); 
		    
		    
		    home=new JMenu("       Home       ");
		    about=new JMenu("       About       ");
		    login=new JMenu("       Login       ");
		    registration=new JMenu("       Registration       ");
		    contact=new JMenu("       Contact       ");
		    developer_Team=new JMenu("        DeveloperTeam        ");
		    
		    
		    home.setFont(new Font("Cooper",Font.BOLD,20));   home.setForeground(Color.WHITE);
		    about.setFont(new Font("Cooper",Font.BOLD,20));   about.setForeground(Color.WHITE);
		    login.setFont(new Font("Cooper",Font.BOLD,20));     login.setForeground(Color.WHITE);
		    registration.setFont(new Font("Cooper",Font.BOLD,20));   registration.setForeground(Color.WHITE);
		    contact.setFont(new Font("Cooper",Font.BOLD,20));         contact.setForeground(Color.WHITE);
		    developer_Team.setFont(new Font("Cooper",Font.BOLD,20));    developer_Team.setForeground(Color.WHITE);
		      
		    
		    
		    
		    Home=new JMenuItem("            Home      "); 
		    About_Us=new JMenuItem("             About_Us      ");  
		    Owner=new JMenuItem(" Owner Login"); 
		    Warden1=new JMenuItem(" Warden Login");
		    Owner1=new JMenuItem("  Owner  Signup ");
		    Contact=new JMenuItem("                 Contact  ");  
		    Developer_Team=new JMenuItem("                        Developer_Team  ");    
		   
		    Home.setPreferredSize(new Dimension(150, 30));
		    About_Us.setPreferredSize(new Dimension(150, 30));
		    Owner.setPreferredSize(new Dimension(145, 30));
		    Warden1.setPreferredSize(new Dimension(145, 30));
		    Owner1.setPreferredSize(new Dimension(210, 30));
		    Contact.setPreferredSize(new Dimension(170, 30));
		    Developer_Team.setPreferredSize(new Dimension(255, 30));
                    
                    Owner.addActionListener(new ActionListener(){
                               public void actionPerformed(ActionEvent e){      
                                   new OwnerLogin().setVisible(true);
                                               }
                            });   
                    
                       Owner1.addActionListener(new ActionListener(){
                               public void actionPerformed(ActionEvent e){      
                                   new OwnerSignUp().setVisible(true);
                                               }
                            });   
                    
                     Warden1.addActionListener(new ActionListener(){
                               public void actionPerformed(ActionEvent e){      
                                   WardonLogin r=new WardonLogin();
                                   r.setVisible(true);
                                    r.pack();
                                 r.setLocationRelativeTo(null);              }
                            }); 
                     
                       About_Us.addActionListener(new ActionListener(){
                               public void actionPerformed(ActionEvent e){      
                                   
                                               }
                            });   
                          Developer_Team.addActionListener(new ActionListener(){
                               public void actionPerformed(ActionEvent e){      
                               new developer1().setVisible(true);
                                               }
                            });   
                            Contact.addActionListener(new ActionListener(){
                               public void actionPerformed(ActionEvent e){      
   new Contact().setVisible(true); 
                                               }
                            });   
		    
		    home.add(Home); 
		    about.add(About_Us);  
		    login.add(Owner);  
		    login.add(Warden1); 
		    registration.add(Owner1); 
		    contact.add(Contact);  
		    developer_Team.add(Developer_Team);     
		    mb.add(home);
		    mb.add(about);
		    mb.add(login);
		    mb.add(registration);
		    mb.add(contact);
		    mb.add(developer_Team);
	
		    
		    label1=new JLabel("PROPERTY  MANAGEMENT  SYSTEM",JLabel.CENTER); 
		    label1.setBounds(0,180,screenSize.width,100);
		    label1.setFont(new Font("Cooper",Font.BOLD,40));
		    
		   
		    l1=new JLabel(); 
		    l1.setBounds(5,280,screenSize.width-10,screenSize.height-310);  
                     l1.setIcon(new ImageIcon("D:\\Pictures\\Wallpapers\\1234.jpg")); 
		//    l1.setIcon(new ImageIcon("D:\\Pictures\\Wallpapers\\1234.jpg")); 
		    SetImageSize(3);
		    
		   
			tm=new Timer(1000,new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
				       SetImageSize(x);       
					
				          x+=1;
				          if(x>list.length-1)
				             x=0;
				          
				}
			});
			tm.start();
		    
		    frame.add(label);
	        frame.add(mb);   
	        frame.add(label1);  
	        frame.add(l1);
		      
	}
}
