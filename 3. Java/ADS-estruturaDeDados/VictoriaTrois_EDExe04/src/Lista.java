import java.util.Random;
import java.util.Scanner;
public class Lista {
    Scanner entrada = new Scanner(System.in);

    private int[] lista;
    public int tamanho;
    private int totalDeElementosValidos;

    public Lista(int tamanho) {
        this.tamanho = tamanho;
        this.lista = new int[tamanho];
        totalDeElementosValidos = this.contaValoresSignificativos();
    }

    public int[] getLista() {
        return lista;
    }

    public int getElemento(int posicao) {
        return this.lista[posicao];
    }

    public void setElemento(int posicao, int valor) {
        this.lista[posicao] = valor;
        this.exibeListaCompleta();
    }

    public void setElementos() {
        for (int i = 0; i < this.tamanho; i++) {
            if(i == this.tamanho - 1) {
                System.out.println("Digite o último valor.");
            } else {
                System.out.println("Digite o " + (i+1) + "º valor.");
            }
            this.lista[i] = entrada.nextInt();
        }
        this.exibeListaCompleta();
    }

    public int getTotalDeElementosValidos() {
        return totalDeElementosValidos;
    }

    public void setTotalDeElementosValidos(int totalDeElementosValidos) {
        this.totalDeElementosValidos = totalDeElementosValidos;
    }

    public void exibeListaCompleta() {
        for (int item : this.lista) {
            if (item == 0) {
                System.out.print("[ ] ");
            } else {
                System.out.print("[" + item + "] ");
            }
        }
        System.out.println("\n");
    }

    public void exibeValoresExtremos() {
        int[] valoresExtremos = new int[2];
        int maior;
        int menor;

        valoresExtremos[0] = 0;
        valoresExtremos[1] = 2147483647;

        maior = valoresExtremos[0];
        menor = valoresExtremos[1];

        if(contaValoresSignificativos() == 0) {
            valoresExtremos[0] = 0;
            valoresExtremos[1] = 0;
        }

        for (int item : lista) {
            if (item != 0 && item > maior) {
                maior = item;
            } else if (item != 0 && item < menor) {
                menor = item;
            }
        }

        if(contaValoresSignificativos() == 1) {
            System.out.println("Há apenas um valor na lista: " + maior);
        }

        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
    }

    public int contaValoresSignificativos() {
        int quantidade = 0;

        for (int item : this.lista) {
            if (item != 0) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public void preencheAleatoriamente() {
        Random sorteador = new Random();

        for (int i = 0; i < this.tamanho; i++) {
            int numeroAleatorio = sorteador.nextInt(100);
            if (numeroAleatorio == 0) {
                this.lista[i] = numeroAleatorio + 2;
            } else {
                this.lista[i] = numeroAleatorio + 1;
            }

        }
    }

    public int buscaValorBi(int[] lista, int valorABuscar, int posicaoInicial, int posicaoFinal) {
        if (posicaoInicial > posicaoFinal) {
            return -1;
        }

        int meio = (posicaoInicial + posicaoFinal) / 2;

        if (lista[meio] == valorABuscar) {
            return meio;
        } else if (lista[meio] < valorABuscar) {
            return buscaValorBi(lista, valorABuscar, meio + 1, posicaoFinal);
        } else {
            return buscaValorBi(lista, valorABuscar, posicaoInicial, meio - 1);
        }
    }

    private int buscaValorBi(int[] lista, int valorABuscar) {
        return buscaValorBi(lista, valorABuscar, 0, (lista.length - 1));
    }

    public void buscaValorIte(int valorABuscar) {
        int estahContido;
        int repetiu;

        estahContido = -1;
        repetiu = 0;

        for (int i = 0; i< this.tamanho; i++) {
            if (this.lista[i] == valorABuscar) {
                estahContido = 1;
                repetiu = i + 1;
            }
        }
        if (estahContido == -1) {
            System.out.println("Este valor não existe na lista.");
        } else {
            System.out.println("O valor " + valorABuscar + " foi encontrado na posição: " + (repetiu - 1) + ".");
            System.out.println("A busca percorreu o laço " + repetiu + " vezes.");
        }
    }

    public void bubbleSort() {
        int tamanho;
        boolean troca;

        tamanho = this.tamanho;

        do {
            troca = false;
            for (int i = 0; i < this.tamanho - 1; i++) {
                if (this.lista[i] > this.lista[(i + 1)]){
                    int auxiliar = this.lista[i];
                    this.lista[i] = this.lista[(i + 1)];
                    this.lista[(i + 1)] = auxiliar;
                    troca = true;
                }
            }
            tamanho--;
        } while (troca);
    }

    public void insertionSort() {
        for (int i = 1; i < this.tamanho; i++) {
            int key = this.lista[i];
            int j = i - 1;
            while (j >= 0 && this.lista[j] > key) {
                this.lista[j + 1] = this.lista[j];
                j--;
            }
            this.lista[j + 1] = key;
        }
    }

    public void shellSort() {
        for (int intervalo = this.tamanho/2; intervalo > 0; intervalo /= 2) {
            for (int i = intervalo; i < this.tamanho; i++) {
                int subLista = this.lista[i];
                int j;

                for (j = i; j >= intervalo && this.lista[j - intervalo] > subLista; j -= intervalo) {
                    this.lista[j] = this.lista[j - intervalo];
                }
                this.lista[j] = subLista;
            }
        }
    }

    public void selectionSort(int[] lista) {
        int subLista;
        subLista = this.tamanho;

        for (int i = 0; i < subLista - 1; i++) {
            int posicaoMenorValor = i;
            for (int j = i + 1; j < subLista; j++) {
                if (this.lista[j] < this.lista[posicaoMenorValor]) {
                    posicaoMenorValor = j;
                }
            }
            int auxiliar = this.lista[posicaoMenorValor];
            this.lista[posicaoMenorValor] = this.lista[i];
            this.lista[i] = auxiliar;
        }
    }

    public int quickSort(int[] lista, int posicaoInicial, int posicaoFinal) {
        int comparacoes;
        comparacoes = 0;
        if (posicaoInicial < posicaoFinal) {
            int posicaoPivo = this.divideLista(lista, posicaoInicial, posicaoFinal);
            comparacoes += (posicaoFinal - posicaoInicial); // add comparisons made in partition() to total
            comparacoes += quickSort(lista, posicaoInicial, posicaoPivo - 1);
            comparacoes += quickSort(lista, posicaoPivo + 1, posicaoFinal);
        }
        return comparacoes;
    }

    private int divideLista(int[] lista, int posicaoInicial, int posicaoFinal) {
        int pivo = lista[posicaoFinal];
        int i = posicaoInicial - 1;
        for (int j = posicaoInicial; j < posicaoFinal; j++) {
            if (lista[j] <= pivo) {
                i++;
                troca(lista, i, j);
            }
        }
        this.troca(lista, i + 1, posicaoFinal);
        return i + 1;
    }

    private void troca(int[] lista, int posicaoInicial, int posicaoFinal) {
        int listaAuxiliar = lista[posicaoInicial];
        lista[posicaoInicial] = lista[posicaoFinal];
        lista[posicaoFinal] = listaAuxiliar;
    }
}
