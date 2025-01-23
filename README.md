# Projet TLC

Membres du projet :

- CHAUVEL Tom
- JOSSO Célia
- LE DILAVREC Titouan
- MOREAU DE LIZOREUX Nicolas

Rapports :

- [Rapport technique](documentation/rapport/rapport.pdf)
- [Documentation utilisateur](documentation/documentation_utilisateur/documentation-utilisateur.pdf)

## Hiérarchie des répertoires : expliquer et simplifier

```text
src
    └───while_compiler
        │   pom.xml
        │   
        ├───src
        │   ├───main
        │   │   ├───antlr3
        │   │   │   │   WhileGrammar.g
        │   │   │   │
        │   │   │   │
        │   │   ├───java
        │   │   │   └───org
        │   │   │       └───esir
        │   │   │           └───nctt
        │   │   │               ├───antlr
        │   │   │               │       WhileGrammar.tokens
        │   │   │               │       WhileGrammarLexer.java
        │   │   │               │       WhileGrammarParser.java
        │   │   │               │
        │   │   │               └───while_compiler
        │   │   │                   │   ArgsManager.java
        │   │   │                   │   FileManager.java
        │   │   │                   │   FunctionSignature.java
        │   │   │                   │   LibraryFunctions.java
        │   │   │                   │   Main.java
        │   │   │                   │
        │   │   │                   └───Visitor
        │   │   │                       │   Visitor.java
        │   │   │                       │
        │   │   │                       ├───IntermediateCode
        │   │   │                       │   │   IntermediateCodeVisitor.java
        │   │   │                       │   │   IntermediateFunction.java
        │   │   │                       │   │
        │   │   │                       │   └───Instructions (contient toutes les instructions et la classe abstraite Instruction)
        │   │   │                       │
        │   │   │                       ├───Symbols
        │   │   │                       │       SymbolInfo.java
        │   │   │                       │       SymbolsVisitor.java
        │   │   │                       │       SymbolTable.java
        │   │   │                       │
        │   │   │                       └───Types
        │   │   │                               TypesVisitor.java
        │   │   │
        │   │   └───resources
        │   │           Library.cpp
        │   │
        │   └───test
        │       └───java
        │           └───org
        │               └───esir
        │                   └───nctt
        │                       └───while_compiler
        │                               MainTest.java
        │                               SymbolsVisitorTest.java
        │
        └───target
            │   original-while_compiler-all.jar
            │   while_compiler-1.0-SNAPSHOT-shaded.jar
            │   while_compiler-1.0-SNAPSHOT.jar
            │   while_compiler-all.jar
test
    │   <multiples fichiers cpp générés à partir dans codes dans lang>
    │   tools.h
    │
    └───lang (multiples fichiers test écrits en While)

```

## Compilation du compilateur

Pour compiler le compilateur, exécuter les commandes suivantes :

METTRE COMME DANS LA DOC UTILISATEUR

## Utilisation du script de compilation

Todo