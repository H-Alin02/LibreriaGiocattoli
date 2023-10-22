public class FactorySetFrozen implements AbstractFactorySetMerenda{
    @Override
    public PosatineFrozen setPosatine() {
        return new PosatineFrozen();
    }
    @Override
    public PortaMerendaFrozen setPortaMerenda() {
        return new PortaMerendaFrozen();
    }
    @Override
    public TovagliettaFrozen setTovaglietta() {
        return new TovagliettaFrozen();
    }
    @Override
    public BorracciaFrozen setBorraccia() {
        return new BorracciaFrozen();
    }
}
