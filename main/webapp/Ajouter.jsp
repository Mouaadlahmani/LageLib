<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ajouter-Emprunt</title>
</head>
<body>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gestion library</title>
<link rel="stylesheet" type="text/css" href="Css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="Css/style.css">
</head>
<body>
<div class="container">
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="ajouter.java">Ajouter</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="home.java">Home</a>
      </li>
    <form action="chercher.java" method="get" class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="text" placeholder="Chercher" name="motCle" value="${model.motCle}">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Chercher</button>
    </form>
  </div>
</nav>
<form action="save.java" method="post">
 <div class="from-group">
	<label class="control-label">Livre Id</label>
	<input type="text" name="livreId" class="form-control">
	<span></span>
	</div>
	
	 <div class="from-group">
	<label class="control-label">Membre Id</label>
	<input type="text" name="membreId" class="form-control">
	<span></span>
	</div>
	
	 <div class="from-group">
	<label class="control-label">Date de retour</label>
	<input type="date" name="dateRetour" class="form-control">
	<span></span>
	</div>
	
	<div class="from-group">
	<label class="control-label">Date d'emprunt</label>
	<input type="date" name="dateEmprunt" class="form-control">
	<span></span>
	</div>
	
	<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Save</button>
</form>
</div>
</body>
</html>
</body>
</html>