<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="js/jquery.dataTables.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/jquery.dataTables.min.css"/>
<script type="text/javascript">
	$(document).ready(function() {
		var bookType= "<%=request.getParameter("bookType") %>";
		$.ajax({
			url : "getBookDetails",
			method : "post",
			data : bookType,
			success : function(data) {
				console.log(data);
				var tableData=data.resultData;
				console.log(tableData);
				var colKeys = tableData[0];
				var columnData = new Array();
				var tableString="<tr>";
				for(var k in colKeys){
					var obj = {};
					obj["data"]=k;
					columnData.push(obj)
					tableString += "<th>"+k+"</th>"
				}
				tableString+= "</tr>"
				$("#myTable").html(tableString);
				console.log(columnData)
				$("#myTable").DataTable({
							data : tableData,
								columns :columnData
							});
						}
					})
				});
</script>
</head>
<body>
	<p>Welcome to Book page</p>
	<table id="myTable">
		
	</table>
</body>
</html>