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
