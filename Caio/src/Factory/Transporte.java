
package Factory;


public abstract class Transporte {
    public abstract Veiculo criarVeiculo();
    
    public void exibirVeiculo() {
        Veiculo veiculo = criarVeiculo();
        veiculo.exibirInfo();
    }

    
}

