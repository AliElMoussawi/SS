

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class manager extends javax.swing.JFrame {

    /**
     * Creates new form manager
     */
    DatabaseConnection db;
    Statement st;
    static String SSN;
    public manager(String LSSN) {
        db=new DatabaseConnection();
        st=db.getDbStatement();
        initComponents();
        this.setLocationRelativeTo(null);
        usericon();
       SSN=LSSN;
        
    }

    
    

   
    public void usericon(){
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
        jLabel8 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

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
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(0, 153, 270, 67);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 170, 270, 28);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 209, 270, 11);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 280, 270, 10);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(0, 342, 270, 13);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(0, 410, 270, 70);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(0, 480, 270, 13);
        getContentPane().add(jSeparator7);
        jSeparator7.setBounds(0, 558, 270, 10);
        getContentPane().add(jSeparator8);
        jSeparator8.setBounds(0, 669, 270, 30);
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
        jButton4.setBounds(0, 220, 270, 59);

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
        jButton5.setBounds(0, 280, 270, 67);

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
        jButton6.setBounds(0, 342, 270, 67);

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
        jButton7.setBounds(0, 413, 270, 67);

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
        jButton8.setBounds(0, 480, 270, 67);

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
        jButton10.setBounds(0, 558, 270, 67);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Donate blood and save life!");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(830, 140, 140, 13);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        jLabel6.setText("Blood Donor Management System");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(560, 100, 400, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Systematic Squad");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(630, 60, 260, 40);

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 474, 270, 225);

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 270, 491);

       jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 0, 970, 180);

      jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(1040, 0, 180, 180);

        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Welcome to Our CMPS 277 Database! \n\n\n INSTRUCTOR: MAURICE KHABAZ\n\n\n\n\nTEAM MEMBERS:\n Ali Moussawi \n Hanin Nasr \n Sarah AL-Arab \n Ola Jouni");
        //Donating blood is an active way of helping others and the whole of society. For you, it's just a few moments out of your day but for patients in need, it may save\ntheir life. Specialist medical staff are on hand at all times during the donation, which is a simple, safe and painless procedure. There is no risk for donors of giving\nblood, and it will help the patients in need. Despite medical and technological advances, blood cannot currently be made. The only way of getting hold of it is via \nblood donations from people who give blood. Each donation may help up to three different people. Because each blood donation provides three different blood \ncomponents, each with its own role in treating patients, it helps up to three different people.\n\nBlood and its components have a limited life\n\t-  Red blood cell concentrates can be kept for 42 days\n\t-  Plasma can be stored for a year.\n\t-  Platelets can be kept for five days.\n\nTransfusions of blood and blood components have become an essential part of healthcare today. We don't just need to give blood in the event of tragedies or \nemergencies. Instead, it should be a normal and routine part of our lives. Regular blood donations mean that there will be sufficient amounts of safe blood in stock.\n\nRemember that men can give blood up to four times a year - women up to three times -providing there are at least two months between donations.\n\nDonating blood is a life saving act. By donating blood you can save lives. But in turn blood donation benefit blood donor’s a well. Here are the benefits of donating\nblood :\n\t1)  Maintain iron level : By donating blood, the iron level is properly maintained. Excess iron level increases the chances of cardio vascular diseases.\n\t2)  Burns Calories and lowering the cholesterol level.\n\t3)  Blood Donation provides you the free health checkup.\n\t4)  Enhances the production of new blood cells.\n\t5)  It saves lives.\n\t6)  Anti-cancer benefits: blood donation helps in lowering the risk of cancer.");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 10, 930, 480);

        jTabbedPane1.addTab("Preface", jPanel1);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(270, 180, 940, 530);
        jPanel2 = new javax.swing.JPanel();
                jPanel2.setBackground(new java.awt.Color(204, 255, 255));
                jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                jPanel2.setLayout(null);
                
                    
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
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Profile p=new Profile(SSN);
        close();
        p.setVisible(true);
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Requests bg=new Requests(SSN);
        bg.setVisible(true);
        close();


    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        DonorList dl=new DonorList(SSN);
        dl.setVisible(true);
        close();
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
           AddDonor ad=new AddDonor(SSN);
       ad.setVisible(true);
      close();                                     }
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                         
       request Nreq = new request(SSN);
       Nreq.setVisible(true);
       close();
    
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    
    
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
                new manager(SSN).setVisible(true);
            }
        });
    }
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
  //  private javax.swing.JTextArea jTextArea2;
                    
}
