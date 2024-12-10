# Project While

Pass Réaliser: 
- Collection les symbol
- Check Si les symbole utiliser existe.
- Evaluation de l'AST

Point Important:
- Gestion de la mémoire
    - Life Time (Suppression des element nom utile)

Proposition de Language cible:
- C (minimal/lower level)
- C++ (meilleur pour la gestion de la memoire (share pointer))
- WASM (marrant)

# Étapes du projet

1) `[X]` Décrire la grammaire de while en antlr
2) `[ ]` Créer, par l’intermédiaire des fonctionnalités d’ANTLR un arbre de syntaxe abstraite (AST) associé à votre langage. Vous veillerez à spécifier clairement la structure de votre arbre, cela vous sera utile lors des diverses passes d’analyse / génération.
3) `[ ]` En travaillant sur l’AST, il s’agira ensuite d’effectuer l’analyse sémantique du programme,
incluant :
    - la construction de la table des symboles,
    - la validation du programme (typage, pas de définition multiple…). Pour tester cette étape, vous prendrez soin de concevoir des petits exemples pertinents permettant de tester tous les cas de rejet ainsi que les cas d’acceptation. Ces exemples peuvent être conçus avant la réalisation et utilisés ensuite pour tester et valider vos avancements.
4) `[ ]` Toujours à partir de l’AST, il faudra traduire chaque fonction en code 3 adresses. Ce sera à vous de spécifier votre code 3 adresses sachant que While est un langage assez simple qui ne nécessite pas forcément un code 3 adresses aussi complet que pour des langages de programmation plus évolués.
5) `[ ]` Créer une bibliothèque run time dans le language cible pour inclure les fonctionnalités du language (par exemple les arbres)
6) `[ ]` Écrire le backend qui a pour rôle de réécrire les fonctions et le code 3 addresses qui leur est associé dans le language cible et générer le / les fichiers en résultant.
7) `[ ]` Si le langage cible est un langage compilé (C, C++, java…), il faudra concevoir un script permettant d’enchainer le compilateur While avec le compilateur du langage cible de manière à générer un exécutable.

- La documentation de la bibliothèque « runtime » java de ANTLR est consultable à cette adresse : [Overview (ANTLR 3 Runtime 3.5.3 API)](https://www.antlr3.org/api/Java/index.html).
- L’interface correspondant à un nœud de l’AST est fournie ici : [Tree (ANTLR 3 Runtime 3.5.3 API)](https://www.antlr3.org/api/Java/org/antlr/runtime/tree/Tree.html). 

