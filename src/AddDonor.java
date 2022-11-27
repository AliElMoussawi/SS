
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ali
 */
@SuppressWarnings("serial")
public class AddDonor extends javax.swing.JFrame {

    /**
     * Creates new form manager
     */
	static Connection con;
	static CustomDatabaseConnection db;
    static Statement st;
    static String MSSN;
    public AddDonor(String SSN) {
    	db=new CustomDatabaseConnection("systematic_squad");
        con=db.getdbConnection();
        st=db.getDbStatement();
        initComponents();
        this.setLocationRelativeTo(null);
        
        MSSN=SSN;
        

    }
    
    
                            
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jButton10_1 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton5.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
					jButton15ActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        		
        	}
        });
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        contacttxt = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        agetxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        idtxt = new javax.swing.JTextField();
        addresstxt = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        bgbox = new javax.swing.JComboBox<>();
        genderbox = new javax.swing.JComboBox<>();
        jButton11 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1214, 712));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 20, 60, 50);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
       //jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/managerx24.png"))); // NOI18N
        jButton2.setText("           manager");
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(0, 160, 270, 59);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 160, 270, 6);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(10, 220, 270, 6);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 290, 270, 10);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(0, 358, 270, 10);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(0, 430, 270, 10);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(0, 500, 270, 6);
        getContentPane().add(jSeparator7);
        jSeparator7.setBounds(0, 641, 270, 10);
        getContentPane().add(jButton10_1);
        jButton10_1.setBounds(0, 572, 270, 6);
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
        jButton4.setBounds(0, 220, 270, 73);

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/requestsx24.png"))); // NOI18N
        jButton5.setText("        Requests");
        jButton5.setContentAreaFilled(false);
        getContentPane().add(jButton5);
        jButton5.setBounds(0, 290, 270, 66);

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
        jButton6.setBounds(0, 358, 270, 73);

        jButton7.setBackground(new java.awt.Color(102, 102, 102));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adddonorx24.png"))); // NOI18N
        jButton7.setText("     Add Donor");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(0, 430, 270, 73);

        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Requestforbloodgeneralx24.png"))); // NOI18N
        jButton8.setText(" Blood Request");
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton8ActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(0, 500, 270, 81);

        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exitx24.png"))); // NOI18N
        jButton10.setText("        Exit");
        jButton10.setContentAreaFilled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(0, 572, 270, 66);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Donate blood and save life!");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(830, 140, 140, 13);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        jLabel6.setText("Blood Donor Management System");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(560, 100, 400, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Systematic_squad"
        		+ "");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(654, 60, 316, 40);

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 461, 270, 460);

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 270, 480);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 0, 950, 180);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Create", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel1.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("* marked field is not mandatory ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(718, 463, 190, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Name            :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(110, 130, 120, 40);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Age               :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(110, 200, 120, 40);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Blood group  :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(370, 50, 120, 50);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Gender           :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(100, 270, 120, 50);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("Address         :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(559, 200, 131, 50);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("Phone number * :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(549, 279, 141, 50);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("ID*              :");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(559, 130, 131, 40);

        contacttxt.setBackground(new java.awt.Color(255, 204, 204));
        contacttxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        contacttxt.setForeground(new java.awt.Color(0, 0, 204));
        contacttxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contacttxt.setBorder(null);
        contacttxt.setOpaque(false);
        contacttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contacttxtActionPerformed(evt);
            }
        });
        jPanel1.add(contacttxt);
        contacttxt.setBounds(690, 290, 230, 30);
        jPanel1.add(jSeparator12);
        jSeparator12.setBounds(690, 320, 230, 10);
        jPanel1.add(jSeparator13);
        jSeparator13.setBounds(230, 230, 230, 10);

        agetxt.setBackground(new java.awt.Color(255, 204, 204));
        agetxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        agetxt.setForeground(new java.awt.Color(0, 0, 204));
        agetxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        agetxt.setBorder(null);
        agetxt.setOpaque(false);
        jPanel1.add(agetxt);
        agetxt.setBounds(230, 200, 230, 30);

        nametxt.setBackground(new java.awt.Color(255, 204, 204));
        nametxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        nametxt.setForeground(new java.awt.Color(0, 0, 204));
        nametxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nametxt.setBorder(null);
        nametxt.setOpaque(false);
        jPanel1.add(nametxt);
        nametxt.setBounds(230, 130, 230, 30);
        jPanel1.add(jSeparator14);
        jSeparator14.setBounds(230, 162, 230, 10);
        jPanel1.add(jSeparator15);
        jSeparator15.setBounds(690, 160, 230, 10);

        idtxt.setBackground(new java.awt.Color(255, 204, 204));
        idtxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        idtxt.setForeground(new java.awt.Color(0, 0, 204));
        idtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idtxt.setBorder(null);
        idtxt.setOpaque(false);
        jPanel1.add(idtxt);
        idtxt.setBounds(690, 130, 230, 30);

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
        addresstxt.setBounds(690, 210, 230, 30);
        jPanel1.add(jSeparator16);
        jSeparator16.setBounds(690, 240, 230, 10);

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(263, 440, 120, 50);

        bgbox.setBackground(new java.awt.Color(255, 204, 204));
        bgbox.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        bgbox.setForeground(new java.awt.Color(51, 0, 255));
        bgbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "A+", "O+", "B+", "AB+", "A-", "O-", "B-", "AB-" }));
        bgbox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bgbox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bgbox.setOpaque(false);
        jPanel1.add(bgbox);
        bgbox.setBounds(500, 60, 220, 30);

        genderbox.setBackground(new java.awt.Color(255, 204, 204));
        genderbox.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        genderbox.setForeground(new java.awt.Color(0, 0, 255));
        genderbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Male", "Female" }));
        genderbox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(genderbox);
        genderbox.setBounds(230, 280, 230, 30);

        jButton11.setBackground(new java.awt.Color(255, 204, 204));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-user.png"))); // NOI18N
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
        jButton11.setBounds(530, 440, 120, 50);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setText("Diagnosis  :");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(112, 369, 104, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(270, 157, 930, 520);
        
        JSeparator jSeparator12_1 = new JSeparator();
        jSeparator12_1.setBounds(214, 401, 230, 10);
        jPanel1.add(jSeparator12_1);
        
        jLabel20 = new JLabel();
        jLabel20.setText("Medicines    :");
        jLabel20.setFont(new Font("Times New Roman", Font.BOLD, 18));
        jLabel20.setBounds(570, 369, 120, 50);
        jPanel1.add(jLabel20);
        
        medicinestxt = new JTextField();
        medicinestxt.setOpaque(false);
        medicinestxt.setHorizontalAlignment(SwingConstants.CENTER);
        medicinestxt.setForeground(new Color(0, 0, 204));
        medicinestxt.setFont(new Font("Times New Roman", Font.BOLD, 15));
        medicinestxt.setBorder(null);
        medicinestxt.setBackground(new Color(255, 204, 204));
        medicinestxt.setBounds(678, 369, 230, 30);
        jPanel1.add(medicinestxt);
        
        jSeparator12_2 = new JSeparator();
        jSeparator12_2.setBounds(678, 401, 230, 10);
        jPanel1.add(jSeparator12_2);
        
        diagnosistxt = new JTextField();
        diagnosistxt.setOpaque(false);
        diagnosistxt.setHorizontalAlignment(SwingConstants.CENTER);
        diagnosistxt.setForeground(new Color(0, 0, 204));
        diagnosistxt.setFont(new Font("Times New Roman", Font.BOLD, 15));
        diagnosistxt.setBorder(null);
        diagnosistxt.setBackground(new Color(255, 204, 204));
        diagnosistxt.setBounds(214, 369, 230, 30);
        jPanel1.add(diagnosistxt);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(1070, 0, 140, 180);

        pack();
    }// </editor-fold>                        

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        int check=JOptionPane.showConfirmDialog(null,"YES     for     Exit\nNO       for    ReLogin ","Choose one...",JOptionPane.YES_NO_OPTION);
        if(check==0){
        	System.exit(0);
        }
        if(check==1){
            
            login l=new login();
            close();
            l.setVisible(true);
        }
    }                                         

    @SuppressWarnings("unused")
	private void executeSQLQuery(String query) {
       try{
          
           if(st.executeUpdate(query)==1){
               //JOptionPane.showMessageDialog(null,"Registration Successful!!","Congrats..",JOptionPane.INFORMATION_MESSAGE);
               
//ys/no code hbe
           }else{
               //JOptionPane.showMessageDialog(null,"Registration Unsuccessful!!","Sorry!",JOptionPane.WARNING_MESSAGE); 
           }
           
           
       }catch(Exception e){
            
       }
    }
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        manager h=new manager(MSSN);
       
        h.setVisible(true);
        close();
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        Profile bg=new Profile(MSSN);
        bg.setVisible(true);
        close();
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        DonorList dl=new DonorList(MSSN);
       
        dl.setVisible(true);
        close();
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
    }                                        
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
        Requests Nreq = new Requests(MSSN);
        Nreq.setVisible(true);
        close();
     

    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
        request Nreq = new request(MSSN);
        Nreq.setVisible(true);
        close();
     

    }                                        

    private void contacttxtActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void addresstxtActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       bgbox.setSelectedIndex(0);
       nametxt.setText("");
       agetxt.setText("");
       genderbox.setSelectedIndex(0);
       idtxt.setText("");
       addresstxt.setText("");
       contacttxt.setText("");
       diagnosistxt.setText("");
       medicinestxt.setText("");
    }                                        

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                          
        String bg=bgbox.getSelectedItem().toString();
        String name=nametxt.getText();
        String age=agetxt.getText();
        String gender=genderbox.getSelectedItem().toString();
        String id=idtxt.getText();
        String address=addresstxt.getText();
        String contact=contacttxt.getText();
        String diagnosis=diagnosistxt.getText();
        String medicines=medicinestxt.getText();
        if(bg.equals("-Select-") || name.equals("") || age.equals("") || gender.equals("-Select-") || address.equals("") || contact.equals("")){
            //AddDonor a=new AddDonor();
           
        	JOptionPane.showMessageDialog(null,"Please fill up all Field.","Alert",JOptionPane.WARNING_MESSAGE);   
        }else{
        	if(!checkuser(id))
        	{
        	//System.out.println("insert in buser");
        		
        		PreparedStatement st = con.prepareStatement("INSERT INTO BUSER (USERID, PHONENUMBER,FULLNAME, AGE, BLOODTYPE,ADDRESS) VALUES (?,?,?,?,?,?)");
             	st.setString(1, id);
             	
             	st.setString(2, contact);
             	
             	st.setString(3, name);
             	
             	st.setString(4, age);
             	
             	st.setString(5,bg);
             	
             	st.setString(6, address);
             	st.execute();
        		PreparedStatement st1 = con.prepareStatement("INSERT INTO MEDICALRECORDS(MRUSERID, PHONENUMBER,MEDICATION,DIAGNOSIS) VALUES (?,?,?,?)");
        		st1.setString(1, id);
             	
             	st1.setString(2, contact);
             	
             	st1.setString(3, medicines);
             
             	st1.setString(4, diagnosis);
             	st1.execute();
        	}
        	
        	if(checkuser(id)) {
        		PreparedStatement st2 = con.prepareStatement("INSERT INTO doctorcheck VALUES (?)");
        		st2.setString(1,id);
             	st2.execute();
 
        		JOptionPane.showConfirmDialog(null,"You have to wait the doctor approval","Congrats",JOptionPane.YES_NO_OPTION);
        	}
        	
        }
        
    }  
    public boolean checkuser(String n) throws SQLException {
    	
    	 ResultSet rs=st.executeQuery("select * from BUSER");
    	 while(rs.next()){
             if(n.equals(rs.getString("USERID"))) {
            	 return true;
             }
             
    }return false;}

    @SuppressWarnings("unused")
	private void executeSQLQuery(String query,String message) {
       try{

          
           if(st.executeUpdate(query)==1){
               int check=JOptionPane.showConfirmDialog(null,"Your Profile Created Successfully!!\nWant to view your profile ?","Congrats",JOptionPane.YES_NO_OPTION);
               if(check==0){
                  // ShowInsertedData1 s=new ShowInsertedData1();
                 //  s.setVisible(true);
                   
               }
               if(check==1){
                   AddDonor a=new AddDonor(MSSN);
                   close();
                   a.setVisible(true);
                   
               }
//ys/no code hbe
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
                new AddDonor(MSSN).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField addresstxt;
    private javax.swing.JTextField agetxt;
    private javax.swing.JComboBox<String> bgbox;
    private javax.swing.JTextField contacttxt;
    private javax.swing.JComboBox<String> genderbox;
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
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jButton10_1;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField nametxt;
    private JLabel jLabel20;
    private JTextField medicinestxt;
    private JSeparator jSeparator12_2;
    private JTextField diagnosistxt;
}
