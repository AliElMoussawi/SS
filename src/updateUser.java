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
public class updateUser extends JFrame {

	private JPanel contentPane;
	private JTextField phonenb;
	static CustomDatabaseConnection db;
	static Statement st;
	 private JTextField USERID;
	 private JLabel userid;
	 private JButton goback;
	 static Connection con;
	 static String managerSSN;
	 private JTextField addresstxt;
	 private JTextField agetxt;
	 private JTextField diagnosistxt;
	 private JTextField medicinestxt;
	public updateUser(String SSN){
		initComponents();
		  
		 db=new CustomDatabaseConnection("systematic_squad");
	        con=db.getdbConnection();
	        managerSSN=SSN;
	         st=db.getDbStatement();
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
		
		phonenb = new JTextField();
		phonenb.setBounds(312, 20, 86, 23);
		contentPane.add(phonenb);
		phonenb.setColumns(10);
		
		JLabel phonenumber = new JLabel("Phone Number :");
		phonenumber.setBounds(209, 24, 109, 14);
		contentPane.add(phonenumber);
		
		JButton updatebutton = new JButton("update");
		updatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
		});
		
		updatebutton.setBounds(293, 179, 89, 23);
		contentPane.add(updatebutton);
		
		goback = new JButton("go back");
		goback.addActionListener(new ActionListener() {
			 public void actionPerformed(java.awt.event.ActionEvent evt) {
	                backbuttonActionPerformed(evt);
	            }
			});
		goback.setBounds(293, 214, 89, 23);
		contentPane.add(goback);
		USERID = new JTextField();
		USERID.setColumns(10);
		USERID.setBounds(113, 21, 86, 23);
		contentPane.add(USERID);
		
		userid = new JLabel("User id:");
		userid.setBounds(35, 24, 66, 14);
		contentPane.add(userid);
		
		JLabel diagnosis = new JLabel("diagnosis");
		diagnosis.setBounds(35, 137, 64, 14);
		contentPane.add(diagnosis);
		
		addresstxt = new JTextField();
		addresstxt.setBounds(113, 67, 86, 25);
		contentPane.add(addresstxt);
		addresstxt.setColumns(10);
		
		JLabel address = new JLabel("Address");
		address.setBounds(35, 72, 64, 14);
		contentPane.add(address);
		
		JLabel medicines = new JLabel("Medicines");
		medicines.setBounds(35, 203, 64, 14);
		contentPane.add(medicines);
		
		JLabel age = new JLabel("age");
		age.setBounds(284, 75, 46, 14);
		contentPane.add(age);
		
		agetxt = new JTextField();
		agetxt.setBounds(350, 67, 48, 25);
		contentPane.add(agetxt);
		agetxt.setColumns(10);
		
		diagnosistxt = new JTextField();
		diagnosistxt.setBounds(113, 137, 86, 25);
		contentPane.add(diagnosistxt);
		diagnosistxt.setColumns(10);
		
		medicinestxt = new JTextField();
		medicinestxt.setBounds(113, 195, 86, 25);
		contentPane.add(medicinestxt);
		medicinestxt.setColumns(10);
	}
public void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {
	Profile p=new Profile(managerSSN);
	p.setVisible(true);
	
	}
	
		public void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {
			   String age =agetxt.getText();
			 
		        String phonenumber=phonenb.getText();
		        String user=USERID.getText();
		        if(phonenumber.equals("")|| user.equals("")){
		        JOptionPane.showMessageDialog(null,"Please fill up all Field.","Alert",JOptionPane.WARNING_MESSAGE);   
		        }
		        
		        else{
		           if(phonenumber.length() !=8 || user.length() !=11){// || pass.length()<4){                                  // name/pass must be grater than 3
		               JOptionPane.showMessageDialog(null,"phone number length is 8 please check your input ","Alert",JOptionPane.WARNING_MESSAGE); 
		           }
		           else  if(phonenumber.length() ==8){
		                try{                                                            //Database exception handelling
                       
                        boolean isUse= searchA("select * from buser","PHONENUMBER",phonenumber);
                        if(isUse) {
                 	
                        	System.out.println("is a user");
                        	  if(!age.equals("")){
                        		  System.out.print("age:"+age +"\n userid:"+user);
                        		PreparedStatement st = con.prepareStatement("UPDATE buser SET AGE = ? WHERE USERID= ?");
                 	st.setString(1, age);
                 	st.setString(2,user);
                 	st.execute();
   	                 JOptionPane.showMessageDialog(null," AGE IS UPDATED","Congrats..",JOptionPane.INFORMATION_MESSAGE);
                    
	            }  
                        	  
                        	 
                        		if(!addresstxt.getText().equals("")){  
                        
                   		PreparedStatement st = con.prepareStatement("UPDATE buser SET ADDRESS = ? WHERE USERID= ?");
                     	st.setString(1, addresstxt.getText());
                     	st.setString(2,user);
                     	st.execute();
       	             JOptionPane.showMessageDialog(null," ADDRESS IS UPDATED","Congrats..",JOptionPane.INFORMATION_MESSAGE);
                        
    	            }  
                        	  if(! diagnosistxt.getText().equals("")){
                     		//  UPDATE  ="UPDATE MEDICALRECORDS SET DIAGNOSIS= "+ diagnosistxt.getText()+" WHERE USERID="+user;
                     		 
                                 
                            		PreparedStatement st = con.prepareStatement("UPDATE MEDICALRECORDS SET DIAGNOSIS= ? WHERE MRUSERID= ?");
                              	st.setString(1, addresstxt.getText());
                              	st.setString(2,user);
                              	st.execute();
                	             JOptionPane.showMessageDialog(null," ADDRESS IS UPDATED","Congrats..",JOptionPane.INFORMATION_MESSAGE);
                                 
             	            }
                        	  if(! medicinestxt.getText().equals("")){
                           		//  UPDATE  ="UPDATE MEDICALRECORDS SET DIAGNOSIS= "+ diagnosistxt.getText()+" WHERE USERID="+user;
                           		 
                                       
                                  		PreparedStatement st = con.prepareStatement("UPDATE MEDICALRECORDS SET MEDICATION= ? WHERE MRUSERID= ?");
                                    	st.setString(1, medicinestxt.getText());
                                    	st.setString(2,user);
                                    	st.execute();
                      	             JOptionPane.showMessageDialog(null," ADDRESS IS UPDATED","Congrats..",JOptionPane.INFORMATION_MESSAGE);
                                       
                   	            }
		                }
                        else {
                        	System.out.println("this id does not exist");
                        	 JOptionPane.showMessageDialog(null,"check your inputs ","Alert",JOptionPane.WARNING_MESSAGE); 
                        }
		                }
		                catch(Exception e){}
		           }
		
	}}
		 
		 
	    @SuppressWarnings("unused")
		private void executeSQLQuery(String query) throws HeadlessException, SQLException {
	       System.out.println("updating");
	    	int n =0;
	    	  try {n=st.executeUpdate(query+";");
	    		    //st.executeUpdate(dropPersons);
	    		  } catch (final Exception ignored) {
	    			  System.out.println(ignored);
	    		  }

	    	System.out.println(n);
	           if(n ==1){
	        	 System.out.println("update is done");
	             JOptionPane.showMessageDialog(null," Successful updates from donor table","Congrats..",JOptionPane.INFORMATION_MESSAGE);
	              
	           }else{
	        	   System.out.println("failed to update");
	              // JOptionPane.showMessageDialog(null,"Unsuccessful deletion","Sorry!",JOptionPane.WARNING_MESSAGE); 
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
		updateUser a =new updateUser(managerSSN);
           a.setVisible(true);
        }
    });
}
}