class ArvoreB {
    private NohDaArvore raiz;
    private final int grauMinimo;

    public ArvoreB(int grauMinimo) {
        raiz = new NohDaArvore();
        this.grauMinimo = grauMinimo;
    }

    public void insereNoh(int chave) {
        NohDaArvore inicioDaBusca = raiz;
        if (inicioDaBusca.chaves.size() == (2 * grauMinimo) - 1) {
            NohDaArvore nohDividido = new NohDaArvore();
            raiz = nohDividido;
            nohDividido.filhos.add(inicioDaBusca);
            divideNohFilho(nohDividido, 0, inicioDaBusca);
            insereQuandoNaoCheio(nohDividido, chave);
        } else {
            insereQuandoNaoCheio(inicioDaBusca, chave);
        }
    }

    private void insereQuandoNaoCheio(NohDaArvore novoNodo, int chave) {
        int i = novoNodo.chaves.size() - 1;
        if (novoNodo.folha) {
            novoNodo.chaves.add(chave);
            while (i >= 0 && chave < novoNodo.chaves.get(i)) {
                novoNodo.chaves.set(i + 1, novoNodo.chaves.get(i));
                i--;
            }
            novoNodo.chaves.set(i + 1, chave);
        } else {
            while (i >= 0 && chave < novoNodo.chaves.get(i)) {
                i--;
            }
            i++;
            if (novoNodo.filhos.get(i).chaves.size() == (2 * grauMinimo) - 1) {
                divideNohFilho(novoNodo, i, novoNodo.filhos.get(i));
                if (chave > novoNodo.chaves.get(i)) {
                    i++;
                }
            }
            insereQuandoNaoCheio(novoNodo.filhos.get(i), chave);
        }
    }

    private void divideNohFilho(NohDaArvore nohPai, int indiceFilho, NohDaArvore nohFilho) {
        NohDaArvore novoNoh = new NohDaArvore();
        nohPai.chaves.add(indiceFilho, nohFilho.chaves.get(grauMinimo - 1));
        nohPai.filhos.add(indiceFilho + 1, novoNoh);
        novoNoh.folha = nohFilho.folha;

        for (int j = grauMinimo; j < 2 * grauMinimo - 1; j++) {
            novoNoh.chaves.add(nohFilho.chaves.get(j));
        }

        for (int j = 2 * grauMinimo - 2; j >= grauMinimo - 1; j--) {
            nohFilho.chaves.remove(j);
        }

        if (!nohFilho.folha) {
            for (int j = grauMinimo; j < 2 * grauMinimo; j++) {
                novoNoh.filhos.add(nohFilho.filhos.get(j));
            }

            for (int j = 2 * grauMinimo - 1; j >= grauMinimo; j--) {
                nohFilho.filhos.remove(j);
            }
        }
    }

    public void exibirArvore() {
        exibirArvoreRecursivo(raiz, "");
    }

    private void exibirArvoreRecursivo(NohDaArvore noh, String prefixo) {
        if (noh != null) {
            System.out.print(prefixo);
            for (int i = 0; i < noh.chaves.size(); i++) {
                System.out.print(noh.chaves.get(i) + " ");
            }
            System.out.println();

            if (!noh.folha) {
                for (int i = 0; i < noh.filhos.size(); i++) {
                    String novoPrefixo = prefixo + "----";
                    exibirArvoreRecursivo(noh.filhos.get(i), novoPrefixo);
                }
            }
        }
    }
}