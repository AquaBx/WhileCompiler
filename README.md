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
documentation
├───conception : contient un diagramme de classes       
├───consignes : contient tous les documents de consignes fournis      
├───documentation_utilisateur
└───rapport

src
├───main
│   ├───antlr3
│   │       WhileGrammar.g
│   │       
│   └───java
│       │
│       └───while_compiler
│           │   ArgsManager.java
│           │   Command.java
│           │   FileManager.java
│           │   FunctionSignature.java
│           │   LibraryFunctions.java
│           │   Main.java
│           │
│           └───Visitor
│               │   Visitor.java
│               │
│               ├───IntermediateCode
│               │   │   IntermediateCodeVisitor.java
│               │   │   IntermediateFunction.java
│               │   │
│               │   └───Instructions : Liste des instructions (call, CloseContext, Dec, Define)
│               │
│               ├───Symbols
│               │       SymbolInfo.java
│               │       SymbolsVisitor.java
│               │       SymbolTable.java
│               │
│               └───Types
│                       TypesVisitor.java
│
├───resources
│       Library.cpp
│
├───test
│   └───java
│       └───while_compiler
│           │   MainTest.java
│           │
│           └───Visitor
│               └───Symbols
│                       SymbolsVisitorTest.java
│
└───while_compiler
    ├───src
    │   └───main
    │       ├───antlr3
    │       │   │
    │       │   └───output
    │       │
    │       └───java
    │           └───org
    │               └───esir
    │                   └───nctt
    │                       └───antlr
    │                               WhileGrammar.tokens
    │                               WhileGrammarLexer.java
    │                               WhileGrammarParser.java
    │
    └───target
        │   original-while_compiler-all.jar
        │   while_compiler-1.0-SNAPSHOT-shaded.jar
        │   while_compiler-1.0-SNAPSHOT.jar
        │   while_compiler-all.jar
        │
        ├───classes
        │   └───org
        │       └───esir
        │           └───nctt
        │               ├───antlr
        │               │       WhileGrammar.tokens
        │               │
        │               └───while_compiler
        │                   └───Visitor
        │                       ├───IntermediateCode
        │                       │   └───Instructions
        │                       ├───Symbols
        │                       └───Types
        ├───generated-sources
        │   └───annotations
        ├───generated-test-sources
        │   └───test-annotations
        ├───maven-archiver
        │       pom.properties
        │
        ├───maven-status
        │   └───maven-compiler-plugin
        │       ├───compile
        │       │   └───default-compile
        │       │           createdFiles.lst
        │       │           inputFiles.lst
        │       │
        │       └───testCompile
        │           └───default-testCompile
        │                   createdFiles.lst
        │                   inputFiles.lst
        │
        └───test-classes
            └───org
                └───esir
                    └───nctt
                        └───while_compiler

test
│   <fichiers cpp générés par les codes while>
│   
└───lang
        <fichiers écrits en while>

.gitignore
.gitlab-ci.yml
CMakeLists.txt
integer.cpp
pom.xml
README.md
tests.bat
tests.sh
```

## Compilation du compilateur

Pour compiler le compilateur, exécuter les commandes suivantes :

METTRE COMME DANS LA DOC UTILISATEUR

## Utilisation du script de compilation

Todo