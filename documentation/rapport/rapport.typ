
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

#highlight(
  "
Le rapport de projet aborde à la fois la partie technique de la réalisation du compilateur ainsi que la
partie organisationnelle du projet.
")

#pagebreak()
= Description technique

== Architecture du compilateur et de la chaine de compilation

(depuis le code source en WHILE à la récupération d’un programme exécutable)

== AST

== Génération de code 3 adresses à partir de l’AST

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

== Optimisation de code #highlight("si elle a été réalisée")

== Génération de code à partir du code 3 adresses

== Bibliothèque runtime de WHILE écrite dans le langage cible

#pagebreak()
= Description de la validation du compilateur

== Méthodologie utilisée

== Code coverage

== Bilan

=== Ce qui fonctionne

=== Ce qui ne fonctionne pas

=== Fonctionnalités restant à implémenter ?

#pagebreak()
= Description de la méthodologie de gestion de projet

== Outils utilisés pour la gestion du projet

== Etapes de développement et découpage des tâches

== Rapport de travail individuel

#pagebreak()
= Post mortem : Organisation du projet

== Ce qui a bien fonctionné

== Ce qui a moins bien fonctionné

== Avec plus de recul, que ferions-vous ?