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

    public int retornaExtremos(boolean retornaMaior) {
        int maior;
        int menor;

        if(contaValoresSignificativos() == 0) return 0;

        maior = 0;
        menor = 2147483647;

        for (int item : this.lista) {
            if (item != 0 && item > maior) {
                maior = item;
            } else if (item != 0 && item < menor) {
                menor = item;
            }
        }

        if(contaValoresSignificativos() == 1) return maior;

        return (retornaMaior) ? maior : menor;
    }

    private int contaValoresSignificativos() {
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
            this.lista[i] = numeroAleatorio + 1;
        }
        this.exibeListaCompleta();
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
                    this.exibeListaCompleta();
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
            this.exibeListaCompleta();
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
            this.exibeListaCompleta();
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
            this.exibeListaCompleta();
        }
    }

    public void quickSort(int[] lista, int posicaoInicial, int posicaoFinal) {
        if (posicaoInicial < posicaoFinal) {
            int posicaoPivo = this.divideLista(lista, posicaoInicial, posicaoFinal);
//            comparacoes += (posicaoFinal - posicaoInicial); // add comparisons made in partition() to total
//            comparacoes += quickSort(lista, posicaoInicial, posicaoPivo - 1);
//            comparacoes += quickSort(lista, posicaoPivo + 1, posicaoFinal);
        }
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
        this.exibeListaCompleta();
        return i + 1;
    }

    private void troca(int[] lista, int posicaoInicial, int posicaoFinal) {
        int listaAuxiliar = this.lista[posicaoInicial];
        this.lista[posicaoInicial] = this.lista[posicaoFinal];
        this.lista[posicaoFinal] = listaAuxiliar;
    }
}
