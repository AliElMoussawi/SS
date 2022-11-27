
import java.sql.SQLException;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;

import javax.swing.JSeparator;



/**
 *
 * @author Ali 
 */
@SuppressWarnings("serial")
public class request extends javax.swing.JFrame {

    /**
     * Creates new form manager
     */
	static Connection con;
	static CustomDatabaseConnection db;
  
    static Statement st;
   static  String s;
   static String[] doctorslist= {};
   private static final AtomicInteger count = new AtomicInteger(0); 
    public request(String ss) throws SQLException {
    	db=new CustomDatabaseConnection("systematic_squad");
        con=db.getdbConnection();
        st=db.getDbStatement();
        initComponents();
        this.setLocationRelativeTo(null);
        s=ss;
   //   doctorList();
        
    }

    
                            
    @SuppressWarnings({ })
	private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bgbox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        addresstxt = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        PHONENUMBERtxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        idtxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jButton11 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1214, 712));
        setUndecorated(true);
        getContentPane().setLayout(null);

      jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 20, 60, 50);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
         // jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/managerx24.png"))); // NOI18N
        jButton2.setText("           manager");
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(0, 169, 270, 50);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(10, 220, 270, 30);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 290, 270, 13);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(0, 358, 270, 13);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(0, 430, 270, 13);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(0, 500, 270, 10);
        getContentPane().add(jSeparator7);
        jSeparator7.setBounds(10, 570, 270, 13);
        getContentPane().add(jSeparator8);
        jSeparator8.setBounds(0, 641, 270, 30);
        getContentPane().add(jSeparator9);
        jSeparator9.setBounds(0, 710, 270, 10);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
     jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profilex24.png"))); // NOI18N
        jButton4.setText("           Profile");
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(0, 220, 270, 69);

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
      jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/requestsx24.png"))); // NOI18N
        jButton5.setText("        Requests");
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(0, 290, 270, 69);

        jButton6.setBackground(new java.awt.Color(102, 102, 102));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
     jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/donorlistx24.png"))); // NOI18N
        jButton6.setText("      Donor List");
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(0, 358, 270, 70);

        jButton7.setBackground(new java.awt.Color(102, 102, 102));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
    jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adddonorx24.png"))); // NOI18N
        jButton7.setText("     Add Donor");
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(0, 430, 270, 69);

        jButton8.setBackground(new java.awt.Color(102, 102, 102));
        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
       jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RequestForBloodforuserx24.png"))); // NOI18N
        jButton8.setText(" Blood Request");
        getContentPane().add(jButton8);
        jButton8.setBounds(0, 500, 270, 70);

        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton10.setText("        Exit");
        jButton10.setContentAreaFilled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(0, 570, 270, 60);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Donate blood and save life!");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(830, 140, 140, 13);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        jLabel6.setText("Blood Donor Management System");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(560, 100, 400, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Systematic_squad");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(630, 60, 260, 40);

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 460, 270, 460);

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
      jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 270, 480);

  jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 0, 950, 180);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Request", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 15))); // NOI18N
        jPanel1.setLayout(null);

        bgbox.setBackground(new java.awt.Color(255, 204, 204));
        bgbox.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        bgbox.setForeground(new java.awt.Color(51, 0, 255));
        bgbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "A+", "O+", "B+", "AB+", "A-", "O-", "B-", "AB-" }));
        bgbox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bgbox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bgbox.setOpaque(false);
        jPanel1.add(bgbox);
        bgbox.setBounds(470, 50, 220, 30);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Blood group  :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(330, 30, 130, 70);

        nametxt.setBackground(new java.awt.Color(255, 204, 204));
        nametxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        nametxt.setForeground(new java.awt.Color(0, 0, 204));
        nametxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nametxt.setBorder(null);
        nametxt.setOpaque(false);
        jPanel1.add(nametxt);
        nametxt.setBounds(200, 120, 230, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Name *           :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(80, 120, 120, 40);
        jPanel1.add(jSeparator14);
        jSeparator14.setBounds(200, 150, 230, 10);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("Address *        :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(520, 120, 130, 40);

        addresstxt.setBackground(new java.awt.Color(255, 204, 204));
        addresstxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        addresstxt.setForeground(new java.awt.Color(0, 0, 204));
        addresstxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addresstxt.setBorder(null);
        addresstxt.setOpaque(false);
        addresstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresstxtActionPerformed(evt);
            }
        });
        jPanel1.add(addresstxt);
        addresstxt.setBounds(650, 120, 230, 30);
        jPanel1.add(jSeparator16);
        jSeparator16.setBounds(650, 150, 230, 10);

        PHONENUMBERtxt.setBackground(new java.awt.Color(255, 204, 204));
        PHONENUMBERtxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        PHONENUMBERtxt.setForeground(new java.awt.Color(0, 0, 204));
        PHONENUMBERtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PHONENUMBERtxt.setBorder(null);
        PHONENUMBERtxt.setOpaque(false);
        PHONENUMBERtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PHONENUMBERtxtActionPerformed(evt);
            }
        });
        jPanel1.add(PHONENUMBERtxt);
        PHONENUMBERtxt.setBounds(200, 240, 230, 30);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("Phone number:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(40, 230, 150, 50);
        jPanel1.add(jSeparator12);
        jSeparator12.setBounds(200, 270, 230, 10);

        idtxt.setBackground(new java.awt.Color(255, 204, 204));
        idtxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        idtxt.setForeground(new java.awt.Color(0, 0, 204));
        idtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idtxt.setBorder(null);
        idtxt.setOpaque(false);
        idtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtxtActionPerformed(evt);
            }
        });
        jPanel1.add(idtxt);
        idtxt.setBounds(650, 240, 230, 30);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("ID(" +"cfa5a3c4-57)* :");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(485, 229, 165, 50);
        jPanel1.add(jSeparator13);
        jSeparator13.setBounds(650, 270, 230, 10);

        jButton11.setBackground(new java.awt.Color(255, 204, 204));
        jButton11.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton11.setText("Submit");
        jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton11.setOpaque(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton11ActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(570, 420, 120, 50);

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
     jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }});        
        jPanel1.add(jButton1);
        jButton1.setBounds(220, 420, 120, 50);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("* Marked fields are mandatory");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(710, 320, 170, 14);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(270, 185, 930, 520);
        
        JLabel jLabel13_1 = new JLabel();
        jLabel13_1.setText("Age*        :");
        jLabel13_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        jLabel13_1.setBounds(558, 178, 92, 40);
        jPanel1.add(jLabel13_1);
        
        agetxt = new JTextField();
        agetxt.setOpaque(false);
        agetxt.setHorizontalAlignment(SwingConstants.CENTER);
        agetxt.setForeground(new Color(0, 0, 204));
        agetxt.setFont(new Font("Times New Roman", Font.BOLD, 15));
        agetxt.setBorder(null);
        agetxt.setBackground(new Color(255, 204, 204));
        agetxt.setBounds(650, 184, 230, 30);
        jPanel1.add(agetxt);
        
        JSeparator jSeparator16_1 = new JSeparator();
        jSeparator16_1.setBounds(650, 212, 230, 10);
        jPanel1.add(jSeparator16_1);
        
      
    jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(1060, 0, 160, 180);

        pack();
    }// </editor-fold>                        

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        int check=JOptionPane.showConfirmDialog(null,"YES     for     Exit\nNO       for    ReLogin ","Choose one...",JOptionPane.YES_NO_OPTION);
        if(check==0){
            System.exit(0);
        }
        if(check==1){
            login l=new login();
           
            l.setVisible(true);
        close(); }
    }                            

	/*public static void doctorList() throws SQLException {
		
		 ResultSet rs=st.executeQuery("select HPHONENUMBER from medicalstaff where SSN ="+s);
	    String Hnb=""; 
		int doctors = 0;
		
		while(rs.next()) {
			Hnb =rs.getString("HPHONENUMBER");
		 }
		;
		
		ResultSet rc=st.executeQuery("select count(*) from doctor as d left join medicalstaff as mon (m.HPHONENUMBER="+1111111+" and m.SSN=d.SSN) where m.SSN ");
		
		// ResultSet rc=st.executeQuery("select count(*) \r\n"+"from doctor as d left join medicalstaff as m\r\n"+" on (m.HPHONENUMBER="+Hnb+" and m.SSN=d.SSN )\r\n"+"where m.SSN ");
		while(rc.next()) {
			doctors =Integer.parseInt(rc.getString("count(*)"));
		 }
		ResultSet r=st.executeQuery("select FULLNAME \r\n"+"from doctor as d left join medicalstaff as m\r\n"+" on (m.HPHONENUMBER="+Hnb+" and m.SSN=d.SSN )\r\n"+"where m.SSN ");
		String[] doc=new String[doctors+1];
		doc[0]="-Select-";
		int i=1;
		while(r.next()) {
			
			doc[i] =rs.getString("HPHONENUMBER");
			
		 }
		doctorslist=doc;}*/
	
    @SuppressWarnings("unused")
	private void executeSQLQuery(String query) {
       try{

          
           if(st.executeUpdate(query)==1){
               //JOptionPane.showMessageDialog(null,"Registration Successful!!","Congrats..",JOptionPane.INFORMATION_MESSAGE);
              
           }else{
               //JOptionPane.showMessageDialog(null,"Registration Unsuccessful!!","Sorry!",JOptionPane.WARNING_MESSAGE); 
           }
           
           
       }catch(Exception e){
            
       }
    }
 
	
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
         manager h=new manager(s);
        h.setVisible(true); 
        close();
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
        Profile bg=new Profile(s);
        bg.setVisible(true); 
        close();
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Requests ad=new Requests(s);
      
        ad.setVisible(true); 
        close();
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       DonorList dl=new DonorList(s);
       
        dl.setVisible(true); close();
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
            AddDonor ad=new AddDonor(s);
             ad.setVisible(true); close();
          
        }                               

    private void addresstxtActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void PHONENUMBERtxtActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void idtxtActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        bgbox.setSelectedIndex(0);
       
        nametxt.setText("");
        addresstxt.setText("");
        PHONENUMBERtxt.setText("");
        agetxt.setText("");
        idtxt.setText(""); 
     //   comboBox.setSelectedIndex(0);
    }                                       

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {  
    	
        String bg=bgbox.getSelectedItem().toString();
        String name=nametxt.getText();
        String address=addresstxt.getText();
        String PHONENUMBER=PHONENUMBERtxt.getText();
   //  String combo=comboBox.getSelectedItem().toString(); 
       String age= agetxt.getText();
       String id= idtxt.getText();
        if(bg.equals("-Select-") || name.equals("") ||  address.equals("") ||id.equals("")|| PHONENUMBER.equals("")|| age.equals("")){
            JOptionPane.showMessageDialog(null,"Please fill up all Field.","Alert",JOptionPane.WARNING_MESSAGE);   
        }else{
            
               
            //try catch done and get last donor id
            
            Date dt=new Date();
            
            DateFormat dformate=new SimpleDateFormat("dd/MM/YYYY");
            
            String date=dformate.format(dt);
            
            LocalTime t=LocalTime.now();
            
            DateTimeFormatter dtf= DateTimeFormatter.ofPattern("hh:mm a");
            String time=t.format(dtf);
            
           
            
            //done.
            
            String dateTime=time+"  "+date;
           
            if(!checkbuser(id)) {
            	System.out.println("first we want to insert the user in the buser");
            	PreparedStatement st = con.prepareStatement("INSERT INTO BUSER (USERID, PHONENUMBER,FULLNAME, AGE, BLOODTYPE,ADDRESS) VALUES (?,?,?,?,?,?)");
             	st.setString(1, id);
             	
             	st.setString(2, PHONENUMBER);
             	
             	st.setString(3, name);
             	
             	st.setString(4, age);
             	
             	st.setString(5,bg);
             	
             	st.setString(6, address);
             	st.execute();
             	
            System.out.println("its exist in the table");
           // JOptionPane.showMessageDialog(null,"its exist in table ","Congrats",JOptionPane.INFORMATION_MESSAGE);
            String bloodcode="";
            ResultSet rc=st.executeQuery("select * FROM UNITSAV ");
            while(rc.next()) {
         	  
			if(bg.equals(rc.getString("BLOODTYPE"))){
				bloodcode=rc.getString("BLOODCODE");
				System.out.println(bloodcode);
			}}
            if(!bloodcode.equals("")) {
        	PreparedStatement st1 = con.prepareStatement("INSERT INTO request (REQID, USERID, PHONENUMBER, BLOODTYPE ,RDATE,BLOODCODE) VALUES (?,?,?,?,?,?)");

        	st1.setString(1,1000+count.incrementAndGet()+"");
        	st1.setString(2,id);
        	st1.setString(3,PHONENUMBER);
        	st1.setString(4, bg);
        	st1.setString(5, dateTime);
        	st1.setString(6, bloodcode);
        	PreparedStatement st4 = con.prepareStatement("INSERT INTO recipient (RUSERID, PHONENUMBER) VALUES (?,?)");
        	st4.setString(1,id);
        	st4.setString(2,PHONENUMBER);
        	st4.execute();
        	{JOptionPane.showMessageDialog(null,"succesfully addded to the requests table and the blood code ="+bloodcode,"Congrats",JOptionPane.INFORMATION_MESSAGE);}

            }else 
            	{JOptionPane.showMessageDialog(null,"there is no blood of the needed type ","Congrats",JOptionPane.INFORMATION_MESSAGE);}
            }
            //}
        
    }              }                           
    private boolean checkbuser(String userid) throws SQLException {
    	   ResultSet rc=st.executeQuery("select USERID FROM buser");
           while(rc.next()) {
        	  if(userid.equals(rc.getString("USERID"))){
        		  return true;
        	  }
           }
           return false;
    }
    
    
    
    
    @SuppressWarnings("unused")
	private void executeSQLQuery(String query,String message) {
       try{

          
           if(st.executeUpdate(query)==1){
               JOptionPane.showMessageDialog(null,"Your Request Created Successfully!! ","Congrats",JOptionPane.INFORMATION_MESSAGE);
               bgbox.setSelectedIndex(0);
        //      comboBox.setSelectedIndex(0);
               nametxt.setText("");
               addresstxt.setText("");
               PHONENUMBERtxt.setText("");
               agetxt.setText("");
               idtxt.setText("");
               String blooddel="";
              ResultSet rc=st.executeQuery("select BLOODCODE,BLOODTYPE \r\n"+" from bcu left join BUSER AS D \r\n"+"on (bcu.USERID=D.USERID)");
               while(rc.next()) {
               blooddel=rc.getString("BLOODCODE");
               }
           //   blooddel="17";
               st.executeUpdate("Delte from blood where BLOODCODE="+blooddel);
               JOptionPane.showMessageDialog(null,"deleted Successfully!! ","Congrats",JOptionPane.INFORMATION_MESSAGE);
           
               
           }else{
               JOptionPane.showMessageDialog(null,"Data not inserted\n\nPlease check and retry.","Alert",JOptionPane.WARNING_MESSAGE); 
           }
           
           
       }catch(Exception e){
            
       }
    }
    
    
    
    
    
    
    public void close(){
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
            
					try {
				new request(s).setVisible(true);
				} catch (SQLException e) {
					//TODO Auto-generated catch block
						e.printStackTrace();
				}
			
				
				
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField addresstxt;
    private javax.swing.JComboBox<String> bgbox;
    private javax.swing.JTextField PHONENUMBERtxt;
    private javax.swing.JTextField idtxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField nametxt;
    private JTextField agetxt;
//  private JComboBox comboBox;
   // private JLabel doctorName;
}
