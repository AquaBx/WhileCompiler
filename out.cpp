#include <stack>
#include <string>
#include <iostream>
#include <cassert>
namespace WhileStandard
{

    class Tree
    {
    private:
        Tree *head;
        Tree *tail;
        std::string symbol;

    public:
        bool isNil() const
        {
            return !hasTail() && !hasHead();
        }

        std::string getSymbol() const { return symbol; }

        Tree() : head(nullptr), tail(nullptr), symbol("") {}
        Tree(const std::string symbol) : head(nullptr), tail(nullptr), symbol(symbol) {}

        Tree(const Tree &old)
        {
            if (old.hasHead())
            {
                this->setHead(old.getHead());
            }
            else
            {
                this->head = nullptr;
            }
            if (old.hasTail())
            {
                this->setTail(old.getTail());
            }
            else
            {
                this->tail = nullptr;
            }
            this->symbol = old.getSymbol();
        }

        Tree &operator=(const Tree &old)
        {
            if (this != &old)
            {
                if (old.hasHead())
                {
                    delete this->head;
                    this->setHead(old.getHead());
                }
                else
                {
                    this->head = nullptr;
                }
                if (old.hasTail())
                {
                    delete this->tail;
                    this->setTail(old.getTail());
                }
                else
                {
                    this->tail = nullptr;
                }
                this->symbol = old.getSymbol();
            }
            return *this;
        }

        bool hasTail() const
        {
            return this->tail != nullptr;
        }

        bool hasHead() const
        {
            return this->head != nullptr;
        }

        Tree getTail() const
        {
            assert(hasTail());
            return Tree(*this->tail);
        }

        Tree getHead() const
        {
            assert(hasHead());
            return Tree(*this->head);
        }

        void setTail(const Tree &tail)
        {
            this->tail = new Tree(tail);
        }

        void setHead(const Tree &head)
        {
            this->head = new Tree(head);
        }

        ~Tree()
        {
            if (hasHead())
            {
                delete head;
            }
            if (hasTail())
            {
                delete tail;
            }
        }

        Tree &operator+=(int v)
        {
            for (int i = 0; i < v; i++)
            {
                if (this->hasTail())
                {
                    Tree newTail;
                    newTail.setTail(this->getTail());
                    this->setTail(newTail);
                }
                else
                {
                    this->setTail(Tree());
                }
            }
            return *this;
        }

        operator int() const
        {
            if (this->isNil())
            {
                return 0;
            }
            return 1 + static_cast<int>(this->getTail());
        }
    };

    bool compare2(const Tree &t1, const Tree &t2)
    {
        if (t1.isNil() && t2.isNil()) return true;
        if (t1.isNil() || t2.isNil()) return false;

        bool cond1 = t1.hasHead() && t2.hasHead() ? compare2(t1.getHead(), t2.getHead()) : true;
        bool cond2 = t1.hasTail() && t2.hasTail() ? compare2(t1.getTail(), t2.getTail()) : true;

       return cond1 && cond2;
    }

    /*
     Compare 2 arbres
     - Renvoie un arbre non vide si les deux sont égaux
     - Renvoie un arbre vide sinon sinon
     */
    Tree compare(const Tree &t1, const Tree &t2)
    {
        Tree temp1;
        if (compare2(t1, t2))
        {
            Tree temp2;
            temp2.setTail(temp1);
            return temp2;
        }
        return temp1;
    }

    /*
    Print sur la sortie standard
    */
    Tree print(const Tree &t)
    {
        if (t.hasHead())
        {
            print(t.getHead());
        }
        std::cout << t.getSymbol() << std::endl;
        if (t.hasTail())
        {
            print(t.getTail());
        }
        return t;
    }

     /*
    Print sur la sortie standard
    */
    Tree printInt(const Tree &t)
    {
        std::cout << (int)t << std::endl;
        return t;
    }
};WhileStandard::Tree fun_not(const WhileStandard::Tree & Op1);
WhileStandard::Tree fun_and(const WhileStandard::Tree & Op1,const WhileStandard::Tree & Op2);
WhileStandard::Tree fun_true();
WhileStandard::Tree fun_false();
WhileStandard::Tree fun_not(const WhileStandard::Tree & Op1) {
    WhileStandard::Tree Result;
    WhileStandard::Tree t1;
    t1 = WhileStandard::Tree(Op1);
    if ( t1.isNil() )
    goto label14;
    {
    WhileStandard::Tree t6;
    WhileStandard::Tree t7;
    t7 = fun_false();
    t6 = t7.getHead();
    Result = WhileStandard::Tree(t6);
    goto label21;
    }
    {
    label14 :
    WhileStandard::Tree t15;
    WhileStandard::Tree t16;
    t16 = fun_true();
    t15 = t16.getHead();
    Result = WhileStandard::Tree(t15);
    }
    label21 :
    WhileStandard::Tree t22;
    Result.setHead(Result);
    WhileStandard::Tree t24;
    t24.setHead(t22);
    Result.setTail(t24);
    return Result;
}
WhileStandard::Tree fun_and(const WhileStandard::Tree & Op1,const WhileStandard::Tree & Op2) {
    WhileStandard::Tree Result;
    WhileStandard::Tree t1;
    WhileStandard::Tree t2;
    t2 = WhileStandard::Tree(Op1);
    WhileStandard::Tree t4;
    t4 = fun_not(t2);
    t1 = t4.getHead();
    if ( t1.isNil() )
    goto label18;
    {
    WhileStandard::Tree t10;
    WhileStandard::Tree t11;
    t11 = fun_false();
    t10 = t11.getHead();
    Result = WhileStandard::Tree(t10);
    goto label45;
    }
    {
    label18 :
    WhileStandard::Tree t19;
    WhileStandard::Tree t20;
    t20 = WhileStandard::Tree(Op2);
    WhileStandard::Tree t22;
    t22 = fun_not(t20);
    t19 = t22.getHead();
    if ( t19.isNil() )
    goto label36;
    {
    WhileStandard::Tree t28;
    WhileStandard::Tree t29;
    t29 = fun_false();
    t28 = t29.getHead();
    Result = WhileStandard::Tree(t28);
    goto label43;
    }
    {
    label36 :
    WhileStandard::Tree t37;
    WhileStandard::Tree t38;
    t38 = fun_true();
    t37 = t38.getHead();
    Result = WhileStandard::Tree(t37);
    }
    label43 :
    }
    label45 :
    WhileStandard::Tree t46;
    Result.setHead(Result);
    WhileStandard::Tree t48;
    t48.setHead(t46);
    Result.setTail(t48);
    return Result;
}
WhileStandard::Tree fun_true() {
    WhileStandard::Tree Result;
    WhileStandard::Tree t1;
    WhileStandard::Tree t2;
    WhileStandard::Tree t3;
    t1.setHead(t2);
    t1.setTail(t3);
    Result = WhileStandard::Tree(t1);
    WhileStandard::Tree t7;
    Result.setHead(Result);
    WhileStandard::Tree t9;
    t9.setHead(t7);
    Result.setTail(t9);
    return Result;
}
WhileStandard::Tree fun_false() {
    WhileStandard::Tree Result;
    WhileStandard::Tree t1;
    Result = WhileStandard::Tree(t1);
    WhileStandard::Tree t3;
    Result.setHead(Result);
    WhileStandard::Tree t5;
    t5.setHead(t3);
    Result.setTail(t5);
    return Result;
}
