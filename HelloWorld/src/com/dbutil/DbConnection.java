package com.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Map;

/**
 * @author Ezhil
 *
 */
public class DbConnection {
	CommomUtils comUtil = new CommomUtils();
	/**
	 * Establishing DB connection
	 * @return conn
	 */
	public Connection getDbConnection() {
		Connection conn = null;
		try {
		   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	       conn = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-SD852JHV\\SQLEXPRESS;database=PressDB;integratedSecurity=true;");
		}catch(Exception e) {
			System.out.println("Exception in DbConnection :: "+e);
			e.printStackTrace();
		}
		return conn;
	}
	/**
	 * Retrieving resultant data as json 
	 * @return
	 */
	public List fetchResultantData(Map inputParams) {
		List result = null ;
		Connection con = getDbConnection();
		String query ="";
		if(inputParams.containsKey("query") && inputParams.get("query")!=null) {
			query = inputParams.get("query").toString();
		}
		try {
			if(con != null) {
				Statement stmt = con.createStatement();
				ResultSet rs= stmt.executeQuery(query);
				result = comUtil.convertResultToList(rs);	
			}
		}catch(Exception e) {
			System.out.println("Exception in fetchResultantData :: "+e);
			e.printStackTrace();
		}
		
		return result;
	}

}
