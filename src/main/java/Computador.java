public class Computador {

    private CPU cpu;
    private GPU gpu;

    public Computador(FabricaAbstrata fabrica){
        this.cpu = fabrica.escolherCPU();
        this.gpu = fabrica.escolherGPU();
    }

    public String exibirConfiguracao(){
        StringBuilder config = new StringBuilder();
        config.append(this.cpu.exibeConfig()).append(" e ").append(this.gpu.exibeConfig());
        return  config.toString();
    }
}
