package br.com.fiapdelivery.model;

/**
 * Encomenda a ser transportada pelo FiapDelivery.
 * Todo pacote nasce com o status "Pendente".
 */
public class Pacote {

    private String codigo;
    private double peso;
    private String status;

    /**
     * @param codigo código do pacote (não pode ser nulo ou vazio)
     * @param peso   peso em kg (deve ser maior que zero)
     * @throws IllegalArgumentException se algum valor for inválido
     */
    public Pacote(String codigo, double peso) {
        setCodigo(codigo);
        setPeso(peso);
        this.status = "Pendente";
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("Código do pacote não pode ser nulo ou vazio.");
        }
        this.codigo = codigo.trim();
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (!(peso > 0) || Double.isInfinite(peso)) { // <-- LINHA ALTERADA
            throw new IllegalArgumentException("Peso deve ser maior que zero.");
        }
        this.peso = peso;
    }

    public String getStatus() {
        return status;
    }

    /**
     * Atualiza o status do pacote.
     *
     * @param novoStatus novo status (não pode ser nulo ou vazio)
     */
    public void atualizarStatus(String novoStatus) {
        if (novoStatus == null || novoStatus.isBlank()) {
            throw new IllegalArgumentException("Status não pode ser nulo ou vazio.");
        }
        this.status = novoStatus;
    }
}