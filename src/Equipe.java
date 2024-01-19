import java.util.List;

public class Equipe {
    private EquipeEnum nome;
    private List<Piloto> pilotos;
    private List<Tecnico> tecnicos;
    private List<Carro> carros;

    public Equipe(EquipeEnum nome) {
        this.setNome(nome);
    }

    public void setNome(EquipeEnum nome) {
        this.nome = nome;
    }

    public EquipeEnum getNome() {
        return this.nome;
    }

    public void setPilotos(List<Piloto> pilotos) {
        this.pilotos = pilotos;
    }

    public List<Piloto> getPilotos() {
        return this.pilotos;
    }

    public void setTecnicos(List<Tecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }

    public List<Tecnico> getTecnicos() {
        return this.tecnicos;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    public List<Carro> getCarros() {
        return this.carros;
    }

    public void adicionarPiloto(Piloto pilotoParaAdicionar) {
        boolean numeroJaExisteNaEquipe = false;

        for (Piloto p : pilotos) {
            if (pilotoParaAdicionar.getNumero().equals(p.getNumero())) {
                numeroJaExisteNaEquipe = true;
                break;
            }
        }

        if (numeroJaExisteNaEquipe) {
            System.out.println("O número do piloto já existe na equipe.");
        } else {
            pilotos.add(pilotoParaAdicionar);
        }
    }


}
