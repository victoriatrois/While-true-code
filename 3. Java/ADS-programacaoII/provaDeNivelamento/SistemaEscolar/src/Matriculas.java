public class Matriculas {
    private Estudante[] listaDeEstudantes;
    // private Estudante;
    private int numeroDeMatricula;

    public Matriculas(int tamanho) {
        listaDeEstudantes = new Estudante[tamanho];
    }

    public Estudante getMatricula(int numeroDeMatricula) {
        return listaDeEstudantes[numeroDeMatricula];
    }

    public void setMatricula(Estudante estudante) {
        Estudante[] listaAuxiliar = listaDeEstudantes;
        listaDeEstudantes = new Estudante[listaAuxiliar.length + 1];
        listaDeEstudantes[listaDeEstudantes.length -1] = estudante;
    }

    public void confirmaMatricula() {
        System.out.println("Matrícula efetuada. Seu número de matrícula é " + (listaDeEstudantes.length - 1) + ".");
    }

    public

}
