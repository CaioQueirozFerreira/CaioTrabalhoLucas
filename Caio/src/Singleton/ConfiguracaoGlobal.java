
package Singleton;


public class ConfiguracaoGlobal {
    
    private static ConfiguracaoGlobal instance;
    
    
    private ConfiguracaoGlobal() {
        
    }

    
    public static ConfiguracaoGlobal getInstance() {
        if (instance == null) {
            instance = new ConfiguracaoGlobal();
        }
        return instance;
    }

    
    public void exibirConfiguracao() {
        System.out.println("Configuração Global");
    }
}
