package br.com.fiapdelivery.model;

/**
 * Classe base para os veículos da frota do FiapDelivery.
 * Concentra os atributos comuns (placa e capacidade), evitando
 * código duplicado nas subclasses (herança).
 */
public abstract class Veiculo {

    private String placa;
    private double capacidade;

    /**
     * @param placa      placa do veículo (não pode ser nula ou vazia)
     * @param capacidade capacidade de carga em kg (deve ser maior que zero)
     * @throws IllegalArgumentException se algum valor for inválido
     */
    public Veiculo(String placa, double capacidade) {
        setPlaca(placa);
        setCapacidade(capacidade);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("Placa não pode ser nula ou vazia.");
        }
        this.placa = placa.trim().toUpperCase();
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        if (!(capacidade > 0) || Double.isInfinite(capacidade)) { // <-- LINHA ALTERADA
            throw new IllegalArgumentException(
                    "Capacidade deve ser maior que zero. Valor recebido: " + capacidade);
        }
        this.capacidade = capacidade;
    }
}