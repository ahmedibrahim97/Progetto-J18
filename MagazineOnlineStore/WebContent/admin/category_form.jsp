<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http- charset="ISO-8859-1">
<title>
	<c:if test="${category != null}">
    	Modifica Categoria
    </c:if>
    <c:if test="${category == null}">
    	Crea Nuova Categoria
    </c:if>

</title>
    <link rel="stylesheet" href="../css/style.css">

</head>
<body>
	<jsp:directive.include file="header.jsp" />
    <div align="center">
        <h2 class="pageheading">
        	<c:if test="${category != null}">
        		Modifica Categoria
        	</c:if>
        	<c:if test="${category == null}">
        		Crea Nuova Categoria
        	</c:if>
        	
        </h2>
    </div>

    <div align="center">
    	<c:if test="${category != null}">
    		<form action="update_category" method="post" onsubmit="return validateFormInput();">
    		<input type="hidden" name="categoriaId" value="${category.categoriaId}">
    	</c:if>
    	
    	<c:if test="${category == null}">
    		<form action="create_category" method="post" onsubmit="return validateFormInput();">
    	</c:if>
    	
			<table class="form">
      			<tr>
      				<td align="right">Nome:</td>
      				<td align="left"><input type="text" id="name" name="name" size="20" value="${category.name}"/></td>
      			</tr>
      			 			
      			<tr><td>&nbsp;</td></tr>
      			<tr>
      				<td colspan="2" align="center">
      					<button type="submit">Salva</button>&nbsp;&nbsp;&nbsp;
      					<button onclick="javascript:history.go(-1);">Cancella</button>
      				</td>
      			</tr>
      		</table>
    </div>
    
    <jsp:directive.include file="footer.jsp" />
</body>

<script type="text/javascript">
	function validateFormInput() {
		var fieldName = document.getElementById("name");
		
		if (fieldName.value.length == 0) {
			alert("Campo Nome OBBLIGATORIO");
			fieldName.focus();
			return false;
		}
			
		return true;
	}
</script>


</html>













