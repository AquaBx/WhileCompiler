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
        static Tree createReturn( const Tree & value ){
            Tree retour;
            retour.setHead(value);
            return retour;
        }

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

        Tree operator+(int v) const
        {
            Tree newT(*this);
            for (int i = 0; i < v; i++)
            {
                if (newT.hasTail())
                {
                    Tree newTail;
                    newTail.setTail(newT.getTail());
                    newT.setTail(newTail);
                }
                else
                {
                    newT.setTail(Tree());
                }
            }
            return newT;
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
            return Tree::createReturn(temp2);
        }
        return Tree::createReturn(temp1);
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
        return Tree::createReturn(t);
    }

     /*
    Print sur la sortie standard
    */
    Tree printInt(const Tree &t)
    {
        std::cout << (int)t << std::endl;
        return Tree::createReturn(t);
    }
};WhileStandard::Tree fun_add(const WhileStandard::Tree & Op1,const WhileStandard::Tree & Op2);
WhileStandard::Tree fun_sub(const WhileStandard::Tree & Op1,const WhileStandard::Tree & Op2);
WhileStandard::Tree fun_mul(const WhileStandard::Tree & Op1,const WhileStandard::Tree & Op2);
WhileStandard::Tree fun_add(const WhileStandard::Tree & Op1,const WhileStandard::Tree & Op2) {
    WhileStandard::Tree Result;
    WhileStandard::Tree t1;
    t1 = WhileStandard::Tree(Op1);
    Result = WhileStandard::Tree(t1);
    WhileStandard::Tree t4;
    t4 = WhileStandard::Tree(Op2);
    WhileStandard::Tree t6;
    WhileStandard::Tree t7;
    label8 :
    WhileStandard::Tree t9;
    t9 = WhileStandard::compare(t4,t6);
    t7 = t9.getHead();
    if ( !t7.isNil() )
    goto label25;
    {
    WhileStandard::Tree t15;
    WhileStandard::Tree t16;
    WhileStandard::Tree t17;
    t17 = WhileStandard::Tree(Result);
    t15.setHead(t16);
    t15.setTail(t17);
    Result = WhileStandard::Tree(t15);
    t6 += 1;
    goto label8;
    }
    label25 :
    WhileStandard::Tree t26;
    t26.setHead(Result);
    Result = WhileStandard::Tree(t26);
    return Result;
}
WhileStandard::Tree fun_sub(const WhileStandard::Tree & Op1,const WhileStandard::Tree & Op2) {
    WhileStandard::Tree Result;
    WhileStandard::Tree t1;
    t1 = WhileStandard::Tree(Op1);
    Result = WhileStandard::Tree(t1);
    WhileStandard::Tree t4;
    t4 = WhileStandard::Tree(Op2);
    WhileStandard::Tree t6;
    WhileStandard::Tree t7;
    label8 :
    WhileStandard::Tree t9;
    t9 = WhileStandard::compare(t4,t6);
    t7 = t9.getHead();
    if ( !t7.isNil() )
    goto label21;
    {
    WhileStandard::Tree t15;
    t15 = WhileStandard::Tree(Result);
    Result = WhileStandard::Tree(t15);
    t6 += 1;
    goto label8;
    }
    label21 :
    WhileStandard::Tree t22;
    t22.setHead(Result);
    Result = WhileStandard::Tree(t22);
    return Result;
}
WhileStandard::Tree fun_mul(const WhileStandard::Tree & Op1,const WhileStandard::Tree & Op2) {
    WhileStandard::Tree Result;
    WhileStandard::Tree t1;
    t1 = WhileStandard::Tree(Op1);
    WhileStandard::Tree t3;
    WhileStandard::Tree t4;
    label5 :
    WhileStandard::Tree t6;
    t6 = WhileStandard::compare(t1,t3);
    t4 = t6.getHead();
    if ( !t4.isNil() )
    goto label24;
    {
    WhileStandard::Tree t12;
    WhileStandard::Tree t13;
    t13 = WhileStandard::Tree(Result);
    WhileStandard::Tree t15;
    t15 = WhileStandard::Tree(Op2);
    WhileStandard::Tree t17;
    t17 = fun_add(t13,t15);
    t12 = t17.getHead();
    Result = WhileStandard::Tree(t12);
    t3 += 1;
    goto label5;
    }
    label24 :
    WhileStandard::Tree t25;
    t25.setHead(Result);
    Result = WhileStandard::Tree(t25);
    return Result;
}
