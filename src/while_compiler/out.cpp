#include <stack>

class Tree {
private: 
    Tree * head;
    Tree * tail;
public:
    Tree() : head(nullptr), tail(nullptr){}

    Tree(Tree * old){
        if (old->getHead() != nullptr){
            this->head = new Tree(old->getHead());
        }
        if (old->getTail() != nullptr){
            this->tail = new Tree(old->getTail());
        }
    }

    Tree * getTail(){
        return this->tail;
    }

    Tree * getHead(){
        return this->head;
    }

    void setTail(Tree * tail){
        this->tail = new Tree(tail);
    }

    void setHead(Tree * head){
        this->head = new Tree(head);
    }

    ~Tree(){
        if (head != nullptr){
            delete head;
        }
        if (head != nullptr){
            delete tail;
        }
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
Tree * generateSymbol(){
    return nullptr;
}

/*
Génère une liste d'arbre
*/
Tree * generateList(){
    return nullptr;
}


namespace TreeManager {
    std::stack<Tree*> * Stack;

    static std::stack<Tree*> * getStack(){
        if (TreeManager::Stack == nullptr){
            TreeManager::Stack = new std::stack<Tree*>();
        }
        return TreeManager::Stack;
    }
};
void fun_not();
void fun_and();
void fun_true();
void fun_false();
void fun_not() {
    Tree * Op1 = nullptr;
    Op1 = TreeManager::getStack()->top(); TreeManager::getStack()->pop();
    Tree * Result = nullptr;
    Tree * t3 = nullptr;
    t3 = Op1;
    if ( t3 == nullptr )
    goto label15;
    {
    Tree * t8 = nullptr;
    fun_false();
    t8 = TreeManager::getStack()->top(); TreeManager::getStack()->pop();
    Result = t8;
    goto label21;
    }
    {
    label15 :
    Tree * t16 = nullptr;
    fun_true();
    t16 = TreeManager::getStack()->top(); TreeManager::getStack()->pop();
    Result = t16;
    }
    label21 :
    TreeManager::getStack()->push(Result);
}
void fun_and() {
    Tree * Op1 = nullptr;
    Op1 = TreeManager::getStack()->top(); TreeManager::getStack()->pop();
    Tree * Op2 = nullptr;
    Op2 = TreeManager::getStack()->top(); TreeManager::getStack()->pop();
    Tree * Result = nullptr;
    Tree * t5 = nullptr;
    Tree * t6 = nullptr;
    t6 = Op1;
    TreeManager::getStack()->push(t6);
    fun_not();
    t6 = TreeManager::getStack()->top(); TreeManager::getStack()->pop();
    if ( t5 == nullptr )
    goto label21;
    {
    Tree * t14 = nullptr;
    fun_false();
    t14 = TreeManager::getStack()->top(); TreeManager::getStack()->pop();
    Result = t14;
    goto label46;
    }
    {
    label21 :
    Tree * t22 = nullptr;
    Tree * t23 = nullptr;
    t23 = Op2;
    TreeManager::getStack()->push(t23);
    fun_not();
    t23 = TreeManager::getStack()->top(); TreeManager::getStack()->pop();
    if ( t22 == nullptr )
    goto label38;
    {
    Tree * t31 = nullptr;
    fun_false();
    t31 = TreeManager::getStack()->top(); TreeManager::getStack()->pop();
    Result = t31;
    goto label44;
    }
    {
    label38 :
    Tree * t39 = nullptr;
    fun_true();
    t39 = TreeManager::getStack()->top(); TreeManager::getStack()->pop();
    Result = t39;
    }
    label44 :
    }
    label46 :
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

int main(){}