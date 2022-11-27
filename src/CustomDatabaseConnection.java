import DataBase.ConnectionDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CustomDatabaseConnection {


    //******  Do not change anything below ******//

    String url="jdbc:mysql://localhost/";
    String user;
    String pass;
    static Connection con;
    Statement st;

    public CustomDatabaseConnection(String databaseName) {
        ConnectionDatabase connectionDatabase=new ConnectionDatabase();
        url+=databaseName;
        user = connectionDatabase.getUser();
        pass= connectionDatabase.getPass();

        try{
            con= DriverManager.getConnection(url,user,pass);
            st=con.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public Statement getDbStatement(){
        return this.st;
    }
    public Connection getdbConnection() {
return con;
    	
    }
    }



