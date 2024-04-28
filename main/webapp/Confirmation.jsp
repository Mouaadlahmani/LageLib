<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Confirmation</title>
</head>
<body>
<div class="from-group">
	<label class="control-label">Livre Id</label>
	<label>${Emprunts.livreId}</label>
	</div>
	
	 <div class="from-group">
	<label class="control-label">Membre Id</label>
	<label>${Emprunts.membreId}</label>
	</div>
	
	 <div class="from-group">
	<label class="control-label">Date de retour</label>
	<label>${Emprunts.dateRetour}</label>
	</div>
	
	<div class="from-group">
	<label class="control-label">Date d'emprunt</label>
	<label>${Emprunts.dateEmprunt}</label>
	</div>
</body>
</html>