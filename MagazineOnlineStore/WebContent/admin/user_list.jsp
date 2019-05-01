
<%@ page language="java" contentType="text/html;charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  <!-- Presa dal sito di oracle(JSTL Core taglib)
                                                                        Che mi serve per iterare una collezione, infatti
                                                                        uso il forEach in questo file-->

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="ISO-8859-1">
    <title>Gestire gli Utenti - MagazineStore Administration</title>
    <link rel="stylesheet" href="../css/style.css">
    
</head>
<body>
<jsp:directive.include file="/admin/header.jsp" />
    <div align="center">
        <h2 class="pageheading">Gestione Utenti</h2>
        <h3><a href="user_form.jsp">Crea nuovo Utente</a></h3>
    </div>
    
    <c:if test="${message != null}">
    <div align="center">
    	<h4 class="message">${message}</h4>
    </div>
	</c:if>
    <div align="center">
        <table border="1" cellpadding="5">
            <tr>
                <th>Index</th>
                <th>ID</th>
                <th>Email</th>
                <th>Nome Completo</th>
                <th>Azioni</th>
            </tr>
            <%--Per ogni oggetto utente nella collezione creamo una nuova riga di tabella--%>
            <%--var="user" � il nome della variable usata nel ciclo for
                items: punta al nome della variabile "listUser" nel request(presente nella classe ListUserServlet)
                che deve corrispondere al nome che abbiamo specificato come attributo--%>
            <c:forEach var="user" items="${listUsers}" varStatus="status">
                <tr>
                    <%--&lt;%&ndash;prima colonna: index&ndash;%&gt;--%>
                    <td>${status.index + 1}</td>
                    <td>${user.userId}</td>
                    <td>${user.email}</td>
                    <td>${user.fullName}</td>
                    <td>
                    	<a href="edit_user?id=${user.userId}">Modifica</a>
                    	<a href="javascript:confirmDelete(${user.userId})">Elimina</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
        
    </div>



	<jsp:directive.include file="footer.jsp" />	
	
	<script type="text/javascript">
		function confirmDelete(userId) {
			if(confirm("Sei sicuro di eliminare utente con ID: " + userId + "?"))	{
				window.location = 'delete_user?id=' + userId;
			}	
		}
	</script>
</body>
</html>
