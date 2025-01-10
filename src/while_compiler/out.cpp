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
    private:
        static std::stack<Tree*> * Stack;
    public:
        static std::stack<Tree*> * getStack(){
            if (TreeManager::Stack == nullptr){
                TreeManager::Stack = new std::stack<Tree*>();
            }
            return TreeManager::Stack;
        }

        TreeManager::~TreeManager(){
            delete TreeManager::Stack;
        }
};
void fun_not() {
    Tree * Op1 = nullptr;
    Op1 = TreeManager::getStack()->top(); TreeManager::getStack()->pop();
    Tree * Result = nullptr;
    Tree * t3 = nullptr;
    t3 = t0;
    if ( t3 == nullptr )
    goto label12;
    fun_false();
    Tree * t8 = nullptr;
    t8 = TreeManager::getStack()->top(); TreeManager::getStack()->pop();
    Result = t7;
    goto label17;
    label12 :
    fun_true();
    Tree * t14 = nullptr;
    t14 = TreeManager::getStack()->top(); TreeManager::getStack()->pop();
    Result = t13;
    label17 :
    TreeManager::getStack()->push(Result);
}
void fun_and() {
    Tree * Op1 = nullptr;
    Op1 = TreeManager::getStack()->top(); TreeManager::getStack()->pop();
    Tree * Op2 = nullptr;
    Op2 = TreeManager::getStack()->top(); TreeManager::getStack()->pop();
    Tree * Result = nullptr;
    Tree * t5 = nullptr;
    t5 = t0;
    TreeManager::getStack()->push(t5);
    fun_not();
    Tree * t9 = nullptr;
    t9 = TreeManager::getStack()->top(); TreeManager::getStack()->pop();
    Tree * t11 = nullptr;
    t11 = TreeManager::getStack()->top(); TreeManager::getStack()->pop();
    if ( t5 == nullptr )
    goto label22;
    fun_false();
    Tree * t16 = nullptr;
    t16 = TreeManager::getStack()->top(); TreeManager::getStack()->pop();
    Tree * t18 = nullptr;
    t18 = TreeManager::getStack()->top(); TreeManager::getStack()->pop();
    Result = t15;
    goto label48;
    label22 :
    Tree * t23 = nullptr;
    t23 = t2;
    TreeManager::getStack()->push(t23);
    fun_not();
    Tree * t27 = nullptr;
    t27 = TreeManager::getStack()->top(); TreeManager::getStack()->pop();
    Tree * t29 = nullptr;
    t29 = TreeManager::getStack()->top(); TreeManager::getStack()->pop();
    if ( t23 == nullptr )
    goto label40;
    fun_false();
    Tree * t34 = nullptr;
    t34 = TreeManager::getStack()->top(); TreeManager::getStack()->pop();
    Tree * t36 = nullptr;
    t36 = TreeManager::getStack()->top(); TreeManager::getStack()->pop();
    Result = t33;
    goto label47;
    label40 :
    fun_true();
    Tree * t42 = nullptr;
    t42 = TreeManager::getStack()->top(); TreeManager::getStack()->pop();
    Tree * t44 = nullptr;
    t44 = TreeManager::getStack()->top(); TreeManager::getStack()->pop();
    Result = t41;
    label47 :
    label48 :
    TreeManager::getStack()->push(Result);
}
void fun_true() {
    Tree * Result = nullptr;
    Tree * t1 = nullptr;
    Tree * t2 = nullptr;
    Tree * t3 = nullptr;
    t1->setHead(t2);
    t1->setTail(t3);
    Result = t1;
    TreeManager::getStack()->push(Result);
}
void fun_false() {
    Tree * Result = nullptr;
    Tree * t1 = nullptr;
    Result = t1;
    TreeManager::getStack()->push(Result);
}
