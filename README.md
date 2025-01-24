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

```
README.md
CMakeLists.txt  # fichier cmake
pom.xml         # fichier de configuration maven
tests.sh        # fichier pour lancer les tests des fichiers cpp

documentation
├── conception                  # diagramme de classe
├── consignes                   # consignes pour le projet
├── documentation_utilisateur   # pdf pour utiliser le compilateur
└── rapport                     # pdf rapport

src # source code
├── main
│   ├── antlr3
│   │   └── WhileGrammar.g # notre grammaire antlr
│   └── java
│       └── while_compiler
│           ├── Command.java
│           ├── FileManager.java
│           ├── FunctionSignature.java
│           ├── LibraryFunctions.java
│           ├── Main.java
│           └── Visitor
│               ├── IntermediateCode
│               │   ├── Instructions
│               │   │   ├── Call.java
│               │   │   ├── CloseContext.java
│               │   │   ├── ...
│               │   │   ├── SetHead.java
│               │   │   └── SetTail.java
│               │   ├── IntermediateCodeVisitor.java
│               │   └── IntermediateFunction.java
│               ├── Symbols
│               │   ├── SymbolInfo.java
│               │   ├── SymbolsVisitor.java
│               │   └── SymbolTable.java
│               ├── Types
│               │   └── TypesVisitor.java
│               └── Visitor.java
├── resources
│   └── Library.cpp
├── test # tests
│   └── java
│       └── while_compiler
│           ├── MainTest.java
│           └── Visitor
│               └── Symbols
│                   └── SymbolsVisitorTest.java
└── while_compiler # fichiers java générés par antlr

test
├── lang # fichiers while pour test
│   ├── bools.while
│   ├── boucles.while
│   ├── ...
│   └── nop.while
├── lang_error # fichiers while devant provoquer une erreur
│   ├── function_not_defined.while
│   ├── ill_formated_function.while
│   ├── keyword_function_name.while
│   └── table_symboles.while
├── bools.cpp # fichiers while en cpp
├── ...
└── tools.h

target # dossier généré par maven
├── classes # fichiers java compilés
├── ...
├── site # fichiers html pour les rapports
│   └── index.html
├── while_compiler-1.0-SNAPSHOT.jar
└── while_compiler-all.jar # fichier jar produit par maven package
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

⚠ : La fonction `main` doit être définie

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

⚠ : La fonction `main` doit être définie
