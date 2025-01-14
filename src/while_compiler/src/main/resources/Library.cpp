#include <cassert>
#include <iostream>
#include <string>

namespace WhileStandard {

    class Tree {
        Tree *head;
        Tree *tail;
        std::string symbol;


    public:
        static Tree createReturn(const Tree &value) {
            Tree tree;
            tree.setHead(value);
            return tree;
        }

        bool isNil() const { return !hasTail() && !hasHead(); }

        std::string getSymbol() const { return symbol; }

        Tree() : head(nullptr), tail(nullptr) {}
        explicit Tree(std::string symbol) : head(nullptr), tail(nullptr), symbol(std::move(symbol)) {}

        Tree(const Tree &old) : head(nullptr), tail(nullptr), symbol(old.symbol) {
            if (old.hasHead()) {
                this->setHead(old.getHead());
            }
            if (old.hasTail()) {
                this->setTail(old.getTail());
            }
            this->symbol = old.getSymbol();
        }

        Tree &operator=(const Tree &old) {
            if (this != &old) {
                if (old.hasHead()) {
                    this->setHead(old.getHead());
                } else {
                    this->head = nullptr;
                }
                if (old.hasTail()) {
                    this->setTail(old.getTail());
                } else {
                    this->tail = nullptr;
                }
                this->symbol = old.getSymbol();
            }
            return *this;
        }

        bool hasTail() const { return this->tail != nullptr; }

        bool hasHead() const { return this->head != nullptr; }

        Tree &getTail() const {
            assert(hasTail());
            return *this->tail;
        }

        Tree &getHead() const {
            assert(hasHead());
            return *this->head;
        }

        void setTail(const Tree &tail) {
            if (this->hasTail()) {
                delete this->tail;
            }
            this->tail = new Tree(tail);
        }

        void setHead(const Tree &head) {
            if (this->hasHead()) {
                delete this->head;
            }
            this->head = new Tree(head);
        }

        ~Tree() {
            if (this->hasHead()) {
                delete head;
            }
            if (this->hasTail()) {
                delete tail;
            }
        }

        Tree &operator+=(const int v) {
            for (int i = 0; i < v; i++) {
                if (this->hasTail()) {
                    Tree newTail;
                    newTail.setTail(this->getTail());
                    this->setTail(newTail);
                } else {
                    this->setTail(Tree());
                }
            }
            return *this;
        }

        Tree operator+(const int v) const {
            Tree newT(*this);
            for (int i = 0; i < v; i++) {
                if (newT.hasTail()) {
                    Tree newTail;
                    newTail.setTail(newT.getTail());
                    newT.setTail(newTail);
                } else {
                    newT.setTail(Tree());
                }
            }
            return newT;
        }

        explicit operator int() const {
            if (this->isNil()) {
                return 0;
            }
            return 1 + static_cast<int>(this->getTail());
        }

        explicit operator std::string() const {
            const std::string a = this->hasHead() ? static_cast<std::string>(this->getHead()) : "";
            const std::string b = this->getSymbol();
            const std::string c = this->hasTail() ? static_cast<std::string>(this->getTail()) : "";

            return a + b + c;
        }
    };

    bool compare2(const Tree &t1, const Tree &t2) {
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
    Tree compare(const Tree &t1, const Tree &t2) {
        const Tree temp1;
        if (compare2(t1, t2)) {
            Tree temp2;
            temp2.setTail(temp1);
            return Tree::createReturn(temp2);
        }
        return Tree::createReturn(temp1);
    }

    /*
    Print sur la sortie standard
    */
    Tree print(const Tree &t) {
        std::cout << static_cast<std::string>(t) << std::endl;
        return Tree::createReturn(t);
    }

    /*
   Print sur la sortie standard
   */
    Tree printInt(const Tree &t) {
        std::cout << static_cast<int>(t) << std::endl;
        return Tree::createReturn(t);
    }
};