import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputadorTest {

    @Test
    void deveChecarConfiguracaoIntelNvidia() {
        FabricaAbstrata fabrica = new FabricaIntelNvidia();
        Computador computador = new Computador(fabrica);
        assertEquals("Intel e Nvidia", computador.exibirConfiguracao());
    }

    @Test
    void deveChecarConfiguracaoAMDRadeon() {
        FabricaAbstrata fabrica = new FabricaAMDRadeon();
        Computador computador = new Computador(fabrica);
        assertEquals("AMD e Radeon", computador.exibirConfiguracao());
    }
}