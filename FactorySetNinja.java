public class FactorySetNinja implements AbstractFactorySetMerenda{
    @Override
    public AbstractPosatine setPosatine() {
        return new PosatineNinja();
    }

    @Override
    public AbstractPortaMerenda setPortaMerenda() {
        return new PortaMerendaNinja();
    }

    @Override
    public AbstractTovaglietta setTovaglietta() {
        return new TovagliettaNinja();
    }

    @Override
    public AbstractBorraccia setBorraccia() {
        return new BorracciaNinja();
    }
}
