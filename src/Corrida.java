import java.time.LocalDate;
import java.util.List;

public class Corrida {
    private LocalDate dataRealizacao;
    private List<Equipe> listaDeEquipesParticipantes;

    public void setDataRealizacao(LocalDate dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }

    public LocalDate getDataRealizacao() {
        return dataRealizacao;
    }

    public List<Equipe> getListaDeEquipesParticipantes() {
        return this.listaDeEquipesParticipantes;
    }

    public void adicionarEquipe(Equipe equipeParaAdicionar) {
          this.listaDeEquipesParticipantes.add(equipeParaAdicionar);
    }

    public Double calcularPontuacaoTotal() {
        return 0.0;
    }

    public void exibirInformacoes() {

    }
}

