#include <stack>
#include <string>
#include <iostream>
namespace WhileStandard
{

    class Tree
    {
    private:
        Tree * head;
        Tree * tail;
        std::string symbol;

    public:
        bool isNil() {
            return head == nullptr && tail == nullptr;
        }

        std::string getSymbol() { return symbol ;}

        Tree(std::string symbol = "") : head(nullptr), tail(nullptr), symbol(symbol) {}

        Tree(Tree *old)
        {
            if (old->getHead() != nullptr)
            {
                this->head = new Tree(old->getHead());
            }
            if (old->getTail() != nullptr)
            {
                this->tail = new Tree(old->getTail());
            }
            this -> symbol = old->getSymbol();
        }

        Tree *getTail()
        {
            return this->tail;
        }

        Tree *getHead()
        {
            return this->head;
        }

        void setTail(Tree *tail)
        {
            this->tail = new Tree(tail);
        }

        void setHead(Tree *head)
        {
            this->head = new Tree(head);
        }

        ~Tree()
        {
            if (head != nullptr)
            {
                delete head;
            }
            if (head != nullptr)
            {
                delete tail;
            }
        }

        Tree & operator += (int v){
            for (int i = 0 ; i < v ; i++){
                Tree * oldTail = this -> getTail();
                Tree * newTail = new Tree();
                newTail->setTail(oldTail);
                this->setTail(newTail);
            }
        }

        operator int(){
            if ( this -> isNil() ){
                return 0;
            }
            return 1 + *(this -> getTail());
        }
    }; 

    bool compare2(Tree *t1, Tree *t2) {
        if (t1->isNil() && t2->isNil()) {
            return true;
        } else if (t1 == nullptr || t2 == nullptr) {
            return false;
        } else {
            bool cond1 = compare2(t1->getHead(), t2->getHead());
            bool cond2 = compare2(t1->getTail(), t2->getTail());
            return cond1 && cond2;
        }
    }

   /*
    Compare 2 arbres
    - Renvoie un arbre non vide si les deux sont égaux
    - Renvoie un arbre vide sinon sinon
    */
    Tree * compare(Tree *t1, Tree *t2) {
        Tree * temp1 = new Tree();
        if (compare2(t1,t2)){
            Tree * temp2 = new Tree();
            return temp2;
        }
        return temp1;        
    }

    /*
    Print sur la sortie standard
    */
    Tree * print(Tree * t)
    {
        if (t->getHead() != nullptr){
            print(t->getHead());
        }        
        std::cout << t->getSymbol() << std::endl;
        if (t->getTail() != nullptr){
            print(t->getTail());
        }
        return new Tree();
    }
};
WhileStandard::Tree * fun_not(WhileStandard::Tree * Op1);
WhileStandard::Tree * fun_and(WhileStandard::Tree * Op1,WhileStandard::Tree * Op2);
WhileStandard::Tree * fun_true();
WhileStandard::Tree * fun_false();
WhileStandard::Tree * fun_not(WhileStandard::Tree * Op1) {
    WhileStandard::Tree * Result = new WhileStandard::Tree();
    WhileStandard::Tree * t1 = new WhileStandard::Tree();
    t1 = new WhileStandard::Tree(Op1);
    if ( t1->isNil() )
    goto label12;
    {
    WhileStandard::Tree * t6 = new WhileStandard::Tree();
    t6 = fun_false();
    Result = new WhileStandard::Tree(t6);
    goto label17;
    }
    {
    label12 :
    WhileStandard::Tree * t13 = new WhileStandard::Tree();
    t13 = fun_true();
    Result = new WhileStandard::Tree(t13);
    }
    label17 :
    return Result;
}
WhileStandard::Tree * fun_and(WhileStandard::Tree * Op1,WhileStandard::Tree * Op2) {
    WhileStandard::Tree * Result = new WhileStandard::Tree();
    WhileStandard::Tree * t1 = new WhileStandard::Tree();
    t1 = new WhileStandard::Tree(Op1);
    WhileStandard::Tree * t3 = new WhileStandard::Tree();
    t3 = fun_not(t1);
    if ( t1->isNil() )
    goto label14;
    {
    WhileStandard::Tree * t8 = new WhileStandard::Tree();
    t8 = fun_false();
    Result = new WhileStandard::Tree(t8);
    goto label35;
    }
    {
    label14 :
    WhileStandard::Tree * t15 = new WhileStandard::Tree();
    t15 = new WhileStandard::Tree(Op2);
    WhileStandard::Tree * t17 = new WhileStandard::Tree();
    t17 = fun_not(t15);
    if ( t15->isNil() )
    goto label28;
    {
    WhileStandard::Tree * t22 = new WhileStandard::Tree();
    t22 = fun_false();
    Result = new WhileStandard::Tree(t22);
    goto label33;
    }
    {
    label28 :
    WhileStandard::Tree * t29 = new WhileStandard::Tree();
    t29 = fun_true();
    Result = new WhileStandard::Tree(t29);
    }
    label33 :
    }
    label35 :
    return Result;
}
WhileStandard::Tree * fun_true() {
    WhileStandard::Tree * Result = new WhileStandard::Tree();
    WhileStandard::Tree * t1 = new WhileStandard::Tree();
    WhileStandard::Tree * t2 = new WhileStandard::Tree();
    WhileStandard::Tree * t3 = new WhileStandard::Tree();
    t1->setHead(t2);
    t1->setTail(t3);
    Result = new WhileStandard::Tree(t1);
    return Result;
}
WhileStandard::Tree * fun_false() {
    WhileStandard::Tree * Result = new WhileStandard::Tree();
    WhileStandard::Tree * t1 = new WhileStandard::Tree();
    Result = new WhileStandard::Tree(t1);
    return Result;
}
