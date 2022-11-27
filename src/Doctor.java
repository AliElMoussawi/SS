
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;


/**
 *
 * @author Ali
 */
@SuppressWarnings("serial")
public class Doctor extends javax.swing.JFrame {

    /**
     * Creates new form manager
     */
	static CustomDatabaseConnection db;
    static Statement st;
    static String SSN;
    static Connection con;
    static int count=0;
    public Doctor() {
    	db=new CustomDatabaseConnection("systematic_squad");
        con=db.getdbConnection();
        st=db.getDbStatement();
        initComponents();
        this.setLocationRelativeTo(null);
        refresh();
        
    }
    
    String person="";
    private void initComponents() {
        jLabel4 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1214, 712));
        setUndecorated(true);
        getContentPane().setLayout(null);

     //   jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 20, 60, 50);
        getContentPane().add(jSeparator9);
        jSeparator9.setBounds(0, 710, 270, 10);

        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N

        jPanel2.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Doctor Check", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jPanel1.setLayout(null);

        table.setBackground(new java.awt.Color(204, 255, 255));
        table.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
    	table.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Donor  ID", "diagnosis", "medicines"
                }
            ) {
                boolean[] canEdit = new boolean [] {
                    false, false, false 
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];  } });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
 
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 22, 776, 300);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(0, 0, 930, 530);
        jButton10 = new javax.swing.JButton();
        jButton10.setBounds(20, 457, 180, 62);
        jPanel1.add(jButton10);
        
                jButton10.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
                jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exitx24.png"))); // NOI18N
                jButton10.setText("        Exit");
                jButton10.setContentAreaFilled(false);
                jButton5 = new javax.swing.JButton();
                jButton5.setBounds(0, 109, 1, 67);
                jPanel1.add(jButton5);
                
                        jButton5.setBackground(new java.awt.Color(102, 102, 102));
                        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
                        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/requestsx24.png"))); // NOI18N
                        jButton5.setText("        Requests");
                        
                        approvebutton = new JButton("donate");
                        approvebutton.addActionListener(new ActionListener() {
                        	public void actionPerformed(java.awt.event.ActionEvent evt) {
                        		try {
									jButton0ActionPerformed(evt);
								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
                        	}
                        });
                        approvebutton.setBounds(527, 373, 89, 23);
                        jPanel1.add(approvebutton);
                        
                        appove = new JLabel("Approved donor:");
                        appove.setBounds(259, 367, 89, 34);
                        jPanel1.add(appove);
                        
                        approvetxt = new JTextField();
                        approvetxt.setBounds(358, 367, 134, 32);
                        jPanel1.add(approvetxt);
                        approvetxt.setColumns(10);
                        jButton5.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton5ActionPerformed(evt);
                            }
                        });
                jButton10.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton10ActionPerformed(evt);
                    }
                });

        jTabbedPane1.addTab("Doctor", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(280, 164, 793, 556);

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
        jLabel1.setBounds(263, 459, 7, 461);

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(263, 174, 7, 306);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 0, 800, 180);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
    	 String n=approvetxt.getText();
    	boolean exist=false;
    	 ResultSet rs1=st.executeQuery("SELECT USERID from doctorcheck");
        while(rs1.next()){
        	if(n.equals(rs1.getString("USERID"))) {
        		exist=true;
        	} }
       if(exist) {
    	PreparedStatement st = con.prepareStatement("delete from doctorcheck where USERID= ?");
     	st.setString(1,n);
     	st.execute();
    	ResultSet rs=st.executeQuery("SELECT USERID,PHONENUMBER FROM buser");
    	String phonenb="";
        while(rs.next()){
        	if(n.equals(rs.getString("USERID"))) {
        		phonenb=rs.getString("PHONENUMBER");
        	} }
        Date dt=new Date();
        
        DateFormat dformate=new SimpleDateFormat("dd/MM/YYYY");
        
        String date=dformate.format(dt);
        
        LocalTime t=LocalTime.now();
        
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("hh:mm a");
        String time=t.format(dtf);
        
       
        
        //done.
        
        String dateTime=time+"  "+date;
       
        if(!checkuser(n)) {
        	PreparedStatement st2 = con.prepareStatement("INSERT INTO DONOR(USERID,PHONENUMBER,DOLD,donations)VALUES (?,?,?,?)");
    		st2.setString(1,n);
         	st2.execute();
         	st2.setString(2,phonenb);
         	st2.execute();
         	st2.setString(3,dateTime);
         	st2.execute();
         	st2.setInt(4,1);
         	st2.execute();
    }else if(checkuser(n)) {
    	PreparedStatement st3 = con.prepareStatement("UPDATE buser SET donations = donations+1 WHERE USERID= ?");
    	
     	st3.setString(1, n);
     	st3.execute();
     	
    } 
        
        PreparedStatement st12 = con.prepareStatement("INSERT INTO blood(BLOODCODE,USERID,PHONENUMBER) VALUES (?,?,?)");
        st12.setString(1,10000+count+"");
        count++;
     	st12.execute();
        st12.setString(2,n);
     	st12.execute();
     	st12.setString(3,phonenb);
     	st12.execute();
  }     else {        		
    JOptionPane.showConfirmDialog(null,"check your input","Congrats",JOptionPane.YES_NO_OPTION);

    
          }
    }
    public boolean checkuser(String n) throws SQLException {
    	
   	 ResultSet rs=st.executeQuery("select * from DONOR");
   	 while(rs.next()){
            if(n.equals(rs.getString("USERID"))) {
           	 return true;
            }
            
   }return false;}
     
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        int check=JOptionPane.showConfirmDialog(null,"YES     for     Exit\nNO       for    ReLogin ","Choose one...",JOptionPane.YES_NO_OPTION);
        if(check==0){
          
           
            System.exit(0);
        }
        if(check==1){
           
            login l=new login();
            
            l.setVisible(true);
            close();
        }
    }//GEN-LAST:event_jButton10ActionPerformed

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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
    }//GEN-LAST:event_jButton5ActionPerformed
    

   
    
    @SuppressWarnings("unused")
	private void executeSQLQuery2(String query,String d) {
       try{
           CustomDatabaseConnection cdb=new CustomDatabaseConnection(d);
           Statement st= cdb.getDbStatement();
          
           if(st.executeUpdate(query)==1){
               JOptionPane.showConfirmDialog(null,"Thank You!!!!!!","Congrats!",JOptionPane.OK_OPTION);
           }else{ 
           }
           
           
       }catch(Exception e){
            
       }
    }
    
    
    
    
    
    
    
    
    public void refresh(){
        try{

           ResultSet rs=st.executeQuery("SELECT * FROM VDOCTORCHECK");
           
           DefaultTableModel model=(DefaultTableModel) table.getModel();
           Object rowData[]=new Object[3];
           while(rs.next()){
               String s0=rs.getString("USERID");
               String s1=rs.getString("MEDICATION");
               String s2=rs.getString("DIAGNOSIS");
               rowData[0]=s0;
               rowData[1]=s1;
               rowData[2]=s2;
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
                new Doctor().setVisible(true);
            }
        });
    }
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable table;
    private JButton approvebutton;
    private JLabel appove;
    private JTextField approvetxt;
}
