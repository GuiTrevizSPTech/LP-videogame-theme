package school.sptech;

public class Personagem {
    private int id;
    private String nome;
    private int nivel;
    private double forca;
    private double velocidadeAtaque;
    private int vida;
    private int espacoOcupado;

    public Personagem(int id, String nome, int nivel, double forca, double velocidadeAtaque, int vida, int espacoOcupado) {
        this.id = id;
        this.nome = nome;
        this.nivel = nivel;
        this.forca = forca;
        this.velocidadeAtaque = velocidadeAtaque;
        this.vida = vida;
        this.espacoOcupado = espacoOcupado;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public int getNivel() { return nivel; }
    public double getForca() { return forca; }
    public double getVelocidadeAtaque() { return velocidadeAtaque; }
    public int getVida() { return vida; }
    public int getEspacoOcupado() { return espacoOcupado; }

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | Nível: " + nivel +
                " | Força: " + forca + " | Velocidade: " + velocidadeAtaque +
                " | Vida: " + vida + " | Espaço: " + espacoOcupado;
    }
}
