
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Ali
 */
@SuppressWarnings("serial")
public class Requests extends javax.swing.JFrame {

    /**
     * Creates new form manager
     */
    DatabaseConnection db;
    Statement st;
    static String SSN;
    public Requests(String s) {
        db=new DatabaseConnection();
        st=db.getDbStatement();
        SSN=s;
        initComponents();
        this.setLocationRelativeTo(null);
        refresh();
        
    }
    
    String person="";
    private void initComponents() {
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
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

     //   jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 20, 60, 50);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
     //   jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/managerx24.png"))); // NOI18N
        jButton2.setText("           manager");
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(0, 160, 270, 59);
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
        getContentPane().add(jSeparator9);
        jSeparator9.setBounds(0, 710, 270, 10);

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
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
        jButton4.setBounds(0, 227, 270, 60);

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/requestsx24.png"))); // NOI18N
        jButton5.setText("        Requests");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(0, 290, 270, 67);

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
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(0, 430, 270, 70);

        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N

        jPanel2.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Requests", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jPanel1.setLayout(null);

        table.setBackground(new java.awt.Color(204, 255, 255));
        table.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
    	table.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Recipient  ID", "Name", "Age", "Blood Group", "Address", "Contact"
                }
            ) {
                boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false,  false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];  } });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
            table.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 22, 910, 440);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(0, 0, 930, 530);

        jTabbedPane1.addTab("Requests", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(280, 160, 940, 560);

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
        jButton10.setBounds(0, 570, 270, 62);

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
        jLabel3.setBounds(270, 0, 940, 180);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(1060, 0, 150, 180);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

     
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        int check=JOptionPane.showConfirmDialog(null,"YES     for     Exit\nNO       for    ReLogin ","Choose one...",JOptionPane.YES_NO_OPTION);
        if(check==0){
            //code suru
           
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
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        manager h=new manager(SSN);
      
        h.setVisible(true);
        close();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        DonorList dl=new DonorList(SSN);
        dl.setVisible(true);
        close();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     
            AddDonor ad=new AddDonor(SSN);
             ad.setVisible(true);
             close();
        }
    

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_jButton8ActionPerformed
      
        
        
        request a=new request(SSN);
        a.setVisible(true);
        close();
        }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         
          Profile p=new Profile(SSN);
     
        p.setVisible(true);
        close(); 
    }//GEN-LAST:event_jButton4ActionPerformed

    
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

           ResultSet rs=st.executeQuery("select * from reqlist");
           
           DefaultTableModel model=(DefaultTableModel) table.getModel();
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
                new Requests(SSN).setVisible(true);
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
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable table;
}
