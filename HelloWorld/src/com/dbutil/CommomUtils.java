/**
 * 
 */
package com.dbutil;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Ezhil
 *
 */
public class CommomUtils {
	/**
	 * converting ResultSet to List
	 * @param rs
	 * @return finalList
	 */
	public List convertResultToList(ResultSet rs) {
		List<Map<String, Object>> finalList = new ArrayList<Map<String, Object>>();
		try {
			ResultSetMetaData md = rs.getMetaData();
			int columns = md.getColumnCount();

			while (rs.next()){
				Map<String, Object> row = new HashMap<String, Object>(columns);
				for(int i = 1; i <= columns; ++i){
					row.put(md.getColumnName(i), rs.getObject(i));
				}
				finalList.add(row);
			}
		}catch(Exception e) {
			System.out.println("Exception in convertResultSetToList :: "+e);
			e.printStackTrace();
		}
		return finalList;
	}

}
