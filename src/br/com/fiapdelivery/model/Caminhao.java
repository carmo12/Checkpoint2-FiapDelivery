package br.com.fiapdelivery.model;

/**
 * Veículo de grande porte, caracterizado pela quantidade de eixos.
 */
public class Caminhao extends Veiculo {

    private int eixos;

    /**
     * @param placa      placa do caminhão
     * @param capacidade capacidade de carga em kg
     * @param eixos      quantidade de eixos (deve ser maior que zero)
     */
    public Caminhao(String placa, double capacidade, int eixos) {
        super(placa, capacidade);
        setEixos(eixos);
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        if (eixos <= 0) {
            throw new IllegalArgumentException("Quantidade de eixos deve ser maior que zero.");
        }
        this.eixos = eixos;
    }
}
