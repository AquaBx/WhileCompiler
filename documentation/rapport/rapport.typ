
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

#highlight()[
Le rapport de projet aborde à la fois la partie technique de la réalisation du compilateur ainsi que la
partie organisationnelle du projet.
]

#pagebreak()
= Description technique

== #highlight()[Architecture du compilateur et de la chaine de compilation]

(depuis le code source en WHILE à la récupération d’un programme exécutable)

== AST

Voici notre AST. Nous avons essayé de le rendre le plus propre possible. Nous l'avons contruit à partir du fichier `full.while` (répertoire `test/lang`) :

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

== Table des symboles

- Nous avons implémenté une classe `SymbolInfo` qui a pour attributs `line` (numéro de ligne), `column` (numéro de colonne) et `content` (contenu du symbol). Elle permetd'énumérer les informatation concernant le symbole.

- Ensuite, nous avons implémenté `SymbolTable`, la table des symboles. Nous l'avons représenté en `Stack<Map<String, SymbolInfo>>`. Nous y avons implémenté plusieurs méthodes pour ajouter des symboles à un contexte, ajouter un contexte à la table des symboles, vérifier si le symbole est dans un contexte etc.

#highlight()[
attention symbols enum c'est de la d ça sert null part, je fais un git blame pour voir c'est qui qui a fait 
]

== Design Pattern Visiteur

Nous avons mis en place une classe abstraite `Visitor.java` se basant sur le Design Pattern visitor. Elle permet de visiter n'importe quel label présent dans l'AST (fonctions, inputs, outputs, expressions, variables etc.)

Grâce à cette classe abstraite, nous avons pu faire un visiteur pour la table des symboles (`SymbolsVisitor.java`).

== Génération de code 3 adresses à partir de l’AST

- visiteur pour le code 3 adresses (`IntermediateCodeVisitor.java`)

parler de FunctionSignature - les types (`TypesVisitor.java`)

```
+-----------+----------------------+----------------------+
| Operation |         arg1         |         arg2         |
+-----------+----------------------+----------------------+
| input     | input name           | stack position       |
| return    |                      | register's address   |
| define    | new register's label | tree                 |
| retrieve  | new register's label | register's address   |
| mov       | register's label     | register's address   |
| setHead   | register's label     | register's address   |
| setTail   | register's label     | register's address   |
| call      | function's label     | number of parameters |
| param     |                      | register's address   |
| return    |                      | register's address   |
+-----------+----------------------+----------------------+
```

#highlight()[
Traduction complète d'un programme !!
]

== Optimisation de code #highlight()[si elle a été réalisée]

== Génération de code à partir du code 3 adresses

== Bibliothèque runtime de WHILE écrite dans le langage cible

#pagebreak()
= Description de la validation du compilateur

== Méthodologie utilisée

Pour valider le compilateur, nous avons écrit plusieurs tests en langage while. Ils se situent dans le chemin `/test/lang/`.

== Code coverage

#highlight()[faire le code coverage]

== Bilan

#highlight()[faire le bilan]

=== Ce qui fonctionne

#highlight()[dire ce qui fonctionne]

=== Ce qui ne fonctionne pas

#highlight()[dire ce qui fonctionne pas]

=== Fonctionnalités restantes à implémenter

#highlight()[dire Fonctionnalités restantes à implémenter]

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
  [??],

  [Backend],
  [Tom],
  
  [Script permettant d’enchaîner le compilateur While avec le compilateur du langage cible de manière à générer un exécutable],
  [??],

  [Documentation (rapport + documentation utilisateur)],
  [Célia, avec relecture des autres]
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