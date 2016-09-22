package JavaTrainer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TrainerDaoSqlite implements ITrainerDao{

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection connection = null;  
	  
	    Statement statement = null;  

	      try {
	        Class.forName("org.sqlite.JDBC");
	        /* Achtung!!!!!!!
	         Link von Databse eingeben
	        */ 
	        connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/fa15mylvakanam/Desktop/javaTrainer.db");
	      } catch ( Exception e ) {
	        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	        System.exit(0);
	      }
	      System.out.println("Opened database successfully");
	    
	
	
	      /*statement = connection.createStatement();
          ResultSet rs = statement.executeQuery( "SELECT trainerID FROM Trainer;" );
          while ( rs.next() ) {
        	  int id = rs.getInt("trainerID");
              System.out.println("id = " + id);
                          
           }*/
    
	
    } 

}
