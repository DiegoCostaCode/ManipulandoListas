import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Colecao {
    private String nome;
    private Date datalancamento;
    private double precoTotal;
    private List<Carta> cartas = new ArrayList<>();

    public Colecao(){}

    public Colecao(String nome, Date datalancamento, List<Carta> cartas) {
        this.nome = nome;
        this.datalancamento = datalancamento;
        this.cartas = cartas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDatalancamento() {
        return datalancamento;
    }

    public void setDatalancamento(Date datalancamento) {
        this.datalancamento = datalancamento;
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }

    public void addCarta(Carta carta)
    {
        this.cartas.add(carta);
        AtualizarPrecoTotal();
        OrdernarColecao();
    }

    public void removeCarta(int posicao)
    {
        this.cartas.remove(posicao);
        AtualizarPrecoTotal();
        OrdernarColecao();

    }


    private void AtualizarPrecoTotal()
    {
        this.precoTotal = cartas.stream().mapToDouble(Carta::getPrecoDollar).sum();
        //Isso aqui esta calculando o valor da lista.
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    @Override
    public String toString() {
        return "Colecao{" +
                "nome='" + nome + '\'' +
                ", datalancamento=" + datalancamento +
                ", precoTotal=" + precoTotal +
                ", cartas=" + cartas +
                '}';
    }

    public List<Carta> BuscarCartaPorNome(String nome){
        return this.cartas.stream()
                .filter(carta -> carta.getNome().toLowerCase()
                .contains(nome.toLowerCase())).toList();
    }

    private void OrdernarColecao()
    {
        this.cartas.sort(Comparator.comparingInt(Carta::getNumero));
    }

}
