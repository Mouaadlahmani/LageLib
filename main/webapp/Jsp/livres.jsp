
<%--<%@ page import="metier.Produit" %>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>les livres</title>

    <link rel="stylesheet" href="Css/bootstrap.min.css">
    <link rel="stylesheet" href="Css/bootstrap2.min.css">
     <link rel="stylesheet" href="Css/livres.css">
</head>
<body>

<div class="content">
  <div class="panel panel-primary ">
    <div class="panel-heading d-flex justify-content-between align-items-center">
      <span>les livres</span>
     <%--  <form class="navbar-form navbar-left " action="chercher.pr" method="get">
            <input type="text" class="form-control" placeholder="Search" name="nom_produit" value="${model.motCle}">
             <button type="submit" class="btn btn-default">recherche</button>
      </form> --%>
    </div>
    <div class="panel-body">
        <table class="table table-bordered">
            <thead>
              <tr>
                <th>ID_livre</th>
                <th >Titre</th>
                <th>Auteur</th>
                <th>Editeur</th>
                <th>Anne de publication</th>
                <th >Supprimer</th>
                <th >Modifier</th>
              </tr>
            </thead>
            <tbody>
               <c:forEach items="${Touslivres.livres}" var="liv">
		             <tr>
		                 <td>${liv.id}</td>
		                 <td>${liv.titre}</td>
		                 <td>${liv.auteur}</td>
		                 <td>${liv.editeur}</td>
		                 <td>${liv.année_de_publication}</td>
		                 <td><a href="Supprimer.pr?id=${liv.id}"><img class="action_icon" src="images/supprimer.png"></a></td>
		                 <td><a href="Edit.pr?id=${liv.id}"><img class="action_icon" src="images/editer.png"></a></td>	
		               </tr>
               </c:forEach>

             <%--   <c:forEach items="${model.produits}" var="p">
		             <tr>
		                 <td>${p.id}</td>
		                 <td>${p.nomProduit}</td>
		                 <td>${p.prix}</td>
		                 <td>${p.quantite}</td>
		                 <td>${p.description}</td>
                         <td><a href="Supprimer.pr?id=${p.id}"><img class="action_icon" src="images/supprimer.png"></a></td>
		                 <td><a href="Edit.pr?id=${p.id}"><img class="action_icon" src="images/editer.png"></a></td>		               
		             </tr>
               </c:forEach> --%>
             
            </tbody>
          </table>
    </div>
    <!-- <div class="panel-footer">Panel Footer</div> -->
  </div>
</div>



<!-- <script src="js/main.js"></script> -->
</body>

</html>