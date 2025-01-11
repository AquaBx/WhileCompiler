#include <stack>
namespace WhileStandard
{

    class Tree
    {
    private:
        Tree *head;
        Tree *tail;

    public:
        Tree() : head(nullptr), tail(nullptr)
        {
        }

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
    };
    
    std::stack<Tree *> *Stack;
    static std::stack<Tree *> *getStack()
    {
        if (Stack == nullptr)
        {
            Stack = new std::stack<Tree *>();
        }
        return Stack;
    }

    /*
    Compare 2 arbres
    - Renvoie un arbre si les deux sont égaux
    - Renvoie nullptr sinon
    */
    void compare()
    {
        Tree *t1 = getStack()->top();
        getStack()->pop();
        Tree *t2 = getStack()->top();
        getStack()->pop();

        if (t1 == nullptr && t2 == nullptr)
        {
            getStack()->push(new Tree());
        }
        else if (t1 == nullptr || t2 == nullptr)
        {
            getStack()->push(nullptr);
        }
        else
        {
            getStack()->push(t2->getHead());
            getStack()->push(t1->getHead());
            compare();
            Tree *cond1 = getStack()->top();
            getStack()->pop();

            getStack()->push(t2->getTail());
            getStack()->push(t1->getTail());
            compare();
            Tree *cond2 = getStack()->top();
            getStack()->pop();

            getStack()->push(cond2);
            getStack()->push(cond1);
            compare();

            /* pas utile mais pour l'explication
            Tree *retour = getStack()->top();
            getStack()->pop();
            getStack()->push(retour);
            */
        }
    }

    /*
    Génère un symbol sous forme d'arbre
    */
    void generateSymbol()
    {
    }

    /*
    Génère une liste d'arbre
    */
    void generateList()
    {
    }

    /*
    Print sur la sortie standard
    */
    void print()
    {
    }
};
void fun_add();
void fun_sub();
void fun_not();
void fun_mul();
void fun_and();
void fun_true();
void fun_false();
int main();
void fun_add() {
    WhileStandard::Tree * Op1 = nullptr;
    Op1 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    WhileStandard::Tree * Op2 = nullptr;
    Op2 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    WhileStandard::Tree * Result = nullptr;
    WhileStandard::Tree * t5 = nullptr;
    t5 = new WhileStandard::Tree(Op1);
    Result = new WhileStandard::Tree(t5);
    WhileStandard::Tree * t8 = nullptr;
    t8 = new WhileStandard::Tree(Op2);
    WhileStandard::Tree * t10 = nullptr;
    label11 :
    WhileStandard::Tree * t12 = nullptr;
    WhileStandard::getStack()->push(t10);
    WhileStandard::getStack()->push(t8);
    WhileStandard::compare();
    t12 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    WhileStandard::Tree * t17 = nullptr;
    t17 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    if ( t17 == nullptr )
    goto label32;
    {
    WhileStandard::Tree * t22 = nullptr;
    WhileStandard::Tree * t23 = nullptr;
    WhileStandard::Tree * t24 = nullptr;
    t24 = new WhileStandard::Tree(Result);
    t22->setHead(t23);
    t22->setTail(t24);
    Result = new WhileStandard::Tree(t22);
    t10 += 1;
    goto label11;
    }
    label32 :
    WhileStandard::getStack()->push(Result);
}
void fun_sub() {
    WhileStandard::Tree * Op1 = nullptr;
    Op1 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    WhileStandard::Tree * Op2 = nullptr;
    Op2 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    WhileStandard::Tree * Result = nullptr;
    WhileStandard::Tree * t5 = nullptr;
    t5 = new WhileStandard::Tree(Op1);
    Result = new WhileStandard::Tree(t5);
    WhileStandard::Tree * t8 = nullptr;
    t8 = new WhileStandard::Tree(Op2);
    WhileStandard::Tree * t10 = nullptr;
    label11 :
    WhileStandard::Tree * t12 = nullptr;
    WhileStandard::getStack()->push(t10);
    WhileStandard::getStack()->push(t8);
    WhileStandard::compare();
    t12 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    WhileStandard::Tree * t17 = nullptr;
    t17 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    if ( t17 == nullptr )
    goto label28;
    {
    WhileStandard::Tree * t22 = nullptr;
    t22 = new WhileStandard::Tree(Result);
    Result = new WhileStandard::Tree(t22);
    t10 += 1;
    goto label11;
    }
    label28 :
    WhileStandard::getStack()->push(Result);
}
void fun_not() {
    WhileStandard::Tree * Op1 = nullptr;
    Op1 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    WhileStandard::Tree * Result = nullptr;
    WhileStandard::Tree * t3 = nullptr;
    t3 = new WhileStandard::Tree(Op1);
    if ( t3 == nullptr )
    goto label15;
    {
    WhileStandard::Tree * t8 = nullptr;
    fun_false();
    t8 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    Result = new WhileStandard::Tree(t8);
    goto label21;
    }
    {
    label15 :
    WhileStandard::Tree * t16 = nullptr;
    fun_true();
    t16 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    Result = new WhileStandard::Tree(t16);
    }
    label21 :
    WhileStandard::getStack()->push(Result);
}
void fun_mul() {
    WhileStandard::Tree * Op1 = nullptr;
    Op1 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    WhileStandard::Tree * Op2 = nullptr;
    Op2 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    WhileStandard::Tree * Result = nullptr;
    WhileStandard::Tree * t5 = nullptr;
    t5 = new WhileStandard::Tree(Op1);
    WhileStandard::Tree * t7 = nullptr;
    label8 :
    WhileStandard::Tree * t9 = nullptr;
    WhileStandard::getStack()->push(t7);
    WhileStandard::getStack()->push(t5);
    WhileStandard::compare();
    t9 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    WhileStandard::Tree * t14 = nullptr;
    t14 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    if ( t14 == nullptr )
    goto label32;
    {
    WhileStandard::Tree * t19 = nullptr;
    t19 = new WhileStandard::Tree(Result);
    WhileStandard::Tree * t21 = nullptr;
    t21 = new WhileStandard::Tree(Op2);
    WhileStandard::Tree * t23 = nullptr;
    WhileStandard::getStack()->push(t21);
    WhileStandard::getStack()->push(t19);
    fun_add();
    t23 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    Result = new WhileStandard::Tree(t19);
    t7 += 1;
    goto label8;
    }
    label32 :
    WhileStandard::getStack()->push(Result);
}
void fun_and() {
    WhileStandard::Tree * Op1 = nullptr;
    Op1 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    WhileStandard::Tree * Op2 = nullptr;
    Op2 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    WhileStandard::Tree * Result = nullptr;
    WhileStandard::Tree * t5 = nullptr;
    t5 = new WhileStandard::Tree(Op1);
    WhileStandard::Tree * t7 = nullptr;
    WhileStandard::getStack()->push(t5);
    fun_not();
    t7 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    if ( t5 == nullptr )
    goto label21;
    {
    WhileStandard::Tree * t14 = nullptr;
    fun_false();
    t14 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    Result = new WhileStandard::Tree(t14);
    goto label46;
    }
    {
    label21 :
    WhileStandard::Tree * t22 = nullptr;
    t22 = new WhileStandard::Tree(Op2);
    WhileStandard::Tree * t24 = nullptr;
    WhileStandard::getStack()->push(t22);
    fun_not();
    t24 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    if ( t22 == nullptr )
    goto label38;
    {
    WhileStandard::Tree * t31 = nullptr;
    fun_false();
    t31 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    Result = new WhileStandard::Tree(t31);
    goto label44;
    }
    {
    label38 :
    WhileStandard::Tree * t39 = nullptr;
    fun_true();
    t39 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    Result = new WhileStandard::Tree(t39);
    }
    label44 :
    }
    label46 :
    WhileStandard::getStack()->push(Result);
}
void fun_true() {
    WhileStandard::Tree * Result = nullptr;
    WhileStandard::Tree * t1 = nullptr;
    WhileStandard::Tree * t2 = nullptr;
    WhileStandard::Tree * t3 = nullptr;
    t1->setHead(t2);
    t1->setTail(t3);
    Result = new WhileStandard::Tree(t1);
    WhileStandard::getStack()->push(Result);
}
void fun_false() {
    WhileStandard::Tree * Result = nullptr;
    WhileStandard::Tree * t1 = nullptr;
    Result = new WhileStandard::Tree(t1);
    WhileStandard::getStack()->push(Result);
}
int main() {
    WhileStandard::Tree * Result = nullptr;
    WhileStandard::Tree * t1 = nullptr;
    WhileStandard::Tree * t2 = nullptr;
    WhileStandard::getStack()->push(t1);
    WhileStandard::print();
    t2 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    Result = new WhileStandard::Tree(t1);
    WhileStandard::getStack()->push(Result);
return 0;
}
