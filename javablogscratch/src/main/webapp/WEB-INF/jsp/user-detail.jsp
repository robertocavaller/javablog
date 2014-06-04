<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>${user.name }</h1>

<c:forEach items="${user.blogs}" var="blog">

	<h1>${blog.name}</h1>
	<p>${blog.url}</p>

	<table class="table table-bordered table-hover table-striped">
		<thead>
			<tr>
				<th>Title</th>
				<th>Link</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach items="${blog.items}" var="item">
			
			<tr>
				<th>${item.title}</th>
				<th>${item.link}</th>

			</tr>
			
			</c:forEach>
		
		
		</tbody>

	</table>

</c:forEach>