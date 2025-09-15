package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Acampamento {
    private int id;
    private int nivel;
    private int capacidadeEspaco;
    private List<Personagem> personagens;

    public Acampamento(int id, int nivel, int capacidadeEspaco) {
        this.id = id;
        this.nivel = nivel;
        this.capacidadeEspaco = capacidadeEspaco;
        this.personagens = new ArrayList<>();
    }

    public void adicionarPersonagem(Personagem p) {
        if (capacidadeUsada() + p.getEspacoOcupado() <= capacidadeEspaco) {
            personagens.add(p);
        } else {
            System.out.println("Espaço insuficiente no acampamento para adicionar " + p.getNome());
        }
    }

    public int capacidadeUsada() {
        int total = 0;
        for (Personagem p : personagens) {
            total += p.getEspacoOcupado();
        }
        return total;
    }

    public List<Personagem> getPersonagens() {
        return personagens;
    }
}