#include <cassert>
#include <iostream>
#include <string>
#include <regex>

namespace WhileStandard
{

    class Tree
    {
        Tree *head;
        Tree *tail;
        std::string symbol;

    public:
        static Tree createReturn(const Tree &value)
        {
            Tree tree;
            tree.setHead(value);
            return tree;
        }

        bool isNil() const { return !hasTail() && !hasHead(); }

        bool isTrue() const { return hasTail(); }
        bool isFalse() const { return !isTrue(); }

        std::string getSymbol() const { return symbol; }

        Tree() : head(nullptr), tail(nullptr), symbol("") {}

        Tree(const int & v) : head(nullptr), tail(nullptr), symbol("")  {
            *this+=v;
        }

        explicit Tree(std::string symbol) : head(nullptr), tail(nullptr), symbol(std::move(symbol)) {}

        Tree(const Tree &old) : head(nullptr), tail(nullptr), symbol(old.symbol)
        {
            if (old.hasHead())
            {
                this->setHead(old.getHead());
            }
            if (old.hasTail())
            {
                this->setTail(old.getTail());
            }
            this->symbol = old.getSymbol();
        }

        Tree &operator=(const Tree &old)
        {
            if (this == &old)
                return *this;

            if (old.hasHead())
            {
                this->setHead(old.getHead());
            }
            else
            {
                delete this->head;
                this->head = nullptr;
            }
            if (old.hasTail())
            {
                this->setTail(old.getTail());
            }
            else
            {
                delete this->tail;
                this->tail = nullptr;
            }
            this->symbol = old.getSymbol();
            return *this;
        }

        bool hasTail() const { return this->tail != nullptr; }

        bool hasHead() const { return this->head != nullptr; }

        Tree getTail() const
        {
            if (hasTail())
            {
                return *this->tail;
            }
            else
            {
                Tree nilTree;
                return nilTree;
            }
        }

        Tree getHead() const
        {
            if (hasHead())
            {
                return *this->head;
            }
            else
            {
                Tree nilTree;
                return nilTree;
            }
        }

        void setTail(const Tree tail)
        {
            if (this->hasTail())
            {
                delete this->tail;
            }
            this->tail = new Tree(tail);
        }

        void setHead(const Tree head)
        {
            if (this->hasHead())
            {
                delete this->head;
            }
            this->head = new Tree(head);
        }

        ~Tree()
        {
            if (this->hasHead())
            {
                delete head;
            }
            if (this->hasTail())
            {
                delete tail;
            }
        }

        Tree &operator+=(const int v)
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

        Tree operator+(const int v) const
        {
            Tree newT(*this);
            newT += v;
            return newT;
        }

        Tree &operator-=(const int v)
        {
            Tree ret = *this;
            for (int i = 0; i < v; i++)
            {
                if (ret.hasTail())
                {
                    ret = ret.getTail();
                }
                else
                {
                    assert("cannot be negative");
                }
            }

            if (ret.hasTail())
            {
                this->setTail(ret.getTail());
            }
            else
            {
                delete tail;
                this->tail = nullptr;
            }

            return *this;
        }

        Tree operator-(const int v) const
        {
            Tree newT(*this);
            newT -= v;
            return newT;
        }

        operator int() const
        {
            if (!this->hasTail())
            {
                return 0;
            }
            return 1 + static_cast<int>(this->getTail());
        }

        operator std::string() const
        {
            const std::string a = this->hasHead() ? static_cast<std::string>(this->getHead()) : "";
            const std::string b = this->getSymbol();
            const std::string c = this->hasTail() ? static_cast<std::string>(this->getTail()) : "";

            return a + b + c;
        }
    };

    bool compare2(const Tree &t1, const Tree &t2)
    {
        if (t1.isNil() && t2.isNil())
            return true;
        if (t1.isNil() || t2.isNil())
            return false;

        const bool cond1 = t1.hasHead() && t2.hasHead() ? compare2(t1.getHead(), t2.getHead()) : true;
        const bool cond2 = t1.hasTail() && t2.hasTail() ? compare2(t1.getTail(), t2.getTail()) : true;

        return cond1 && cond2;
    }

    /*
     Compare 2 arbres
     - Renvoie un arbre non vide si les deux sont égaux
     - Renvoie un arbre vide sinon sinon
     */
    Tree compare(const Tree &t1, const Tree &t2)
    {
        const Tree temp1;
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
        std::cout << static_cast<std::string>(t) << std::endl;
        return Tree::createReturn(t);
    }

    /*
   Print sur la sortie standard
   */
    Tree printInt(const Tree &t)
    {
        std::cout << static_cast<int>(t) << std::endl;
        return Tree::createReturn(t);
    }

    Tree parseTree(const char * const input){
        if (std::regex_match(input, std::regex("[0-9]+"))){
            Tree a(std::stoi(input));
            return a;
        }
    }

    void pp(const Tree &t)
    {
        WhileStandard::Tree head = t.getHead();
        WhileStandard::Tree tail = t.getTail();
        std::string headSymbol = head.getSymbol();

        //   pp( (cons A B) ) avec 𝐴∉{𝑖𝑛𝑡,𝑏𝑜𝑜𝑙,𝑠𝑡𝑟𝑖𝑛𝑔 } -> (cons pp(A) pp(B))
        if (t.getSymbol() != "")
        {
            std::cout << t.getSymbol() << std::endl;
        }
        else if (t.isNil())
        {
            std::cout << "nil" << std::endl;
        }
        else if (headSymbol == "int")
        {
            std::cout << static_cast<int>(tail) << std::endl;
        }
        else if (headSymbol == "bool")
        {
            std::cout << tail.isTrue() << std::endl;
        }
        else if (headSymbol == "string")
        {
            std::cout << static_cast<std::string>(tail) << std::endl;
        }
        else {
            pp(head);
            pp(tail);
        }
    }
};