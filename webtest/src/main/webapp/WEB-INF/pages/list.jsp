<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>Hello</title>  
</head>  
<body>  
 <table border="1" align="center" >
 	<tr>
 		 <td>id</td>
 		 <td>姓名</td>
 		 <td>描述</td>
 	</tr>
 	<c:forEach var="people" items="${lists}" >   
          <tr>   
	          <td> <c:out value="${people.id}" /> </td>   
	          <td> <c:out value="${people.namep}" /> </td>   
	          <td> <c:out value="${people.decp}"/> </td>   
          </tr>   
 	</c:forEach>   
 </table>
</body>  
</html> 