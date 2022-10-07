public class FabricaIntelNvidia implements FabricaAbstrata{

   @Override
    public CPU escolherCPU(){
        return new Intel();
    }

    @Override
    public GPU escolherGPU(){
        return new Nvidia();
    }
}
