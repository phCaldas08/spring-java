<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<h2>Lista de Alunos</h2>
		<form action="aluno/novo" method="post">
			<label>RM</br>
				<input name="rm"  type="text"/>
			</label>
			</br>
			<label>Nome</br>
				<input name="nome"  type="text"/>
			</label></br>
			<label>Nota</br>
				<input name="nota" type="text"/>
			</label>
			</br>
			</br>
			<input value="adicionar" type="submit"/>			
		</form>		
		</br>
		</br>
		<table>
			<thead>
				<tr>
					<th>RM</th>
					<th>Aluno</th>
					<th>Nota</th>
					<th>Passou?</th>
				</tr>			
			</thead>
			<tbody>
				<c:forEach var="aluno" items="${listaAlunos}">
					<tr>
						<td>${aluno.rm}</td>
						<td>${aluno.nome}</td>
						<td>${aluno.nota}</td>
						<td>
							<c:if test="${aluno.passou}">
								Sim
							</c:if>
							<c:if test="${!aluno.passou}">
								Não
							</c:if>								
						</td>
						<td>
							<form action="aluno/delete" method="post">
								<input name="rm" value="${aluno.rm}" style="display: none">
								<button type="submit">DELETE</button>
							</form>
						</td>
					</tr>	
				</c:forEach>		
			</tbody>		
		</table>	
	</body>
</html>