public class Matriculas {
    private Estudante[] listaDeMatriculas;
    private int numeroDeMatricula;

    public Matriculas() {
        listaDeMatriculas = new Estudante[1];
    }

    public Estudante getMatricula(int numeroDeMatricula) {
        if (numeroDeMatricula < this.listaDeMatriculas.length) {
            return this.listaDeMatriculas[numeroDeMatricula];
        } else {
            return null;
        }
    }

    public void setMatricula(Estudante estudante) {
        Estudante[] listaAuxiliar = new Estudante[listaDeMatriculas.length];
        listaAuxiliar = listaDeMatriculas;

        for (int i = 0; i < listaDeMatriculas.length; i++) {
            if (listaDeMatriculas[0] == null && listaDeMatriculas.length == 1) {
                listaDeMatriculas[0] = estudante;
            } else {
                listaDeMatriculas = new Estudante[listaAuxiliar.length + 1];

                for (int j = 0; j < listaAuxiliar.length; j++) {
                    this.listaDeMatriculas[j] = listaAuxiliar[j];
                }

                listaDeMatriculas[listaDeMatriculas.length - 1] = estudante;
            }
        }
    }

    public void confirmaMatricula() {
        System.out.println("\nMatrícula efetuada. Seu número de matrícula é " + (listaDeMatriculas.length - 1) + ".\n");
    }

    public int getNumeroDeMatricula(String nome, String sobrenome) {
        for (int i = 0; i < this.listaDeMatriculas.length; i++) {
            if (listaDeMatriculas[i].getNome() == nome && listaDeMatriculas[i].getSobrenome() == sobrenome) {
                this.numeroDeMatricula = i;
            } else {
                this.numeroDeMatricula = -1;
            }
        }
        return this.numeroDeMatricula;
    }

    public void exibeMatriculas() {
        if (this.listaDeMatriculas[0] == null) {
            System.out.println("\nNão há matrículas no sistema.");
        } else {
            int numeroDeMatricula = 0;
            for (Estudante matricula : listaDeMatriculas) {
                System.out.println("\nNome: " + listaDeMatriculas[numeroDeMatricula].getNome());
                System.out.println("Sobrenome: " + listaDeMatriculas[numeroDeMatricula].getSobrenome());
                listaDeMatriculas[numeroDeMatricula].exibirNotas();
                numeroDeMatricula++;
            }
        }
    }

    public void atualizarNotas(int numeroDeMatricula, int referencia, float notaAtualizada) {
        if (this.listaDeMatriculas[numeroDeMatricula].getNota(referencia) != -1) {
            this.listaDeMatriculas[numeroDeMatricula].setNota(referencia, notaAtualizada);
        } else {
            System.out.println("Dados inválidos. Verifique se o número de matrícula ou a referencia da avaliação estão corretos.");
        }
    }

    public float calculaMediaColetiva() {
        float somaMediasIndividuais = 0;
        float mediaColetiva = 0;

        for (Estudante estudante : listaDeMatriculas) {
            somaMediasIndividuais =+ estudante.calculaMediaIndividual();
        }

        mediaColetiva = somaMediasIndividuais;

        return mediaColetiva;
    }
}
