
package Factory;


public class TransporteBicicleta extends Transporte {
    @Override
    public Veiculo criarVeiculo() {
        return new Bicicleta();
    }
}
