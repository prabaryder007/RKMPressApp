package com.rk.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dbutil.DbConnection;
import com.opensymphony.xwork2.ActionSupport;

public class BookAction extends ActionSupport {
	private List resultData;
	
	

	public List getResultData() {
		return resultData;
	}



	public void setResultData(List resultData) {
		this.resultData = resultData;
	}



	public String getBookList() {
		DbConnection dbCon = new DbConnection();
		Map inputParams = new HashMap();
		inputParams.put("query","select * from [dbo].[emp]");
		resultData = dbCon.fetchResultantData(inputParams);
		System.out.println("finalResult.size() :: "+resultData.size());
		System.out.println(resultData.toString());
		
		
		System.out.println("action");
		return "success";
	}
}
