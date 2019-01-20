package com.dbutil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Prabakaran
 *
 */
public class Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DbConnection dbCon = new DbConnection();
		Map inputParams = new HashMap();
		inputParams.put("query","select * from [dbo].[emp]");
		List finalResult = dbCon.fetchResultantData(inputParams);
		System.out.println("finalResult.size() :: "+finalResult.size());
		System.out.println(finalResult.toString());
	}

}
