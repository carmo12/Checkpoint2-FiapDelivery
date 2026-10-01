package br.com.fiapdelivery.model;

/**
 * Veículo ágil para entregas leves, podendo ou não possuir baú.
 */
public class Moto extends Veiculo {

    private boolean possuiBau;

    /**
     * @param placa      placa da moto
     * @param capacidade capacidade de carga em kg
     * @param possuiBau  indica se a moto possui baú
     */
    public Moto(String placa, double capacidade, boolean possuiBau) {
        super(placa, capacidade);
        this.possuiBau = possuiBau;
    }

    public boolean isPossuiBau() {
        return possuiBau;
    }

    public void setPossuiBau(boolean possuiBau) {
        this.possuiBau = possuiBau;
    }
}
