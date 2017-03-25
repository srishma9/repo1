package seleniumdemo;		
import  java.sql.Connection;		
import  java.sql.Statement;		
import  java.sql.ResultSet;		
import  java.sql.DriverManager;		
import  java.sql.SQLException;		
public class  SQLConnector {				
    	public static void  main(String[] args) throws  ClassNotFoundException, SQLException {													
				//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
                String dbUrl = "jdbc:sqlserver://localhost;user=sa;password=pwd123";					

				//Database Username		
				//String username = "sa";	
                
				//Database Password		
				//String password = "pwd123";				

				//Query to Execute		
				String query = "select *  from CUSTOMERS;";	
                try {
        			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        			//connDB = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;user=sa;password=pwd123;databaseName=OnlineExaminationSystem");
        			
        			
        		} catch (ClassNotFoundException e) {
        			e.printStackTrace();
        		}
        		
        	
         	    //Load mysql jdbc driver		
           	   
           
           		//Create Connection to DB		
            	Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost;user=sa;password=pwd123;database=testDB");
          
          		//Create Statement Object		
        	   Statement stmt = con.createStatement();					
       
       			// Execute the SQL Query. Store results in ResultSet		
         		ResultSet rs= stmt.executeQuery(query);							
         
         		// While Loop to iterate through all data and print results		
				while (rs.next()){
			        		String ID=rs.getString(1);
					        String NAME	 = rs.getString(2);								        
                            String AGE = rs.getString(3);
                            String ADDRESS=rs.getString(4);
                            String SALARY=rs.getString(5);
                            System.out.println(ID+""+NAME+"  "+AGE+""+ADDRESS+""+SALARY);	
                    }		
      			 // closing DB Connection		
      			con.close();			
		}
}