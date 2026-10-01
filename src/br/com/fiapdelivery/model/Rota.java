package br.com.fiapdelivery.model;

/**
 * Associa um {@link Pacote} a um {@link Veiculo}.
 * Como depende da classe base Veiculo, aceita Caminhão, Moto
 * ou qualquer veículo criado no futuro.
 */
public class Rota {

    private Pacote pacote;
    private Veiculo veiculo;

    /**
     * @param pacote  pacote a ser entregue (não nulo)
     * @param veiculo veículo responsável (não nulo)
     */
    public Rota(Pacote pacote, Veiculo veiculo) {
        setPacote(pacote);
        setVeiculo(veiculo);
    }

    public Pacote getPacote() {
        return pacote;
    }

    public void setPacote(Pacote pacote) {
        if (pacote == null) {
            throw new IllegalArgumentException("Pacote não pode ser nulo.");
        }
        this.pacote = pacote;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        if (veiculo == null) {
            throw new IllegalArgumentException("Veículo não pode ser nulo.");
        }
        this.veiculo = veiculo;
    }

    /**
     * Inicia a entrega: coloca o pacote em trânsito e exibe a operação.
     */
    public void iniciarEntrega() {
        pacote.atualizarStatus("Em trânsito");
        System.out.println("Levando pacote " + pacote.getCodigo()
                + " no veículo " + veiculo.getPlaca());
    }
}
