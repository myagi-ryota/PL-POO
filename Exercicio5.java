public class Exercicio5 {
    private final int NUM_ALUNOS=5;
    private final int NUM_UCS=5;
    private int[][] notasTurma = {{20, 15, 16, 13, 12},{},{},{},{}};

    public int somaNotasUC(int UC){
        int soma = 0;
        for (int i = 0; i < NUM_ALUNOS; i++){
            soma += notasTurma[i][UC];
        }
        return soma;
    }

    public float media(int aluno){
        int media = 0;
        for (int i = 0; i < NUM_UCS; i++){
            media += notasTurma[aluno][i];
        }
        media = media/NUM_UCS;
        return media;
    }

    public float mediaUC(int UC){
        int media = 0;
        for (int i = 0; i < NUM_ALUNOS; i++){
            media += notasTurma[i][UC];
        }
        media = media/NUM_ALUNOS;
        return media;
    }
}
