# Projet TLC

Membres du projet :

- CHAUVEL Tom
- JOSSO Célia
- LE DILAVREC Titouan
- MOREAU DE LIZOREUX Nicolas

Rapports :

- [Rapport technique](documentation/rapport/rapport.pdf)
- [Documentation utilisateur](documentation/documentation_utilisateur/documentation-utilisateur.pdf)

## Hiérarchie des répertoires : expliquée et simplifiée

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

Prérequis : [Maven](https://maven.apache.org/), [clang++](https://clang.llvm.org/), [JDK 21.0.5](https://www.java.com/fr/)

Pour compiler le compilateur et créer le fichier jar du compilateur, exécuter les commandes suivantes :

```bash
cd s7-tlc-projet
mvn install
mvn package # crée le fichier jar dans le dossier 'target'
mvn test    # exécute les tests unitaires
mvn site    # crée les rapports (notamment jacoco) dans 'target/site'
```

## Utilisation du script de compilation

### Compilation vers un executable

```bash
java -jar <path-to-while_compiler-all.jar> compile test.while -o test.exe
# ...
./test.exe 1 2
# ...
```

### Compilation vers du C++

```bash
java -jar <path-to-while_compiler-all.jar> compile test.while  --cpp -o test.cpp
# ...
cat ./test.cpp
# ...
```

### Compilation vers du code 3 addresses

```bash
java -jar <path-to-while_compiler-all.jar> compile test.while  --asm -o test.asm
# ...
cat ./test.asm
# ...
```

### Command run avec arguments

```bash
java -jar <path-to-while_compiler-all.jar> run test.while -- 1 2
# ...
```

⚠ : Seuls les arguments sous forme d'entier sont supportés par le fichier binaire produit

⚠ : Des fichiers sont generés dans `/tmp` ou `%TEMP%`
