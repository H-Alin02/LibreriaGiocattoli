public class SetMerendaFrozen {
    private PosatineFrozen posatine;
    private TovagliettaFrozen tovaglietta;
    private PortaMerendaFrozen portaMerenda;
    private BorracciaFrozen borraccia;

    public SetMerendaFrozen(PosatineFrozen posatine , TovagliettaFrozen tovaglietta , PortaMerendaFrozen portaMerenda , BorracciaFrozen borraccia){
        this.posatine = posatine;
        this.tovaglietta = tovaglietta;
        this.portaMerenda = portaMerenda;
        this.borraccia = borraccia;
    }

    public BorracciaFrozen getBorraccia() {
        return borraccia;
    }

    public PortaMerendaFrozen getPortaMerenda() {
        return portaMerenda;
    }

    public PosatineFrozen getPosatine() {
        return posatine;
    }

    public TovagliettaFrozen getTovaglietta() {
        return tovaglietta;
    }
}

