<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Hello World</title>
<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	alert("started");
	$("li").click(function(){
		//alert($(this).attr('id'));
		var book_type = $(this).attr('id');
		$("#book_Type").val(book_type);
		location.href="BookTable.jsp?bookType="+book_type;
		//$("#Start").submit();
		/* $.ajax({
			url:"getBookDetails",
			method:"post",
			data:book_type,
			success:function(){
				
			}
		}) */
	});
});
function myFunction() {
	 document.getElementById("demo").innerHTML = "Paragraph changed.";
}
</script>
</head>
<body>
  <!--  <h1>Hello World - Struts2</h1>
   <form action="hello" name="frm">
      <label for="name">Please enter your name</label><br/>
      <input type="text" name="name"/>
      <input type="submit" value="Say Hello"/>
   </form> -->
   <form action="getBookDetails" name="rk" id="Start">
      <input type="hidden" name="name" id="book_Type"  value=""/>
   </form>
   <!-- <button type="button" onclick="myFunction()">Try it</button> -->
   <ul>
  	<li id="tamil"><a href="#">Tamil book</a></li>
  	<li id="english"><a href="#">English book</a></li>
  	<li id="hindi"><a href="#">Hindi book</a></li>
   </ul>  
</body>
</html>
