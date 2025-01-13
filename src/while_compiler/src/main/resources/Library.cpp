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
};