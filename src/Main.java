public class Main {
    public static void main(String[] args) {
        Piloto piloto1 = new Piloto("Lewis Hamilton", 36, 44);
        Piloto piloto2 = new Piloto("Max Verstappen", 24, 33);
        Piloto piloto3 = new Piloto("Charles Leclerc", 23, 16);

        piloto1.atualizarPontuacao(10.0);
        piloto2.atualizarPontuacao(18.0);
        piloto3.atualizarPontuacao(15.0);
        piloto1.atualizarPontuacao(-15.0);


        Tecnico tecnico1 = new Tecnico("James Allison", 45, 1, 8000.0);
        Tecnico tecnico2 = new Tecnico("Andrew Shovlin", 40, 2, 7500.00);

        tecnico1.aumentarSalario(10);
        tecnico2.aumentarSalario(15);

        Carro carro1 = new Carro("W12", "Mercedes");
        Carro carro2 = new Carro("RB16B", "Red Bull");

        Equipe equipe1 = new Equipe(EquipeEnum.MERCEDES);
        equipe1.adicionarPiloto(piloto1);
        equipe1.adicionarTecnico(tecnico1);
        equipe1.adicionarCarro(carro1);

        Equipe equipe2 = new Equipe(EquipeEnum.RED_BULL);
        equipe2.adicionarEquipe(piloto2);
        equipe2.adicionarEquipe(tecnico2);
        equipe2.adicionarEquipe(carro2);

        Corrida corrida = new Corrida(LocalDate.now());
        corrida.adicionarEquipe(equipe1);
        corrida.adicionarEquipe(equipe2);

        corrida.exibirInformacoes();
        Double pontuacaoTotal = corrida.calcularPontuacaoTotal();
        System.out.println("Pontuação total da corrida: " + pontuacaoTotal);
    }
}
