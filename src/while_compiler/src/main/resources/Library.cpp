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
    
    Tree * copyTree(Tree * ptr){
        if (ptr == nullptr){
            return nullptr;
        }
        return new Tree(ptr);
    }

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
