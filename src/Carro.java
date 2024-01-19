public class Carro {
    private String modelo;
    private String fabricante;

    public Carro(String modelo, String fabricante) {
        this.setModelo(modelo);
        this.setFabricante(fabricante);
    }

    public void setModelo(String modelo) {
        if (modelo != null) {
            this.modelo = modelo;
        } else {
            System.out.println("O modelo do carro não pode ser nulo.");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setFabricante(String fabricante) {
        if (fabricante != null) {
            this.fabricante = fabricante;
        } else {
            System.out.println("O fabricante não pode ser nulo.");
        }
    }

    public String getFabricante() {
        return fabricante;
    }

}

