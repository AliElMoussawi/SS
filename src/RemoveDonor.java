import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class RemoveDonor extends JFrame {

	private JPanel contentPane;
	private JTextField nametxt;
	private JTextField phonenb;
	static DatabaseConnection db;
	static Statement st;
	static String managerSSN;
	
	 private javax.swing.JLabel Background;
	 private JLabel Background_1;
	 private JButton goback;
	    
	public RemoveDonor(String SSN){
		initComponents();
	        db=new DatabaseConnection();
	        st=db.getDbStatement();
	        managerSSN=SSN;}
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
		name.setBounds(118, 21, 71, 14);
		contentPane.add(name);
		
		nametxt = new JTextField();
		nametxt.setBounds(188, 18, 86, 20);
		contentPane.add(nametxt);
		nametxt.setColumns(10);
		
		phonenb = new JTextField();
		phonenb.setBounds(188, 69, 86, 20);
		contentPane.add(phonenb);
		phonenb.setColumns(10);
		
		JLabel phonenumber = new JLabel("Phone Number :");
		phonenumber.setBounds(83, 72, 95, 14);
		contentPane.add(phonenumber);
		
		JButton deletebutton = new JButton("Delete");
		deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
		});
		deletebutton.setBounds(154, 121, 89, 23);
		contentPane.add(deletebutton);
		
		Background_1 = new JLabel();
		Background_1.setBounds(10, 18, 430, 89);
		contentPane.add(Background_1);
		
		goback = new JButton("go back");
		goback.addActionListener(new ActionListener() {
			 public void actionPerformed(java.awt.event.ActionEvent evt) {
	                backbuttonActionPerformed(evt);
	            }
			});
		goback.setBounds(297, 121, 89, 23);
		contentPane.add(goback);
	}public void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {
	Profile p=new Profile(managerSSN);
	p.setVisible(true);
	
	}
		public void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {
		
			 String name=nametxt.getText();
		        String phonenumber=phonenb.getText();
		        if(phonenumber.equals("") ||name.equals("")){
		        JOptionPane.showMessageDialog(null,"Please fill up all Field.","Alert",JOptionPane.WARNING_MESSAGE);   
		        }
		        
		        else{
		           if(phonenumber.length() !=8){// || pass.length()<4){                                  // name/pass must be grater than 3
		               JOptionPane.showMessageDialog(null,"phone number length is 8 please check your input ","Alert",JOptionPane.WARNING_MESSAGE); 
		           }
		           else  if(phonenumber.length() ==8){
		                try{                                                            //Database exception handelling
                        boolean isDonor= searchA("select * from donor","PHONENUMBER",phonenumber);
                        boolean isName= searchA("select * from buser where PHONENUMBER="+phonenumber,"FullName",name);

                        if(isDonor && isName) {
                        	System.out.println("is a donor");
                        	   String del="DELETE FROM `donor` WHERE `PHONENUMBER`=\""+phonenumber+"\"";
                        	 //  System.out.println(del);
                        	   executeSQLQuery(del);
                        	   
		                	
		                }
                        else {
                        	 JOptionPane.showMessageDialog(null,"check your inputs ","Alert",JOptionPane.WARNING_MESSAGE); 
                        }
		                }
		                catch(Exception e){}
		           }
		
	}}
		 
	    private void executeSQLQuery(String query) throws HeadlessException, SQLException {
	       int n= st.executeUpdate(query);
	           if(n ==1){
	             JOptionPane.showMessageDialog(null," Successful deleted from donor table","Congrats..",JOptionPane.INFORMATION_MESSAGE);
	              
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
            Profile a=new Profile(managerSSN);
           a.setVisible(true);
        }
    });
}}
