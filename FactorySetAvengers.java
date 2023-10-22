public class FactorySetAvengers implements AbstractFactorySetMerenda{
    @Override
    public PosatineAvengers setPosatine() {
        return new PosatineAvengers();
    }

    @Override
    public PortaMerendaAvengers setPortaMerenda() {
        return new PortaMerendaAvengers();
    }

    @Override
    public TovagliettaAvengers setTovaglietta() {
        return new TovagliettaAvengers();
    }

    @Override
    public BorracciaAvengers setBorraccia() {
        return new BorracciaAvengers();
    }
}
