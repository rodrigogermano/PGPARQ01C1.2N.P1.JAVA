<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>

<jsp:include page='../master/header.jsp'></jsp:include>
<jsp:include page='../master/menu.jsp'></jsp:include>

<div class="container mt-3">

	<div class="row">
		<div class="col-12">
			<div class="btn-toolbar" role="toolbar" aria-label="Toolbar with button groups">
				<a href="/home">
					<div class="btn-group mr-3 mb-3" role="group" aria-label="Third group">
				    	<button type="button" class="btn btn-primary">Voltar</button>
				  	</div>
			  	</a>
			  	<a href="/solicitacao/${solicitacao.getId()}/excluir">
					<div class="btn-group" role="group" aria-label="Third group">
				    	<button type="button" class="btn btn-danger">Excluir</button>
				  	</div>
			  	</a>
			</div>
		</div>	
	</div>

	<div class="row">
		<div class="col-6">
			<div class="form-group">
		    	<label>Cliente</label>
		    	<input type="text" class="form-control" value="${solicitacao.getCliente().getNome()}" readonly>    	 
		  	</div>	 
		</div>
		<div class="col-6">
			<div class="form-group">
		    	<label>Equipe</label>
		    	<input type="text" class="form-control" value="${solicitacao.getEquipe()}" readonly>    
		  	</div>
		</div>
	</div>
	
	<div class="row">
		<div class="col-6">
			<div class="form-group">
		    	<label>Placa do carro</label>
		    	<input type="text" class="form-control" value="${solicitacao.getPlacaDoCarro()}" readonly>    
		  	</div>
		</div>
		<div class="col-6">
			<div class="form-group">
		    	<label>Turno</label>
		    	<select class="form-control" value="${solicitacao.getTurno()}" disabled>
		    		<option value="1">Manh�</option>
		    		<option value="2">Tarde</option>
		    		<option value="3">Noite</option>
		    	</select>    
		  	</div>
		</div>
	</div>
	
	
	<div class="btn-group" role="group" aria-label="Button group with nested dropdown">
	  <div class="btn-group" role="group">
	    <button id="btnGroupDrop1" type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
	      <span class="material-icons">add</span> Servi�o
	    </button>
	    <div class="dropdown-menu" aria-labelledby="btnGroupDrop1">
	      <a class="dropdown-item" href="/solicitacao/${solicitacao.getId()}/corretiva">Corretiva</a>
	      <a class="dropdown-item" href="/solicitacao/${solicitacao.getId()}/preditiva">Preditiva</a>
	      <a class="dropdown-item" href="/solicitacao/${solicitacao.getId()}/preventiva">Preventiva</a>
	    </div>
	  </div>
	</div>
	
	
	<table class="table table-striped mt-3">
	  <thead>
	    <tr>
	      <th scope="col">Servi�os</th>	      
	    </tr>
	  </thead>
	  <tbody>
	  	<c:forEach var="ordem" items="${solicitacao.getOrdensDeServico()}">
		    <tr>		    
		      <td>${ordem}</td>		      
		    </tr>
		</c:forEach>     
	  </tbody>
	</table>
		
  	
</div>
<jsp:include page='../master/footer.jsp'></jsp:include>