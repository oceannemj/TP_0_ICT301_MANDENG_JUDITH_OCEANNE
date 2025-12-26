# TP_0_ICT301_MANDENG_JUDITH_OCEANNE

MANDENG JUDITH OCEANNE
 23U2399

Les principes SOLID sont 5 règles fondamentales pour écrire du code orienté objet maintenable et évolutif :

S - Single Responsibility Principle (Responsabilité Unique)
Une classe ne doit avoir qu'une seule raison de changer. Chaque classe doit avoir une seule responsabilité.

Exemple : Au lieu d'avoir une classe `Book` qui gère les données, l'affichage ET la sauvegarde, créer trois classes : `Book` (données), `BookPrinter` (affichage), `BookSaver` (sauvegarde).

O - Open/Closed Principle (Ouvert/Fermé)
Les classes doivent être ouvertes à l'extension mais fermées à la modification. On peut ajouter de nouvelles fonctionnalités sans modifier le code existant.

Exemple : Utiliser des interfaces (`Shape`) pour ajouter de nouvelles formes (`Triangle`, `Square`) sans modifier la classe `AreaCalculator`.

L - Liskov Substitution Principle (Substitution de Liskov)
Une classe dérivée doit pouvoir remplacer sa classe parent sans altérer le comportement du programme.

Exemple : Un `Square` qui hérite de `Rectangle` pose problème car modifier la largeur change aussi la hauteur, violant les attentes. Solution : créer des classes indépendantes.

I - Interface Segregation Principle (Ségrégation des Interfaces)
Les clients ne doivent pas dépendre d'interfaces qu'ils n'utilisent pas. Mieux vaut plusieurs interfaces spécifiques qu'une interface générale.

Exemple : Séparer `Workable` et `Eatable` plutôt qu'une seule interface `Worker`, car les robots travaillent mais ne mangent pas.

D - Dependency Inversion Principle (Inversion des Dépendances)
Les modules de haut niveau ne doivent pas dépendre des modules de bas niveau. Les deux doivent dépendre d'abstractions.

Exemple : `OrderProcessor` ne doit pas dépendre directement de `MySQLDatabase`, mais d'une interface `Database`. Cela permet de changer facilement vers `MongoDBDatabase`.


Avantages SOLID : Code plus flexible, testable, maintenable et facile à faire évoluer.
