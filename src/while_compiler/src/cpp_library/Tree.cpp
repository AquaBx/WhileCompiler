#pragma once

class Tree {
private: 
    Tree * head;
    Tree * tail;
public:
    Tree::Tree(){}

    Tree::~Tree(){
        delete head;
        delete tail;
    }

    Tree::Tree(Tree & old){
        if (old.getHead() != nullptr){
            this->head = new Tree(*old.getHead());
        }
        if (old.getTail() != nullptr){
            this->tail = new Tree(*old.getTail());
        }
    }

    Tree * getTail(){
        return this->tail;
    }

    Tree * getHead(){
        return this->head;
    }

    void setTail(Tree * tail){
        this->tail = new Tree(*tail);
    }

    void setHead(Tree * head){
        this->head = new Tree(*head);
    }


};

/*
Compare 2 arbres
- Renvoie un arbre si les deux sont égaux
- Renvoie nullptr sinon
*/
Tree * compare(Tree * t1, Tree * t2){
    if (t1 == nullptr && t2 == nullptr){
        return new Tree();
    }
    else if (t1 == nullptr || t2 == nullptr){
        return nullptr;
    }
    else {
        Tree * cond1 = compare(t1->getHead(),t2->getHead());
        Tree * cond2 = compare(t1->getTail(),t2->getTail());
        return  compare(cond1,cond2);
    }
}

/*
Génère un symbol sous forme d'arbre
*/
Tree * generateSymbol();

/*
Génère une liste d'arbre
*/
Tree * generateList();