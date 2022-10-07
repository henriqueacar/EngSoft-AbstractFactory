public class FabricaAMDRadeon implements FabricaAbstrata{

    @Override
    public CPU escolherCPU(){
        return new AMD();
    }

    @Override
    public GPU escolherGPU(){
        return new Radeon();
    }
}


