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

	<form method="post" action="cliente">
	
		<div class="row">
			<div class="col-6">
				<div class="form-group">
				    <label>Razão social</label>
				    <input type="text" class="form-control" name="nome">    
				  </div>
			</div>
			<div class="col-6">
				<div class="form-group">
				    <label>Endereço</label>
				    <input type="text" class="form-control" name="endereco">    
				  </div>
			</div>
		</div>
		
		<div class="row">
			<div class="col-6">
				<div class="form-group">
				    <label>Telefone</label>
				    <input type="text" class="form-control" name="telefone">    
				  </div>
			</div>
			<div class="col-6">
				<div class="form-group">
				    <label>Email</label>
				    <input type="email" class="form-control" name="email">    
				  </div>
			</div>
		</div>  
	  
	  <button type="submit" class="btn btn-success">Salvar</button>
	</form>
</div>


<jsp:include page='../master/footer.jsp'></jsp:include>