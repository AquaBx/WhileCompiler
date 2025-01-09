#include <stack>

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


class TreeManager {
    public:
        static std::stack<Tree*> Stack();
};
void not() {
    Tree * Op1 = nullptr;
    Op1 = TreeManager::Stack.back(); TreeManager::Stack.pop_back();
    Tree * Result = nullptr;
    Tree * t3 = nullptr;
    t3 = t0;
    if ( t3->isFalse() )
    goto label12;
    false();
    Tree * t8 = nullptr;
    t8 = TreeManager::Stack.back(); TreeManager::Stack.pop_back();
    Result = t7;
    goto label17;
    label12 :
    true();
    Tree * t14 = nullptr;
    t14 = TreeManager::Stack.back(); TreeManager::Stack.pop_back();
    Result = t13;
    label17 :
    TreeManager::Stack.push_back(Result);
}
void and() {
    Tree * Op1 = nullptr;
    Op1 = TreeManager::Stack.back(); TreeManager::Stack.pop_back();
    Tree * Op2 = nullptr;
    Op2 = TreeManager::Stack.back(); TreeManager::Stack.pop_back();
    Tree * Result = nullptr;
    Tree * t5 = nullptr;
    t5 = t0;
    TreeManager::Stack.push_back(t5);
    not();
    Tree * t9 = nullptr;
    t9 = TreeManager::Stack.back(); TreeManager::Stack.pop_back();
    Tree * t11 = nullptr;
    t11 = TreeManager::Stack.back(); TreeManager::Stack.pop_back();
    if ( t5->isFalse() )
    goto label22;
    false();
    Tree * t16 = nullptr;
    t16 = TreeManager::Stack.back(); TreeManager::Stack.pop_back();
    Tree * t18 = nullptr;
    t18 = TreeManager::Stack.back(); TreeManager::Stack.pop_back();
    Result = t15;
    goto label48;
    label22 :
    Tree * t23 = nullptr;
    t23 = t2;
    TreeManager::Stack.push_back(t23);
    not();
    Tree * t27 = nullptr;
    t27 = TreeManager::Stack.back(); TreeManager::Stack.pop_back();
    Tree * t29 = nullptr;
    t29 = TreeManager::Stack.back(); TreeManager::Stack.pop_back();
    if ( t23->isFalse() )
    goto label40;
    false();
    Tree * t34 = nullptr;
    t34 = TreeManager::Stack.back(); TreeManager::Stack.pop_back();
    Tree * t36 = nullptr;
    t36 = TreeManager::Stack.back(); TreeManager::Stack.pop_back();
    Result = t33;
    goto label47;
    label40 :
    true();
    Tree * t42 = nullptr;
    t42 = TreeManager::Stack.back(); TreeManager::Stack.pop_back();
    Tree * t44 = nullptr;
    t44 = TreeManager::Stack.back(); TreeManager::Stack.pop_back();
    Result = t41;
    label47 :
    label48 :
    TreeManager::Stack.push_back(Result);
}
void true() {
    Tree * Result = nullptr;
    Tree * t1 = nullptr;
    Tree * t2 = nullptr;
    Tree * t3 = nullptr;
    t1->setHead(t2)
    t1->setTail(t3)
    Result = t1;
    TreeManager::Stack.push_back(Result);
}
void false() {
    Tree * Result = nullptr;
    Tree * t1 = nullptr;
    Result = t1;
    TreeManager::Stack.push_back(Result);
}
