package Factory;




public class TransporteCarro extends Transporte {
    
    
    public Veiculo criarVeiculo() {
        return new Carro();
    }
}
