public class Piloto extends Pessoa {

    private Integer numero;
    private Double pontuacao;

    public Piloto(String nome, Integer idade, Integer numero) {
        super(nome, idade);
        this.setNumero(numero);
        this.setPontuacao(0.0);
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    private void setPontuacao(Double pontuacao) {
        if (pontuacao >= 0) {
            this.pontuacao = pontuacao;
        } else {
            System.out.println("A pontuação dos pilotos não pode ser negativa.");
        }
    }

    public Double getPontuacao() {
        return pontuacao;
    }

    public void atualizarPontuacao(Double valor) {
        Double novaPontuacao = getPontuacao() + valor;
        setPontuacao(novaPontuacao);
    }

    public String toString() {
        return "";
    }
}

