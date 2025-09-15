package school.sptech;

public class Main {
    public static void main(String[] args) {
        Personagem[] personagens = {
                new Personagem(1, "Gigante", 3, 150, 1.0, 1200, 5),
                new Personagem(2, "Arqueira", 2, 50, 2.0, 300, 1),
                new Personagem(3, "Barbaro", 4, 80, 1.5, 500, 1),
                new Personagem(4, "Dragão", 5, 300, 0.8, 2000, 10),
                new Personagem(5, "Mago", 3, 120, 1.2, 400, 2),
                new Personagem(6, "Valquiria", 4, 180, 1.3, 1000, 3),
                new Personagem(7, "Corredor", 2, 90, 2.5, 600, 2),
                new Personagem(8, "Golem", 6, 500, 0.5, 5000, 30)
        };

        System.out.println("=== Lista Original ===");
        for (Personagem p : personagens) System.out.println(p);

        // Selection Sort por nome (CRESCENTE)
        Algoritmos.selectionSort(personagens, true);
        System.out.println("\n=== Selection Sort por Nome (Crescente) ===");
        for (Personagem p : personagens) System.out.println(p);

        // Selection Sort por nome (DECRESCENTE)
        Algoritmos.selectionSort(personagens, false);
        System.out.println("\n=== Selection Sort por Nome (Decrescente) ===");
        for (Personagem p : personagens) System.out.println(p);

        // Bubble Sort por nível (CRESCENTE)
        Algoritmos.bubbleSort(personagens, true);
        System.out.println("\n=== Bubble Sort por Nível (Crescente) ===");
        for (Personagem p : personagens) System.out.println(p);

        // Bubble Sort por nível (DECRESCENTE)
        Algoritmos.bubbleSort(personagens, false);
        System.out.println("\n=== Bubble Sort por Nível (Decrescente) ===");
        for (Personagem p : personagens) System.out.println(p);

        // Pesquisa Binária (precisa estar ordenado pelo critério escolhido)
        Algoritmos.selectionSort(personagens, true); // garantir ordenação por nome crescente
        String busca = "Dragão";
        int pos = Algoritmos.pesquisaBinaria(personagens, busca, true);
        System.out.println("\n=== Pesquisa Binária (Nome) ===");
        if (pos != -1) {
            System.out.println(busca + " encontrado na posição " + pos + ": " + personagens[pos]);
        } else {
            System.out.println(busca + " não encontrado.");
        }

        // Teste com valor inexistente
        String busca2 = "Rei Bárbaro";
        int pos2 = Algoritmos.pesquisaBinaria(personagens, busca2, true);
        if (pos2 != -1) {
            System.out.println(busca2 + " encontrado na posição " + pos2 + ": " + personagens[pos2]);
        } else {
            System.out.println(busca2 + " não encontrado.");
        }
    }
}
