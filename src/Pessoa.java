public class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa(String nome, Integer idade) {
        this.setNome(nome);
        this.setIdade(idade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(Integer idade) {
        if (idade >= 18) {
            this.idade = idade;
        } else {
            System.out.println("A idade não pode ser menor que 18 anos.");
        }
    }

    public Integer getIdade() {
        return this.idade;
    }

    public String toString() {
        return "";
    }
}



