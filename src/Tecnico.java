public class Tecnico extends Pessoa {
    private Integer codigo;
    private Double salario;

    public Tecnico(String nome, Integer idade, Integer codigo, Double salario) {
        super(nome, idade);
        this.setCodigo(codigo);
        this.setSalario(salario);
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setSalario(Double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("O salário precisa ser positivo.");
        }
    }

    public Double getSalario() {
        return salario;
    }

    public void aumentarSalario(Integer bonificacaoPercentual) {
        if (bonificacaoPercentual >= 1 && bonificacaoPercentual <= 30) {
            Double aumentoSalarial = ((bonificacaoPercentual / 100.00) * getSalario()) + getSalario();
            this.setSalario(aumentoSalarial);
        } else {
            System.out.println("A Bonificação precisa ser entre 1% a 30%.");
        }

    }

    public String toString() {
        return "";

    }
}


