#include <stack>
#include <string>
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
        }        printf("%s",t->getSymbol());
        if (t->getTail() != nullptr){
            print(t->getTail());
        }
    }

    void print()
    {
        Tree *t1 = getStack()->top(); getStack()->pop();
        print(t1);
    }
};
