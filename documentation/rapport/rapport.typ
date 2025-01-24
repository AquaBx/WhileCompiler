

#import "template/ESIR.typ": *
#let title = "Rapport Compilateur while"
#let author = "LE DILAVREC Titouan, MOREAU de LIZOREUX Nicolas, CHAUVEL Tom, JOSSO Célia"
#let course_id = "TLC-S7"
#let instructor = "Fabrice Lamarche"
#let semester = "Semestre 7"
#let due_time = "24/01/2024"
#set enum(numbering: "a)")
#show: assignment_class.with(title, author, course_id, instructor, due_time)
#set par(justify: true)

#import "@preview/codelst:2.0.0": sourcecode
#import "@preview/algo:0.3.3": algo, i, d, comment, code

#show raw.where(block: false): box.with(
  fill: luma(240),
  inset: (x: 3pt, y: 0pt),
  outset: (y: 3pt),
  radius: 2pt,
)

#set text(lang: "fr")

#show raw.where(block: true): block.with(
  fill: luma(240),
  inset: 10pt,
  radius: 4pt,
) 

#outline(
  title: [Sommaire],
  indent: auto,
  depth: 3,
)

#pagebreak()
= Description technique

Dans cette partie, il s'agira de montrer une vue d'ensemble de l'architecture du compilateur et ainsi que de la chaine de compilation

== AST

Voici notre AST. Nous avons essayé de le rendre le plus propre possible. Nous l'avons contruit à partir du fichier `integers.while` (répertoire `test/lang`) :

#image("resources/ast.jpg")

Sur cet AST, nous remarquons que notre programme contient 3 fonctions :

- Une fonction `add`
  - 2 paramètres d'entrée : `Op1` et `Op2`
  - 1 paramètre de sortie : `Result`
  - Une suite de commandes : 
    - Une assignation stockée dans la variable `Result` prenant la valeur de `Op1`
    - Une boucle `for` itérant sur `Op2`. Elle stocke dans `Result` la construction d'un arbre ayant pour fils gauche `nil` et pour fis droit `Result`

- Une fonction `sub`
  - 2 paramètres d'entrée : `Op1` et `Op2`
  - 1 paramètre de sortie : `Result`
  - Une suite de commandes : 
    - Une assignation stockée dans la variable `Result` prenant la valeur de `Op1`
    - Une boucle `for` itérant sur `Op2`. Elle stocke dans `Result` la `tail` de `Result`

- Une fonction `mul`
  - 2 paramètres d'entrée : `Op1` et `Op2`
  - 1 paramètre de sortie : `Result`
  - Une bouce `for` itérant sur `Op1`. Elle stocke dans `Result` le résultat de la fonction `add` qui est appelée sur les paramètres `Result` et `Op2`

#pagebreak()
== Architecture 

Ci-dessous notre diagramme de classe de notre compilateur.
#image("resources/class_diagram.png")

=== Design Pattern Visiteur

Nous avons mis en place une classe abstraite `Visitor.java` se basant sur le Design Pattern visitor. Elle permet de visiter n'importe quel label présent dans l'AST (fonctions, inputs, outputs, expressions, variables etc.)

Grâce à cette classe abstraite, nous avons pu faire un visiteur pour la table des symboles (`SymbolsVisitor.java`). Le visiteur est classe permettant de naviguer dans l'arbre de navigation syntaxique depuis la racine de l'arbre jusqu'aux feuilles. 

== Analyse syntaxique et sémantique

Dans cette partie et les suivantes, nous traiterons de notre méthodologie pour effectuer les analyses syntaxique et sémantiques

=== Table des symboles

Nous avons besoin d'une table des symboles pour vérifier que les variables et les fonctions sont bien initialisées avant d'êtres appelées, et pour vérifier types. Pour cela :

- Nous avons implémenté une classe `SymbolInfo` qui a pour attributs `line` (numéro de ligne), `column` (numéro de colonne) et `content` (contenu du symbol). Elle permet d'énumérer les informations concernant le symbole.

- Ensuite, nous avons implémenté `SymbolTable`, la table des symboles. Nous l'avons représenté en `Stack<Map<String, SymbolInfo>>`. Nous y avons implémenté plusieurs méthodes pour ajouter des symboles à un contexte, ajouter un contexte à la table des symboles, vérifier si le symbole est dans un contexte etc.

Puis, avons créé un visiteur qui parcourt l'AST effectue ces vérifications à l'aide de la table des symboles.

=== Vérification des assignements et des paramètres

Nous avons également un visiteur qui vérifie lors d'un assignement que le nombre de variables à gauche est égal au nombre d'expressions à droites, ou au nombre de paramètres renvoyés par une fonction si il y a un appel de fonction à droite.

== Génération de code 3 adresses à partir de l’AST

Un visiteur se charge de générer le code 3 adresses (`IntermediateCodeVisitor.java`).

Voici les instructions du code intermédiaire que nous avons décidé de faire :

#table(
  columns: (auto, auto, auto, auto, auto),
  [*Operation*],
  [*arg1*],
  [*arg2*],
  [*arg3*],
  [*explaination*],

  [define],
  [new register's label],
  [],
  [],
  [create a new nil tree],

  [define],
  [new register's label],
  [value],
  [],
  [create a new nil tree with a string value],

  [mov],
  [R1],
  [R2],
  [],
  [copy the R2's value into R1],

  [setHead],
  [R1],
  [R2],
  [],
  [set a copy of R2 as the head of R1],

  [setTail],
  [R1],
  [R2],
  [],
  [set a copy of R2 as the tail of R1],

  [getHead],
  [R1],
  [R2],
  [],
  [set a copy of R1's Head into R2],

  [getTail],
  [R1],
  [R2],
  [],
  [set a copy of R1's Tail into R2],

  [call],
  [function's label],
  [R1],
  [R[]],
  [call the function with parameters stored in R, and store the return in R1],

  [if],
  [R1],
  [],
  [],
  [check if R1 is true and if it is the case execute the next context],

  [goto],
  [label],
  [],
  [],
  [jump to the label],

  [dec],
  [R1],
  [value],
  [],
  [decrement R1 by the value],

  [closecontext],
  [],
  [],
  [],
  [close a code context],

  [opencontext],
  [],
  [],
  [],
  [open a code context],

  [label],
  [],
  [],
  [],
  [create a label],
)

#highlight()[
  - TODO ADD CODE TROIS ADRESSE D'UN PRGM
]

== Génération de code à partir du code 3 adresses

Nous avons choisit C++ comme langage cible. Pour ce faire, on itère sur toutes nos instructions en code 3 adresses stockées dans une ArrayList. Comme chacune de ces instructions possèdent une méthode `toCpp()`, il suffit d'appeler cette méthode pour obtenir l'instruction 3 adresses en C++. Ensuite, il nous reste juste à concaténer toutes nos instructions générées en C++ et à les enregistrer dans un fichier.

== Bibliothèque runtime de WHILE écrite dans le langage cible

Cette bibliothèque fournit la gestion des arbres ainsi que l'apport de certaines fonctions et méthodes standards.

Par exemple, on a ajouté un opérateur de cast vers des chaines de caractères ou vers des entiers pour éviter de faire trop souvent la conversion à la main.

On a également ajouté une fonction de pretty printing `pp` afin de mieux débuguer lors de l'éxécution.

#pagebreak()
= Description de la validation du compilateur

== Méthodologie utilisée

Pour valider le compilateur, nous avons écrit plusieurs tests en langage while. Ils se situent dans le chemin `/test/lang/`.

== Code coverage

Pour le code coverage, nous avons utilisé le plugin Maven JaCoCo (Java Code Coverage). Avec ce plugin, nous avons obtenu un code coverage global de 79%.

#image("resources/jacoco.png")


= Bilan

== Ce qui fonctionne... Ou non

D'après les tests, la transpilation fonctionne pour tout.
Nous n'avons pas détecté d'erreur à partir des tests que nous avons fait.

== Fonctionnalités restantes à implémenter

Lorsque l'on crée l'exécutable d'un fichier while, les arguments de ligne de commande ne sont pas supportés par l'exécutable, excepté les entiers, qui fonctionnent. 

#pagebreak()
= Description de la méthodologie de gestion de projet

== Outils utilisés pour la gestion du projet

Pour la gestion du projet, nous avons utilisé Gitlab pour le versionning et un groupe Discord pour communiquer entre nous, communiquer nos problèmes et s'appeler pour travailler en dehors des séances de TP.

== Etapes de développement et découpage des tâches

== Rapport de travail individuel

Voici un rapport des activités de chacun sur le projet : 

#table(
  columns: (auto, auto),
  [*Etape*], [*Membre(s)*],

  [Décrire la grammaire de While en ANTLR],
  [Tout le monde],

  [Création de l'AST (et simplification)],
  [Tout le monde],

  [Analyse sémantique],
  [
    - Table des symboles : Célia
    - Visiteur de base : Titouan
    - Autres visiteurs : Tom, Nicolas et Célia
    - Validation du programme : Tom + tests écrits par tout le monde
  ],

  [Traduction en 3 adresses],
  [Tout le monde, mais Tom plus que les autres],

  [Bibliothèque run time],
  [Tom],

  [Backend],
  [Tom],
  
  [Script permettant d’enchaîner le compilateur While avec le compilateur du langage cible de manière à générer un exécutable],
  [Titouan],

  [Documentation (rapport + documentation utilisateur)],
  [Célia et Nicolas, avec relecture des autres],

  [Test Junit et code coverage],
  [Nicolas]
)

#pagebreak()
= Post mortem : Organisation du projet

== Ce qui a bien fonctionné

Travailler ensemble plutôt que séparés, en faisant du peer (ou plus) programming, a bien aidé, surtout au début du projet, pour s'entraider et mieux comprendre les attendus et les enjeux du projet. C'était plus pratique pour bien avoir une vision d'ensemble du projet.

== Ce qui a moins bien fonctionné

Le fait de souvent travailler ensemble nous a sûrement fait perdre du temps et nous a rendu moins efficace sur le projet.

Aussi, puisque pendant les vacances de Noël et au retour des vacances la moitié du groupe était malade, cela a compliqué les communications et donc l'avancée sur le projet.

== Avec plus de recul, que ferions-vous ?

Maintenant que nous comprenons bien ce qui nous est demandé et que nous serions capable de le refaire seuls, nous pourrions travailler en autonomie sur les étapes du projet (tout en continuant de communiquer pour s'entraider et faire part de nos avancements). Cela nous permettrait de gagner du temps et de vraiment travailler en mode "projet".