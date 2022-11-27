
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ali
 */
@SuppressWarnings({ "serial", "unused" })
public class DonorList extends javax.swing.JFrame {

    /**
     * Creates new form manager
     */

    DatabaseConnection db;
    static Statement st;
    static String ss;
    public DonorList(String s) {
        db=new DatabaseConnection();
        st=db.getDbStatement();
        initComponents();
        this.setLocationRelativeTo(null);
        refresh();
        ss=s;
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        searchtxt = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        box = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
      //  jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

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
        jButton2.setBounds(0, 160, 270, 59);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 150, 270, 30);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 220, 270, 10);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 290, 270, 10);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(0, 358, 270, 10);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(0, 429, 270, 10);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(0, 500, 270, 20);
        getContentPane().add(jSeparator7);
        jSeparator7.setBounds(0, 570, 270, 30);
        getContentPane().add(jSeparator8);
        jSeparator8.setBounds(0, 640, 270, 30);
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
        jButton4.setBounds(0, 220, 270, 70);

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

        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(null);

        jPanel5.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Donors", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jPanel1.setLayout(null);

        table1.setBackground(new java.awt.Color(255, 204, 204));
        table1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Donor  ID", "Name", "Age", "Blood Group", "Address", "Contact"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false,  false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setResizable(false);
            table1.getColumnModel().getColumn(1).setResizable(false);
            table1.getColumnModel().getColumn(2).setResizable(false);
            table1.getColumnModel().getColumn(3).setResizable(false);
            table1.getColumnModel().getColumn(4).setResizable(false);
            table1.getColumnModel().getColumn(5).setResizable(false);
           // table1.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 81, 910, 380);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifying-glass.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(820, 20, 70, 50);

        searchtxt.setBackground(new java.awt.Color(255, 204, 204));
        searchtxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        searchtxt.setForeground(new java.awt.Color(0, 0, 204));
        searchtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchtxt.setBorder(null);
        searchtxt.setOpaque(false);
        jPanel1.add(searchtxt);
        searchtxt.setBounds(430, 30, 230, 30);
        jPanel1.add(jSeparator14);
        jSeparator14.setBounds(430, 60, 230, 10);

        box.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Search by-", "Blood Group", "Name", "Donor ID" }));
        jPanel1.add(box);
        box.setBounds(680, 30, 130, 30);

        jPanel5.add(jPanel1);
        jPanel1.setBounds(0, 0, 940, 520);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(0, 0, 920, 520);

        jTabbedPane1.addTab("View Donors", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(280, 160, 930, 550);

        jButton6.setBackground(new java.awt.Color(102, 102, 102));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/donorlistx24.png"))); // NOI18N
        jButton6.setText("      Donor List");
        getContentPane().add(jButton6);
        jButton6.setBounds(0, 358, 270, 75);

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
        jButton7.setBounds(0, 429, 270, 71);

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
        jButton10.setBounds(0, 570, 270, 69);

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

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(1060, 0, 150, 180);

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

   /* private void executeSQLQuery(String query) {
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
    */
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        manager h=new manager(ss);
        close();
        h.setVisible(true);
    }                                        

                                      

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        Profile bg=new Profile(ss);close();
        bg.setVisible(true);
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Requests ad=new Requests(ss);
        close();
        ad.setVisible(true);
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       boolean b=false;
        
        
        try{

                    ResultSet rs=st.executeQuery("select *from bloodbankmanager");
           
                    
           
                    while(rs.next()){
                        String s1=rs.getString("SSN");
                        if(s1.equals("2")){
                            b=true;
                        }
               
                       
                    }
           
                }catch(Exception e){
            
                 }
        
        //code sesh
        
        if(b==true || b==false){
            AddDonor ad=new AddDonor(ss);
             ad.setVisible(true);
             close();
        }
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                         
          request br=new request(ss);
        br.setVisible(true);
            close();
        }                                     

  /*  private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    
    }*/                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
  //      String search=searchtxt.getText();
        
        String opt=box.getSelectedItem().toString();
        
        if(opt.equals("-Search by-")){
        	table1.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {

                    },
                    new String [] {
                        "Donor  ID", "Name", "Age", "Blood Group", "Address", "Contact"
                    }
                ) {
                    boolean[] canEdit = new boolean [] {
                        false, false, false, false, false, false,  false
                    };

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                    }
                });
            DefaultTableModel model=(DefaultTableModel) table1.getModel();
            model.setRowCount(0);
            
            refresh();
        }
        else if(opt.equals("Blood Group")){
        	table1.setModel(new javax.swing.table.DefaultTableModel(
 	            new Object [][] {},
 	            new String [] {
 	                "Donor  ID", "Blood Code", "Blood Bank Code", "Blood Group"
 	            }
 	        ) {
 	            boolean[] canEdit = new boolean [] {
 	                false, false, false, false
 	            };

 	            public boolean isCellEditable(int rowIndex, int columnIndex) {
 	                return canEdit [columnIndex]; }});
      
        	DefaultTableModel model=(DefaultTableModel)  table1.getModel(); 
        	model.setRowCount(0);
            bg();
        }
        
        else if(opt.equals("Name")){
        	table1.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {

                    },
                    new String [] {
                        "Donor  ID", "Name", "Age", "Blood Group", "Address", "Contact"
                    }
                ) {
                    boolean[] canEdit = new boolean [] {
                        false, false, false, false, false, false,  false
                    };

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                    }
                });
           
            DefaultTableModel model=(DefaultTableModel) table1.getModel();
            model.setRowCount(0);
            
            name();
        }
        
        else if(opt.equals("Donor ID")){
        	table1.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {

                    },
                    new String [] {
                        "Donor  ID", "Name", "Age", "Blood Group", "Address", "Contact"
                    }
                ) {
                    boolean[] canEdit = new boolean [] {
                        false, false, false, false, false, false,  false
                    };

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                    }
                });
            DefaultTableModel model=(DefaultTableModel) table1.getModel();
            model.setRowCount(0);
            id();
        }
    }                                        

    
    @SuppressWarnings("unused")
	private void executeSQLQuery2(String query,String d) {
       try{
           CustomDatabaseConnection cdb=new CustomDatabaseConnection(d);
           Statement st= cdb.getDbStatement();
          
           if(st.executeUpdate(query)==1){
               JOptionPane.showMessageDialog(null,"Success!!");
           }else{
           }
           
           
       }catch(Exception e){
            
       }
    }
    
    
    
    
    
    public void id(){
    	try{

    		ResultSet rs=st.executeQuery("select * from dls");
            
            DefaultTableModel model=(DefaultTableModel) table1.getModel();
            Object rowData[]=new Object[6];
            while(rs.next()){
                String s0=rs.getString("USERID");
                String s1=rs.getString("FULLName");
                String s2=rs.getString("Age");
                String s3=rs.getString("BLOODTYPE");
                String s4=rs.getString("PHONENUMBER");
                String s5=rs.getString("ADDRESS");
               String search=searchtxt.getText();
               
               if(search.equalsIgnoreCase(s0) || search.equalsIgnoreCase("")){
                rowData[0]=s0;
                rowData[1]=s1;
                rowData[2]=s2;
                rowData[3]=s3;
                rowData[4]=s5;
                rowData[5]=s4;
                model.addRow(rowData);
      
               }
              
           }  }catch(Exception e){ }
    }
    
    
    //name
    public void name(){
    	try{

    		ResultSet rs=st.executeQuery("select * from dls");
            DefaultTableModel model=(DefaultTableModel) table1.getModel();
            Object rowData[]=new Object[6];
            while(rs.next()){
                String s0=rs.getString("USERID");
                String s1=rs.getString("FULLName");
                String s2=rs.getString("Age");
                String s3=rs.getString("BLOODTYPE");
                String s4=rs.getString("PHONENUMBER");
                String s5=rs.getString("ADDRESS");
               String search=searchtxt.getText();
               
               if(search.equalsIgnoreCase(s1)|| search.equalsIgnoreCase("")){
                rowData[0]=s0;
                rowData[1]=s1;
                rowData[2]=s2;
                rowData[3]=s3;
                rowData[4]=s5;
                rowData[5]=s4;
                model.addRow(rowData);
      
               }
              
           }  }catch(Exception e){ }
    }
    
   
    public void bg(){;
    	
    	try {
    	//	ResultSet r=st.executeQuery("select * from bbcm where SSN="+ss);  
    	String q;//=r.getString("SSN");
    	 q="521254";
         ResultSet rs=st.executeQuery("SELECT USERID,BLOODCODE,BBANKCODE,BLOODTYPE\r\n"
           		+ "FROM blood \r\n"
          		+ "LEFT JOIN buser bu\r\n"
           		+ "using(USERID )\r\n"
          		+ "WHERE BBANKCODE="+q);
    	 
    	 DefaultTableModel model=(DefaultTableModel) table1.getModel();
           Object rowData[]=new Object[4];
          
           while(rs.next()){
        	  
               String s0=rs.getString("USERID");
               String s1=rs.getString("BLOODCODE");
               String s2=rs.getString("BBANKCODE");
               String s3=rs.getString("BLOODTYPE");        
               String search=searchtxt.getText();
               System.out.println(search);
			if(search.equalsIgnoreCase(s3)||search.equalsIgnoreCase("")){
                    rowData[0]=s0;
                    rowData[1]=s1;
                    rowData[2]=s2;
                    rowData[3]=s3;
               
                    model.addRow(rowData);  
               }
            }
       }catch(Exception e){
            
       }
    }
    
public static String BBCM() throws SQLException {
ResultSet r=st.executeQuery("SELECT SSN,BBANKCODE\r\n"+
    		""+ "FROM bloodbankmanager\r\n"+
    			"WHERE SSN="+ss);
String p;
p=r.getString("BBANKCODE");
 return p;
}
    // refresh
    public void refresh(){
        try{

           ResultSet rs=st.executeQuery("select * from dls");
           
           DefaultTableModel model=(DefaultTableModel) table1.getModel();
           Object rowData[]=new Object[6];
           while(rs.next()){
               String s0=rs.getString("USERID");
               String s1=rs.getString("FULLName");
               String s2=rs.getString("Age");
               String s3=rs.getString("BLOODTYPE");
               String s4=rs.getString("PHONENUMBER");
               String s5=rs.getString("ADDRESS");
               rowData[0]=s0;
               rowData[1]=s1;
               rowData[2]=s2;
               rowData[3]=s3;
               rowData[4]=s5;
               rowData[5]=s4;
               model.addRow(rowData);
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
                new DonorList(ss).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> box;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
   // private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
   // private javax.swing.JButton jButton9;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField searchtxt;
    private javax.swing.JTable table1;
    // End of variables declaration                   
}
