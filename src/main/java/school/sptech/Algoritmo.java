package school.sptech;

public class Algoritmo {
    // Selection Sort (ordena por nome - String)
    public static void selectionSort(Personagem[] vetor, boolean crescente) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int indice = i;
            for (int j = i + 1; j < n; j++) {
                int comparacao = vetor[j].getNome().compareTo(vetor[indice].getNome());

                if (crescente) {
                    if (comparacao < 0) indice = j;
                } else {
                    if (comparacao > 0) indice = j;
                }
            }
            // troca
            Personagem temp = vetor[i];
            vetor[i] = vetor[indice];
            vetor[indice] = temp;
        }
    }

    // Bubble Sort (ordena por nível - int)
    public static void bubbleSort(Personagem[] vetor, boolean crescente) {
        int n = vetor.length;
        boolean trocou;
        do {
            trocou = false;
            for (int i = 0; i < n - 1; i++) {
                boolean condicao = crescente
                        ? vetor[i].getNivel() > vetor[i + 1].getNivel()
                        : vetor[i].getNivel() < vetor[i + 1].getNivel();

                if (condicao) {
                    Personagem temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    trocou = true;
                }
            }
            n--; // otimização
        } while (trocou);
    }

    // Pesquisa Binária por nome (funciona tanto crescente quanto decrescente)
    public static int pesquisaBinaria(Personagem[] vetor, String nome, boolean crescente) {
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            int comparacao = nome.compareTo(vetor[meio].getNome());

            if (comparacao == 0) {
                return meio; // achou
            }
            if (crescente) {
                if (comparacao < 0) fim = meio - 1;
                else inicio = meio + 1;
            } else {
                if (comparacao > 0) fim = meio - 1;
                else inicio = meio + 1;
            }
        }

        return -1; // não encontrado
    }
}
