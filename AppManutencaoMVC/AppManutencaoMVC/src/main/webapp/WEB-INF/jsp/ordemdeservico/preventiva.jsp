<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>

<jsp:include page='../master/header.jsp'></jsp:include>
<jsp:include page='../master/menu.jsp'></jsp:include>

<div class="container mt-3">

	<div class="btn-toolbar" role="toolbar" aria-label="Toolbar with button groups">
		<a href="/solicitacao/${solicitacao.getId()}/detalhe">
			<div class="btn-group mb-3" role="group" aria-label="Third group">
		    	<button type="button" class="btn btn-primary">Voltar</button>
		  	</div>
	  	</a>	  	
	</div>

	<form method="post" action="/solicitacao/preventiva">
		<input type="hidden" class="form-control" name="solicitacaoId" value="${solicitacao.getId()}">
	
		<div class="row">
			<div class="col-6">
				<div class="form-group">
			    	<label>Data</label>
			    	<input type="date" class="form-control" name="data">    
			  	</div>
			</div>
			<div class="col-6">
				<div class="form-group">
			    	<label>Engenheiro</label>
			    	<input type="text" class="form-control" name="engenheiro">    
			  	</div>
			</div>
		</div>
		
		<div class="row">
			<div class="col-6">
				<div class="form-group">
			    	<label>Tag equipamento</label>
			    	<input type="text" class="form-control" name="tagEquipamento"> 
			  	</div>
			</div>
			<div class="col-6">
				<div class="form-group">
			    	<label>Tarefa</label>
			    	<input type="text" class="form-control" name="tarefa">  
			  	</div>
			</div>
		</div>	
		
	  	<button type="submit" class="btn btn-success">Salvar</button>
	</form>


</div>
<jsp:include page='../master/footer.jsp'></jsp:include>