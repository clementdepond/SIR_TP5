# Compte-rendu du TP5

Pour information, ce README.md regroupera aussi la partie JaxRS et RestEasy que nous avons mis dans un autre repo github.

## Partie Restlet

Dans cette partie, nous avons essayé de développer un formulaire, qui, après envoie, enverrai un récapitulatif des informations envoyées. Seulement, nous avons eu un problème. 
Déjà dans la partie d'avant c'était le cas, mais avec votre exemple de myform.html avec UserInfo, lorsque nous envoyions les informations, la page nous renvoyais que l'URI /UserInfo n'existais pas. Évidemment nous avons eu le même problème avec les 3 objets du Kanban.

Nous lancions jetty sur un terminal avec :

```
mvn jetty:run
```

Le serveur jetty se lançait parfaitement mais c'est lors de la validation du formulaire que la vérification renvoyait des "null".

Nous avons tout de même réalisé 3 formulaires pour ajouter les 3 types d'objet, mais le problème persiste pour ces derniers : 

Vous pouvez accèder aux 3 formulaires ici (après lancement de jetty évidemment) :

[Fiche](http://localhost:8080/addfiche.html)
[Tag](http://localhost:8080/addtag.html)
[Utilisateur](http://localhost:8080/adduser.html)

## Partie JaxRS et RestEasy

Pour les exemples que vous avez demandé d'implémenter nous avons été obligé de les enlever car on a eu un problème. En effet, nous avions implémenter l'exemple simple du [MessageServiceRest](https://mkyong.com/webservices/jax-rs/resteasy-hello-world-example/) de votre site. Il marchait bien puis un moment donné, en lançant le serveur Rest, ça nous disait qu'il ne détectait pas d'interface et même en enlevant les dépendances etc, le problème persistait. On a du donc reprendre la version sans l'ajout de l'exemple. En essayant de la ré-implémenter, le problème est revenu donc nous avons décidé de ne pas le mettre. 

Pour la partie JaxRS, nous avons donc créer un domaine pour nos trois objets : Fiche, Tag, Utilisateur. Nous avons associé à ça 3 fichiers Resource pour chaque objet. Nous avons donc créer une liste pré-faite pour les 3 objets pour tester les méthodes GET via Postman. Je vous met ci-dessous un exemple pour les utilisateurs qu'on a mis en place : 
[Utilisateur n°2](http://localhost:8080/utilisateur/get/2)

Nous avons donc fait ça pour Tag et Fiche aussi. Ensuite pour la méthode POST, nous n'avons pas réussi à l'implémenter. En utilisant POST avec Postman, cela nous met bien que l'utilisateur a été ajouté mais impossible d'aller le chercher avec la méthode GET.
Aussi, en rajoutant les parties de code en commentaire nous permettait de tester lorsque nous avions une liste prédéfini d'utilisateur. Cela marchait bien. 
