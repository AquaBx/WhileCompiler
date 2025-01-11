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
WhileStandard::Tree * fun_add(WhileStandard::Tree * Op1,WhileStandard::Tree * Op2);
WhileStandard::Tree * fun_sub(WhileStandard::Tree * Op1,WhileStandard::Tree * Op2);
WhileStandard::Tree * fun_not(WhileStandard::Tree * Op1);
WhileStandard::Tree * fun_mul(WhileStandard::Tree * Op1,WhileStandard::Tree * Op2);
WhileStandard::Tree * fun_and(WhileStandard::Tree * Op1,WhileStandard::Tree * Op2);
WhileStandard::Tree * fun_true();
WhileStandard::Tree * fun_false();
int main();
WhileStandard::Tree * fun_add(WhileStandard::Tree * Op1,WhileStandard::Tree * Op2) {
    WhileStandard::Tree * Result = new WhileStandard::Tree();
    WhileStandard::Tree * t1 = new WhileStandard::Tree();
    t1 = new WhileStandard::Tree(Op1);
    Result = new WhileStandard::Tree(t1);
    WhileStandard::Tree * t4 = new WhileStandard::Tree();
    t4 = new WhileStandard::Tree(Op2);
    WhileStandard::Tree * t6 = new WhileStandard::Tree();
    label7 :
    WhileStandard::Tree * t8 = new WhileStandard::Tree();
    WhileStandard::Tree * t9 = new WhileStandard::Tree();
    t9 = WhileStandard::compare(t4,t6);
    if ( t8->isNil() )
    goto label24;
    {
    WhileStandard::Tree * t14 = new WhileStandard::Tree();
    WhileStandard::Tree * t15 = new WhileStandard::Tree();
    WhileStandard::Tree * t16 = new WhileStandard::Tree();
    t16 = new WhileStandard::Tree(Result);
    t14->setHead(t15);
    t14->setTail(t16);
    Result = new WhileStandard::Tree(t14);
    *t6 += 1;
    goto label7;
    }
    label24 :
    return Result;
}
WhileStandard::Tree * fun_sub(WhileStandard::Tree * Op1,WhileStandard::Tree * Op2) {
    WhileStandard::Tree * Result = new WhileStandard::Tree();
    WhileStandard::Tree * t1 = new WhileStandard::Tree();
    t1 = new WhileStandard::Tree(Op1);
    Result = new WhileStandard::Tree(t1);
    WhileStandard::Tree * t4 = new WhileStandard::Tree();
    t4 = new WhileStandard::Tree(Op2);
    WhileStandard::Tree * t6 = new WhileStandard::Tree();
    label7 :
    WhileStandard::Tree * t8 = new WhileStandard::Tree();
    WhileStandard::Tree * t9 = new WhileStandard::Tree();
    t9 = WhileStandard::compare(t4,t6);
    if ( t8->isNil() )
    goto label20;
    {
    WhileStandard::Tree * t14 = new WhileStandard::Tree();
    t14 = new WhileStandard::Tree(Result);
    Result = new WhileStandard::Tree(t14);
    *t6 += 1;
    goto label7;
    }
    label20 :
    return Result;
}
WhileStandard::Tree * fun_not(WhileStandard::Tree * Op1) {
    WhileStandard::Tree * Result = new WhileStandard::Tree();
    WhileStandard::Tree * t1 = new WhileStandard::Tree();
    t1 = new WhileStandard::Tree(Op1);
    if ( t1->isNil() )
    goto label13;
    {
    WhileStandard::Tree * t6 = new WhileStandard::Tree();
    WhileStandard::Tree * t7 = new WhileStandard::Tree();
    t7 = fun_false();
    Result = new WhileStandard::Tree(t6);
    goto label19;
    }
    {
    label13 :
    WhileStandard::Tree * t14 = new WhileStandard::Tree();
    WhileStandard::Tree * t15 = new WhileStandard::Tree();
    t15 = fun_true();
    Result = new WhileStandard::Tree(t14);
    }
    label19 :
    return Result;
}
WhileStandard::Tree * fun_mul(WhileStandard::Tree * Op1,WhileStandard::Tree * Op2) {
    WhileStandard::Tree * Result = new WhileStandard::Tree();
    WhileStandard::Tree * t1 = new WhileStandard::Tree();
    t1 = new WhileStandard::Tree(Op1);
    WhileStandard::Tree * t3 = new WhileStandard::Tree();
    label4 :
    WhileStandard::Tree * t5 = new WhileStandard::Tree();
    WhileStandard::Tree * t6 = new WhileStandard::Tree();
    t6 = WhileStandard::compare(t1,t3);
    if ( t5->isNil() )
    goto label22;
    {
    WhileStandard::Tree * t11 = new WhileStandard::Tree();
    t11 = new WhileStandard::Tree(Result);
    WhileStandard::Tree * t13 = new WhileStandard::Tree();
    t13 = new WhileStandard::Tree(Op2);
    WhileStandard::Tree * t15 = new WhileStandard::Tree();
    WhileStandard::Tree * t16 = new WhileStandard::Tree();
    t16 = fun_add(t11,t13);
    Result = new WhileStandard::Tree(t11);
    *t3 += 1;
    goto label4;
    }
    label22 :
    return Result;
}
WhileStandard::Tree * fun_and(WhileStandard::Tree * Op1,WhileStandard::Tree * Op2) {
    WhileStandard::Tree * Result = new WhileStandard::Tree();
    WhileStandard::Tree * t1 = new WhileStandard::Tree();
    t1 = new WhileStandard::Tree(Op1);
    WhileStandard::Tree * t3 = new WhileStandard::Tree();
    WhileStandard::Tree * t4 = new WhileStandard::Tree();
    t4 = fun_not(t1);
    if ( t1->isNil() )
    goto label16;
    {
    WhileStandard::Tree * t9 = new WhileStandard::Tree();
    WhileStandard::Tree * t10 = new WhileStandard::Tree();
    t10 = fun_false();
    Result = new WhileStandard::Tree(t9);
    goto label40;
    }
    {
    label16 :
    WhileStandard::Tree * t17 = new WhileStandard::Tree();
    t17 = new WhileStandard::Tree(Op2);
    WhileStandard::Tree * t19 = new WhileStandard::Tree();
    WhileStandard::Tree * t20 = new WhileStandard::Tree();
    t20 = fun_not(t17);
    if ( t17->isNil() )
    goto label32;
    {
    WhileStandard::Tree * t25 = new WhileStandard::Tree();
    WhileStandard::Tree * t26 = new WhileStandard::Tree();
    t26 = fun_false();
    Result = new WhileStandard::Tree(t25);
    goto label38;
    }
    {
    label32 :
    WhileStandard::Tree * t33 = new WhileStandard::Tree();
    WhileStandard::Tree * t34 = new WhileStandard::Tree();
    t34 = fun_true();
    Result = new WhileStandard::Tree(t33);
    }
    label38 :
    }
    label40 :
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
int main() {
    WhileStandard::Tree * Result = new WhileStandard::Tree();
    WhileStandard::Tree * t1 = new WhileStandard::Tree("salutIZNIJADBZHABUHB");
    WhileStandard::Tree * Text = new WhileStandard::Tree();
    Text = new WhileStandard::Tree(t1);
    WhileStandard::Tree * t4 = new WhileStandard::Tree();
    t4 = new WhileStandard::Tree(Text);
    WhileStandard::Tree * t6 = new WhileStandard::Tree();
    WhileStandard::Tree * t7 = new WhileStandard::Tree();
    t7 = WhileStandard::print(t4);
    Result = new WhileStandard::Tree(t4);
    return *Result;
}
