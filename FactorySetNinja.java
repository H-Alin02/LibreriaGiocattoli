public class FactorySetNinja implements AbstractFactorySetMerenda{
    @Override
    public PosatineNinja setPosatine() {
        return new PosatineNinja();
    }

    @Override
    public PortaMerendaNinja setPortaMerenda() {
        return new PortaMerendaNinja();
    }

    @Override
    public TovagliettaNinja setTovaglietta() {
        return new TovagliettaNinja();
    }

    @Override
    public BorracciaNinja setBorraccia() {
        return new BorracciaNinja();
    }
}
