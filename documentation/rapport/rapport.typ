
#let title = "Rapport de projet"
#let course_id = "TLC-S7"
#let instructor = "LAMARCHE Fabrice"
#let due_time = "Pour le 26/01/2025"
#set enum(numbering: "a)")

#let prob(body) = {
  block(fill:rgb(250, 255, 250),
   width: 100%,
   inset:8pt,
   radius: 4pt,
   stroke:rgb(31, 199, 31),
   body)
  }

#let to-string(content) = {
  if content.has("text") {
    content.text
  } else if content.has("children") {
    content.children.map(to-string).join("")
  } else if content.has("body") {
    to-string(content.body)
  } else if content == [ ] {
    " "
  }
}

// Initiate the document title, author...
#let assignment_class(title, course_id, professor_name, due_time, body) = {
  set document(title: title)
  set heading(numbering: "1.")
  set page(
    paper:"us-letter", 
    header: locate( 
        loc => if (
            counter(page).at(loc).first()==1) { none } 
        else if (counter(page).at(loc).first()==2) { align(right, 
              [*#course_id: #title*  ]
            ) }
        else { 
          align(right, 
            [*#course_id: #title* ]
          ) 
        }
    ),
    footer: locate(
      loc => {
        if counter(page).at(loc).first() != 1 {
          let page_number = counter(page).at(loc).first()-1
          let total_pages = counter(page).final(loc).last()-1
          align(center)[#page_number/#total_pages]
        }
      }
    )
  )

  align(center, [
    #grid(
      columns: (30%,30%)
  )])
  block(height:25%,fill:none)
  align(center, text(25pt)[
    *#course_id: #title*])
  align(center, text(20pt)[
    #due_time])
  align(center, text(15pt)[_Responsable: #professor_name _])
  block(height:35%,fill:none)
  
  pagebreak(weak: false)

  body
}

#show: assignment_class.with(title, course_id, instructor, due_time)
#set par(justify: true)

#import "@preview/codelst:2.0.0": sourcecode
#import "@preview/algo:0.3.3": algo, i, d, comment, code

#import "@preview/ctheorems:1.1.2": *
#show: thmrules.with(qed-symbol: $square$)
#let theorem = thmbox("theorem", "Théorème", fill: rgb("#EEEEEE"))

#show raw.where(block: false): box.with(
  fill: luma(240),
  inset: (x: 3pt, y: 0pt),
  outset: (y: 3pt),
  radius: 2pt,
)

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
#image("resources/class_diagram.svg")

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

#highlight()[
== Génération de code 3 adresses à partir de l’AST

- visiteur pour le code 3 adresses (`IntermediateCodeVisitor.java`)

parler de FunctionSignature - les types (`TypesVisitor.java`)

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

  [ifnot],
  [R1],
  [],
  [],
  [check if R1 is false and if it is the case execute the next context],

  [goto],
  [label],
  [],
  [],
  [jump to the label],

  [inc],
  [R1],
  [value],
  [],
  [increment R1 by the value],

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

Traduction complète d'un programme !!
]

== Génération de code à partir du code 3 adresses

Nous avons choisit C++ comme langage cible. Pour ce faire, on itère sur toutes nos instructions en code 3 adresses stockées dans une ArrayList. Comme chacune de ces instructions possèdent une méthode `toCpp()`, cela nous répartit le travail à faire. Ensuite, il nous reste juste à concaténer toutes nos instructions générées en C++ et à les enregistrer dans un fichier.

== Bibliothèque runtime de WHILE écrite dans le langage cible

Cette bibliothèque fournit la gestion des arbres ainsi que l'apport de certaines fonctions et méthodes standards.

Par exemple, on a ajouté un opérateur de cast vers des chaines de caractères ou vers des entiers pour éviter de faire trop souvent la conversion à la main.

On a également apporté des fonctions `print` et `printInt` afin de mieux débuguer lors de l'éxécution.

#pagebreak()
= Description de la validation du compilateur

== Méthodologie utilisée

Pour valider le compilateur, nous avons écrit plusieurs tests en langage while. Ils se situent dans le chemin `/test/lang/`.

#highlight()[
== Code coverage
faire le code coverage et commenter 
]

== Bilan

=== Ce qui fonctionne

D'après les tests, la transpilation fonctionne pour tout.

=== Ce qui ne fonctionne pas

Si quelque chose ne fonctionne pas, on ne l'a pas détecté.

=== Fonctionnalités restantes à implémenter

Il nous manque cependant, lors du passage d'arguments, le support sous forme d'arbre à l'exécutable. Seuls les entiers sont supportés.

#pagebreak()
= Description de la méthodologie de gestion de projet

== Outils utilisés pour la gestion du projet

Pour la gestion du projet, nous avons utilisé Gitlab pour le versionning et un groupe Discord pour communiquer entre nous, communiquer nos problèmes et s'appeler pour travailler en dehors des séances de TP.

== Etapes de développement et découpage des tâches

#highlight()[
== Rapport de travail individuel

Voici un rapport des activités de chacun sur le projet : 

#table(
  columns: (auto, auto),
  [*Etape*], [*Membre(s)*],

  [Décrire la grammaire de While en ANTLR],
  [Tout le monde],

  [Création de l'AST (et simplification)],
  [Tout le monde, puis Tom pour l'optimiser],

  [Analyse sémantique],
  [
    - Table des symboles : Célia
    - Visiteur de base : Titouan
    - Autres visiteurs : Tout le monde
    - Validation du programme : Tom + tests écrits par tout le monde
  ],

  [Traduction en 3 adresses],
  [Tout le monde, mais un peu plus Tom],

  [Bibliothèque run time],
  [Tom],

  [Backend],
  [Tom],
  
  [Script permettant d’enchaîner le compilateur While avec le compilateur du langage cible de manière à générer un exécutable],
  [??],

  [Documentation (rapport + documentation utilisateur)],
  [Célia, avec relecture des autres]
)
]

#pagebreak()
= Post mortem : Organisation du projet

== Ce qui a bien fonctionné

Travailler ensemble plutôt que séparés, en faisant du peer (ou plus) programming, a bien aidé, surtout au début du projet, pour s'entraider et mieux comprendre les attendus et les enjeux du projet. C'était plus pratique pour bien avoir une vision d'ensemble du projet.

== Ce qui a moins bien fonctionné

Le fait de souvent travailler ensemble nous a sûrement fait perdre du temps et nous a rendu moins efficace sur le projet.

Aussi, puisque pendant les vacances de Noël et au retour des vacances la moitié du groupe était malade, cela a compliqué les communications et donc l'avancée sur le projet.

== Avec plus de recul, que ferions-vous ?

Maintenant que nous comprenons bien ce qui nous est demandé et que nous serions capable de le refaire seuls, nous pourrions travailler en autonomie sur les étapes du projet (tout en continuant de communiquer pour s'entraider et faire part de nos avancements). Cela nous permettrait de gagner du temps et de vraiment travailler en mode "projet".