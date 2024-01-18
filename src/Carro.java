public class Carro {
    private String modelo;
    private String fabricante;

    public Carro(String modelo, String fabricante) {
        this.setModelo(modelo);
        this.setFabricante(fabricante);
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

}

