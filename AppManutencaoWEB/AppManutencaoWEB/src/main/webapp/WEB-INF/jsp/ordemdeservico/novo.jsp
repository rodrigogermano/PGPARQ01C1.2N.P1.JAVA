<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>

<jsp:include page='../master/header.jsp'></jsp:include>
<jsp:include page='../master/menu.jsp'></jsp:include>

<div class="container mt-3">

	<div class="btn-toolbar" role="toolbar" aria-label="Toolbar with button groups">
		<a href="/home">
			<div class="btn-group mb-3" role="group" aria-label="Third group">
		    	<button type="button" class="btn btn-primary">Voltar</button>
		  	</div>
	  	</a>	  	
	</div>

	<form method="post" action="solicitacao">
		
		<div class="row">
			<div class="col-6">
				<div class="form-group">
			    	<label>Cliente</label>
			    	<select class="form-control" name="cliente.id">
					    <c:forEach var="cliente" items="${clientes}">
							<option value="${cliente.id}">${cliente.nome}</option>
						</c:forEach> 		      
			    	</select>
			  	</div>
			</div>
			<div class="col-6">
				<div class="form-group">
			    	<label>Equipe</label>
			    	<input type="text" class="form-control" name="equipe">    
			  	</div>
			</div>
		</div>
		
		<div class="row">
			<div class="col-6">
				<div class="form-group">
			    	<label>Placa do carro</label>
			    	<input type="text" class="form-control" name="placaDoCarro">    
			  	</div>
			</div>
			<div class="col-6">
				<div class="form-group">
			    	<label>Turno</label>
			    	<select class="form-control" name="turno">
			    		<option value="1">Manhã</option>
			    		<option value="2">Tarde</option>
			    		<option value="3">Noite</option>
			    	</select>    
			  	</div>
			</div>
		</div>	  	
	  	
	  	<button type="submit" class="btn btn-success">Salvar</button>
	</form>


</div>
<jsp:include page='../master/footer.jsp'></jsp:include>