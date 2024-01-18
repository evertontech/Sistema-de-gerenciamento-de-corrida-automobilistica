import java.time.LocalDate;
import java.util.List;

public class Corrida {
    private LocalDate dataRealizacao;
    private List<Equipe> equipesParticipantes;

    public void setDataRealizacao(LocalDate dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }

    public LocalDate getDataRealizacao() {
        return dataRealizacao;
    }

    public void setEquipesParticipantes(List<Equipe> equipesParticipantes) {
        this.equipesParticipantes = equipesParticipantes;
    }

    public List<Equipe> getEquipesParticipantes() {
        return this.equipesParticipantes;
    }

    public void adicionarEquipe(Equipe equipe) {

    }

    public void exibirInformacoes() {

    }

    public Double calcularPontuacaoTotal() {
        return 0.0;
    }
}

