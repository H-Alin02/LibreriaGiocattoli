public class FactorySetFrozen implements AbstractFactorySetMerenda{
    @Override
    public AbstractPosatine setPosatine() {
        return new PosatineFrozen();
    }
    @Override
    public AbstractPortaMerenda setPortaMerenda() {
        return new PortaMerendaFrozen();
    }
    @Override
    public AbstractTovaglietta setTovaglietta() {
        return new TovagliettaFrozen();
    }
    @Override
    public AbstractBorraccia setBorraccia() {
        return new BorracciFrozen();
    }
}
