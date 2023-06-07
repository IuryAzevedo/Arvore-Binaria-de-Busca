class Node {
    int valor;
    Node esquerda;
    Node direita;

    public Node(int valor) {
        this.valor = valor;
        esquerda = null;
        direita = null;
    }
}

class ArvoreBinariaBusca {
    Node raiz;

    public void insert(int value) {
        raiz = insertNode(raiz, value);
    }

    private Node insertNode(Node raiz, int valor) {
        if (raiz == null) {
            return new Node(valor);
        }

        if (valor < raiz.valor) {
            raiz.esquerda = insertNode(raiz.esquerda, valor);
        } else if (valor > raiz.valor) {
            raiz.direita = insertNode(raiz.direita, valor);
        }

        return raiz;
    }

    public void printPaths(int testNumber) {
        System.out.println("Case " + testNumber + ":");

        System.out.print("Pre.: ");
        printPrefix(raiz);
        System.out.println();

        System.out.print("In..: ");
        printInfix(raiz);
        System.out.println();

        System.out.print("Post: ");
        printPostfix(raiz);
        System.out.println();

        System.out.println();
    }

    private void printPrefix(Node raiz) {
        if (raiz != null) {
            System.out.print(raiz.valor + " ");
            printPrefix(raiz.esquerda);
            printPrefix(raiz.direita);
        }
    }

    private void printInfix(Node raiz) {
        if (raiz != null) {
            printInfix(raiz.esquerda);
            System.out.print(raiz.valor + " ");
            printInfix(raiz.direita);
        }
    }

    private void printPostfix(Node raiz) {
        if (raiz != null) {
            printPostfix(raiz.esquerda);
            printPostfix(raiz.direita);
            System.out.print(raiz.valor + " ");
        }
    }
}
