import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

@SuppressWarnings({ "serial", "unused" })
public class RemoveRequest extends JFrame {

	private JPanel contentPane;
	private JTextField reqiD;
	private JTextField phonenb;
	static CustomDatabaseConnection db;
	static Statement st;
	static String SSN;
	static Connection con;
	
	 private javax.swing.JLabel Background;
	 private JLabel Background_1;
	    
	public RemoveRequest(String SS){
		initComponents();
	        db=new CustomDatabaseConnection("systematic_squad");
	        con=db.getdbConnection();
	        SSN=SS;
	        st=db.getDbStatement();
	     
	}
	/**
	 * Create the frame.
	 */
	public void initComponents() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Background = new javax.swing.JLabel();
		 Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/s006_LightBlue.jpg"))); // NOI18N
	        getContentPane().add(Background);
	        Background.setBounds(0, 172, 440, 89);

		
		JLabel name = new JLabel("Request ID:");
		name.setBounds(118, 21, 71, 14);
		contentPane.add(name);
		
		reqiD = new JTextField();
		reqiD.setBounds(188, 18, 86, 20);
		contentPane.add(reqiD);
		reqiD.setColumns(10);
		
		phonenb = new JTextField();
		phonenb.setBounds(188, 69, 86, 20);
		contentPane.add(phonenb);
		phonenb.setColumns(10);
		
		JLabel phonenumber = new JLabel("Phone Number :");
		phonenumber.setBounds(94, 72, 95, 14);
		contentPane.add(phonenumber);
		
		JButton deletebutton = new JButton("Delete");
		deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
		});
		deletebutton.setBounds(118, 121, 89, 23);
		contentPane.add(deletebutton);
		
		Background_1 = new JLabel();
		Background_1.setBounds(10, 18, 430, 89);
		contentPane.add(Background_1);
		
		JButton goback = new JButton("bo back");
		goback.addActionListener(new ActionListener() {
			 public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
			}
		});
		goback.setBounds(238, 121, 89, 23);
		contentPane.add(goback);
	}

public void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {

	Profile p=new Profile(SSN);
	p.setVisible(true);
	close();
	
	}  
public void close(){           // for closing background window  use this function and then dispose class
        WindowEvent winclose=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winclose);
    }
		public void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {
		
			 String reqid=reqiD.getText();
		        String phonenumber=phonenb.getText();
		        if(phonenumber.equals("") ||reqid.equals("")){
		        JOptionPane.showMessageDialog(null,"Please fill up all Field.","Alert",JOptionPane.WARNING_MESSAGE);   
		        }
		        
		        else{
		           if(phonenumber.length() !=8){// || pass.length()<4){                                  // name/pass must be grater than 3
		               JOptionPane.showMessageDialog(null,"phone number length is 8 please check your input ","Alert",JOptionPane.WARNING_MESSAGE); 
		           }
		           else  if(phonenumber.length() ==8){
		                try{                                                            //Database exception handelling
                        boolean Request= searchA("select * from request","REQID",reqid);
                        System.out.println("req:"+Request);
                        boolean phreq= searchA("select * from request","PHONENUMBER",phonenumber);
                        System.out.println("phonenb=:"+phreq);
                        if(Request && phreq) {
                        	System.out.println("this req exist");
                        	System.out.println("req:"+ reqid);
                     	PreparedStatement st = con.prepareStatement("delete from request where reqid = ?");
                     	st.setString(1, reqid);
                     	st.execute();
       	             JOptionPane.showMessageDialog(null," Successful deleted from requests table","Congrats..",JOptionPane.INFORMATION_MESSAGE);
                        
		            }
                        
                        else {
                        	 JOptionPane.showMessageDialog(null,"check your inputs ","Alert",JOptionPane.WARNING_MESSAGE); 
                        }
		                }
		                catch(Exception e){}
		           }
		
	}}
		 
	    private void executeSQLQuery(String query) throws HeadlessException, SQLException {
	       System.out.println("deleting");
	    	int n =0;
	    	  try {n=st.executeUpdate(query+";");
	    		    //st.executeUpdate(dropPersons);
	    		  } catch (final Exception ignored) {
	    			  System.out.println(ignored);
	    		  }

	    	System.out.println(n);
	           if(n ==1){
	        	 System.out.println("deletion is done");
	             JOptionPane.showMessageDialog(null," Successful deleted from requests table","Congrats..",JOptionPane.INFORMATION_MESSAGE);
	              
	           }else{
	        	   System.out.println("failed to delete ");
	          JOptionPane.showMessageDialog(null,"Unsuccessful deletion","Sorry!",JOptionPane.WARNING_MESSAGE); 
	           }
	           }
	     //  catch(Exception e) {}}
	public boolean searchA(String query,String column,String s) throws SQLException {
		 Statement st=db.getDbStatement();
		ResultSet rs=st.executeQuery(query);           // Searching result        
	    while(rs.next()){
	      String s1=rs.getString(column);
	      
	    //  String s2=rs.getString("");
	       if(s1.equals(s)){System.out.println(s1+"");
	      	 return true;}
	    
	}   return false;}
	

	public static void main(String args[]) {
	    
	    try {
	        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	            if ("Nimbus".equals(info.getName())) {
	                javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                break;
	            }
	        }
	    } catch (ClassNotFoundException ex) {
	        java.util.logging.Logger.getLogger(manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (InstantiationException ex) {
	        java.util.logging.Logger.getLogger(manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (IllegalAccessException ex) {
	        java.util.logging.Logger.getLogger(manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	        java.util.logging.Logger.getLogger(manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    }
	    //</editor-fold>

	    /* Create and display the form */
	    java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
	            //Profile a=new Profile(managerSSN);
				 RemoveRequest a =new RemoveRequest(SSN);
	           a.setVisible(true);
	        }
	    });
	}
	}
