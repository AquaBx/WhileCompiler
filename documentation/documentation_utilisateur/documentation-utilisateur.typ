
#let title = "Documentation utilisateur"
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
= Ecriture d'un programme en langage WHILE

== Brève introduction
Le langage While est conçu pour manipuler uniquement des arbres binaires. Il permet de simuler d'autres types de données (entiers, booléens, chaînes de caractères etc.) grâce à des encodages spécifiques. 

== Types de données

=== Arbres binaires

Comme dit en introduction, le langage While manipule uniquement des arbres binaires. Voici les éléments principaux pour travailler avec ce type de données :

- `nil` : Arbre vide.

- `cons(A, B)` : Crée un arbre binaire avec `A` comme fils gauche et `B` comme fils droit.

- `list(T1, T2, ..., Tn)`: Crée une liste chaînée d'éléments.

=== Simulation de types

- Booléens : `true` qui est encodé comme `(cons nil nil)` et `false` qui est encodé comme `nil`.

- Entiers : Un entier `n >= 0` est encodé comme une liste de `n` nœuds `(cons nil ...)`.

- Chaînes de caractères : Encodées comme des listes où chaque caractère est un nœud.

== Commandes et structures de Contrôle

Voici les principales commandes et structures de contrôle :

=== Commandes simples
- `nop` : Ne fait rien (utile pour tester).
- `Vars := Exprs` : Associe des expressions à des variables.
  
=== Structures conditionnelles
- `if E then C1 fi` : Exécute `C1` si `E` est vrai.
- `if E then C1 else C2 fi` : Exécute `C1` si `E` est vrai, sinon `C2`.

=== Boucles
- `while E do C od` : Répète `C` tant que `E` est vrai.
- `for E do C od` : Répète `C` un nombre déterminé de fois.
- `foreach X in E do C od` : Parcourt chaque élément de `E`.

=== Définitions de fonctions

Un programme While est composé de plusieurs fonctions. Voici la grammaire générale d'une fonction en While pour comprendre la syntaxe :

```text
Program → Function Program | Function  
Function → 'function' Symbol ':' Definition  
Definition → 'read' Input '%' Commands '%' 'write' Output  
```

Avec :
- `Input` : Liste des variables d'entrée
- `Commands` : Liste de commandes ou de structures de contrôle
- `Output` : Liste des variables de sortie

Par exemple, voici une fonction While "générique" décrivant bien les spécificités de la grammaire.

```text
function Symbol :  
  read I1, ..., In  
%  
  Commands  
%  
  write O1, ..., Om
```

- `Symbol` : Nom de la fonction.
- `I1, ..., In` : Paramètres d'entrée.
- `Commands` : Commandes exécutées.
- `O1, ..., Om` : Valeurs de sortie.

==== Exemple  : Fonction pour ajouter deux entiers
```while
function add :
  read A, B
%
  if A =? nil then
    Result := B
  else
    Result := (cons nil (add (tl A) B))
  fi
%
  write Result
```


_Remarques :_
- Une fonction peut avoir zéro paramètre d'entrée.
- Elle doit toujours avoir au moins une valeur de sortie.
- Les variables sont locales à la fonction.

=== Programme principal

Le programme principal est défini dans une fonction appelée `main`. C'est la fonction principale. Voici un exemple :

```while
function main :
  read X, Y
%
  Z := (cons X Y);
  if Z =? nil then
    Result := (list X Y)
  else
    Result := Z
  fi
%
  write Result
```

- `Entrées` : `X`, `Y`.
- `Commandes` :
  - Construction d'un arbre binaire avec `X` et `Y`.
  - Condition pour vérifier si l'arbre est vide.
- `Sortie` : `Result`.

#pagebreak()
= Compilation d'un programme en langage WHILE

Pour utiliser notre compilateur pour générer, à partir d’un code source WHILE, un fichier exécutable, voici les commandes à exécuter : 

Pour Linux et MacOS : 
```
java -jar <path-to-while_compiler-all.jar> -i <path-to-while-file> -o <target-cpp-file>
clang++ <target-cpp-file>
./a.out
```

Pour Windows : 
```
java -jar <path-to-while_compiler-all.jar -i <path-to-while-file> -o <target-cpp-file>
clang++ <target-cpp-file>
./a.exe
```