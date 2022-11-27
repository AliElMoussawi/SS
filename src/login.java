import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


@SuppressWarnings({ "unused", "serial" })
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    DatabaseConnection db;
    
    public login() {
        db=new DatabaseConnection();
        initComponents();
        this.setLocationRelativeTo(null);
    }                         
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        staffp = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        SSNtxt = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        requestp = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        reqIDtxt = new javax.swing.JTextField();
        
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(832, 600));
        setUndecorated(true);
        getContentPane().setLayout(null);

       jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/turn-off.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(735, 20, 90, 50);

        staffp.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Log In", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        staffp.setToolTipText("");
        staffp.setOpaque(false);
        staffp.setLayout(null);

      jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/avatar (1).png"))); // NOI18N
        staffp.add(jLabel1);
        jLabel1.setBounds(20, 20, 40, 90);

        jSeparator1.setForeground(new java.awt.Color(51, 0, 51));
        staffp.add(jSeparator1);
        jSeparator1.setBounds(60, 80, 189, 20);

        jButton3.setBackground(new java.awt.Color(204, 0, 255));
      jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        staffp.add(jButton3);
        jButton3.setBounds(50, 121, 69, 42);

        SSNtxt.setBackground(new java.awt.Color(178, 215, 255));
        SSNtxt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SSNtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SSNtxt.setBorder(null);
        SSNtxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        staffp.add(SSNtxt);
        SSNtxt.setBounds(60, 50, 190, 30);

        jButton5.setBackground(new java.awt.Color(255, 102, 100));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/in.png"))); // NOI18N
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        staffp.add(jButton5);
        jButton5.setBounds(168, 121, 81, 42);

        getContentPane().add(staffp);
        staffp.setBounds(266, 205, 284, 187);

        requestp.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "request", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        requestp.setOpaque(false);
        requestp.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Request ID       :");
        requestp.add(jLabel4);
        jLabel4.setBounds(20, 50, 127, 25);

       

        reqIDtxt.setBackground(new java.awt.Color(178, 215, 255));
        reqIDtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        requestp.add(reqIDtxt);
        reqIDtxt.setBounds(160, 50, 161, 30);

        jButton6.setBackground(new java.awt.Color(255, 102, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/in.png"))); // NOI18N
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        requestp.add(jButton6);
        jButton6.setBounds(205, 123, 92, 47);

        getContentPane().add(requestp);
        requestp.setBounds(796, 216, -12, 187);
        jButton4 = new javax.swing.JButton();
        jButton4.setBounds(57, 123, 90, 47);
        requestp.add(jButton4);
        
   
        
         jButton4.setBackground(new java.awt.Color(204, 110, 255));
       jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
         jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
         jButton4.setContentAreaFilled(false);
         jButton4.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton4ActionPerformed(evt);
                    }
                });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Systematic Squad ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(355, 20, 154, 35);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        jLabel8.setText("Blood Donor Management System");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(200, 70, 530, 27);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 840, 640);

       jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 840, 120);

      jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(770, 0, 70, 580);

    jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 560, 800, 532);

    jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(730, 550, 110, 70);

      jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(800, -6, 800, 110);

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        System.exit(0);
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        SSNtxt.setText(null);
      
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	reqIDtxt.setText(null);
        
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       String requestID=reqIDtxt.getText();
       if(requestID.length()<1){
    	   JOptionPane.showMessageDialog(null," please fill in the blank","Alert",JOptionPane.WARNING_MESSAGE); 
       }
              boolean check=false;
               
               try{                                                           

            	   Statement st=db.getDbStatement();
                   ResultSet rs=st.executeQuery("select *from request");           // Searching result
  
                       while(rs.next()){
                    	   String s1=rs.getString("REQID");
                           
                           if(s1.equals(requestID)){
                               check=true;
                           }
                       }
  
                   }catch(Exception e){
   
                   }
               
               if(check){
            	  requestCHECK req=new requestCHECK();
                   req.setVisible(true);            	   
                   SSNtxt.setText(null);
               }
               
              else{
               JOptionPane.showMessageDialog(null,"Check request ID field.","Alert",JOptionPane.WARNING_MESSAGE);
           }
        
       
    }                                        

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String SSN=SSNtxt.getText();
       // String Name=passtxt.getText();
        if(SSN.equals("") ){//|| pass.equals("")){        //No field can be empty
            JOptionPane.showMessageDialog(null,"Please fill up all Field.","Alert",JOptionPane.WARNING_MESSAGE);   
        }
        
        else{
           if(SSN.length()<4){// || pass.length()<4){                                  // name/pass must be grater than 3
               JOptionPane.showMessageDialog(null,"Username/Password length must be grater then 3!","Alert",JOptionPane.WARNING_MESSAGE); 
           }
           else{
                boolean check=false;
                try{                                                            //Database exception handelling

                 Statement st=db.getDbStatement();
                 ResultSet rs=st.executeQuery("select * from MedicalStaff");           // Searching result        
                  while(rs.next() && check==false){
                    String s1=rs.getString("SSN");
                  //  String s2=rs.getString("");
                     if(s1.equals(SSN)){// && s2.equals(pass)){
                       System.out.println("ssn is a medicalstaff:"+true);
                    	 check=true;}
                  if(check) {
                	  System.out.println("check:" + check);
                    		
                    		 boolean manager= searchA("select * from bloodbankmanager","SSN",SSN);
                    		 
                    		  if(manager) {
                    			  
                    			   manager M=new manager(SSN);
                                   M.setVisible(true);   
                                  System.out.println("ssn is Manager:"+true );
                                close();
                    		  }
                    		  else if(!manager) {
                    			  boolean doctor = searchA("select *from Doctor ","SSN",SSN);
                        		  if(doctor) {
                        			  Doctor D=new Doctor();
                                      D.setVisible(true);   
                                      System.out.print("ssn is Doctor:"+true );
                        		  }else if(!doctor ) {
                        			  boolean nurse=searchA("select *from Nurse","SSN",SSN);
                            		  
                            		  if(nurse) {
                            			  Nurse N=new Nurse();
                                          N.setVisible(true);  
                                          System.out.print("ssn is nurse:"+true );  }
                            		  else { 
                            			  JOptionPane.showMessageDialog(null,"you are not allowed to use this application","Alert",JOptionPane.WARNING_MESSAGE);
                            		  }
                            		 
                        		
                    		  } 
                      SSNtxt.setText(null);
                     }}}
              
    JOptionPane.showMessageDialog(null,"Check fullName/SSN field.","Alert",JOptionPane.WARNING_MESSAGE);  }
                   catch(Exception e){}
            
           }
           }
}




private void executeSQLQuery2(String query) {
       try{
           Statement st=db.getDbStatement();
          
           if(st.executeUpdate(query)==1){          // For update
               
//ys/no code hbe
           }else{
               
           }
           
           
       }catch(Exception e){
            
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


    public void close(){           // for closing background window  use this function and then dispose class
        WindowEvent winclose=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winclose);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel Background;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel staffp;
    private javax.swing.JPanel requestp;
    private javax.swing.JTextField reqIDtxt;
    private javax.swing.JTextField SSNtxt;
    // End of variables declaration                   
}
