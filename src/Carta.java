public class Carta {
    private String nome;

    private int numero;
    private int custo;
    private String descricao;

    private double precoDollar;

    public Carta (){}

    public Carta(int numero,String nome, int custo, String descricao, double precoDollar) {
        this.numero = numero;
        this.nome = nome;
        this.custo = custo;
        this.descricao = descricao;
        this.precoDollar = precoDollar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoDollar() {
        return precoDollar;
    }

    public void setPrecoDollar(double precoDollar) {
        this.precoDollar = precoDollar;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                ", custo=" + custo +
                ", descricao='" + descricao + '\'' +
                ", precoDollar=" + precoDollar +
                '}';
    }
}
