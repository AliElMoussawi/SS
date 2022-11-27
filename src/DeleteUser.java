import java.awt.HeadlessException;
import java.awt.event.ActionListener;

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

@SuppressWarnings("serial")
public class DeleteUser extends JFrame {

	private JPanel contentPane;
	private JTextField nametxt;
	private JTextField phonenb;
	static CustomDatabaseConnection db;
	static Statement st;
	
	 private javax.swing.JLabel Background;
	 private JTextField USERID;
	 private JLabel name_1;
	 private JButton goback;
	 static String managerSSN;
	  static Connection con;
	public DeleteUser(String SSN){
		initComponents();
		 db=new CustomDatabaseConnection("systematic_squad");
	        managerSSN=SSN;
	        st=db.getDbStatement();
	        con=db.getdbConnection();
	        
	}
	/**
	 * Launch the application.
	 */


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

		
		JLabel name = new JLabel("Full Name:");
		name.setBounds(51, 21, 71, 14);
		contentPane.add(name);
		
		nametxt = new JTextField();
		nametxt.setBounds(113, 18, 86, 20);
		contentPane.add(nametxt);
		nametxt.setColumns(10);
		
		phonenb = new JTextField();
		phonenb.setBounds(113, 69, 86, 20);
		contentPane.add(phonenb);
		phonenb.setColumns(10);
		
		JLabel phonenumber = new JLabel("Phone Number :");
		phonenumber.setBounds(30, 72, 95, 14);
		contentPane.add(phonenumber);
		
		JButton deletebutton = new JButton("Delete");
		deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
		});
		
		deletebutton.setBounds(248, 68, 89, 23);
		contentPane.add(deletebutton);
		
		goback = new JButton("go back");
		goback.addActionListener(new ActionListener() {
			 public void actionPerformed(java.awt.event.ActionEvent evt) {
	                backbuttonActionPerformed(evt);
	            }
			});
		goback.setBounds(248, 138, 89, 23);
		contentPane.add(goback);
		USERID = new JTextField();
		USERID.setColumns(10);
		USERID.setBounds(113, 114, 86, 20);
		contentPane.add(USERID);
		
		name_1 = new JLabel("User id:");
		name_1.setBounds(67, 117, 48, 14);
		contentPane.add(name_1);
	}
public void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {
	Profile p=new Profile(managerSSN);
	p.setVisible(true);
	
	}
	
		public void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {
		
			 String name=nametxt.getText();
		        String phonenumber=phonenb.getText();
		        String user=USERID.getText();
		        if(phonenumber.equals("") ||name.equals("")|| user.equals("")){
		        JOptionPane.showMessageDialog(null,"Please fill up all Field.","Alert",JOptionPane.WARNING_MESSAGE);   
		        }
		        
		        else{
		           if(phonenumber.length() !=8 || user.length() !=11){// || pass.length()<4){                                  // name/pass must be grater than 3
		               JOptionPane.showMessageDialog(null,"phone number length is 8 please check your input ","Alert",JOptionPane.WARNING_MESSAGE); 
		           }
		           else  if(phonenumber.length() ==8){
		                try{                                                            //Database exception handelling
		                	System.out.println(1);
                        boolean isUse= searchA("select * from buser where PHONENUMBER = "+phonenumber,"FullName",name);
                    	System.out.println(isUse);
                        if(isUse) {
                        System.out.println("this user exist");
                               PreparedStatement st = con.prepareStatement("Delete from buser where PHONENUMBER = ?");
                              	st.setString(1, phonenumber);
                              	st.execute();
                	             JOptionPane.showMessageDialog(null," Successful deleted from requests table","Congrats..",JOptionPane.INFORMATION_MESSAGE);
                                 
         		            }
                       else {
                        	System.out.println("check the input user not exist");
                        	 JOptionPane.showMessageDialog(null,"check your inputs ","Alert",JOptionPane.WARNING_MESSAGE); 
                        }
		                
		              
	}catch (final Exception ignored) {
		  System.out.println(ignored);
	  }}}}
		 
	    @SuppressWarnings("unused")
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
	             JOptionPane.showMessageDialog(null," Successful deleted from donor table","Congrats..",JOptionPane.INFORMATION_MESSAGE);
	              
	           }else{
	        	   System.out.println("failed to delete ");
	              // JOptionPane.showMessageDialog(null,"Unsuccessful deletion","Sorry!",JOptionPane.WARNING_MESSAGE); 
	           }
	           }
	   
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
			DeleteUser a =new DeleteUser(managerSSN);
           a.setVisible(true);
        }
    });
}
}