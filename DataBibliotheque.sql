DROP DATABASE IF EXISTS bibliotheque;
CREATE DATABASE IF NOT EXISTS bibliotheque;
use bibliotheque;
DROP TABLE IF EXISTS  users ;
DROP TABLE IF EXISTS membres ;
DROP TABLE IF EXISTS emprunts;
DROP TABLE IF EXISTS livres;

create table if not exists users(
	user_id int auto_increment,
    username varchar(30),
    passwd varchar(30),
    primary key (user_id)
    
);
create table if not exists membres(
	  mem_id int auto_increment,
      nom_mem varchar(30),
      adresse_mem varchar(45),
      telephone_mem int ,
      primary key(mem_id)
);

create table if not exists livres(
       livre_id int auto_increment,
       titre varchar(40),
       auteur varchar(40),
	   editeur varchar(40),
	   année_de_publication date,
	   primary key(livre_id)
);

create table if not exists emprunts(
	livre_id int,
    mem_id int,
    date_retour date,
    date_emprunt date,
    statut varchar(30) check (statut in('en cours','en retard','terminé')),
   FOREIGN KEY (livre_id) REFERENCES livres(livre_id),
   FOREIGN KEY (mem_id) REFERENCES membres (mem_id)
);


select *from livres;


