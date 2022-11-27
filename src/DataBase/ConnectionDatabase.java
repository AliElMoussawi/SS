package DataBase;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionDatabase {

    // Change only these properties if necessary
    String DatabaseName="systematic_squad";
    String db_user="root";
    String db_pass="";

    String url="jdbc:mysql://localhost:3306/"+DatabaseName;
    Connection con;
    Statement st;

    public ConnectionDatabase() {
        try{
            this.con= DriverManager.getConnection(url,db_user,db_pass);
            this.st=con.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public Statement getDbStatement(){
        return this.st;
    }


    public String getUser() {
        return db_user;
    }

    public String getPass() {
        return db_pass;
    }
}