
package Factory;


public class TransporteCaminhao extends Transporte {
    @Override
    public Veiculo criarVeiculo() {
        return new Caminhao();
    }
}
