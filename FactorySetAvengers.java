public class FactorySetAvengers implements AbstractFactorySetMerenda{
    @Override
    public AbstractPosatine setPosatine() {
        return new PosatineAvengers();
    }

    @Override
    public AbstractPortaMerenda setPortaMerenda() {
        return new PortaMerendaAvengers();
    }

    @Override
    public AbstractTovaglietta setTovaglietta() {
        return new TovagliettaAvengers();
    }

    @Override
    public AbstractBorraccia setBorraccia() {
        return new BorracciaAvengers();
    }
}
