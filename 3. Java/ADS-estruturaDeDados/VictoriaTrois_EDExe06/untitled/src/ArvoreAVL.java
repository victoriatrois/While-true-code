public class ArvoreAVL {
    Nodo raiz;

    int getAltura(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        return nodo.altura;
    }

    int getBalanceamento(Nodo nodo) {
        if (nodo == null)
            return 0;
        return getAltura(nodo.nodoEsquerdo) - getAltura(nodo.nodoDireito);
    }

    Nodo rotacionaParaEsquerda(Nodo nodo) {
        Nodo nodoDireitoChild = nodo.nodoDireito;
        Nodo nodoDireitonodoEsquerdoChild = nodoDireitoChild.nodoEsquerdo;

        nodoDireitoChild.nodoEsquerdo = nodo;
        nodo.nodoDireito = nodoDireitonodoEsquerdoChild;

        nodo.altura = Math.max(getAltura(nodo.nodoEsquerdo), getAltura(nodo.nodoDireito)) + 1;
        nodoDireitoChild.altura = Math.max(getAltura(nodoDireitoChild.nodoEsquerdo), getAltura(nodoDireitoChild.nodoDireito)) + 1;

        return nodoDireitoChild;
    }

    Nodo rotacionaParaDireita(Nodo nodo) {
        Nodo nodoEsquerdoChild = nodo.nodoEsquerdo;
        Nodo nodoEsquerdonodoDireitoChild = nodoEsquerdoChild.nodoDireito;

        nodoEsquerdoChild.nodoDireito = nodo;
        nodo.nodoEsquerdo = nodoEsquerdonodoDireitoChild;

        nodo.altura = Math.max(getAltura(nodo.nodoEsquerdo), getAltura(nodo.nodoDireito)) + 1;
        nodoEsquerdoChild.altura = Math.max(getAltura(nodoEsquerdoChild.nodoEsquerdo), getAltura(nodoEsquerdoChild.nodoDireito)) + 1;

        return nodoEsquerdoChild;
    }
    
    public Nodo insereNodo(Nodo novoNodo, int valor) {
        if (novoNodo == null) {
            return new Nodo(valor);
        }

        if (valor < novoNodo.valor)
            novoNodo.nodoEsquerdo = insereNodo(novoNodo.nodoEsquerdo, valor);
        else if (valor > novoNodo.valor)
            novoNodo.nodoDireito = insereNodo(novoNodo.nodoDireito, valor);
        else
            return novoNodo;

        novoNodo.altura = 1 + Math.max(getAltura(novoNodo.nodoEsquerdo), getAltura(novoNodo.nodoDireito));

        int balanceamento = getBalanceamento(novoNodo);

        if (balanceamento > 1 && valor < novoNodo.nodoEsquerdo.valor)
            return rotacionaParaDireita(novoNodo);

        if (balanceamento < -1 && valor > novoNodo.nodoDireito.valor)
            return rotacionaParaEsquerda(novoNodo);

        if (balanceamento > 1 && valor > novoNodo.nodoEsquerdo.valor) {
            novoNodo.nodoEsquerdo = rotacionaParaEsquerda(novoNodo.nodoEsquerdo);
            return rotacionaParaDireita(novoNodo);
        }

        if (balanceamento < -1 && valor < novoNodo.nodoDireito.valor) {
            novoNodo.nodoDireito = rotacionaParaDireita(novoNodo.nodoDireito);
            return rotacionaParaEsquerda(novoNodo);
        }

        return novoNodo;
    }

    public Nodo removeNodo(Nodo nodo, int valor) {
        if (nodo == null)
            return null;

        if (valor < nodo.valor)
            nodo.nodoEsquerdo = removeNodo(nodo.nodoEsquerdo, valor);
        else if (valor > nodo.valor)
            nodo.nodoDireito = removeNodo(nodo.nodoDireito, valor);
        else {
            if ((nodo.nodoEsquerdo == null) || (nodo.nodoDireito == null)) {
                Nodo temp = null;
                if (temp == nodo.nodoEsquerdo)
                    temp = nodo.nodoDireito;
                else
                    temp = nodo.nodoEsquerdo;

                if (temp == null) {
                    temp = nodo;
                    nodo = null;
                } else
                    nodo = temp;
            } else {
                Nodo temp = identificaNodoMenor(nodo.nodoDireito);

                nodo.valor = temp.valor;

                nodo.nodoDireito = removeNodo(nodo.nodoDireito, temp.valor);
            }
        }

        if (nodo == null)
            return null;

        nodo.altura = Math.max(getAltura(nodo.nodoEsquerdo), getAltura(nodo.nodoDireito)) + 1;

        int balanceamento = getBalanceamento(nodo);

        if (balanceamento > 1 && getBalanceamento(nodo.nodoEsquerdo) >= 0)
            return rotacionaParaDireita(nodo);

        if (balanceamento > 1 && getBalanceamento(nodo.nodoEsquerdo) < 0) {
            nodo.nodoEsquerdo = rotacionaParaEsquerda(nodo.nodoEsquerdo);
            return rotacionaParaDireita(nodo);
        }

        if (balanceamento < -1 && getBalanceamento(nodo.nodoDireito) <= 0)
            return rotacionaParaEsquerda(nodo);

        if (balanceamento < -1 && getBalanceamento(nodo.nodoDireito) > 0) {
            nodo.nodoDireito = rotacionaParaDireita(nodo.nodoDireito);
            return rotacionaParaEsquerda(nodo);
        }

        return nodo;
    }

    public Nodo identificaNodoMenor(Nodo nodo) {
        Nodo current = nodo;
        while (current.nodoEsquerdo != null)
            current = current.nodoEsquerdo;
        return current;
    }
    public void ordenaNodos(Nodo nodo) {
        while (true) {
            if (nodo != null) {
                ordenaNodos(nodo.nodoEsquerdo);
                System.out.print(nodo.valor + " ");
                nodo = nodo.nodoDireito;
                continue;
            }
            return;
        }
    }
    void exibirArvore(Nodo nodo, String indentacao, boolean ehFolha) {
        if (nodo != null) {
            System.out.print(indentacao);
            if (ehFolha) {
                System.out.print("└─");
                indentacao += "  ";
            } else {
                System.out.print("├─");
                indentacao += "| ";
            }
            System.out.println(nodo.valor);
            exibirArvore(nodo.nodoEsquerdo, indentacao, false);
            exibirArvore(nodo.nodoDireito, indentacao, true);
        }
    }
}
