
package Singleton;


public class Main {
    public static void main(String[] args) {
        ConfiguracaoGlobal config = ConfiguracaoGlobal.getInstance();
        config.exibirConfiguracao();
    }
}
