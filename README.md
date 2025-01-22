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
        │   .gitignore
        │   pom.xml
        │   
        ├───src
        │   ├───main
        │   │   ├───antlr3
        │   │   │   │   .gitignore
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
        │   │   │                       │   └───Instructions
        │   │   │                       │           Call.java
        │   │   │                       │           CloseContext.java
        │   │   │                       │           Dec.java
        │   │   │                       │           Define.java
        │   │   │                       │           GetHead.java
        │   │   │                       │           GetTail.java
        │   │   │                       │           Goto.java
        │   │   │                       │           If.java
        │   │   │                       │           Ifnot.java
        │   │   │                       │           Inc.java
        │   │   │                       │           Instruction.java
        │   │   │                       │           Label.java
        │   │   │                       │           Mov.java
        │   │   │                       │           OpenContext.java
        │   │   │                       │           SetHead.java
        │   │   │                       │           SetTail.java
        │   │   │                       │
        │   │   │                       ├───Symbols
        │   │   │                       │       SymbolInfo.java
        │   │   │                       │       SymbolsEnum.java
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
            │
            ├───classes
            │   │   Library.cpp
            │   │
            │   └───org
            │       └───esir
            │           └───nctt
            │               ├───antlr
            │               │       WhileGrammar.tokens
            │               │       WhileGrammarLexer$DFA9.class
            │               │       WhileGrammarLexer.class
            │               │       WhileGrammarParser$commands_return.class
            │               │       WhileGrammarParser$command_assignment_return.class
            │               │       WhileGrammarParser$command_foreach_return.class
            │               │       WhileGrammarParser$command_for_return.class
            │               │       WhileGrammarParser$command_if_return.class
            │               │       WhileGrammarParser$command_nop_return.class
            │               │       WhileGrammarParser$command_return.class
            │               │       WhileGrammarParser$command_while_return.class
            │               │       WhileGrammarParser$definition_return.class
            │               │       WhileGrammarParser$expression_return.class
            │               │       WhileGrammarParser$exprs_return.class
            │               │       WhileGrammarParser$expr_call_return.class
            │               │       WhileGrammarParser$expr_compare_return.class
            │               │       WhileGrammarParser$expr_constructor_cons_return.class
            │               │       WhileGrammarParser$expr_constructor_list_return.class
            │               │       WhileGrammarParser$expr_head_return.class
            │               │       WhileGrammarParser$expr_nil_return.class
            │               │       WhileGrammarParser$expr_return.class
            │               │       WhileGrammarParser$expr_symbol_return.class
            │               │       WhileGrammarParser$expr_tail_return.class
            │               │       WhileGrammarParser$expr_variable_return.class
            │               │       WhileGrammarParser$function_return.class
            │               │       WhileGrammarParser$io_return.class
            │               │       WhileGrammarParser$lexpr_return.class
            │               │       WhileGrammarParser$program_return.class
            │               │       WhileGrammarParser$vars_return.class
            │               │       WhileGrammarParser.class
            │               │
            │               └───while_compiler
            │                   │   ArgsManager.class
            │                   │   FileManager.class
            │                   │   FunctionSignature.class
            │                   │   LibraryFunctions.class
            │                   │   Main.class
            │                   │
            │                   └───Visitor
            │                       │   Visitor.class
            │                       │
            │                       ├───IntermediateCode
            │                       │   │   IntermediateCodeVisitor.class
            │                       │   │   IntermediateFunction.class
            │                       │   │
            │                       │   └───Instructions
            │                       │           Call.class
            │                       │           CloseContext.class
            │                       │           Dec.class
            │                       │           Define.class
            │                       │           GetHead.class
            │                       │           GetTail.class
            │                       │           Goto.class
            │                       │           Ifnot.class
            │                       │           Inc.class
            │                       │           Instruction.class
            │                       │           Label.class
            │                       │           Mov.class
            │                       │           OpenContext.class
            │                       │           SetHead.class
            │                       │           SetTail.class
            │                       │
            │                       ├───Symbols
            │                       │       SymbolInfo.class
            │                       │       SymbolsEnum.class
            │                       │       SymbolsVisitor.class
            │                       │       SymbolTable.class
            │                       │
            │                       └───Types
            │                               TypesVisitor.class
            │
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
            ├───surefire-reports
            └───test-classes
                └───org
                    └───esir
                        └───nctt
                            └───while_compiler
                                    MainTest.class
test
    │   bools.cpp
    │   boucles.cpp
    │   cons.cpp
    │   head_tail.cpp
    │   if.cpp
    │   integers.cpp
    │   list.cpp
    │   multi_return.cpp
    │   tools.h
    │
    └───lang
            bools.while
            boucles.while
            cons.while
            head_tail.while
            if.while
            integers.while
            list.while
            multi_return.while
            table_symboles.while

```

## Compilation du compilateur

Todo

## Utilisation du script de compilation

Todo