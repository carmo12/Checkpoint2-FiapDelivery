package br.com.fiapdelivery.main;

import br.com.fiapdelivery.model.Caminhao;
import br.com.fiapdelivery.model.Moto;
import br.com.fiapdelivery.model.Pacote;
import br.com.fiapdelivery.model.Rota;

/**
 * Ponto de entrada que demonstra o FiapDelivery refatorado.
 */
public class Principal {

    public static void main(String[] args) {
        // 1) O dado inválido do legado (capacidade -500) agora é rejeitado
        try {
            new Caminhao("ABC1234", -500.0, 3);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }

        // 2) Entrega com Caminhão
        Caminhao caminhao = new Caminhao("ABC1234", 5000.0, 3);
        Pacote pacote = new Pacote("BR999", 10.5);
        Rota rotaCaminhao = new Rota(pacote, caminhao);
        rotaCaminhao.iniciarEntrega();
        System.out.println("Status: " + pacote.getStatus());

        // 3) A mesma Rota agora funciona com Moto
        Moto moto = new Moto("MOT1A23", 30.0, true);
        Pacote pacote2 = new Pacote("BR1000", 2.0);
        Rota rotaMoto = new Rota(pacote2, moto);
        rotaMoto.iniciarEntrega();
        System.out.println("Status: " + pacote2.getStatus());
    }
}
