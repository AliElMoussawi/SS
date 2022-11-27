import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;


@SuppressWarnings("serial")
public class Profile extends javax.swing.JFrame {

    /**
     * Creates new form manager
     */
    DatabaseConnection db;
    static String managerSSN;
    public Profile(String SSN) {
        db=new DatabaseConnection();
        initComponents();
        this.setLocationRelativeTo(null);
       managerSSN=SSN;
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
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
     //   jButton3 = new javax.swing.JButton();
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
        dstxt = new javax.swing.JTextField();
        uitxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        addresstxt = new javax.swing.JTextField();
        gendertxt = new javax.swing.JTextField();
        occupationtxt = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

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
        jButton2.setBounds(0, 150, 270, 70);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 150, 270, 30);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 220, 270, 10);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 290, 270, 10);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(0, 358, 270, 10);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(0, 430, 270, 10);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(0, 500, 270, 10);
        getContentPane().add(jSeparator7);
        jSeparator7.setBounds(0, 570, 270, 10);
        getContentPane().add(jSeparator8);
        jSeparator8.setBounds(0, 640, 270, 10);
        getContentPane().add(jSeparator9);
        jSeparator9.setBounds(0, 710, 270, 10);

       
        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profilex24.png"))); // NOI18N
        jButton4.setText("INSERT/DELETE/UPDATE:");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(0, 220, 270, 70);

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
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
        jButton5.setBounds(0, 290, 270, 70);

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

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adddonorx24.png"))); // NOI18N
        jButton7.setText("     Add Donor");
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(0, 430, 270, 70);

        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Requestforbloodgeneralx24.png"))); // NOI18N
        jButton8.setText(" Blood Request");
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(0, 500, 270, 70);

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
        jButton10.setBounds(0, 570, 270, 70);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Donate blood and save life!");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(830, 140, 140, 13);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        jLabel6.setText("Blood Donor Management System");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(553, 99, 400, 30);

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
        jLabel3.setBounds(271, 0, 949, 152);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "My Profile", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel1.setLayout(null);

        dstxt.setEditable(false);
        dstxt.setBackground(new java.awt.Color(204, 255, 255));
        dstxt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        dstxt.setForeground(new java.awt.Color(255, 0, 0));
        dstxt.setBorder(null);
        dstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dstxtActionPerformed(evt);
            }
        });
        jPanel1.add(dstxt);
        dstxt.setBounds(130, 40, 80, 20);

        uitxt.setEditable(false);
        uitxt.setBackground(new java.awt.Color(204, 255, 255));
        uitxt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        uitxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        uitxt.setBorder(null);
        uitxt.setText(managerSSN);
       
        jPanel1.add(uitxt);
        uitxt.setBounds(413, 40, 110, 20);

        nametxt.setEditable(false);
        nametxt.setBackground(new java.awt.Color(204, 255, 255));
        nametxt.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        nametxt.setBorder(null);
        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });
        jPanel1.add(nametxt);
        nametxt.setBounds(160, 110, 210, 20);

        addresstxt.setEditable(false);
        addresstxt.setBackground(new java.awt.Color(204, 255, 255));
        addresstxt.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        addresstxt.setBorder(null);
        addresstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresstxtActionPerformed(evt);
            }
        });
        jPanel1.add(addresstxt);
        addresstxt.setBounds(620, 110, 210, 20);

        gendertxt.setEditable(false);
        gendertxt.setBackground(new java.awt.Color(204, 255, 255));
        gendertxt.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        gendertxt.setBorder(null);
        gendertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gendertxtActionPerformed(evt);
            }
        });
        jPanel1.add(gendertxt);
        gendertxt.setBounds(620, 150, 210, 20);

        occupationtxt.setEditable(false);
        occupationtxt.setBackground(new java.awt.Color(204, 255, 255));
        occupationtxt.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        occupationtxt.setBorder(null);
        occupationtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                occupationtxtActionPerformed(evt);
            }
        });
        jPanel1.add(occupationtxt);
        occupationtxt.setBounds(620, 190, 210, 20);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("User ID   :");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(340, 39, 80, 20);
      

        jButton11.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton11.setText("Delete Selected Request");
        jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton11.setContentAreaFilled(false);
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(413, 265, 150, 30);

        jButton12.setBackground(new java.awt.Color(255, 51, 51));
        jButton12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton12.setText("Delete User");
        jButton12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);
        jButton12.setBounds(179, 345, 110, 30);

        jButton13.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton13.setText("Update User");
        jButton13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton13.setContentAreaFilled(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13);
        jButton13.setBounds(413, 345, 110, 30);

        jButton14.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton14.setText("Make Request");
        jButton14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton14.setContentAreaFilled(false);
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					jButton14MouseClicked(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14);
        jButton14.setBounds(413, 165, 150, 30);

        jButton16.setBackground(new java.awt.Color(102, 102, 255));
        jButton16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton16.setText("Mark As A DONOR");
        jButton16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton16.setContentAreaFilled(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16);
        jButton16.setBounds(141, 164, 150, 30);

        jButton17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton17.setText("Remove As A DONOR");
        jButton17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton17.setContentAreaFilled(false);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton17);
        jButton17.setBounds(140, 264, 150, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(270, 153, 944, 517);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(1060, 0, 160, 180);

        pack();
    }// </editor-fold>                        

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       
    }                                         

    private void executeSQLQuery(String query) {
       try{

           Statement st= db.getDbStatement();
          
           if(st.executeUpdate(query)==1){
               System.out.println("Executed");
           }else{
               //JOptionPane.showMessageDialog(null,"There is a problem.","Sorry!",JOptionPane.WARNING_MESSAGE);
               System.out.println("Not");
           }
           
           
       }catch(Exception e){
            
       }
    }
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        manager h=new manager(managerSSN);
        close();
        h.setVisible(true);
    }                                                                               
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        DonorList dl=new DonorList(managerSSN);
        close();
        dl.setVisible(true);
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        

    }                                        
  private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        

    }           
     //block list checking
    
    public void blocking(){
        LocalDate dateToday=LocalDate.now();
        SimpleDateFormat d=new SimpleDateFormat("dd/MM/yyyy");
        String s=dateToday.toString();
        String[] f=s.split("-");
        String ss=f[2]+"/"+f[1]+"/"+f[0];
        
        Date d1=new Date();
        Date d2;
        
        try {
            d1=d.parse(ss);
        } catch (Exception ex) {
            
        }
        
        try{

            Statement st= db.getDbStatement();
            ResultSet rs=st.executeQuery("select *from block");
            
            
            
            
            while(rs.next()){
                String us=rs.getString("User");
                String dt=rs.getString("Date");
                try {
                    d2=d.parse(dt);
                    
                    long diff =Math.abs(d1.getTime()-d2.getTime())    ;
                    long diffDays = diff / (24 * 60 * 60 * 1000);
                    
                    if(diffDays>=120){
                        String del="DELETE FROM `block` WHERE `User`=\""+us+"\"";
                        executeSQLQuery(del);
                    }
                    
                } catch (Exception e) {
                }
            }
                    
           
        }catch(Exception e){
            
        }
    }

    private void dstxtActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     
    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void addresstxtActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void gendertxtActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void occupationtxtActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        RemoveRequest RR=new RemoveRequest(managerSSN);
        RR.setVisible(true);
    }                                         

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
    	DeleteUser DU= new DeleteUser(managerSSN);
    	DU.setVisible(true);
        
    }                                         

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       updateUser UU =new updateUser(managerSSN);
       UU.setVisible(true);
    }                                         

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       
    }                                         

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {                                       
      
    }                                      
     
    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) throws SQLException {                                       
        request pbr=new request(managerSSN);
       pbr.setVisible(true);
        
    }                                      

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Requests req1=new Requests(managerSSN);
        req1.setVisible(true);
       
    }                                        

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {                                          
    	RemoveDonor RD= new RemoveDonor(managerSSN);
    	 RD.setVisible(true);
    }                                         

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {                                          
    	 AddDonor t=new AddDonor(managerSSN);
         t.setVisible(true);
        
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
                Profile a=new Profile(managerSSN);
               a.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField addresstxt;
    private javax.swing.JTextField dstxt;
    private javax.swing.JTextField gendertxt;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
  //  private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField occupationtxt;
    private javax.swing.JTextField uitxt;
    // End of variables declaration                   

    
}
