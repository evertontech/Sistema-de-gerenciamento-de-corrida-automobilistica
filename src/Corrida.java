import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Corrida {
    private LocalDate dataRealizacao;
    private List<Equipe> listaDeEquipesParticipantes;

    public Corrida(LocalDate dataRealizacao) {
        this.setDataRealizacao(dataRealizacao);
        this.listaDeEquipesParticipantes = new ArrayList<>();
    }

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
        double pontuacaoTotal = 0.00;

        for (Equipe equipe : listaDeEquipesParticipantes) {
            pontuacaoTotal += equipe.calcularPontuacaoTotal();
        }

        return pontuacaoTotal;
    }

    public void exibirInformacoes() {
        System.out.println("Data de Realização: " + getDataRealizacao());

        System.out.println("Lista de Equipes Participantes:");
        for (Equipe equipe : this.getListaDeEquipesParticipantes()) {
            equipe.exibirInformacoes();
            System.out.println("**************************************");
        }
    }
}

