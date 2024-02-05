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
        this.pontuacao = Math.max(pontuacao, 0.0);
    }

    public Double getPontuacao() {
        return pontuacao;
    }

    public void atualizarPontuacao(Double valor) {
        Double novaPontuacao = getPontuacao() + valor; 
        setPontuacao(novaPontuacao);
    }

    public String toString() {
        return this.pontuacao + " " + this.numero;
    }
}

