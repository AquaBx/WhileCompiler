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

    bool compare(Tree *t1, Tree *t2) {
        if (t1->isNil() && t2->isNil()) {
            return true;
        } else if (t1 == nullptr || t2 == nullptr) {
            return false;
        } else {
            bool cond1 = compare(t1->getHead(), t2->getHead());
            bool cond2 = compare(t1->getTail(), t2->getTail());
            return cond1 && cond2;
        }
    }

    void compare() {
        Tree *t1 = getStack()->top(); getStack()->pop();
        Tree *t2 = getStack()->top(); getStack()->pop();

        Tree * temp1 = new Tree();
        if (compare(t1,t2)){
            Tree * temp2 = new Tree();
            temp1->setTail(temp2);
        }
        getStack()->push(temp1);        
    }

    /*
    Print sur la sortie standard
    */
    void print(Tree * t)
    {
        if (t->getHead() != nullptr){
            print(t->getHead());
        }        
        std::cout << t->getSymbol() << std::endl;
        if (t->getTail() != nullptr){
            print(t->getTail());
        }
    }

    void print()
    {
        Tree *t1 = getStack()->top();
        print(t1);
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
    WhileStandard::Tree * Op1 = new WhileStandard::Tree();
    Op1 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    WhileStandard::Tree * Op2 = new WhileStandard::Tree();
    Op2 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    WhileStandard::Tree * Result = new WhileStandard::Tree();
    WhileStandard::Tree * t5 = new WhileStandard::Tree();
    t5 = new WhileStandard::Tree(Op1);
    Result = new WhileStandard::Tree(t5);
    WhileStandard::Tree * t8 = new WhileStandard::Tree();
    t8 = new WhileStandard::Tree(Op2);
    WhileStandard::Tree * t10 = new WhileStandard::Tree();
    label11 :
    WhileStandard::Tree * t12 = new WhileStandard::Tree();
    WhileStandard::getStack()->push(t10);
    WhileStandard::getStack()->push(t8);
    WhileStandard::compare();
    t12 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    WhileStandard::Tree * t17 = new WhileStandard::Tree();
    t17 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    if ( t17->isNil() )
    goto label32;
    {
    WhileStandard::Tree * t22 = new WhileStandard::Tree();
    WhileStandard::Tree * t23 = new WhileStandard::Tree();
    WhileStandard::Tree * t24 = new WhileStandard::Tree();
    t24 = new WhileStandard::Tree(Result);
    t22->setHead(t23);
    t22->setTail(t24);
    Result = new WhileStandard::Tree(t22);
    *t10 += 1;
    goto label11;
    }
    label32 :
    WhileStandard::getStack()->push(Result);
}
void fun_sub() {
    WhileStandard::Tree * Op1 = new WhileStandard::Tree();
    Op1 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    WhileStandard::Tree * Op2 = new WhileStandard::Tree();
    Op2 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    WhileStandard::Tree * Result = new WhileStandard::Tree();
    WhileStandard::Tree * t5 = new WhileStandard::Tree();
    t5 = new WhileStandard::Tree(Op1);
    Result = new WhileStandard::Tree(t5);
    WhileStandard::Tree * t8 = new WhileStandard::Tree();
    t8 = new WhileStandard::Tree(Op2);
    WhileStandard::Tree * t10 = new WhileStandard::Tree();
    label11 :
    WhileStandard::Tree * t12 = new WhileStandard::Tree();
    WhileStandard::getStack()->push(t10);
    WhileStandard::getStack()->push(t8);
    WhileStandard::compare();
    t12 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    WhileStandard::Tree * t17 = new WhileStandard::Tree();
    t17 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    if ( t17->isNil() )
    goto label28;
    {
    WhileStandard::Tree * t22 = new WhileStandard::Tree();
    t22 = new WhileStandard::Tree(Result);
    Result = new WhileStandard::Tree(t22);
    *t10 += 1;
    goto label11;
    }
    label28 :
    WhileStandard::getStack()->push(Result);
}
void fun_not() {
    WhileStandard::Tree * Op1 = new WhileStandard::Tree();
    Op1 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    WhileStandard::Tree * Result = new WhileStandard::Tree();
    WhileStandard::Tree * t3 = new WhileStandard::Tree();
    t3 = new WhileStandard::Tree(Op1);
    if ( t3->isNil() )
    goto label15;
    {
    WhileStandard::Tree * t8 = new WhileStandard::Tree();
    fun_false();
    t8 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    Result = new WhileStandard::Tree(t8);
    goto label21;
    }
    {
    label15 :
    WhileStandard::Tree * t16 = new WhileStandard::Tree();
    fun_true();
    t16 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    Result = new WhileStandard::Tree(t16);
    }
    label21 :
    WhileStandard::getStack()->push(Result);
}
void fun_mul() {
    WhileStandard::Tree * Op1 = new WhileStandard::Tree();
    Op1 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    WhileStandard::Tree * Op2 = new WhileStandard::Tree();
    Op2 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    WhileStandard::Tree * Result = new WhileStandard::Tree();
    WhileStandard::Tree * t5 = new WhileStandard::Tree();
    t5 = new WhileStandard::Tree(Op1);
    WhileStandard::Tree * t7 = new WhileStandard::Tree();
    label8 :
    WhileStandard::Tree * t9 = new WhileStandard::Tree();
    WhileStandard::getStack()->push(t7);
    WhileStandard::getStack()->push(t5);
    WhileStandard::compare();
    t9 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    WhileStandard::Tree * t14 = new WhileStandard::Tree();
    t14 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    if ( t14->isNil() )
    goto label32;
    {
    WhileStandard::Tree * t19 = new WhileStandard::Tree();
    t19 = new WhileStandard::Tree(Result);
    WhileStandard::Tree * t21 = new WhileStandard::Tree();
    t21 = new WhileStandard::Tree(Op2);
    WhileStandard::Tree * t23 = new WhileStandard::Tree();
    WhileStandard::getStack()->push(t21);
    WhileStandard::getStack()->push(t19);
    fun_add();
    t23 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    Result = new WhileStandard::Tree(t19);
    *t7 += 1;
    goto label8;
    }
    label32 :
    WhileStandard::getStack()->push(Result);
}
void fun_and() {
    WhileStandard::Tree * Op1 = new WhileStandard::Tree();
    Op1 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    WhileStandard::Tree * Op2 = new WhileStandard::Tree();
    Op2 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    WhileStandard::Tree * Result = new WhileStandard::Tree();
    WhileStandard::Tree * t5 = new WhileStandard::Tree();
    t5 = new WhileStandard::Tree(Op1);
    WhileStandard::Tree * t7 = new WhileStandard::Tree();
    WhileStandard::getStack()->push(t5);
    fun_not();
    t7 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    if ( t5->isNil() )
    goto label21;
    {
    WhileStandard::Tree * t14 = new WhileStandard::Tree();
    fun_false();
    t14 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    Result = new WhileStandard::Tree(t14);
    goto label46;
    }
    {
    label21 :
    WhileStandard::Tree * t22 = new WhileStandard::Tree();
    t22 = new WhileStandard::Tree(Op2);
    WhileStandard::Tree * t24 = new WhileStandard::Tree();
    WhileStandard::getStack()->push(t22);
    fun_not();
    t24 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    if ( t22->isNil() )
    goto label38;
    {
    WhileStandard::Tree * t31 = new WhileStandard::Tree();
    fun_false();
    t31 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    Result = new WhileStandard::Tree(t31);
    goto label44;
    }
    {
    label38 :
    WhileStandard::Tree * t39 = new WhileStandard::Tree();
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
    WhileStandard::Tree * Result = new WhileStandard::Tree();
    WhileStandard::Tree * t1 = new WhileStandard::Tree();
    WhileStandard::Tree * t2 = new WhileStandard::Tree();
    WhileStandard::Tree * t3 = new WhileStandard::Tree();
    t1->setHead(t2);
    t1->setTail(t3);
    Result = new WhileStandard::Tree(t1);
    WhileStandard::getStack()->push(Result);
}
void fun_false() {
    WhileStandard::Tree * Result = new WhileStandard::Tree();
    WhileStandard::Tree * t1 = new WhileStandard::Tree();
    Result = new WhileStandard::Tree(t1);
    WhileStandard::getStack()->push(Result);
}
int main() {
    WhileStandard::Tree * Result = new WhileStandard::Tree();
    WhileStandard::Tree * t1 = new WhileStandard::Tree("salutIZNIJADBZHABUHB");
    WhileStandard::Tree * Text = new WhileStandard::Tree();
    Text = new WhileStandard::Tree(t1);
    WhileStandard::Tree * t4 = new WhileStandard::Tree();
    t4 = new WhileStandard::Tree(Text);
    WhileStandard::Tree * t6 = new WhileStandard::Tree();
    WhileStandard::getStack()->push(t4);
    WhileStandard::print();
    t6 = WhileStandard::getStack()->top(); WhileStandard::getStack()->pop();
    Result = new WhileStandard::Tree(t4);
    WhileStandard::getStack()->push(Result);
return 0;
}
