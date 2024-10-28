
package Factory;

public class Caio {

    public class Main {
    public static void main(String[] args) {
        Transporte transporte1 = new TransporteCarro();
        transporte1.exibirVeiculo();

        Transporte transporte2 = new TransporteCaminhao();
        transporte2.exibirVeiculo();

        Transporte transporte3 = new TransporteBicicleta();
        transporte3.exibirVeiculo();
    }
}

    
}
