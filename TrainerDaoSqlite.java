package dataLayer.dataAccessObjects.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import businessObjects.ITrainer;

import dataLayer.dataAccessObjects.ITrainerDao;


public class TrainerDaoSqlite implements ITrainerDao{

	
	static Connection connection = null;  
	  
    Statement statement = null; 
    ResultSet rs;
    
    private int id; 
	private String nname; 
	private String vname;  
	private int alter; 
	private int erfahrung;

        public TrainerDaoSqlite()
        {
        }
	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		

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

	@Override
	public ITrainer createTrainer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(ITrainer iTrainer) {
		
		try {
			rs = statement.executeQuery( "DELETE FROM Trainer where trainerID =" + iTrainer.getId() );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ITrainer selectFirst() {
		ITrainer trainer = null ;
		try {
			rs = statement.executeQuery( "Select * FROM Trainer order by trainerID fetch first 1 rows only ");
			trainer = (ITrainer) rs.getObject(0);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return trainer;
	}

	@Override
	public ITrainer selectLast() {
		ITrainer trainer = null ;
		try {
			rs = statement.executeQuery( "Select * FROM Trainer order by trainerID desc fetch first 1 rows only ");
			trainer = (ITrainer) rs.getObject(0);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return trainer;
	}

	@Override
	public ITrainer selectNext(ITrainer iTrainer) {
		ITrainer trainer = null ;
		try {
			rs = statement.executeQuery( "Select * FROM Trainer where trainerID > " +trainer.getId()+ "order by trainerID fetch first 1 rows only ");
			trainer = (ITrainer) rs.getObject(0);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return trainer;
	}

	@Override
	public ITrainer selectPrevious(ITrainer iTrainer) {
		ITrainer trainer = null ;
		try {
			rs = statement.executeQuery( "Select * FROM Trainer where trainerID < " +trainer.getId()+ "order by trainerID desc fetch first 1 rows only ");
			trainer = (ITrainer) rs.getObject(0);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return trainer;
	}

	@Override
	public void save(ITrainer iTrainer) {
		ITrainer trainer = null ;
		try {
			rs = statement.executeQuery( "insert into Trainer values(" +trainer.getId()+","+trainer.getNName()+"," +trainer.getVName()+","+trainer.getAlter()+","+trainer.getErfahrung()+") " );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<ITrainer> selectTrainer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITrainer selectTrainerById(int id) {
		ITrainer trainer = null ;
		try {
			rs = statement.executeQuery( "Select * FROM Trainer where trainerID = " + id);
			trainer = (ITrainer) rs.getObject(0);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return trainer;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	} 

}
